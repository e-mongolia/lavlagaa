
package mn.gov.ema.emongolia.data.XypHealth;

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
 * generated in the mn.gov.itc.emongolia.data.XypHealth package. 
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

    private final static QName _WS300101GetInsuranceFee_QNAME = new QName("http://health.xyp.gov.mn/", "WS300101_getInsuranceFee");
    private final static QName _WS300101GetInsuranceFeeResponse_QNAME = new QName("http://health.xyp.gov.mn/", "WS300101_getInsuranceFeeResponse");
    private final static QName _WS300102EHealthGetHospitals_QNAME = new QName("http://health.xyp.gov.mn/", "WS300102_eHealthGetHospitals");
    private final static QName _WS300102EHealthGetHospitalsResponse_QNAME = new QName("http://health.xyp.gov.mn/", "WS300102_eHealthGetHospitalsResponse");
    private final static QName _WS300103EHealthGetAnalysisResult_QNAME = new QName("http://health.xyp.gov.mn/", "WS300103_eHealthGetAnalysisResult");
    private final static QName _WS300103EHealthGetAnalysisResultResponse_QNAME = new QName("http://health.xyp.gov.mn/", "WS300103_eHealthGetAnalysisResultResponse");
    private final static QName _WS300104EHealthGetAnalysisDates_QNAME = new QName("http://health.xyp.gov.mn/", "WS300104_eHealthGetAnalysisDates");
    private final static QName _WS300104EHealthGetAnalysisDatesResponse_QNAME = new QName("http://health.xyp.gov.mn/", "WS300104_eHealthGetAnalysisDatesResponse");
    private final static QName _WS300105EHealthCheckPatientExists_QNAME = new QName("http://health.xyp.gov.mn/", "WS300105_eHealthCheckPatientExists");
    private final static QName _WS300105EHealthCheckPatientExistsResponse_QNAME = new QName("http://health.xyp.gov.mn/", "WS300105_eHealthCheckPatientExistsResponse");
    private final static QName _WS300106EHealthCreatePatient_QNAME = new QName("http://health.xyp.gov.mn/", "WS300106_eHealthCreatePatient");
    private final static QName _WS300106EHealthCreatePatientResponse_QNAME = new QName("http://health.xyp.gov.mn/", "WS300106_eHealthCreatePatientResponse");
    private final static QName _WS300107EHealthGetMedicalServices_QNAME = new QName("http://health.xyp.gov.mn/", "WS300107_eHealthGetMedicalServices");
    private final static QName _WS300107EHealthGetMedicalServicesResponse_QNAME = new QName("http://health.xyp.gov.mn/", "WS300107_eHealthGetMedicalServicesResponse");
    private final static QName _WS300108EHealthGetFreeTimeList_QNAME = new QName("http://health.xyp.gov.mn/", "WS300108_eHealthGetFreeTimeList");
    private final static QName _WS300108EHealthGetFreeTimeListResponse_QNAME = new QName("http://health.xyp.gov.mn/", "WS300108_eHealthGetFreeTimeListResponse");
    private final static QName _WS300109EHealthOnlineTimeOrderList_QNAME = new QName("http://health.xyp.gov.mn/", "WS300109_eHealthOnlineTimeOrderList");
    private final static QName _WS300109EHealthOnlineTimeOrderListResponse_QNAME = new QName("http://health.xyp.gov.mn/", "WS300109_eHealthOnlineTimeOrderListResponse");
    private final static QName _WS300110EHealthOnlineAppointmentOrder_QNAME = new QName("http://health.xyp.gov.mn/", "WS300110_eHealthOnlineAppointmentOrder");
    private final static QName _WS300110EHealthOnlineAppointmentOrderResponse_QNAME = new QName("http://health.xyp.gov.mn/", "WS300110_eHealthOnlineAppointmentOrderResponse");
    private final static QName _WS300111EHealthTimeOrderApprove_QNAME = new QName("http://health.xyp.gov.mn/", "WS300111_eHealthTimeOrderApprove");
    private final static QName _WS300111EHealthTimeOrderApproveResponse_QNAME = new QName("http://health.xyp.gov.mn/", "WS300111_eHealthTimeOrderApproveResponse");
    private final static QName _WS300112EHealthTimeOrderCancel_QNAME = new QName("http://health.xyp.gov.mn/", "WS300112_eHealthTimeOrderCancel");
    private final static QName _WS300112EHealthTimeOrderCancelResponse_QNAME = new QName("http://health.xyp.gov.mn/", "WS300112_eHealthTimeOrderCancelResponse");
    private final static QName _WS300113EHealthCitizenAnalisysInfo_QNAME = new QName("http://health.xyp.gov.mn/", "WS300113_eHealthCitizenAnalisysInfo");
    private final static QName _WS300113EHealthCitizenAnalisysInfoResponse_QNAME = new QName("http://health.xyp.gov.mn/", "WS300113_eHealthCitizenAnalisysInfoResponse");
    private final static QName _WS300114EHealthListService_QNAME = new QName("http://health.xyp.gov.mn/", "WS300114_eHealthListService");
    private final static QName _WS300114EHealthListServiceResponse_QNAME = new QName("http://health.xyp.gov.mn/", "WS300114_eHealthListServiceResponse");
    private final static QName _WS300115PcrPositiveInfo_QNAME = new QName("http://health.xyp.gov.mn/", "WS300115_pcrPositiveInfo");
    private final static QName _WS300115PcrPositiveInfoResponse_QNAME = new QName("http://health.xyp.gov.mn/", "WS300115_pcrPositiveInfoResponse");
    private final static QName _WS300116GetBloodTypeService_QNAME = new QName("http://health.xyp.gov.mn/", "WS300116_getBloodTypeService");
    private final static QName _WS300116GetBloodTypeServiceResponse_QNAME = new QName("http://health.xyp.gov.mn/", "WS300116_getBloodTypeServiceResponse");
    private final static QName _WS300117EarlyDetectionService_QNAME = new QName("http://health.xyp.gov.mn/", "WS300117_earlyDetectionService");
    private final static QName _WS300117EarlyDetectionServiceResponse_QNAME = new QName("http://health.xyp.gov.mn/", "WS300117_earlyDetectionServiceResponse");
    private final static QName _WS300118CovidPCRLastResultInfo_QNAME = new QName("http://health.xyp.gov.mn/", "WS300118_covidPCRLastResultInfo");
    private final static QName _WS300118CovidPCRLastResultInfoResponse_QNAME = new QName("http://health.xyp.gov.mn/", "WS300118_covidPCRLastResultInfoResponse");
    private final static QName _WS300119MedicineImportInsert_QNAME = new QName("http://health.xyp.gov.mn/", "WS300119_medicineImportInsert");
    private final static QName _WS300119MedicineImportInsertResponse_QNAME = new QName("http://health.xyp.gov.mn/", "WS300119_medicineImportInsertResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mn.gov.itc.emongolia.data.XypHealth
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WS300101GetInsuranceFee }
     * 
     */
    public WS300101GetInsuranceFee createWS300101GetInsuranceFee() {
        return new WS300101GetInsuranceFee();
    }

    /**
     * Create an instance of {@link WS300101GetInsuranceFeeResponse }
     * 
     */
    public WS300101GetInsuranceFeeResponse createWS300101GetInsuranceFeeResponse() {
        return new WS300101GetInsuranceFeeResponse();
    }

    /**
     * Create an instance of {@link WS300102EHealthGetHospitals }
     * 
     */
    public WS300102EHealthGetHospitals createWS300102EHealthGetHospitals() {
        return new WS300102EHealthGetHospitals();
    }

    /**
     * Create an instance of {@link WS300102EHealthGetHospitalsResponse }
     * 
     */
    public WS300102EHealthGetHospitalsResponse createWS300102EHealthGetHospitalsResponse() {
        return new WS300102EHealthGetHospitalsResponse();
    }

    /**
     * Create an instance of {@link WS300103EHealthGetAnalysisResult }
     * 
     */
    public WS300103EHealthGetAnalysisResult createWS300103EHealthGetAnalysisResult() {
        return new WS300103EHealthGetAnalysisResult();
    }

    /**
     * Create an instance of {@link WS300103EHealthGetAnalysisResultResponse }
     * 
     */
    public WS300103EHealthGetAnalysisResultResponse createWS300103EHealthGetAnalysisResultResponse() {
        return new WS300103EHealthGetAnalysisResultResponse();
    }

    /**
     * Create an instance of {@link WS300104EHealthGetAnalysisDates }
     * 
     */
    public WS300104EHealthGetAnalysisDates createWS300104EHealthGetAnalysisDates() {
        return new WS300104EHealthGetAnalysisDates();
    }

    /**
     * Create an instance of {@link WS300104EHealthGetAnalysisDatesResponse }
     * 
     */
    public WS300104EHealthGetAnalysisDatesResponse createWS300104EHealthGetAnalysisDatesResponse() {
        return new WS300104EHealthGetAnalysisDatesResponse();
    }

    /**
     * Create an instance of {@link WS300105EHealthCheckPatientExists }
     * 
     */
    public WS300105EHealthCheckPatientExists createWS300105EHealthCheckPatientExists() {
        return new WS300105EHealthCheckPatientExists();
    }

    /**
     * Create an instance of {@link WS300105EHealthCheckPatientExistsResponse }
     * 
     */
    public WS300105EHealthCheckPatientExistsResponse createWS300105EHealthCheckPatientExistsResponse() {
        return new WS300105EHealthCheckPatientExistsResponse();
    }

    /**
     * Create an instance of {@link WS300106EHealthCreatePatient }
     * 
     */
    public WS300106EHealthCreatePatient createWS300106EHealthCreatePatient() {
        return new WS300106EHealthCreatePatient();
    }

    /**
     * Create an instance of {@link WS300106EHealthCreatePatientResponse }
     * 
     */
    public WS300106EHealthCreatePatientResponse createWS300106EHealthCreatePatientResponse() {
        return new WS300106EHealthCreatePatientResponse();
    }

    /**
     * Create an instance of {@link WS300107EHealthGetMedicalServices }
     * 
     */
    public WS300107EHealthGetMedicalServices createWS300107EHealthGetMedicalServices() {
        return new WS300107EHealthGetMedicalServices();
    }

    /**
     * Create an instance of {@link WS300107EHealthGetMedicalServicesResponse }
     * 
     */
    public WS300107EHealthGetMedicalServicesResponse createWS300107EHealthGetMedicalServicesResponse() {
        return new WS300107EHealthGetMedicalServicesResponse();
    }

    /**
     * Create an instance of {@link WS300108EHealthGetFreeTimeList }
     * 
     */
    public WS300108EHealthGetFreeTimeList createWS300108EHealthGetFreeTimeList() {
        return new WS300108EHealthGetFreeTimeList();
    }

    /**
     * Create an instance of {@link WS300108EHealthGetFreeTimeListResponse }
     * 
     */
    public WS300108EHealthGetFreeTimeListResponse createWS300108EHealthGetFreeTimeListResponse() {
        return new WS300108EHealthGetFreeTimeListResponse();
    }

    /**
     * Create an instance of {@link WS300109EHealthOnlineTimeOrderList }
     * 
     */
    public WS300109EHealthOnlineTimeOrderList createWS300109EHealthOnlineTimeOrderList() {
        return new WS300109EHealthOnlineTimeOrderList();
    }

    /**
     * Create an instance of {@link WS300109EHealthOnlineTimeOrderListResponse }
     * 
     */
    public WS300109EHealthOnlineTimeOrderListResponse createWS300109EHealthOnlineTimeOrderListResponse() {
        return new WS300109EHealthOnlineTimeOrderListResponse();
    }

    /**
     * Create an instance of {@link WS300110EHealthOnlineAppointmentOrder }
     * 
     */
    public WS300110EHealthOnlineAppointmentOrder createWS300110EHealthOnlineAppointmentOrder() {
        return new WS300110EHealthOnlineAppointmentOrder();
    }

    /**
     * Create an instance of {@link WS300110EHealthOnlineAppointmentOrderResponse }
     * 
     */
    public WS300110EHealthOnlineAppointmentOrderResponse createWS300110EHealthOnlineAppointmentOrderResponse() {
        return new WS300110EHealthOnlineAppointmentOrderResponse();
    }

    /**
     * Create an instance of {@link WS300111EHealthTimeOrderApprove }
     * 
     */
    public WS300111EHealthTimeOrderApprove createWS300111EHealthTimeOrderApprove() {
        return new WS300111EHealthTimeOrderApprove();
    }

    /**
     * Create an instance of {@link WS300111EHealthTimeOrderApproveResponse }
     * 
     */
    public WS300111EHealthTimeOrderApproveResponse createWS300111EHealthTimeOrderApproveResponse() {
        return new WS300111EHealthTimeOrderApproveResponse();
    }

    /**
     * Create an instance of {@link WS300112EHealthTimeOrderCancel }
     * 
     */
    public WS300112EHealthTimeOrderCancel createWS300112EHealthTimeOrderCancel() {
        return new WS300112EHealthTimeOrderCancel();
    }

    /**
     * Create an instance of {@link WS300112EHealthTimeOrderCancelResponse }
     * 
     */
    public WS300112EHealthTimeOrderCancelResponse createWS300112EHealthTimeOrderCancelResponse() {
        return new WS300112EHealthTimeOrderCancelResponse();
    }

    /**
     * Create an instance of {@link WS300113EHealthCitizenAnalisysInfo }
     * 
     */
    public WS300113EHealthCitizenAnalisysInfo createWS300113EHealthCitizenAnalisysInfo() {
        return new WS300113EHealthCitizenAnalisysInfo();
    }

    /**
     * Create an instance of {@link WS300113EHealthCitizenAnalisysInfoResponse }
     * 
     */
    public WS300113EHealthCitizenAnalisysInfoResponse createWS300113EHealthCitizenAnalisysInfoResponse() {
        return new WS300113EHealthCitizenAnalisysInfoResponse();
    }

    /**
     * Create an instance of {@link WS300114EHealthListService }
     * 
     */
    public WS300114EHealthListService createWS300114EHealthListService() {
        return new WS300114EHealthListService();
    }

    /**
     * Create an instance of {@link WS300114EHealthListServiceResponse }
     * 
     */
    public WS300114EHealthListServiceResponse createWS300114EHealthListServiceResponse() {
        return new WS300114EHealthListServiceResponse();
    }

    /**
     * Create an instance of {@link WS300115PcrPositiveInfo }
     * 
     */
    public WS300115PcrPositiveInfo createWS300115PcrPositiveInfo() {
        return new WS300115PcrPositiveInfo();
    }

    /**
     * Create an instance of {@link WS300115PcrPositiveInfoResponse }
     * 
     */
    public WS300115PcrPositiveInfoResponse createWS300115PcrPositiveInfoResponse() {
        return new WS300115PcrPositiveInfoResponse();
    }

    /**
     * Create an instance of {@link WS300116GetBloodTypeService }
     * 
     */
    public WS300116GetBloodTypeService createWS300116GetBloodTypeService() {
        return new WS300116GetBloodTypeService();
    }

    /**
     * Create an instance of {@link WS300116GetBloodTypeServiceResponse }
     * 
     */
    public WS300116GetBloodTypeServiceResponse createWS300116GetBloodTypeServiceResponse() {
        return new WS300116GetBloodTypeServiceResponse();
    }

    /**
     * Create an instance of {@link WS300117EarlyDetectionService }
     * 
     */
    public WS300117EarlyDetectionService createWS300117EarlyDetectionService() {
        return new WS300117EarlyDetectionService();
    }

    /**
     * Create an instance of {@link WS300117EarlyDetectionServiceResponse }
     * 
     */
    public WS300117EarlyDetectionServiceResponse createWS300117EarlyDetectionServiceResponse() {
        return new WS300117EarlyDetectionServiceResponse();
    }

    /**
     * Create an instance of {@link WS300118CovidPCRLastResultInfo }
     * 
     */
    public WS300118CovidPCRLastResultInfo createWS300118CovidPCRLastResultInfo() {
        return new WS300118CovidPCRLastResultInfo();
    }

    /**
     * Create an instance of {@link WS300118CovidPCRLastResultInfoResponse }
     * 
     */
    public WS300118CovidPCRLastResultInfoResponse createWS300118CovidPCRLastResultInfoResponse() {
        return new WS300118CovidPCRLastResultInfoResponse();
    }

    /**
     * Create an instance of {@link WS300119MedicineImportInsert }
     * 
     */
    public WS300119MedicineImportInsert createWS300119MedicineImportInsert() {
        return new WS300119MedicineImportInsert();
    }

    /**
     * Create an instance of {@link WS300119MedicineImportInsertResponse }
     * 
     */
    public WS300119MedicineImportInsertResponse createWS300119MedicineImportInsertResponse() {
        return new WS300119MedicineImportInsertResponse();
    }

    /**
     * Create an instance of {@link EHealthAppointmentOrderRequestData }
     * 
     */
    public EHealthAppointmentOrderRequestData createEHealthAppointmentOrderRequestData() {
        return new EHealthAppointmentOrderRequestData();
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
     * Create an instance of {@link EHealthAppointmentOrderData }
     * 
     */
    public EHealthAppointmentOrderData createEHealthAppointmentOrderData() {
        return new EHealthAppointmentOrderData();
    }

    /**
     * Create an instance of {@link EHealthGetAnalysisResultRequestData }
     * 
     */
    public EHealthGetAnalysisResultRequestData createEHealthGetAnalysisResultRequestData() {
        return new EHealthGetAnalysisResultRequestData();
    }

    /**
     * Create an instance of {@link EHealthGetAnalysisResultData }
     * 
     */
    public EHealthGetAnalysisResultData createEHealthGetAnalysisResultData() {
        return new EHealthGetAnalysisResultData();
    }

    /**
     * Create an instance of {@link EHealthListRequestData }
     * 
     */
    public EHealthListRequestData createEHealthListRequestData() {
        return new EHealthListRequestData();
    }

    /**
     * Create an instance of {@link EHealthListData }
     * 
     */
    public EHealthListData createEHealthListData() {
        return new EHealthListData();
    }

    /**
     * Create an instance of {@link EHealthTimeOrderApproveRequestData }
     * 
     */
    public EHealthTimeOrderApproveRequestData createEHealthTimeOrderApproveRequestData() {
        return new EHealthTimeOrderApproveRequestData();
    }

    /**
     * Create an instance of {@link EHealthCheckData }
     * 
     */
    public EHealthCheckData createEHealthCheckData() {
        return new EHealthCheckData();
    }

    /**
     * Create an instance of {@link EHealthGetFreeTimeRequestData }
     * 
     */
    public EHealthGetFreeTimeRequestData createEHealthGetFreeTimeRequestData() {
        return new EHealthGetFreeTimeRequestData();
    }

    /**
     * Create an instance of {@link EHealthGetFreeTimeData }
     * 
     */
    public EHealthGetFreeTimeData createEHealthGetFreeTimeData() {
        return new EHealthGetFreeTimeData();
    }

    /**
     * Create an instance of {@link EHealthGetFreeTimeDetailData }
     * 
     */
    public EHealthGetFreeTimeDetailData createEHealthGetFreeTimeDetailData() {
        return new EHealthGetFreeTimeDetailData();
    }

    /**
     * Create an instance of {@link EarlyDetectionRequestData }
     * 
     */
    public EarlyDetectionRequestData createEarlyDetectionRequestData() {
        return new EarlyDetectionRequestData();
    }

    /**
     * Create an instance of {@link EarlyDetectionData }
     * 
     */
    public EarlyDetectionData createEarlyDetectionData() {
        return new EarlyDetectionData();
    }

    /**
     * Create an instance of {@link RegisterRequestData }
     * 
     */
    public RegisterRequestData createRegisterRequestData() {
        return new RegisterRequestData();
    }

    /**
     * Create an instance of {@link InsuranceFeeData }
     * 
     */
    public InsuranceFeeData createInsuranceFeeData() {
        return new InsuranceFeeData();
    }

    /**
     * Create an instance of {@link InsuranceFeeDetailData }
     * 
     */
    public InsuranceFeeDetailData createInsuranceFeeDetailData() {
        return new InsuranceFeeDetailData();
    }

    /**
     * Create an instance of {@link EHealthCreatePatientRequestData }
     * 
     */
    public EHealthCreatePatientRequestData createEHealthCreatePatientRequestData() {
        return new EHealthCreatePatientRequestData();
    }

    /**
     * Create an instance of {@link EhealtBasicRequestData }
     * 
     */
    public EhealtBasicRequestData createEhealtBasicRequestData() {
        return new EhealtBasicRequestData();
    }

    /**
     * Create an instance of {@link EHealthOnlineTimeOrderData }
     * 
     */
    public EHealthOnlineTimeOrderData createEHealthOnlineTimeOrderData() {
        return new EHealthOnlineTimeOrderData();
    }

    /**
     * Create an instance of {@link EHealthOnlineTimeOrderDetailData }
     * 
     */
    public EHealthOnlineTimeOrderDetailData createEHealthOnlineTimeOrderDetailData() {
        return new EHealthOnlineTimeOrderDetailData();
    }

    /**
     * Create an instance of {@link BloodTypeData }
     * 
     */
    public BloodTypeData createBloodTypeData() {
        return new BloodTypeData();
    }

    /**
     * Create an instance of {@link EHealthGetMedicalServicesRequestData }
     * 
     */
    public EHealthGetMedicalServicesRequestData createEHealthGetMedicalServicesRequestData() {
        return new EHealthGetMedicalServicesRequestData();
    }

    /**
     * Create an instance of {@link EHealthGetMedicalServiceData }
     * 
     */
    public EHealthGetMedicalServiceData createEHealthGetMedicalServiceData() {
        return new EHealthGetMedicalServiceData();
    }

    /**
     * Create an instance of {@link EHealthGetMedicalServiceDetailData }
     * 
     */
    public EHealthGetMedicalServiceDetailData createEHealthGetMedicalServiceDetailData() {
        return new EHealthGetMedicalServiceDetailData();
    }

    /**
     * Create an instance of {@link CovidPCRLastResultData }
     * 
     */
    public CovidPCRLastResultData createCovidPCRLastResultData() {
        return new CovidPCRLastResultData();
    }

    /**
     * Create an instance of {@link MedicineImportInsertRequestData }
     * 
     */
    public MedicineImportInsertRequestData createMedicineImportInsertRequestData() {
        return new MedicineImportInsertRequestData();
    }

    /**
     * Create an instance of {@link MedicineImportInsertRequestDetailData }
     * 
     */
    public MedicineImportInsertRequestDetailData createMedicineImportInsertRequestDetailData() {
        return new MedicineImportInsertRequestDetailData();
    }

    /**
     * Create an instance of {@link MedicineImportInsertData }
     * 
     */
    public MedicineImportInsertData createMedicineImportInsertData() {
        return new MedicineImportInsertData();
    }

    /**
     * Create an instance of {@link PcrPositiveRequestData }
     * 
     */
    public PcrPositiveRequestData createPcrPositiveRequestData() {
        return new PcrPositiveRequestData();
    }

    /**
     * Create an instance of {@link PcrPositiveData }
     * 
     */
    public PcrPositiveData createPcrPositiveData() {
        return new PcrPositiveData();
    }

    /**
     * Create an instance of {@link PcrPositiveDetailData }
     * 
     */
    public PcrPositiveDetailData createPcrPositiveDetailData() {
        return new PcrPositiveDetailData();
    }

    /**
     * Create an instance of {@link EHealthGetHospitalsData }
     * 
     */
    public EHealthGetHospitalsData createEHealthGetHospitalsData() {
        return new EHealthGetHospitalsData();
    }

    /**
     * Create an instance of {@link EHealthGetHospitalsDetailData }
     * 
     */
    public EHealthGetHospitalsDetailData createEHealthGetHospitalsDetailData() {
        return new EHealthGetHospitalsDetailData();
    }

    /**
     * Create an instance of {@link EHealthCitizenAnalysisRequestData }
     * 
     */
    public EHealthCitizenAnalysisRequestData createEHealthCitizenAnalysisRequestData() {
        return new EHealthCitizenAnalysisRequestData();
    }

    /**
     * Create an instance of {@link EHealthCitizenAnalysisData }
     * 
     */
    public EHealthCitizenAnalysisData createEHealthCitizenAnalysisData() {
        return new EHealthCitizenAnalysisData();
    }

    /**
     * Create an instance of {@link EHealthCitizenAnalysisDetailData }
     * 
     */
    public EHealthCitizenAnalysisDetailData createEHealthCitizenAnalysisDetailData() {
        return new EHealthCitizenAnalysisDetailData();
    }

    /**
     * Create an instance of {@link EHealthAnalysisData }
     * 
     */
    public EHealthAnalysisData createEHealthAnalysisData() {
        return new EHealthAnalysisData();
    }

    /**
     * Create an instance of {@link EHealthGetAnalysisDatesData }
     * 
     */
    public EHealthGetAnalysisDatesData createEHealthGetAnalysisDatesData() {
        return new EHealthGetAnalysisDatesData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS300101GetInsuranceFee }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS300101GetInsuranceFee }{@code >}
     */
    @XmlElementDecl(namespace = "http://health.xyp.gov.mn/", name = "WS300101_getInsuranceFee")
    public JAXBElement<WS300101GetInsuranceFee> createWS300101GetInsuranceFee(WS300101GetInsuranceFee value) {
        return new JAXBElement<WS300101GetInsuranceFee>(_WS300101GetInsuranceFee_QNAME, WS300101GetInsuranceFee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS300101GetInsuranceFeeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS300101GetInsuranceFeeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://health.xyp.gov.mn/", name = "WS300101_getInsuranceFeeResponse")
    public JAXBElement<WS300101GetInsuranceFeeResponse> createWS300101GetInsuranceFeeResponse(WS300101GetInsuranceFeeResponse value) {
        return new JAXBElement<WS300101GetInsuranceFeeResponse>(_WS300101GetInsuranceFeeResponse_QNAME, WS300101GetInsuranceFeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS300102EHealthGetHospitals }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS300102EHealthGetHospitals }{@code >}
     */
    @XmlElementDecl(namespace = "http://health.xyp.gov.mn/", name = "WS300102_eHealthGetHospitals")
    public JAXBElement<WS300102EHealthGetHospitals> createWS300102EHealthGetHospitals(WS300102EHealthGetHospitals value) {
        return new JAXBElement<WS300102EHealthGetHospitals>(_WS300102EHealthGetHospitals_QNAME, WS300102EHealthGetHospitals.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS300102EHealthGetHospitalsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS300102EHealthGetHospitalsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://health.xyp.gov.mn/", name = "WS300102_eHealthGetHospitalsResponse")
    public JAXBElement<WS300102EHealthGetHospitalsResponse> createWS300102EHealthGetHospitalsResponse(WS300102EHealthGetHospitalsResponse value) {
        return new JAXBElement<WS300102EHealthGetHospitalsResponse>(_WS300102EHealthGetHospitalsResponse_QNAME, WS300102EHealthGetHospitalsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS300103EHealthGetAnalysisResult }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS300103EHealthGetAnalysisResult }{@code >}
     */
    @XmlElementDecl(namespace = "http://health.xyp.gov.mn/", name = "WS300103_eHealthGetAnalysisResult")
    public JAXBElement<WS300103EHealthGetAnalysisResult> createWS300103EHealthGetAnalysisResult(WS300103EHealthGetAnalysisResult value) {
        return new JAXBElement<WS300103EHealthGetAnalysisResult>(_WS300103EHealthGetAnalysisResult_QNAME, WS300103EHealthGetAnalysisResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS300103EHealthGetAnalysisResultResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS300103EHealthGetAnalysisResultResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://health.xyp.gov.mn/", name = "WS300103_eHealthGetAnalysisResultResponse")
    public JAXBElement<WS300103EHealthGetAnalysisResultResponse> createWS300103EHealthGetAnalysisResultResponse(WS300103EHealthGetAnalysisResultResponse value) {
        return new JAXBElement<WS300103EHealthGetAnalysisResultResponse>(_WS300103EHealthGetAnalysisResultResponse_QNAME, WS300103EHealthGetAnalysisResultResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS300104EHealthGetAnalysisDates }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS300104EHealthGetAnalysisDates }{@code >}
     */
    @XmlElementDecl(namespace = "http://health.xyp.gov.mn/", name = "WS300104_eHealthGetAnalysisDates")
    public JAXBElement<WS300104EHealthGetAnalysisDates> createWS300104EHealthGetAnalysisDates(WS300104EHealthGetAnalysisDates value) {
        return new JAXBElement<WS300104EHealthGetAnalysisDates>(_WS300104EHealthGetAnalysisDates_QNAME, WS300104EHealthGetAnalysisDates.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS300104EHealthGetAnalysisDatesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS300104EHealthGetAnalysisDatesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://health.xyp.gov.mn/", name = "WS300104_eHealthGetAnalysisDatesResponse")
    public JAXBElement<WS300104EHealthGetAnalysisDatesResponse> createWS300104EHealthGetAnalysisDatesResponse(WS300104EHealthGetAnalysisDatesResponse value) {
        return new JAXBElement<WS300104EHealthGetAnalysisDatesResponse>(_WS300104EHealthGetAnalysisDatesResponse_QNAME, WS300104EHealthGetAnalysisDatesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS300105EHealthCheckPatientExists }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS300105EHealthCheckPatientExists }{@code >}
     */
    @XmlElementDecl(namespace = "http://health.xyp.gov.mn/", name = "WS300105_eHealthCheckPatientExists")
    public JAXBElement<WS300105EHealthCheckPatientExists> createWS300105EHealthCheckPatientExists(WS300105EHealthCheckPatientExists value) {
        return new JAXBElement<WS300105EHealthCheckPatientExists>(_WS300105EHealthCheckPatientExists_QNAME, WS300105EHealthCheckPatientExists.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS300105EHealthCheckPatientExistsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS300105EHealthCheckPatientExistsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://health.xyp.gov.mn/", name = "WS300105_eHealthCheckPatientExistsResponse")
    public JAXBElement<WS300105EHealthCheckPatientExistsResponse> createWS300105EHealthCheckPatientExistsResponse(WS300105EHealthCheckPatientExistsResponse value) {
        return new JAXBElement<WS300105EHealthCheckPatientExistsResponse>(_WS300105EHealthCheckPatientExistsResponse_QNAME, WS300105EHealthCheckPatientExistsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS300106EHealthCreatePatient }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS300106EHealthCreatePatient }{@code >}
     */
    @XmlElementDecl(namespace = "http://health.xyp.gov.mn/", name = "WS300106_eHealthCreatePatient")
    public JAXBElement<WS300106EHealthCreatePatient> createWS300106EHealthCreatePatient(WS300106EHealthCreatePatient value) {
        return new JAXBElement<WS300106EHealthCreatePatient>(_WS300106EHealthCreatePatient_QNAME, WS300106EHealthCreatePatient.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS300106EHealthCreatePatientResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS300106EHealthCreatePatientResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://health.xyp.gov.mn/", name = "WS300106_eHealthCreatePatientResponse")
    public JAXBElement<WS300106EHealthCreatePatientResponse> createWS300106EHealthCreatePatientResponse(WS300106EHealthCreatePatientResponse value) {
        return new JAXBElement<WS300106EHealthCreatePatientResponse>(_WS300106EHealthCreatePatientResponse_QNAME, WS300106EHealthCreatePatientResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS300107EHealthGetMedicalServices }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS300107EHealthGetMedicalServices }{@code >}
     */
    @XmlElementDecl(namespace = "http://health.xyp.gov.mn/", name = "WS300107_eHealthGetMedicalServices")
    public JAXBElement<WS300107EHealthGetMedicalServices> createWS300107EHealthGetMedicalServices(WS300107EHealthGetMedicalServices value) {
        return new JAXBElement<WS300107EHealthGetMedicalServices>(_WS300107EHealthGetMedicalServices_QNAME, WS300107EHealthGetMedicalServices.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS300107EHealthGetMedicalServicesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS300107EHealthGetMedicalServicesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://health.xyp.gov.mn/", name = "WS300107_eHealthGetMedicalServicesResponse")
    public JAXBElement<WS300107EHealthGetMedicalServicesResponse> createWS300107EHealthGetMedicalServicesResponse(WS300107EHealthGetMedicalServicesResponse value) {
        return new JAXBElement<WS300107EHealthGetMedicalServicesResponse>(_WS300107EHealthGetMedicalServicesResponse_QNAME, WS300107EHealthGetMedicalServicesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS300108EHealthGetFreeTimeList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS300108EHealthGetFreeTimeList }{@code >}
     */
    @XmlElementDecl(namespace = "http://health.xyp.gov.mn/", name = "WS300108_eHealthGetFreeTimeList")
    public JAXBElement<WS300108EHealthGetFreeTimeList> createWS300108EHealthGetFreeTimeList(WS300108EHealthGetFreeTimeList value) {
        return new JAXBElement<WS300108EHealthGetFreeTimeList>(_WS300108EHealthGetFreeTimeList_QNAME, WS300108EHealthGetFreeTimeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS300108EHealthGetFreeTimeListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS300108EHealthGetFreeTimeListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://health.xyp.gov.mn/", name = "WS300108_eHealthGetFreeTimeListResponse")
    public JAXBElement<WS300108EHealthGetFreeTimeListResponse> createWS300108EHealthGetFreeTimeListResponse(WS300108EHealthGetFreeTimeListResponse value) {
        return new JAXBElement<WS300108EHealthGetFreeTimeListResponse>(_WS300108EHealthGetFreeTimeListResponse_QNAME, WS300108EHealthGetFreeTimeListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS300109EHealthOnlineTimeOrderList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS300109EHealthOnlineTimeOrderList }{@code >}
     */
    @XmlElementDecl(namespace = "http://health.xyp.gov.mn/", name = "WS300109_eHealthOnlineTimeOrderList")
    public JAXBElement<WS300109EHealthOnlineTimeOrderList> createWS300109EHealthOnlineTimeOrderList(WS300109EHealthOnlineTimeOrderList value) {
        return new JAXBElement<WS300109EHealthOnlineTimeOrderList>(_WS300109EHealthOnlineTimeOrderList_QNAME, WS300109EHealthOnlineTimeOrderList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS300109EHealthOnlineTimeOrderListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS300109EHealthOnlineTimeOrderListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://health.xyp.gov.mn/", name = "WS300109_eHealthOnlineTimeOrderListResponse")
    public JAXBElement<WS300109EHealthOnlineTimeOrderListResponse> createWS300109EHealthOnlineTimeOrderListResponse(WS300109EHealthOnlineTimeOrderListResponse value) {
        return new JAXBElement<WS300109EHealthOnlineTimeOrderListResponse>(_WS300109EHealthOnlineTimeOrderListResponse_QNAME, WS300109EHealthOnlineTimeOrderListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS300110EHealthOnlineAppointmentOrder }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS300110EHealthOnlineAppointmentOrder }{@code >}
     */
    @XmlElementDecl(namespace = "http://health.xyp.gov.mn/", name = "WS300110_eHealthOnlineAppointmentOrder")
    public JAXBElement<WS300110EHealthOnlineAppointmentOrder> createWS300110EHealthOnlineAppointmentOrder(WS300110EHealthOnlineAppointmentOrder value) {
        return new JAXBElement<WS300110EHealthOnlineAppointmentOrder>(_WS300110EHealthOnlineAppointmentOrder_QNAME, WS300110EHealthOnlineAppointmentOrder.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS300110EHealthOnlineAppointmentOrderResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS300110EHealthOnlineAppointmentOrderResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://health.xyp.gov.mn/", name = "WS300110_eHealthOnlineAppointmentOrderResponse")
    public JAXBElement<WS300110EHealthOnlineAppointmentOrderResponse> createWS300110EHealthOnlineAppointmentOrderResponse(WS300110EHealthOnlineAppointmentOrderResponse value) {
        return new JAXBElement<WS300110EHealthOnlineAppointmentOrderResponse>(_WS300110EHealthOnlineAppointmentOrderResponse_QNAME, WS300110EHealthOnlineAppointmentOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS300111EHealthTimeOrderApprove }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS300111EHealthTimeOrderApprove }{@code >}
     */
    @XmlElementDecl(namespace = "http://health.xyp.gov.mn/", name = "WS300111_eHealthTimeOrderApprove")
    public JAXBElement<WS300111EHealthTimeOrderApprove> createWS300111EHealthTimeOrderApprove(WS300111EHealthTimeOrderApprove value) {
        return new JAXBElement<WS300111EHealthTimeOrderApprove>(_WS300111EHealthTimeOrderApprove_QNAME, WS300111EHealthTimeOrderApprove.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS300111EHealthTimeOrderApproveResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS300111EHealthTimeOrderApproveResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://health.xyp.gov.mn/", name = "WS300111_eHealthTimeOrderApproveResponse")
    public JAXBElement<WS300111EHealthTimeOrderApproveResponse> createWS300111EHealthTimeOrderApproveResponse(WS300111EHealthTimeOrderApproveResponse value) {
        return new JAXBElement<WS300111EHealthTimeOrderApproveResponse>(_WS300111EHealthTimeOrderApproveResponse_QNAME, WS300111EHealthTimeOrderApproveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS300112EHealthTimeOrderCancel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS300112EHealthTimeOrderCancel }{@code >}
     */
    @XmlElementDecl(namespace = "http://health.xyp.gov.mn/", name = "WS300112_eHealthTimeOrderCancel")
    public JAXBElement<WS300112EHealthTimeOrderCancel> createWS300112EHealthTimeOrderCancel(WS300112EHealthTimeOrderCancel value) {
        return new JAXBElement<WS300112EHealthTimeOrderCancel>(_WS300112EHealthTimeOrderCancel_QNAME, WS300112EHealthTimeOrderCancel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS300112EHealthTimeOrderCancelResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS300112EHealthTimeOrderCancelResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://health.xyp.gov.mn/", name = "WS300112_eHealthTimeOrderCancelResponse")
    public JAXBElement<WS300112EHealthTimeOrderCancelResponse> createWS300112EHealthTimeOrderCancelResponse(WS300112EHealthTimeOrderCancelResponse value) {
        return new JAXBElement<WS300112EHealthTimeOrderCancelResponse>(_WS300112EHealthTimeOrderCancelResponse_QNAME, WS300112EHealthTimeOrderCancelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS300113EHealthCitizenAnalisysInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS300113EHealthCitizenAnalisysInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://health.xyp.gov.mn/", name = "WS300113_eHealthCitizenAnalisysInfo")
    public JAXBElement<WS300113EHealthCitizenAnalisysInfo> createWS300113EHealthCitizenAnalisysInfo(WS300113EHealthCitizenAnalisysInfo value) {
        return new JAXBElement<WS300113EHealthCitizenAnalisysInfo>(_WS300113EHealthCitizenAnalisysInfo_QNAME, WS300113EHealthCitizenAnalisysInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS300113EHealthCitizenAnalisysInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS300113EHealthCitizenAnalisysInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://health.xyp.gov.mn/", name = "WS300113_eHealthCitizenAnalisysInfoResponse")
    public JAXBElement<WS300113EHealthCitizenAnalisysInfoResponse> createWS300113EHealthCitizenAnalisysInfoResponse(WS300113EHealthCitizenAnalisysInfoResponse value) {
        return new JAXBElement<WS300113EHealthCitizenAnalisysInfoResponse>(_WS300113EHealthCitizenAnalisysInfoResponse_QNAME, WS300113EHealthCitizenAnalisysInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS300114EHealthListService }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS300114EHealthListService }{@code >}
     */
    @XmlElementDecl(namespace = "http://health.xyp.gov.mn/", name = "WS300114_eHealthListService")
    public JAXBElement<WS300114EHealthListService> createWS300114EHealthListService(WS300114EHealthListService value) {
        return new JAXBElement<WS300114EHealthListService>(_WS300114EHealthListService_QNAME, WS300114EHealthListService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS300114EHealthListServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS300114EHealthListServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://health.xyp.gov.mn/", name = "WS300114_eHealthListServiceResponse")
    public JAXBElement<WS300114EHealthListServiceResponse> createWS300114EHealthListServiceResponse(WS300114EHealthListServiceResponse value) {
        return new JAXBElement<WS300114EHealthListServiceResponse>(_WS300114EHealthListServiceResponse_QNAME, WS300114EHealthListServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS300115PcrPositiveInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS300115PcrPositiveInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://health.xyp.gov.mn/", name = "WS300115_pcrPositiveInfo")
    public JAXBElement<WS300115PcrPositiveInfo> createWS300115PcrPositiveInfo(WS300115PcrPositiveInfo value) {
        return new JAXBElement<WS300115PcrPositiveInfo>(_WS300115PcrPositiveInfo_QNAME, WS300115PcrPositiveInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS300115PcrPositiveInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS300115PcrPositiveInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://health.xyp.gov.mn/", name = "WS300115_pcrPositiveInfoResponse")
    public JAXBElement<WS300115PcrPositiveInfoResponse> createWS300115PcrPositiveInfoResponse(WS300115PcrPositiveInfoResponse value) {
        return new JAXBElement<WS300115PcrPositiveInfoResponse>(_WS300115PcrPositiveInfoResponse_QNAME, WS300115PcrPositiveInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS300116GetBloodTypeService }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS300116GetBloodTypeService }{@code >}
     */
    @XmlElementDecl(namespace = "http://health.xyp.gov.mn/", name = "WS300116_getBloodTypeService")
    public JAXBElement<WS300116GetBloodTypeService> createWS300116GetBloodTypeService(WS300116GetBloodTypeService value) {
        return new JAXBElement<WS300116GetBloodTypeService>(_WS300116GetBloodTypeService_QNAME, WS300116GetBloodTypeService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS300116GetBloodTypeServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS300116GetBloodTypeServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://health.xyp.gov.mn/", name = "WS300116_getBloodTypeServiceResponse")
    public JAXBElement<WS300116GetBloodTypeServiceResponse> createWS300116GetBloodTypeServiceResponse(WS300116GetBloodTypeServiceResponse value) {
        return new JAXBElement<WS300116GetBloodTypeServiceResponse>(_WS300116GetBloodTypeServiceResponse_QNAME, WS300116GetBloodTypeServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS300117EarlyDetectionService }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS300117EarlyDetectionService }{@code >}
     */
    @XmlElementDecl(namespace = "http://health.xyp.gov.mn/", name = "WS300117_earlyDetectionService")
    public JAXBElement<WS300117EarlyDetectionService> createWS300117EarlyDetectionService(WS300117EarlyDetectionService value) {
        return new JAXBElement<WS300117EarlyDetectionService>(_WS300117EarlyDetectionService_QNAME, WS300117EarlyDetectionService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS300117EarlyDetectionServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS300117EarlyDetectionServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://health.xyp.gov.mn/", name = "WS300117_earlyDetectionServiceResponse")
    public JAXBElement<WS300117EarlyDetectionServiceResponse> createWS300117EarlyDetectionServiceResponse(WS300117EarlyDetectionServiceResponse value) {
        return new JAXBElement<WS300117EarlyDetectionServiceResponse>(_WS300117EarlyDetectionServiceResponse_QNAME, WS300117EarlyDetectionServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS300118CovidPCRLastResultInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS300118CovidPCRLastResultInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://health.xyp.gov.mn/", name = "WS300118_covidPCRLastResultInfo")
    public JAXBElement<WS300118CovidPCRLastResultInfo> createWS300118CovidPCRLastResultInfo(WS300118CovidPCRLastResultInfo value) {
        return new JAXBElement<WS300118CovidPCRLastResultInfo>(_WS300118CovidPCRLastResultInfo_QNAME, WS300118CovidPCRLastResultInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS300118CovidPCRLastResultInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS300118CovidPCRLastResultInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://health.xyp.gov.mn/", name = "WS300118_covidPCRLastResultInfoResponse")
    public JAXBElement<WS300118CovidPCRLastResultInfoResponse> createWS300118CovidPCRLastResultInfoResponse(WS300118CovidPCRLastResultInfoResponse value) {
        return new JAXBElement<WS300118CovidPCRLastResultInfoResponse>(_WS300118CovidPCRLastResultInfoResponse_QNAME, WS300118CovidPCRLastResultInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS300119MedicineImportInsert }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS300119MedicineImportInsert }{@code >}
     */
    @XmlElementDecl(namespace = "http://health.xyp.gov.mn/", name = "WS300119_medicineImportInsert")
    public JAXBElement<WS300119MedicineImportInsert> createWS300119MedicineImportInsert(WS300119MedicineImportInsert value) {
        return new JAXBElement<WS300119MedicineImportInsert>(_WS300119MedicineImportInsert_QNAME, WS300119MedicineImportInsert.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS300119MedicineImportInsertResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS300119MedicineImportInsertResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://health.xyp.gov.mn/", name = "WS300119_medicineImportInsertResponse")
    public JAXBElement<WS300119MedicineImportInsertResponse> createWS300119MedicineImportInsertResponse(WS300119MedicineImportInsertResponse value) {
        return new JAXBElement<WS300119MedicineImportInsertResponse>(_WS300119MedicineImportInsertResponse_QNAME, WS300119MedicineImportInsertResponse.class, null, value);
    }

}
