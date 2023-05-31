package mn.gov.ema.emongolia.service;


import lombok.extern.java.Log;
import mn.gov.ema.emongolia.data.XypCitizen.*;
import mn.gov.ema.emongolia.data.XypCitizen130.CitizenRequestData;
import mn.gov.ema.emongolia.data.XypCitizen130.CitizenService;
import mn.gov.ema.emongolia.data.XypCitizen130.CitizenServiceService;
import mn.gov.ema.emongolia.data.XypEducation.EducationService;
import mn.gov.ema.emongolia.data.XypEducation.EducationServiceService;
import mn.gov.ema.emongolia.data.XypEducation.UeeReferenceRequestData;
import mn.gov.ema.emongolia.data.XypInsurance.*;
import mn.gov.ema.emongolia.data.XypLegalEntity.*;
import mn.gov.ema.emongolia.data.XypProperty.*;
import mn.gov.ema.emongolia.data.AuthorizationData.AuthorizationData;
import mn.gov.ema.emongolia.data.AuthorizationData.AuthorizationEntity;
import mn.gov.ema.emongolia.data.ServiceResponse.ServiceResponse;
import mn.gov.ema.emongolia.data.XypTax.*;
import mn.gov.ema.emongolia.data.XypTransport.*;
import mn.gov.itc.emongolia.data.XypCitizen.*;
import mn.gov.ema.emongolia.data.XypGovernment.CitizenIDCardInfoEngRequestData;
import mn.gov.ema.emongolia.data.XypGovernment.FirearmOwnerCertificateRequestData;
import mn.gov.ema.emongolia.data.XypGovernment.GovernmentService;
import mn.gov.ema.emongolia.data.XypGovernment.GovernmentServiceService;
import mn.gov.ema.emongolia.data.XypHealth.HealthService;
import mn.gov.ema.emongolia.data.XypHealth.HealthServiceService;
import mn.gov.ema.emongolia.data.XypHealth.RegisterRequestData;
import mn.gov.itc.emongolia.data.XypInsurance.*;
import mn.gov.itc.emongolia.data.XypLegalEntity.*;
import mn.gov.ema.emongolia.data.XypMeta.CheckOtpRequestData;
import mn.gov.ema.emongolia.data.XypMeta.MetaService;
import mn.gov.ema.emongolia.data.XypMeta.MetaServiceService;
import mn.gov.ema.emongolia.data.XypMeta.RegisterOTPRequest;
import mn.gov.itc.emongolia.data.XypProperty.*;
import mn.gov.itc.emongolia.data.XypTax.*;
import mn.gov.itc.emongolia.data.XypTransport.*;
import mn.gov.ema.emongolia.data.dao.OrganizationDAO;
import mn.gov.ema.emongolia.data.entity.Organization;
import mn.gov.ema.emongolia.data.model.OtpModel;
import mn.gov.ema.emongolia.data.redis.entity.ImsToken;
import mn.gov.ema.emongolia.util.XypSign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.MessageContext;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
@Log
public class XypService {
    String dateFormat = "yyyy-MM-dd HH:mm:ss";

    @Autowired
    OrganizationDAO organizationDAO;

    @Autowired
    UserService userService;

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

    // Сертификат баазаас авах
//    private byte[] getCert () {
//        List<Organization> organizations = organizationDAO.findByOrOrgPin("99119911");
//        byte[] data = organizations.get(0).getCertFile();
//        return data;
//    }

    // ХУР-аас сервис дуудах
    public mn.gov.ema.emongolia.data.XypCitizen.CitizenService createCitizenServiceXYP(Organization organization)
    {
        mn.gov.ema.emongolia.data.XypCitizen.CitizenServiceService citizenServiceService = new mn.gov.ema.emongolia.data.XypCitizen.CitizenServiceService();
        mn.gov.ema.emongolia.data.XypCitizen.CitizenService port = citizenServiceService.getCitizenServicePort();
        Map<String, Object> requestContext = ((BindingProvider)port).getRequestContext();
        requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://xyp.gov.mn/citizen-1.5.0/ws?WSDL");
        requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, XypSign.getRequestHeaders(organization));
        return port;
    }

    public LesService createLegalEntityServiceXYP(Organization organization)
    {
        LesServiceService lesServiceService = new LesServiceService();
        LesService port = lesServiceService.getLesServicePort();
        Map<String, Object> requestContext = ((BindingProvider)port).getRequestContext();
        requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://xyp.gov.mn/legal-entity-1.5.0/ws?WSDL");
        requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, XypSign.getRequestHeaders(organization));
        return port;
    }

    public GovernmentService createGovernmentServiceXYP(Organization organization)
    {
        GovernmentServiceService governmentServiceService = new GovernmentServiceService();
        GovernmentService port = governmentServiceService.getGovernmentServicePort();
        Map<String, Object> requestContext = ((BindingProvider)port).getRequestContext();
        requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://xyp.gov.mn/government-service-1.5.0/ws?WSDL");
        requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, XypSign.getRequestHeaders(organization));
        return port;
    }

    public TaxService createTaxServiceXYP(Organization organization)
    {
        TaxServiceService taxServiceService = new TaxServiceService();
        TaxService port = taxServiceService.getTaxServicePort();
        Map<String, Object> requestContext = ((BindingProvider)port).getRequestContext();
        requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://xyp.gov.mn/tax-1.5.0/ws?WSDL");
        requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, XypSign.getRequestHeaders(organization));
        return port;
    }

    public TransportService createTransportServiceXYP(Organization organization)
    {
        TransportServiceService transportServiceService = new TransportServiceService();
        TransportService port = transportServiceService.getTransportServicePort();
        Map<String, Object> requestContext = ((BindingProvider)port).getRequestContext();
        requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://xyp.gov.mn/transport-1.5.0/ws?WSDL");
        requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, XypSign.getRequestHeaders(organization));
        return port;
    }

    public InsuranceService createInsuranceServiceXYP(Organization organization)
    {
        InsuranceServiceService insuranceServiceService = new InsuranceServiceService();
        InsuranceService port = insuranceServiceService.getInsuranceServicePort();
        Map<String, Object> requestContext = ((BindingProvider)port).getRequestContext();
        requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://xyp.gov.mn/insurance-1.5.0/ws?WSDL");
        requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, XypSign.getRequestHeaders(organization));
        return port;
    }

    public HealthService createHealthServiceXYP(Organization organization)
    {
        HealthServiceService healthServiceService = new HealthServiceService();
        HealthService port = healthServiceService.getHealthServicePort();
        Map<String, Object> requestContext = ((BindingProvider)port).getRequestContext();
        requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://xyp.gov.mn/health-1.5.0/ws?WSDL");
        requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, XypSign.getRequestHeaders(organization));
        return port;
    }

    public PropertyService createPropertyServiceXYP(Organization organization)
    {
        PropertyServiceService propertyServiceService = new PropertyServiceService();
        PropertyService port = propertyServiceService.getPropertyServicePort();
        Map<String, Object> requestContext = ((BindingProvider)port).getRequestContext();
        requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://xyp.gov.mn/property-1.5.0/ws?WSDL");
        requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, XypSign.getRequestHeaders(organization));
        return port;
    }

    public MetaService createMetaServiceNewXYP(Organization organization)
    {
        MetaServiceService metaServiceService = new MetaServiceService();
        MetaService port = metaServiceService.getMetaServicePort();
        Map<String, Object> requestContext = ((BindingProvider)port).getRequestContext();
        requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, XypSign.getRequestHeaders(organization));
        requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://xyp.gov.mn/meta-1.5.0/ws?WSDL");
        return port;
    }

    public EducationService createEducationServiceXYP(Organization organization)
    {
        EducationServiceService educationServiceService = new EducationServiceService();
        EducationService port = educationServiceService.getEducationServicePort();
        Map<String, Object> requestContext = ((BindingProvider)port).getRequestContext();
        requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, XypSign.getRequestHeaders(organization));
        requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://xyp.gov.mn/education-1.5.0/ws?WSDL");
        return port;
    }

    public CitizenService createCitizenService130XYP(Organization organization)
    {
        CitizenServiceService citizenServiceService = new CitizenServiceService();
        CitizenService port = citizenServiceService.getCitizenServicePort();
        Map<String, Object> requestContext = ((BindingProvider)port).getRequestContext();
        requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://xyp.gov.mn/citizen-1.3.0/ws?WSDL");
        requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, XypSign.getRequestHeaders(organization));
        return port;
    }

    public mn.gov.ema.emongolia.data.XypCitizen140.CitizenService createCitizenService140XYP(Organization organization)
    {
        mn.gov.ema.emongolia.data.XypCitizen140.CitizenServiceService citizenServiceService = new mn.gov.ema.emongolia.data.XypCitizen140.CitizenServiceService();
        mn.gov.ema.emongolia.data.XypCitizen140.CitizenService port = citizenServiceService.getCitizenServicePort();
        Map<String, Object> requestContext = ((BindingProvider)port).getRequestContext();
        requestContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://xyp.gov.mn/citizen-1.4.0/ws?WSDL");
        requestContext.put(MessageContext.HTTP_REQUEST_HEADERS, XypSign.getRequestHeaders(organization));
        return port;
    }

    // Иргэний үнэмлэхний мэдээлэл дамжуулах сервис 130
    public Object getCitizenData130(String regnum, String civilId) {
        ImsToken imsToken = userService.getLoggedUserInfo();
        Organization organization = organizationDAO.findFirstByIdAndStatusAndActiveFlag(imsToken.getUserInfo().getOrgId(), 1L, 1L);

        CitizenService citizenService = createCitizenService130XYP(organization);
        mn.gov.ema.emongolia.data.XypCitizen130.ServiceResponse serviceResponse = citizenService.ws100101GetCitizenIDCardInfo(citizenRequestData130(regnum, civilId));
        return serviceResponse;
    }

    public CitizenRequestData citizenRequestData130(String regnum, String civilId){
        CitizenRequestData requestData = new CitizenRequestData();
        requestData.setRegnum(regnum);
        requestData.setCivilId(civilId);
        return requestData;
    }

    // Иргэний үнэмлэхний мэдээлэл дамжуулах сервис 140
    public Object getCitizenDataNew(String regnum, String civilId) {
        ImsToken imsToken = userService.getLoggedUserInfo();
        Organization organization = organizationDAO.findFirstByIdAndStatusAndActiveFlag(imsToken.getUserInfo().getOrgId(), 1L, 1L);

        mn.gov.ema.emongolia.data.XypCitizen140.CitizenService citizenService = createCitizenService140XYP(organization);
        mn.gov.ema.emongolia.data.XypCitizen140.ServiceResponse serviceResponse = citizenService.ws100101GetCitizenIDCardInfo(citizenRequestData140(regnum, civilId));
        return serviceResponse;
    }

    public mn.gov.ema.emongolia.data.XypCitizen140.CitizenRequestData citizenRequestData140(String regnum, String civilId){
        mn.gov.ema.emongolia.data.XypCitizen140.CitizenRequestData requestData = new mn.gov.ema.emongolia.data.XypCitizen140.CitizenRequestData();
        requestData.setRegnum(regnum);
        requestData.setCivilId(civilId);
        return requestData;
    }

    // Иргэний үнэмлэхний мэдээлэл дамжуулах сервис
    public Object getCitizenData(String regnum, String civilId, Organization organization, Long otp) {
        mn.gov.ema.emongolia.data.XypCitizen.CitizenService citizenService = createCitizenServiceXYP(organization);
        ServiceResponse serviceResponse = citizenService.ws100101GetCitizenIDCardInfo(citizenRequestData(regnum, civilId, otp));
        return serviceResponse;
    }
    public mn.gov.ema.emongolia.data.XypCitizen.CitizenRequestData citizenRequestData(String regnum, String civilId, Long otp){
        mn.gov.ema.emongolia.data.XypCitizen.CitizenRequestData requestData = new mn.gov.ema.emongolia.data.XypCitizen.CitizenRequestData();
        AuthorizationData authorizationData = new AuthorizationData();
        AuthorizationEntity entity = new AuthorizationEntity();
        entity.setRegnum(regnum);
        entity.setOtp(otp.intValue());
        authorizationData.setCitizen(entity);
        requestData.setRegnum(regnum);
        requestData.setAuth(authorizationData);
        requestData.setCivilId(civilId);
        return requestData;
    }

    // Иргэний төрсний гэрчилгээний мэдээлэл дамжуулах сервис
    public Object getCitizenBirthInfo(String regnum, String civilId,Organization organization, Long otp) {
        mn.gov.ema.emongolia.data.XypCitizen.CitizenService citizenService = createCitizenServiceXYP(organization);
        ServiceResponse serviceResponse = citizenService.ws100102GetCitizenBirthInfo(citizenRequestData(regnum, civilId, otp));
        return serviceResponse;
    }

    // Иргэний хаягийн мэдээлэл дамжуулах сервис
    public Object getCitizenAddressInfo(String regnum, String civilId,Organization organization, Long otp) {
        mn.gov.ema.emongolia.data.XypCitizen.CitizenService citizenService = createCitizenServiceXYP(organization);
        ServiceResponse serviceResponse = citizenService.ws100103GetCitizenAddressInfo(citizenRequestData(regnum, civilId, otp));
        return serviceResponse;
    }

    // Иргэн гэрлэлтийн мэдээлэл дамжуулах сервис
    public Object getCitizenMarriageInfo(String regnum, String civilId,Organization organization, Long otp) {
        mn.gov.ema.emongolia.data.XypCitizen.CitizenService citizenService = createCitizenServiceXYP(organization);
        ServiceResponse serviceResponse = citizenService.ws100104GetCitizenMarriageInfo(citizenRequestData(regnum, civilId, otp));
        return serviceResponse;
    }

    // Иргэн гэрлэлт цуцалсан тухай мэдээлэл дамжуулах сервис
    public Object getCitizenMarriageDivorceInfo(String regnum, String civilId,Organization organization, Long otp) {
        mn.gov.ema.emongolia.data.XypCitizen.CitizenService citizenService = createCitizenServiceXYP(organization);
        ServiceResponse serviceResponse = citizenService.ws100105GetCitizenMarriageDivorceInfo(citizenRequestData(regnum, civilId, otp));
        return serviceResponse;
    }

    // Регистрийн дугаар өөрчилсний бүртгэлийн лавлагаа
    public Object getCitizenChangeRegnumInfo(String regnum, String civilId,Organization organization, Long otp) {
        mn.gov.ema.emongolia.data.XypCitizen.CitizenService citizenService = createCitizenServiceXYP(organization);
        ServiceResponse serviceResponse = citizenService.ws100139GetCitizenChangeRegnumInfo(citizenRequestData(regnum, civilId, otp));
        return serviceResponse;
    }

    // Гэрлэлт бүртгэлгүй мэдээлэл дамжуулах сервис
    public Object getCitizenNoMarriageInfo(String regnum, String civilId,Organization organization, Long otp) {
        mn.gov.ema.emongolia.data.XypCitizen.CitizenService citizenService = createCitizenServiceXYP(organization);
        ServiceResponse serviceResponse = citizenService.ws100128GetCitizenNoMarriageInfo(citizenRequestData(regnum, civilId, otp));
        return serviceResponse;
    }

    // Регистрийн дугаарын тухай лавлагаа
    public Object getCitizenRegnumInfo(String regnum, String civilId,Organization organization, Long otp) {
        mn.gov.ema.emongolia.data.XypCitizen.CitizenService citizenService = createCitizenServiceXYP(organization);
        ServiceResponse serviceResponse = citizenService.ws100138GetCitizenRegnumInfo(citizenRequestData(regnum, civilId, otp));
        return serviceResponse;
    }

    // Овог, эцэг/эх/-ийн нэр, өөрийн нэр өөрчилсний бүртгэлийн лавлагаа
    public Object getCitizenChangeNameInfo(String regnum, String civilId,Organization organization, Long otp) {
        mn.gov.ema.emongolia.data.XypCitizen.CitizenService citizenService = createCitizenServiceXYP(organization);
        ServiceResponse serviceResponse = citizenService.ws100134GetCitizenChangeNameInfo(citizenRequestData(regnum, civilId, otp));
        return serviceResponse;
    }

    // Гадаад пасспортын мэдээлэл мэдээлэл дамжуулах сервис
    public Object passportInfo(String regnum, String civilId,Organization organization, Long otp) {
        mn.gov.ema.emongolia.data.XypCitizen.CitizenService citizenService = createCitizenServiceXYP(organization);
        ServiceResponse serviceResponse = citizenService.ws100110PassportInfo(servicePassortInfoRequestData(regnum, civilId, otp));
        return serviceResponse;
    }

    public ServicePassortInfoRequestData servicePassortInfoRequestData(String regnum, String civilId, Long otp){
        ServicePassortInfoRequestData requestData = new ServicePassortInfoRequestData();
        AuthorizationData authorizationData = new AuthorizationData();
        AuthorizationEntity entity = new AuthorizationEntity();
        entity.setRegnum(regnum);
        entity.setOtp(otp.intValue());
        authorizationData.setCitizen(entity);
        requestData.setAuth(authorizationData);
        requestData.setRegnum(regnum);
        requestData.setCivilId(civilId);
        return requestData;
    }

    // Үндэсний энгийн гадаад паспорт анх удаа авсан тухай лавлагаа
    public Object firstTimePassportInfo(String regnum, String civilId,Organization organization, Long otp) {
        mn.gov.ema.emongolia.data.XypCitizen.CitizenService citizenService = createCitizenServiceXYP(organization);
        ServiceResponse serviceResponse = citizenService.ws100140FirstTimePassportInfo(citizenRequestData(regnum, civilId, otp));
        return serviceResponse;
    }

    // Үндэсний энгийн гадаад паспортын бүртгэлгүй тухай лавлагаа
    public Object checkCitizenNonPassport(String regnum, String civilId,Organization organization, Long otp) {
        mn.gov.ema.emongolia.data.XypCitizen.CitizenService citizenService = createCitizenServiceXYP(organization);
        ServiceResponse serviceResponse = citizenService.ws100136CheckCitizenNonPassport(citizenRequestData(regnum, civilId,otp));
        return serviceResponse;
    }

    // Үндэсний энгийн гадаад паспорт дахин авсан тухай лавлагаа
    public Object passportInfoSecondTime(String regnum, String civilId,Organization organization, Long otp) {
        mn.gov.ema.emongolia.data.XypCitizen.CitizenService citizenService = createCitizenServiceXYP(organization);
        ServiceResponse serviceResponse = citizenService.ws100141PassportInfoSecondTime(citizenRequestData(regnum, civilId,otp));
        return serviceResponse;
    }

    // Хуулийн этгээдийн мэдээлэл дамжуулах сервис
    public Object getLegalEntityInfo(String regnum, Integer legalEntityNumber, Organization organization, Long otp) {
        LesService lesService = createLegalEntityServiceXYP(organization);
        ServiceResponse serviceResponse = lesService.ws100301GetLegalEntityInfo(entityNumberData(regnum, legalEntityNumber, otp));
        return serviceResponse;
    }

    public EntityNumberData entityNumberData(String regnum, Integer legalEntityNumber, Long otp){
        EntityNumberData requestData = new EntityNumberData();
        AuthorizationData authorizationData = new AuthorizationData();
        AuthorizationEntity entity = new AuthorizationEntity();
        entity.setRegnum(regnum);
        entity.setOtp(otp.intValue());
        authorizationData.setCitizen(entity);
        requestData.setAuth(authorizationData);
        requestData.setLegalEntityNumber(legalEntityNumber);
        return requestData;
    }

    // Хуулийн этгээдийн бүртгэлгүй тухай лавлагаа
    public Object getNonLegalEntityInfo(String regnum, Organization organization, Long otp) {
        LesService lesService = createLegalEntityServiceXYP(organization);
        ServiceResponse serviceResponse = lesService.ws100306GetNonLegalEntityInfo(nonLegalEntityRequestData(regnum, otp));
        return serviceResponse;
    }
    public NonLegalEntityRequestData nonLegalEntityRequestData(String regnum, Long otp){
        NonLegalEntityRequestData requestData = new NonLegalEntityRequestData();
        AuthorizationData authorizationData = new AuthorizationData();
        AuthorizationEntity entity = new AuthorizationEntity();
        entity.setRegnum(regnum);
        entity.setOtp(otp.intValue());
        authorizationData.setCitizen(entity);
        requestData.setAuth(authorizationData);
        requestData.setRegnum(regnum);
        return requestData;
    }

    // Гаалийн зөрчлийн лавлагаа өгөх сервис
    public Object getCustomsOffnsInfo(String regnum, String startDate, String endDate,Organization organization, Long otp) {
        LesService lesService = createLegalEntityServiceXYP(organization);
        ServiceResponse serviceResponse = lesService.ws100327GetCustomsOffnsInfo(getCustomsOffnsRequestData(regnum, startDate, endDate, otp));
        return serviceResponse;
    }

    public GetCustomsOffnsRequestData getCustomsOffnsRequestData(String regnum, String startDate, String endDate, Long otp) {
        GetCustomsOffnsRequestData requestData = new GetCustomsOffnsRequestData();
        AuthorizationData authorizationData = new AuthorizationData();
        AuthorizationEntity entity = new AuthorizationEntity();
        entity.setRegnum(regnum);
        entity.setOtp(otp.intValue());
        authorizationData.setCitizen(entity);
        requestData.setAuth(authorizationData);
        requestData.setRegnum(regnum);
        try{
            requestData.setStartDate(getXMLGregorianCalendar(startDate + " 00:00:00"));
            requestData.setEndDate(getXMLGregorianCalendar(endDate + " 00:00:00"));
        }catch(Exception ex){
            ex.printStackTrace();
        }
        if(UtilService.isNullOrEmpty(requestData.getStartDate()) || UtilService.isNullOrEmpty(requestData.getEndDate())){
            throw new RuntimeException("Огноо алдаатай байна. зөв формат yyyy-MM-dd hh:mm:ss");
        }
        return requestData;
    }

    // Гаалийн байгууллагад өртэй эсэх сервис
    public Object checkDebtOfCustomsInfo(String regnum,Organization organization, Long otp) {
        LesService lesService = createLegalEntityServiceXYP(organization);
        ServiceResponse serviceResponse = lesService.ws100312CheckDebtOfCustomsInfo(checkDebtOfCustomsRequestData(regnum, otp));
        return serviceResponse;
    }

    public CheckDebtOfCustomsRequestData checkDebtOfCustomsRequestData(String regnum, Long otp) {
        CheckDebtOfCustomsRequestData requestData = new CheckDebtOfCustomsRequestData();
        AuthorizationData authorizationData = new AuthorizationData();
        AuthorizationEntity entity = new AuthorizationEntity();
        entity.setRegnum(regnum);
        entity.setOtp(otp.intValue());
        authorizationData.setCitizen(entity);
        requestData.setAuth(authorizationData);
        requestData.setRegnum(regnum);
        return requestData;
    }

    // Гаалийн цахим лавлагаа дэлгэрэнгүй өгөх сервис
    public Object getCustomsInqInfo(String regnum, String startDate, String endDate, String type,Organization organization, Long otp) {
        LesService lesService = createLegalEntityServiceXYP(organization);
        ServiceResponse serviceResponse = lesService.ws100321GetCustomsInqInfo(getCustomsInqRequestData(regnum, startDate, endDate, type, otp));
        return serviceResponse;
    }

    public GetCustomsInqRequestData getCustomsInqRequestData(String regnum, String startDate, String endDate, String type, Long otp) {
        GetCustomsInqRequestData requestData = new GetCustomsInqRequestData();
        AuthorizationData authorizationData = new AuthorizationData();
        AuthorizationEntity entity = new AuthorizationEntity();
        entity.setRegnum(regnum);
        entity.setOtp(otp.intValue());
        authorizationData.setCitizen(entity);
        requestData.setAuth(authorizationData);
        requestData.setRegnum(regnum);
        try{
            requestData.setStartDate(getXMLGregorianCalendar(startDate + " 00:00:00"));
            requestData.setEndDate(getXMLGregorianCalendar(endDate + " 00:00:00"));
        }catch(Exception ex){
            ex.printStackTrace();
        }
        if(UtilService.isNullOrEmpty(requestData.getStartDate()) || UtilService.isNullOrEmpty(requestData.getEndDate())){
            throw new RuntimeException("Огноо алдаатай байна. зөв формат yyyy-MM-dd hh:mm:ss");
        }
        requestData.setType(type);
        return requestData;
    }

    // Гэрлэсний бүртгэлгүй лавлагаа (англи)
    public Object citizenNoMarriageInfoData(String regnum, Organization organization, Long otp) {
        GovernmentService governmentService = createGovernmentServiceXYP(organization);
        ServiceResponse serviceResponse = governmentService.gs10029CitizenNoMarriageInfoData(citizenIDCardInfoEngRequestData(regnum, otp));
        return serviceResponse;
    }

    public CitizenIDCardInfoEngRequestData citizenIDCardInfoEngRequestData(String regnum, Long otp){
        CitizenIDCardInfoEngRequestData requestData = new CitizenIDCardInfoEngRequestData();
        AuthorizationData authorizationData = new AuthorizationData();
        AuthorizationEntity entity = new AuthorizationEntity();
        entity.setRegnum(regnum);
        entity.setOtp(otp.intValue());
        authorizationData.setCitizen(entity);
        requestData.setAuth(authorizationData);
        requestData.setRegnum(regnum);
        return requestData;
    }

     // Гэрлэсний бүртгэлийн лавлагаа (англи)
    public Object citizenMarriageInfoEng(String regnum, Organization organization, Long otp) {
        GovernmentService governmentService = createGovernmentServiceXYP(organization);
        ServiceResponse serviceResponse = governmentService.gs10030CitizenMarriageInfoEng(citizenIDCardInfoEngRequestData(regnum, otp));
        return serviceResponse;
    }

    // Иргэний үнэмлэхийн лавлагаа (англи)
    public Object citizenIDCardInfoEng(String regnum, Organization organization, Long otp) {
        GovernmentService governmentService = createGovernmentServiceXYP(organization);
        ServiceResponse serviceResponse = governmentService.gs10026CitizenIDCardInfoEng(citizenIDCardInfoEngRequestData(regnum, otp));
        return serviceResponse;
    }

    // Төрсний бүртгэлийн лавлагаа (англи)
    public Object citizenBirthInfoEng(String regnum, Organization organization, Long otp) {
        GovernmentService governmentService = createGovernmentServiceXYP(organization);
        ServiceResponse serviceResponse = governmentService.gs10027CitizenBirthInfoEng(citizenIDCardInfoEngRequestData(regnum, otp));
        return serviceResponse;
    }

    // Байгууллагын тодорхойлолт
    public Object getOrganizationInfo(String companyRegnum, String forUsage, String usage, Integer year, String regnum, Organization organization, Long otp) {
        TaxService taxService = createTaxServiceXYP(organization);
        ServiceResponse serviceResponse = taxService.ws100624GetOrganizationInfo(serviceOrganizationInfoRequestData(companyRegnum, forUsage, usage, year, regnum, otp));
        return serviceResponse;
    }

    public ServiceOrganizationInfoRequestData serviceOrganizationInfoRequestData(String companyRegnum, String forUsage, String usage, Integer year, String regnum, Long otp){
        ServiceOrganizationInfoRequestData requestData = new ServiceOrganizationInfoRequestData();
        AuthorizationData authorizationData = new AuthorizationData();
        AuthorizationEntity entity = new AuthorizationEntity();
        entity.setRegnum(regnum);
        entity.setOtp(otp.intValue());
        authorizationData.setCitizen(entity);
        requestData.setAuth(authorizationData);
        requestData.setCompanyRegnum(companyRegnum);
        requestData.setForUsage(forUsage);
        requestData.setUsage(usage);
        requestData.setYear(year);
        return requestData;
    }

    // Тендерийн тодорхойлолт
    public Object getTenderInfo(String regnum, String companyRegnum, String tenderName, String tenderNumber, String usage, String year,Organization organization, Long otp) {
        TaxService taxService = createTaxServiceXYP(organization);
        ServiceResponse serviceResponse = taxService.ws100623GetTenderInfo(tenderInfoRequestData(regnum, companyRegnum, tenderName, tenderNumber, usage, year, otp));
        return serviceResponse;
    }

    public TenderInfoRequestData tenderInfoRequestData(String regnum, String companyRegnum, String tenderName, String tenderNumber, String usage, String year, Long otp){
        TenderInfoRequestData requestData = new TenderInfoRequestData();
        AuthorizationData authorizationData = new AuthorizationData();
        AuthorizationEntity entity = new AuthorizationEntity();
        entity.setOtp(otp.intValue());
        entity.setRegnum(regnum);
        requestData.setAuth(authorizationData);
        authorizationData.setCitizen(entity);
        requestData.setCompanyRegnum(companyRegnum);
        requestData.setTenderName(tenderName);
        requestData.setTenderNumber(tenderNumber);
        requestData.setUsage(usage);
        requestData.setYear(year);
        return requestData;
    }

    // Иргэний тодорхойлолт
    public Object getIndividualInfo(String regnum, String forUsage, String usage, Integer year, Organization organization, Long otp) {
        TaxService taxService = createTaxServiceXYP(organization);
        ServiceResponse serviceResponse = taxService.ws100622GetIndividualInfo(serviceIndividualInfoRequestData(regnum, forUsage, usage, year, otp));
        return serviceResponse;
    }

    public ServiceIndividualInfoRequestData serviceIndividualInfoRequestData(String regnum, String forUsage, String usage, Integer year, Long otp){
        ServiceIndividualInfoRequestData requestData = new ServiceIndividualInfoRequestData();
        AuthorizationData authorizationData = new AuthorizationData();
        AuthorizationEntity entity = new AuthorizationEntity();
        entity.setRegnum(regnum);
        entity.setOtp(otp.intValue());
        authorizationData.setCitizen(entity);
        requestData.setAuth(authorizationData);
        requestData.setRegnum(regnum);
        requestData.setForUsage(forUsage);
        requestData.setUsage(usage);
        requestData.setYear(year);
        return requestData;
    }

    // Тээврийн хэрэгслийн оншилгооний мэдээлэл шалгах сервис
    public Object getVehicleInspectionInfo(String regnum, String cabinNumber,Organization organization, Long otp) {
        TransportService transportService = createTransportServiceXYP(organization);
        ServiceResponse serviceResponse = transportService.ws100409GetVehicleInspectionInfo(vehicleInspectionRequestData(regnum, cabinNumber, otp));
        return serviceResponse;
    }

    public VehicleInspectionRequestData vehicleInspectionRequestData(String regnum, String cabinNumber, Long otp){
        VehicleInspectionRequestData requestData = new VehicleInspectionRequestData();
        AuthorizationData authorizationData = new AuthorizationData();
        AuthorizationEntity entity = new AuthorizationEntity();
        entity.setRegnum(regnum);
        entity.setOtp(otp.intValue());
        authorizationData.setCitizen(entity);
        requestData.setAuth(authorizationData);
        requestData.setCabinNumber(cabinNumber);
        return requestData;
    }

    // Мэргэшсэн жолоочийн мэдээлэл дамжуулах сервис
    public Object specialDriverInfo(String regnum, Integer licenseNumber,Organization organization, Long otp) {
        TransportService transportService = createTransportServiceXYP(organization);
        ServiceResponse serviceResponse = transportService.ws100417SpecialDriverInfo(specialDriverRequestData(regnum, licenseNumber, otp));
        return serviceResponse;
    }
    public SpecialDriverRequestData specialDriverRequestData(String regnum, Integer licenseNumber, Long otp){
        SpecialDriverRequestData requestData = new SpecialDriverRequestData();
        AuthorizationData authorizationData = new AuthorizationData();
        AuthorizationEntity entity = new AuthorizationEntity();
        entity.setRegnum(regnum);
        entity.setOtp(otp.intValue());
        authorizationData.setCitizen(entity);
        requestData.setAuth(authorizationData);
        requestData.setRegnum(regnum);
        requestData.setLicenseNumber(licenseNumber);
        return requestData;
    }

    // Жолоочийн эрхийн мэдээлэл авах
    public Object getDriverLicenseInfo(String regnum, Organization organization, Long otp) {
        TransportService transportService = createTransportServiceXYP(organization);
        ServiceResponse serviceResponse = transportService.ws100407GetDriverLicenseInfo(serviceDriverLicenseInfoData(regnum, otp));
        return serviceResponse;
    }
    public ServiceDriverLicenseInfoData serviceDriverLicenseInfoData(String regnum, Long otp){
        ServiceDriverLicenseInfoData requestData = new ServiceDriverLicenseInfoData();
        AuthorizationData authorizationData = new AuthorizationData();
        AuthorizationEntity entity = new AuthorizationEntity();
        entity.setRegnum(regnum);
        entity.setOtp(otp.intValue());
        authorizationData.setCitizen(entity);
        requestData.setAuth(authorizationData);
        requestData.setRegnum(regnum);
        return requestData;
    }

    //  Галт зэвсэг эзэмших, өмчлөх эрхийн лавлагаа
    public Object getCitizenGunOwnerInfo(String regnum, String civilId,Organization organization, Long otp) {
        mn.gov.ema.emongolia.data.XypCitizen.CitizenService citizenService = createCitizenServiceXYP(organization);
        ServiceResponse serviceResponse = citizenService.ws100149GetCitizenGunOwnerInfo(citizenRequestData(regnum, civilId, otp));
        return serviceResponse;
    }

    // Галт зэвсэг эзэмших гэрчилгээний мэдээлэл
    public Object firearmOwnerCertificateInfo(String regnum,Organization organization, Long otp) {
        GovernmentService governmentService = createGovernmentServiceXYP(organization);
        ServiceResponse serviceResponse = governmentService.gs10019FirearmOwnerCertificateInfo(firearmOwnerCertificateRequestData(regnum, otp));
        return serviceResponse;
    }

    public FirearmOwnerCertificateRequestData firearmOwnerCertificateRequestData(String regnum, Long otp){
        FirearmOwnerCertificateRequestData requestData = new FirearmOwnerCertificateRequestData();
        AuthorizationData authorizationData = new AuthorizationData();
        AuthorizationEntity entity = new AuthorizationEntity();
        entity.setRegnum(regnum);
        entity.setOtp(otp.intValue());
        authorizationData.setCitizen(entity);
//        requestData.setAuth(authorizationData);
        requestData.setRegnum(regnum);
        return requestData;
    }

    // Тэжээгчээ алдсаны тэтгэвэр тогтоолтын хуудас
    public Object lostCaregiverPensionDocumentInfo(String regnum,Organization organization, Long otp) {
        InsuranceService insuranceService = createInsuranceServiceXYP(organization);
        ServiceResponse serviceResponse = insuranceService.ws100567LostCaregiverPensionDocumentInfo(checkIsInsuredRequestData(regnum, otp));
        return serviceResponse;
    }

    public CheckIsInsuredRequestData checkIsInsuredRequestData(String regnum, Long otp){
        CheckIsInsuredRequestData requestData = new CheckIsInsuredRequestData();
        AuthorizationData authorizationData = new AuthorizationData();
        AuthorizationEntity entity = new AuthorizationEntity();
        entity.setRegnum(regnum);
        entity.setOtp(otp.intValue());
        authorizationData.setCitizen(entity);
        requestData.setAuth(authorizationData);
        requestData.setRegnum(regnum);
        return requestData;
    }

    // Тэтгэвэр тогтоолтын хуудасны мэдээлэл авах
    public Object pensionDocumentInfo(String regnum,Organization organization, Long otp) {
        InsuranceService insuranceService = createInsuranceServiceXYP(organization);
        ServiceResponse serviceResponse = insuranceService.ws100564PensionDocumentInfo(checkIsInsuredRequestData(regnum, otp));
        return serviceResponse;
    }

    // Нийгмийн даатгалын шимтгэл төлөлтийн талаарх тодорхойлолт (англи)
    public Object getCitizenSalaryInfoEng(String regnum, Integer startYear, Integer endYear,Organization organization, Long otp) {
        InsuranceService insuranceService = createInsuranceServiceXYP(organization);
        ServiceResponse serviceResponse = insuranceService.ws100565GetCitizenSalaryInfoEng(insuranceCitizenRequestData(regnum, startYear, endYear, otp));
        return serviceResponse;
    }

    public InsuranceCitizenRequestData insuranceCitizenRequestData(String regnum, Integer startYear, Integer endYear, Long otp){
        InsuranceCitizenRequestData requestData = new InsuranceCitizenRequestData();
        AuthorizationData authorizationData = new AuthorizationData();
        AuthorizationEntity entity = new AuthorizationEntity();
        entity.setRegnum(regnum);
        entity.setOtp(otp.intValue());
        authorizationData.setCitizen(entity);
        requestData.setAuth(authorizationData);
        requestData.setRegnum(regnum);
        requestData.setStartYear(startYear);
        requestData.setEndYear(endYear);
        return requestData;
    }

    // Нийгмийн даатгал ажил олгогчийн мэдээлэл дамжуулах сервис
    public Object getEmployerInfo(String regnum, String siId, String orgRegId,Organization organization, Long otp) {
        InsuranceService insuranceService = createInsuranceServiceXYP(organization);
        ServiceResponse serviceResponse = insuranceService.ws100511GetEmployerInfo(employerRequestData(regnum, siId, orgRegId, otp));
        return serviceResponse;
    }

    public EmployerRequestData employerRequestData(String regnum, String siId, String orgRegId, Long otp){
        EmployerRequestData requestData = new EmployerRequestData();
        AuthorizationData authorizationData = new AuthorizationData();
        AuthorizationEntity entity = new AuthorizationEntity();
        entity.setRegnum(regnum);
        entity.setOtp(otp.intValue());
        authorizationData.setCitizen(entity);
        requestData.setAuth(authorizationData);
        requestData.setRegister(regnum);
        requestData.setSiId(siId);
        requestData.setOrgRegId(orgRegId);
        return requestData;
    }

    // 	Тэтгэвэрийн лавлагааны мэдээлэл дамжуулах сервис
    public Object getCitizenPensionInquiry(String regnum, Integer startYear, Integer endYear,Organization organization, Long otp) {
        InsuranceService insuranceService = createInsuranceServiceXYP(organization);
        ServiceResponse serviceResponse = insuranceService.ws100502GetCitizenPensionInquiry(insuranceCitizenRequestData(regnum, startYear, endYear, otp));
        return serviceResponse;
    }

    // Тэтгэврийн даатгалын шимтгэлийн нэрийн дансны лавлагаа
    public Object getSiWorkerAccountInfo(String regnum, Organization organization, Long otp) {
        InsuranceService insuranceService = createInsuranceServiceXYP(organization);
        ServiceResponse serviceResponse = insuranceService.ws100510GetSiWorkerAccountInfo(workHistoryRequestData(regnum, otp));
        return serviceResponse;
    }

    public WorkHistoryRequestData workHistoryRequestData(String regnum, Long otp){
        WorkHistoryRequestData requestData = new WorkHistoryRequestData();
        AuthorizationData authorizationData = new AuthorizationData();
        AuthorizationEntity entity = new AuthorizationEntity();
        entity.setRegnum(regnum);
        entity.setOtp(otp.intValue());
        authorizationData.setCitizen(entity);
        requestData.setAuth(authorizationData);
        requestData.setRegnum(regnum);
        return requestData;
    }


    // Хөдөлмөрийн чадвар алдсаны тэтгэвэр тогтоолтын хуудас
    public Object disabilityPensionDocumentInfo(String regnum,Organization organization, Long otp) {
        InsuranceService insuranceService = createInsuranceServiceXYP(organization);
        ServiceResponse serviceResponse = insuranceService.ws100566DisabilityPensionDocumentInfo(checkIsInsuredRequestData(regnum, otp));
        return serviceResponse;
    }

    // 	Иргэний нийгмийн даатгалын мэдээлэл дамжуулах сервис
    public Object getCitizenSalaryInfo(String regnum, Integer startYear, Integer endYear,Organization organization, Long otp) {
        InsuranceService insuranceService = createInsuranceServiceXYP(organization);
        ServiceResponse serviceResponse = insuranceService.ws100501GetCitizenSalaryInfo(insuranceCitizenRequestData(regnum, startYear, endYear, otp));
        return serviceResponse;
    }

    // Хүнсний эрхийн бичиг авах Хөдөө орон нутгийн 310 Нийслэлийн 292,5 оноог хангасан эсэх
    public Object checkHouseHoldFood(String regnum,Organization organization, Long otp) {
        InsuranceService insuranceService = createInsuranceServiceXYP(organization);
        ServiceResponse serviceResponse = insuranceService.ws100521CheckHouseHoldFood(checkMotherTimeRequestData(regnum, otp));
        return serviceResponse;
    }
    public CheckMotherTimeRequestData checkMotherTimeRequestData(String regnum, Long otp){
        CheckMotherTimeRequestData requestData = new CheckMotherTimeRequestData();
        AuthorizationData authorizationData = new AuthorizationData();
        AuthorizationEntity entity = new AuthorizationEntity();
        entity.setRegnum(regnum);
        entity.setOtp(otp.intValue());
        authorizationData.setCitizen(entity);
        requestData.setAuth(authorizationData);
        requestData.setRegnum(regnum);
        return requestData;
    }

    // Нийгмийн халамжийн дэмжлэг, туслалцаа зайлшгүй шаардлагатай өрхийн гишүүн иргэний 409,679 оноог хангасан эсэх
    public Object checkHouseHoldSC(String regnum,Organization organization, Long otp) {
        InsuranceService insuranceService = createInsuranceServiceXYP(organization);
        ServiceResponse serviceResponse = insuranceService.ws100522CheckHouseHoldSC(checkMotherTimeRequestData(regnum, otp));
        return serviceResponse;
    }

    // Хүүхдийн мөнгө авах 670 босго шугамыг хангасан эсэх
    public Object checkHouseHoldChild(String regnum,Organization organization, Long otp) {
        InsuranceService insuranceService = createInsuranceServiceXYP(organization);
        ServiceResponse serviceResponse = insuranceService.ws100520CheckHouseHoldChild(checkMotherTimeRequestData(regnum, otp));
        return serviceResponse;
    }

    // Хүүхдийн мөнгө шалгах
    public Object checkChildMoney(String regnum,Organization organization, Long otp) {
        InsuranceService insuranceService = createInsuranceServiceXYP(organization);
        ServiceResponse serviceResponse = insuranceService.ws100519CheckChildMoney(checkMotherTimeRequestData(regnum, otp));
        return serviceResponse;
    }

    // Эрүүл мэндийн даатгал шимтгэл төлөлт шалгах сервис
    public Object getInsuranceFee(String regnum, Organization organization, Long otp) {
        HealthService healthService =  createHealthServiceXYP(organization);
        ServiceResponse serviceResponse = healthService.ws300101GetInsuranceFee(registerRequestData(regnum, otp));
        return serviceResponse;
    }

    public RegisterRequestData registerRequestData(String regnum, Long otp){
        RegisterRequestData requestData = new RegisterRequestData();
        AuthorizationData authorizationData = new AuthorizationData();
        AuthorizationEntity entity = new AuthorizationEntity();
        entity.setRegnum(regnum);
        entity.setOtp(otp.intValue());
        authorizationData.setCitizen(entity);
        requestData.setAuth(authorizationData);
        requestData.setRegnum(regnum);
        return requestData;
    }

    // иргэний цусны бүлгийн мэдээлэл дуудах
    public Object getBloodTypeService(String regnum,Organization organization, Long otp) {
        HealthService healthService =  createHealthServiceXYP(organization);
        ServiceResponse serviceResponse = healthService.ws300116GetBloodTypeService(registerRequestData(regnum, otp));
        return serviceResponse;
    }

    // ковид-19 шинжилгээний хариу
    public Object covidPCRLastResultInfo(String regnum,Organization organization, Long otp) {
        HealthService healthService =  createHealthServiceXYP(organization);
        ServiceResponse serviceResponse = healthService.ws300118CovidPCRLastResultInfo(registerRequestData(regnum, otp));
        return serviceResponse;
    }

    // КОВИД-19 вакцины сертификатын мэдээлэл
    public Object covid19VaccineCertificate(String regnum, String civilId, Organization organization, Long otp) {
        mn.gov.ema.emongolia.data.XypCitizen.CitizenService citizenService = createCitizenServiceXYP(organization);
        ServiceResponse serviceResponse = citizenService.ws101118Covid19VaccineCertificate(covid19VaccineCertificateRequest(regnum, civilId, otp));
        return serviceResponse;
    }

    public Covid19VaccineCertificateRequest covid19VaccineCertificateRequest(String regnum, String civilId, Long otp){
        Covid19VaccineCertificateRequest requestData = new Covid19VaccineCertificateRequest();
        AuthorizationData authorizationData = new AuthorizationData();
        AuthorizationEntity entity = new AuthorizationEntity();
        entity.setRegnum(regnum);
        entity.setOtp(otp.intValue());
        authorizationData.setCitizen(entity);
        requestData.setAuth(authorizationData);
        requestData.setRegnum(regnum);
        requestData.setCivilId(civilId);
        return requestData;
    }

    // Хэрэглэгчийн дугаар болон нэгж талбарын дугаараар газартай холбоотой бүх мэдээлэл
    public Object landInfoByPersonIdAndParcelId(String regnum, String parcelId, String personId,Organization organization, Long otp) {
        PropertyService propertyService = createPropertyServiceXYP(organization);
        ServiceResponse serviceResponse = propertyService.ws100240LandInfoByPersonIdAndParcelId(landInfoByPersonParcelIdsRequestData(regnum, parcelId, personId, otp));
        return serviceResponse;
    }

    public LandInfoByPersonParcelIdsRequestData landInfoByPersonParcelIdsRequestData(String regnum, String parcelId, String personId, Long otp){
        LandInfoByPersonParcelIdsRequestData requestData = new LandInfoByPersonParcelIdsRequestData();
        AuthorizationData authorizationData = new AuthorizationData();
        AuthorizationEntity entity = new AuthorizationEntity();
        entity.setRegnum(regnum);
        entity.setOtp(otp.intValue());
        authorizationData.setCitizen(entity);
        requestData.setAuth(authorizationData);
        requestData.setParcelId(parcelId);
        requestData.setPersonId(personId);
        return requestData;
    }

    // Хэрэглэгчийн дугаар болон нэгж талбарын дугаараар газартай холбоотой бүх мэдээлэл
    public Object landRelatedInfoByParcelId(String regnum, String parcelId, String personId,Organization organization, Long otp) {
        PropertyService propertyService = createPropertyServiceXYP(organization);
        ServiceResponse serviceResponse = propertyService.ws100233LandRelatedInfoByParcelId(landRelatedInfoByParcelIdRequestData(regnum, parcelId, personId, otp));
        return serviceResponse;
    }

    public LandRelatedInfoByParcelIdRequestData landRelatedInfoByParcelIdRequestData(String regnum, String parcelId, String personId, Long otp){
        LandRelatedInfoByParcelIdRequestData requestData = new LandRelatedInfoByParcelIdRequestData();
        AuthorizationData authorizationData = new AuthorizationData();
        AuthorizationEntity entity = new AuthorizationEntity();
        entity.setRegnum(regnum);
        entity.setOtp(otp.intValue());
        authorizationData.setCitizen(entity);
        requestData.setAuth(authorizationData);
        requestData.setParcelId(parcelId);
        requestData.setPersonId(personId);
        return requestData;
    }

    // Кадастрын зураг авах
    public Object getCadastralMap(String regnum, String parcelId,Organization organization, Long otp) {
        PropertyService propertyService = createPropertyServiceXYP(organization);
        ServiceResponse serviceResponse = propertyService.ws100222GetCadastralMap(getCadastralMapRequestData(regnum, parcelId, otp));
        return serviceResponse;
    }

    public GetCadastralMapRequestData getCadastralMapRequestData(String regnum, String parcelId, Long otp){
        GetCadastralMapRequestData requestData = new GetCadastralMapRequestData();
        AuthorizationData authorizationData = new AuthorizationData();
        AuthorizationEntity entity = new AuthorizationEntity();
        entity.setRegnum(regnum);
        entity.setOtp(otp.intValue());
        authorizationData.setCitizen(entity);
        requestData.setAuth(authorizationData);
        requestData.setParcelId(parcelId);
        return requestData;
    }

    // Газрын төлбөр тооцоо нийлсэн акт
    public Object landSettlementAct(String regnum, String contractId, String personId,Organization organization, Long otp) {
        PropertyService propertyService = createPropertyServiceXYP(organization);
        ServiceResponse serviceResponse = propertyService.ws100241LandSettlementAct(landSettlementActRequestData(regnum, contractId, personId, otp));
        return serviceResponse;
    }

    public LandSettlementActRequestData landSettlementActRequestData(String regnum, String contractId, String personId, Long otp){
        LandSettlementActRequestData requestData = new LandSettlementActRequestData();
        AuthorizationData authorizationData = new AuthorizationData();
        AuthorizationEntity entity = new AuthorizationEntity();
        entity.setRegnum(regnum);
        entity.setOtp(otp.intValue());
        authorizationData.setCitizen(entity);
        requestData.setContractId(contractId);
        requestData.setPersonId(personId);
        requestData.setAuth(authorizationData);
        return requestData;
    }

    // Элсэлтийн ерөнхий шалгалтын лавлагаа
    public Object ueeReferenceService(String regnum, String civilId, Organization organization, Long otp) {
        EducationService educationService = createEducationServiceXYP(organization);
        ServiceResponse serviceResponse = educationService.ws400101UeeReferenceService(ueeReferenceRequestData(regnum, civilId, otp));
        return serviceResponse;
    }

    public UeeReferenceRequestData ueeReferenceRequestData(String regnum, String civilId, Long otp){
        UeeReferenceRequestData requestData = new UeeReferenceRequestData();
        AuthorizationData authorizationData = new AuthorizationData();
        AuthorizationEntity entity = new AuthorizationEntity();
        entity.setRegnum(regnum);
        entity.setOtp(otp.intValue());
        authorizationData.setCitizen(entity);
        requestData.setRegnum(regnum);
        requestData.setAuth(authorizationData);
        return requestData;
    }

    // Авто тээврийн хэрэгслийн улсын бүртгэлийн лавлагаа
    public Object getVehicleInfo(String regnum, String civilId, Organization organization, Long otp, String plateNumber) {
        TransportService transportService = createTransportServiceXYP(organization);
        ServiceResponse serviceResponse = transportService.ws100401GetVehicleInfo(vehicleRequestData(regnum, civilId, otp, plateNumber));
        return serviceResponse;
    }

    public VehicleRequestData vehicleRequestData(String regnum, String civilId, Long otp, String plateNumber){
        VehicleRequestData requestData = new VehicleRequestData();
        AuthorizationData authorizationData = new AuthorizationData();
        AuthorizationEntity entity = new AuthorizationEntity();
        entity.setRegnum(regnum);
        entity.setOtp(otp.intValue());
        authorizationData.setCitizen(entity);
        requestData.setRegnum(regnum);
        requestData.setCabinNumber(null);
        requestData.setPlateNumber(plateNumber);
        requestData.setCertificatNumber(null);
        requestData.setAuth(authorizationData);
        return requestData;
    }

    // Автотээврийн хэрэгсэл эзэмших, өмчлөх эрхийн лавлагаа (Иргэн одоо өмчилж байгаа)
    public Object getCitizenVehicleList(String regnum, String civilId, Organization organization, Long otp) {
        TransportService transportService = createTransportServiceXYP(organization);
        ServiceResponse serviceResponse = transportService.ws100406GetCitizenVehicleList(vehicleRequestData(regnum, civilId, otp, null));
        return serviceResponse;
    }

    // Автотээврийн хэрэгсэл эзэмших, өмчлөх эрхийн лавлагаа (Иргэн өмнө эзэмшиж байсан)
    public Object getPreOwnedVehicle(String regnum, String civilId, Organization organization, Long otp) {
        TransportService transportService = createTransportServiceXYP(organization);
        ServiceResponse serviceResponse = transportService.ws100421GetPreOwnedVehicle(vehicleRequestData(regnum, civilId, otp, null));
        return serviceResponse;
    }

    // Иргэний эрүүгийн хариуцлага хүлээж байгаа эсэх тодорхойлолт
    public Object citizenDoingCriminalLiabilitylInfo(String regnum, String civilId, Organization organization, Long otp) {
        mn.gov.ema.emongolia.data.XypCitizen.CitizenService citizenService = createCitizenServiceXYP(organization);
        ServiceResponse serviceResponse = citizenService.ws100174CitizenDoingCriminalLiabilitylInfo(citizenCriminalLiabilityRequestData(regnum, civilId, otp));
        return serviceResponse;
    }
    public CitizenCriminalLiabilityRequestData citizenCriminalLiabilityRequestData(String regnum, String civilId, Long otp){
        CitizenCriminalLiabilityRequestData requestData = new CitizenCriminalLiabilityRequestData();
        AuthorizationData authorizationData = new AuthorizationData();
        AuthorizationEntity entity = new AuthorizationEntity();
        entity.setRegnum(regnum);
        entity.setOtp(otp.intValue());
        authorizationData.setCitizen(entity);
        requestData.setRegnum(regnum);
        requestData.setAuth(authorizationData);
        return requestData;
    }

    // Иргэний эрүүгийн хариуцлага хүлээж байсан эсэх тодорхойлолт
    public Object citizenWasCriminalLiabilitylInfo(String regnum, String civilId, Organization organization, Long otp) {
        mn.gov.ema.emongolia.data.XypCitizen.CitizenService citizenService = createCitizenServiceXYP(organization);
        ServiceResponse serviceResponse = citizenService.ws100175CitizenWasCriminalLiabilitylInfo(citizenCriminalLiabilityRequestData(regnum, civilId, otp));
        return serviceResponse;
    }

    // Хуулийн этгээдийн эрүүгийн хариуцлага хүлээж байгаа эсэх тодорхойлолт
    public Object legalEntityDoingCriminalLiability(String regnum, Integer legalEntityNumber, Organization organization, Long otp) {
        LesService lesService = createLegalEntityServiceXYP(organization);
        ServiceResponse serviceResponse = lesService.ws100308LegalEntityDoingCriminalLiability(entityNumberData(regnum, legalEntityNumber, otp));
        return serviceResponse;
    }

    // Хуулийн этгээдийн эрүүгийн хариуцлага хүлээж байсан эсэх тодорхойлолт
    public Object legalEntityWasCriminalLiability(String regnum, Integer legalEntityNumber, Organization organization, Long otp) {
        LesService lesService = createLegalEntityServiceXYP(organization);
        ServiceResponse serviceResponse = lesService.ws100309LegalEntityWasCriminalLiability(entityNumberData(regnum, legalEntityNumber, otp));
        return serviceResponse;
    }

    // Шүүхийн шийдвэрээр бусдад төлбөргүй эсэх тодорхойлолт /иргэн/
    public Object getCitizenNonPaymentInfo(String regnum, String civilId, Organization organization, Long otp) {
        mn.gov.ema.emongolia.data.XypCitizen.CitizenService citizenService = createCitizenServiceXYP(organization);
        ServiceResponse serviceResponse = citizenService.ws100126GetCitizenNonPaymentInfo(citizenRequestData(regnum, civilId, otp));
        return serviceResponse;
    }

    // Бүрэн дунд боловсролын гэрчилгээний лавлагаа
    public Object getCitizenHighSchoolInfo(String regnum, String civilId, Organization organization, Long otp) {
        mn.gov.ema.emongolia.data.XypCitizen.CitizenService citizenService = createCitizenServiceXYP(organization);
        ServiceResponse serviceResponse = citizenService.ws100130GetCitizenHighSchoolInfo(citizenEducationRequestData(regnum, civilId, otp));
        return serviceResponse;
    }

    public CitizenEducationRequestData citizenEducationRequestData(String regnum, String civilId, Long otp){
        CitizenEducationRequestData requestData = new CitizenEducationRequestData();
        AuthorizationData authorizationData = new AuthorizationData();
        AuthorizationEntity entity = new AuthorizationEntity();
        entity.setRegnum(regnum);
        entity.setOtp(otp.intValue());
        authorizationData.setCitizen(entity);
        requestData.setRegnum(regnum);
        requestData.setAuth(authorizationData);
        return requestData;
    }

    // Суурь боловсролын гэрчилгээний лавлагаа
    public Object getCitizenMiddleSchoolInfo(String regnum, String civilId, Organization organization, Long otp) {
        mn.gov.ema.emongolia.data.XypCitizen.CitizenService citizenService = createCitizenServiceXYP(organization);
        ServiceResponse serviceResponse = citizenService.ws100131GetCitizenMiddleSchoolInfo(citizenEducationRequestData(regnum, civilId, otp));
        return serviceResponse;
    }

    // Иргэний дүүргэсэн дээд сургуулиудын жагсаалт
    public Object citizenGraduateSchoolList(String regnum, String civilId, Organization organization, Long otp) {
        mn.gov.ema.emongolia.data.XypCitizen.CitizenService citizenService = createCitizenServiceXYP(organization);
        ServiceResponse serviceResponse = citizenService.ws100155CitizenGraduateSchoolList(citizenEducationRequestData(regnum, civilId, otp));
        return serviceResponse;
    }

    // Дээд боловсролын сургалтын байгууллагын дипломын тодорхойлолт
    public Object citizenGraduateSchoolInfo(String regnum, String civilId, Organization organization, Long otp, String studentId) {
        mn.gov.ema.emongolia.data.XypCitizen.CitizenService citizenService = createCitizenServiceXYP(organization);
        ServiceResponse serviceResponse = citizenService.ws100156CitizenGraduateSchoolInfo(citizenGraduateSchoolRequestData(regnum, civilId, otp, studentId));
        return serviceResponse;
    }

    public CitizenGraduateSchoolRequestData citizenGraduateSchoolRequestData(String regnum, String civilId, Long otp, String studentId){
        CitizenGraduateSchoolRequestData requestData = new CitizenGraduateSchoolRequestData();
        AuthorizationData authorizationData = new AuthorizationData();
        AuthorizationEntity entity = new AuthorizationEntity();
        entity.setRegnum(regnum);
        entity.setOtp(otp.intValue());
        authorizationData.setCitizen(entity);
        requestData.setStudentID(studentId);
        requestData.setAuth(authorizationData);
        return requestData;
    }

    // Үл хөдлөх хөрөнгийн лавлагаа
    public Object getPropertyInfo(String regnum, String civilId, Organization organization, Long otp, String propertyNumber) {
        PropertyService propertyService = createPropertyServiceXYP(organization);
        ServiceResponse serviceResponse = propertyService.ws100201GetPropertyInfo(propertyRequestData(regnum, civilId, otp, propertyNumber));
        return serviceResponse;
    }


    public PropertyRequestData propertyRequestData(String regnum, String civilId, Long otp, String propertyNumber){
        PropertyRequestData requestData = new PropertyRequestData();
        AuthorizationData authorizationData = new AuthorizationData();
        AuthorizationEntity entity = new AuthorizationEntity();
        entity.setRegnum(regnum);
        entity.setOtp(otp.intValue());
        authorizationData.setCitizen(entity);
        requestData.setRegnum(regnum);
        requestData.setPropertyNumber(propertyNumber);
        requestData.setAuth(authorizationData);
        return requestData;
    }

    // Үл хөдлөх хөрөнгийн жагсаалтын лавлагаа
    public Object getPropertyList(String regnum, String civilId, Organization organization, Long otp) {
        PropertyService propertyService = createPropertyServiceXYP(organization);
        ServiceResponse serviceResponse = propertyService.ws100202GetPropertyList(servicePropertyListRequestData(regnum, civilId, otp));
        return serviceResponse;
    }

    public ServicePropertyListRequestData servicePropertyListRequestData(String regnum, String civilId, Long otp){
        ServicePropertyListRequestData requestData = new ServicePropertyListRequestData();
        AuthorizationData authorizationData = new AuthorizationData();
        AuthorizationEntity entity = new AuthorizationEntity();
        entity.setRegnum(regnum);
        entity.setOtp(otp.intValue());
        authorizationData.setCitizen(entity);
        requestData.setRegnum(regnum);
        requestData.setAuth(authorizationData);
        return requestData;
    }

    // Үл хөдлөх эд хөрөнгөтэй эсэх лавлагаа
    public Object isPropertyCheck(String regnum, String civilId, Organization organization, Long otp) {
        PropertyService propertyService = createPropertyServiceXYP(organization);
        ServiceResponse serviceResponse = propertyService.ws100203IsPropertyCheck(serviceIsPropertyCheckRequestData(regnum, civilId, otp));
        return serviceResponse;
    }

    public ServiceIsPropertyCheckRequestData serviceIsPropertyCheckRequestData(String regnum, String civilId, Long otp){
        ServiceIsPropertyCheckRequestData requestData = new ServiceIsPropertyCheckRequestData();
        AuthorizationData authorizationData = new AuthorizationData();
        AuthorizationEntity entity = new AuthorizationEntity();
        entity.setRegnum(regnum);
        entity.setOtp(otp.intValue());
        authorizationData.setCitizen(entity);
        requestData.setRegnum(regnum);
        requestData.setAuth(authorizationData);
        return requestData;
    }

    // Газар эзэмших, ашиглах, эрхийн гэрчилгээний мэдээлэл
    public Object landRelatedUsersInfo(String regnum, String civilId, Organization organization, Long otp) {
        PropertyService propertyService = createPropertyServiceXYP(organization);
        ServiceResponse serviceResponse = propertyService.ws100230LandRelatedUsersInfo(landOwningRequestData(regnum, civilId, otp));
        return serviceResponse;
    }

    public LandOwningRequestData landOwningRequestData(String regnum, String civilId, Long otp){
        LandOwningRequestData requestData = new LandOwningRequestData();
        AuthorizationData authorizationData = new AuthorizationData();
        AuthorizationEntity entity = new AuthorizationEntity();
        entity.setRegnum(regnum);
        entity.setOtp(otp.intValue());
        authorizationData.setCitizen(entity);
        requestData.setRegnum(regnum);
        requestData.setAuth(authorizationData);
        return requestData;
    }

    // Хур OTP сервис
    public Object registerOTPRequest(OtpModel model) {
        Organization organization = organizationDAO.findFirstByUuidAndOrgTypeAndStatusAndActiveFlag(model.getOrgUuid(), 0L, 1L, 1L);
        MetaService metaService = createMetaServiceNewXYP(organization);
        ServiceResponse serviceResponse = metaService.ws100008RegisterOTPRequest(registerOTPRequestData(model));
        return serviceResponse;
    }

    public RegisterOTPRequest registerOTPRequestData(OtpModel model){
        RegisterOTPRequest requestData = new RegisterOTPRequest();
        requestData.setRegnum(model.getRegnum());
        requestData.setIsApp(model.getIsApp());
        requestData.setPhoneNum(model.getPhoneNum() == null ? 0 : model.getPhoneNum());
        requestData.setIsSms(model.getIsSms());
        requestData.setIsEmail(model.getIsEmail());
        requestData.setIsKiosk(model.getIsKiosk());
        requestData.setJsonWSList(model.getJsonWSList());
        return requestData;
    }

    // Хур OTP шалгах сервис
    public Object checkOtp(String regnum, String otp, Long orgId) {
        Organization organization = organizationDAO.findFirstByIdAndStatusAndActiveFlag(orgId, 1L, 1L);
        MetaService metaService = createMetaServiceNewXYP(organization);
        ServiceResponse serviceResponse = metaService.ws100009CheckOtp(checkOtpRequestData(regnum, otp));
        return serviceResponse;
    }

    public CheckOtpRequestData checkOtpRequestData(String regnum, String otp){
        CheckOtpRequestData requestData = new CheckOtpRequestData();
        requestData.setRegnum(regnum);
        requestData.setOtp(otp);
        return requestData;
    }
}
