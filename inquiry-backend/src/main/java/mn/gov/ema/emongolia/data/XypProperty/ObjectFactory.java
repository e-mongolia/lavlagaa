
package mn.gov.ema.emongolia.data.XypProperty;

import mn.gov.ema.emongolia.data.AuthorizationData.AuthorizationData;
import mn.gov.ema.emongolia.data.AuthorizationData.AuthorizationEntity;
import mn.gov.ema.emongolia.data.ServiceResponse.ServiceResponse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mn.gov.itc.emongolia.data.XypProperty package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _WS100201GetPropertyInfo_QNAME = new QName("http://property.xyp.gov.mn/", "WS100201_getPropertyInfo");
    private final static QName _WS100201GetPropertyInfoResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100201_getPropertyInfoResponse");
    private final static QName _WS100202GetPropertyList_QNAME = new QName("http://property.xyp.gov.mn/", "WS100202_getPropertyList");
    private final static QName _WS100202GetPropertyListResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100202_getPropertyListResponse");
    private final static QName _WS100203IsPropertyCheck_QNAME = new QName("http://property.xyp.gov.mn/", "WS100203_isPropertyCheck");
    private final static QName _WS100203IsPropertyCheckResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100203_isPropertyCheckResponse");
    private final static QName _WS100204InsertLandOwningInfo_QNAME = new QName("http://property.xyp.gov.mn/", "WS100204_insertLandOwningInfo");
    private final static QName _WS100204InsertLandOwningInfoResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100204_insertLandOwningInfoResponse");
    private final static QName _WS100205InsertLandSuitorInfo_QNAME = new QName("http://property.xyp.gov.mn/", "WS100205_insertLandSuitorInfo");
    private final static QName _WS100205InsertLandSuitorInfoResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100205_insertLandSuitorInfoResponse");
    private final static QName _WS100206InsertLandDirectionInfo_QNAME = new QName("http://property.xyp.gov.mn/", "WS100206_insertLandDirectionInfo");
    private final static QName _WS100206InsertLandDirectionInfoResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100206_insertLandDirectionInfoResponse");
    private final static QName _WS100207GetApprovedLandRequestInfo_QNAME = new QName("http://property.xyp.gov.mn/", "WS100207_getApprovedLandRequestInfo");
    private final static QName _WS100207GetApprovedLandRequestInfoResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100207_getApprovedLandRequestInfoResponse");
    private final static QName _WS100208GetPropertyInfoOnlyMinor_QNAME = new QName("http://property.xyp.gov.mn/", "WS100208_getPropertyInfoOnlyMinor");
    private final static QName _WS100208GetPropertyInfoOnlyMinorResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100208_getPropertyInfoOnlyMinorResponse");
    private final static QName _WS100209GetPropertyOwnerMovedInfo_QNAME = new QName("http://property.xyp.gov.mn/", "WS100209_getPropertyOwnerMovedInfo");
    private final static QName _WS100209GetPropertyOwnerMovedInfoResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100209_getPropertyOwnerMovedInfoResponse");
    private final static QName _WS100210GetPropertyToObligateInfo_QNAME = new QName("http://property.xyp.gov.mn/", "WS100210_getPropertyToObligateInfo");
    private final static QName _WS100210GetPropertyToObligateInfoResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100210_getPropertyToObligateInfoResponse");
    private final static QName _WS100211GetCollateralPropertyInfo_QNAME = new QName("http://property.xyp.gov.mn/", "WS100211_getCollateralPropertyInfo");
    private final static QName _WS100211GetCollateralPropertyInfoResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100211_getCollateralPropertyInfoResponse");
    private final static QName _WS100212GetPropertyChangeOwnerInfo_QNAME = new QName("http://property.xyp.gov.mn/", "WS100212_getPropertyChangeOwnerInfo");
    private final static QName _WS100212GetPropertyChangeOwnerInfoResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100212_getPropertyChangeOwnerInfoResponse");
    private final static QName _WS100213GetPropertyRentContractInfo_QNAME = new QName("http://property.xyp.gov.mn/", "WS100213_getPropertyRentContractInfo");
    private final static QName _WS100213GetPropertyRentContractInfoResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100213_getPropertyRentContractInfoResponse");
    private final static QName _WS100214GetPropertyInfoAddress_QNAME = new QName("http://property.xyp.gov.mn/", "WS100214_getPropertyInfoAddress");
    private final static QName _WS100214GetPropertyInfoAddressResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100214_getPropertyInfoAddressResponse");
    private final static QName _WS100215InsertHotelInfo_QNAME = new QName("http://property.xyp.gov.mn/", "WS100215_insertHotelInfo");
    private final static QName _WS100215InsertHotelInfoResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100215_insertHotelInfoResponse");
    private final static QName _WS100216PropertyRightsInfo_QNAME = new QName("http://property.xyp.gov.mn/", "WS100216_propertyRightsInfo");
    private final static QName _WS100216PropertyRightsInfoResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100216_propertyRightsInfoResponse");
    private final static QName _WS100217PropertyLandOwnerInfo_QNAME = new QName("http://property.xyp.gov.mn/", "WS100217_propertyLandOwnerInfo");
    private final static QName _WS100217PropertyLandOwnerInfoResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100217_propertyLandOwnerInfoResponse");
    private final static QName _WS100218LandOwningCertificateInfo_QNAME = new QName("http://property.xyp.gov.mn/", "WS100218_landOwningCertificateInfo");
    private final static QName _WS100218LandOwningCertificateInfoResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100218_landOwningCertificateInfoResponse");
    private final static QName _WS100219LandOwningContractInfo_QNAME = new QName("http://property.xyp.gov.mn/", "WS100219_landOwningContractInfo");
    private final static QName _WS100219LandOwningContractInfoResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100219_landOwningContractInfoResponse");
    private final static QName _WS100220LandCadastralMapInfo_QNAME = new QName("http://property.xyp.gov.mn/", "WS100220_landCadastralMapInfo");
    private final static QName _WS100220LandCadastralMapInfoResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100220_landCadastralMapInfoResponse");
    private final static QName _WS100221LandOwningDecisionInfo_QNAME = new QName("http://property.xyp.gov.mn/", "WS100221_landOwningDecisionInfo");
    private final static QName _WS100221LandOwningDecisionInfoResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100221_landOwningDecisionInfoResponse");
    private final static QName _WS100222GetCadastralMap_QNAME = new QName("http://property.xyp.gov.mn/", "WS100222_getCadastralMap");
    private final static QName _WS100222GetCadastralMapResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100222_getCadastralMapResponse");
    private final static QName _WS100223GetPropertyBasicInfo_QNAME = new QName("http://property.xyp.gov.mn/", "WS100223_getPropertyBasicInfo");
    private final static QName _WS100223GetPropertyBasicInfoResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100223_getPropertyBasicInfoResponse");
    private final static QName _WS100224PropertyInfoBetweenDate_QNAME = new QName("http://property.xyp.gov.mn/", "WS100224_propertyInfoBetweenDate");
    private final static QName _WS100224PropertyInfoBetweenDateResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100224_propertyInfoBetweenDateResponse");
    private final static QName _WS100225PropertyValueInfo_QNAME = new QName("http://property.xyp.gov.mn/", "WS100225_propertyValueInfo");
    private final static QName _WS100225PropertyValueInfoResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100225_propertyValueInfoResponse");
    private final static QName _WS100226CheckLandMortgage_QNAME = new QName("http://property.xyp.gov.mn/", "WS100226_checkLandMortgage");
    private final static QName _WS100226CheckLandMortgageResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100226_checkLandMortgageResponse");
    private final static QName _WS100227LandOfficialLetterInfo_QNAME = new QName("http://property.xyp.gov.mn/", "WS100227_landOfficialLetterInfo");
    private final static QName _WS100227LandOfficialLetterInfoResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100227_landOfficialLetterInfoResponse");
    private final static QName _WS100228AddressMoreInfo_QNAME = new QName("http://property.xyp.gov.mn/", "WS100228_addressMoreInfo");
    private final static QName _WS100228AddressMoreInfoResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100228_addressMoreInfoResponse");
    private final static QName _WS100229AddressListInfo_QNAME = new QName("http://property.xyp.gov.mn/", "WS100229_addressListInfo");
    private final static QName _WS100229AddressListInfoResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100229_addressListInfoResponse");
    private final static QName _WS100230LandRelatedUsersInfo_QNAME = new QName("http://property.xyp.gov.mn/", "WS100230_landRelatedUsersInfo");
    private final static QName _WS100230LandRelatedUsersInfoResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100230_landRelatedUsersInfoResponse");
    private final static QName _WS100231LandValuationInfo_QNAME = new QName("http://property.xyp.gov.mn/", "WS100231_landValuationInfo");
    private final static QName _WS100231LandValuationInfoResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100231_landValuationInfoResponse");
    private final static QName _WS100232LandOwningInfoByPersonId_QNAME = new QName("http://property.xyp.gov.mn/", "WS100232_landOwningInfoByPersonId");
    private final static QName _WS100232LandOwningInfoByPersonIdResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100232_landOwningInfoByPersonIdResponse");
    private final static QName _WS100233LandRelatedInfoByParcelId_QNAME = new QName("http://property.xyp.gov.mn/", "WS100233_landRelatedInfoByParcelId");
    private final static QName _WS100233LandRelatedInfoByParcelIdResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100233_landRelatedInfoByParcelIdResponse");
    private final static QName _WS100234LandCadastreAgreementInfo_QNAME = new QName("http://property.xyp.gov.mn/", "WS100234_landCadastreAgreementInfo");
    private final static QName _WS100234LandCadastreAgreementInfoResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100234_landCadastreAgreementInfoResponse");
    private final static QName _WS100235LandCadastreApplicantInfo_QNAME = new QName("http://property.xyp.gov.mn/", "WS100235_landCadastreApplicantInfo");
    private final static QName _WS100235LandCadastreApplicantInfoResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100235_landCadastreApplicantInfoResponse");
    private final static QName _WS100236LandCadastreQR_QNAME = new QName("http://property.xyp.gov.mn/", "WS100236_landCadastreQR");
    private final static QName _WS100236LandCadastreQRResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100236_landCadastreQRResponse");
    private final static QName _WS100237CadastreApplicantStatusInfo_QNAME = new QName("http://property.xyp.gov.mn/", "WS100237_cadastreApplicantStatusInfo");
    private final static QName _WS100237CadastreApplicantStatusInfoResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100237_cadastreApplicantStatusInfoResponse");
    private final static QName _WS100238LandCadastreVicinityInfo_QNAME = new QName("http://property.xyp.gov.mn/", "WS100238_landCadastreVicinityInfo");
    private final static QName _WS100238LandCadastreVicinityInfoResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100238_landCadastreVicinityInfoResponse");
    private final static QName _WS100239PropertyDetailsBetweenDate_QNAME = new QName("http://property.xyp.gov.mn/", "WS100239_propertyDetailsBetweenDate");
    private final static QName _WS100239PropertyDetailsBetweenDateResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100239_propertyDetailsBetweenDateResponse");
    private final static QName _WS100240LandInfoByPersonIdAndParcelId_QNAME = new QName("http://property.xyp.gov.mn/", "WS100240_landInfoByPersonIdAndParcelId");
    private final static QName _WS100240LandInfoByPersonIdAndParcelIdResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100240_landInfoByPersonIdAndParcelIdResponse");
    private final static QName _WS100241LandSettlementAct_QNAME = new QName("http://property.xyp.gov.mn/", "WS100241_landSettlementAct");
    private final static QName _WS100241LandSettlementActResponse_QNAME = new QName("http://property.xyp.gov.mn/", "WS100241_landSettlementActResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mn.gov.itc.emongolia.data.XypProperty
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WS100201GetPropertyInfo }
     * 
     */
    public WS100201GetPropertyInfo createWS100201GetPropertyInfo() {
        return new WS100201GetPropertyInfo();
    }

    /**
     * Create an instance of {@link WS100201GetPropertyInfoResponse }
     * 
     */
    public WS100201GetPropertyInfoResponse createWS100201GetPropertyInfoResponse() {
        return new WS100201GetPropertyInfoResponse();
    }

    /**
     * Create an instance of {@link WS100202GetPropertyList }
     * 
     */
    public WS100202GetPropertyList createWS100202GetPropertyList() {
        return new WS100202GetPropertyList();
    }

    /**
     * Create an instance of {@link WS100202GetPropertyListResponse }
     * 
     */
    public WS100202GetPropertyListResponse createWS100202GetPropertyListResponse() {
        return new WS100202GetPropertyListResponse();
    }

    /**
     * Create an instance of {@link WS100203IsPropertyCheck }
     * 
     */
    public WS100203IsPropertyCheck createWS100203IsPropertyCheck() {
        return new WS100203IsPropertyCheck();
    }

    /**
     * Create an instance of {@link WS100203IsPropertyCheckResponse }
     * 
     */
    public WS100203IsPropertyCheckResponse createWS100203IsPropertyCheckResponse() {
        return new WS100203IsPropertyCheckResponse();
    }

    /**
     * Create an instance of {@link WS100204InsertLandOwningInfo }
     * 
     */
    public WS100204InsertLandOwningInfo createWS100204InsertLandOwningInfo() {
        return new WS100204InsertLandOwningInfo();
    }

    /**
     * Create an instance of {@link WS100204InsertLandOwningInfoResponse }
     * 
     */
    public WS100204InsertLandOwningInfoResponse createWS100204InsertLandOwningInfoResponse() {
        return new WS100204InsertLandOwningInfoResponse();
    }

    /**
     * Create an instance of {@link WS100205InsertLandSuitorInfo }
     * 
     */
    public WS100205InsertLandSuitorInfo createWS100205InsertLandSuitorInfo() {
        return new WS100205InsertLandSuitorInfo();
    }

    /**
     * Create an instance of {@link WS100205InsertLandSuitorInfoResponse }
     * 
     */
    public WS100205InsertLandSuitorInfoResponse createWS100205InsertLandSuitorInfoResponse() {
        return new WS100205InsertLandSuitorInfoResponse();
    }

    /**
     * Create an instance of {@link WS100206InsertLandDirectionInfo }
     * 
     */
    public WS100206InsertLandDirectionInfo createWS100206InsertLandDirectionInfo() {
        return new WS100206InsertLandDirectionInfo();
    }

    /**
     * Create an instance of {@link WS100206InsertLandDirectionInfoResponse }
     * 
     */
    public WS100206InsertLandDirectionInfoResponse createWS100206InsertLandDirectionInfoResponse() {
        return new WS100206InsertLandDirectionInfoResponse();
    }

    /**
     * Create an instance of {@link WS100207GetApprovedLandRequestInfo }
     * 
     */
    public WS100207GetApprovedLandRequestInfo createWS100207GetApprovedLandRequestInfo() {
        return new WS100207GetApprovedLandRequestInfo();
    }

    /**
     * Create an instance of {@link WS100207GetApprovedLandRequestInfoResponse }
     * 
     */
    public WS100207GetApprovedLandRequestInfoResponse createWS100207GetApprovedLandRequestInfoResponse() {
        return new WS100207GetApprovedLandRequestInfoResponse();
    }

    /**
     * Create an instance of {@link WS100208GetPropertyInfoOnlyMinor }
     * 
     */
    public WS100208GetPropertyInfoOnlyMinor createWS100208GetPropertyInfoOnlyMinor() {
        return new WS100208GetPropertyInfoOnlyMinor();
    }

    /**
     * Create an instance of {@link WS100208GetPropertyInfoOnlyMinorResponse }
     * 
     */
    public WS100208GetPropertyInfoOnlyMinorResponse createWS100208GetPropertyInfoOnlyMinorResponse() {
        return new WS100208GetPropertyInfoOnlyMinorResponse();
    }

    /**
     * Create an instance of {@link WS100209GetPropertyOwnerMovedInfo }
     * 
     */
    public WS100209GetPropertyOwnerMovedInfo createWS100209GetPropertyOwnerMovedInfo() {
        return new WS100209GetPropertyOwnerMovedInfo();
    }

    /**
     * Create an instance of {@link WS100209GetPropertyOwnerMovedInfoResponse }
     * 
     */
    public WS100209GetPropertyOwnerMovedInfoResponse createWS100209GetPropertyOwnerMovedInfoResponse() {
        return new WS100209GetPropertyOwnerMovedInfoResponse();
    }

    /**
     * Create an instance of {@link WS100210GetPropertyToObligateInfo }
     * 
     */
    public WS100210GetPropertyToObligateInfo createWS100210GetPropertyToObligateInfo() {
        return new WS100210GetPropertyToObligateInfo();
    }

    /**
     * Create an instance of {@link WS100210GetPropertyToObligateInfoResponse }
     * 
     */
    public WS100210GetPropertyToObligateInfoResponse createWS100210GetPropertyToObligateInfoResponse() {
        return new WS100210GetPropertyToObligateInfoResponse();
    }

    /**
     * Create an instance of {@link WS100211GetCollateralPropertyInfo }
     * 
     */
    public WS100211GetCollateralPropertyInfo createWS100211GetCollateralPropertyInfo() {
        return new WS100211GetCollateralPropertyInfo();
    }

    /**
     * Create an instance of {@link WS100211GetCollateralPropertyInfoResponse }
     * 
     */
    public WS100211GetCollateralPropertyInfoResponse createWS100211GetCollateralPropertyInfoResponse() {
        return new WS100211GetCollateralPropertyInfoResponse();
    }

    /**
     * Create an instance of {@link WS100212GetPropertyChangeOwnerInfo }
     * 
     */
    public WS100212GetPropertyChangeOwnerInfo createWS100212GetPropertyChangeOwnerInfo() {
        return new WS100212GetPropertyChangeOwnerInfo();
    }

    /**
     * Create an instance of {@link WS100212GetPropertyChangeOwnerInfoResponse }
     * 
     */
    public WS100212GetPropertyChangeOwnerInfoResponse createWS100212GetPropertyChangeOwnerInfoResponse() {
        return new WS100212GetPropertyChangeOwnerInfoResponse();
    }

    /**
     * Create an instance of {@link WS100213GetPropertyRentContractInfo }
     * 
     */
    public WS100213GetPropertyRentContractInfo createWS100213GetPropertyRentContractInfo() {
        return new WS100213GetPropertyRentContractInfo();
    }

    /**
     * Create an instance of {@link WS100213GetPropertyRentContractInfoResponse }
     * 
     */
    public WS100213GetPropertyRentContractInfoResponse createWS100213GetPropertyRentContractInfoResponse() {
        return new WS100213GetPropertyRentContractInfoResponse();
    }

    /**
     * Create an instance of {@link WS100214GetPropertyInfoAddress }
     * 
     */
    public WS100214GetPropertyInfoAddress createWS100214GetPropertyInfoAddress() {
        return new WS100214GetPropertyInfoAddress();
    }

    /**
     * Create an instance of {@link WS100214GetPropertyInfoAddressResponse }
     * 
     */
    public WS100214GetPropertyInfoAddressResponse createWS100214GetPropertyInfoAddressResponse() {
        return new WS100214GetPropertyInfoAddressResponse();
    }

    /**
     * Create an instance of {@link WS100215InsertHotelInfo }
     * 
     */
    public WS100215InsertHotelInfo createWS100215InsertHotelInfo() {
        return new WS100215InsertHotelInfo();
    }

    /**
     * Create an instance of {@link WS100215InsertHotelInfoResponse }
     * 
     */
    public WS100215InsertHotelInfoResponse createWS100215InsertHotelInfoResponse() {
        return new WS100215InsertHotelInfoResponse();
    }

    /**
     * Create an instance of {@link WS100216PropertyRightsInfo }
     * 
     */
    public WS100216PropertyRightsInfo createWS100216PropertyRightsInfo() {
        return new WS100216PropertyRightsInfo();
    }

    /**
     * Create an instance of {@link WS100216PropertyRightsInfoResponse }
     * 
     */
    public WS100216PropertyRightsInfoResponse createWS100216PropertyRightsInfoResponse() {
        return new WS100216PropertyRightsInfoResponse();
    }

    /**
     * Create an instance of {@link WS100217PropertyLandOwnerInfo }
     * 
     */
    public WS100217PropertyLandOwnerInfo createWS100217PropertyLandOwnerInfo() {
        return new WS100217PropertyLandOwnerInfo();
    }

    /**
     * Create an instance of {@link WS100217PropertyLandOwnerInfoResponse }
     * 
     */
    public WS100217PropertyLandOwnerInfoResponse createWS100217PropertyLandOwnerInfoResponse() {
        return new WS100217PropertyLandOwnerInfoResponse();
    }

    /**
     * Create an instance of {@link WS100218LandOwningCertificateInfo }
     * 
     */
    public WS100218LandOwningCertificateInfo createWS100218LandOwningCertificateInfo() {
        return new WS100218LandOwningCertificateInfo();
    }

    /**
     * Create an instance of {@link WS100218LandOwningCertificateInfoResponse }
     * 
     */
    public WS100218LandOwningCertificateInfoResponse createWS100218LandOwningCertificateInfoResponse() {
        return new WS100218LandOwningCertificateInfoResponse();
    }

    /**
     * Create an instance of {@link WS100219LandOwningContractInfo }
     * 
     */
    public WS100219LandOwningContractInfo createWS100219LandOwningContractInfo() {
        return new WS100219LandOwningContractInfo();
    }

    /**
     * Create an instance of {@link WS100219LandOwningContractInfoResponse }
     * 
     */
    public WS100219LandOwningContractInfoResponse createWS100219LandOwningContractInfoResponse() {
        return new WS100219LandOwningContractInfoResponse();
    }

    /**
     * Create an instance of {@link WS100220LandCadastralMapInfo }
     * 
     */
    public WS100220LandCadastralMapInfo createWS100220LandCadastralMapInfo() {
        return new WS100220LandCadastralMapInfo();
    }

    /**
     * Create an instance of {@link WS100220LandCadastralMapInfoResponse }
     * 
     */
    public WS100220LandCadastralMapInfoResponse createWS100220LandCadastralMapInfoResponse() {
        return new WS100220LandCadastralMapInfoResponse();
    }

    /**
     * Create an instance of {@link WS100221LandOwningDecisionInfo }
     * 
     */
    public WS100221LandOwningDecisionInfo createWS100221LandOwningDecisionInfo() {
        return new WS100221LandOwningDecisionInfo();
    }

    /**
     * Create an instance of {@link WS100221LandOwningDecisionInfoResponse }
     * 
     */
    public WS100221LandOwningDecisionInfoResponse createWS100221LandOwningDecisionInfoResponse() {
        return new WS100221LandOwningDecisionInfoResponse();
    }

    /**
     * Create an instance of {@link WS100222GetCadastralMap }
     * 
     */
    public WS100222GetCadastralMap createWS100222GetCadastralMap() {
        return new WS100222GetCadastralMap();
    }

    /**
     * Create an instance of {@link WS100222GetCadastralMapResponse }
     * 
     */
    public WS100222GetCadastralMapResponse createWS100222GetCadastralMapResponse() {
        return new WS100222GetCadastralMapResponse();
    }

    /**
     * Create an instance of {@link WS100223GetPropertyBasicInfo }
     * 
     */
    public WS100223GetPropertyBasicInfo createWS100223GetPropertyBasicInfo() {
        return new WS100223GetPropertyBasicInfo();
    }

    /**
     * Create an instance of {@link WS100223GetPropertyBasicInfoResponse }
     * 
     */
    public WS100223GetPropertyBasicInfoResponse createWS100223GetPropertyBasicInfoResponse() {
        return new WS100223GetPropertyBasicInfoResponse();
    }

    /**
     * Create an instance of {@link WS100224PropertyInfoBetweenDate }
     * 
     */
    public WS100224PropertyInfoBetweenDate createWS100224PropertyInfoBetweenDate() {
        return new WS100224PropertyInfoBetweenDate();
    }

    /**
     * Create an instance of {@link WS100224PropertyInfoBetweenDateResponse }
     * 
     */
    public WS100224PropertyInfoBetweenDateResponse createWS100224PropertyInfoBetweenDateResponse() {
        return new WS100224PropertyInfoBetweenDateResponse();
    }

    /**
     * Create an instance of {@link WS100225PropertyValueInfo }
     * 
     */
    public WS100225PropertyValueInfo createWS100225PropertyValueInfo() {
        return new WS100225PropertyValueInfo();
    }

    /**
     * Create an instance of {@link WS100225PropertyValueInfoResponse }
     * 
     */
    public WS100225PropertyValueInfoResponse createWS100225PropertyValueInfoResponse() {
        return new WS100225PropertyValueInfoResponse();
    }

    /**
     * Create an instance of {@link WS100226CheckLandMortgage }
     * 
     */
    public WS100226CheckLandMortgage createWS100226CheckLandMortgage() {
        return new WS100226CheckLandMortgage();
    }

    /**
     * Create an instance of {@link WS100226CheckLandMortgageResponse }
     * 
     */
    public WS100226CheckLandMortgageResponse createWS100226CheckLandMortgageResponse() {
        return new WS100226CheckLandMortgageResponse();
    }

    /**
     * Create an instance of {@link WS100227LandOfficialLetterInfo }
     * 
     */
    public WS100227LandOfficialLetterInfo createWS100227LandOfficialLetterInfo() {
        return new WS100227LandOfficialLetterInfo();
    }

    /**
     * Create an instance of {@link WS100227LandOfficialLetterInfoResponse }
     * 
     */
    public WS100227LandOfficialLetterInfoResponse createWS100227LandOfficialLetterInfoResponse() {
        return new WS100227LandOfficialLetterInfoResponse();
    }

    /**
     * Create an instance of {@link WS100228AddressMoreInfo }
     * 
     */
    public WS100228AddressMoreInfo createWS100228AddressMoreInfo() {
        return new WS100228AddressMoreInfo();
    }

    /**
     * Create an instance of {@link WS100228AddressMoreInfoResponse }
     * 
     */
    public WS100228AddressMoreInfoResponse createWS100228AddressMoreInfoResponse() {
        return new WS100228AddressMoreInfoResponse();
    }

    /**
     * Create an instance of {@link WS100229AddressListInfo }
     * 
     */
    public WS100229AddressListInfo createWS100229AddressListInfo() {
        return new WS100229AddressListInfo();
    }

    /**
     * Create an instance of {@link WS100229AddressListInfoResponse }
     * 
     */
    public WS100229AddressListInfoResponse createWS100229AddressListInfoResponse() {
        return new WS100229AddressListInfoResponse();
    }

    /**
     * Create an instance of {@link WS100230LandRelatedUsersInfo }
     * 
     */
    public WS100230LandRelatedUsersInfo createWS100230LandRelatedUsersInfo() {
        return new WS100230LandRelatedUsersInfo();
    }

    /**
     * Create an instance of {@link WS100230LandRelatedUsersInfoResponse }
     * 
     */
    public WS100230LandRelatedUsersInfoResponse createWS100230LandRelatedUsersInfoResponse() {
        return new WS100230LandRelatedUsersInfoResponse();
    }

    /**
     * Create an instance of {@link WS100231LandValuationInfo }
     * 
     */
    public WS100231LandValuationInfo createWS100231LandValuationInfo() {
        return new WS100231LandValuationInfo();
    }

    /**
     * Create an instance of {@link WS100231LandValuationInfoResponse }
     * 
     */
    public WS100231LandValuationInfoResponse createWS100231LandValuationInfoResponse() {
        return new WS100231LandValuationInfoResponse();
    }

    /**
     * Create an instance of {@link WS100232LandOwningInfoByPersonId }
     * 
     */
    public WS100232LandOwningInfoByPersonId createWS100232LandOwningInfoByPersonId() {
        return new WS100232LandOwningInfoByPersonId();
    }

    /**
     * Create an instance of {@link WS100232LandOwningInfoByPersonIdResponse }
     * 
     */
    public WS100232LandOwningInfoByPersonIdResponse createWS100232LandOwningInfoByPersonIdResponse() {
        return new WS100232LandOwningInfoByPersonIdResponse();
    }

    /**
     * Create an instance of {@link WS100233LandRelatedInfoByParcelId }
     * 
     */
    public WS100233LandRelatedInfoByParcelId createWS100233LandRelatedInfoByParcelId() {
        return new WS100233LandRelatedInfoByParcelId();
    }

    /**
     * Create an instance of {@link WS100233LandRelatedInfoByParcelIdResponse }
     * 
     */
    public WS100233LandRelatedInfoByParcelIdResponse createWS100233LandRelatedInfoByParcelIdResponse() {
        return new WS100233LandRelatedInfoByParcelIdResponse();
    }

    /**
     * Create an instance of {@link WS100234LandCadastreAgreementInfo }
     * 
     */
    public WS100234LandCadastreAgreementInfo createWS100234LandCadastreAgreementInfo() {
        return new WS100234LandCadastreAgreementInfo();
    }

    /**
     * Create an instance of {@link WS100234LandCadastreAgreementInfoResponse }
     * 
     */
    public WS100234LandCadastreAgreementInfoResponse createWS100234LandCadastreAgreementInfoResponse() {
        return new WS100234LandCadastreAgreementInfoResponse();
    }

    /**
     * Create an instance of {@link WS100235LandCadastreApplicantInfo }
     * 
     */
    public WS100235LandCadastreApplicantInfo createWS100235LandCadastreApplicantInfo() {
        return new WS100235LandCadastreApplicantInfo();
    }

    /**
     * Create an instance of {@link WS100235LandCadastreApplicantInfoResponse }
     * 
     */
    public WS100235LandCadastreApplicantInfoResponse createWS100235LandCadastreApplicantInfoResponse() {
        return new WS100235LandCadastreApplicantInfoResponse();
    }

    /**
     * Create an instance of {@link WS100236LandCadastreQR }
     * 
     */
    public WS100236LandCadastreQR createWS100236LandCadastreQR() {
        return new WS100236LandCadastreQR();
    }

    /**
     * Create an instance of {@link WS100236LandCadastreQRResponse }
     * 
     */
    public WS100236LandCadastreQRResponse createWS100236LandCadastreQRResponse() {
        return new WS100236LandCadastreQRResponse();
    }

    /**
     * Create an instance of {@link WS100237CadastreApplicantStatusInfo }
     * 
     */
    public WS100237CadastreApplicantStatusInfo createWS100237CadastreApplicantStatusInfo() {
        return new WS100237CadastreApplicantStatusInfo();
    }

    /**
     * Create an instance of {@link WS100237CadastreApplicantStatusInfoResponse }
     * 
     */
    public WS100237CadastreApplicantStatusInfoResponse createWS100237CadastreApplicantStatusInfoResponse() {
        return new WS100237CadastreApplicantStatusInfoResponse();
    }

    /**
     * Create an instance of {@link WS100238LandCadastreVicinityInfo }
     * 
     */
    public WS100238LandCadastreVicinityInfo createWS100238LandCadastreVicinityInfo() {
        return new WS100238LandCadastreVicinityInfo();
    }

    /**
     * Create an instance of {@link WS100238LandCadastreVicinityInfoResponse }
     * 
     */
    public WS100238LandCadastreVicinityInfoResponse createWS100238LandCadastreVicinityInfoResponse() {
        return new WS100238LandCadastreVicinityInfoResponse();
    }

    /**
     * Create an instance of {@link WS100239PropertyDetailsBetweenDate }
     * 
     */
    public WS100239PropertyDetailsBetweenDate createWS100239PropertyDetailsBetweenDate() {
        return new WS100239PropertyDetailsBetweenDate();
    }

    /**
     * Create an instance of {@link WS100239PropertyDetailsBetweenDateResponse }
     * 
     */
    public WS100239PropertyDetailsBetweenDateResponse createWS100239PropertyDetailsBetweenDateResponse() {
        return new WS100239PropertyDetailsBetweenDateResponse();
    }

    /**
     * Create an instance of {@link WS100240LandInfoByPersonIdAndParcelId }
     * 
     */
    public WS100240LandInfoByPersonIdAndParcelId createWS100240LandInfoByPersonIdAndParcelId() {
        return new WS100240LandInfoByPersonIdAndParcelId();
    }

    /**
     * Create an instance of {@link WS100240LandInfoByPersonIdAndParcelIdResponse }
     * 
     */
    public WS100240LandInfoByPersonIdAndParcelIdResponse createWS100240LandInfoByPersonIdAndParcelIdResponse() {
        return new WS100240LandInfoByPersonIdAndParcelIdResponse();
    }

    /**
     * Create an instance of {@link WS100241LandSettlementAct }
     * 
     */
    public WS100241LandSettlementAct createWS100241LandSettlementAct() {
        return new WS100241LandSettlementAct();
    }

    /**
     * Create an instance of {@link WS100241LandSettlementActResponse }
     * 
     */
    public WS100241LandSettlementActResponse createWS100241LandSettlementActResponse() {
        return new WS100241LandSettlementActResponse();
    }

    /**
     * Create an instance of {@link LandOwningRequestData }
     * 
     */
    public LandOwningRequestData createLandOwningRequestData() {
        return new LandOwningRequestData();
    }

    /**
     * Create an instance of {@link ServiceRequest }
     * 
     */
    public ServiceRequest createServiceRequest() {
        return new ServiceRequest();
    }

    /**
     * Create an instance of {@link AuthorizationData }
     * 
     */
    public AuthorizationData createAuthorizationData() {
        return new AuthorizationData();
    }

    /**
     * Create an instance of {@link AuthorizationEntity }
     * 
     */
    public AuthorizationEntity createAuthorizationEntity() {
        return new AuthorizationEntity();
    }

    /**
     * Create an instance of {@link ServiceResponse }
     * 
     */
    public ServiceResponse createServiceResponse() {
        return new ServiceResponse();
    }

    /**
     * Create an instance of {@link LandOwningContractData }
     * 
     */
    public LandOwningContractData createLandOwningContractData() {
        return new LandOwningContractData();
    }

    /**
     * Create an instance of {@link LandOwningContractDetailData }
     * 
     */
    public LandOwningContractDetailData createLandOwningContractDetailData() {
        return new LandOwningContractDetailData();
    }

    /**
     * Create an instance of {@link PropertyRequestData }
     * 
     */
    public PropertyRequestData createPropertyRequestData() {
        return new PropertyRequestData();
    }

    /**
     * Create an instance of {@link PropertyDataOnlyMinor }
     * 
     */
    public PropertyDataOnlyMinor createPropertyDataOnlyMinor() {
        return new PropertyDataOnlyMinor();
    }

    /**
     * Create an instance of {@link PropertyBaseData }
     * 
     */
    public PropertyBaseData createPropertyBaseData() {
        return new PropertyBaseData();
    }

    /**
     * Create an instance of {@link CoOwnerDetailData }
     * 
     */
    public CoOwnerDetailData createCoOwnerDetailData() {
        return new CoOwnerDetailData();
    }

    /**
     * Create an instance of {@link PropertyProcessData }
     * 
     */
    public PropertyProcessData createPropertyProcessData() {
        return new PropertyProcessData();
    }

    /**
     * Create an instance of {@link PropertyOwnerData }
     * 
     */
    public PropertyOwnerData createPropertyOwnerData() {
        return new PropertyOwnerData();
    }

    /**
     * Create an instance of {@link CheckLandMortgageRequestData }
     * 
     */
    public CheckLandMortgageRequestData createCheckLandMortgageRequestData() {
        return new CheckLandMortgageRequestData();
    }

    /**
     * Create an instance of {@link LandCadastreQRData }
     * 
     */
    public LandCadastreQRData createLandCadastreQRData() {
        return new LandCadastreQRData();
    }

    /**
     * Create an instance of {@link LandDirectionRequest }
     * 
     */
    public LandDirectionRequest createLandDirectionRequest() {
        return new LandDirectionRequest();
    }

    /**
     * Create an instance of {@link LandOwningData }
     * 
     */
    public LandOwningData createLandOwningData() {
        return new LandOwningData();
    }

    /**
     * Create an instance of {@link CadastreApplicantStatusData }
     * 
     */
    public CadastreApplicantStatusData createCadastreApplicantStatusData() {
        return new CadastreApplicantStatusData();
    }

    /**
     * Create an instance of {@link CadastreApplicantStatusDetailData }
     * 
     */
    public CadastreApplicantStatusDetailData createCadastreApplicantStatusDetailData() {
        return new CadastreApplicantStatusDetailData();
    }

    /**
     * Create an instance of {@link LandOwningDecisionData }
     * 
     */
    public LandOwningDecisionData createLandOwningDecisionData() {
        return new LandOwningDecisionData();
    }

    /**
     * Create an instance of {@link LandOwningDecisionDetailData }
     * 
     */
    public LandOwningDecisionDetailData createLandOwningDecisionDetailData() {
        return new LandOwningDecisionDetailData();
    }

    /**
     * Create an instance of {@link LandValuationData }
     * 
     */
    public LandValuationData createLandValuationData() {
        return new LandValuationData();
    }

    /**
     * Create an instance of {@link LandValuationDetailData }
     * 
     */
    public LandValuationDetailData createLandValuationDetailData() {
        return new LandValuationDetailData();
    }

    /**
     * Create an instance of {@link GetPropertyBasicRequestData }
     * 
     */
    public GetPropertyBasicRequestData createGetPropertyBasicRequestData() {
        return new GetPropertyBasicRequestData();
    }

    /**
     * Create an instance of {@link GetPropertyBasicData }
     * 
     */
    public GetPropertyBasicData createGetPropertyBasicData() {
        return new GetPropertyBasicData();
    }

    /**
     * Create an instance of {@link GetPropertyBasicDetailData }
     * 
     */
    public GetPropertyBasicDetailData createGetPropertyBasicDetailData() {
        return new GetPropertyBasicDetailData();
    }

    /**
     * Create an instance of {@link LandOwningInfoByPersonIdRequestData }
     * 
     */
    public LandOwningInfoByPersonIdRequestData createLandOwningInfoByPersonIdRequestData() {
        return new LandOwningInfoByPersonIdRequestData();
    }

    /**
     * Create an instance of {@link LandOwningInfoByPersonIdData }
     * 
     */
    public LandOwningInfoByPersonIdData createLandOwningInfoByPersonIdData() {
        return new LandOwningInfoByPersonIdData();
    }

    /**
     * Create an instance of {@link LandOwningInfoByPersonIdDetailData }
     * 
     */
    public LandOwningInfoByPersonIdDetailData createLandOwningInfoByPersonIdDetailData() {
        return new LandOwningInfoByPersonIdDetailData();
    }

    /**
     * Create an instance of {@link LandOfficialLetterData }
     * 
     */
    public LandOfficialLetterData createLandOfficialLetterData() {
        return new LandOfficialLetterData();
    }

    /**
     * Create an instance of {@link LandOfficialLetterDetailData }
     * 
     */
    public LandOfficialLetterDetailData createLandOfficialLetterDetailData() {
        return new LandOfficialLetterDetailData();
    }

    /**
     * Create an instance of {@link AddressListRequestData }
     * 
     */
    public AddressListRequestData createAddressListRequestData() {
        return new AddressListRequestData();
    }

    /**
     * Create an instance of {@link AddressListData }
     * 
     */
    public AddressListData createAddressListData() {
        return new AddressListData();
    }

    /**
     * Create an instance of {@link AddressListDetailData }
     * 
     */
    public AddressListDetailData createAddressListDetailData() {
        return new AddressListDetailData();
    }

    /**
     * Create an instance of {@link PropertyValueData }
     * 
     */
    public PropertyValueData createPropertyValueData() {
        return new PropertyValueData();
    }

    /**
     * Create an instance of {@link PropertyNumberRequestData }
     * 
     */
    public PropertyNumberRequestData createPropertyNumberRequestData() {
        return new PropertyNumberRequestData();
    }

    /**
     * Create an instance of {@link CollateralPropertyInfoData }
     * 
     */
    public CollateralPropertyInfoData createCollateralPropertyInfoData() {
        return new CollateralPropertyInfoData();
    }

    /**
     * Create an instance of {@link CollateralPropertyInfoDetailData }
     * 
     */
    public CollateralPropertyInfoDetailData createCollateralPropertyInfoDetailData() {
        return new CollateralPropertyInfoDetailData();
    }

    /**
     * Create an instance of {@link PropertyAddressRequestData }
     * 
     */
    public PropertyAddressRequestData createPropertyAddressRequestData() {
        return new PropertyAddressRequestData();
    }

    /**
     * Create an instance of {@link PropertyInfoAddressData }
     * 
     */
    public PropertyInfoAddressData createPropertyInfoAddressData() {
        return new PropertyInfoAddressData();
    }

    /**
     * Create an instance of {@link PropertyInfoAddressDetailData }
     * 
     */
    public PropertyInfoAddressDetailData createPropertyInfoAddressDetailData() {
        return new PropertyInfoAddressDetailData();
    }

    /**
     * Create an instance of {@link ServicePropertyListRequestData }
     * 
     */
    public ServicePropertyListRequestData createServicePropertyListRequestData() {
        return new ServicePropertyListRequestData();
    }

    /**
     * Create an instance of {@link PropertyListData }
     * 
     */
    public PropertyListData createPropertyListData() {
        return new PropertyListData();
    }

    /**
     * Create an instance of {@link PropertyListDetailData }
     * 
     */
    public PropertyListDetailData createPropertyListDetailData() {
        return new PropertyListDetailData();
    }

    /**
     * Create an instance of {@link PropertyToObligateRequestData }
     * 
     */
    public PropertyToObligateRequestData createPropertyToObligateRequestData() {
        return new PropertyToObligateRequestData();
    }

    /**
     * Create an instance of {@link PropertyToObligateData }
     * 
     */
    public PropertyToObligateData createPropertyToObligateData() {
        return new PropertyToObligateData();
    }

    /**
     * Create an instance of {@link PropertyOwnerMovedData }
     * 
     */
    public PropertyOwnerMovedData createPropertyOwnerMovedData() {
        return new PropertyOwnerMovedData();
    }

    /**
     * Create an instance of {@link LandRelatedInfoByParcelIdRequestData }
     * 
     */
    public LandRelatedInfoByParcelIdRequestData createLandRelatedInfoByParcelIdRequestData() {
        return new LandRelatedInfoByParcelIdRequestData();
    }

    /**
     * Create an instance of {@link LandRelatedInfoByParcelIdData }
     * 
     */
    public LandRelatedInfoByParcelIdData createLandRelatedInfoByParcelIdData() {
        return new LandRelatedInfoByParcelIdData();
    }

    /**
     * Create an instance of {@link LandInfoByPersonParcelIdsRequestData }
     * 
     */
    public LandInfoByPersonParcelIdsRequestData createLandInfoByPersonParcelIdsRequestData() {
        return new LandInfoByPersonParcelIdsRequestData();
    }

    /**
     * Create an instance of {@link LandInfoByPersonParcelIdsData }
     * 
     */
    public LandInfoByPersonParcelIdsData createLandInfoByPersonParcelIdsData() {
        return new LandInfoByPersonParcelIdsData();
    }

    /**
     * Create an instance of {@link PropertyRentContractInfoData }
     * 
     */
    public PropertyRentContractInfoData createPropertyRentContractInfoData() {
        return new PropertyRentContractInfoData();
    }

    /**
     * Create an instance of {@link PropertyRentContractDetailData }
     * 
     */
    public PropertyRentContractDetailData createPropertyRentContractDetailData() {
        return new PropertyRentContractDetailData();
    }

    /**
     * Create an instance of {@link LandOwningRequest }
     * 
     */
    public LandOwningRequest createLandOwningRequest() {
        return new LandOwningRequest();
    }

    /**
     * Create an instance of {@link ServiceInsertHotelInfoRequestData }
     * 
     */
    public ServiceInsertHotelInfoRequestData createServiceInsertHotelInfoRequestData() {
        return new ServiceInsertHotelInfoRequestData();
    }

    /**
     * Create an instance of {@link InsertHotelInfoData }
     * 
     */
    public InsertHotelInfoData createInsertHotelInfoData() {
        return new InsertHotelInfoData();
    }

    /**
     * Create an instance of {@link LandSuitorRequest }
     * 
     */
    public LandSuitorRequest createLandSuitorRequest() {
        return new LandSuitorRequest();
    }

    /**
     * Create an instance of {@link GetCadastralMapRequestData }
     * 
     */
    public GetCadastralMapRequestData createGetCadastralMapRequestData() {
        return new GetCadastralMapRequestData();
    }

    /**
     * Create an instance of {@link GetCadastralMapData }
     * 
     */
    public GetCadastralMapData createGetCadastralMapData() {
        return new GetCadastralMapData();
    }

    /**
     * Create an instance of {@link ServiceIsPropertyCheckRequestData }
     * 
     */
    public ServiceIsPropertyCheckRequestData createServiceIsPropertyCheckRequestData() {
        return new ServiceIsPropertyCheckRequestData();
    }

    /**
     * Create an instance of {@link IsPropertyCheckData }
     * 
     */
    public IsPropertyCheckData createIsPropertyCheckData() {
        return new IsPropertyCheckData();
    }

    /**
     * Create an instance of {@link LandOwningCertificateData }
     * 
     */
    public LandOwningCertificateData createLandOwningCertificateData() {
        return new LandOwningCertificateData();
    }

    /**
     * Create an instance of {@link LandOwningCertificateDetailData }
     * 
     */
    public LandOwningCertificateDetailData createLandOwningCertificateDetailData() {
        return new LandOwningCertificateDetailData();
    }

    /**
     * Create an instance of {@link LandSettlementActRequestData }
     * 
     */
    public LandSettlementActRequestData createLandSettlementActRequestData() {
        return new LandSettlementActRequestData();
    }

    /**
     * Create an instance of {@link LandSettlementActData }
     * 
     */
    public LandSettlementActData createLandSettlementActData() {
        return new LandSettlementActData();
    }

    /**
     * Create an instance of {@link ImpositionBodyDetail }
     * 
     */
    public ImpositionBodyDetail createImpositionBodyDetail() {
        return new ImpositionBodyDetail();
    }

    /**
     * Create an instance of {@link PropertyInfoBetweenDateRequestData }
     * 
     */
    public PropertyInfoBetweenDateRequestData createPropertyInfoBetweenDateRequestData() {
        return new PropertyInfoBetweenDateRequestData();
    }

    /**
     * Create an instance of {@link PropertyInfoBetweenDateData }
     * 
     */
    public PropertyInfoBetweenDateData createPropertyInfoBetweenDateData() {
        return new PropertyInfoBetweenDateData();
    }

    /**
     * Create an instance of {@link PropertyInfoBetweenDateDetailData }
     * 
     */
    public PropertyInfoBetweenDateDetailData createPropertyInfoBetweenDateDetailData() {
        return new PropertyInfoBetweenDateDetailData();
    }

    /**
     * Create an instance of {@link AddressMoreRequestData }
     * 
     */
    public AddressMoreRequestData createAddressMoreRequestData() {
        return new AddressMoreRequestData();
    }

    /**
     * Create an instance of {@link AddressMoreData }
     * 
     */
    public AddressMoreData createAddressMoreData() {
        return new AddressMoreData();
    }

    /**
     * Create an instance of {@link LandApprovedRequest }
     * 
     */
    public LandApprovedRequest createLandApprovedRequest() {
        return new LandApprovedRequest();
    }

    /**
     * Create an instance of {@link LandApprovedData }
     * 
     */
    public LandApprovedData createLandApprovedData() {
        return new LandApprovedData();
    }

    /**
     * Create an instance of {@link PropertyData }
     * 
     */
    public PropertyData createPropertyData() {
        return new PropertyData();
    }

    /**
     * Create an instance of {@link LandRelatedUsersData }
     * 
     */
    public LandRelatedUsersData createLandRelatedUsersData() {
        return new LandRelatedUsersData();
    }

    /**
     * Create an instance of {@link LandRelatedUsersDetailData }
     * 
     */
    public LandRelatedUsersDetailData createLandRelatedUsersDetailData() {
        return new LandRelatedUsersDetailData();
    }

    /**
     * Create an instance of {@link PropertyLandOwnerRequestData }
     * 
     */
    public PropertyLandOwnerRequestData createPropertyLandOwnerRequestData() {
        return new PropertyLandOwnerRequestData();
    }

    /**
     * Create an instance of {@link PropertyLandOwnerData }
     * 
     */
    public PropertyLandOwnerData createPropertyLandOwnerData() {
        return new PropertyLandOwnerData();
    }

    /**
     * Create an instance of {@link LandCadastreVicinityData }
     * 
     */
    public LandCadastreVicinityData createLandCadastreVicinityData() {
        return new LandCadastreVicinityData();
    }

    /**
     * Create an instance of {@link LandCadastreVicinityDetailData }
     * 
     */
    public LandCadastreVicinityDetailData createLandCadastreVicinityDetailData() {
        return new LandCadastreVicinityDetailData();
    }

    /**
     * Create an instance of {@link PropertyChangeOwnerInfoData }
     * 
     */
    public PropertyChangeOwnerInfoData createPropertyChangeOwnerInfoData() {
        return new PropertyChangeOwnerInfoData();
    }

    /**
     * Create an instance of {@link PropertyChangeOwnerDetailData }
     * 
     */
    public PropertyChangeOwnerDetailData createPropertyChangeOwnerDetailData() {
        return new PropertyChangeOwnerDetailData();
    }

    /**
     * Create an instance of {@link CheckLandMortgageData }
     * 
     */
    public CheckLandMortgageData createCheckLandMortgageData() {
        return new CheckLandMortgageData();
    }

    /**
     * Create an instance of {@link CheckLandMortgageDetailData }
     * 
     */
    public CheckLandMortgageDetailData createCheckLandMortgageDetailData() {
        return new CheckLandMortgageDetailData();
    }

    /**
     * Create an instance of {@link LandCadastralMapData }
     * 
     */
    public LandCadastralMapData createLandCadastralMapData() {
        return new LandCadastralMapData();
    }

    /**
     * Create an instance of {@link LandCadastralMapDetailData }
     * 
     */
    public LandCadastralMapDetailData createLandCadastralMapDetailData() {
        return new LandCadastralMapDetailData();
    }

    /**
     * Create an instance of {@link PropertyDetailsBetweenDateData }
     * 
     */
    public PropertyDetailsBetweenDateData createPropertyDetailsBetweenDateData() {
        return new PropertyDetailsBetweenDateData();
    }

    /**
     * Create an instance of {@link PropertyDetailsBetweenDateDetailData }
     * 
     */
    public PropertyDetailsBetweenDateDetailData createPropertyDetailsBetweenDateDetailData() {
        return new PropertyDetailsBetweenDateDetailData();
    }

    /**
     * Create an instance of {@link LandCadastreApplicantData }
     * 
     */
    public LandCadastreApplicantData createLandCadastreApplicantData() {
        return new LandCadastreApplicantData();
    }

    /**
     * Create an instance of {@link LandCadastreApplicantDetailData }
     * 
     */
    public LandCadastreApplicantDetailData createLandCadastreApplicantDetailData() {
        return new LandCadastreApplicantDetailData();
    }

    /**
     * Create an instance of {@link LandCadastreAgreementData }
     * 
     */
    public LandCadastreAgreementData createLandCadastreAgreementData() {
        return new LandCadastreAgreementData();
    }

    /**
     * Create an instance of {@link LandCadastreAgreementDetailData }
     * 
     */
    public LandCadastreAgreementDetailData createLandCadastreAgreementDetailData() {
        return new LandCadastreAgreementDetailData();
    }

    /**
     * Create an instance of {@link PropertyRightsData }
     * 
     */
    public PropertyRightsData createPropertyRightsData() {
        return new PropertyRightsData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100201GetPropertyInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100201GetPropertyInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100201_getPropertyInfo")
    public JAXBElement<WS100201GetPropertyInfo> createWS100201GetPropertyInfo(WS100201GetPropertyInfo value) {
        return new JAXBElement<WS100201GetPropertyInfo>(_WS100201GetPropertyInfo_QNAME, WS100201GetPropertyInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100201GetPropertyInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100201GetPropertyInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100201_getPropertyInfoResponse")
    public JAXBElement<WS100201GetPropertyInfoResponse> createWS100201GetPropertyInfoResponse(WS100201GetPropertyInfoResponse value) {
        return new JAXBElement<WS100201GetPropertyInfoResponse>(_WS100201GetPropertyInfoResponse_QNAME, WS100201GetPropertyInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100202GetPropertyList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100202GetPropertyList }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100202_getPropertyList")
    public JAXBElement<WS100202GetPropertyList> createWS100202GetPropertyList(WS100202GetPropertyList value) {
        return new JAXBElement<WS100202GetPropertyList>(_WS100202GetPropertyList_QNAME, WS100202GetPropertyList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100202GetPropertyListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100202GetPropertyListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100202_getPropertyListResponse")
    public JAXBElement<WS100202GetPropertyListResponse> createWS100202GetPropertyListResponse(WS100202GetPropertyListResponse value) {
        return new JAXBElement<WS100202GetPropertyListResponse>(_WS100202GetPropertyListResponse_QNAME, WS100202GetPropertyListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100203IsPropertyCheck }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100203IsPropertyCheck }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100203_isPropertyCheck")
    public JAXBElement<WS100203IsPropertyCheck> createWS100203IsPropertyCheck(WS100203IsPropertyCheck value) {
        return new JAXBElement<WS100203IsPropertyCheck>(_WS100203IsPropertyCheck_QNAME, WS100203IsPropertyCheck.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100203IsPropertyCheckResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100203IsPropertyCheckResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100203_isPropertyCheckResponse")
    public JAXBElement<WS100203IsPropertyCheckResponse> createWS100203IsPropertyCheckResponse(WS100203IsPropertyCheckResponse value) {
        return new JAXBElement<WS100203IsPropertyCheckResponse>(_WS100203IsPropertyCheckResponse_QNAME, WS100203IsPropertyCheckResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100204InsertLandOwningInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100204InsertLandOwningInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100204_insertLandOwningInfo")
    public JAXBElement<WS100204InsertLandOwningInfo> createWS100204InsertLandOwningInfo(WS100204InsertLandOwningInfo value) {
        return new JAXBElement<WS100204InsertLandOwningInfo>(_WS100204InsertLandOwningInfo_QNAME, WS100204InsertLandOwningInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100204InsertLandOwningInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100204InsertLandOwningInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100204_insertLandOwningInfoResponse")
    public JAXBElement<WS100204InsertLandOwningInfoResponse> createWS100204InsertLandOwningInfoResponse(WS100204InsertLandOwningInfoResponse value) {
        return new JAXBElement<WS100204InsertLandOwningInfoResponse>(_WS100204InsertLandOwningInfoResponse_QNAME, WS100204InsertLandOwningInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100205InsertLandSuitorInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100205InsertLandSuitorInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100205_insertLandSuitorInfo")
    public JAXBElement<WS100205InsertLandSuitorInfo> createWS100205InsertLandSuitorInfo(WS100205InsertLandSuitorInfo value) {
        return new JAXBElement<WS100205InsertLandSuitorInfo>(_WS100205InsertLandSuitorInfo_QNAME, WS100205InsertLandSuitorInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100205InsertLandSuitorInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100205InsertLandSuitorInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100205_insertLandSuitorInfoResponse")
    public JAXBElement<WS100205InsertLandSuitorInfoResponse> createWS100205InsertLandSuitorInfoResponse(WS100205InsertLandSuitorInfoResponse value) {
        return new JAXBElement<WS100205InsertLandSuitorInfoResponse>(_WS100205InsertLandSuitorInfoResponse_QNAME, WS100205InsertLandSuitorInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100206InsertLandDirectionInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100206InsertLandDirectionInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100206_insertLandDirectionInfo")
    public JAXBElement<WS100206InsertLandDirectionInfo> createWS100206InsertLandDirectionInfo(WS100206InsertLandDirectionInfo value) {
        return new JAXBElement<WS100206InsertLandDirectionInfo>(_WS100206InsertLandDirectionInfo_QNAME, WS100206InsertLandDirectionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100206InsertLandDirectionInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100206InsertLandDirectionInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100206_insertLandDirectionInfoResponse")
    public JAXBElement<WS100206InsertLandDirectionInfoResponse> createWS100206InsertLandDirectionInfoResponse(WS100206InsertLandDirectionInfoResponse value) {
        return new JAXBElement<WS100206InsertLandDirectionInfoResponse>(_WS100206InsertLandDirectionInfoResponse_QNAME, WS100206InsertLandDirectionInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100207GetApprovedLandRequestInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100207GetApprovedLandRequestInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100207_getApprovedLandRequestInfo")
    public JAXBElement<WS100207GetApprovedLandRequestInfo> createWS100207GetApprovedLandRequestInfo(WS100207GetApprovedLandRequestInfo value) {
        return new JAXBElement<WS100207GetApprovedLandRequestInfo>(_WS100207GetApprovedLandRequestInfo_QNAME, WS100207GetApprovedLandRequestInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100207GetApprovedLandRequestInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100207GetApprovedLandRequestInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100207_getApprovedLandRequestInfoResponse")
    public JAXBElement<WS100207GetApprovedLandRequestInfoResponse> createWS100207GetApprovedLandRequestInfoResponse(WS100207GetApprovedLandRequestInfoResponse value) {
        return new JAXBElement<WS100207GetApprovedLandRequestInfoResponse>(_WS100207GetApprovedLandRequestInfoResponse_QNAME, WS100207GetApprovedLandRequestInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100208GetPropertyInfoOnlyMinor }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100208GetPropertyInfoOnlyMinor }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100208_getPropertyInfoOnlyMinor")
    public JAXBElement<WS100208GetPropertyInfoOnlyMinor> createWS100208GetPropertyInfoOnlyMinor(WS100208GetPropertyInfoOnlyMinor value) {
        return new JAXBElement<WS100208GetPropertyInfoOnlyMinor>(_WS100208GetPropertyInfoOnlyMinor_QNAME, WS100208GetPropertyInfoOnlyMinor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100208GetPropertyInfoOnlyMinorResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100208GetPropertyInfoOnlyMinorResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100208_getPropertyInfoOnlyMinorResponse")
    public JAXBElement<WS100208GetPropertyInfoOnlyMinorResponse> createWS100208GetPropertyInfoOnlyMinorResponse(WS100208GetPropertyInfoOnlyMinorResponse value) {
        return new JAXBElement<WS100208GetPropertyInfoOnlyMinorResponse>(_WS100208GetPropertyInfoOnlyMinorResponse_QNAME, WS100208GetPropertyInfoOnlyMinorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100209GetPropertyOwnerMovedInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100209GetPropertyOwnerMovedInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100209_getPropertyOwnerMovedInfo")
    public JAXBElement<WS100209GetPropertyOwnerMovedInfo> createWS100209GetPropertyOwnerMovedInfo(WS100209GetPropertyOwnerMovedInfo value) {
        return new JAXBElement<WS100209GetPropertyOwnerMovedInfo>(_WS100209GetPropertyOwnerMovedInfo_QNAME, WS100209GetPropertyOwnerMovedInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100209GetPropertyOwnerMovedInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100209GetPropertyOwnerMovedInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100209_getPropertyOwnerMovedInfoResponse")
    public JAXBElement<WS100209GetPropertyOwnerMovedInfoResponse> createWS100209GetPropertyOwnerMovedInfoResponse(WS100209GetPropertyOwnerMovedInfoResponse value) {
        return new JAXBElement<WS100209GetPropertyOwnerMovedInfoResponse>(_WS100209GetPropertyOwnerMovedInfoResponse_QNAME, WS100209GetPropertyOwnerMovedInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100210GetPropertyToObligateInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100210GetPropertyToObligateInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100210_getPropertyToObligateInfo")
    public JAXBElement<WS100210GetPropertyToObligateInfo> createWS100210GetPropertyToObligateInfo(WS100210GetPropertyToObligateInfo value) {
        return new JAXBElement<WS100210GetPropertyToObligateInfo>(_WS100210GetPropertyToObligateInfo_QNAME, WS100210GetPropertyToObligateInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100210GetPropertyToObligateInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100210GetPropertyToObligateInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100210_getPropertyToObligateInfoResponse")
    public JAXBElement<WS100210GetPropertyToObligateInfoResponse> createWS100210GetPropertyToObligateInfoResponse(WS100210GetPropertyToObligateInfoResponse value) {
        return new JAXBElement<WS100210GetPropertyToObligateInfoResponse>(_WS100210GetPropertyToObligateInfoResponse_QNAME, WS100210GetPropertyToObligateInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100211GetCollateralPropertyInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100211GetCollateralPropertyInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100211_getCollateralPropertyInfo")
    public JAXBElement<WS100211GetCollateralPropertyInfo> createWS100211GetCollateralPropertyInfo(WS100211GetCollateralPropertyInfo value) {
        return new JAXBElement<WS100211GetCollateralPropertyInfo>(_WS100211GetCollateralPropertyInfo_QNAME, WS100211GetCollateralPropertyInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100211GetCollateralPropertyInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100211GetCollateralPropertyInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100211_getCollateralPropertyInfoResponse")
    public JAXBElement<WS100211GetCollateralPropertyInfoResponse> createWS100211GetCollateralPropertyInfoResponse(WS100211GetCollateralPropertyInfoResponse value) {
        return new JAXBElement<WS100211GetCollateralPropertyInfoResponse>(_WS100211GetCollateralPropertyInfoResponse_QNAME, WS100211GetCollateralPropertyInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100212GetPropertyChangeOwnerInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100212GetPropertyChangeOwnerInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100212_getPropertyChangeOwnerInfo")
    public JAXBElement<WS100212GetPropertyChangeOwnerInfo> createWS100212GetPropertyChangeOwnerInfo(WS100212GetPropertyChangeOwnerInfo value) {
        return new JAXBElement<WS100212GetPropertyChangeOwnerInfo>(_WS100212GetPropertyChangeOwnerInfo_QNAME, WS100212GetPropertyChangeOwnerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100212GetPropertyChangeOwnerInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100212GetPropertyChangeOwnerInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100212_getPropertyChangeOwnerInfoResponse")
    public JAXBElement<WS100212GetPropertyChangeOwnerInfoResponse> createWS100212GetPropertyChangeOwnerInfoResponse(WS100212GetPropertyChangeOwnerInfoResponse value) {
        return new JAXBElement<WS100212GetPropertyChangeOwnerInfoResponse>(_WS100212GetPropertyChangeOwnerInfoResponse_QNAME, WS100212GetPropertyChangeOwnerInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100213GetPropertyRentContractInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100213GetPropertyRentContractInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100213_getPropertyRentContractInfo")
    public JAXBElement<WS100213GetPropertyRentContractInfo> createWS100213GetPropertyRentContractInfo(WS100213GetPropertyRentContractInfo value) {
        return new JAXBElement<WS100213GetPropertyRentContractInfo>(_WS100213GetPropertyRentContractInfo_QNAME, WS100213GetPropertyRentContractInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100213GetPropertyRentContractInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100213GetPropertyRentContractInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100213_getPropertyRentContractInfoResponse")
    public JAXBElement<WS100213GetPropertyRentContractInfoResponse> createWS100213GetPropertyRentContractInfoResponse(WS100213GetPropertyRentContractInfoResponse value) {
        return new JAXBElement<WS100213GetPropertyRentContractInfoResponse>(_WS100213GetPropertyRentContractInfoResponse_QNAME, WS100213GetPropertyRentContractInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100214GetPropertyInfoAddress }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100214GetPropertyInfoAddress }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100214_getPropertyInfoAddress")
    public JAXBElement<WS100214GetPropertyInfoAddress> createWS100214GetPropertyInfoAddress(WS100214GetPropertyInfoAddress value) {
        return new JAXBElement<WS100214GetPropertyInfoAddress>(_WS100214GetPropertyInfoAddress_QNAME, WS100214GetPropertyInfoAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100214GetPropertyInfoAddressResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100214GetPropertyInfoAddressResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100214_getPropertyInfoAddressResponse")
    public JAXBElement<WS100214GetPropertyInfoAddressResponse> createWS100214GetPropertyInfoAddressResponse(WS100214GetPropertyInfoAddressResponse value) {
        return new JAXBElement<WS100214GetPropertyInfoAddressResponse>(_WS100214GetPropertyInfoAddressResponse_QNAME, WS100214GetPropertyInfoAddressResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100215InsertHotelInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100215InsertHotelInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100215_insertHotelInfo")
    public JAXBElement<WS100215InsertHotelInfo> createWS100215InsertHotelInfo(WS100215InsertHotelInfo value) {
        return new JAXBElement<WS100215InsertHotelInfo>(_WS100215InsertHotelInfo_QNAME, WS100215InsertHotelInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100215InsertHotelInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100215InsertHotelInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100215_insertHotelInfoResponse")
    public JAXBElement<WS100215InsertHotelInfoResponse> createWS100215InsertHotelInfoResponse(WS100215InsertHotelInfoResponse value) {
        return new JAXBElement<WS100215InsertHotelInfoResponse>(_WS100215InsertHotelInfoResponse_QNAME, WS100215InsertHotelInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100216PropertyRightsInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100216PropertyRightsInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100216_propertyRightsInfo")
    public JAXBElement<WS100216PropertyRightsInfo> createWS100216PropertyRightsInfo(WS100216PropertyRightsInfo value) {
        return new JAXBElement<WS100216PropertyRightsInfo>(_WS100216PropertyRightsInfo_QNAME, WS100216PropertyRightsInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100216PropertyRightsInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100216PropertyRightsInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100216_propertyRightsInfoResponse")
    public JAXBElement<WS100216PropertyRightsInfoResponse> createWS100216PropertyRightsInfoResponse(WS100216PropertyRightsInfoResponse value) {
        return new JAXBElement<WS100216PropertyRightsInfoResponse>(_WS100216PropertyRightsInfoResponse_QNAME, WS100216PropertyRightsInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100217PropertyLandOwnerInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100217PropertyLandOwnerInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100217_propertyLandOwnerInfo")
    public JAXBElement<WS100217PropertyLandOwnerInfo> createWS100217PropertyLandOwnerInfo(WS100217PropertyLandOwnerInfo value) {
        return new JAXBElement<WS100217PropertyLandOwnerInfo>(_WS100217PropertyLandOwnerInfo_QNAME, WS100217PropertyLandOwnerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100217PropertyLandOwnerInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100217PropertyLandOwnerInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100217_propertyLandOwnerInfoResponse")
    public JAXBElement<WS100217PropertyLandOwnerInfoResponse> createWS100217PropertyLandOwnerInfoResponse(WS100217PropertyLandOwnerInfoResponse value) {
        return new JAXBElement<WS100217PropertyLandOwnerInfoResponse>(_WS100217PropertyLandOwnerInfoResponse_QNAME, WS100217PropertyLandOwnerInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100218LandOwningCertificateInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100218LandOwningCertificateInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100218_landOwningCertificateInfo")
    public JAXBElement<WS100218LandOwningCertificateInfo> createWS100218LandOwningCertificateInfo(WS100218LandOwningCertificateInfo value) {
        return new JAXBElement<WS100218LandOwningCertificateInfo>(_WS100218LandOwningCertificateInfo_QNAME, WS100218LandOwningCertificateInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100218LandOwningCertificateInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100218LandOwningCertificateInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100218_landOwningCertificateInfoResponse")
    public JAXBElement<WS100218LandOwningCertificateInfoResponse> createWS100218LandOwningCertificateInfoResponse(WS100218LandOwningCertificateInfoResponse value) {
        return new JAXBElement<WS100218LandOwningCertificateInfoResponse>(_WS100218LandOwningCertificateInfoResponse_QNAME, WS100218LandOwningCertificateInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100219LandOwningContractInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100219LandOwningContractInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100219_landOwningContractInfo")
    public JAXBElement<WS100219LandOwningContractInfo> createWS100219LandOwningContractInfo(WS100219LandOwningContractInfo value) {
        return new JAXBElement<WS100219LandOwningContractInfo>(_WS100219LandOwningContractInfo_QNAME, WS100219LandOwningContractInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100219LandOwningContractInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100219LandOwningContractInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100219_landOwningContractInfoResponse")
    public JAXBElement<WS100219LandOwningContractInfoResponse> createWS100219LandOwningContractInfoResponse(WS100219LandOwningContractInfoResponse value) {
        return new JAXBElement<WS100219LandOwningContractInfoResponse>(_WS100219LandOwningContractInfoResponse_QNAME, WS100219LandOwningContractInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100220LandCadastralMapInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100220LandCadastralMapInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100220_landCadastralMapInfo")
    public JAXBElement<WS100220LandCadastralMapInfo> createWS100220LandCadastralMapInfo(WS100220LandCadastralMapInfo value) {
        return new JAXBElement<WS100220LandCadastralMapInfo>(_WS100220LandCadastralMapInfo_QNAME, WS100220LandCadastralMapInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100220LandCadastralMapInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100220LandCadastralMapInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100220_landCadastralMapInfoResponse")
    public JAXBElement<WS100220LandCadastralMapInfoResponse> createWS100220LandCadastralMapInfoResponse(WS100220LandCadastralMapInfoResponse value) {
        return new JAXBElement<WS100220LandCadastralMapInfoResponse>(_WS100220LandCadastralMapInfoResponse_QNAME, WS100220LandCadastralMapInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100221LandOwningDecisionInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100221LandOwningDecisionInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100221_landOwningDecisionInfo")
    public JAXBElement<WS100221LandOwningDecisionInfo> createWS100221LandOwningDecisionInfo(WS100221LandOwningDecisionInfo value) {
        return new JAXBElement<WS100221LandOwningDecisionInfo>(_WS100221LandOwningDecisionInfo_QNAME, WS100221LandOwningDecisionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100221LandOwningDecisionInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100221LandOwningDecisionInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100221_landOwningDecisionInfoResponse")
    public JAXBElement<WS100221LandOwningDecisionInfoResponse> createWS100221LandOwningDecisionInfoResponse(WS100221LandOwningDecisionInfoResponse value) {
        return new JAXBElement<WS100221LandOwningDecisionInfoResponse>(_WS100221LandOwningDecisionInfoResponse_QNAME, WS100221LandOwningDecisionInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100222GetCadastralMap }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100222GetCadastralMap }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100222_getCadastralMap")
    public JAXBElement<WS100222GetCadastralMap> createWS100222GetCadastralMap(WS100222GetCadastralMap value) {
        return new JAXBElement<WS100222GetCadastralMap>(_WS100222GetCadastralMap_QNAME, WS100222GetCadastralMap.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100222GetCadastralMapResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100222GetCadastralMapResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100222_getCadastralMapResponse")
    public JAXBElement<WS100222GetCadastralMapResponse> createWS100222GetCadastralMapResponse(WS100222GetCadastralMapResponse value) {
        return new JAXBElement<WS100222GetCadastralMapResponse>(_WS100222GetCadastralMapResponse_QNAME, WS100222GetCadastralMapResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100223GetPropertyBasicInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100223GetPropertyBasicInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100223_getPropertyBasicInfo")
    public JAXBElement<WS100223GetPropertyBasicInfo> createWS100223GetPropertyBasicInfo(WS100223GetPropertyBasicInfo value) {
        return new JAXBElement<WS100223GetPropertyBasicInfo>(_WS100223GetPropertyBasicInfo_QNAME, WS100223GetPropertyBasicInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100223GetPropertyBasicInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100223GetPropertyBasicInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100223_getPropertyBasicInfoResponse")
    public JAXBElement<WS100223GetPropertyBasicInfoResponse> createWS100223GetPropertyBasicInfoResponse(WS100223GetPropertyBasicInfoResponse value) {
        return new JAXBElement<WS100223GetPropertyBasicInfoResponse>(_WS100223GetPropertyBasicInfoResponse_QNAME, WS100223GetPropertyBasicInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100224PropertyInfoBetweenDate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100224PropertyInfoBetweenDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100224_propertyInfoBetweenDate")
    public JAXBElement<WS100224PropertyInfoBetweenDate> createWS100224PropertyInfoBetweenDate(WS100224PropertyInfoBetweenDate value) {
        return new JAXBElement<WS100224PropertyInfoBetweenDate>(_WS100224PropertyInfoBetweenDate_QNAME, WS100224PropertyInfoBetweenDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100224PropertyInfoBetweenDateResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100224PropertyInfoBetweenDateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100224_propertyInfoBetweenDateResponse")
    public JAXBElement<WS100224PropertyInfoBetweenDateResponse> createWS100224PropertyInfoBetweenDateResponse(WS100224PropertyInfoBetweenDateResponse value) {
        return new JAXBElement<WS100224PropertyInfoBetweenDateResponse>(_WS100224PropertyInfoBetweenDateResponse_QNAME, WS100224PropertyInfoBetweenDateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100225PropertyValueInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100225PropertyValueInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100225_propertyValueInfo")
    public JAXBElement<WS100225PropertyValueInfo> createWS100225PropertyValueInfo(WS100225PropertyValueInfo value) {
        return new JAXBElement<WS100225PropertyValueInfo>(_WS100225PropertyValueInfo_QNAME, WS100225PropertyValueInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100225PropertyValueInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100225PropertyValueInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100225_propertyValueInfoResponse")
    public JAXBElement<WS100225PropertyValueInfoResponse> createWS100225PropertyValueInfoResponse(WS100225PropertyValueInfoResponse value) {
        return new JAXBElement<WS100225PropertyValueInfoResponse>(_WS100225PropertyValueInfoResponse_QNAME, WS100225PropertyValueInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100226CheckLandMortgage }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100226CheckLandMortgage }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100226_checkLandMortgage")
    public JAXBElement<WS100226CheckLandMortgage> createWS100226CheckLandMortgage(WS100226CheckLandMortgage value) {
        return new JAXBElement<WS100226CheckLandMortgage>(_WS100226CheckLandMortgage_QNAME, WS100226CheckLandMortgage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100226CheckLandMortgageResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100226CheckLandMortgageResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100226_checkLandMortgageResponse")
    public JAXBElement<WS100226CheckLandMortgageResponse> createWS100226CheckLandMortgageResponse(WS100226CheckLandMortgageResponse value) {
        return new JAXBElement<WS100226CheckLandMortgageResponse>(_WS100226CheckLandMortgageResponse_QNAME, WS100226CheckLandMortgageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100227LandOfficialLetterInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100227LandOfficialLetterInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100227_landOfficialLetterInfo")
    public JAXBElement<WS100227LandOfficialLetterInfo> createWS100227LandOfficialLetterInfo(WS100227LandOfficialLetterInfo value) {
        return new JAXBElement<WS100227LandOfficialLetterInfo>(_WS100227LandOfficialLetterInfo_QNAME, WS100227LandOfficialLetterInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100227LandOfficialLetterInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100227LandOfficialLetterInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100227_landOfficialLetterInfoResponse")
    public JAXBElement<WS100227LandOfficialLetterInfoResponse> createWS100227LandOfficialLetterInfoResponse(WS100227LandOfficialLetterInfoResponse value) {
        return new JAXBElement<WS100227LandOfficialLetterInfoResponse>(_WS100227LandOfficialLetterInfoResponse_QNAME, WS100227LandOfficialLetterInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100228AddressMoreInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100228AddressMoreInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100228_addressMoreInfo")
    public JAXBElement<WS100228AddressMoreInfo> createWS100228AddressMoreInfo(WS100228AddressMoreInfo value) {
        return new JAXBElement<WS100228AddressMoreInfo>(_WS100228AddressMoreInfo_QNAME, WS100228AddressMoreInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100228AddressMoreInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100228AddressMoreInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100228_addressMoreInfoResponse")
    public JAXBElement<WS100228AddressMoreInfoResponse> createWS100228AddressMoreInfoResponse(WS100228AddressMoreInfoResponse value) {
        return new JAXBElement<WS100228AddressMoreInfoResponse>(_WS100228AddressMoreInfoResponse_QNAME, WS100228AddressMoreInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100229AddressListInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100229AddressListInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100229_addressListInfo")
    public JAXBElement<WS100229AddressListInfo> createWS100229AddressListInfo(WS100229AddressListInfo value) {
        return new JAXBElement<WS100229AddressListInfo>(_WS100229AddressListInfo_QNAME, WS100229AddressListInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100229AddressListInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100229AddressListInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100229_addressListInfoResponse")
    public JAXBElement<WS100229AddressListInfoResponse> createWS100229AddressListInfoResponse(WS100229AddressListInfoResponse value) {
        return new JAXBElement<WS100229AddressListInfoResponse>(_WS100229AddressListInfoResponse_QNAME, WS100229AddressListInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100230LandRelatedUsersInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100230LandRelatedUsersInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100230_landRelatedUsersInfo")
    public JAXBElement<WS100230LandRelatedUsersInfo> createWS100230LandRelatedUsersInfo(WS100230LandRelatedUsersInfo value) {
        return new JAXBElement<WS100230LandRelatedUsersInfo>(_WS100230LandRelatedUsersInfo_QNAME, WS100230LandRelatedUsersInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100230LandRelatedUsersInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100230LandRelatedUsersInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100230_landRelatedUsersInfoResponse")
    public JAXBElement<WS100230LandRelatedUsersInfoResponse> createWS100230LandRelatedUsersInfoResponse(WS100230LandRelatedUsersInfoResponse value) {
        return new JAXBElement<WS100230LandRelatedUsersInfoResponse>(_WS100230LandRelatedUsersInfoResponse_QNAME, WS100230LandRelatedUsersInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100231LandValuationInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100231LandValuationInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100231_landValuationInfo")
    public JAXBElement<WS100231LandValuationInfo> createWS100231LandValuationInfo(WS100231LandValuationInfo value) {
        return new JAXBElement<WS100231LandValuationInfo>(_WS100231LandValuationInfo_QNAME, WS100231LandValuationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100231LandValuationInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100231LandValuationInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100231_landValuationInfoResponse")
    public JAXBElement<WS100231LandValuationInfoResponse> createWS100231LandValuationInfoResponse(WS100231LandValuationInfoResponse value) {
        return new JAXBElement<WS100231LandValuationInfoResponse>(_WS100231LandValuationInfoResponse_QNAME, WS100231LandValuationInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100232LandOwningInfoByPersonId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100232LandOwningInfoByPersonId }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100232_landOwningInfoByPersonId")
    public JAXBElement<WS100232LandOwningInfoByPersonId> createWS100232LandOwningInfoByPersonId(WS100232LandOwningInfoByPersonId value) {
        return new JAXBElement<WS100232LandOwningInfoByPersonId>(_WS100232LandOwningInfoByPersonId_QNAME, WS100232LandOwningInfoByPersonId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100232LandOwningInfoByPersonIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100232LandOwningInfoByPersonIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100232_landOwningInfoByPersonIdResponse")
    public JAXBElement<WS100232LandOwningInfoByPersonIdResponse> createWS100232LandOwningInfoByPersonIdResponse(WS100232LandOwningInfoByPersonIdResponse value) {
        return new JAXBElement<WS100232LandOwningInfoByPersonIdResponse>(_WS100232LandOwningInfoByPersonIdResponse_QNAME, WS100232LandOwningInfoByPersonIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100233LandRelatedInfoByParcelId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100233LandRelatedInfoByParcelId }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100233_landRelatedInfoByParcelId")
    public JAXBElement<WS100233LandRelatedInfoByParcelId> createWS100233LandRelatedInfoByParcelId(WS100233LandRelatedInfoByParcelId value) {
        return new JAXBElement<WS100233LandRelatedInfoByParcelId>(_WS100233LandRelatedInfoByParcelId_QNAME, WS100233LandRelatedInfoByParcelId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100233LandRelatedInfoByParcelIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100233LandRelatedInfoByParcelIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100233_landRelatedInfoByParcelIdResponse")
    public JAXBElement<WS100233LandRelatedInfoByParcelIdResponse> createWS100233LandRelatedInfoByParcelIdResponse(WS100233LandRelatedInfoByParcelIdResponse value) {
        return new JAXBElement<WS100233LandRelatedInfoByParcelIdResponse>(_WS100233LandRelatedInfoByParcelIdResponse_QNAME, WS100233LandRelatedInfoByParcelIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100234LandCadastreAgreementInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100234LandCadastreAgreementInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100234_landCadastreAgreementInfo")
    public JAXBElement<WS100234LandCadastreAgreementInfo> createWS100234LandCadastreAgreementInfo(WS100234LandCadastreAgreementInfo value) {
        return new JAXBElement<WS100234LandCadastreAgreementInfo>(_WS100234LandCadastreAgreementInfo_QNAME, WS100234LandCadastreAgreementInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100234LandCadastreAgreementInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100234LandCadastreAgreementInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100234_landCadastreAgreementInfoResponse")
    public JAXBElement<WS100234LandCadastreAgreementInfoResponse> createWS100234LandCadastreAgreementInfoResponse(WS100234LandCadastreAgreementInfoResponse value) {
        return new JAXBElement<WS100234LandCadastreAgreementInfoResponse>(_WS100234LandCadastreAgreementInfoResponse_QNAME, WS100234LandCadastreAgreementInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100235LandCadastreApplicantInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100235LandCadastreApplicantInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100235_landCadastreApplicantInfo")
    public JAXBElement<WS100235LandCadastreApplicantInfo> createWS100235LandCadastreApplicantInfo(WS100235LandCadastreApplicantInfo value) {
        return new JAXBElement<WS100235LandCadastreApplicantInfo>(_WS100235LandCadastreApplicantInfo_QNAME, WS100235LandCadastreApplicantInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100235LandCadastreApplicantInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100235LandCadastreApplicantInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100235_landCadastreApplicantInfoResponse")
    public JAXBElement<WS100235LandCadastreApplicantInfoResponse> createWS100235LandCadastreApplicantInfoResponse(WS100235LandCadastreApplicantInfoResponse value) {
        return new JAXBElement<WS100235LandCadastreApplicantInfoResponse>(_WS100235LandCadastreApplicantInfoResponse_QNAME, WS100235LandCadastreApplicantInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100236LandCadastreQR }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100236LandCadastreQR }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100236_landCadastreQR")
    public JAXBElement<WS100236LandCadastreQR> createWS100236LandCadastreQR(WS100236LandCadastreQR value) {
        return new JAXBElement<WS100236LandCadastreQR>(_WS100236LandCadastreQR_QNAME, WS100236LandCadastreQR.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100236LandCadastreQRResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100236LandCadastreQRResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100236_landCadastreQRResponse")
    public JAXBElement<WS100236LandCadastreQRResponse> createWS100236LandCadastreQRResponse(WS100236LandCadastreQRResponse value) {
        return new JAXBElement<WS100236LandCadastreQRResponse>(_WS100236LandCadastreQRResponse_QNAME, WS100236LandCadastreQRResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100237CadastreApplicantStatusInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100237CadastreApplicantStatusInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100237_cadastreApplicantStatusInfo")
    public JAXBElement<WS100237CadastreApplicantStatusInfo> createWS100237CadastreApplicantStatusInfo(WS100237CadastreApplicantStatusInfo value) {
        return new JAXBElement<WS100237CadastreApplicantStatusInfo>(_WS100237CadastreApplicantStatusInfo_QNAME, WS100237CadastreApplicantStatusInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100237CadastreApplicantStatusInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100237CadastreApplicantStatusInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100237_cadastreApplicantStatusInfoResponse")
    public JAXBElement<WS100237CadastreApplicantStatusInfoResponse> createWS100237CadastreApplicantStatusInfoResponse(WS100237CadastreApplicantStatusInfoResponse value) {
        return new JAXBElement<WS100237CadastreApplicantStatusInfoResponse>(_WS100237CadastreApplicantStatusInfoResponse_QNAME, WS100237CadastreApplicantStatusInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100238LandCadastreVicinityInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100238LandCadastreVicinityInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100238_landCadastreVicinityInfo")
    public JAXBElement<WS100238LandCadastreVicinityInfo> createWS100238LandCadastreVicinityInfo(WS100238LandCadastreVicinityInfo value) {
        return new JAXBElement<WS100238LandCadastreVicinityInfo>(_WS100238LandCadastreVicinityInfo_QNAME, WS100238LandCadastreVicinityInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100238LandCadastreVicinityInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100238LandCadastreVicinityInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100238_landCadastreVicinityInfoResponse")
    public JAXBElement<WS100238LandCadastreVicinityInfoResponse> createWS100238LandCadastreVicinityInfoResponse(WS100238LandCadastreVicinityInfoResponse value) {
        return new JAXBElement<WS100238LandCadastreVicinityInfoResponse>(_WS100238LandCadastreVicinityInfoResponse_QNAME, WS100238LandCadastreVicinityInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100239PropertyDetailsBetweenDate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100239PropertyDetailsBetweenDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100239_propertyDetailsBetweenDate")
    public JAXBElement<WS100239PropertyDetailsBetweenDate> createWS100239PropertyDetailsBetweenDate(WS100239PropertyDetailsBetweenDate value) {
        return new JAXBElement<WS100239PropertyDetailsBetweenDate>(_WS100239PropertyDetailsBetweenDate_QNAME, WS100239PropertyDetailsBetweenDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100239PropertyDetailsBetweenDateResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100239PropertyDetailsBetweenDateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100239_propertyDetailsBetweenDateResponse")
    public JAXBElement<WS100239PropertyDetailsBetweenDateResponse> createWS100239PropertyDetailsBetweenDateResponse(WS100239PropertyDetailsBetweenDateResponse value) {
        return new JAXBElement<WS100239PropertyDetailsBetweenDateResponse>(_WS100239PropertyDetailsBetweenDateResponse_QNAME, WS100239PropertyDetailsBetweenDateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100240LandInfoByPersonIdAndParcelId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100240LandInfoByPersonIdAndParcelId }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100240_landInfoByPersonIdAndParcelId")
    public JAXBElement<WS100240LandInfoByPersonIdAndParcelId> createWS100240LandInfoByPersonIdAndParcelId(WS100240LandInfoByPersonIdAndParcelId value) {
        return new JAXBElement<WS100240LandInfoByPersonIdAndParcelId>(_WS100240LandInfoByPersonIdAndParcelId_QNAME, WS100240LandInfoByPersonIdAndParcelId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100240LandInfoByPersonIdAndParcelIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100240LandInfoByPersonIdAndParcelIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100240_landInfoByPersonIdAndParcelIdResponse")
    public JAXBElement<WS100240LandInfoByPersonIdAndParcelIdResponse> createWS100240LandInfoByPersonIdAndParcelIdResponse(WS100240LandInfoByPersonIdAndParcelIdResponse value) {
        return new JAXBElement<WS100240LandInfoByPersonIdAndParcelIdResponse>(_WS100240LandInfoByPersonIdAndParcelIdResponse_QNAME, WS100240LandInfoByPersonIdAndParcelIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100241LandSettlementAct }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100241LandSettlementAct }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100241_landSettlementAct")
    public JAXBElement<WS100241LandSettlementAct> createWS100241LandSettlementAct(WS100241LandSettlementAct value) {
        return new JAXBElement<WS100241LandSettlementAct>(_WS100241LandSettlementAct_QNAME, WS100241LandSettlementAct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100241LandSettlementActResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100241LandSettlementActResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://property.xyp.gov.mn/", name = "WS100241_landSettlementActResponse")
    public JAXBElement<WS100241LandSettlementActResponse> createWS100241LandSettlementActResponse(WS100241LandSettlementActResponse value) {
        return new JAXBElement<WS100241LandSettlementActResponse>(_WS100241LandSettlementActResponse_QNAME, WS100241LandSettlementActResponse.class, null, value);
    }

}
