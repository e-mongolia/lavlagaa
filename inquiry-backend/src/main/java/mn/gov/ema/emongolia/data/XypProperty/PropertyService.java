
package mn.gov.ema.emongolia.data.XypProperty;

import mn.gov.ema.emongolia.data.ServiceResponse.ServiceResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PropertyService", targetNamespace = "http://property.xyp.gov.mn/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PropertyService {


    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100219_landOwningContractInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100219_landOwningContractInfo", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100219LandOwningContractInfo")
    @ResponseWrapper(localName = "WS100219_landOwningContractInfoResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100219LandOwningContractInfoResponse")
    public ServiceResponse ws100219LandOwningContractInfo(
        @WebParam(name = "request", targetNamespace = "")
        LandOwningRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100208_getPropertyInfoOnlyMinor")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100208_getPropertyInfoOnlyMinor", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100208GetPropertyInfoOnlyMinor")
    @ResponseWrapper(localName = "WS100208_getPropertyInfoOnlyMinorResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100208GetPropertyInfoOnlyMinorResponse")
    public ServiceResponse ws100208GetPropertyInfoOnlyMinor(
        @WebParam(name = "request", targetNamespace = "")
        PropertyRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100236_landCadastreQR")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100236_landCadastreQR", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100236LandCadastreQR")
    @ResponseWrapper(localName = "WS100236_landCadastreQRResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100236LandCadastreQRResponse")
    public ServiceResponse ws100236LandCadastreQR(
        @WebParam(name = "request", targetNamespace = "")
        CheckLandMortgageRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100206_insertLandDirectionInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100206_insertLandDirectionInfo", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100206InsertLandDirectionInfo")
    @ResponseWrapper(localName = "WS100206_insertLandDirectionInfoResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100206InsertLandDirectionInfoResponse")
    public ServiceResponse ws100206InsertLandDirectionInfo(
        @WebParam(name = "request", targetNamespace = "")
        LandDirectionRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100237_cadastreApplicantStatusInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100237_cadastreApplicantStatusInfo", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100237CadastreApplicantStatusInfo")
    @ResponseWrapper(localName = "WS100237_cadastreApplicantStatusInfoResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100237CadastreApplicantStatusInfoResponse")
    public ServiceResponse ws100237CadastreApplicantStatusInfo(
        @WebParam(name = "request", targetNamespace = "")
        CheckLandMortgageRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100221_landOwningDecisionInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100221_landOwningDecisionInfo", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100221LandOwningDecisionInfo")
    @ResponseWrapper(localName = "WS100221_landOwningDecisionInfoResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100221LandOwningDecisionInfoResponse")
    public ServiceResponse ws100221LandOwningDecisionInfo(
        @WebParam(name = "request", targetNamespace = "")
        LandOwningRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100231_landValuationInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100231_landValuationInfo", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100231LandValuationInfo")
    @ResponseWrapper(localName = "WS100231_landValuationInfoResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100231LandValuationInfoResponse")
    public ServiceResponse ws100231LandValuationInfo(
        @WebParam(name = "request", targetNamespace = "")
        CheckLandMortgageRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100223_getPropertyBasicInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100223_getPropertyBasicInfo", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100223GetPropertyBasicInfo")
    @ResponseWrapper(localName = "WS100223_getPropertyBasicInfoResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100223GetPropertyBasicInfoResponse")
    public ServiceResponse ws100223GetPropertyBasicInfo(
        @WebParam(name = "request", targetNamespace = "")
        GetPropertyBasicRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100232_landOwningInfoByPersonId")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100232_landOwningInfoByPersonId", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100232LandOwningInfoByPersonId")
    @ResponseWrapper(localName = "WS100232_landOwningInfoByPersonIdResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100232LandOwningInfoByPersonIdResponse")
    public ServiceResponse ws100232LandOwningInfoByPersonId(
        @WebParam(name = "request", targetNamespace = "")
        LandOwningInfoByPersonIdRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100227_landOfficialLetterInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100227_landOfficialLetterInfo", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100227LandOfficialLetterInfo")
    @ResponseWrapper(localName = "WS100227_landOfficialLetterInfoResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100227LandOfficialLetterInfoResponse")
    public ServiceResponse ws100227LandOfficialLetterInfo(
        @WebParam(name = "request", targetNamespace = "")
        CheckLandMortgageRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100229_addressListInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100229_addressListInfo", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100229AddressListInfo")
    @ResponseWrapper(localName = "WS100229_addressListInfoResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100229AddressListInfoResponse")
    public ServiceResponse ws100229AddressListInfo(
        @WebParam(name = "request", targetNamespace = "")
        AddressListRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100225_propertyValueInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100225_propertyValueInfo", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100225PropertyValueInfo")
    @ResponseWrapper(localName = "WS100225_propertyValueInfoResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100225PropertyValueInfoResponse")
    public ServiceResponse ws100225PropertyValueInfo(
        @WebParam(name = "request", targetNamespace = "")
        GetPropertyBasicRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100211_getCollateralPropertyInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100211_getCollateralPropertyInfo", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100211GetCollateralPropertyInfo")
    @ResponseWrapper(localName = "WS100211_getCollateralPropertyInfoResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100211GetCollateralPropertyInfoResponse")
    public ServiceResponse ws100211GetCollateralPropertyInfo(
        @WebParam(name = "request", targetNamespace = "")
        PropertyNumberRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100214_getPropertyInfoAddress")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100214_getPropertyInfoAddress", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100214GetPropertyInfoAddress")
    @ResponseWrapper(localName = "WS100214_getPropertyInfoAddressResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100214GetPropertyInfoAddressResponse")
    public ServiceResponse ws100214GetPropertyInfoAddress(
        @WebParam(name = "request", targetNamespace = "")
        PropertyAddressRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100202_getPropertyList")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100202_getPropertyList", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100202GetPropertyList")
    @ResponseWrapper(localName = "WS100202_getPropertyListResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100202GetPropertyListResponse")
    public ServiceResponse ws100202GetPropertyList(
        @WebParam(name = "request", targetNamespace = "")
        ServicePropertyListRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100210_getPropertyToObligateInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100210_getPropertyToObligateInfo", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100210GetPropertyToObligateInfo")
    @ResponseWrapper(localName = "WS100210_getPropertyToObligateInfoResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100210GetPropertyToObligateInfoResponse")
    public ServiceResponse ws100210GetPropertyToObligateInfo(
        @WebParam(name = "request", targetNamespace = "")
        PropertyToObligateRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100209_getPropertyOwnerMovedInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100209_getPropertyOwnerMovedInfo", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100209GetPropertyOwnerMovedInfo")
    @ResponseWrapper(localName = "WS100209_getPropertyOwnerMovedInfoResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100209GetPropertyOwnerMovedInfoResponse")
    public ServiceResponse ws100209GetPropertyOwnerMovedInfo(
        @WebParam(name = "request", targetNamespace = "")
        ServicePropertyListRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100233_landRelatedInfoByParcelId")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100233_landRelatedInfoByParcelId", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100233LandRelatedInfoByParcelId")
    @ResponseWrapper(localName = "WS100233_landRelatedInfoByParcelIdResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100233LandRelatedInfoByParcelIdResponse")
    public ServiceResponse ws100233LandRelatedInfoByParcelId(
        @WebParam(name = "request", targetNamespace = "")
        LandRelatedInfoByParcelIdRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100240_landInfoByPersonIdAndParcelId")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100240_landInfoByPersonIdAndParcelId", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100240LandInfoByPersonIdAndParcelId")
    @ResponseWrapper(localName = "WS100240_landInfoByPersonIdAndParcelIdResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100240LandInfoByPersonIdAndParcelIdResponse")
    public ServiceResponse ws100240LandInfoByPersonIdAndParcelId(
        @WebParam(name = "request", targetNamespace = "")
        LandInfoByPersonParcelIdsRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100213_getPropertyRentContractInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100213_getPropertyRentContractInfo", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100213GetPropertyRentContractInfo")
    @ResponseWrapper(localName = "WS100213_getPropertyRentContractInfoResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100213GetPropertyRentContractInfoResponse")
    public ServiceResponse ws100213GetPropertyRentContractInfo(
        @WebParam(name = "request", targetNamespace = "")
        PropertyNumberRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100204_insertLandOwningInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100204_insertLandOwningInfo", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100204InsertLandOwningInfo")
    @ResponseWrapper(localName = "WS100204_insertLandOwningInfoResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100204InsertLandOwningInfoResponse")
    public ServiceResponse ws100204InsertLandOwningInfo(
        @WebParam(name = "request", targetNamespace = "")
        LandOwningRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100215_insertHotelInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100215_insertHotelInfo", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100215InsertHotelInfo")
    @ResponseWrapper(localName = "WS100215_insertHotelInfoResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100215InsertHotelInfoResponse")
    public ServiceResponse ws100215InsertHotelInfo(
        @WebParam(name = "request", targetNamespace = "")
        ServiceInsertHotelInfoRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100205_insertLandSuitorInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100205_insertLandSuitorInfo", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100205InsertLandSuitorInfo")
    @ResponseWrapper(localName = "WS100205_insertLandSuitorInfoResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100205InsertLandSuitorInfoResponse")
    public ServiceResponse ws100205InsertLandSuitorInfo(
        @WebParam(name = "request", targetNamespace = "")
        LandSuitorRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100222_getCadastralMap")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100222_getCadastralMap", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100222GetCadastralMap")
    @ResponseWrapper(localName = "WS100222_getCadastralMapResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100222GetCadastralMapResponse")
    public ServiceResponse ws100222GetCadastralMap(
        @WebParam(name = "request", targetNamespace = "")
        GetCadastralMapRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100203_isPropertyCheck")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100203_isPropertyCheck", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100203IsPropertyCheck")
    @ResponseWrapper(localName = "WS100203_isPropertyCheckResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100203IsPropertyCheckResponse")
    public ServiceResponse ws100203IsPropertyCheck(
        @WebParam(name = "request", targetNamespace = "")
        ServiceIsPropertyCheckRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100218_landOwningCertificateInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100218_landOwningCertificateInfo", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100218LandOwningCertificateInfo")
    @ResponseWrapper(localName = "WS100218_landOwningCertificateInfoResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100218LandOwningCertificateInfoResponse")
    public ServiceResponse ws100218LandOwningCertificateInfo(
        @WebParam(name = "request", targetNamespace = "")
        LandOwningRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100241_landSettlementAct")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100241_landSettlementAct", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100241LandSettlementAct")
    @ResponseWrapper(localName = "WS100241_landSettlementActResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100241LandSettlementActResponse")
    public ServiceResponse ws100241LandSettlementAct(
        @WebParam(name = "request", targetNamespace = "")
        LandSettlementActRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100224_propertyInfoBetweenDate")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100224_propertyInfoBetweenDate", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100224PropertyInfoBetweenDate")
    @ResponseWrapper(localName = "WS100224_propertyInfoBetweenDateResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100224PropertyInfoBetweenDateResponse")
    public ServiceResponse ws100224PropertyInfoBetweenDate(
        @WebParam(name = "request", targetNamespace = "")
        PropertyInfoBetweenDateRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100228_addressMoreInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100228_addressMoreInfo", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100228AddressMoreInfo")
    @ResponseWrapper(localName = "WS100228_addressMoreInfoResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100228AddressMoreInfoResponse")
    public ServiceResponse ws100228AddressMoreInfo(
        @WebParam(name = "request", targetNamespace = "")
        AddressMoreRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100207_getApprovedLandRequestInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100207_getApprovedLandRequestInfo", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100207GetApprovedLandRequestInfo")
    @ResponseWrapper(localName = "WS100207_getApprovedLandRequestInfoResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100207GetApprovedLandRequestInfoResponse")
    public ServiceResponse ws100207GetApprovedLandRequestInfo(
        @WebParam(name = "request", targetNamespace = "")
        LandApprovedRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100201_getPropertyInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100201_getPropertyInfo", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100201GetPropertyInfo")
    @ResponseWrapper(localName = "WS100201_getPropertyInfoResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100201GetPropertyInfoResponse")
    public ServiceResponse ws100201GetPropertyInfo(
        @WebParam(name = "request", targetNamespace = "")
        PropertyRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100230_landRelatedUsersInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100230_landRelatedUsersInfo", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100230LandRelatedUsersInfo")
    @ResponseWrapper(localName = "WS100230_landRelatedUsersInfoResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100230LandRelatedUsersInfoResponse")
    public ServiceResponse ws100230LandRelatedUsersInfo(
        @WebParam(name = "request", targetNamespace = "")
        LandOwningRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100217_propertyLandOwnerInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100217_propertyLandOwnerInfo", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100217PropertyLandOwnerInfo")
    @ResponseWrapper(localName = "WS100217_propertyLandOwnerInfoResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100217PropertyLandOwnerInfoResponse")
    public ServiceResponse ws100217PropertyLandOwnerInfo(
        @WebParam(name = "request", targetNamespace = "")
        PropertyLandOwnerRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100238_landCadastreVicinityInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100238_landCadastreVicinityInfo", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100238LandCadastreVicinityInfo")
    @ResponseWrapper(localName = "WS100238_landCadastreVicinityInfoResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100238LandCadastreVicinityInfoResponse")
    public ServiceResponse ws100238LandCadastreVicinityInfo(
        @WebParam(name = "request", targetNamespace = "")
        CheckLandMortgageRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100212_getPropertyChangeOwnerInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100212_getPropertyChangeOwnerInfo", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100212GetPropertyChangeOwnerInfo")
    @ResponseWrapper(localName = "WS100212_getPropertyChangeOwnerInfoResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100212GetPropertyChangeOwnerInfoResponse")
    public ServiceResponse ws100212GetPropertyChangeOwnerInfo(
        @WebParam(name = "request", targetNamespace = "")
        PropertyNumberRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100226_checkLandMortgage")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100226_checkLandMortgage", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100226CheckLandMortgage")
    @ResponseWrapper(localName = "WS100226_checkLandMortgageResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100226CheckLandMortgageResponse")
    public ServiceResponse ws100226CheckLandMortgage(
        @WebParam(name = "request", targetNamespace = "")
        CheckLandMortgageRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100220_landCadastralMapInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100220_landCadastralMapInfo", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100220LandCadastralMapInfo")
    @ResponseWrapper(localName = "WS100220_landCadastralMapInfoResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100220LandCadastralMapInfoResponse")
    public ServiceResponse ws100220LandCadastralMapInfo(
        @WebParam(name = "request", targetNamespace = "")
        LandOwningRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100239_propertyDetailsBetweenDate")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100239_propertyDetailsBetweenDate", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100239PropertyDetailsBetweenDate")
    @ResponseWrapper(localName = "WS100239_propertyDetailsBetweenDateResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100239PropertyDetailsBetweenDateResponse")
    public ServiceResponse ws100239PropertyDetailsBetweenDate(
        @WebParam(name = "request", targetNamespace = "")
        PropertyInfoBetweenDateRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100235_landCadastreApplicantInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100235_landCadastreApplicantInfo", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100235LandCadastreApplicantInfo")
    @ResponseWrapper(localName = "WS100235_landCadastreApplicantInfoResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100235LandCadastreApplicantInfoResponse")
    public ServiceResponse ws100235LandCadastreApplicantInfo(
        @WebParam(name = "request", targetNamespace = "")
        CheckLandMortgageRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100234_landCadastreAgreementInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100234_landCadastreAgreementInfo", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100234LandCadastreAgreementInfo")
    @ResponseWrapper(localName = "WS100234_landCadastreAgreementInfoResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100234LandCadastreAgreementInfoResponse")
    public ServiceResponse ws100234LandCadastreAgreementInfo(
        @WebParam(name = "request", targetNamespace = "")
        CheckLandMortgageRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypProperty.ServiceResponse
     */
    @WebMethod(operationName = "WS100216_propertyRightsInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100216_propertyRightsInfo", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100216PropertyRightsInfo")
    @ResponseWrapper(localName = "WS100216_propertyRightsInfoResponse", targetNamespace = "http://property.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypProperty.WS100216PropertyRightsInfoResponse")
    public ServiceResponse ws100216PropertyRightsInfo(
        @WebParam(name = "request", targetNamespace = "")
        ServicePropertyListRequestData request);

}
