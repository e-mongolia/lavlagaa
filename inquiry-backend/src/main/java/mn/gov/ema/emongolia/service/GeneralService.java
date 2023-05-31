package mn.gov.ema.emongolia.service;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import lombok.extern.java.Log;
import mn.gov.ema.emongolia.data.ServiceResponse.ServiceResponse;
import mn.gov.ema.emongolia.data.dao.*;
import mn.gov.ema.emongolia.data.entity.*;
import mn.gov.itc.emongolia.data.dao.*;
import mn.gov.itc.emongolia.data.entity.*;
import mn.gov.ema.emongolia.data.model.GpsInvoice;
import mn.gov.ema.emongolia.data.model.RelatedUsersInfoList;
import mn.gov.ema.emongolia.data.model.ResponseModel;
import mn.gov.ema.emongolia.data.redis.entity.ImsToken;
import mn.gov.ema.emongolia.feign.EBarimGPSFeign;
import mn.gov.ema.emongolia.feign.EMongoliaPdfFeign;
import mn.gov.ema.emongolia.model.EnquiryInvoiceModel;
import mn.gov.ema.emongolia.model.ExternaPdf;
import mn.gov.ema.emongolia.model.ServResponse;
import mn.gov.ema.emongolia.tools.Tools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import javax.net.ssl.HttpsURLConnection;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.net.URL;
import java.net.URLEncoder;
import java.net.URLStreamHandler;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;


@Service
@Log
public class GeneralService {
    @Autowired
    RequestDAO requestDAO;

    @Autowired
    RequestDetailDAO requestDetailDAO;

    @Autowired
    VRequestInfoDAO vRequestInfoDAO;

    @Autowired
    ReferenceEmonDAO referenceEmonDAO;

    @Autowired
    ReferenceTagDAO referenceTagDAO;

    @Autowired
    OrganizationDAO organizationDAO;

    @Autowired
    OrganizationConfigDAO organizationConfigDAO;

    @Autowired
    XypService xypService;

    @Autowired
    EMongoliaPdfFeign eMongoliaPdfFeign;

    @Autowired
    EBarimGPSFeign eBarimGPSFeign;

    @Autowired
    UserService userService;

    @Autowired
    RequestDetailInvoiceDAO detailInvoiceDAO;

    @PersistenceContext
    EntityManager em;

    public List<ReferenceEmon> getAllReference() {
        List<ReferenceEmon> referenceEmons = referenceEmonDAO.findByIdIsNotNullOrderById();
        for(ReferenceEmon emon : referenceEmons){
            if(emon.getTags()!=null){
                String[] tags = emon.getTags().split(",");
                List<Long> longs = Arrays.stream(tags).map(s -> Long.parseLong(s.trim())).collect(Collectors.toList());
                List<ReferenceTag> referenceTags = referenceTagDAO.findTagIds(longs);
                emon.setRefTags(referenceTags);
            }
        }
        return referenceEmons;
    }


    public List<ReferenceEmon> getAllTags() {
        List<ReferenceEmon> referenceEmons = referenceEmonDAO.findByIdIsNotNullOrderById();
        for(ReferenceEmon emon : referenceEmons){
            if(emon.getTags()!=null){
                String[] tags = emon.getTags().split(",");
                List<Long> longs = Arrays.stream(tags).map(s -> Long.parseLong(s.trim())).collect(Collectors.toList());
                List<ReferenceTag> referenceTags = referenceTagDAO.findTagIds(longs);
                emon.setRefTags(referenceTags);
            }
        }
        return referenceEmons;
    }

    String dateFormat = "yyyy-MM-dd HH:mm:ss";

    public Organization checkConfig() {
        Organization organization = new Organization();
//        organization = organizationDAO.findByOrOrgPin(99119911L);
        String val1 = organization.getOrgPin();
        String val2 = organization.getOrgPin();
        UUID uuid = new UUID(123132, 456132);
        organization.setUuid(String.valueOf(uuid));
        return organization;
    }

    public XMLGregorianCalendar getXMLGregorianCalendar(String date) throws Exception{
        XMLGregorianCalendar xmlCalender = null;
        GregorianCalendar calender = new GregorianCalendar();
        calender.setTime(stringToJavaDate(date));
        xmlCalender = DatatypeFactory.newInstance().newXMLGregorianCalendar(calender);
        return xmlCalender;
    }
    public Date stringToJavaDate(String sDate) throws Exception {
        Date date = null;
        date = new SimpleDateFormat(dateFormat).parse(sDate);
        return date;
    }

    @Transactional
    public List<ReferenceEmon> saveRequest(String regNum, String legalEntityNumber, String orgUuid, List<ReferenceEmon> dataList, Long otp,String invoiceNo, HttpServletRequest httpServletRequest) {

        Organization organization = organizationDAO.findFirstByUuidAndOrgTypeAndStatusAndActiveFlag(orgUuid, 0L, 1L, 1L);
        if (organization == null) {
            throw new RuntimeException("Эрх байхгүй байна");
        }

        ServiceResponse citizenData = (ServiceResponse) xypService.getCitizenData(regNum, null, organization, otp);
        if (citizenData.getResponse() == null) {
            throw new RuntimeException(citizenData.getResultMessage());
        }
        dataList.sort(Comparator.comparing(ReferenceEmon::getId));

        ImsToken imsToken = userService.getLoggedUserInfo();

        Request request = new Request();
        request.setRegNo(regNum);
        request.setOrgId(imsToken.getUserInfo().getOrgId());
        request.setUserId(imsToken.getUserInfo().getUserId());
        request.setOtp(otp);
        request.setStatus(1L);
        request.setCreatedDate(new Date());
        request.setUrl(httpServletRequest.getServletPath());

        Gson gson = new Gson();
        String json = gson.toJson(dataList);
        request.setRequestBody(json);
        requestDAO.save(request);

        String cabinNumber = null;
        String companyRegnum = null;
        String parcelId = null;
        String personId = null;
        String contractId = null;
        String forUsage = null;
        String usage = null;
        Integer year = null;
        Integer licenseNumber = null;
        Integer startYear = null;
        Integer endYear = null;
        String startDate = null;
        String endDate = null;
        String tenderName = null;
        String tenderNumber = null;
        String siId = null;
        String type = null;
        String propertyNumber = null;
        String plateNumber = null;
        String studentId = null;

        ArrayList<Integer> x = new ArrayList<Integer>(Arrays.asList(56,57,58,60,61,62,63,64));

        Integer prevServiceId=0;
        ServiceResponse prevServiceResponse = null;

        for (ReferenceEmon reference : dataList) {
            RequestDetail requestDetail = new RequestDetail();
            requestDetail.setRequestId(request.getId());
            requestDetail.setServiceId(reference.getId());

            try {
                for (ReferenceTag reftags : reference.getRefTags()){
                    switch (reftags.getCode()) {
                        case "cabinNumber": cabinNumber = reftags.getValue(); break;
                        case "companyRegnum": companyRegnum = reftags.getValue(); break;
                        case "parcelId": parcelId = reftags.getValue(); break;
                        case "personId": personId = reftags.getValue(); break;
                        case "contractId": contractId = reftags.getValue(); break;
                        case "forUsage": forUsage = reftags.getValue(); break;
                        case "usage": usage = reftags.getValue(); break;
                        case "year": year = Integer.valueOf(reftags.getValue()); break;
                        case "licenseNumber": licenseNumber = Integer.valueOf(reftags.getValue()); break;
                        case "startYear": startYear = Integer.valueOf(reftags.getValue()); break;
                        case "endYear": endYear = Integer.valueOf(reftags.getValue()); break;
                        case "startDate": startDate = reftags.getValue(); break;
                        case "endDate": endDate = reftags.getValue(); break;
                        case "propertyNumber": propertyNumber = reftags.getValue(); break;
                        case "plateNumber": plateNumber = reftags.getValue(); break;
                        case "studentId": studentId = reftags.getValue(); break;
                        default: break;
                    }
                }
                requestDetailDAO.save(requestDetail);

                if (x.contains(reference.getId().intValue())) {
                    ServiceResponse relatedUsersInfo = (ServiceResponse) xypService.landRelatedUsersInfo(regNum, null, organization, otp);
                    ObjectMapper oMapper = new ObjectMapper();
                    oMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
                    oMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                    RelatedUsersInfoList usersInfos = oMapper.convertValue(relatedUsersInfo.getResponse(), RelatedUsersInfoList.class);
                    personId = usersInfos.getListData().isEmpty() ? null : usersInfos.getListData().get(0).getPersonId().toString();
                }

                ServiceResponse serviceResponse = null;
                switch (reference.getId().intValue()) {
                    case 1: serviceResponse = (ServiceResponse) xypService.getCitizenBirthInfo(regNum, null, organization, otp); break;
                    case 2: serviceResponse = (ServiceResponse) xypService.getCitizenMarriageInfo(regNum, null, organization, otp); break;
                    case 3: serviceResponse = (ServiceResponse) xypService.getCitizenNoMarriageInfo(regNum, null, organization, otp); break;
                    case 4: serviceResponse = (ServiceResponse) xypService.getCitizenMarriageDivorceInfo(regNum, null, organization, otp); break;
                    case 5: serviceResponse = (ServiceResponse) xypService.getCitizenRegnumInfo(regNum, null, organization, otp); break;
                    case 6: serviceResponse = (ServiceResponse) xypService.getCitizenChangeRegnumInfo(regNum, null, organization, otp); break;
                    case 7: serviceResponse = (ServiceResponse) xypService.getCitizenChangeNameInfo(regNum, null, organization, otp); break;
                    case 8: serviceResponse = (ServiceResponse) xypService.checkCitizenNonPassport(regNum, null, organization, otp); break;
                    case 9: serviceResponse = (ServiceResponse) xypService.firstTimePassportInfo(regNum, null, organization, otp); break;
                    case 10: serviceResponse = (ServiceResponse) xypService.passportInfoSecondTime(regNum, null, organization, otp); break;
                    case 12: serviceResponse = (ServiceResponse) xypService.getCitizenData(regNum, null, organization, otp); break;
                    case 13: serviceResponse = (ServiceResponse) xypService.getCitizenAddressInfo(regNum, null, organization, otp); break;

                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 20:
                        if(prevServiceResponse == null){
                            serviceResponse = (ServiceResponse) xypService.getLegalEntityInfo(regNum, Integer.valueOf(legalEntityNumber), organization, otp);
                            prevServiceResponse = serviceResponse;
                        }else{
                            if(!Arrays.asList(14,15,16,17,18,20).contains(prevServiceId)){
                                serviceResponse = (ServiceResponse) xypService.getLegalEntityInfo(regNum, Integer.valueOf(legalEntityNumber), organization, otp);
                                prevServiceResponse = serviceResponse;
                            } else  {
                                serviceResponse = prevServiceResponse;
                            }
                        }
                        break;
                    case 19: serviceResponse = (ServiceResponse) xypService.getNonLegalEntityInfo(regNum, organization, otp); break;
                    case 21: serviceResponse = (ServiceResponse) xypService.citizenNoMarriageInfoData(regNum, organization, otp); break;
                    case 22: serviceResponse = (ServiceResponse) xypService.citizenMarriageInfoEng(regNum, organization, otp); break;
                    case 23: serviceResponse = (ServiceResponse) xypService.citizenIDCardInfoEng(regNum, organization, otp); break;
                    case 24: serviceResponse = (ServiceResponse) xypService.citizenBirthInfoEng(regNum, organization, otp); break;
                    case 25: serviceResponse = (ServiceResponse) xypService.getVehicleInspectionInfo(regNum, cabinNumber, organization, otp); break;
                    case 26: serviceResponse = (ServiceResponse) xypService.specialDriverInfo(regNum, licenseNumber, organization, otp); break;
                    case 27:
                    case 28:
                        if(prevServiceResponse == null){
                            serviceResponse = (ServiceResponse) xypService.checkDebtOfCustomsInfo(regNum, organization, otp);
                            prevServiceResponse = serviceResponse;
                        }else{
                            if(!Arrays.asList(27,28).contains(prevServiceId)){
                                serviceResponse = (ServiceResponse) xypService.checkDebtOfCustomsInfo(regNum, organization, otp);
                                prevServiceResponse = serviceResponse;
                            } else  {
                                serviceResponse = prevServiceResponse;
                            }
                        }
                        break;
                    case 29:
                    case 30:
                        if(prevServiceResponse == null){
                            serviceResponse = (ServiceResponse) xypService.getCustomsInqInfo(regNum, startDate, endDate, type, organization, otp);
                            prevServiceResponse = serviceResponse;
                        }else{
                            if(!Arrays.asList(29,30).contains(prevServiceId)){
                                serviceResponse = (ServiceResponse) xypService.getCustomsInqInfo(regNum, startDate, endDate, type, organization, otp);
                                prevServiceResponse = serviceResponse;
                            } else  {
                                serviceResponse = prevServiceResponse;
                            }
                        }
                        break;
                    case 31: serviceResponse = (ServiceResponse) xypService.getCustomsOffnsInfo(regNum, startDate, endDate, organization, otp); break;
                    case 32:
                    case 33:
                    case 34:
                        if(prevServiceResponse == null){
                            serviceResponse = (ServiceResponse) xypService.getOrganizationInfo(legalEntityNumber, forUsage, usage, year, regNum, organization, otp);
                            prevServiceResponse = serviceResponse;
                        }else{
                            if(!Arrays.asList(32,33,34).contains(prevServiceId)){
                                serviceResponse = (ServiceResponse) xypService.getOrganizationInfo(legalEntityNumber, forUsage, usage, year, regNum, organization, otp);
                                prevServiceResponse = serviceResponse;
                            } else  {
                                serviceResponse = prevServiceResponse;
                            }
                        }
                        break;
                    case 35: serviceResponse = (ServiceResponse) xypService.getTenderInfo(regNum, legalEntityNumber, tenderName, tenderNumber, usage, year.toString(), organization, otp); break;
                    case 36: serviceResponse = (ServiceResponse) xypService.getIndividualInfo(regNum, forUsage, usage, year, organization, otp); break;
                    case 37:
                    case 38:
                        if(prevServiceResponse == null){
                            serviceResponse = (ServiceResponse) xypService.getDriverLicenseInfo(regNum, organization, otp);
                            prevServiceResponse = serviceResponse;
                        }else{
                            if(!Arrays.asList(37,38).contains(prevServiceId)){
                                serviceResponse = (ServiceResponse) xypService.getDriverLicenseInfo(regNum, organization, otp);
                                prevServiceResponse = serviceResponse;
                            } else  {
                                serviceResponse = prevServiceResponse;
                            }
                        }
                        break;
                    case 39: serviceResponse = (ServiceResponse) xypService.getCitizenGunOwnerInfo(regNum, null, organization, otp); break;
                    case 40: serviceResponse = (ServiceResponse) xypService.firearmOwnerCertificateInfo(regNum, organization, otp); break;
                    case 41: serviceResponse = (ServiceResponse) xypService.getCitizenSalaryInfo(regNum, startYear, endYear, organization, otp); break;
                    case 42: serviceResponse = (ServiceResponse) xypService.getCitizenPensionInquiry(regNum, startYear, endYear, organization, otp); break;
                    // todo тодруулах
                    case 43: serviceResponse = (ServiceResponse) xypService.getEmployerInfo(regNum, siId, legalEntityNumber.toString(), organization, otp); break;
                    case 44: serviceResponse = (ServiceResponse) xypService.getSiWorkerAccountInfo(regNum, organization, otp); break;
                    case 45: serviceResponse = (ServiceResponse) xypService.getCitizenSalaryInfoEng(regNum, startYear, endYear, organization, otp); break;
                    case 46: serviceResponse = (ServiceResponse) xypService.pensionDocumentInfo(regNum, organization, otp); break;
                    case 47: serviceResponse = (ServiceResponse) xypService.lostCaregiverPensionDocumentInfo(regNum, organization, otp); break;
                    case 48: serviceResponse = (ServiceResponse) xypService.disabilityPensionDocumentInfo(regNum, organization, otp); break;
                    case 49: serviceResponse = (ServiceResponse) xypService.checkHouseHoldSC(regNum, organization, otp); break;
                    case 50:
                    case 51:
                        if(prevServiceResponse == null){
                            serviceResponse = (ServiceResponse) xypService.checkHouseHoldFood(regNum, organization, otp);
                            prevServiceResponse = serviceResponse;
                        }else{
                            if(!Arrays.asList(50,51).contains(prevServiceId)){
                                serviceResponse = (ServiceResponse) xypService.checkHouseHoldFood(regNum, organization, otp);
                                prevServiceResponse = serviceResponse;
                            } else  {
                                serviceResponse = prevServiceResponse;
                            }
                        }
                        break;
                    case 52: serviceResponse = (ServiceResponse) xypService.checkHouseHoldChild(regNum, organization, otp); break;
                    case 53: serviceResponse = (ServiceResponse) xypService.checkChildMoney(regNum, organization, otp); break;
                    case 54: serviceResponse = (ServiceResponse) xypService.getInsuranceFee(regNum, organization, otp); break;
                    case 55: serviceResponse = (ServiceResponse) xypService.ueeReferenceService(regNum, null, organization, otp); break;
                    case 56:
                    case 57:
                    case 58:
                    case 61:
                    case 64:
                        if(prevServiceResponse == null){
                            serviceResponse = (ServiceResponse) xypService.landRelatedInfoByParcelId(regNum, parcelId, personId, organization, otp);
                            prevServiceResponse = serviceResponse;
                        }else{
                            if(!Arrays.asList(56,57,58,61,64).contains(prevServiceId)){
                                serviceResponse = (ServiceResponse) xypService.landRelatedInfoByParcelId(regNum, parcelId, personId, organization, otp);
                                prevServiceResponse = serviceResponse;
                            } else  {
                                serviceResponse = prevServiceResponse;
                            }
                        }
                        break;
                    case 59: serviceResponse = (ServiceResponse) xypService.getCadastralMap(regNum, parcelId, organization, otp); break;
                    case 60: serviceResponse = (ServiceResponse) xypService.landSettlementAct(regNum, contractId, personId, organization, otp); break;
                    case 62:
                    case 63:
                        if(prevServiceResponse == null){
                            serviceResponse = (ServiceResponse) xypService.landInfoByPersonIdAndParcelId(regNum, parcelId, personId, organization, otp);
                            prevServiceResponse = serviceResponse;
                        }else{
                            if(!Arrays.asList(62,63).contains(prevServiceId)){
                                serviceResponse = (ServiceResponse) xypService.landInfoByPersonIdAndParcelId(regNum, parcelId, personId, organization, otp);
                                prevServiceResponse = serviceResponse;
                            } else  {
                                serviceResponse = prevServiceResponse;
                            }
                        }
                        break;
                    case 65:
                    case 85:
                        if(prevServiceResponse == null){
                            serviceResponse = (ServiceResponse) xypService.covid19VaccineCertificate(regNum, null, organization, otp);
                            prevServiceResponse = serviceResponse;
                        }else{
                            if(!Arrays.asList(65,85).contains(prevServiceId)){
                                serviceResponse = (ServiceResponse) xypService.covid19VaccineCertificate(regNum, null, organization, otp);
                                prevServiceResponse = serviceResponse;
                            } else  {
                                serviceResponse = prevServiceResponse;
                            }
                        }
                        break;
                    // todo WSDL not FOUND
                    //                case 66: serviceResponse = (ServiceResponse) xypService.landSettlementAct(contractId, personId); break;
                    //                case 67: serviceResponse = (ServiceResponse) xypService.landSettlementAct(contractId, personId); break;
                    //                case 68: serviceResponse = (ServiceResponse) xypService.landSettlementAct(contractId, personId); break;
                    case 69: serviceResponse = (ServiceResponse) xypService.getBloodTypeService(regNum, organization, otp); break;
                    case 70: serviceResponse = (ServiceResponse) xypService.covidPCRLastResultInfo(regNum, organization, otp); break;
                    case 71: serviceResponse = (ServiceResponse) xypService.getVehicleInfo(regNum,null, organization, otp, plateNumber); break;
                    case 72: serviceResponse = (ServiceResponse) xypService.getCitizenVehicleList(regNum,null, organization, otp); break;
                    case 73: serviceResponse = (ServiceResponse) xypService.getPreOwnedVehicle(regNum,null, organization, otp); break;
                    case 74: serviceResponse = (ServiceResponse) xypService.citizenDoingCriminalLiabilitylInfo(regNum,null, organization, otp); break;
                    case 75: serviceResponse = (ServiceResponse) xypService.citizenWasCriminalLiabilitylInfo(regNum,null, organization, otp); break;
                    case 76: serviceResponse = (ServiceResponse) xypService.legalEntityDoingCriminalLiability(regNum, Integer.valueOf(legalEntityNumber), organization, otp); break;
                    case 77: serviceResponse = (ServiceResponse) xypService.legalEntityWasCriminalLiability(regNum, Integer.valueOf(legalEntityNumber), organization, otp); break;
                    case 78: serviceResponse = (ServiceResponse) xypService.getCitizenNonPaymentInfo(regNum,null, organization, otp); break;
                    case 79: serviceResponse = (ServiceResponse) xypService.getCitizenHighSchoolInfo(regNum,null, organization, otp); break;
                    case 80: serviceResponse = (ServiceResponse) xypService.getPropertyInfo(regNum,null, organization, otp, propertyNumber); break;
                    case 81: serviceResponse = (ServiceResponse) xypService.getPropertyList(regNum,null, organization, otp); break;
                    case 82: serviceResponse = (ServiceResponse) xypService.isPropertyCheck(regNum,null, organization, otp); break;
                    case 83: serviceResponse = (ServiceResponse) xypService.getCitizenMiddleSchoolInfo(regNum,null, organization, otp); break;
                    case 84: serviceResponse = (ServiceResponse) xypService.citizenGraduateSchoolInfo(regNum,null, organization, otp, studentId); break;
                    default: break;
                }

                prevServiceId = reference.getId().intValue();

                ResponseModel responseModel = new ResponseModel();
                responseModel.setServiceId(reference.getEMongoliaId());
                responseModel.setServiceRequestId(citizenData.getRequestId());
                responseModel.setXypResultCode(Long.valueOf(serviceResponse.getResultCode()));
                responseModel.setXypData(serviceResponse.getResponse());
                responseModel.setCreatedDate(null);
                responseModel.setCitizen(citizenData.getResponse());
                log.info("response model" + responseModel);


                if (serviceResponse.getResultCode() == 0 || serviceResponse.getResultCode() == 1) {
                    if (reference.getId().intValue() == 65) {
                        ObjectMapper oMapper = new ObjectMapper();
                        Map<String, Object> map = oMapper.convertValue(serviceResponse.getResponse(), Map.class);
                        String pdfUrl = map.get("pdfUrl") == null ? "" : map.get("pdfUrl").toString();
                        if (pdfUrl.contains("&jwt=")) {
                            pdfUrl = pdfUrl.split("&jwt=")[0];
                        }
                        requestDetail.setResponseLink(pdfUrl);
                        requestDetailDAO.save(requestDetail);
                        reference.setPdfUrl(pdfUrl);
                        reference.setMessage(serviceResponse.getResultMessage());
                    } else if (reference.getId().intValue() == 85) {
                        ObjectMapper oMapper = new ObjectMapper();
                        Map<String, Object> map = oMapper.convertValue(serviceResponse.getResponse(), Map.class);
                        String pdfUrl = map.get("pdfUrlEng") == null ? "" : map.get("pdfUrlEng").toString();
                        if (pdfUrl.contains("&jwt=")) {
                            pdfUrl = pdfUrl.split("&jwt=")[0];
                            pdfUrl = pdfUrl + "&type=1";
                        }
                        requestDetail.setResponseLink(pdfUrl);
                        requestDetailDAO.save(requestDetail);
                        reference.setPdfUrl(pdfUrl);
                        reference.setMessage(serviceResponse.getResultMessage());
                    } else if (reference.getId().intValue() == 59) {
                        ObjectMapper oMapper = new ObjectMapper();
                        Map<String, Object> map = oMapper.convertValue(serviceResponse.getResponse(), Map.class);
                        String pdfUrl = map.get("data") == null ? "" : map.get("data").toString();
                        requestDetail.setResponseLink(null);
                        requestDetailDAO.save(requestDetail);
                        reference.setPdfUrl(pdfUrl);
                        reference.setMessage(serviceResponse.getResultMessage());
                    } else {
                        HashMap<String, String> hashMap = eMongoliaPdfFeign.getPdf(getToken(), responseModel).getBody();
                        requestDetail.setResponseLink(hashMap.get("data"));
                        requestDetailDAO.save(requestDetail);
                        reference.setPdfUrl(requestDetail.getResponseLink());
                        reference.setMessage(serviceResponse.getResultMessage());
                        reference.setRegNum(regNum);
                    }
                } else {
                    reference.setMessage(serviceResponse.getResultMessage());
                    reference.setPdfUrl(null);
                    reference.setRegNum(regNum);
                }
                String responseBody = gson.toJson(serviceResponse);
                requestDetail.setResponseBody(responseBody);
                requestDetail.setStatus(serviceResponse.getResultCode() == 0 ? 200L : 500L);

                if(reference.getIsPay().equals(1L)){
                    reference.setGpsInvoice(this.createEnquiryInvoice(regNum, reference.getXypServiceCode(), reference, imsToken, requestDetail.getId()));
                    reference.setRdId(requestDetail.getId());
                }
            } catch (Exception e) {
                e.printStackTrace();
                requestDetail.setStatus(500L);
                requestDetail.setResponseBody(e.getMessage());
                requestDetail.setResponseLink(null);
                requestDetailDAO.save(requestDetail);
            }
        }

        request.setRequestDataId(citizenData.getRequestId());
        requestDAO.save(request);

        return dataList;
    }


    public String getPdf(Long serviceId) {
        String url = requestDetailDAO.findByServiceId(serviceId);
        return url;
    }

    public String getToken() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("username", "external_get_token");
        hashMap.put("password", "ZXh0ZXJuYWxfZ2V0X3Rva2VuX3Bhcw==");

        return eMongoliaPdfFeign.getToken(hashMap).getBody().get("data");
    }


    public ServResponse setConfig(Long orgId, String accessToken, String password,String alias, MultipartFile certFile) throws IOException {
        Organization organization = organizationDAO.findFirstByIdAndStatusAndActiveFlag(orgId, 1L, 1L);
        if(organization==null){
            return new ServResponse(500L,"Байгууллага олдсонгүй","");
        }

        MultipartFile  file;
        byte [] byteArr=certFile.getBytes();

        organization.setAccessToken(accessToken);
        organization.setKey(password);
        organization.setAlias(alias);
        organization.setCertFile(byteArr);
        organizationDAO.save(organization);
        return new ServResponse(200L, "Тохиргоо амжилттай хийгдлээ", null);
    }

    @Transactional
    public GpsInvoice createEnquiryInvoice(String regno, String serviceCode, ReferenceEmon ref, ImsToken imsToken, Long detailId) throws ParseException {
        GpsInvoice gpsInvoice = new GpsInvoice();

        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar fiveDaysAgo = Calendar.getInstance();
        fiveDaysAgo.add(Calendar.DATE, -1);
        Date today = new Date();
        String sStr = formatter.format(fiveDaysAgo.getTime());
        String eStr = formatter.format(today);
        Date sDate = formatter.parse(sStr);
        Date eDate = formatter.parse(eStr);

        VRequestInfo vRequestInfo = vRequestInfoDAO.findByRegNoAndEmonIdDate(regno, ref.getEMongoliaId(), sDate, eDate);
        if(vRequestInfo!=null){
            gpsInvoice.setInvoiceCode(vRequestInfo.getInvoiceNo());
            gpsInvoice.setCode(99);
            gpsInvoice.setQpay(vRequestInfo.getQPayCode());
            gpsInvoice.setSocialPay(vRequestInfo.getSocialPayCode());
            return gpsInvoice;
        }

        EnquiryInvoiceModel model = new EnquiryInvoiceModel();
        model.setRegno(regno.toUpperCase());
        model.setCode(serviceCode);

        gpsInvoice = eBarimGPSFeign.createEnquiryInvoice("5ca9ebe0-6bd2-11ed-a1eb-0242ac120002", model).getBody();

        RequestDetailInvoice detailInvoice = new RequestDetailInvoice();
        detailInvoice.setInvoiceNo(gpsInvoice.getInvoiceCode());
        detailInvoice.setInvoiceStatus(1L);
        detailInvoice.setAmount(BigDecimal.valueOf(ref.getAmount()));
        detailInvoice.setServiceId(ref.getId());
        detailInvoice.setCreatedBy(imsToken.getUserInfo().getUserId());
        detailInvoice.setCreatedDate(new Date());
        detailInvoice.setIsActive(1L);
        detailInvoice.setRequestDetailId(detailId);
        detailInvoice.setQpayCode(gpsInvoice.getQpay());
        detailInvoice.setSocialPayCode(gpsInvoice.getSocialPay());
        detailInvoiceDAO.save(detailInvoice);

        return gpsInvoice;
    }

    public Boolean checkEnquiryInvoice(String invoiceCode, Long rdId){
        Boolean retValue = false;
        GpsInvoice gpsInvoice = eBarimGPSFeign.stateEnquiryInvoice(invoiceCode,"5ca9ebe0-6bd2-11ed-a1eb-0242ac120002").getBody();
        if(gpsInvoice!=null && gpsInvoice.getCode()==100){
            RequestDetailInvoice detailInvoice = detailInvoiceDAO.findFirstByInvoiceNoAndIsActive(invoiceCode, 1L);
            if(detailInvoice!=null){
                detailInvoice.setRequestDetailId(rdId);
                detailInvoice.setInvoiceStatus(2L);
                detailInvoice.setCheckDate(new Date());
                detailInvoiceDAO.save(detailInvoice);
            }
            retValue = true;
        }

        return retValue;
    }

    public static URLStreamHandler getURLStreamHandler(String protocol) {
        try {
            Method method = URL.class.getDeclaredMethod("getURLStreamHandler", String.class);
            method.setAccessible(true);
            return (URLStreamHandler) method.invoke(null, protocol);
        } catch (Exception e) {
            return null;
        }
    }

    public ResponseEntity<ExternaPdf> getPdfExternal(String regno, Long type) {
        try {
            URL url = null;
            if (type == 1L) {
                url= new URL("https://health.gov.mn/api/v1/vaccine/cert?regno="+ URLEncoder.encode(regno) + "&type=1");
            } else {
                url = new URL("https://health.gov.mn/api/v1/vaccine/cert?regno="+ URLEncoder.encode(regno));
            }
            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
            InputStream is = conn.getInputStream();
            final ByteArrayOutputStream baos = new ByteArrayOutputStream();
            int len;
            byte[] buffer = new byte[4096];
            while ((len = is.read(buffer, 0, buffer.length)) != -1) {
                baos.write(buffer, 0, len);
            }
            final ByteArrayInputStream responseStream = new ByteArrayInputStream(baos.toByteArray());
            try {
                baos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            ByteArrayResource resource = new ByteArrayResource(responseStream.readAllBytes());

            return ResponseEntity.ok(new ExternaPdf(1L, resource.getByteArray()));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public List<VRequestInfo> getResultCheck(String regNum, Long isPay, String emonId) {
        List<VRequestInfo> vRequestInfos = new ArrayList<>();
//        List<VRequestInfo> vRequestInfos = vRequestInfoDAO.findByRegNoAndIsPayAndEmonId(regNum, isPay, emonId);
        return vRequestInfos;
    }

    public Page getRequestList(Pageable pageable, List<String> filters, String sort){
        ImsToken imsToken = this.userService.getLoggedUserInfo();
        List<VRequestInfo> vRequestInfoList = new ArrayList<>();

        Query runQuery = null;
        Query runCountQuery = null;
        Field[] fields = VRequestInfo.class.getDeclaredFields();
        if (imsToken.getUserInfo().getRoleId().equals(1L)) {
            runQuery = em.createNativeQuery(
                    "SELECT V.* FROM ITC_EMONGOLIA.V_REQUEST_INFO V WHERE 1= 1 "
                            + Tools.generateQueryFilter(fields, filters, "V")
                            + Tools.generateQuerySort(fields, sort, "V"), VRequestInfo.class);
            runCountQuery = em.createNativeQuery(
                    "SELECT COUNT(V.ID) FROM ITC_EMONGOLIA.V_REQUEST_INFO V WHERE 1= 1 "
                            + Tools.generateQueryFilter(fields, filters, "V")
                            + Tools.generateQuerySort(fields, sort, "V"));
        } else {
            runQuery = em.createNativeQuery(
                    "SELECT V.* FROM ITC_EMONGOLIA.V_REQUEST_INFO V WHERE 1= 1 AND (V.ORG_ID = "
                            + imsToken.getUserInfo().getOrgId() + " OR V.PARENT_ID = " +  imsToken.getUserInfo().getOrgId() + " ) "
                            + Tools.generateQueryFilter(fields, filters, "V")
                            + Tools.generateQuerySort(fields, sort, "V"), VRequestInfo.class);
            runCountQuery = em.createNativeQuery(
                    "SELECT COUNT(V.ID)  FROM ITC_EMONGOLIA.V_REQUEST_INFO V  WHERE (V.ORG_ID = "
                            + imsToken.getUserInfo().getOrgId() + " OR V.PARENT_ID = " +  imsToken.getUserInfo().getOrgId() + " ) "
                            + Tools.generateQueryFilter(fields, filters, "V")
                            + Tools.generateQuerySort(fields, sort, "V"));
        }

        runQuery.setFirstResult((pageable.getPageNumber()) * pageable.getPageSize());
        runQuery.setMaxResults(pageable.getPageSize());
        vRequestInfoList = runQuery.getResultList();

        BigDecimal totalCount =  (BigDecimal) runCountQuery.getSingleResult();
        Page page = new PageImpl<VRequestInfo>(vRequestInfoList,pageable,totalCount.intValue());
        return page;
    }

    public ResponseEntity getOutLinkData(List<String> list){
        return restTemplateRequest(list.get(0), null);
    }

    public ResponseEntity restTemplateRequest(String theUrl, String token) {
        RestTemplate restTemplate = new RestTemplate();
        try {
            HttpHeaders headers = createHttpHeaders(token);
            HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

            List<String> res = new ArrayList<>();
            ResponseEntity<Object> response = restTemplate.exchange(theUrl, HttpMethod.GET, entity, Object.class);

            return ResponseEntity.ok(response.getBody());
        }
        catch (Exception e) {
//            log.log(Level.SEVERE, e.getMessage(), e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    private HttpHeaders createHttpHeaders(String taisToken)
    {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
//        headers.add("Authorization", "Bearer " + taisToken);
        headers.add("referer", "https://st-itax.mta.mn/home/receiptCreate");
        return headers;
    }

    public OrganizationConfig getConfigInfo(Long orgId) {
        OrganizationConfig org = organizationConfigDAO.findFirstByIdAndStatus(orgId, 1L);
        if (!Tools.isNullOrEmpty(org)) {
            String token = "";
            String key = "";
            String first = org.getAccessToken().substring(0,4);
            Integer tokenSize = org.getAccessToken().length();
            Integer keySize = org.getKey().length();
            String last = org.getAccessToken().substring(tokenSize - 4, tokenSize);
            token = Tools.joinString("", first, getAsterisk(tokenSize, 8), last);
            key = Tools.joinString("", getAsterisk(keySize,0));
            org.setAccessToken(token);
            org.setKey(key);
        }
        return org;
    }

    public static String getAsterisk(Integer value, Integer reduceSize) {
        List<String> asterisk = new ArrayList<>();
        for (int i = 0; i < value - reduceSize; i++) {
            asterisk.add("*");
        }
        String star = String.join("", asterisk);
        return star;
    }
}
