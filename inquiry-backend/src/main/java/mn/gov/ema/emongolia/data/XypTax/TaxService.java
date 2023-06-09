
package mn.gov.ema.emongolia.data.XypTax;

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
@WebService(name = "TaxService", targetNamespace = "http://tax.xyp.gov.mn/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TaxService {


    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypTax.ServiceResponse
     */
    @WebMethod(operationName = "WS100607_insertTaxInvoice")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100607_insertTaxInvoice", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100607InsertTaxInvoice")
    @ResponseWrapper(localName = "WS100607_insertTaxInvoiceResponse", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100607InsertTaxInvoiceResponse")
    public ServiceResponse ws100607InsertTaxInvoice(
        @WebParam(name = "request", targetNamespace = "")
        ServiceInvoiceRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypTax.ServiceResponse
     */
    @WebMethod(operationName = "WS100609_getVehiclePaidTaxHistory")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100609_getVehiclePaidTaxHistory", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100609GetVehiclePaidTaxHistory")
    @ResponseWrapper(localName = "WS100609_getVehiclePaidTaxHistoryResponse", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100609GetVehiclePaidTaxHistoryResponse")
    public ServiceResponse ws100609GetVehiclePaidTaxHistory(
        @WebParam(name = "request", targetNamespace = "")
        ServiceVehiclePaidTaxHistoryRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypTax.ServiceResponse
     */
    @WebMethod(operationName = "WS100608_insertTaxInvoiceDetail")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100608_insertTaxInvoiceDetail", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100608InsertTaxInvoiceDetail")
    @ResponseWrapper(localName = "WS100608_insertTaxInvoiceDetailResponse", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100608InsertTaxInvoiceDetailResponse")
    public ServiceResponse ws100608InsertTaxInvoiceDetail(
        @WebParam(name = "request", targetNamespace = "")
        ServiceInsertTaxInvoiceDetailRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypTax.ServiceResponse
     */
    @WebMethod(operationName = "WS100606_getTaxUserInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100606_getTaxUserInfo", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100606GetTaxUserInfo")
    @ResponseWrapper(localName = "WS100606_getTaxUserInfoResponse", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100606GetTaxUserInfoResponse")
    public ServiceResponse ws100606GetTaxUserInfo(
        @WebParam(name = "request", targetNamespace = "")
        ServiceUserInfoRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypTax.ServiceResponse
     */
    @WebMethod(operationName = "WS100604_getSalaryInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100604_getSalaryInfo", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100604GetSalaryInfo")
    @ResponseWrapper(localName = "WS100604_getSalaryInfoResponse", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100604GetSalaryInfoResponse")
    public ServiceResponse ws100604GetSalaryInfo(
        @WebParam(name = "request", targetNamespace = "")
        ServiceTaxRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypTax.ServiceResponse
     */
    @WebMethod(operationName = "WS100601_getTaxPayerInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100601_getTaxPayerInfo", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100601GetTaxPayerInfo")
    @ResponseWrapper(localName = "WS100601_getTaxPayerInfoResponse", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100601GetTaxPayerInfoResponse")
    public ServiceResponse ws100601GetTaxPayerInfo(
        @WebParam(name = "request", targetNamespace = "")
        ServiceTaxRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypTax.ServiceResponse
     */
    @WebMethod(operationName = "WS100620_getTaxOrganizationTT06")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100620_getTaxOrganizationTT06", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100620GetTaxOrganizationTT06")
    @ResponseWrapper(localName = "WS100620_getTaxOrganizationTT06Response", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100620GetTaxOrganizationTT06Response")
    public ServiceResponse ws100620GetTaxOrganizationTT06(
        @WebParam(name = "request", targetNamespace = "")
        TaxOrganizationRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypTax.ServiceResponse
     */
    @WebMethod(operationName = "WS100613_getTaxOrganizationTT02")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100613_getTaxOrganizationTT02", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100613GetTaxOrganizationTT02")
    @ResponseWrapper(localName = "WS100613_getTaxOrganizationTT02Response", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100613GetTaxOrganizationTT02Response")
    public ServiceResponse ws100613GetTaxOrganizationTT02(
        @WebParam(name = "request", targetNamespace = "")
        TaxOrganizationRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypTax.ServiceResponse
     */
    @WebMethod(operationName = "WS100612_getVehicleTaxInfoByCabinNumber")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100612_getVehicleTaxInfoByCabinNumber", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100612GetVehicleTaxInfoByCabinNumber")
    @ResponseWrapper(localName = "WS100612_getVehicleTaxInfoByCabinNumberResponse", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100612GetVehicleTaxInfoByCabinNumberResponse")
    public ServiceResponse ws100612GetVehicleTaxInfoByCabinNumber(
        @WebParam(name = "request", targetNamespace = "")
        VehicleTaxInfoRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypTax.ServiceResponse
     */
    @WebMethod(operationName = "WS100626_legalEntityTaxReportInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100626_legalEntityTaxReportInfo", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100626LegalEntityTaxReportInfo")
    @ResponseWrapper(localName = "WS100626_legalEntityTaxReportInfoResponse", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100626LegalEntityTaxReportInfoResponse")
    public ServiceResponse ws100626LegalEntityTaxReportInfo(
        @WebParam(name = "request", targetNamespace = "")
        TaxReportRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypTax.ServiceResponse
     */
    @WebMethod(operationName = "WS100603_getServiceIncomeLog")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100603_getServiceIncomeLog", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100603GetServiceIncomeLog")
    @ResponseWrapper(localName = "WS100603_getServiceIncomeLogResponse", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100603GetServiceIncomeLogResponse")
    public ServiceResponse ws100603GetServiceIncomeLog(
        @WebParam(name = "request", targetNamespace = "")
        ServiceTaxRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypTax.ServiceResponse
     */
    @WebMethod(operationName = "WS100628_tradeInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100628_tradeInfo", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100628TradeInfo")
    @ResponseWrapper(localName = "WS100628_tradeInfoResponse", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100628TradeInfoResponse")
    public ServiceResponse ws100628TradeInfo(
        @WebParam(name = "request", targetNamespace = "")
        LicensingInfoRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypTax.ServiceResponse
     */
    @WebMethod(operationName = "WS100629_thanksToTaxpayersService")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100629_thanksToTaxpayersService", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100629ThanksToTaxpayersService")
    @ResponseWrapper(localName = "WS100629_thanksToTaxpayersServiceResponse", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100629ThanksToTaxpayersServiceResponse")
    public ServiceResponse ws100629ThanksToTaxpayersService(
        @WebParam(name = "request", targetNamespace = "")
        ThanksToTaxpayersRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypTax.ServiceResponse
     */
    @WebMethod(operationName = "WS100602_getTaxPayerTaxPayable")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100602_getTaxPayerTaxPayable", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100602GetTaxPayerTaxPayable")
    @ResponseWrapper(localName = "WS100602_getTaxPayerTaxPayableResponse", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100602GetTaxPayerTaxPayableResponse")
    public ServiceResponse ws100602GetTaxPayerTaxPayable(
        @WebParam(name = "request", targetNamespace = "")
        ServiceTaxRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypTax.ServiceResponse
     */
    @WebMethod(operationName = "WS100623_getTenderInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100623_getTenderInfo", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100623GetTenderInfo")
    @ResponseWrapper(localName = "WS100623_getTenderInfoResponse", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100623GetTenderInfoResponse")
    public ServiceResponse ws100623GetTenderInfo(
        @WebParam(name = "request", targetNamespace = "")
        TenderInfoRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypTax.ServiceResponse
     */
    @WebMethod(operationName = "WS100610_getVehicleTaxPayableInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100610_getVehicleTaxPayableInfo", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100610GetVehicleTaxPayableInfo")
    @ResponseWrapper(localName = "WS100610_getVehicleTaxPayableInfoResponse", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100610GetVehicleTaxPayableInfoResponse")
    public ServiceResponse ws100610GetVehicleTaxPayableInfo(
        @WebParam(name = "request", targetNamespace = "")
        ServiceVehicleTaxPayableInfoRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypTax.ServiceResponse
     */
    @WebMethod(operationName = "WS100611_getVehicleInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100611_getVehicleInfo", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100611GetVehicleInfo")
    @ResponseWrapper(localName = "WS100611_getVehicleInfoResponse", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100611GetVehicleInfoResponse")
    public ServiceResponse ws100611GetVehicleInfo(
        @WebParam(name = "request", targetNamespace = "")
        ServiceVehicleInfoRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypTax.ServiceResponse
     */
    @WebMethod(operationName = "WS100627_licensingInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100627_licensingInfo", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100627LicensingInfo")
    @ResponseWrapper(localName = "WS100627_licensingInfoResponse", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100627LicensingInfoResponse")
    public ServiceResponse ws100627LicensingInfo(
        @WebParam(name = "request", targetNamespace = "")
        LicensingInfoRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypTax.ServiceResponse
     */
    @WebMethod(operationName = "WS100605_getTaxPayerDeptInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100605_getTaxPayerDeptInfo", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100605GetTaxPayerDeptInfo")
    @ResponseWrapper(localName = "WS100605_getTaxPayerDeptInfoResponse", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100605GetTaxPayerDeptInfoResponse")
    public ServiceResponse ws100605GetTaxPayerDeptInfo(
        @WebParam(name = "request", targetNamespace = "")
        ServiceTaxRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypTax.ServiceResponse
     */
    @WebMethod(operationName = "WS100624_getOrganizationInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100624_getOrganizationInfo", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100624GetOrganizationInfo")
    @ResponseWrapper(localName = "WS100624_getOrganizationInfoResponse", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100624GetOrganizationInfoResponse")
    public ServiceResponse ws100624GetOrganizationInfo(
        @WebParam(name = "request", targetNamespace = "")
        ServiceOrganizationInfoRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypTax.ServiceResponse
     */
    @WebMethod(operationName = "WS100621_getTaxPayerNUATInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100621_getTaxPayerNUATInfo", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100621GetTaxPayerNUATInfo")
    @ResponseWrapper(localName = "WS100621_getTaxPayerNUATInfoResponse", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100621GetTaxPayerNUATInfoResponse")
    public ServiceResponse ws100621GetTaxPayerNUATInfo(
        @WebParam(name = "request", targetNamespace = "")
        PrivateTaxPayerRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypTax.ServiceResponse
     */
    @WebMethod(operationName = "WS100619_taxPayerPrivateTaxPayerInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100619_taxPayerPrivateTaxPayerInfo", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100619TaxPayerPrivateTaxPayerInfo")
    @ResponseWrapper(localName = "WS100619_taxPayerPrivateTaxPayerInfoResponse", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100619TaxPayerPrivateTaxPayerInfoResponse")
    public ServiceResponse ws100619TaxPayerPrivateTaxPayerInfo(
        @WebParam(name = "request", targetNamespace = "")
        PrivateTaxPayerRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypTax.ServiceResponse
     */
    @WebMethod(operationName = "WS100618_checkTaxPayerOfCapitalCity")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100618_checkTaxPayerOfCapitalCity", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100618CheckTaxPayerOfCapitalCity")
    @ResponseWrapper(localName = "WS100618_checkTaxPayerOfCapitalCityResponse", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100618CheckTaxPayerOfCapitalCityResponse")
    public ServiceResponse ws100618CheckTaxPayerOfCapitalCity(
        @WebParam(name = "request", targetNamespace = "")
        CheckTaxPayerRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypTax.ServiceResponse
     */
    @WebMethod(operationName = "WS100616_getMOFBudgetedReportInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100616_getMOFBudgetedReportInfo", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100616GetMOFBudgetedReportInfo")
    @ResponseWrapper(localName = "WS100616_getMOFBudgetedReportInfoResponse", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100616GetMOFBudgetedReportInfoResponse")
    public ServiceResponse ws100616GetMOFBudgetedReportInfo(
        @WebParam(name = "request", targetNamespace = "")
        MofBudgetedReportRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypTax.ServiceResponse
     */
    @WebMethod(operationName = "WS100614_getTaxOrganizationTT03")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100614_getTaxOrganizationTT03", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100614GetTaxOrganizationTT03")
    @ResponseWrapper(localName = "WS100614_getTaxOrganizationTT03Response", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100614GetTaxOrganizationTT03Response")
    public ServiceResponse ws100614GetTaxOrganizationTT03(
        @WebParam(name = "request", targetNamespace = "")
        TaxOrganizationRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypTax.ServiceResponse
     */
    @WebMethod(operationName = "WS100615_getTaxOrganizationTT11")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100615_getTaxOrganizationTT11", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100615GetTaxOrganizationTT11")
    @ResponseWrapper(localName = "WS100615_getTaxOrganizationTT11Response", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100615GetTaxOrganizationTT11Response")
    public ServiceResponse ws100615GetTaxOrganizationTT11(
        @WebParam(name = "request", targetNamespace = "")
        TaxOrganizationRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypTax.ServiceResponse
     */
    @WebMethod(operationName = "WS100617_getTaxCitizenInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100617_getTaxCitizenInfo", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100617GetTaxCitizenInfo")
    @ResponseWrapper(localName = "WS100617_getTaxCitizenInfoResponse", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100617GetTaxCitizenInfoResponse")
    public ServiceResponse ws100617GetTaxCitizenInfo(
        @WebParam(name = "request", targetNamespace = "")
        TaxCitizenRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypTax.ServiceResponse
     */
    @WebMethod(operationName = "WS100625_citizenTaxReportInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100625_citizenTaxReportInfo", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100625CitizenTaxReportInfo")
    @ResponseWrapper(localName = "WS100625_citizenTaxReportInfoResponse", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100625CitizenTaxReportInfoResponse")
    public ServiceResponse ws100625CitizenTaxReportInfo(
        @WebParam(name = "request", targetNamespace = "")
        TaxReportRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypTax.ServiceResponse
     */
    @WebMethod(operationName = "WS100622_getIndividualInfo")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100622_getIndividualInfo", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100622GetIndividualInfo")
    @ResponseWrapper(localName = "WS100622_getIndividualInfoResponse", targetNamespace = "http://tax.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypTax.WS100622GetIndividualInfoResponse")
    public ServiceResponse ws100622GetIndividualInfo(
        @WebParam(name = "request", targetNamespace = "")
        ServiceIndividualInfoRequestData request);

}
