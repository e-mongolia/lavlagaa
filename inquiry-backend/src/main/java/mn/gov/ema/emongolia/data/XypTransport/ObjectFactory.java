
package mn.gov.ema.emongolia.data.XypTransport;

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
 * generated in the mn.gov.itc.emongolia.data.XypTransport package. 
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

    private final static QName _WS100401GetVehicleInfo_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100401_getVehicleInfo");
    private final static QName _WS100401GetVehicleInfoResponse_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100401_getVehicleInfoResponse");
    private final static QName _WS100402GetVehicleOwnerHistoryList_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100402_getVehicleOwnerHistoryList");
    private final static QName _WS100402GetVehicleOwnerHistoryListResponse_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100402_getVehicleOwnerHistoryListResponse");
    private final static QName _WS100403GetVehiclePenaltyList_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100403_getVehiclePenaltyList");
    private final static QName _WS100403GetVehiclePenaltyListResponse_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100403_getVehiclePenaltyListResponse");
    private final static QName _WS100404GetECDataInfo_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100404_getECDataInfo");
    private final static QName _WS100404GetECDataInfoResponse_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100404_getECDataInfoResponse");
    private final static QName _WS100405GetVehicleTaxInfo_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100405_getVehicleTaxInfo");
    private final static QName _WS100405GetVehicleTaxInfoResponse_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100405_getVehicleTaxInfoResponse");
    private final static QName _WS100406GetCitizenVehicleList_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100406_getCitizenVehicleList");
    private final static QName _WS100406GetCitizenVehicleListResponse_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100406_getCitizenVehicleListResponse");
    private final static QName _WS100407GetDriverLicenseInfo_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100407_getDriverLicenseInfo");
    private final static QName _WS100407GetDriverLicenseInfoResponse_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100407_getDriverLicenseInfoResponse");
    private final static QName _WS100408UpdatePenaltyPayment_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100408_updatePenaltyPayment");
    private final static QName _WS100408UpdatePenaltyPaymentResponse_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100408_updatePenaltyPaymentResponse");
    private final static QName _WS100409GetVehicleInspectionInfo_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100409_getVehicleInspectionInfo");
    private final static QName _WS100409GetVehicleInspectionInfoResponse_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100409_getVehicleInspectionInfoResponse");
    private final static QName _WS100410IsVehicleCheck_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100410_isVehicleCheck");
    private final static QName _WS100410IsVehicleCheckResponse_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100410_isVehicleCheckResponse");
    private final static QName _WS100411VehicleImportInfo_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100411_vehicleImportInfo");
    private final static QName _WS100411VehicleImportInfoResponse_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100411_vehicleImportInfoResponse");
    private final static QName _WS100412GetTransportInfo_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100412_getTransportInfo");
    private final static QName _WS100412GetTransportInfoResponse_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100412_getTransportInfoResponse");
    private final static QName _WS100413GetInternationalDriverLicenseInfo_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100413_getInternationalDriverLicenseInfo");
    private final static QName _WS100413GetInternationalDriverLicenseInfoResponse_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100413_getInternationalDriverLicenseInfoResponse");
    private final static QName _WS100414GetImportExportItemList_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100414_getImportExportItemList");
    private final static QName _WS100414GetImportExportItemListResponse_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100414_getImportExportItemListResponse");
    private final static QName _WS100415VehicleInfoList_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100415_vehicleInfoList");
    private final static QName _WS100415VehicleInfoListResponse_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100415_vehicleInfoListResponse");
    private final static QName _WS100416GetOwnerInfo_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100416_getOwnerInfo");
    private final static QName _WS100416GetOwnerInfoResponse_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100416_getOwnerInfoResponse");
    private final static QName _WS100417SpecialDriverInfo_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100417_specialDriverInfo");
    private final static QName _WS100417SpecialDriverInfoResponse_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100417_specialDriverInfoResponse");
    private final static QName _WS100418VehicleLimitedInfo_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100418_vehicleLimitedInfo");
    private final static QName _WS100418VehicleLimitedInfoResponse_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100418_vehicleLimitedInfoResponse");
    private final static QName _WS100419VehicleBorderPass_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100419_vehicleBorderPass");
    private final static QName _WS100419VehicleBorderPassResponse_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100419_vehicleBorderPassResponse");
    private final static QName _WS100420GetOrganizationVehicleList_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100420_getOrganizationVehicleList");
    private final static QName _WS100420GetOrganizationVehicleListResponse_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100420_getOrganizationVehicleListResponse");
    private final static QName _WS100421GetPreOwnedVehicle_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100421_getPreOwnedVehicle");
    private final static QName _WS100421GetPreOwnedVehicleResponse_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100421_getPreOwnedVehicleResponse");
    private final static QName _WS100422GetCitizenPenaltyList_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100422_getCitizenPenaltyList");
    private final static QName _WS100422GetCitizenPenaltyListResponse_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100422_getCitizenPenaltyListResponse");
    private final static QName _WS100423BorderRegisteredTransportInfo_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100423_borderRegisteredTransportInfo");
    private final static QName _WS100423BorderRegisteredTransportInfoResponse_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100423_borderRegisteredTransportInfoResponse");
    private final static QName _WS100424BorderRegisteredPassengerInfo_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100424_borderRegisteredPassengerInfo");
    private final static QName _WS100424BorderRegisteredPassengerInfoResponse_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100424_borderRegisteredPassengerInfoResponse");
    private final static QName _WS100425GetImportExportItemExpandList_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100425_getImportExportItemExpandList");
    private final static QName _WS100425GetImportExportItemExpandListResponse_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100425_getImportExportItemExpandListResponse");
    private final static QName _WS100426TransportGetOrganizationInfo_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100426_transportGetOrganizationInfo");
    private final static QName _WS100426TransportGetOrganizationInfoResponse_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100426_transportGetOrganizationInfoResponse");
    private final static QName _WS100427TransportOrganizationCarsInfo_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100427_transportOrganizationCarsInfo");
    private final static QName _WS100427TransportOrganizationCarsInfoResponse_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100427_transportOrganizationCarsInfoResponse");
    private final static QName _WS100428TransportCheckGPSPayment_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100428_transportCheckGPSPayment");
    private final static QName _WS100428TransportCheckGPSPaymentResponse_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100428_transportCheckGPSPaymentResponse");
    private final static QName _WS100429TransportConclutionResponseInfo_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100429_transportConclutionResponseInfo");
    private final static QName _WS100429TransportConclutionResponseInfoResponse_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100429_transportConclutionResponseInfoResponse");
    private final static QName _WS100430TransportConflictInfo_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100430_transportConflictInfo");
    private final static QName _WS100430TransportConflictInfoResponse_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100430_transportConflictInfoResponse");
    private final static QName _WS100431PermittedVehiclesList_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100431_permittedVehiclesList");
    private final static QName _WS100431PermittedVehiclesListResponse_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100431_permittedVehiclesListResponse");
    private final static QName _WS100432GetVehicleInspectionDataByPlateNo_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100432_getVehicleInspectionDataByPlateNo");
    private final static QName _WS100432GetVehicleInspectionDataByPlateNoResponse_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100432_getVehicleInspectionDataByPlateNoResponse");
    private final static QName _WS100433UnlicensedVehiclesList_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100433_unlicensedVehiclesList");
    private final static QName _WS100433UnlicensedVehiclesListResponse_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100433_unlicensedVehiclesListResponse");
    private final static QName _WS100434CheckECLIcenseFromKiosk_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100434_checkECLIcenseFromKiosk");
    private final static QName _WS100434CheckECLIcenseFromKioskResponse_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100434_checkECLIcenseFromKioskResponse");
    private final static QName _WS100435GetPreOwnedVehicleWithOrgRegnum_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100435_getPreOwnedVehicleWithOrgRegnum");
    private final static QName _WS100435GetPreOwnedVehicleWithOrgRegnumResponse_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100435_getPreOwnedVehicleWithOrgRegnumResponse");
    private final static QName _WS100436VehicleLegalEntityInfo_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100436_vehicleLegalEntityInfo");
    private final static QName _WS100436VehicleLegalEntityInfoResponse_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100436_vehicleLegalEntityInfoResponse");
    private final static QName _WS100437VehicleLegalEntityTotal_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100437_vehicleLegalEntityTotal");
    private final static QName _WS100437VehicleLegalEntityTotalResponse_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100437_vehicleLegalEntityTotalResponse");
    private final static QName _WS100438GetPreOwnedOrgVehicleTotal_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100438_getPreOwnedOrgVehicleTotal");
    private final static QName _WS100438GetPreOwnedOrgVehicleTotalResponse_QNAME = new QName("http://transport.xyp.gov.mn/", "WS100438_getPreOwnedOrgVehicleTotalResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mn.gov.itc.emongolia.data.XypTransport
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WS100401GetVehicleInfo }
     * 
     */
    public WS100401GetVehicleInfo createWS100401GetVehicleInfo() {
        return new WS100401GetVehicleInfo();
    }

    /**
     * Create an instance of {@link WS100401GetVehicleInfoResponse }
     * 
     */
    public WS100401GetVehicleInfoResponse createWS100401GetVehicleInfoResponse() {
        return new WS100401GetVehicleInfoResponse();
    }

    /**
     * Create an instance of {@link WS100402GetVehicleOwnerHistoryList }
     * 
     */
    public WS100402GetVehicleOwnerHistoryList createWS100402GetVehicleOwnerHistoryList() {
        return new WS100402GetVehicleOwnerHistoryList();
    }

    /**
     * Create an instance of {@link WS100402GetVehicleOwnerHistoryListResponse }
     * 
     */
    public WS100402GetVehicleOwnerHistoryListResponse createWS100402GetVehicleOwnerHistoryListResponse() {
        return new WS100402GetVehicleOwnerHistoryListResponse();
    }

    /**
     * Create an instance of {@link WS100403GetVehiclePenaltyList }
     * 
     */
    public WS100403GetVehiclePenaltyList createWS100403GetVehiclePenaltyList() {
        return new WS100403GetVehiclePenaltyList();
    }

    /**
     * Create an instance of {@link WS100403GetVehiclePenaltyListResponse }
     * 
     */
    public WS100403GetVehiclePenaltyListResponse createWS100403GetVehiclePenaltyListResponse() {
        return new WS100403GetVehiclePenaltyListResponse();
    }

    /**
     * Create an instance of {@link WS100404GetECDataInfo }
     * 
     */
    public WS100404GetECDataInfo createWS100404GetECDataInfo() {
        return new WS100404GetECDataInfo();
    }

    /**
     * Create an instance of {@link WS100404GetECDataInfoResponse }
     * 
     */
    public WS100404GetECDataInfoResponse createWS100404GetECDataInfoResponse() {
        return new WS100404GetECDataInfoResponse();
    }

    /**
     * Create an instance of {@link WS100405GetVehicleTaxInfo }
     * 
     */
    public WS100405GetVehicleTaxInfo createWS100405GetVehicleTaxInfo() {
        return new WS100405GetVehicleTaxInfo();
    }

    /**
     * Create an instance of {@link WS100405GetVehicleTaxInfoResponse }
     * 
     */
    public WS100405GetVehicleTaxInfoResponse createWS100405GetVehicleTaxInfoResponse() {
        return new WS100405GetVehicleTaxInfoResponse();
    }

    /**
     * Create an instance of {@link WS100406GetCitizenVehicleList }
     * 
     */
    public WS100406GetCitizenVehicleList createWS100406GetCitizenVehicleList() {
        return new WS100406GetCitizenVehicleList();
    }

    /**
     * Create an instance of {@link WS100406GetCitizenVehicleListResponse }
     * 
     */
    public WS100406GetCitizenVehicleListResponse createWS100406GetCitizenVehicleListResponse() {
        return new WS100406GetCitizenVehicleListResponse();
    }

    /**
     * Create an instance of {@link WS100407GetDriverLicenseInfo }
     * 
     */
    public WS100407GetDriverLicenseInfo createWS100407GetDriverLicenseInfo() {
        return new WS100407GetDriverLicenseInfo();
    }

    /**
     * Create an instance of {@link WS100407GetDriverLicenseInfoResponse }
     * 
     */
    public WS100407GetDriverLicenseInfoResponse createWS100407GetDriverLicenseInfoResponse() {
        return new WS100407GetDriverLicenseInfoResponse();
    }

    /**
     * Create an instance of {@link WS100408UpdatePenaltyPayment }
     * 
     */
    public WS100408UpdatePenaltyPayment createWS100408UpdatePenaltyPayment() {
        return new WS100408UpdatePenaltyPayment();
    }

    /**
     * Create an instance of {@link WS100408UpdatePenaltyPaymentResponse }
     * 
     */
    public WS100408UpdatePenaltyPaymentResponse createWS100408UpdatePenaltyPaymentResponse() {
        return new WS100408UpdatePenaltyPaymentResponse();
    }

    /**
     * Create an instance of {@link WS100409GetVehicleInspectionInfo }
     * 
     */
    public WS100409GetVehicleInspectionInfo createWS100409GetVehicleInspectionInfo() {
        return new WS100409GetVehicleInspectionInfo();
    }

    /**
     * Create an instance of {@link WS100409GetVehicleInspectionInfoResponse }
     * 
     */
    public WS100409GetVehicleInspectionInfoResponse createWS100409GetVehicleInspectionInfoResponse() {
        return new WS100409GetVehicleInspectionInfoResponse();
    }

    /**
     * Create an instance of {@link WS100410IsVehicleCheck }
     * 
     */
    public WS100410IsVehicleCheck createWS100410IsVehicleCheck() {
        return new WS100410IsVehicleCheck();
    }

    /**
     * Create an instance of {@link WS100410IsVehicleCheckResponse }
     * 
     */
    public WS100410IsVehicleCheckResponse createWS100410IsVehicleCheckResponse() {
        return new WS100410IsVehicleCheckResponse();
    }

    /**
     * Create an instance of {@link WS100411VehicleImportInfo }
     * 
     */
    public WS100411VehicleImportInfo createWS100411VehicleImportInfo() {
        return new WS100411VehicleImportInfo();
    }

    /**
     * Create an instance of {@link WS100411VehicleImportInfoResponse }
     * 
     */
    public WS100411VehicleImportInfoResponse createWS100411VehicleImportInfoResponse() {
        return new WS100411VehicleImportInfoResponse();
    }

    /**
     * Create an instance of {@link WS100412GetTransportInfo }
     * 
     */
    public WS100412GetTransportInfo createWS100412GetTransportInfo() {
        return new WS100412GetTransportInfo();
    }

    /**
     * Create an instance of {@link WS100412GetTransportInfoResponse }
     * 
     */
    public WS100412GetTransportInfoResponse createWS100412GetTransportInfoResponse() {
        return new WS100412GetTransportInfoResponse();
    }

    /**
     * Create an instance of {@link WS100413GetInternationalDriverLicenseInfo }
     * 
     */
    public WS100413GetInternationalDriverLicenseInfo createWS100413GetInternationalDriverLicenseInfo() {
        return new WS100413GetInternationalDriverLicenseInfo();
    }

    /**
     * Create an instance of {@link WS100413GetInternationalDriverLicenseInfoResponse }
     * 
     */
    public WS100413GetInternationalDriverLicenseInfoResponse createWS100413GetInternationalDriverLicenseInfoResponse() {
        return new WS100413GetInternationalDriverLicenseInfoResponse();
    }

    /**
     * Create an instance of {@link WS100414GetImportExportItemList }
     * 
     */
    public WS100414GetImportExportItemList createWS100414GetImportExportItemList() {
        return new WS100414GetImportExportItemList();
    }

    /**
     * Create an instance of {@link WS100414GetImportExportItemListResponse }
     * 
     */
    public WS100414GetImportExportItemListResponse createWS100414GetImportExportItemListResponse() {
        return new WS100414GetImportExportItemListResponse();
    }

    /**
     * Create an instance of {@link WS100415VehicleInfoList }
     * 
     */
    public WS100415VehicleInfoList createWS100415VehicleInfoList() {
        return new WS100415VehicleInfoList();
    }

    /**
     * Create an instance of {@link WS100415VehicleInfoListResponse }
     * 
     */
    public WS100415VehicleInfoListResponse createWS100415VehicleInfoListResponse() {
        return new WS100415VehicleInfoListResponse();
    }

    /**
     * Create an instance of {@link WS100416GetOwnerInfo }
     * 
     */
    public WS100416GetOwnerInfo createWS100416GetOwnerInfo() {
        return new WS100416GetOwnerInfo();
    }

    /**
     * Create an instance of {@link WS100416GetOwnerInfoResponse }
     * 
     */
    public WS100416GetOwnerInfoResponse createWS100416GetOwnerInfoResponse() {
        return new WS100416GetOwnerInfoResponse();
    }

    /**
     * Create an instance of {@link WS100417SpecialDriverInfo }
     * 
     */
    public WS100417SpecialDriverInfo createWS100417SpecialDriverInfo() {
        return new WS100417SpecialDriverInfo();
    }

    /**
     * Create an instance of {@link WS100417SpecialDriverInfoResponse }
     * 
     */
    public WS100417SpecialDriverInfoResponse createWS100417SpecialDriverInfoResponse() {
        return new WS100417SpecialDriverInfoResponse();
    }

    /**
     * Create an instance of {@link WS100418VehicleLimitedInfo }
     * 
     */
    public WS100418VehicleLimitedInfo createWS100418VehicleLimitedInfo() {
        return new WS100418VehicleLimitedInfo();
    }

    /**
     * Create an instance of {@link WS100418VehicleLimitedInfoResponse }
     * 
     */
    public WS100418VehicleLimitedInfoResponse createWS100418VehicleLimitedInfoResponse() {
        return new WS100418VehicleLimitedInfoResponse();
    }

    /**
     * Create an instance of {@link WS100419VehicleBorderPass }
     * 
     */
    public WS100419VehicleBorderPass createWS100419VehicleBorderPass() {
        return new WS100419VehicleBorderPass();
    }

    /**
     * Create an instance of {@link WS100419VehicleBorderPassResponse }
     * 
     */
    public WS100419VehicleBorderPassResponse createWS100419VehicleBorderPassResponse() {
        return new WS100419VehicleBorderPassResponse();
    }

    /**
     * Create an instance of {@link WS100420GetOrganizationVehicleList }
     * 
     */
    public WS100420GetOrganizationVehicleList createWS100420GetOrganizationVehicleList() {
        return new WS100420GetOrganizationVehicleList();
    }

    /**
     * Create an instance of {@link WS100420GetOrganizationVehicleListResponse }
     * 
     */
    public WS100420GetOrganizationVehicleListResponse createWS100420GetOrganizationVehicleListResponse() {
        return new WS100420GetOrganizationVehicleListResponse();
    }

    /**
     * Create an instance of {@link WS100421GetPreOwnedVehicle }
     * 
     */
    public WS100421GetPreOwnedVehicle createWS100421GetPreOwnedVehicle() {
        return new WS100421GetPreOwnedVehicle();
    }

    /**
     * Create an instance of {@link WS100421GetPreOwnedVehicleResponse }
     * 
     */
    public WS100421GetPreOwnedVehicleResponse createWS100421GetPreOwnedVehicleResponse() {
        return new WS100421GetPreOwnedVehicleResponse();
    }

    /**
     * Create an instance of {@link WS100422GetCitizenPenaltyList }
     * 
     */
    public WS100422GetCitizenPenaltyList createWS100422GetCitizenPenaltyList() {
        return new WS100422GetCitizenPenaltyList();
    }

    /**
     * Create an instance of {@link WS100422GetCitizenPenaltyListResponse }
     * 
     */
    public WS100422GetCitizenPenaltyListResponse createWS100422GetCitizenPenaltyListResponse() {
        return new WS100422GetCitizenPenaltyListResponse();
    }

    /**
     * Create an instance of {@link WS100423BorderRegisteredTransportInfo }
     * 
     */
    public WS100423BorderRegisteredTransportInfo createWS100423BorderRegisteredTransportInfo() {
        return new WS100423BorderRegisteredTransportInfo();
    }

    /**
     * Create an instance of {@link WS100423BorderRegisteredTransportInfoResponse }
     * 
     */
    public WS100423BorderRegisteredTransportInfoResponse createWS100423BorderRegisteredTransportInfoResponse() {
        return new WS100423BorderRegisteredTransportInfoResponse();
    }

    /**
     * Create an instance of {@link WS100424BorderRegisteredPassengerInfo }
     * 
     */
    public WS100424BorderRegisteredPassengerInfo createWS100424BorderRegisteredPassengerInfo() {
        return new WS100424BorderRegisteredPassengerInfo();
    }

    /**
     * Create an instance of {@link WS100424BorderRegisteredPassengerInfoResponse }
     * 
     */
    public WS100424BorderRegisteredPassengerInfoResponse createWS100424BorderRegisteredPassengerInfoResponse() {
        return new WS100424BorderRegisteredPassengerInfoResponse();
    }

    /**
     * Create an instance of {@link WS100425GetImportExportItemExpandList }
     * 
     */
    public WS100425GetImportExportItemExpandList createWS100425GetImportExportItemExpandList() {
        return new WS100425GetImportExportItemExpandList();
    }

    /**
     * Create an instance of {@link WS100425GetImportExportItemExpandListResponse }
     * 
     */
    public WS100425GetImportExportItemExpandListResponse createWS100425GetImportExportItemExpandListResponse() {
        return new WS100425GetImportExportItemExpandListResponse();
    }

    /**
     * Create an instance of {@link WS100426TransportGetOrganizationInfo }
     * 
     */
    public WS100426TransportGetOrganizationInfo createWS100426TransportGetOrganizationInfo() {
        return new WS100426TransportGetOrganizationInfo();
    }

    /**
     * Create an instance of {@link WS100426TransportGetOrganizationInfoResponse }
     * 
     */
    public WS100426TransportGetOrganizationInfoResponse createWS100426TransportGetOrganizationInfoResponse() {
        return new WS100426TransportGetOrganizationInfoResponse();
    }

    /**
     * Create an instance of {@link WS100427TransportOrganizationCarsInfo }
     * 
     */
    public WS100427TransportOrganizationCarsInfo createWS100427TransportOrganizationCarsInfo() {
        return new WS100427TransportOrganizationCarsInfo();
    }

    /**
     * Create an instance of {@link WS100427TransportOrganizationCarsInfoResponse }
     * 
     */
    public WS100427TransportOrganizationCarsInfoResponse createWS100427TransportOrganizationCarsInfoResponse() {
        return new WS100427TransportOrganizationCarsInfoResponse();
    }

    /**
     * Create an instance of {@link WS100428TransportCheckGPSPayment }
     * 
     */
    public WS100428TransportCheckGPSPayment createWS100428TransportCheckGPSPayment() {
        return new WS100428TransportCheckGPSPayment();
    }

    /**
     * Create an instance of {@link WS100428TransportCheckGPSPaymentResponse }
     * 
     */
    public WS100428TransportCheckGPSPaymentResponse createWS100428TransportCheckGPSPaymentResponse() {
        return new WS100428TransportCheckGPSPaymentResponse();
    }

    /**
     * Create an instance of {@link WS100429TransportConclutionResponseInfo }
     * 
     */
    public WS100429TransportConclutionResponseInfo createWS100429TransportConclutionResponseInfo() {
        return new WS100429TransportConclutionResponseInfo();
    }

    /**
     * Create an instance of {@link WS100429TransportConclutionResponseInfoResponse }
     * 
     */
    public WS100429TransportConclutionResponseInfoResponse createWS100429TransportConclutionResponseInfoResponse() {
        return new WS100429TransportConclutionResponseInfoResponse();
    }

    /**
     * Create an instance of {@link WS100430TransportConflictInfo }
     * 
     */
    public WS100430TransportConflictInfo createWS100430TransportConflictInfo() {
        return new WS100430TransportConflictInfo();
    }

    /**
     * Create an instance of {@link WS100430TransportConflictInfoResponse }
     * 
     */
    public WS100430TransportConflictInfoResponse createWS100430TransportConflictInfoResponse() {
        return new WS100430TransportConflictInfoResponse();
    }

    /**
     * Create an instance of {@link WS100431PermittedVehiclesList }
     * 
     */
    public WS100431PermittedVehiclesList createWS100431PermittedVehiclesList() {
        return new WS100431PermittedVehiclesList();
    }

    /**
     * Create an instance of {@link WS100431PermittedVehiclesListResponse }
     * 
     */
    public WS100431PermittedVehiclesListResponse createWS100431PermittedVehiclesListResponse() {
        return new WS100431PermittedVehiclesListResponse();
    }

    /**
     * Create an instance of {@link WS100432GetVehicleInspectionDataByPlateNo }
     * 
     */
    public WS100432GetVehicleInspectionDataByPlateNo createWS100432GetVehicleInspectionDataByPlateNo() {
        return new WS100432GetVehicleInspectionDataByPlateNo();
    }

    /**
     * Create an instance of {@link WS100432GetVehicleInspectionDataByPlateNoResponse }
     * 
     */
    public WS100432GetVehicleInspectionDataByPlateNoResponse createWS100432GetVehicleInspectionDataByPlateNoResponse() {
        return new WS100432GetVehicleInspectionDataByPlateNoResponse();
    }

    /**
     * Create an instance of {@link WS100433UnlicensedVehiclesList }
     * 
     */
    public WS100433UnlicensedVehiclesList createWS100433UnlicensedVehiclesList() {
        return new WS100433UnlicensedVehiclesList();
    }

    /**
     * Create an instance of {@link WS100433UnlicensedVehiclesListResponse }
     * 
     */
    public WS100433UnlicensedVehiclesListResponse createWS100433UnlicensedVehiclesListResponse() {
        return new WS100433UnlicensedVehiclesListResponse();
    }

    /**
     * Create an instance of {@link WS100434CheckECLIcenseFromKiosk }
     * 
     */
    public WS100434CheckECLIcenseFromKiosk createWS100434CheckECLIcenseFromKiosk() {
        return new WS100434CheckECLIcenseFromKiosk();
    }

    /**
     * Create an instance of {@link WS100434CheckECLIcenseFromKioskResponse }
     * 
     */
    public WS100434CheckECLIcenseFromKioskResponse createWS100434CheckECLIcenseFromKioskResponse() {
        return new WS100434CheckECLIcenseFromKioskResponse();
    }

    /**
     * Create an instance of {@link WS100435GetPreOwnedVehicleWithOrgRegnum }
     * 
     */
    public WS100435GetPreOwnedVehicleWithOrgRegnum createWS100435GetPreOwnedVehicleWithOrgRegnum() {
        return new WS100435GetPreOwnedVehicleWithOrgRegnum();
    }

    /**
     * Create an instance of {@link WS100435GetPreOwnedVehicleWithOrgRegnumResponse }
     * 
     */
    public WS100435GetPreOwnedVehicleWithOrgRegnumResponse createWS100435GetPreOwnedVehicleWithOrgRegnumResponse() {
        return new WS100435GetPreOwnedVehicleWithOrgRegnumResponse();
    }

    /**
     * Create an instance of {@link WS100436VehicleLegalEntityInfo }
     * 
     */
    public WS100436VehicleLegalEntityInfo createWS100436VehicleLegalEntityInfo() {
        return new WS100436VehicleLegalEntityInfo();
    }

    /**
     * Create an instance of {@link WS100436VehicleLegalEntityInfoResponse }
     * 
     */
    public WS100436VehicleLegalEntityInfoResponse createWS100436VehicleLegalEntityInfoResponse() {
        return new WS100436VehicleLegalEntityInfoResponse();
    }

    /**
     * Create an instance of {@link WS100437VehicleLegalEntityTotal }
     * 
     */
    public WS100437VehicleLegalEntityTotal createWS100437VehicleLegalEntityTotal() {
        return new WS100437VehicleLegalEntityTotal();
    }

    /**
     * Create an instance of {@link WS100437VehicleLegalEntityTotalResponse }
     * 
     */
    public WS100437VehicleLegalEntityTotalResponse createWS100437VehicleLegalEntityTotalResponse() {
        return new WS100437VehicleLegalEntityTotalResponse();
    }

    /**
     * Create an instance of {@link WS100438GetPreOwnedOrgVehicleTotal }
     * 
     */
    public WS100438GetPreOwnedOrgVehicleTotal createWS100438GetPreOwnedOrgVehicleTotal() {
        return new WS100438GetPreOwnedOrgVehicleTotal();
    }

    /**
     * Create an instance of {@link WS100438GetPreOwnedOrgVehicleTotalResponse }
     * 
     */
    public WS100438GetPreOwnedOrgVehicleTotalResponse createWS100438GetPreOwnedOrgVehicleTotalResponse() {
        return new WS100438GetPreOwnedOrgVehicleTotalResponse();
    }

    /**
     * Create an instance of {@link GetECDataRequestData }
     * 
     */
    public GetECDataRequestData createGetECDataRequestData() {
        return new GetECDataRequestData();
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
     * Create an instance of {@link TransportConflictData }
     * 
     */
    public TransportConflictData createTransportConflictData() {
        return new TransportConflictData();
    }

    /**
     * Create an instance of {@link TransportConflictDetailData }
     * 
     */
    public TransportConflictDetailData createTransportConflictDetailData() {
        return new TransportConflictDetailData();
    }

    /**
     * Create an instance of {@link ServiceUpdatePenaltyPaymentRequestData }
     * 
     */
    public ServiceUpdatePenaltyPaymentRequestData createServiceUpdatePenaltyPaymentRequestData() {
        return new ServiceUpdatePenaltyPaymentRequestData();
    }

    /**
     * Create an instance of {@link UpdatePenaltyPaymentData }
     * 
     */
    public UpdatePenaltyPaymentData createUpdatePenaltyPaymentData() {
        return new UpdatePenaltyPaymentData();
    }

    /**
     * Create an instance of {@link VehicleBorderPassRequestData }
     * 
     */
    public VehicleBorderPassRequestData createVehicleBorderPassRequestData() {
        return new VehicleBorderPassRequestData();
    }

    /**
     * Create an instance of {@link BorderRegisteredPassengersData }
     * 
     */
    public BorderRegisteredPassengersData createBorderRegisteredPassengersData() {
        return new BorderRegisteredPassengersData();
    }

    /**
     * Create an instance of {@link BorderRegisteredPassengersDetialData }
     * 
     */
    public BorderRegisteredPassengersDetialData createBorderRegisteredPassengersDetialData() {
        return new BorderRegisteredPassengersDetialData();
    }

    /**
     * Create an instance of {@link ServiceDriverLicenseInfoData }
     * 
     */
    public ServiceDriverLicenseInfoData createServiceDriverLicenseInfoData() {
        return new ServiceDriverLicenseInfoData();
    }

    /**
     * Create an instance of {@link DriverLicenseInfoData }
     * 
     */
    public DriverLicenseInfoData createDriverLicenseInfoData() {
        return new DriverLicenseInfoData();
    }

    /**
     * Create an instance of {@link DriverLicenseClassifyData }
     * 
     */
    public DriverLicenseClassifyData createDriverLicenseClassifyData() {
        return new DriverLicenseClassifyData();
    }

    /**
     * Create an instance of {@link DriverScoreDetailData }
     * 
     */
    public DriverScoreDetailData createDriverScoreDetailData() {
        return new DriverScoreDetailData();
    }

    /**
     * Create an instance of {@link GetECData }
     * 
     */
    public GetECData createGetECData() {
        return new GetECData();
    }

    /**
     * Create an instance of {@link VehicleLimitedRequestData }
     * 
     */
    public VehicleLimitedRequestData createVehicleLimitedRequestData() {
        return new VehicleLimitedRequestData();
    }

    /**
     * Create an instance of {@link VehicleLimitedData }
     * 
     */
    public VehicleLimitedData createVehicleLimitedData() {
        return new VehicleLimitedData();
    }

    /**
     * Create an instance of {@link VehicleLimitedDetailData }
     * 
     */
    public VehicleLimitedDetailData createVehicleLimitedDetailData() {
        return new VehicleLimitedDetailData();
    }

    /**
     * Create an instance of {@link VehicleListRequestData }
     * 
     */
    public VehicleListRequestData createVehicleListRequestData() {
        return new VehicleListRequestData();
    }

    /**
     * Create an instance of {@link VehicleListData }
     * 
     */
    public VehicleListData createVehicleListData() {
        return new VehicleListData();
    }

    /**
     * Create an instance of {@link GetImportExportRequestData }
     * 
     */
    public GetImportExportRequestData createGetImportExportRequestData() {
        return new GetImportExportRequestData();
    }

    /**
     * Create an instance of {@link GetImportExportItemData }
     * 
     */
    public GetImportExportItemData createGetImportExportItemData() {
        return new GetImportExportItemData();
    }

    /**
     * Create an instance of {@link GetImportExportItemDetail }
     * 
     */
    public GetImportExportItemDetail createGetImportExportItemDetail() {
        return new GetImportExportItemDetail();
    }

    /**
     * Create an instance of {@link CitizenPenaltyListRequestData }
     * 
     */
    public CitizenPenaltyListRequestData createCitizenPenaltyListRequestData() {
        return new CitizenPenaltyListRequestData();
    }

    /**
     * Create an instance of {@link CitizenPenaltyListData }
     * 
     */
    public CitizenPenaltyListData createCitizenPenaltyListData() {
        return new CitizenPenaltyListData();
    }

    /**
     * Create an instance of {@link CitizenPenaltyListDetailData }
     * 
     */
    public CitizenPenaltyListDetailData createCitizenPenaltyListDetailData() {
        return new CitizenPenaltyListDetailData();
    }

    /**
     * Create an instance of {@link VehicleInspectionRequestData }
     * 
     */
    public VehicleInspectionRequestData createVehicleInspectionRequestData() {
        return new VehicleInspectionRequestData();
    }

    /**
     * Create an instance of {@link VehicleInspectionData }
     * 
     */
    public VehicleInspectionData createVehicleInspectionData() {
        return new VehicleInspectionData();
    }

    /**
     * Create an instance of {@link ServiceVehicleOrganizationRequestData }
     * 
     */
    public ServiceVehicleOrganizationRequestData createServiceVehicleOrganizationRequestData() {
        return new ServiceVehicleOrganizationRequestData();
    }

    /**
     * Create an instance of {@link TransportOrganizationCarsData }
     * 
     */
    public TransportOrganizationCarsData createTransportOrganizationCarsData() {
        return new TransportOrganizationCarsData();
    }

    /**
     * Create an instance of {@link TransportOrganizationCarsDetailData }
     * 
     */
    public TransportOrganizationCarsDetailData createTransportOrganizationCarsDetailData() {
        return new TransportOrganizationCarsDetailData();
    }

    /**
     * Create an instance of {@link VehicleLegalEntityInfoRequestData }
     * 
     */
    public VehicleLegalEntityInfoRequestData createVehicleLegalEntityInfoRequestData() {
        return new VehicleLegalEntityInfoRequestData();
    }

    /**
     * Create an instance of {@link VehicleLegalEntityInfoData }
     * 
     */
    public VehicleLegalEntityInfoData createVehicleLegalEntityInfoData() {
        return new VehicleLegalEntityInfoData();
    }

    /**
     * Create an instance of {@link VehicleLegalEntityInfoDetailData }
     * 
     */
    public VehicleLegalEntityInfoDetailData createVehicleLegalEntityInfoDetailData() {
        return new VehicleLegalEntityInfoDetailData();
    }

    /**
     * Create an instance of {@link AddressData }
     * 
     */
    public AddressData createAddressData() {
        return new AddressData();
    }

    /**
     * Create an instance of {@link VehicleRequestData }
     * 
     */
    public VehicleRequestData createVehicleRequestData() {
        return new VehicleRequestData();
    }

    /**
     * Create an instance of {@link VehicleData }
     * 
     */
    public VehicleData createVehicleData() {
        return new VehicleData();
    }

    /**
     * Create an instance of {@link BorderRegisteredTransportData }
     * 
     */
    public BorderRegisteredTransportData createBorderRegisteredTransportData() {
        return new BorderRegisteredTransportData();
    }

    /**
     * Create an instance of {@link BorderRegisteredTrasportDetailData }
     * 
     */
    public BorderRegisteredTrasportDetailData createBorderRegisteredTrasportDetailData() {
        return new BorderRegisteredTrasportDetailData();
    }

    /**
     * Create an instance of {@link ListWrapper }
     * 
     */
    public ListWrapper createListWrapper() {
        return new ListWrapper();
    }

    /**
     * Create an instance of {@link TransportRequestData }
     * 
     */
    public TransportRequestData createTransportRequestData() {
        return new TransportRequestData();
    }

    /**
     * Create an instance of {@link TransportData }
     * 
     */
    public TransportData createTransportData() {
        return new TransportData();
    }

    /**
     * Create an instance of {@link VehicleBorderPassData }
     * 
     */
    public VehicleBorderPassData createVehicleBorderPassData() {
        return new VehicleBorderPassData();
    }

    /**
     * Create an instance of {@link VehicleBorderPassDetailData }
     * 
     */
    public VehicleBorderPassDetailData createVehicleBorderPassDetailData() {
        return new VehicleBorderPassDetailData();
    }

    /**
     * Create an instance of {@link ServiceVehicleImportInfoData }
     * 
     */
    public ServiceVehicleImportInfoData createServiceVehicleImportInfoData() {
        return new ServiceVehicleImportInfoData();
    }

    /**
     * Create an instance of {@link VehicleImportData }
     * 
     */
    public VehicleImportData createVehicleImportData() {
        return new VehicleImportData();
    }

    /**
     * Create an instance of {@link VehicleImportDetailData }
     * 
     */
    public VehicleImportDetailData createVehicleImportDetailData() {
        return new VehicleImportDetailData();
    }

    /**
     * Create an instance of {@link VehicleOrganizationData }
     * 
     */
    public VehicleOrganizationData createVehicleOrganizationData() {
        return new VehicleOrganizationData();
    }

    /**
     * Create an instance of {@link TransportConclutionResponseData }
     * 
     */
    public TransportConclutionResponseData createTransportConclutionResponseData() {
        return new TransportConclutionResponseData();
    }

    /**
     * Create an instance of {@link GetItemExpandData }
     * 
     */
    public GetItemExpandData createGetItemExpandData() {
        return new GetItemExpandData();
    }

    /**
     * Create an instance of {@link GetItemExpandDetailData }
     * 
     */
    public GetItemExpandDetailData createGetItemExpandDetailData() {
        return new GetItemExpandDetailData();
    }

    /**
     * Create an instance of {@link PermittedVehiclesListRequestData }
     * 
     */
    public PermittedVehiclesListRequestData createPermittedVehiclesListRequestData() {
        return new PermittedVehiclesListRequestData();
    }

    /**
     * Create an instance of {@link PermittedVehiclesListData }
     * 
     */
    public PermittedVehiclesListData createPermittedVehiclesListData() {
        return new PermittedVehiclesListData();
    }

    /**
     * Create an instance of {@link PermittedVehiclesListDetailData }
     * 
     */
    public PermittedVehiclesListDetailData createPermittedVehiclesListDetailData() {
        return new PermittedVehiclesListDetailData();
    }

    /**
     * Create an instance of {@link PermittedVehiclesAddressData }
     * 
     */
    public PermittedVehiclesAddressData createPermittedVehiclesAddressData() {
        return new PermittedVehiclesAddressData();
    }

    /**
     * Create an instance of {@link GetPreOwnedVehicleData }
     * 
     */
    public GetPreOwnedVehicleData createGetPreOwnedVehicleData() {
        return new GetPreOwnedVehicleData();
    }

    /**
     * Create an instance of {@link GetPreOwnedDataDetail }
     * 
     */
    public GetPreOwnedDataDetail createGetPreOwnedDataDetail() {
        return new GetPreOwnedDataDetail();
    }

    /**
     * Create an instance of {@link InternationalDriverLicenseRequestData }
     * 
     */
    public InternationalDriverLicenseRequestData createInternationalDriverLicenseRequestData() {
        return new InternationalDriverLicenseRequestData();
    }

    /**
     * Create an instance of {@link InternationalDriverLicenseData }
     * 
     */
    public InternationalDriverLicenseData createInternationalDriverLicenseData() {
        return new InternationalDriverLicenseData();
    }

    /**
     * Create an instance of {@link CheckECLIcenseFromKioskRequestData }
     * 
     */
    public CheckECLIcenseFromKioskRequestData createCheckECLIcenseFromKioskRequestData() {
        return new CheckECLIcenseFromKioskRequestData();
    }

    /**
     * Create an instance of {@link CheckECLIcenseFromKioskData }
     * 
     */
    public CheckECLIcenseFromKioskData createCheckECLIcenseFromKioskData() {
        return new CheckECLIcenseFromKioskData();
    }

    /**
     * Create an instance of {@link OrgRegnumRequestData }
     * 
     */
    public OrgRegnumRequestData createOrgRegnumRequestData() {
        return new OrgRegnumRequestData();
    }

    /**
     * Create an instance of {@link VehicleLegalEntityTotalData }
     * 
     */
    public VehicleLegalEntityTotalData createVehicleLegalEntityTotalData() {
        return new VehicleLegalEntityTotalData();
    }

    /**
     * Create an instance of {@link TransportCheckGPSPaymentRequestData }
     * 
     */
    public TransportCheckGPSPaymentRequestData createTransportCheckGPSPaymentRequestData() {
        return new TransportCheckGPSPaymentRequestData();
    }

    /**
     * Create an instance of {@link TransportCheckGPSPaymentData }
     * 
     */
    public TransportCheckGPSPaymentData createTransportCheckGPSPaymentData() {
        return new TransportCheckGPSPaymentData();
    }

    /**
     * Create an instance of {@link VehicleHistoryData }
     * 
     */
    public VehicleHistoryData createVehicleHistoryData() {
        return new VehicleHistoryData();
    }

    /**
     * Create an instance of {@link TransportGetOrganizationData }
     * 
     */
    public TransportGetOrganizationData createTransportGetOrganizationData() {
        return new TransportGetOrganizationData();
    }

    /**
     * Create an instance of {@link VehicleInspectionByPlateNoRequestData }
     * 
     */
    public VehicleInspectionByPlateNoRequestData createVehicleInspectionByPlateNoRequestData() {
        return new VehicleInspectionByPlateNoRequestData();
    }

    /**
     * Create an instance of {@link VehicleInspectionByPlateNoData }
     * 
     */
    public VehicleInspectionByPlateNoData createVehicleInspectionByPlateNoData() {
        return new VehicleInspectionByPlateNoData();
    }

    /**
     * Create an instance of {@link VehicleInspectionByPlateNoDetailData }
     * 
     */
    public VehicleInspectionByPlateNoDetailData createVehicleInspectionByPlateNoDetailData() {
        return new VehicleInspectionByPlateNoDetailData();
    }

    /**
     * Create an instance of {@link OwnerRequestData }
     * 
     */
    public OwnerRequestData createOwnerRequestData() {
        return new OwnerRequestData();
    }

    /**
     * Create an instance of {@link OwnerData }
     * 
     */
    public OwnerData createOwnerData() {
        return new OwnerData();
    }

    /**
     * Create an instance of {@link SpecialDriverRequestData }
     * 
     */
    public SpecialDriverRequestData createSpecialDriverRequestData() {
        return new SpecialDriverRequestData();
    }

    /**
     * Create an instance of {@link SpecialDriverInfoData }
     * 
     */
    public SpecialDriverInfoData createSpecialDriverInfoData() {
        return new SpecialDriverInfoData();
    }

    /**
     * Create an instance of {@link ServiceVehiclePenaltyInfoRequestData }
     * 
     */
    public ServiceVehiclePenaltyInfoRequestData createServiceVehiclePenaltyInfoRequestData() {
        return new ServiceVehiclePenaltyInfoRequestData();
    }

    /**
     * Create an instance of {@link VehiclePenaltyInfoData }
     * 
     */
    public VehiclePenaltyInfoData createVehiclePenaltyInfoData() {
        return new VehiclePenaltyInfoData();
    }

    /**
     * Create an instance of {@link VehiclePenaltyInfoDetailData }
     * 
     */
    public VehiclePenaltyInfoDetailData createVehiclePenaltyInfoDetailData() {
        return new VehiclePenaltyInfoDetailData();
    }

    /**
     * Create an instance of {@link VehicleType }
     * 
     */
    public VehicleType createVehicleType() {
        return new VehicleType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100401GetVehicleInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100401GetVehicleInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100401_getVehicleInfo")
    public JAXBElement<WS100401GetVehicleInfo> createWS100401GetVehicleInfo(WS100401GetVehicleInfo value) {
        return new JAXBElement<WS100401GetVehicleInfo>(_WS100401GetVehicleInfo_QNAME, WS100401GetVehicleInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100401GetVehicleInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100401GetVehicleInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100401_getVehicleInfoResponse")
    public JAXBElement<WS100401GetVehicleInfoResponse> createWS100401GetVehicleInfoResponse(WS100401GetVehicleInfoResponse value) {
        return new JAXBElement<WS100401GetVehicleInfoResponse>(_WS100401GetVehicleInfoResponse_QNAME, WS100401GetVehicleInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100402GetVehicleOwnerHistoryList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100402GetVehicleOwnerHistoryList }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100402_getVehicleOwnerHistoryList")
    public JAXBElement<WS100402GetVehicleOwnerHistoryList> createWS100402GetVehicleOwnerHistoryList(WS100402GetVehicleOwnerHistoryList value) {
        return new JAXBElement<WS100402GetVehicleOwnerHistoryList>(_WS100402GetVehicleOwnerHistoryList_QNAME, WS100402GetVehicleOwnerHistoryList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100402GetVehicleOwnerHistoryListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100402GetVehicleOwnerHistoryListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100402_getVehicleOwnerHistoryListResponse")
    public JAXBElement<WS100402GetVehicleOwnerHistoryListResponse> createWS100402GetVehicleOwnerHistoryListResponse(WS100402GetVehicleOwnerHistoryListResponse value) {
        return new JAXBElement<WS100402GetVehicleOwnerHistoryListResponse>(_WS100402GetVehicleOwnerHistoryListResponse_QNAME, WS100402GetVehicleOwnerHistoryListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100403GetVehiclePenaltyList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100403GetVehiclePenaltyList }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100403_getVehiclePenaltyList")
    public JAXBElement<WS100403GetVehiclePenaltyList> createWS100403GetVehiclePenaltyList(WS100403GetVehiclePenaltyList value) {
        return new JAXBElement<WS100403GetVehiclePenaltyList>(_WS100403GetVehiclePenaltyList_QNAME, WS100403GetVehiclePenaltyList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100403GetVehiclePenaltyListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100403GetVehiclePenaltyListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100403_getVehiclePenaltyListResponse")
    public JAXBElement<WS100403GetVehiclePenaltyListResponse> createWS100403GetVehiclePenaltyListResponse(WS100403GetVehiclePenaltyListResponse value) {
        return new JAXBElement<WS100403GetVehiclePenaltyListResponse>(_WS100403GetVehiclePenaltyListResponse_QNAME, WS100403GetVehiclePenaltyListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100404GetECDataInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100404GetECDataInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100404_getECDataInfo")
    public JAXBElement<WS100404GetECDataInfo> createWS100404GetECDataInfo(WS100404GetECDataInfo value) {
        return new JAXBElement<WS100404GetECDataInfo>(_WS100404GetECDataInfo_QNAME, WS100404GetECDataInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100404GetECDataInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100404GetECDataInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100404_getECDataInfoResponse")
    public JAXBElement<WS100404GetECDataInfoResponse> createWS100404GetECDataInfoResponse(WS100404GetECDataInfoResponse value) {
        return new JAXBElement<WS100404GetECDataInfoResponse>(_WS100404GetECDataInfoResponse_QNAME, WS100404GetECDataInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100405GetVehicleTaxInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100405GetVehicleTaxInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100405_getVehicleTaxInfo")
    public JAXBElement<WS100405GetVehicleTaxInfo> createWS100405GetVehicleTaxInfo(WS100405GetVehicleTaxInfo value) {
        return new JAXBElement<WS100405GetVehicleTaxInfo>(_WS100405GetVehicleTaxInfo_QNAME, WS100405GetVehicleTaxInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100405GetVehicleTaxInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100405GetVehicleTaxInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100405_getVehicleTaxInfoResponse")
    public JAXBElement<WS100405GetVehicleTaxInfoResponse> createWS100405GetVehicleTaxInfoResponse(WS100405GetVehicleTaxInfoResponse value) {
        return new JAXBElement<WS100405GetVehicleTaxInfoResponse>(_WS100405GetVehicleTaxInfoResponse_QNAME, WS100405GetVehicleTaxInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100406GetCitizenVehicleList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100406GetCitizenVehicleList }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100406_getCitizenVehicleList")
    public JAXBElement<WS100406GetCitizenVehicleList> createWS100406GetCitizenVehicleList(WS100406GetCitizenVehicleList value) {
        return new JAXBElement<WS100406GetCitizenVehicleList>(_WS100406GetCitizenVehicleList_QNAME, WS100406GetCitizenVehicleList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100406GetCitizenVehicleListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100406GetCitizenVehicleListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100406_getCitizenVehicleListResponse")
    public JAXBElement<WS100406GetCitizenVehicleListResponse> createWS100406GetCitizenVehicleListResponse(WS100406GetCitizenVehicleListResponse value) {
        return new JAXBElement<WS100406GetCitizenVehicleListResponse>(_WS100406GetCitizenVehicleListResponse_QNAME, WS100406GetCitizenVehicleListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100407GetDriverLicenseInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100407GetDriverLicenseInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100407_getDriverLicenseInfo")
    public JAXBElement<WS100407GetDriverLicenseInfo> createWS100407GetDriverLicenseInfo(WS100407GetDriverLicenseInfo value) {
        return new JAXBElement<WS100407GetDriverLicenseInfo>(_WS100407GetDriverLicenseInfo_QNAME, WS100407GetDriverLicenseInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100407GetDriverLicenseInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100407GetDriverLicenseInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100407_getDriverLicenseInfoResponse")
    public JAXBElement<WS100407GetDriverLicenseInfoResponse> createWS100407GetDriverLicenseInfoResponse(WS100407GetDriverLicenseInfoResponse value) {
        return new JAXBElement<WS100407GetDriverLicenseInfoResponse>(_WS100407GetDriverLicenseInfoResponse_QNAME, WS100407GetDriverLicenseInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100408UpdatePenaltyPayment }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100408UpdatePenaltyPayment }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100408_updatePenaltyPayment")
    public JAXBElement<WS100408UpdatePenaltyPayment> createWS100408UpdatePenaltyPayment(WS100408UpdatePenaltyPayment value) {
        return new JAXBElement<WS100408UpdatePenaltyPayment>(_WS100408UpdatePenaltyPayment_QNAME, WS100408UpdatePenaltyPayment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100408UpdatePenaltyPaymentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100408UpdatePenaltyPaymentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100408_updatePenaltyPaymentResponse")
    public JAXBElement<WS100408UpdatePenaltyPaymentResponse> createWS100408UpdatePenaltyPaymentResponse(WS100408UpdatePenaltyPaymentResponse value) {
        return new JAXBElement<WS100408UpdatePenaltyPaymentResponse>(_WS100408UpdatePenaltyPaymentResponse_QNAME, WS100408UpdatePenaltyPaymentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100409GetVehicleInspectionInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100409GetVehicleInspectionInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100409_getVehicleInspectionInfo")
    public JAXBElement<WS100409GetVehicleInspectionInfo> createWS100409GetVehicleInspectionInfo(WS100409GetVehicleInspectionInfo value) {
        return new JAXBElement<WS100409GetVehicleInspectionInfo>(_WS100409GetVehicleInspectionInfo_QNAME, WS100409GetVehicleInspectionInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100409GetVehicleInspectionInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100409GetVehicleInspectionInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100409_getVehicleInspectionInfoResponse")
    public JAXBElement<WS100409GetVehicleInspectionInfoResponse> createWS100409GetVehicleInspectionInfoResponse(WS100409GetVehicleInspectionInfoResponse value) {
        return new JAXBElement<WS100409GetVehicleInspectionInfoResponse>(_WS100409GetVehicleInspectionInfoResponse_QNAME, WS100409GetVehicleInspectionInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100410IsVehicleCheck }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100410IsVehicleCheck }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100410_isVehicleCheck")
    public JAXBElement<WS100410IsVehicleCheck> createWS100410IsVehicleCheck(WS100410IsVehicleCheck value) {
        return new JAXBElement<WS100410IsVehicleCheck>(_WS100410IsVehicleCheck_QNAME, WS100410IsVehicleCheck.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100410IsVehicleCheckResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100410IsVehicleCheckResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100410_isVehicleCheckResponse")
    public JAXBElement<WS100410IsVehicleCheckResponse> createWS100410IsVehicleCheckResponse(WS100410IsVehicleCheckResponse value) {
        return new JAXBElement<WS100410IsVehicleCheckResponse>(_WS100410IsVehicleCheckResponse_QNAME, WS100410IsVehicleCheckResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100411VehicleImportInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100411VehicleImportInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100411_vehicleImportInfo")
    public JAXBElement<WS100411VehicleImportInfo> createWS100411VehicleImportInfo(WS100411VehicleImportInfo value) {
        return new JAXBElement<WS100411VehicleImportInfo>(_WS100411VehicleImportInfo_QNAME, WS100411VehicleImportInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100411VehicleImportInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100411VehicleImportInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100411_vehicleImportInfoResponse")
    public JAXBElement<WS100411VehicleImportInfoResponse> createWS100411VehicleImportInfoResponse(WS100411VehicleImportInfoResponse value) {
        return new JAXBElement<WS100411VehicleImportInfoResponse>(_WS100411VehicleImportInfoResponse_QNAME, WS100411VehicleImportInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100412GetTransportInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100412GetTransportInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100412_getTransportInfo")
    public JAXBElement<WS100412GetTransportInfo> createWS100412GetTransportInfo(WS100412GetTransportInfo value) {
        return new JAXBElement<WS100412GetTransportInfo>(_WS100412GetTransportInfo_QNAME, WS100412GetTransportInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100412GetTransportInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100412GetTransportInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100412_getTransportInfoResponse")
    public JAXBElement<WS100412GetTransportInfoResponse> createWS100412GetTransportInfoResponse(WS100412GetTransportInfoResponse value) {
        return new JAXBElement<WS100412GetTransportInfoResponse>(_WS100412GetTransportInfoResponse_QNAME, WS100412GetTransportInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100413GetInternationalDriverLicenseInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100413GetInternationalDriverLicenseInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100413_getInternationalDriverLicenseInfo")
    public JAXBElement<WS100413GetInternationalDriverLicenseInfo> createWS100413GetInternationalDriverLicenseInfo(WS100413GetInternationalDriverLicenseInfo value) {
        return new JAXBElement<WS100413GetInternationalDriverLicenseInfo>(_WS100413GetInternationalDriverLicenseInfo_QNAME, WS100413GetInternationalDriverLicenseInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100413GetInternationalDriverLicenseInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100413GetInternationalDriverLicenseInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100413_getInternationalDriverLicenseInfoResponse")
    public JAXBElement<WS100413GetInternationalDriverLicenseInfoResponse> createWS100413GetInternationalDriverLicenseInfoResponse(WS100413GetInternationalDriverLicenseInfoResponse value) {
        return new JAXBElement<WS100413GetInternationalDriverLicenseInfoResponse>(_WS100413GetInternationalDriverLicenseInfoResponse_QNAME, WS100413GetInternationalDriverLicenseInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100414GetImportExportItemList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100414GetImportExportItemList }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100414_getImportExportItemList")
    public JAXBElement<WS100414GetImportExportItemList> createWS100414GetImportExportItemList(WS100414GetImportExportItemList value) {
        return new JAXBElement<WS100414GetImportExportItemList>(_WS100414GetImportExportItemList_QNAME, WS100414GetImportExportItemList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100414GetImportExportItemListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100414GetImportExportItemListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100414_getImportExportItemListResponse")
    public JAXBElement<WS100414GetImportExportItemListResponse> createWS100414GetImportExportItemListResponse(WS100414GetImportExportItemListResponse value) {
        return new JAXBElement<WS100414GetImportExportItemListResponse>(_WS100414GetImportExportItemListResponse_QNAME, WS100414GetImportExportItemListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100415VehicleInfoList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100415VehicleInfoList }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100415_vehicleInfoList")
    public JAXBElement<WS100415VehicleInfoList> createWS100415VehicleInfoList(WS100415VehicleInfoList value) {
        return new JAXBElement<WS100415VehicleInfoList>(_WS100415VehicleInfoList_QNAME, WS100415VehicleInfoList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100415VehicleInfoListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100415VehicleInfoListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100415_vehicleInfoListResponse")
    public JAXBElement<WS100415VehicleInfoListResponse> createWS100415VehicleInfoListResponse(WS100415VehicleInfoListResponse value) {
        return new JAXBElement<WS100415VehicleInfoListResponse>(_WS100415VehicleInfoListResponse_QNAME, WS100415VehicleInfoListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100416GetOwnerInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100416GetOwnerInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100416_getOwnerInfo")
    public JAXBElement<WS100416GetOwnerInfo> createWS100416GetOwnerInfo(WS100416GetOwnerInfo value) {
        return new JAXBElement<WS100416GetOwnerInfo>(_WS100416GetOwnerInfo_QNAME, WS100416GetOwnerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100416GetOwnerInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100416GetOwnerInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100416_getOwnerInfoResponse")
    public JAXBElement<WS100416GetOwnerInfoResponse> createWS100416GetOwnerInfoResponse(WS100416GetOwnerInfoResponse value) {
        return new JAXBElement<WS100416GetOwnerInfoResponse>(_WS100416GetOwnerInfoResponse_QNAME, WS100416GetOwnerInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100417SpecialDriverInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100417SpecialDriverInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100417_specialDriverInfo")
    public JAXBElement<WS100417SpecialDriverInfo> createWS100417SpecialDriverInfo(WS100417SpecialDriverInfo value) {
        return new JAXBElement<WS100417SpecialDriverInfo>(_WS100417SpecialDriverInfo_QNAME, WS100417SpecialDriverInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100417SpecialDriverInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100417SpecialDriverInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100417_specialDriverInfoResponse")
    public JAXBElement<WS100417SpecialDriverInfoResponse> createWS100417SpecialDriverInfoResponse(WS100417SpecialDriverInfoResponse value) {
        return new JAXBElement<WS100417SpecialDriverInfoResponse>(_WS100417SpecialDriverInfoResponse_QNAME, WS100417SpecialDriverInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100418VehicleLimitedInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100418VehicleLimitedInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100418_vehicleLimitedInfo")
    public JAXBElement<WS100418VehicleLimitedInfo> createWS100418VehicleLimitedInfo(WS100418VehicleLimitedInfo value) {
        return new JAXBElement<WS100418VehicleLimitedInfo>(_WS100418VehicleLimitedInfo_QNAME, WS100418VehicleLimitedInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100418VehicleLimitedInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100418VehicleLimitedInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100418_vehicleLimitedInfoResponse")
    public JAXBElement<WS100418VehicleLimitedInfoResponse> createWS100418VehicleLimitedInfoResponse(WS100418VehicleLimitedInfoResponse value) {
        return new JAXBElement<WS100418VehicleLimitedInfoResponse>(_WS100418VehicleLimitedInfoResponse_QNAME, WS100418VehicleLimitedInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100419VehicleBorderPass }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100419VehicleBorderPass }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100419_vehicleBorderPass")
    public JAXBElement<WS100419VehicleBorderPass> createWS100419VehicleBorderPass(WS100419VehicleBorderPass value) {
        return new JAXBElement<WS100419VehicleBorderPass>(_WS100419VehicleBorderPass_QNAME, WS100419VehicleBorderPass.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100419VehicleBorderPassResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100419VehicleBorderPassResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100419_vehicleBorderPassResponse")
    public JAXBElement<WS100419VehicleBorderPassResponse> createWS100419VehicleBorderPassResponse(WS100419VehicleBorderPassResponse value) {
        return new JAXBElement<WS100419VehicleBorderPassResponse>(_WS100419VehicleBorderPassResponse_QNAME, WS100419VehicleBorderPassResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100420GetOrganizationVehicleList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100420GetOrganizationVehicleList }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100420_getOrganizationVehicleList")
    public JAXBElement<WS100420GetOrganizationVehicleList> createWS100420GetOrganizationVehicleList(WS100420GetOrganizationVehicleList value) {
        return new JAXBElement<WS100420GetOrganizationVehicleList>(_WS100420GetOrganizationVehicleList_QNAME, WS100420GetOrganizationVehicleList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100420GetOrganizationVehicleListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100420GetOrganizationVehicleListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100420_getOrganizationVehicleListResponse")
    public JAXBElement<WS100420GetOrganizationVehicleListResponse> createWS100420GetOrganizationVehicleListResponse(WS100420GetOrganizationVehicleListResponse value) {
        return new JAXBElement<WS100420GetOrganizationVehicleListResponse>(_WS100420GetOrganizationVehicleListResponse_QNAME, WS100420GetOrganizationVehicleListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100421GetPreOwnedVehicle }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100421GetPreOwnedVehicle }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100421_getPreOwnedVehicle")
    public JAXBElement<WS100421GetPreOwnedVehicle> createWS100421GetPreOwnedVehicle(WS100421GetPreOwnedVehicle value) {
        return new JAXBElement<WS100421GetPreOwnedVehicle>(_WS100421GetPreOwnedVehicle_QNAME, WS100421GetPreOwnedVehicle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100421GetPreOwnedVehicleResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100421GetPreOwnedVehicleResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100421_getPreOwnedVehicleResponse")
    public JAXBElement<WS100421GetPreOwnedVehicleResponse> createWS100421GetPreOwnedVehicleResponse(WS100421GetPreOwnedVehicleResponse value) {
        return new JAXBElement<WS100421GetPreOwnedVehicleResponse>(_WS100421GetPreOwnedVehicleResponse_QNAME, WS100421GetPreOwnedVehicleResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100422GetCitizenPenaltyList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100422GetCitizenPenaltyList }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100422_getCitizenPenaltyList")
    public JAXBElement<WS100422GetCitizenPenaltyList> createWS100422GetCitizenPenaltyList(WS100422GetCitizenPenaltyList value) {
        return new JAXBElement<WS100422GetCitizenPenaltyList>(_WS100422GetCitizenPenaltyList_QNAME, WS100422GetCitizenPenaltyList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100422GetCitizenPenaltyListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100422GetCitizenPenaltyListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100422_getCitizenPenaltyListResponse")
    public JAXBElement<WS100422GetCitizenPenaltyListResponse> createWS100422GetCitizenPenaltyListResponse(WS100422GetCitizenPenaltyListResponse value) {
        return new JAXBElement<WS100422GetCitizenPenaltyListResponse>(_WS100422GetCitizenPenaltyListResponse_QNAME, WS100422GetCitizenPenaltyListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100423BorderRegisteredTransportInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100423BorderRegisteredTransportInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100423_borderRegisteredTransportInfo")
    public JAXBElement<WS100423BorderRegisteredTransportInfo> createWS100423BorderRegisteredTransportInfo(WS100423BorderRegisteredTransportInfo value) {
        return new JAXBElement<WS100423BorderRegisteredTransportInfo>(_WS100423BorderRegisteredTransportInfo_QNAME, WS100423BorderRegisteredTransportInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100423BorderRegisteredTransportInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100423BorderRegisteredTransportInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100423_borderRegisteredTransportInfoResponse")
    public JAXBElement<WS100423BorderRegisteredTransportInfoResponse> createWS100423BorderRegisteredTransportInfoResponse(WS100423BorderRegisteredTransportInfoResponse value) {
        return new JAXBElement<WS100423BorderRegisteredTransportInfoResponse>(_WS100423BorderRegisteredTransportInfoResponse_QNAME, WS100423BorderRegisteredTransportInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100424BorderRegisteredPassengerInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100424BorderRegisteredPassengerInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100424_borderRegisteredPassengerInfo")
    public JAXBElement<WS100424BorderRegisteredPassengerInfo> createWS100424BorderRegisteredPassengerInfo(WS100424BorderRegisteredPassengerInfo value) {
        return new JAXBElement<WS100424BorderRegisteredPassengerInfo>(_WS100424BorderRegisteredPassengerInfo_QNAME, WS100424BorderRegisteredPassengerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100424BorderRegisteredPassengerInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100424BorderRegisteredPassengerInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100424_borderRegisteredPassengerInfoResponse")
    public JAXBElement<WS100424BorderRegisteredPassengerInfoResponse> createWS100424BorderRegisteredPassengerInfoResponse(WS100424BorderRegisteredPassengerInfoResponse value) {
        return new JAXBElement<WS100424BorderRegisteredPassengerInfoResponse>(_WS100424BorderRegisteredPassengerInfoResponse_QNAME, WS100424BorderRegisteredPassengerInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100425GetImportExportItemExpandList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100425GetImportExportItemExpandList }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100425_getImportExportItemExpandList")
    public JAXBElement<WS100425GetImportExportItemExpandList> createWS100425GetImportExportItemExpandList(WS100425GetImportExportItemExpandList value) {
        return new JAXBElement<WS100425GetImportExportItemExpandList>(_WS100425GetImportExportItemExpandList_QNAME, WS100425GetImportExportItemExpandList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100425GetImportExportItemExpandListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100425GetImportExportItemExpandListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100425_getImportExportItemExpandListResponse")
    public JAXBElement<WS100425GetImportExportItemExpandListResponse> createWS100425GetImportExportItemExpandListResponse(WS100425GetImportExportItemExpandListResponse value) {
        return new JAXBElement<WS100425GetImportExportItemExpandListResponse>(_WS100425GetImportExportItemExpandListResponse_QNAME, WS100425GetImportExportItemExpandListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100426TransportGetOrganizationInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100426TransportGetOrganizationInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100426_transportGetOrganizationInfo")
    public JAXBElement<WS100426TransportGetOrganizationInfo> createWS100426TransportGetOrganizationInfo(WS100426TransportGetOrganizationInfo value) {
        return new JAXBElement<WS100426TransportGetOrganizationInfo>(_WS100426TransportGetOrganizationInfo_QNAME, WS100426TransportGetOrganizationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100426TransportGetOrganizationInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100426TransportGetOrganizationInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100426_transportGetOrganizationInfoResponse")
    public JAXBElement<WS100426TransportGetOrganizationInfoResponse> createWS100426TransportGetOrganizationInfoResponse(WS100426TransportGetOrganizationInfoResponse value) {
        return new JAXBElement<WS100426TransportGetOrganizationInfoResponse>(_WS100426TransportGetOrganizationInfoResponse_QNAME, WS100426TransportGetOrganizationInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100427TransportOrganizationCarsInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100427TransportOrganizationCarsInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100427_transportOrganizationCarsInfo")
    public JAXBElement<WS100427TransportOrganizationCarsInfo> createWS100427TransportOrganizationCarsInfo(WS100427TransportOrganizationCarsInfo value) {
        return new JAXBElement<WS100427TransportOrganizationCarsInfo>(_WS100427TransportOrganizationCarsInfo_QNAME, WS100427TransportOrganizationCarsInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100427TransportOrganizationCarsInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100427TransportOrganizationCarsInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100427_transportOrganizationCarsInfoResponse")
    public JAXBElement<WS100427TransportOrganizationCarsInfoResponse> createWS100427TransportOrganizationCarsInfoResponse(WS100427TransportOrganizationCarsInfoResponse value) {
        return new JAXBElement<WS100427TransportOrganizationCarsInfoResponse>(_WS100427TransportOrganizationCarsInfoResponse_QNAME, WS100427TransportOrganizationCarsInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100428TransportCheckGPSPayment }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100428TransportCheckGPSPayment }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100428_transportCheckGPSPayment")
    public JAXBElement<WS100428TransportCheckGPSPayment> createWS100428TransportCheckGPSPayment(WS100428TransportCheckGPSPayment value) {
        return new JAXBElement<WS100428TransportCheckGPSPayment>(_WS100428TransportCheckGPSPayment_QNAME, WS100428TransportCheckGPSPayment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100428TransportCheckGPSPaymentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100428TransportCheckGPSPaymentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100428_transportCheckGPSPaymentResponse")
    public JAXBElement<WS100428TransportCheckGPSPaymentResponse> createWS100428TransportCheckGPSPaymentResponse(WS100428TransportCheckGPSPaymentResponse value) {
        return new JAXBElement<WS100428TransportCheckGPSPaymentResponse>(_WS100428TransportCheckGPSPaymentResponse_QNAME, WS100428TransportCheckGPSPaymentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100429TransportConclutionResponseInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100429TransportConclutionResponseInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100429_transportConclutionResponseInfo")
    public JAXBElement<WS100429TransportConclutionResponseInfo> createWS100429TransportConclutionResponseInfo(WS100429TransportConclutionResponseInfo value) {
        return new JAXBElement<WS100429TransportConclutionResponseInfo>(_WS100429TransportConclutionResponseInfo_QNAME, WS100429TransportConclutionResponseInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100429TransportConclutionResponseInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100429TransportConclutionResponseInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100429_transportConclutionResponseInfoResponse")
    public JAXBElement<WS100429TransportConclutionResponseInfoResponse> createWS100429TransportConclutionResponseInfoResponse(WS100429TransportConclutionResponseInfoResponse value) {
        return new JAXBElement<WS100429TransportConclutionResponseInfoResponse>(_WS100429TransportConclutionResponseInfoResponse_QNAME, WS100429TransportConclutionResponseInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100430TransportConflictInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100430TransportConflictInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100430_transportConflictInfo")
    public JAXBElement<WS100430TransportConflictInfo> createWS100430TransportConflictInfo(WS100430TransportConflictInfo value) {
        return new JAXBElement<WS100430TransportConflictInfo>(_WS100430TransportConflictInfo_QNAME, WS100430TransportConflictInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100430TransportConflictInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100430TransportConflictInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100430_transportConflictInfoResponse")
    public JAXBElement<WS100430TransportConflictInfoResponse> createWS100430TransportConflictInfoResponse(WS100430TransportConflictInfoResponse value) {
        return new JAXBElement<WS100430TransportConflictInfoResponse>(_WS100430TransportConflictInfoResponse_QNAME, WS100430TransportConflictInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100431PermittedVehiclesList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100431PermittedVehiclesList }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100431_permittedVehiclesList")
    public JAXBElement<WS100431PermittedVehiclesList> createWS100431PermittedVehiclesList(WS100431PermittedVehiclesList value) {
        return new JAXBElement<WS100431PermittedVehiclesList>(_WS100431PermittedVehiclesList_QNAME, WS100431PermittedVehiclesList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100431PermittedVehiclesListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100431PermittedVehiclesListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100431_permittedVehiclesListResponse")
    public JAXBElement<WS100431PermittedVehiclesListResponse> createWS100431PermittedVehiclesListResponse(WS100431PermittedVehiclesListResponse value) {
        return new JAXBElement<WS100431PermittedVehiclesListResponse>(_WS100431PermittedVehiclesListResponse_QNAME, WS100431PermittedVehiclesListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100432GetVehicleInspectionDataByPlateNo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100432GetVehicleInspectionDataByPlateNo }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100432_getVehicleInspectionDataByPlateNo")
    public JAXBElement<WS100432GetVehicleInspectionDataByPlateNo> createWS100432GetVehicleInspectionDataByPlateNo(WS100432GetVehicleInspectionDataByPlateNo value) {
        return new JAXBElement<WS100432GetVehicleInspectionDataByPlateNo>(_WS100432GetVehicleInspectionDataByPlateNo_QNAME, WS100432GetVehicleInspectionDataByPlateNo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100432GetVehicleInspectionDataByPlateNoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100432GetVehicleInspectionDataByPlateNoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100432_getVehicleInspectionDataByPlateNoResponse")
    public JAXBElement<WS100432GetVehicleInspectionDataByPlateNoResponse> createWS100432GetVehicleInspectionDataByPlateNoResponse(WS100432GetVehicleInspectionDataByPlateNoResponse value) {
        return new JAXBElement<WS100432GetVehicleInspectionDataByPlateNoResponse>(_WS100432GetVehicleInspectionDataByPlateNoResponse_QNAME, WS100432GetVehicleInspectionDataByPlateNoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100433UnlicensedVehiclesList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100433UnlicensedVehiclesList }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100433_unlicensedVehiclesList")
    public JAXBElement<WS100433UnlicensedVehiclesList> createWS100433UnlicensedVehiclesList(WS100433UnlicensedVehiclesList value) {
        return new JAXBElement<WS100433UnlicensedVehiclesList>(_WS100433UnlicensedVehiclesList_QNAME, WS100433UnlicensedVehiclesList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100433UnlicensedVehiclesListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100433UnlicensedVehiclesListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100433_unlicensedVehiclesListResponse")
    public JAXBElement<WS100433UnlicensedVehiclesListResponse> createWS100433UnlicensedVehiclesListResponse(WS100433UnlicensedVehiclesListResponse value) {
        return new JAXBElement<WS100433UnlicensedVehiclesListResponse>(_WS100433UnlicensedVehiclesListResponse_QNAME, WS100433UnlicensedVehiclesListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100434CheckECLIcenseFromKiosk }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100434CheckECLIcenseFromKiosk }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100434_checkECLIcenseFromKiosk")
    public JAXBElement<WS100434CheckECLIcenseFromKiosk> createWS100434CheckECLIcenseFromKiosk(WS100434CheckECLIcenseFromKiosk value) {
        return new JAXBElement<WS100434CheckECLIcenseFromKiosk>(_WS100434CheckECLIcenseFromKiosk_QNAME, WS100434CheckECLIcenseFromKiosk.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100434CheckECLIcenseFromKioskResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100434CheckECLIcenseFromKioskResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100434_checkECLIcenseFromKioskResponse")
    public JAXBElement<WS100434CheckECLIcenseFromKioskResponse> createWS100434CheckECLIcenseFromKioskResponse(WS100434CheckECLIcenseFromKioskResponse value) {
        return new JAXBElement<WS100434CheckECLIcenseFromKioskResponse>(_WS100434CheckECLIcenseFromKioskResponse_QNAME, WS100434CheckECLIcenseFromKioskResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100435GetPreOwnedVehicleWithOrgRegnum }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100435GetPreOwnedVehicleWithOrgRegnum }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100435_getPreOwnedVehicleWithOrgRegnum")
    public JAXBElement<WS100435GetPreOwnedVehicleWithOrgRegnum> createWS100435GetPreOwnedVehicleWithOrgRegnum(WS100435GetPreOwnedVehicleWithOrgRegnum value) {
        return new JAXBElement<WS100435GetPreOwnedVehicleWithOrgRegnum>(_WS100435GetPreOwnedVehicleWithOrgRegnum_QNAME, WS100435GetPreOwnedVehicleWithOrgRegnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100435GetPreOwnedVehicleWithOrgRegnumResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100435GetPreOwnedVehicleWithOrgRegnumResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100435_getPreOwnedVehicleWithOrgRegnumResponse")
    public JAXBElement<WS100435GetPreOwnedVehicleWithOrgRegnumResponse> createWS100435GetPreOwnedVehicleWithOrgRegnumResponse(WS100435GetPreOwnedVehicleWithOrgRegnumResponse value) {
        return new JAXBElement<WS100435GetPreOwnedVehicleWithOrgRegnumResponse>(_WS100435GetPreOwnedVehicleWithOrgRegnumResponse_QNAME, WS100435GetPreOwnedVehicleWithOrgRegnumResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100436VehicleLegalEntityInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100436VehicleLegalEntityInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100436_vehicleLegalEntityInfo")
    public JAXBElement<WS100436VehicleLegalEntityInfo> createWS100436VehicleLegalEntityInfo(WS100436VehicleLegalEntityInfo value) {
        return new JAXBElement<WS100436VehicleLegalEntityInfo>(_WS100436VehicleLegalEntityInfo_QNAME, WS100436VehicleLegalEntityInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100436VehicleLegalEntityInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100436VehicleLegalEntityInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100436_vehicleLegalEntityInfoResponse")
    public JAXBElement<WS100436VehicleLegalEntityInfoResponse> createWS100436VehicleLegalEntityInfoResponse(WS100436VehicleLegalEntityInfoResponse value) {
        return new JAXBElement<WS100436VehicleLegalEntityInfoResponse>(_WS100436VehicleLegalEntityInfoResponse_QNAME, WS100436VehicleLegalEntityInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100437VehicleLegalEntityTotal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100437VehicleLegalEntityTotal }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100437_vehicleLegalEntityTotal")
    public JAXBElement<WS100437VehicleLegalEntityTotal> createWS100437VehicleLegalEntityTotal(WS100437VehicleLegalEntityTotal value) {
        return new JAXBElement<WS100437VehicleLegalEntityTotal>(_WS100437VehicleLegalEntityTotal_QNAME, WS100437VehicleLegalEntityTotal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100437VehicleLegalEntityTotalResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100437VehicleLegalEntityTotalResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100437_vehicleLegalEntityTotalResponse")
    public JAXBElement<WS100437VehicleLegalEntityTotalResponse> createWS100437VehicleLegalEntityTotalResponse(WS100437VehicleLegalEntityTotalResponse value) {
        return new JAXBElement<WS100437VehicleLegalEntityTotalResponse>(_WS100437VehicleLegalEntityTotalResponse_QNAME, WS100437VehicleLegalEntityTotalResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100438GetPreOwnedOrgVehicleTotal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100438GetPreOwnedOrgVehicleTotal }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100438_getPreOwnedOrgVehicleTotal")
    public JAXBElement<WS100438GetPreOwnedOrgVehicleTotal> createWS100438GetPreOwnedOrgVehicleTotal(WS100438GetPreOwnedOrgVehicleTotal value) {
        return new JAXBElement<WS100438GetPreOwnedOrgVehicleTotal>(_WS100438GetPreOwnedOrgVehicleTotal_QNAME, WS100438GetPreOwnedOrgVehicleTotal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100438GetPreOwnedOrgVehicleTotalResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100438GetPreOwnedOrgVehicleTotalResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://transport.xyp.gov.mn/", name = "WS100438_getPreOwnedOrgVehicleTotalResponse")
    public JAXBElement<WS100438GetPreOwnedOrgVehicleTotalResponse> createWS100438GetPreOwnedOrgVehicleTotalResponse(WS100438GetPreOwnedOrgVehicleTotalResponse value) {
        return new JAXBElement<WS100438GetPreOwnedOrgVehicleTotalResponse>(_WS100438GetPreOwnedOrgVehicleTotalResponse_QNAME, WS100438GetPreOwnedOrgVehicleTotalResponse.class, null, value);
    }

}
