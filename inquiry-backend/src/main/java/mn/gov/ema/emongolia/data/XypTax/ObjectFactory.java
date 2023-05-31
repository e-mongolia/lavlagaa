
package mn.gov.ema.emongolia.data.XypTax;

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
 * generated in the mn.gov.itc.emongolia.data.XypTax package. 
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

    private final static QName _GetBankAccountInfo_QNAME = new QName("http://ws/", "getBankAccountInfo");
    private final static QName _GetBankAccountInfoResponse_QNAME = new QName("http://ws/", "getBankAccountInfoResponse");
    private final static QName _GetSalaryInfo_QNAME = new QName("http://ws/", "getSalaryInfo");
    private final static QName _GetSalaryInfoResponse_QNAME = new QName("http://ws/", "getSalaryInfoResponse");
    private final static QName _GetServiceDeptLogTender_QNAME = new QName("http://ws/", "getServiceDeptLogTender");
    private final static QName _GetServiceDeptLogTenderResponse_QNAME = new QName("http://ws/", "getServiceDeptLogTenderResponse");
    private final static QName _GetServiceIncomeLog_QNAME = new QName("http://ws/", "getServiceIncomeLog");
    private final static QName _GetServiceIncomeLogResponse_QNAME = new QName("http://ws/", "getServiceIncomeLogResponse");
    private final static QName _GetServiceIncomeLogTender_QNAME = new QName("http://ws/", "getServiceIncomeLogTender");
    private final static QName _GetServiceIncomeLogTenderResponse_QNAME = new QName("http://ws/", "getServiceIncomeLogTenderResponse");
    private final static QName _GetServiceLogTender_QNAME = new QName("http://ws/", "getServiceLogTender");
    private final static QName _GetServiceLogTenderResponse_QNAME = new QName("http://ws/", "getServiceLogTenderResponse");
    private final static QName _GetTaxpayerDeptInfo_QNAME = new QName("http://ws/", "getTaxpayerDeptInfo");
    private final static QName _GetTaxpayerDeptInfoResponse_QNAME = new QName("http://ws/", "getTaxpayerDeptInfoResponse");
    private final static QName _GetTaxpayerInfo_QNAME = new QName("http://ws/", "getTaxpayerInfo");
    private final static QName _GetTaxpayerInfoResponse_QNAME = new QName("http://ws/", "getTaxpayerInfoResponse");
    private final static QName _GetTaxpayerTaxPayable_QNAME = new QName("http://ws/", "getTaxpayerTaxPayable");
    private final static QName _GetTaxpayerTaxPayableResponse_QNAME = new QName("http://ws/", "getTaxpayerTaxPayableResponse");
    private final static QName _GetUserInfo_QNAME = new QName("http://ws/", "getUserInfo");
    private final static QName _GetUserInfoResponse_QNAME = new QName("http://ws/", "getUserInfoResponse");
    private final static QName _WS100601GetTaxPayerInfo_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100601_getTaxPayerInfo");
    private final static QName _WS100601GetTaxPayerInfoResponse_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100601_getTaxPayerInfoResponse");
    private final static QName _WS100602GetTaxPayerTaxPayable_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100602_getTaxPayerTaxPayable");
    private final static QName _WS100602GetTaxPayerTaxPayableResponse_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100602_getTaxPayerTaxPayableResponse");
    private final static QName _WS100603GetServiceIncomeLog_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100603_getServiceIncomeLog");
    private final static QName _WS100603GetServiceIncomeLogResponse_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100603_getServiceIncomeLogResponse");
    private final static QName _WS100604GetSalaryInfo_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100604_getSalaryInfo");
    private final static QName _WS100604GetSalaryInfoResponse_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100604_getSalaryInfoResponse");
    private final static QName _WS100605GetTaxPayerDeptInfo_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100605_getTaxPayerDeptInfo");
    private final static QName _WS100605GetTaxPayerDeptInfoResponse_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100605_getTaxPayerDeptInfoResponse");
    private final static QName _WS100606GetTaxUserInfo_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100606_getTaxUserInfo");
    private final static QName _WS100606GetTaxUserInfoResponse_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100606_getTaxUserInfoResponse");
    private final static QName _WS100607InsertTaxInvoice_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100607_insertTaxInvoice");
    private final static QName _WS100607InsertTaxInvoiceResponse_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100607_insertTaxInvoiceResponse");
    private final static QName _WS100608InsertTaxInvoiceDetail_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100608_insertTaxInvoiceDetail");
    private final static QName _WS100608InsertTaxInvoiceDetailResponse_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100608_insertTaxInvoiceDetailResponse");
    private final static QName _WS100609GetVehiclePaidTaxHistory_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100609_getVehiclePaidTaxHistory");
    private final static QName _WS100609GetVehiclePaidTaxHistoryResponse_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100609_getVehiclePaidTaxHistoryResponse");
    private final static QName _WS100610GetVehicleTaxPayableInfo_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100610_getVehicleTaxPayableInfo");
    private final static QName _WS100610GetVehicleTaxPayableInfoResponse_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100610_getVehicleTaxPayableInfoResponse");
    private final static QName _WS100611GetVehicleInfo_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100611_getVehicleInfo");
    private final static QName _WS100611GetVehicleInfoResponse_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100611_getVehicleInfoResponse");
    private final static QName _WS100612GetVehicleTaxInfoByCabinNumber_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100612_getVehicleTaxInfoByCabinNumber");
    private final static QName _WS100612GetVehicleTaxInfoByCabinNumberResponse_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100612_getVehicleTaxInfoByCabinNumberResponse");
    private final static QName _WS100613GetTaxOrganizationTT02_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100613_getTaxOrganizationTT02");
    private final static QName _WS100613GetTaxOrganizationTT02Response_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100613_getTaxOrganizationTT02Response");
    private final static QName _WS100614GetTaxOrganizationTT03_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100614_getTaxOrganizationTT03");
    private final static QName _WS100614GetTaxOrganizationTT03Response_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100614_getTaxOrganizationTT03Response");
    private final static QName _WS100615GetTaxOrganizationTT11_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100615_getTaxOrganizationTT11");
    private final static QName _WS100615GetTaxOrganizationTT11Response_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100615_getTaxOrganizationTT11Response");
    private final static QName _WS100616GetMOFBudgetedReportInfo_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100616_getMOFBudgetedReportInfo");
    private final static QName _WS100616GetMOFBudgetedReportInfoResponse_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100616_getMOFBudgetedReportInfoResponse");
    private final static QName _WS100617GetTaxCitizenInfo_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100617_getTaxCitizenInfo");
    private final static QName _WS100617GetTaxCitizenInfoResponse_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100617_getTaxCitizenInfoResponse");
    private final static QName _WS100618CheckTaxPayerOfCapitalCity_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100618_checkTaxPayerOfCapitalCity");
    private final static QName _WS100618CheckTaxPayerOfCapitalCityResponse_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100618_checkTaxPayerOfCapitalCityResponse");
    private final static QName _WS100619TaxPayerPrivateTaxPayerInfo_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100619_taxPayerPrivateTaxPayerInfo");
    private final static QName _WS100619TaxPayerPrivateTaxPayerInfoResponse_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100619_taxPayerPrivateTaxPayerInfoResponse");
    private final static QName _WS100620GetTaxOrganizationTT06_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100620_getTaxOrganizationTT06");
    private final static QName _WS100620GetTaxOrganizationTT06Response_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100620_getTaxOrganizationTT06Response");
    private final static QName _WS100621GetTaxPayerNUATInfo_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100621_getTaxPayerNUATInfo");
    private final static QName _WS100621GetTaxPayerNUATInfoResponse_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100621_getTaxPayerNUATInfoResponse");
    private final static QName _WS100622GetIndividualInfo_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100622_getIndividualInfo");
    private final static QName _WS100622GetIndividualInfoResponse_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100622_getIndividualInfoResponse");
    private final static QName _WS100623GetTenderInfo_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100623_getTenderInfo");
    private final static QName _WS100623GetTenderInfoResponse_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100623_getTenderInfoResponse");
    private final static QName _WS100624GetOrganizationInfo_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100624_getOrganizationInfo");
    private final static QName _WS100624GetOrganizationInfoResponse_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100624_getOrganizationInfoResponse");
    private final static QName _WS100625CitizenTaxReportInfo_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100625_citizenTaxReportInfo");
    private final static QName _WS100625CitizenTaxReportInfoResponse_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100625_citizenTaxReportInfoResponse");
    private final static QName _WS100626LegalEntityTaxReportInfo_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100626_legalEntityTaxReportInfo");
    private final static QName _WS100626LegalEntityTaxReportInfoResponse_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100626_legalEntityTaxReportInfoResponse");
    private final static QName _WS100627LicensingInfo_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100627_licensingInfo");
    private final static QName _WS100627LicensingInfoResponse_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100627_licensingInfoResponse");
    private final static QName _WS100628TradeInfo_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100628_tradeInfo");
    private final static QName _WS100628TradeInfoResponse_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100628_tradeInfoResponse");
    private final static QName _WS100629ThanksToTaxpayersService_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100629_thanksToTaxpayersService");
    private final static QName _WS100629ThanksToTaxpayersServiceResponse_QNAME = new QName("http://tax.xyp.gov.mn/", "WS100629_thanksToTaxpayersServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mn.gov.itc.emongolia.data.XypTax
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBankAccountInfo }
     * 
     */
    public GetBankAccountInfo createGetBankAccountInfo() {
        return new GetBankAccountInfo();
    }

    /**
     * Create an instance of {@link GetBankAccountInfoResponse }
     * 
     */
    public GetBankAccountInfoResponse createGetBankAccountInfoResponse() {
        return new GetBankAccountInfoResponse();
    }

    /**
     * Create an instance of {@link GetSalaryInfo }
     * 
     */
    public GetSalaryInfo createGetSalaryInfo() {
        return new GetSalaryInfo();
    }

    /**
     * Create an instance of {@link GetSalaryInfoResponse }
     * 
     */
    public GetSalaryInfoResponse createGetSalaryInfoResponse() {
        return new GetSalaryInfoResponse();
    }

    /**
     * Create an instance of {@link GetServiceDeptLogTender }
     * 
     */
    public GetServiceDeptLogTender createGetServiceDeptLogTender() {
        return new GetServiceDeptLogTender();
    }

    /**
     * Create an instance of {@link GetServiceDeptLogTenderResponse }
     * 
     */
    public GetServiceDeptLogTenderResponse createGetServiceDeptLogTenderResponse() {
        return new GetServiceDeptLogTenderResponse();
    }

    /**
     * Create an instance of {@link GetServiceIncomeLog }
     * 
     */
    public GetServiceIncomeLog createGetServiceIncomeLog() {
        return new GetServiceIncomeLog();
    }

    /**
     * Create an instance of {@link GetServiceIncomeLogResponse }
     * 
     */
    public GetServiceIncomeLogResponse createGetServiceIncomeLogResponse() {
        return new GetServiceIncomeLogResponse();
    }

    /**
     * Create an instance of {@link GetServiceIncomeLogTender }
     * 
     */
    public GetServiceIncomeLogTender createGetServiceIncomeLogTender() {
        return new GetServiceIncomeLogTender();
    }

    /**
     * Create an instance of {@link GetServiceIncomeLogTenderResponse }
     * 
     */
    public GetServiceIncomeLogTenderResponse createGetServiceIncomeLogTenderResponse() {
        return new GetServiceIncomeLogTenderResponse();
    }

    /**
     * Create an instance of {@link GetServiceLogTender }
     * 
     */
    public GetServiceLogTender createGetServiceLogTender() {
        return new GetServiceLogTender();
    }

    /**
     * Create an instance of {@link GetServiceLogTenderResponse }
     * 
     */
    public GetServiceLogTenderResponse createGetServiceLogTenderResponse() {
        return new GetServiceLogTenderResponse();
    }

    /**
     * Create an instance of {@link GetTaxpayerDeptInfo }
     * 
     */
    public GetTaxpayerDeptInfo createGetTaxpayerDeptInfo() {
        return new GetTaxpayerDeptInfo();
    }

    /**
     * Create an instance of {@link GetTaxpayerDeptInfoResponse }
     * 
     */
    public GetTaxpayerDeptInfoResponse createGetTaxpayerDeptInfoResponse() {
        return new GetTaxpayerDeptInfoResponse();
    }

    /**
     * Create an instance of {@link GetTaxpayerInfo }
     * 
     */
    public GetTaxpayerInfo createGetTaxpayerInfo() {
        return new GetTaxpayerInfo();
    }

    /**
     * Create an instance of {@link GetTaxpayerInfoResponse }
     * 
     */
    public GetTaxpayerInfoResponse createGetTaxpayerInfoResponse() {
        return new GetTaxpayerInfoResponse();
    }

    /**
     * Create an instance of {@link GetTaxpayerTaxPayable }
     * 
     */
    public GetTaxpayerTaxPayable createGetTaxpayerTaxPayable() {
        return new GetTaxpayerTaxPayable();
    }

    /**
     * Create an instance of {@link GetTaxpayerTaxPayableResponse }
     * 
     */
    public GetTaxpayerTaxPayableResponse createGetTaxpayerTaxPayableResponse() {
        return new GetTaxpayerTaxPayableResponse();
    }

    /**
     * Create an instance of {@link GetUserInfo }
     * 
     */
    public GetUserInfo createGetUserInfo() {
        return new GetUserInfo();
    }

    /**
     * Create an instance of {@link GetUserInfoResponse }
     * 
     */
    public GetUserInfoResponse createGetUserInfoResponse() {
        return new GetUserInfoResponse();
    }

    /**
     * Create an instance of {@link SalaryInfoData }
     * 
     */
    public SalaryInfoData createSalaryInfoData() {
        return new SalaryInfoData();
    }

    /**
     * Create an instance of {@link ServiceDeptLogData }
     * 
     */
    public ServiceDeptLogData createServiceDeptLogData() {
        return new ServiceDeptLogData();
    }

    /**
     * Create an instance of {@link ServiceIncomeLog }
     * 
     */
    public ServiceIncomeLog createServiceIncomeLog() {
        return new ServiceIncomeLog();
    }

    /**
     * Create an instance of {@link UserInfoData }
     * 
     */
    public UserInfoData createUserInfoData() {
        return new UserInfoData();
    }

    /**
     * Create an instance of {@link TaxpayerInfo }
     * 
     */
    public TaxpayerInfo createTaxpayerInfo() {
        return new TaxpayerInfo();
    }

    /**
     * Create an instance of {@link TaxpayerDept }
     * 
     */
    public TaxpayerDept createTaxpayerDept() {
        return new TaxpayerDept();
    }

    /**
     * Create an instance of {@link ServiceLogTenderData }
     * 
     */
    public ServiceLogTenderData createServiceLogTenderData() {
        return new ServiceLogTenderData();
    }

    /**
     * Create an instance of {@link BankAccountInfo }
     * 
     */
    public BankAccountInfo createBankAccountInfo() {
        return new BankAccountInfo();
    }

    /**
     * Create an instance of {@link TaxPayerTaxPayableListData }
     * 
     */
    public TaxPayerTaxPayableListData createTaxPayerTaxPayableListData() {
        return new TaxPayerTaxPayableListData();
    }

    /**
     * Create an instance of {@link TaxpayerTaxPayable }
     * 
     */
    public TaxpayerTaxPayable createTaxpayerTaxPayable() {
        return new TaxpayerTaxPayable();
    }

    /**
     * Create an instance of {@link WS100601GetTaxPayerInfo }
     * 
     */
    public WS100601GetTaxPayerInfo createWS100601GetTaxPayerInfo() {
        return new WS100601GetTaxPayerInfo();
    }

    /**
     * Create an instance of {@link WS100601GetTaxPayerInfoResponse }
     * 
     */
    public WS100601GetTaxPayerInfoResponse createWS100601GetTaxPayerInfoResponse() {
        return new WS100601GetTaxPayerInfoResponse();
    }

    /**
     * Create an instance of {@link WS100602GetTaxPayerTaxPayable }
     * 
     */
    public WS100602GetTaxPayerTaxPayable createWS100602GetTaxPayerTaxPayable() {
        return new WS100602GetTaxPayerTaxPayable();
    }

    /**
     * Create an instance of {@link WS100602GetTaxPayerTaxPayableResponse }
     * 
     */
    public WS100602GetTaxPayerTaxPayableResponse createWS100602GetTaxPayerTaxPayableResponse() {
        return new WS100602GetTaxPayerTaxPayableResponse();
    }

    /**
     * Create an instance of {@link WS100603GetServiceIncomeLog }
     * 
     */
    public WS100603GetServiceIncomeLog createWS100603GetServiceIncomeLog() {
        return new WS100603GetServiceIncomeLog();
    }

    /**
     * Create an instance of {@link WS100603GetServiceIncomeLogResponse }
     * 
     */
    public WS100603GetServiceIncomeLogResponse createWS100603GetServiceIncomeLogResponse() {
        return new WS100603GetServiceIncomeLogResponse();
    }

    /**
     * Create an instance of {@link WS100604GetSalaryInfo }
     * 
     */
    public WS100604GetSalaryInfo createWS100604GetSalaryInfo() {
        return new WS100604GetSalaryInfo();
    }

    /**
     * Create an instance of {@link WS100604GetSalaryInfoResponse }
     * 
     */
    public WS100604GetSalaryInfoResponse createWS100604GetSalaryInfoResponse() {
        return new WS100604GetSalaryInfoResponse();
    }

    /**
     * Create an instance of {@link WS100605GetTaxPayerDeptInfo }
     * 
     */
    public WS100605GetTaxPayerDeptInfo createWS100605GetTaxPayerDeptInfo() {
        return new WS100605GetTaxPayerDeptInfo();
    }

    /**
     * Create an instance of {@link WS100605GetTaxPayerDeptInfoResponse }
     * 
     */
    public WS100605GetTaxPayerDeptInfoResponse createWS100605GetTaxPayerDeptInfoResponse() {
        return new WS100605GetTaxPayerDeptInfoResponse();
    }

    /**
     * Create an instance of {@link WS100606GetTaxUserInfo }
     * 
     */
    public WS100606GetTaxUserInfo createWS100606GetTaxUserInfo() {
        return new WS100606GetTaxUserInfo();
    }

    /**
     * Create an instance of {@link WS100606GetTaxUserInfoResponse }
     * 
     */
    public WS100606GetTaxUserInfoResponse createWS100606GetTaxUserInfoResponse() {
        return new WS100606GetTaxUserInfoResponse();
    }

    /**
     * Create an instance of {@link WS100607InsertTaxInvoice }
     * 
     */
    public WS100607InsertTaxInvoice createWS100607InsertTaxInvoice() {
        return new WS100607InsertTaxInvoice();
    }

    /**
     * Create an instance of {@link WS100607InsertTaxInvoiceResponse }
     * 
     */
    public WS100607InsertTaxInvoiceResponse createWS100607InsertTaxInvoiceResponse() {
        return new WS100607InsertTaxInvoiceResponse();
    }

    /**
     * Create an instance of {@link WS100608InsertTaxInvoiceDetail }
     * 
     */
    public WS100608InsertTaxInvoiceDetail createWS100608InsertTaxInvoiceDetail() {
        return new WS100608InsertTaxInvoiceDetail();
    }

    /**
     * Create an instance of {@link WS100608InsertTaxInvoiceDetailResponse }
     * 
     */
    public WS100608InsertTaxInvoiceDetailResponse createWS100608InsertTaxInvoiceDetailResponse() {
        return new WS100608InsertTaxInvoiceDetailResponse();
    }

    /**
     * Create an instance of {@link WS100609GetVehiclePaidTaxHistory }
     * 
     */
    public WS100609GetVehiclePaidTaxHistory createWS100609GetVehiclePaidTaxHistory() {
        return new WS100609GetVehiclePaidTaxHistory();
    }

    /**
     * Create an instance of {@link WS100609GetVehiclePaidTaxHistoryResponse }
     * 
     */
    public WS100609GetVehiclePaidTaxHistoryResponse createWS100609GetVehiclePaidTaxHistoryResponse() {
        return new WS100609GetVehiclePaidTaxHistoryResponse();
    }

    /**
     * Create an instance of {@link WS100610GetVehicleTaxPayableInfo }
     * 
     */
    public WS100610GetVehicleTaxPayableInfo createWS100610GetVehicleTaxPayableInfo() {
        return new WS100610GetVehicleTaxPayableInfo();
    }

    /**
     * Create an instance of {@link WS100610GetVehicleTaxPayableInfoResponse }
     * 
     */
    public WS100610GetVehicleTaxPayableInfoResponse createWS100610GetVehicleTaxPayableInfoResponse() {
        return new WS100610GetVehicleTaxPayableInfoResponse();
    }

    /**
     * Create an instance of {@link WS100611GetVehicleInfo }
     * 
     */
    public WS100611GetVehicleInfo createWS100611GetVehicleInfo() {
        return new WS100611GetVehicleInfo();
    }

    /**
     * Create an instance of {@link WS100611GetVehicleInfoResponse }
     * 
     */
    public WS100611GetVehicleInfoResponse createWS100611GetVehicleInfoResponse() {
        return new WS100611GetVehicleInfoResponse();
    }

    /**
     * Create an instance of {@link WS100612GetVehicleTaxInfoByCabinNumber }
     * 
     */
    public WS100612GetVehicleTaxInfoByCabinNumber createWS100612GetVehicleTaxInfoByCabinNumber() {
        return new WS100612GetVehicleTaxInfoByCabinNumber();
    }

    /**
     * Create an instance of {@link WS100612GetVehicleTaxInfoByCabinNumberResponse }
     * 
     */
    public WS100612GetVehicleTaxInfoByCabinNumberResponse createWS100612GetVehicleTaxInfoByCabinNumberResponse() {
        return new WS100612GetVehicleTaxInfoByCabinNumberResponse();
    }

    /**
     * Create an instance of {@link WS100613GetTaxOrganizationTT02 }
     * 
     */
    public WS100613GetTaxOrganizationTT02 createWS100613GetTaxOrganizationTT02() {
        return new WS100613GetTaxOrganizationTT02();
    }

    /**
     * Create an instance of {@link WS100613GetTaxOrganizationTT02Response }
     * 
     */
    public WS100613GetTaxOrganizationTT02Response createWS100613GetTaxOrganizationTT02Response() {
        return new WS100613GetTaxOrganizationTT02Response();
    }

    /**
     * Create an instance of {@link WS100614GetTaxOrganizationTT03 }
     * 
     */
    public WS100614GetTaxOrganizationTT03 createWS100614GetTaxOrganizationTT03() {
        return new WS100614GetTaxOrganizationTT03();
    }

    /**
     * Create an instance of {@link WS100614GetTaxOrganizationTT03Response }
     * 
     */
    public WS100614GetTaxOrganizationTT03Response createWS100614GetTaxOrganizationTT03Response() {
        return new WS100614GetTaxOrganizationTT03Response();
    }

    /**
     * Create an instance of {@link WS100615GetTaxOrganizationTT11 }
     * 
     */
    public WS100615GetTaxOrganizationTT11 createWS100615GetTaxOrganizationTT11() {
        return new WS100615GetTaxOrganizationTT11();
    }

    /**
     * Create an instance of {@link WS100615GetTaxOrganizationTT11Response }
     * 
     */
    public WS100615GetTaxOrganizationTT11Response createWS100615GetTaxOrganizationTT11Response() {
        return new WS100615GetTaxOrganizationTT11Response();
    }

    /**
     * Create an instance of {@link WS100616GetMOFBudgetedReportInfo }
     * 
     */
    public WS100616GetMOFBudgetedReportInfo createWS100616GetMOFBudgetedReportInfo() {
        return new WS100616GetMOFBudgetedReportInfo();
    }

    /**
     * Create an instance of {@link WS100616GetMOFBudgetedReportInfoResponse }
     * 
     */
    public WS100616GetMOFBudgetedReportInfoResponse createWS100616GetMOFBudgetedReportInfoResponse() {
        return new WS100616GetMOFBudgetedReportInfoResponse();
    }

    /**
     * Create an instance of {@link WS100617GetTaxCitizenInfo }
     * 
     */
    public WS100617GetTaxCitizenInfo createWS100617GetTaxCitizenInfo() {
        return new WS100617GetTaxCitizenInfo();
    }

    /**
     * Create an instance of {@link WS100617GetTaxCitizenInfoResponse }
     * 
     */
    public WS100617GetTaxCitizenInfoResponse createWS100617GetTaxCitizenInfoResponse() {
        return new WS100617GetTaxCitizenInfoResponse();
    }

    /**
     * Create an instance of {@link WS100618CheckTaxPayerOfCapitalCity }
     * 
     */
    public WS100618CheckTaxPayerOfCapitalCity createWS100618CheckTaxPayerOfCapitalCity() {
        return new WS100618CheckTaxPayerOfCapitalCity();
    }

    /**
     * Create an instance of {@link WS100618CheckTaxPayerOfCapitalCityResponse }
     * 
     */
    public WS100618CheckTaxPayerOfCapitalCityResponse createWS100618CheckTaxPayerOfCapitalCityResponse() {
        return new WS100618CheckTaxPayerOfCapitalCityResponse();
    }

    /**
     * Create an instance of {@link WS100619TaxPayerPrivateTaxPayerInfo }
     * 
     */
    public WS100619TaxPayerPrivateTaxPayerInfo createWS100619TaxPayerPrivateTaxPayerInfo() {
        return new WS100619TaxPayerPrivateTaxPayerInfo();
    }

    /**
     * Create an instance of {@link WS100619TaxPayerPrivateTaxPayerInfoResponse }
     * 
     */
    public WS100619TaxPayerPrivateTaxPayerInfoResponse createWS100619TaxPayerPrivateTaxPayerInfoResponse() {
        return new WS100619TaxPayerPrivateTaxPayerInfoResponse();
    }

    /**
     * Create an instance of {@link WS100620GetTaxOrganizationTT06 }
     * 
     */
    public WS100620GetTaxOrganizationTT06 createWS100620GetTaxOrganizationTT06() {
        return new WS100620GetTaxOrganizationTT06();
    }

    /**
     * Create an instance of {@link WS100620GetTaxOrganizationTT06Response }
     * 
     */
    public WS100620GetTaxOrganizationTT06Response createWS100620GetTaxOrganizationTT06Response() {
        return new WS100620GetTaxOrganizationTT06Response();
    }

    /**
     * Create an instance of {@link WS100621GetTaxPayerNUATInfo }
     * 
     */
    public WS100621GetTaxPayerNUATInfo createWS100621GetTaxPayerNUATInfo() {
        return new WS100621GetTaxPayerNUATInfo();
    }

    /**
     * Create an instance of {@link WS100621GetTaxPayerNUATInfoResponse }
     * 
     */
    public WS100621GetTaxPayerNUATInfoResponse createWS100621GetTaxPayerNUATInfoResponse() {
        return new WS100621GetTaxPayerNUATInfoResponse();
    }

    /**
     * Create an instance of {@link WS100622GetIndividualInfo }
     * 
     */
    public WS100622GetIndividualInfo createWS100622GetIndividualInfo() {
        return new WS100622GetIndividualInfo();
    }

    /**
     * Create an instance of {@link WS100622GetIndividualInfoResponse }
     * 
     */
    public WS100622GetIndividualInfoResponse createWS100622GetIndividualInfoResponse() {
        return new WS100622GetIndividualInfoResponse();
    }

    /**
     * Create an instance of {@link WS100623GetTenderInfo }
     * 
     */
    public WS100623GetTenderInfo createWS100623GetTenderInfo() {
        return new WS100623GetTenderInfo();
    }

    /**
     * Create an instance of {@link WS100623GetTenderInfoResponse }
     * 
     */
    public WS100623GetTenderInfoResponse createWS100623GetTenderInfoResponse() {
        return new WS100623GetTenderInfoResponse();
    }

    /**
     * Create an instance of {@link WS100624GetOrganizationInfo }
     * 
     */
    public WS100624GetOrganizationInfo createWS100624GetOrganizationInfo() {
        return new WS100624GetOrganizationInfo();
    }

    /**
     * Create an instance of {@link WS100624GetOrganizationInfoResponse }
     * 
     */
    public WS100624GetOrganizationInfoResponse createWS100624GetOrganizationInfoResponse() {
        return new WS100624GetOrganizationInfoResponse();
    }

    /**
     * Create an instance of {@link WS100625CitizenTaxReportInfo }
     * 
     */
    public WS100625CitizenTaxReportInfo createWS100625CitizenTaxReportInfo() {
        return new WS100625CitizenTaxReportInfo();
    }

    /**
     * Create an instance of {@link WS100625CitizenTaxReportInfoResponse }
     * 
     */
    public WS100625CitizenTaxReportInfoResponse createWS100625CitizenTaxReportInfoResponse() {
        return new WS100625CitizenTaxReportInfoResponse();
    }

    /**
     * Create an instance of {@link WS100626LegalEntityTaxReportInfo }
     * 
     */
    public WS100626LegalEntityTaxReportInfo createWS100626LegalEntityTaxReportInfo() {
        return new WS100626LegalEntityTaxReportInfo();
    }

    /**
     * Create an instance of {@link WS100626LegalEntityTaxReportInfoResponse }
     * 
     */
    public WS100626LegalEntityTaxReportInfoResponse createWS100626LegalEntityTaxReportInfoResponse() {
        return new WS100626LegalEntityTaxReportInfoResponse();
    }

    /**
     * Create an instance of {@link WS100627LicensingInfo }
     * 
     */
    public WS100627LicensingInfo createWS100627LicensingInfo() {
        return new WS100627LicensingInfo();
    }

    /**
     * Create an instance of {@link WS100627LicensingInfoResponse }
     * 
     */
    public WS100627LicensingInfoResponse createWS100627LicensingInfoResponse() {
        return new WS100627LicensingInfoResponse();
    }

    /**
     * Create an instance of {@link WS100628TradeInfo }
     * 
     */
    public WS100628TradeInfo createWS100628TradeInfo() {
        return new WS100628TradeInfo();
    }

    /**
     * Create an instance of {@link WS100628TradeInfoResponse }
     * 
     */
    public WS100628TradeInfoResponse createWS100628TradeInfoResponse() {
        return new WS100628TradeInfoResponse();
    }

    /**
     * Create an instance of {@link WS100629ThanksToTaxpayersService }
     * 
     */
    public WS100629ThanksToTaxpayersService createWS100629ThanksToTaxpayersService() {
        return new WS100629ThanksToTaxpayersService();
    }

    /**
     * Create an instance of {@link WS100629ThanksToTaxpayersServiceResponse }
     * 
     */
    public WS100629ThanksToTaxpayersServiceResponse createWS100629ThanksToTaxpayersServiceResponse() {
        return new WS100629ThanksToTaxpayersServiceResponse();
    }

    /**
     * Create an instance of {@link ServiceInvoiceRequestData }
     * 
     */
    public ServiceInvoiceRequestData createServiceInvoiceRequestData() {
        return new ServiceInvoiceRequestData();
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
     * Create an instance of {@link TaxInvoiceData }
     * 
     */
    public TaxInvoiceData createTaxInvoiceData() {
        return new TaxInvoiceData();
    }

    /**
     * Create an instance of {@link ServiceVehiclePaidTaxHistoryRequestData }
     * 
     */
    public ServiceVehiclePaidTaxHistoryRequestData createServiceVehiclePaidTaxHistoryRequestData() {
        return new ServiceVehiclePaidTaxHistoryRequestData();
    }

    /**
     * Create an instance of {@link VehiclePaidTaxHistoryData }
     * 
     */
    public VehiclePaidTaxHistoryData createVehiclePaidTaxHistoryData() {
        return new VehiclePaidTaxHistoryData();
    }

    /**
     * Create an instance of {@link VehiclePaidTaxHistoryDetailData }
     * 
     */
    public VehiclePaidTaxHistoryDetailData createVehiclePaidTaxHistoryDetailData() {
        return new VehiclePaidTaxHistoryDetailData();
    }

    /**
     * Create an instance of {@link ServiceUserInfoRequestData }
     * 
     */
    public ServiceUserInfoRequestData createServiceUserInfoRequestData() {
        return new ServiceUserInfoRequestData();
    }

    /**
     * Create an instance of {@link TaxUserInfoData }
     * 
     */
    public TaxUserInfoData createTaxUserInfoData() {
        return new TaxUserInfoData();
    }

    /**
     * Create an instance of {@link ServiceInsertTaxInvoiceDetailRequestData }
     * 
     */
    public ServiceInsertTaxInvoiceDetailRequestData createServiceInsertTaxInvoiceDetailRequestData() {
        return new ServiceInsertTaxInvoiceDetailRequestData();
    }

    /**
     * Create an instance of {@link InsertTaxInvoiceDetailData }
     * 
     */
    public InsertTaxInvoiceDetailData createInsertTaxInvoiceDetailData() {
        return new InsertTaxInvoiceDetailData();
    }

    /**
     * Create an instance of {@link ServiceTaxRequestData }
     * 
     */
    public ServiceTaxRequestData createServiceTaxRequestData() {
        return new ServiceTaxRequestData();
    }

    /**
     * Create an instance of {@link TaxPayerInfoData }
     * 
     */
    public TaxPayerInfoData createTaxPayerInfoData() {
        return new TaxPayerInfoData();
    }

    /**
     * Create an instance of {@link TaxOrganizationRequest }
     * 
     */
    public TaxOrganizationRequest createTaxOrganizationRequest() {
        return new TaxOrganizationRequest();
    }

    /**
     * Create an instance of {@link TaxOrganizationTT06Data }
     * 
     */
    public TaxOrganizationTT06Data createTaxOrganizationTT06Data() {
        return new TaxOrganizationTT06Data();
    }

    /**
     * Create an instance of {@link TaxOrganizationTT06Detail }
     * 
     */
    public TaxOrganizationTT06Detail createTaxOrganizationTT06Detail() {
        return new TaxOrganizationTT06Detail();
    }

    /**
     * Create an instance of {@link TaxOrganizationTT02Data }
     * 
     */
    public TaxOrganizationTT02Data createTaxOrganizationTT02Data() {
        return new TaxOrganizationTT02Data();
    }

    /**
     * Create an instance of {@link TaxOrganizationTT02Detial }
     * 
     */
    public TaxOrganizationTT02Detial createTaxOrganizationTT02Detial() {
        return new TaxOrganizationTT02Detial();
    }

    /**
     * Create an instance of {@link VehicleTaxInfoRequestData }
     * 
     */
    public VehicleTaxInfoRequestData createVehicleTaxInfoRequestData() {
        return new VehicleTaxInfoRequestData();
    }

    /**
     * Create an instance of {@link VehicleTaxInfoData }
     * 
     */
    public VehicleTaxInfoData createVehicleTaxInfoData() {
        return new VehicleTaxInfoData();
    }

    /**
     * Create an instance of {@link VehicleTaxInfoDataDetial }
     * 
     */
    public VehicleTaxInfoDataDetial createVehicleTaxInfoDataDetial() {
        return new VehicleTaxInfoDataDetial();
    }

    /**
     * Create an instance of {@link TaxReportRequestData }
     * 
     */
    public TaxReportRequestData createTaxReportRequestData() {
        return new TaxReportRequestData();
    }

    /**
     * Create an instance of {@link LegalEntityTaxReportData }
     * 
     */
    public LegalEntityTaxReportData createLegalEntityTaxReportData() {
        return new LegalEntityTaxReportData();
    }

    /**
     * Create an instance of {@link LegalEntityTaxReportDetailData }
     * 
     */
    public LegalEntityTaxReportDetailData createLegalEntityTaxReportDetailData() {
        return new LegalEntityTaxReportDetailData();
    }

    /**
     * Create an instance of {@link ServiceIncomeData }
     * 
     */
    public ServiceIncomeData createServiceIncomeData() {
        return new ServiceIncomeData();
    }

    /**
     * Create an instance of {@link LicensingInfoRequestData }
     * 
     */
    public LicensingInfoRequestData createLicensingInfoRequestData() {
        return new LicensingInfoRequestData();
    }

    /**
     * Create an instance of {@link TradeInfoData }
     * 
     */
    public TradeInfoData createTradeInfoData() {
        return new TradeInfoData();
    }

    /**
     * Create an instance of {@link TradeInfoDetailData }
     * 
     */
    public TradeInfoDetailData createTradeInfoDetailData() {
        return new TradeInfoDetailData();
    }

    /**
     * Create an instance of {@link ThanksToTaxpayersRequestData }
     * 
     */
    public ThanksToTaxpayersRequestData createThanksToTaxpayersRequestData() {
        return new ThanksToTaxpayersRequestData();
    }

    /**
     * Create an instance of {@link ThanksToTaxpayersData }
     * 
     */
    public ThanksToTaxpayersData createThanksToTaxpayersData() {
        return new ThanksToTaxpayersData();
    }

    /**
     * Create an instance of {@link TaxPayerPayableData }
     * 
     */
    public TaxPayerPayableData createTaxPayerPayableData() {
        return new TaxPayerPayableData();
    }

    /**
     * Create an instance of {@link TaxPayerPayableDetailData }
     * 
     */
    public TaxPayerPayableDetailData createTaxPayerPayableDetailData() {
        return new TaxPayerPayableDetailData();
    }

    /**
     * Create an instance of {@link TenderInfoRequestData }
     * 
     */
    public TenderInfoRequestData createTenderInfoRequestData() {
        return new TenderInfoRequestData();
    }

    /**
     * Create an instance of {@link TenderInfoData }
     * 
     */
    public TenderInfoData createTenderInfoData() {
        return new TenderInfoData();
    }

    /**
     * Create an instance of {@link TenderEbarimt }
     * 
     */
    public TenderEbarimt createTenderEbarimt() {
        return new TenderEbarimt();
    }

    /**
     * Create an instance of {@link TenderDebt }
     * 
     */
    public TenderDebt createTenderDebt() {
        return new TenderDebt();
    }

    /**
     * Create an instance of {@link TenderIncomes }
     * 
     */
    public TenderIncomes createTenderIncomes() {
        return new TenderIncomes();
    }

    /**
     * Create an instance of {@link TenderTpInfo }
     * 
     */
    public TenderTpInfo createTenderTpInfo() {
        return new TenderTpInfo();
    }

    /**
     * Create an instance of {@link TenderRefEntStatus }
     * 
     */
    public TenderRefEntStatus createTenderRefEntStatus() {
        return new TenderRefEntStatus();
    }

    /**
     * Create an instance of {@link ServiceVehicleTaxPayableInfoRequestData }
     * 
     */
    public ServiceVehicleTaxPayableInfoRequestData createServiceVehicleTaxPayableInfoRequestData() {
        return new ServiceVehicleTaxPayableInfoRequestData();
    }

    /**
     * Create an instance of {@link VehicleTaxPayableInfoData }
     * 
     */
    public VehicleTaxPayableInfoData createVehicleTaxPayableInfoData() {
        return new VehicleTaxPayableInfoData();
    }

    /**
     * Create an instance of {@link VehicleTaxPayableInfoDetailData }
     * 
     */
    public VehicleTaxPayableInfoDetailData createVehicleTaxPayableInfoDetailData() {
        return new VehicleTaxPayableInfoDetailData();
    }

    /**
     * Create an instance of {@link ServiceVehicleInfoRequestData }
     * 
     */
    public ServiceVehicleInfoRequestData createServiceVehicleInfoRequestData() {
        return new ServiceVehicleInfoRequestData();
    }

    /**
     * Create an instance of {@link VehicleInfoData }
     * 
     */
    public VehicleInfoData createVehicleInfoData() {
        return new VehicleInfoData();
    }

    /**
     * Create an instance of {@link VehicleInfoDetailData }
     * 
     */
    public VehicleInfoDetailData createVehicleInfoDetailData() {
        return new VehicleInfoDetailData();
    }

    /**
     * Create an instance of {@link LicensingInfoData }
     * 
     */
    public LicensingInfoData createLicensingInfoData() {
        return new LicensingInfoData();
    }

    /**
     * Create an instance of {@link LicensingInfoDetailData }
     * 
     */
    public LicensingInfoDetailData createLicensingInfoDetailData() {
        return new LicensingInfoDetailData();
    }

    /**
     * Create an instance of {@link TaxPayerDeptInfoData }
     * 
     */
    public TaxPayerDeptInfoData createTaxPayerDeptInfoData() {
        return new TaxPayerDeptInfoData();
    }

    /**
     * Create an instance of {@link ServiceOrganizationInfoRequestData }
     * 
     */
    public ServiceOrganizationInfoRequestData createServiceOrganizationInfoRequestData() {
        return new ServiceOrganizationInfoRequestData();
    }

    /**
     * Create an instance of {@link OrganizationInfoData }
     * 
     */
    public OrganizationInfoData createOrganizationInfoData() {
        return new OrganizationInfoData();
    }

    /**
     * Create an instance of {@link OrganizationEbarimt }
     * 
     */
    public OrganizationEbarimt createOrganizationEbarimt() {
        return new OrganizationEbarimt();
    }

    /**
     * Create an instance of {@link OrganizationDebt }
     * 
     */
    public OrganizationDebt createOrganizationDebt() {
        return new OrganizationDebt();
    }

    /**
     * Create an instance of {@link OrganizationPayment }
     * 
     */
    public OrganizationPayment createOrganizationPayment() {
        return new OrganizationPayment();
    }

    /**
     * Create an instance of {@link OrganizationReturn }
     * 
     */
    public OrganizationReturn createOrganizationReturn() {
        return new OrganizationReturn();
    }

    /**
     * Create an instance of {@link OrganizationTpInfo }
     * 
     */
    public OrganizationTpInfo createOrganizationTpInfo() {
        return new OrganizationTpInfo();
    }

    /**
     * Create an instance of {@link OrganizationRefEntStatus }
     * 
     */
    public OrganizationRefEntStatus createOrganizationRefEntStatus() {
        return new OrganizationRefEntStatus();
    }

    /**
     * Create an instance of {@link PrivateTaxPayerRequestData }
     * 
     */
    public PrivateTaxPayerRequestData createPrivateTaxPayerRequestData() {
        return new PrivateTaxPayerRequestData();
    }

    /**
     * Create an instance of {@link TaxPayerNUATData }
     * 
     */
    public TaxPayerNUATData createTaxPayerNUATData() {
        return new TaxPayerNUATData();
    }

    /**
     * Create an instance of {@link TaxPayerNUATDetial }
     * 
     */
    public TaxPayerNUATDetial createTaxPayerNUATDetial() {
        return new TaxPayerNUATDetial();
    }

    /**
     * Create an instance of {@link PrivateTaxPayerData }
     * 
     */
    public PrivateTaxPayerData createPrivateTaxPayerData() {
        return new PrivateTaxPayerData();
    }

    /**
     * Create an instance of {@link PrivateTaxPayerDetail }
     * 
     */
    public PrivateTaxPayerDetail createPrivateTaxPayerDetail() {
        return new PrivateTaxPayerDetail();
    }

    /**
     * Create an instance of {@link CheckTaxPayerRequestData }
     * 
     */
    public CheckTaxPayerRequestData createCheckTaxPayerRequestData() {
        return new CheckTaxPayerRequestData();
    }

    /**
     * Create an instance of {@link CheckTaxPayerData }
     * 
     */
    public CheckTaxPayerData createCheckTaxPayerData() {
        return new CheckTaxPayerData();
    }

    /**
     * Create an instance of {@link MofBudgetedReportRequest }
     * 
     */
    public MofBudgetedReportRequest createMofBudgetedReportRequest() {
        return new MofBudgetedReportRequest();
    }

    /**
     * Create an instance of {@link MofBudgetedReportData }
     * 
     */
    public MofBudgetedReportData createMofBudgetedReportData() {
        return new MofBudgetedReportData();
    }

    /**
     * Create an instance of {@link MofBudgetedReportDetial }
     * 
     */
    public MofBudgetedReportDetial createMofBudgetedReportDetial() {
        return new MofBudgetedReportDetial();
    }

    /**
     * Create an instance of {@link TaxOrganizationTT03Data }
     * 
     */
    public TaxOrganizationTT03Data createTaxOrganizationTT03Data() {
        return new TaxOrganizationTT03Data();
    }

    /**
     * Create an instance of {@link TaxOrganizationTT03Detial }
     * 
     */
    public TaxOrganizationTT03Detial createTaxOrganizationTT03Detial() {
        return new TaxOrganizationTT03Detial();
    }

    /**
     * Create an instance of {@link TaxOrganizationTT11Data }
     * 
     */
    public TaxOrganizationTT11Data createTaxOrganizationTT11Data() {
        return new TaxOrganizationTT11Data();
    }

    /**
     * Create an instance of {@link TaxOrganizationTT11Detial }
     * 
     */
    public TaxOrganizationTT11Detial createTaxOrganizationTT11Detial() {
        return new TaxOrganizationTT11Detial();
    }

    /**
     * Create an instance of {@link TaxCitizenRequestData }
     * 
     */
    public TaxCitizenRequestData createTaxCitizenRequestData() {
        return new TaxCitizenRequestData();
    }

    /**
     * Create an instance of {@link TaxCitizenData }
     * 
     */
    public TaxCitizenData createTaxCitizenData() {
        return new TaxCitizenData();
    }

    /**
     * Create an instance of {@link CitizenTaxReportData }
     * 
     */
    public CitizenTaxReportData createCitizenTaxReportData() {
        return new CitizenTaxReportData();
    }

    /**
     * Create an instance of {@link CitizenTaxReportDetailData }
     * 
     */
    public CitizenTaxReportDetailData createCitizenTaxReportDetailData() {
        return new CitizenTaxReportDetailData();
    }

    /**
     * Create an instance of {@link ServiceIndividualInfoRequestData }
     * 
     */
    public ServiceIndividualInfoRequestData createServiceIndividualInfoRequestData() {
        return new ServiceIndividualInfoRequestData();
    }

    /**
     * Create an instance of {@link IndividualInfoData }
     * 
     */
    public IndividualInfoData createIndividualInfoData() {
        return new IndividualInfoData();
    }

    /**
     * Create an instance of {@link IndividualEbarimt }
     * 
     */
    public IndividualEbarimt createIndividualEbarimt() {
        return new IndividualEbarimt();
    }

    /**
     * Create an instance of {@link IndividualDebt }
     * 
     */
    public IndividualDebt createIndividualDebt() {
        return new IndividualDebt();
    }

    /**
     * Create an instance of {@link IndividualPayment }
     * 
     */
    public IndividualPayment createIndividualPayment() {
        return new IndividualPayment();
    }

    /**
     * Create an instance of {@link IndividualReturn }
     * 
     */
    public IndividualReturn createIndividualReturn() {
        return new IndividualReturn();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBankAccountInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBankAccountInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getBankAccountInfo")
    public JAXBElement<GetBankAccountInfo> createGetBankAccountInfo(GetBankAccountInfo value) {
        return new JAXBElement<GetBankAccountInfo>(_GetBankAccountInfo_QNAME, GetBankAccountInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBankAccountInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBankAccountInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getBankAccountInfoResponse")
    public JAXBElement<GetBankAccountInfoResponse> createGetBankAccountInfoResponse(GetBankAccountInfoResponse value) {
        return new JAXBElement<GetBankAccountInfoResponse>(_GetBankAccountInfoResponse_QNAME, GetBankAccountInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSalaryInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSalaryInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getSalaryInfo")
    public JAXBElement<GetSalaryInfo> createGetSalaryInfo(GetSalaryInfo value) {
        return new JAXBElement<GetSalaryInfo>(_GetSalaryInfo_QNAME, GetSalaryInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSalaryInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetSalaryInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getSalaryInfoResponse")
    public JAXBElement<GetSalaryInfoResponse> createGetSalaryInfoResponse(GetSalaryInfoResponse value) {
        return new JAXBElement<GetSalaryInfoResponse>(_GetSalaryInfoResponse_QNAME, GetSalaryInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceDeptLogTender }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetServiceDeptLogTender }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getServiceDeptLogTender")
    public JAXBElement<GetServiceDeptLogTender> createGetServiceDeptLogTender(GetServiceDeptLogTender value) {
        return new JAXBElement<GetServiceDeptLogTender>(_GetServiceDeptLogTender_QNAME, GetServiceDeptLogTender.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceDeptLogTenderResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetServiceDeptLogTenderResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getServiceDeptLogTenderResponse")
    public JAXBElement<GetServiceDeptLogTenderResponse> createGetServiceDeptLogTenderResponse(GetServiceDeptLogTenderResponse value) {
        return new JAXBElement<GetServiceDeptLogTenderResponse>(_GetServiceDeptLogTenderResponse_QNAME, GetServiceDeptLogTenderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceIncomeLog }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetServiceIncomeLog }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getServiceIncomeLog")
    public JAXBElement<GetServiceIncomeLog> createGetServiceIncomeLog(GetServiceIncomeLog value) {
        return new JAXBElement<GetServiceIncomeLog>(_GetServiceIncomeLog_QNAME, GetServiceIncomeLog.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceIncomeLogResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetServiceIncomeLogResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getServiceIncomeLogResponse")
    public JAXBElement<GetServiceIncomeLogResponse> createGetServiceIncomeLogResponse(GetServiceIncomeLogResponse value) {
        return new JAXBElement<GetServiceIncomeLogResponse>(_GetServiceIncomeLogResponse_QNAME, GetServiceIncomeLogResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceIncomeLogTender }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetServiceIncomeLogTender }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getServiceIncomeLogTender")
    public JAXBElement<GetServiceIncomeLogTender> createGetServiceIncomeLogTender(GetServiceIncomeLogTender value) {
        return new JAXBElement<GetServiceIncomeLogTender>(_GetServiceIncomeLogTender_QNAME, GetServiceIncomeLogTender.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceIncomeLogTenderResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetServiceIncomeLogTenderResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getServiceIncomeLogTenderResponse")
    public JAXBElement<GetServiceIncomeLogTenderResponse> createGetServiceIncomeLogTenderResponse(GetServiceIncomeLogTenderResponse value) {
        return new JAXBElement<GetServiceIncomeLogTenderResponse>(_GetServiceIncomeLogTenderResponse_QNAME, GetServiceIncomeLogTenderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceLogTender }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetServiceLogTender }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getServiceLogTender")
    public JAXBElement<GetServiceLogTender> createGetServiceLogTender(GetServiceLogTender value) {
        return new JAXBElement<GetServiceLogTender>(_GetServiceLogTender_QNAME, GetServiceLogTender.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetServiceLogTenderResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetServiceLogTenderResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getServiceLogTenderResponse")
    public JAXBElement<GetServiceLogTenderResponse> createGetServiceLogTenderResponse(GetServiceLogTenderResponse value) {
        return new JAXBElement<GetServiceLogTenderResponse>(_GetServiceLogTenderResponse_QNAME, GetServiceLogTenderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTaxpayerDeptInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTaxpayerDeptInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getTaxpayerDeptInfo")
    public JAXBElement<GetTaxpayerDeptInfo> createGetTaxpayerDeptInfo(GetTaxpayerDeptInfo value) {
        return new JAXBElement<GetTaxpayerDeptInfo>(_GetTaxpayerDeptInfo_QNAME, GetTaxpayerDeptInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTaxpayerDeptInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTaxpayerDeptInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getTaxpayerDeptInfoResponse")
    public JAXBElement<GetTaxpayerDeptInfoResponse> createGetTaxpayerDeptInfoResponse(GetTaxpayerDeptInfoResponse value) {
        return new JAXBElement<GetTaxpayerDeptInfoResponse>(_GetTaxpayerDeptInfoResponse_QNAME, GetTaxpayerDeptInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTaxpayerInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTaxpayerInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getTaxpayerInfo")
    public JAXBElement<GetTaxpayerInfo> createGetTaxpayerInfo(GetTaxpayerInfo value) {
        return new JAXBElement<GetTaxpayerInfo>(_GetTaxpayerInfo_QNAME, GetTaxpayerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTaxpayerInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTaxpayerInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getTaxpayerInfoResponse")
    public JAXBElement<GetTaxpayerInfoResponse> createGetTaxpayerInfoResponse(GetTaxpayerInfoResponse value) {
        return new JAXBElement<GetTaxpayerInfoResponse>(_GetTaxpayerInfoResponse_QNAME, GetTaxpayerInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTaxpayerTaxPayable }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTaxpayerTaxPayable }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getTaxpayerTaxPayable")
    public JAXBElement<GetTaxpayerTaxPayable> createGetTaxpayerTaxPayable(GetTaxpayerTaxPayable value) {
        return new JAXBElement<GetTaxpayerTaxPayable>(_GetTaxpayerTaxPayable_QNAME, GetTaxpayerTaxPayable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTaxpayerTaxPayableResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetTaxpayerTaxPayableResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getTaxpayerTaxPayableResponse")
    public JAXBElement<GetTaxpayerTaxPayableResponse> createGetTaxpayerTaxPayableResponse(GetTaxpayerTaxPayableResponse value) {
        return new JAXBElement<GetTaxpayerTaxPayableResponse>(_GetTaxpayerTaxPayableResponse_QNAME, GetTaxpayerTaxPayableResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUserInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getUserInfo")
    public JAXBElement<GetUserInfo> createGetUserInfo(GetUserInfo value) {
        return new JAXBElement<GetUserInfo>(_GetUserInfo_QNAME, GetUserInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetUserInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getUserInfoResponse")
    public JAXBElement<GetUserInfoResponse> createGetUserInfoResponse(GetUserInfoResponse value) {
        return new JAXBElement<GetUserInfoResponse>(_GetUserInfoResponse_QNAME, GetUserInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100601GetTaxPayerInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100601GetTaxPayerInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100601_getTaxPayerInfo")
    public JAXBElement<WS100601GetTaxPayerInfo> createWS100601GetTaxPayerInfo(WS100601GetTaxPayerInfo value) {
        return new JAXBElement<WS100601GetTaxPayerInfo>(_WS100601GetTaxPayerInfo_QNAME, WS100601GetTaxPayerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100601GetTaxPayerInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100601GetTaxPayerInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100601_getTaxPayerInfoResponse")
    public JAXBElement<WS100601GetTaxPayerInfoResponse> createWS100601GetTaxPayerInfoResponse(WS100601GetTaxPayerInfoResponse value) {
        return new JAXBElement<WS100601GetTaxPayerInfoResponse>(_WS100601GetTaxPayerInfoResponse_QNAME, WS100601GetTaxPayerInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100602GetTaxPayerTaxPayable }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100602GetTaxPayerTaxPayable }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100602_getTaxPayerTaxPayable")
    public JAXBElement<WS100602GetTaxPayerTaxPayable> createWS100602GetTaxPayerTaxPayable(WS100602GetTaxPayerTaxPayable value) {
        return new JAXBElement<WS100602GetTaxPayerTaxPayable>(_WS100602GetTaxPayerTaxPayable_QNAME, WS100602GetTaxPayerTaxPayable.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100602GetTaxPayerTaxPayableResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100602GetTaxPayerTaxPayableResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100602_getTaxPayerTaxPayableResponse")
    public JAXBElement<WS100602GetTaxPayerTaxPayableResponse> createWS100602GetTaxPayerTaxPayableResponse(WS100602GetTaxPayerTaxPayableResponse value) {
        return new JAXBElement<WS100602GetTaxPayerTaxPayableResponse>(_WS100602GetTaxPayerTaxPayableResponse_QNAME, WS100602GetTaxPayerTaxPayableResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100603GetServiceIncomeLog }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100603GetServiceIncomeLog }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100603_getServiceIncomeLog")
    public JAXBElement<WS100603GetServiceIncomeLog> createWS100603GetServiceIncomeLog(WS100603GetServiceIncomeLog value) {
        return new JAXBElement<WS100603GetServiceIncomeLog>(_WS100603GetServiceIncomeLog_QNAME, WS100603GetServiceIncomeLog.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100603GetServiceIncomeLogResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100603GetServiceIncomeLogResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100603_getServiceIncomeLogResponse")
    public JAXBElement<WS100603GetServiceIncomeLogResponse> createWS100603GetServiceIncomeLogResponse(WS100603GetServiceIncomeLogResponse value) {
        return new JAXBElement<WS100603GetServiceIncomeLogResponse>(_WS100603GetServiceIncomeLogResponse_QNAME, WS100603GetServiceIncomeLogResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100604GetSalaryInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100604GetSalaryInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100604_getSalaryInfo")
    public JAXBElement<WS100604GetSalaryInfo> createWS100604GetSalaryInfo(WS100604GetSalaryInfo value) {
        return new JAXBElement<WS100604GetSalaryInfo>(_WS100604GetSalaryInfo_QNAME, WS100604GetSalaryInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100604GetSalaryInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100604GetSalaryInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100604_getSalaryInfoResponse")
    public JAXBElement<WS100604GetSalaryInfoResponse> createWS100604GetSalaryInfoResponse(WS100604GetSalaryInfoResponse value) {
        return new JAXBElement<WS100604GetSalaryInfoResponse>(_WS100604GetSalaryInfoResponse_QNAME, WS100604GetSalaryInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100605GetTaxPayerDeptInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100605GetTaxPayerDeptInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100605_getTaxPayerDeptInfo")
    public JAXBElement<WS100605GetTaxPayerDeptInfo> createWS100605GetTaxPayerDeptInfo(WS100605GetTaxPayerDeptInfo value) {
        return new JAXBElement<WS100605GetTaxPayerDeptInfo>(_WS100605GetTaxPayerDeptInfo_QNAME, WS100605GetTaxPayerDeptInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100605GetTaxPayerDeptInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100605GetTaxPayerDeptInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100605_getTaxPayerDeptInfoResponse")
    public JAXBElement<WS100605GetTaxPayerDeptInfoResponse> createWS100605GetTaxPayerDeptInfoResponse(WS100605GetTaxPayerDeptInfoResponse value) {
        return new JAXBElement<WS100605GetTaxPayerDeptInfoResponse>(_WS100605GetTaxPayerDeptInfoResponse_QNAME, WS100605GetTaxPayerDeptInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100606GetTaxUserInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100606GetTaxUserInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100606_getTaxUserInfo")
    public JAXBElement<WS100606GetTaxUserInfo> createWS100606GetTaxUserInfo(WS100606GetTaxUserInfo value) {
        return new JAXBElement<WS100606GetTaxUserInfo>(_WS100606GetTaxUserInfo_QNAME, WS100606GetTaxUserInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100606GetTaxUserInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100606GetTaxUserInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100606_getTaxUserInfoResponse")
    public JAXBElement<WS100606GetTaxUserInfoResponse> createWS100606GetTaxUserInfoResponse(WS100606GetTaxUserInfoResponse value) {
        return new JAXBElement<WS100606GetTaxUserInfoResponse>(_WS100606GetTaxUserInfoResponse_QNAME, WS100606GetTaxUserInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100607InsertTaxInvoice }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100607InsertTaxInvoice }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100607_insertTaxInvoice")
    public JAXBElement<WS100607InsertTaxInvoice> createWS100607InsertTaxInvoice(WS100607InsertTaxInvoice value) {
        return new JAXBElement<WS100607InsertTaxInvoice>(_WS100607InsertTaxInvoice_QNAME, WS100607InsertTaxInvoice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100607InsertTaxInvoiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100607InsertTaxInvoiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100607_insertTaxInvoiceResponse")
    public JAXBElement<WS100607InsertTaxInvoiceResponse> createWS100607InsertTaxInvoiceResponse(WS100607InsertTaxInvoiceResponse value) {
        return new JAXBElement<WS100607InsertTaxInvoiceResponse>(_WS100607InsertTaxInvoiceResponse_QNAME, WS100607InsertTaxInvoiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100608InsertTaxInvoiceDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100608InsertTaxInvoiceDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100608_insertTaxInvoiceDetail")
    public JAXBElement<WS100608InsertTaxInvoiceDetail> createWS100608InsertTaxInvoiceDetail(WS100608InsertTaxInvoiceDetail value) {
        return new JAXBElement<WS100608InsertTaxInvoiceDetail>(_WS100608InsertTaxInvoiceDetail_QNAME, WS100608InsertTaxInvoiceDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100608InsertTaxInvoiceDetailResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100608InsertTaxInvoiceDetailResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100608_insertTaxInvoiceDetailResponse")
    public JAXBElement<WS100608InsertTaxInvoiceDetailResponse> createWS100608InsertTaxInvoiceDetailResponse(WS100608InsertTaxInvoiceDetailResponse value) {
        return new JAXBElement<WS100608InsertTaxInvoiceDetailResponse>(_WS100608InsertTaxInvoiceDetailResponse_QNAME, WS100608InsertTaxInvoiceDetailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100609GetVehiclePaidTaxHistory }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100609GetVehiclePaidTaxHistory }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100609_getVehiclePaidTaxHistory")
    public JAXBElement<WS100609GetVehiclePaidTaxHistory> createWS100609GetVehiclePaidTaxHistory(WS100609GetVehiclePaidTaxHistory value) {
        return new JAXBElement<WS100609GetVehiclePaidTaxHistory>(_WS100609GetVehiclePaidTaxHistory_QNAME, WS100609GetVehiclePaidTaxHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100609GetVehiclePaidTaxHistoryResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100609GetVehiclePaidTaxHistoryResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100609_getVehiclePaidTaxHistoryResponse")
    public JAXBElement<WS100609GetVehiclePaidTaxHistoryResponse> createWS100609GetVehiclePaidTaxHistoryResponse(WS100609GetVehiclePaidTaxHistoryResponse value) {
        return new JAXBElement<WS100609GetVehiclePaidTaxHistoryResponse>(_WS100609GetVehiclePaidTaxHistoryResponse_QNAME, WS100609GetVehiclePaidTaxHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100610GetVehicleTaxPayableInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100610GetVehicleTaxPayableInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100610_getVehicleTaxPayableInfo")
    public JAXBElement<WS100610GetVehicleTaxPayableInfo> createWS100610GetVehicleTaxPayableInfo(WS100610GetVehicleTaxPayableInfo value) {
        return new JAXBElement<WS100610GetVehicleTaxPayableInfo>(_WS100610GetVehicleTaxPayableInfo_QNAME, WS100610GetVehicleTaxPayableInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100610GetVehicleTaxPayableInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100610GetVehicleTaxPayableInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100610_getVehicleTaxPayableInfoResponse")
    public JAXBElement<WS100610GetVehicleTaxPayableInfoResponse> createWS100610GetVehicleTaxPayableInfoResponse(WS100610GetVehicleTaxPayableInfoResponse value) {
        return new JAXBElement<WS100610GetVehicleTaxPayableInfoResponse>(_WS100610GetVehicleTaxPayableInfoResponse_QNAME, WS100610GetVehicleTaxPayableInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100611GetVehicleInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100611GetVehicleInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100611_getVehicleInfo")
    public JAXBElement<WS100611GetVehicleInfo> createWS100611GetVehicleInfo(WS100611GetVehicleInfo value) {
        return new JAXBElement<WS100611GetVehicleInfo>(_WS100611GetVehicleInfo_QNAME, WS100611GetVehicleInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100611GetVehicleInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100611GetVehicleInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100611_getVehicleInfoResponse")
    public JAXBElement<WS100611GetVehicleInfoResponse> createWS100611GetVehicleInfoResponse(WS100611GetVehicleInfoResponse value) {
        return new JAXBElement<WS100611GetVehicleInfoResponse>(_WS100611GetVehicleInfoResponse_QNAME, WS100611GetVehicleInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100612GetVehicleTaxInfoByCabinNumber }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100612GetVehicleTaxInfoByCabinNumber }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100612_getVehicleTaxInfoByCabinNumber")
    public JAXBElement<WS100612GetVehicleTaxInfoByCabinNumber> createWS100612GetVehicleTaxInfoByCabinNumber(WS100612GetVehicleTaxInfoByCabinNumber value) {
        return new JAXBElement<WS100612GetVehicleTaxInfoByCabinNumber>(_WS100612GetVehicleTaxInfoByCabinNumber_QNAME, WS100612GetVehicleTaxInfoByCabinNumber.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100612GetVehicleTaxInfoByCabinNumberResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100612GetVehicleTaxInfoByCabinNumberResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100612_getVehicleTaxInfoByCabinNumberResponse")
    public JAXBElement<WS100612GetVehicleTaxInfoByCabinNumberResponse> createWS100612GetVehicleTaxInfoByCabinNumberResponse(WS100612GetVehicleTaxInfoByCabinNumberResponse value) {
        return new JAXBElement<WS100612GetVehicleTaxInfoByCabinNumberResponse>(_WS100612GetVehicleTaxInfoByCabinNumberResponse_QNAME, WS100612GetVehicleTaxInfoByCabinNumberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100613GetTaxOrganizationTT02 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100613GetTaxOrganizationTT02 }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100613_getTaxOrganizationTT02")
    public JAXBElement<WS100613GetTaxOrganizationTT02> createWS100613GetTaxOrganizationTT02(WS100613GetTaxOrganizationTT02 value) {
        return new JAXBElement<WS100613GetTaxOrganizationTT02>(_WS100613GetTaxOrganizationTT02_QNAME, WS100613GetTaxOrganizationTT02 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100613GetTaxOrganizationTT02Response }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100613GetTaxOrganizationTT02Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100613_getTaxOrganizationTT02Response")
    public JAXBElement<WS100613GetTaxOrganizationTT02Response> createWS100613GetTaxOrganizationTT02Response(WS100613GetTaxOrganizationTT02Response value) {
        return new JAXBElement<WS100613GetTaxOrganizationTT02Response>(_WS100613GetTaxOrganizationTT02Response_QNAME, WS100613GetTaxOrganizationTT02Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100614GetTaxOrganizationTT03 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100614GetTaxOrganizationTT03 }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100614_getTaxOrganizationTT03")
    public JAXBElement<WS100614GetTaxOrganizationTT03> createWS100614GetTaxOrganizationTT03(WS100614GetTaxOrganizationTT03 value) {
        return new JAXBElement<WS100614GetTaxOrganizationTT03>(_WS100614GetTaxOrganizationTT03_QNAME, WS100614GetTaxOrganizationTT03 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100614GetTaxOrganizationTT03Response }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100614GetTaxOrganizationTT03Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100614_getTaxOrganizationTT03Response")
    public JAXBElement<WS100614GetTaxOrganizationTT03Response> createWS100614GetTaxOrganizationTT03Response(WS100614GetTaxOrganizationTT03Response value) {
        return new JAXBElement<WS100614GetTaxOrganizationTT03Response>(_WS100614GetTaxOrganizationTT03Response_QNAME, WS100614GetTaxOrganizationTT03Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100615GetTaxOrganizationTT11 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100615GetTaxOrganizationTT11 }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100615_getTaxOrganizationTT11")
    public JAXBElement<WS100615GetTaxOrganizationTT11> createWS100615GetTaxOrganizationTT11(WS100615GetTaxOrganizationTT11 value) {
        return new JAXBElement<WS100615GetTaxOrganizationTT11>(_WS100615GetTaxOrganizationTT11_QNAME, WS100615GetTaxOrganizationTT11 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100615GetTaxOrganizationTT11Response }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100615GetTaxOrganizationTT11Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100615_getTaxOrganizationTT11Response")
    public JAXBElement<WS100615GetTaxOrganizationTT11Response> createWS100615GetTaxOrganizationTT11Response(WS100615GetTaxOrganizationTT11Response value) {
        return new JAXBElement<WS100615GetTaxOrganizationTT11Response>(_WS100615GetTaxOrganizationTT11Response_QNAME, WS100615GetTaxOrganizationTT11Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100616GetMOFBudgetedReportInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100616GetMOFBudgetedReportInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100616_getMOFBudgetedReportInfo")
    public JAXBElement<WS100616GetMOFBudgetedReportInfo> createWS100616GetMOFBudgetedReportInfo(WS100616GetMOFBudgetedReportInfo value) {
        return new JAXBElement<WS100616GetMOFBudgetedReportInfo>(_WS100616GetMOFBudgetedReportInfo_QNAME, WS100616GetMOFBudgetedReportInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100616GetMOFBudgetedReportInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100616GetMOFBudgetedReportInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100616_getMOFBudgetedReportInfoResponse")
    public JAXBElement<WS100616GetMOFBudgetedReportInfoResponse> createWS100616GetMOFBudgetedReportInfoResponse(WS100616GetMOFBudgetedReportInfoResponse value) {
        return new JAXBElement<WS100616GetMOFBudgetedReportInfoResponse>(_WS100616GetMOFBudgetedReportInfoResponse_QNAME, WS100616GetMOFBudgetedReportInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100617GetTaxCitizenInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100617GetTaxCitizenInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100617_getTaxCitizenInfo")
    public JAXBElement<WS100617GetTaxCitizenInfo> createWS100617GetTaxCitizenInfo(WS100617GetTaxCitizenInfo value) {
        return new JAXBElement<WS100617GetTaxCitizenInfo>(_WS100617GetTaxCitizenInfo_QNAME, WS100617GetTaxCitizenInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100617GetTaxCitizenInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100617GetTaxCitizenInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100617_getTaxCitizenInfoResponse")
    public JAXBElement<WS100617GetTaxCitizenInfoResponse> createWS100617GetTaxCitizenInfoResponse(WS100617GetTaxCitizenInfoResponse value) {
        return new JAXBElement<WS100617GetTaxCitizenInfoResponse>(_WS100617GetTaxCitizenInfoResponse_QNAME, WS100617GetTaxCitizenInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100618CheckTaxPayerOfCapitalCity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100618CheckTaxPayerOfCapitalCity }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100618_checkTaxPayerOfCapitalCity")
    public JAXBElement<WS100618CheckTaxPayerOfCapitalCity> createWS100618CheckTaxPayerOfCapitalCity(WS100618CheckTaxPayerOfCapitalCity value) {
        return new JAXBElement<WS100618CheckTaxPayerOfCapitalCity>(_WS100618CheckTaxPayerOfCapitalCity_QNAME, WS100618CheckTaxPayerOfCapitalCity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100618CheckTaxPayerOfCapitalCityResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100618CheckTaxPayerOfCapitalCityResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100618_checkTaxPayerOfCapitalCityResponse")
    public JAXBElement<WS100618CheckTaxPayerOfCapitalCityResponse> createWS100618CheckTaxPayerOfCapitalCityResponse(WS100618CheckTaxPayerOfCapitalCityResponse value) {
        return new JAXBElement<WS100618CheckTaxPayerOfCapitalCityResponse>(_WS100618CheckTaxPayerOfCapitalCityResponse_QNAME, WS100618CheckTaxPayerOfCapitalCityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100619TaxPayerPrivateTaxPayerInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100619TaxPayerPrivateTaxPayerInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100619_taxPayerPrivateTaxPayerInfo")
    public JAXBElement<WS100619TaxPayerPrivateTaxPayerInfo> createWS100619TaxPayerPrivateTaxPayerInfo(WS100619TaxPayerPrivateTaxPayerInfo value) {
        return new JAXBElement<WS100619TaxPayerPrivateTaxPayerInfo>(_WS100619TaxPayerPrivateTaxPayerInfo_QNAME, WS100619TaxPayerPrivateTaxPayerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100619TaxPayerPrivateTaxPayerInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100619TaxPayerPrivateTaxPayerInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100619_taxPayerPrivateTaxPayerInfoResponse")
    public JAXBElement<WS100619TaxPayerPrivateTaxPayerInfoResponse> createWS100619TaxPayerPrivateTaxPayerInfoResponse(WS100619TaxPayerPrivateTaxPayerInfoResponse value) {
        return new JAXBElement<WS100619TaxPayerPrivateTaxPayerInfoResponse>(_WS100619TaxPayerPrivateTaxPayerInfoResponse_QNAME, WS100619TaxPayerPrivateTaxPayerInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100620GetTaxOrganizationTT06 }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100620GetTaxOrganizationTT06 }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100620_getTaxOrganizationTT06")
    public JAXBElement<WS100620GetTaxOrganizationTT06> createWS100620GetTaxOrganizationTT06(WS100620GetTaxOrganizationTT06 value) {
        return new JAXBElement<WS100620GetTaxOrganizationTT06>(_WS100620GetTaxOrganizationTT06_QNAME, WS100620GetTaxOrganizationTT06 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100620GetTaxOrganizationTT06Response }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100620GetTaxOrganizationTT06Response }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100620_getTaxOrganizationTT06Response")
    public JAXBElement<WS100620GetTaxOrganizationTT06Response> createWS100620GetTaxOrganizationTT06Response(WS100620GetTaxOrganizationTT06Response value) {
        return new JAXBElement<WS100620GetTaxOrganizationTT06Response>(_WS100620GetTaxOrganizationTT06Response_QNAME, WS100620GetTaxOrganizationTT06Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100621GetTaxPayerNUATInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100621GetTaxPayerNUATInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100621_getTaxPayerNUATInfo")
    public JAXBElement<WS100621GetTaxPayerNUATInfo> createWS100621GetTaxPayerNUATInfo(WS100621GetTaxPayerNUATInfo value) {
        return new JAXBElement<WS100621GetTaxPayerNUATInfo>(_WS100621GetTaxPayerNUATInfo_QNAME, WS100621GetTaxPayerNUATInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100621GetTaxPayerNUATInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100621GetTaxPayerNUATInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100621_getTaxPayerNUATInfoResponse")
    public JAXBElement<WS100621GetTaxPayerNUATInfoResponse> createWS100621GetTaxPayerNUATInfoResponse(WS100621GetTaxPayerNUATInfoResponse value) {
        return new JAXBElement<WS100621GetTaxPayerNUATInfoResponse>(_WS100621GetTaxPayerNUATInfoResponse_QNAME, WS100621GetTaxPayerNUATInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100622GetIndividualInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100622GetIndividualInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100622_getIndividualInfo")
    public JAXBElement<WS100622GetIndividualInfo> createWS100622GetIndividualInfo(WS100622GetIndividualInfo value) {
        return new JAXBElement<WS100622GetIndividualInfo>(_WS100622GetIndividualInfo_QNAME, WS100622GetIndividualInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100622GetIndividualInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100622GetIndividualInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100622_getIndividualInfoResponse")
    public JAXBElement<WS100622GetIndividualInfoResponse> createWS100622GetIndividualInfoResponse(WS100622GetIndividualInfoResponse value) {
        return new JAXBElement<WS100622GetIndividualInfoResponse>(_WS100622GetIndividualInfoResponse_QNAME, WS100622GetIndividualInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100623GetTenderInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100623GetTenderInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100623_getTenderInfo")
    public JAXBElement<WS100623GetTenderInfo> createWS100623GetTenderInfo(WS100623GetTenderInfo value) {
        return new JAXBElement<WS100623GetTenderInfo>(_WS100623GetTenderInfo_QNAME, WS100623GetTenderInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100623GetTenderInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100623GetTenderInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100623_getTenderInfoResponse")
    public JAXBElement<WS100623GetTenderInfoResponse> createWS100623GetTenderInfoResponse(WS100623GetTenderInfoResponse value) {
        return new JAXBElement<WS100623GetTenderInfoResponse>(_WS100623GetTenderInfoResponse_QNAME, WS100623GetTenderInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100624GetOrganizationInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100624GetOrganizationInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100624_getOrganizationInfo")
    public JAXBElement<WS100624GetOrganizationInfo> createWS100624GetOrganizationInfo(WS100624GetOrganizationInfo value) {
        return new JAXBElement<WS100624GetOrganizationInfo>(_WS100624GetOrganizationInfo_QNAME, WS100624GetOrganizationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100624GetOrganizationInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100624GetOrganizationInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100624_getOrganizationInfoResponse")
    public JAXBElement<WS100624GetOrganizationInfoResponse> createWS100624GetOrganizationInfoResponse(WS100624GetOrganizationInfoResponse value) {
        return new JAXBElement<WS100624GetOrganizationInfoResponse>(_WS100624GetOrganizationInfoResponse_QNAME, WS100624GetOrganizationInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100625CitizenTaxReportInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100625CitizenTaxReportInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100625_citizenTaxReportInfo")
    public JAXBElement<WS100625CitizenTaxReportInfo> createWS100625CitizenTaxReportInfo(WS100625CitizenTaxReportInfo value) {
        return new JAXBElement<WS100625CitizenTaxReportInfo>(_WS100625CitizenTaxReportInfo_QNAME, WS100625CitizenTaxReportInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100625CitizenTaxReportInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100625CitizenTaxReportInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100625_citizenTaxReportInfoResponse")
    public JAXBElement<WS100625CitizenTaxReportInfoResponse> createWS100625CitizenTaxReportInfoResponse(WS100625CitizenTaxReportInfoResponse value) {
        return new JAXBElement<WS100625CitizenTaxReportInfoResponse>(_WS100625CitizenTaxReportInfoResponse_QNAME, WS100625CitizenTaxReportInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100626LegalEntityTaxReportInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100626LegalEntityTaxReportInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100626_legalEntityTaxReportInfo")
    public JAXBElement<WS100626LegalEntityTaxReportInfo> createWS100626LegalEntityTaxReportInfo(WS100626LegalEntityTaxReportInfo value) {
        return new JAXBElement<WS100626LegalEntityTaxReportInfo>(_WS100626LegalEntityTaxReportInfo_QNAME, WS100626LegalEntityTaxReportInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100626LegalEntityTaxReportInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100626LegalEntityTaxReportInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100626_legalEntityTaxReportInfoResponse")
    public JAXBElement<WS100626LegalEntityTaxReportInfoResponse> createWS100626LegalEntityTaxReportInfoResponse(WS100626LegalEntityTaxReportInfoResponse value) {
        return new JAXBElement<WS100626LegalEntityTaxReportInfoResponse>(_WS100626LegalEntityTaxReportInfoResponse_QNAME, WS100626LegalEntityTaxReportInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100627LicensingInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100627LicensingInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100627_licensingInfo")
    public JAXBElement<WS100627LicensingInfo> createWS100627LicensingInfo(WS100627LicensingInfo value) {
        return new JAXBElement<WS100627LicensingInfo>(_WS100627LicensingInfo_QNAME, WS100627LicensingInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100627LicensingInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100627LicensingInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100627_licensingInfoResponse")
    public JAXBElement<WS100627LicensingInfoResponse> createWS100627LicensingInfoResponse(WS100627LicensingInfoResponse value) {
        return new JAXBElement<WS100627LicensingInfoResponse>(_WS100627LicensingInfoResponse_QNAME, WS100627LicensingInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100628TradeInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100628TradeInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100628_tradeInfo")
    public JAXBElement<WS100628TradeInfo> createWS100628TradeInfo(WS100628TradeInfo value) {
        return new JAXBElement<WS100628TradeInfo>(_WS100628TradeInfo_QNAME, WS100628TradeInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100628TradeInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100628TradeInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100628_tradeInfoResponse")
    public JAXBElement<WS100628TradeInfoResponse> createWS100628TradeInfoResponse(WS100628TradeInfoResponse value) {
        return new JAXBElement<WS100628TradeInfoResponse>(_WS100628TradeInfoResponse_QNAME, WS100628TradeInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100629ThanksToTaxpayersService }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100629ThanksToTaxpayersService }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100629_thanksToTaxpayersService")
    public JAXBElement<WS100629ThanksToTaxpayersService> createWS100629ThanksToTaxpayersService(WS100629ThanksToTaxpayersService value) {
        return new JAXBElement<WS100629ThanksToTaxpayersService>(_WS100629ThanksToTaxpayersService_QNAME, WS100629ThanksToTaxpayersService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100629ThanksToTaxpayersServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100629ThanksToTaxpayersServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tax.xyp.gov.mn/", name = "WS100629_thanksToTaxpayersServiceResponse")
    public JAXBElement<WS100629ThanksToTaxpayersServiceResponse> createWS100629ThanksToTaxpayersServiceResponse(WS100629ThanksToTaxpayersServiceResponse value) {
        return new JAXBElement<WS100629ThanksToTaxpayersServiceResponse>(_WS100629ThanksToTaxpayersServiceResponse_QNAME, WS100629ThanksToTaxpayersServiceResponse.class, null, value);
    }

}
