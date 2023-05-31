
package mn.gov.ema.emongolia.data.XypInsurance;

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
 * generated in the mn.gov.itc.emongolia.data.XypInsurance package. 
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

    private final static QName _WS100501GetCitizenSalaryInfo_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100501_getCitizenSalaryInfo");
    private final static QName _WS100501GetCitizenSalaryInfoResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100501_getCitizenSalaryInfoResponse");
    private final static QName _WS100502GetCitizenPensionInquiry_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100502_getCitizenPensionInquiry");
    private final static QName _WS100502GetCitizenPensionInquiryResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100502_getCitizenPensionInquiryResponse");
    private final static QName _WS100503GetCheckMotherTimeInfo_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100503_getCheckMotherTimeInfo");
    private final static QName _WS100503GetCheckMotherTimeInfoResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100503_getCheckMotherTimeInfoResponse");
    private final static QName _WS100504ConfirmAppUser_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100504_confirmAppUser");
    private final static QName _WS100504ConfirmAppUserResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100504_confirmAppUserResponse");
    private final static QName _WS100505CreateAppUser_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100505_createAppUser");
    private final static QName _WS100505CreateAppUserResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100505_createAppUserResponse");
    private final static QName _WS100506FindAppUser_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100506_findAppUser");
    private final static QName _WS100506FindAppUserResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100506_findAppUserResponse");
    private final static QName _WS100507GetInsureeWorkHistoryInfo_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100507_getInsureeWorkHistoryInfo");
    private final static QName _WS100507GetInsureeWorkHistoryInfoResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100507_getInsureeWorkHistoryInfoResponse");
    private final static QName _WS100508GetSalaryFoundByOccupationInfo_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100508_getSalaryFoundByOccupationInfo");
    private final static QName _WS100508GetSalaryFoundByOccupationInfoResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100508_getSalaryFoundByOccupationInfoResponse");
    private final static QName _WS100509GetSalaryFoundByIndutyInfo_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100509_getSalaryFoundByIndutyInfo");
    private final static QName _WS100509GetSalaryFoundByIndutyInfoResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100509_getSalaryFoundByIndutyInfoResponse");
    private final static QName _WS100510GetSiWorkerAccountInfo_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100510_getSiWorkerAccountInfo");
    private final static QName _WS100510GetSiWorkerAccountInfoResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100510_getSiWorkerAccountInfoResponse");
    private final static QName _WS100511GetEmployerInfo_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100511_getEmployerInfo");
    private final static QName _WS100511GetEmployerInfoResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100511_getEmployerInfoResponse");
    private final static QName _WS100512CheckIsInsuredInfo_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100512_checkIsInsuredInfo");
    private final static QName _WS100512CheckIsInsuredInfoResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100512_checkIsInsuredInfoResponse");
    private final static QName _WS100513FindOrganizationInfo_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100513_findOrganizationInfo");
    private final static QName _WS100513FindOrganizationInfoResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100513_findOrganizationInfoResponse");
    private final static QName _WS100514GetEmployerNumWithDeptInfo_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100514_getEmployerNumWithDeptInfo");
    private final static QName _WS100514GetEmployerNumWithDeptInfoResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100514_getEmployerNumWithDeptInfoResponse");
    private final static QName _WS100515ForeignEmployerInfo_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100515_foreignEmployerInfo");
    private final static QName _WS100515ForeignEmployerInfoResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100515_foreignEmployerInfoResponse");
    private final static QName _WS100516GetInsuredForLastThreeMonthInfo_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100516_getInsuredForLastThreeMonthInfo");
    private final static QName _WS100516GetInsuredForLastThreeMonthInfoResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100516_getInsuredForLastThreeMonthInfoResponse");
    private final static QName _WS100517CheckMotherTimeAllInfo_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100517_checkMotherTimeAllInfo");
    private final static QName _WS100517CheckMotherTimeAllInfoResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100517_checkMotherTimeAllInfoResponse");
    private final static QName _WS100518GetPensionInformationData_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100518_getPensionInformationData");
    private final static QName _WS100518GetPensionInformationDataResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100518_getPensionInformationDataResponse");
    private final static QName _WS100519CheckChildMoney_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100519_checkChildMoney");
    private final static QName _WS100519CheckChildMoneyResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100519_checkChildMoneyResponse");
    private final static QName _WS100520CheckHouseHoldChild_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100520_checkHouseHoldChild");
    private final static QName _WS100520CheckHouseHoldChildResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100520_checkHouseHoldChildResponse");
    private final static QName _WS100521CheckHouseHoldFood_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100521_checkHouseHoldFood");
    private final static QName _WS100521CheckHouseHoldFoodResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100521_checkHouseHoldFoodResponse");
    private final static QName _WS100522CheckHouseHoldSC_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100522_checkHouseHoldSC");
    private final static QName _WS100522CheckHouseHoldSCResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100522_checkHouseHoldSCResponse");
    private final static QName _WS100523GetCampVoucherOfElderInfo_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100523_getCampVoucherOfElderInfo");
    private final static QName _WS100523GetCampVoucherOfElderInfoResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100523_getCampVoucherOfElderInfoResponse");
    private final static QName _WS100524GetDisabledPersonSupplyInfo_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100524_getDisabledPersonSupplyInfo");
    private final static QName _WS100524GetDisabledPersonSupplyInfoResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100524_getDisabledPersonSupplyInfoResponse");
    private final static QName _WS100525GetOrganizationDeptInfo_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100525_getOrganizationDeptInfo");
    private final static QName _WS100525GetOrganizationDeptInfoResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100525_getOrganizationDeptInfoResponse");
    private final static QName _WS100526ReportLog_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100526_reportLog");
    private final static QName _WS100526ReportLogResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100526_reportLogResponse");
    private final static QName _WS100527GetPaymentInfo_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100527_getPaymentInfo");
    private final static QName _WS100527GetPaymentInfoResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100527_getPaymentInfoResponse");
    private final static QName _WS100528PaymentLog_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100528_paymentLog");
    private final static QName _WS100528PaymentLogResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100528_paymentLogResponse");
    private final static QName _WS100529GetSalaryFeeList_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100529_getSalaryFeeList");
    private final static QName _WS100529GetSalaryFeeListResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100529_getSalaryFeeListResponse");
    private final static QName _WS100530OrganizationEmployeeInfo_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100530_organizationEmployeeInfo");
    private final static QName _WS100530OrganizationEmployeeInfoResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100530_organizationEmployeeInfoResponse");
    private final static QName _WS100531CheckPensionDate_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100531_checkPensionDate");
    private final static QName _WS100531CheckPensionDateResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100531_checkPensionDateResponse");
    private final static QName _WS100532CitizenLossOfAbilityToWorkInfo_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100532_citizenLossOfAbilityToWorkInfo");
    private final static QName _WS100532CitizenLossOfAbilityToWorkInfoResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100532_citizenLossOfAbilityToWorkInfoResponse");
    private final static QName _WS100533InsuredListLast3MonthByDate_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100533_insuredListLast3MonthByDate");
    private final static QName _WS100533InsuredListLast3MonthByDateResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100533_insuredListLast3MonthByDateResponse");
    private final static QName _WS100534OrganizationInfo_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100534_organizationInfo");
    private final static QName _WS100534OrganizationInfoResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100534_organizationInfoResponse");
    private final static QName _WS100535FindOrganizationForMedicalCert_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100535_findOrganizationForMedicalCert");
    private final static QName _WS100535FindOrganizationForMedicalCertResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100535_findOrganizationForMedicalCertResponse");
    private final static QName _WS100536CheckMotherEmployed_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100536_checkMotherEmployed");
    private final static QName _WS100536CheckMotherEmployedResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100536_checkMotherEmployedResponse");
    private final static QName _WS100537PregnancyChildbirthInfo_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100537_pregnancyChildbirthInfo");
    private final static QName _WS100537PregnancyChildbirthInfoResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100537_pregnancyChildbirthInfoResponse");
    private final static QName _WS100538DisabilityMedicalCertInfo_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100538_disabilityMedicalCertInfo");
    private final static QName _WS100538DisabilityMedicalCertInfoResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100538_disabilityMedicalCertInfoResponse");
    private final static QName _WS100539PregnancyChildbirthCertInvalid_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100539_pregnancyChildbirthCertInvalid");
    private final static QName _WS100539PregnancyChildbirthCertInvalidResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100539_pregnancyChildbirthCertInvalidResponse");
    private final static QName _WS100540DisabilityMedicalCertInvalid_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100540_disabilityMedicalCertInvalid");
    private final static QName _WS100540DisabilityMedicalCertInvalidResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100540_disabilityMedicalCertInvalidResponse");
    private final static QName _WS100541HealthInsuranceInfo_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100541_healthInsuranceInfo");
    private final static QName _WS100541HealthInsuranceInfoResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100541_healthInsuranceInfoResponse");
    private final static QName _WS100542SocialInsuranceInfo_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100542_socialInsuranceInfo");
    private final static QName _WS100542SocialInsuranceInfoResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100542_socialInsuranceInfoResponse");
    private final static QName _WS100543RetirementListInfo_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100543_retirementListInfo");
    private final static QName _WS100543RetirementListInfoResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100543_retirementListInfoResponse");
    private final static QName _WS100544GetInsuredForLastThreeMonthOccupationInfo_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100544_getInsuredForLastThreeMonthOccupationInfo");
    private final static QName _WS100544GetInsuredForLastThreeMonthOccupationInfoResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100544_getInsuredForLastThreeMonthOccupationInfoResponse");
    private final static QName _WS100545MedicalCertCheck_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100545_medicalCertCheck");
    private final static QName _WS100545MedicalCertCheckResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100545_medicalCertCheckResponse");
    private final static QName _WS100546DisabilityMedicalCertEdit_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100546_disabilityMedicalCertEdit");
    private final static QName _WS100546DisabilityMedicalCertEditResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100546_disabilityMedicalCertEditResponse");
    private final static QName _WS100547PregnancyChildbirthEdit_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100547_pregnancyChildbirthEdit");
    private final static QName _WS100547PregnancyChildbirthEditResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100547_pregnancyChildbirthEditResponse");
    private final static QName _WS100548DisabilityMedicalCertList_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100548_disabilityMedicalCertList");
    private final static QName _WS100548DisabilityMedicalCertListResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100548_disabilityMedicalCertListResponse");
    private final static QName _WS100549DisabilityBenefitsApply_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100549_disabilityBenefitsApply");
    private final static QName _WS100549DisabilityBenefitsApplyResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100549_disabilityBenefitsApplyResponse");
    private final static QName _WS100550PregnancyChildbirthCertList_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100550_pregnancyChildbirthCertList");
    private final static QName _WS100550PregnancyChildbirthCertListResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100550_pregnancyChildbirthCertListResponse");
    private final static QName _WS100551PregnancyBenefitsApply_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100551_pregnancyBenefitsApply");
    private final static QName _WS100551PregnancyBenefitsApplyResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100551_pregnancyBenefitsApplyResponse");
    private final static QName _WS100552UnemploymentBenefitsList_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100552_unemploymentBenefitsList");
    private final static QName _WS100552UnemploymentBenefitsListResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100552_unemploymentBenefitsListResponse");
    private final static QName _WS100553UnemploymentBenefitsApply_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100553_unemploymentBenefitsApply");
    private final static QName _WS100553UnemploymentBenefitsApplyResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100553_unemploymentBenefitsApplyResponse");
    private final static QName _WS100554UnemploymentBenefitsCount_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100554_unemploymentBenefitsCount");
    private final static QName _WS100554UnemploymentBenefitsCountResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100554_unemploymentBenefitsCountResponse");
    private final static QName _WS100555GetBankList_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100555_getBankList");
    private final static QName _WS100555GetBankListResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100555_getBankListResponse");
    private final static QName _WS100556GetHealthInsuranceFee_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100556_getHealthInsuranceFee");
    private final static QName _WS100556GetHealthInsuranceFeeResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100556_getHealthInsuranceFeeResponse");
    private final static QName _WS100557CitizenInsuranceInfoForStatistic_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100557_citizenInsuranceInfoForStatistic");
    private final static QName _WS100557CitizenInsuranceInfoForStatisticResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100557_citizenInsuranceInfoForStatisticResponse");
    private final static QName _WS100558OrgInfoForStatistic_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100558_orgInfoForStatistic");
    private final static QName _WS100558OrgInfoForStatisticResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100558_orgInfoForStatisticResponse");
    private final static QName _WS100559RefundHalfBankList_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100559_refundHalfBankList");
    private final static QName _WS100559RefundHalfBankListResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100559_refundHalfBankListResponse");
    private final static QName _WS100560RefundHalfAccountList_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100560_refundHalfAccountList");
    private final static QName _WS100560RefundHalfAccountListResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100560_refundHalfAccountListResponse");
    private final static QName _WS100561RefundHalfCreateAccount_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100561_refundHalfCreateAccount");
    private final static QName _WS100561RefundHalfCreateAccountResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100561_refundHalfCreateAccountResponse");
    private final static QName _WS100562RefundHalfUpdateAccount_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100562_refundHalfUpdateAccount");
    private final static QName _WS100562RefundHalfUpdateAccountResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100562_refundHalfUpdateAccountResponse");
    private final static QName _WS100563FuneralAllowanceInfo_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100563_funeralAllowanceInfo");
    private final static QName _WS100563FuneralAllowanceInfoResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100563_funeralAllowanceInfoResponse");
    private final static QName _WS100564PensionDocumentInfo_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100564_pensionDocumentInfo");
    private final static QName _WS100564PensionDocumentInfoResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100564_pensionDocumentInfoResponse");
    private final static QName _WS100565GetCitizenSalaryInfoEng_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100565_getCitizenSalaryInfoEng");
    private final static QName _WS100565GetCitizenSalaryInfoEngResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100565_getCitizenSalaryInfoEngResponse");
    private final static QName _WS100566DisabilityPensionDocumentInfo_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100566_disabilityPensionDocumentInfo");
    private final static QName _WS100566DisabilityPensionDocumentInfoResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100566_disabilityPensionDocumentInfoResponse");
    private final static QName _WS100567LostCaregiverPensionDocumentInfo_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100567_lostCaregiverPensionDocumentInfo");
    private final static QName _WS100567LostCaregiverPensionDocumentInfoResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100567_lostCaregiverPensionDocumentInfoResponse");
    private final static QName _WS100568PensionDocumentEngInfo_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100568_pensionDocumentEngInfo");
    private final static QName _WS100568PensionDocumentEngInfoResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100568_pensionDocumentEngInfoResponse");
    private final static QName _WS100569DisabilityPensionDocumentEngInfo_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100569_disabilityPensionDocumentEngInfo");
    private final static QName _WS100569DisabilityPensionDocumentEngInfoResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100569_disabilityPensionDocumentEngInfoResponse");
    private final static QName _WS100570LostCaregiverPensionDocumentEngInfo_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100570_lostCaregiverPensionDocumentEngInfo");
    private final static QName _WS100570LostCaregiverPensionDocumentEngInfoResponse_QNAME = new QName("http://insurance.xyp.gov.mn/", "WS100570_lostCaregiverPensionDocumentEngInfoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mn.gov.itc.emongolia.data.XypInsurance
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WS100501GetCitizenSalaryInfo }
     * 
     */
    public WS100501GetCitizenSalaryInfo createWS100501GetCitizenSalaryInfo() {
        return new WS100501GetCitizenSalaryInfo();
    }

    /**
     * Create an instance of {@link WS100501GetCitizenSalaryInfoResponse }
     * 
     */
    public WS100501GetCitizenSalaryInfoResponse createWS100501GetCitizenSalaryInfoResponse() {
        return new WS100501GetCitizenSalaryInfoResponse();
    }

    /**
     * Create an instance of {@link WS100502GetCitizenPensionInquiry }
     * 
     */
    public WS100502GetCitizenPensionInquiry createWS100502GetCitizenPensionInquiry() {
        return new WS100502GetCitizenPensionInquiry();
    }

    /**
     * Create an instance of {@link WS100502GetCitizenPensionInquiryResponse }
     * 
     */
    public WS100502GetCitizenPensionInquiryResponse createWS100502GetCitizenPensionInquiryResponse() {
        return new WS100502GetCitizenPensionInquiryResponse();
    }

    /**
     * Create an instance of {@link WS100503GetCheckMotherTimeInfo }
     * 
     */
    public WS100503GetCheckMotherTimeInfo createWS100503GetCheckMotherTimeInfo() {
        return new WS100503GetCheckMotherTimeInfo();
    }

    /**
     * Create an instance of {@link WS100503GetCheckMotherTimeInfoResponse }
     * 
     */
    public WS100503GetCheckMotherTimeInfoResponse createWS100503GetCheckMotherTimeInfoResponse() {
        return new WS100503GetCheckMotherTimeInfoResponse();
    }

    /**
     * Create an instance of {@link WS100504ConfirmAppUser }
     * 
     */
    public WS100504ConfirmAppUser createWS100504ConfirmAppUser() {
        return new WS100504ConfirmAppUser();
    }

    /**
     * Create an instance of {@link WS100504ConfirmAppUserResponse }
     * 
     */
    public WS100504ConfirmAppUserResponse createWS100504ConfirmAppUserResponse() {
        return new WS100504ConfirmAppUserResponse();
    }

    /**
     * Create an instance of {@link WS100505CreateAppUser }
     * 
     */
    public WS100505CreateAppUser createWS100505CreateAppUser() {
        return new WS100505CreateAppUser();
    }

    /**
     * Create an instance of {@link WS100505CreateAppUserResponse }
     * 
     */
    public WS100505CreateAppUserResponse createWS100505CreateAppUserResponse() {
        return new WS100505CreateAppUserResponse();
    }

    /**
     * Create an instance of {@link WS100506FindAppUser }
     * 
     */
    public WS100506FindAppUser createWS100506FindAppUser() {
        return new WS100506FindAppUser();
    }

    /**
     * Create an instance of {@link WS100506FindAppUserResponse }
     * 
     */
    public WS100506FindAppUserResponse createWS100506FindAppUserResponse() {
        return new WS100506FindAppUserResponse();
    }

    /**
     * Create an instance of {@link WS100507GetInsureeWorkHistoryInfo }
     * 
     */
    public WS100507GetInsureeWorkHistoryInfo createWS100507GetInsureeWorkHistoryInfo() {
        return new WS100507GetInsureeWorkHistoryInfo();
    }

    /**
     * Create an instance of {@link WS100507GetInsureeWorkHistoryInfoResponse }
     * 
     */
    public WS100507GetInsureeWorkHistoryInfoResponse createWS100507GetInsureeWorkHistoryInfoResponse() {
        return new WS100507GetInsureeWorkHistoryInfoResponse();
    }

    /**
     * Create an instance of {@link WS100508GetSalaryFoundByOccupationInfo }
     * 
     */
    public WS100508GetSalaryFoundByOccupationInfo createWS100508GetSalaryFoundByOccupationInfo() {
        return new WS100508GetSalaryFoundByOccupationInfo();
    }

    /**
     * Create an instance of {@link WS100508GetSalaryFoundByOccupationInfoResponse }
     * 
     */
    public WS100508GetSalaryFoundByOccupationInfoResponse createWS100508GetSalaryFoundByOccupationInfoResponse() {
        return new WS100508GetSalaryFoundByOccupationInfoResponse();
    }

    /**
     * Create an instance of {@link WS100509GetSalaryFoundByIndutyInfo }
     * 
     */
    public WS100509GetSalaryFoundByIndutyInfo createWS100509GetSalaryFoundByIndutyInfo() {
        return new WS100509GetSalaryFoundByIndutyInfo();
    }

    /**
     * Create an instance of {@link WS100509GetSalaryFoundByIndutyInfoResponse }
     * 
     */
    public WS100509GetSalaryFoundByIndutyInfoResponse createWS100509GetSalaryFoundByIndutyInfoResponse() {
        return new WS100509GetSalaryFoundByIndutyInfoResponse();
    }

    /**
     * Create an instance of {@link WS100510GetSiWorkerAccountInfo }
     * 
     */
    public WS100510GetSiWorkerAccountInfo createWS100510GetSiWorkerAccountInfo() {
        return new WS100510GetSiWorkerAccountInfo();
    }

    /**
     * Create an instance of {@link WS100510GetSiWorkerAccountInfoResponse }
     * 
     */
    public WS100510GetSiWorkerAccountInfoResponse createWS100510GetSiWorkerAccountInfoResponse() {
        return new WS100510GetSiWorkerAccountInfoResponse();
    }

    /**
     * Create an instance of {@link WS100511GetEmployerInfo }
     * 
     */
    public WS100511GetEmployerInfo createWS100511GetEmployerInfo() {
        return new WS100511GetEmployerInfo();
    }

    /**
     * Create an instance of {@link WS100511GetEmployerInfoResponse }
     * 
     */
    public WS100511GetEmployerInfoResponse createWS100511GetEmployerInfoResponse() {
        return new WS100511GetEmployerInfoResponse();
    }

    /**
     * Create an instance of {@link WS100512CheckIsInsuredInfo }
     * 
     */
    public WS100512CheckIsInsuredInfo createWS100512CheckIsInsuredInfo() {
        return new WS100512CheckIsInsuredInfo();
    }

    /**
     * Create an instance of {@link WS100512CheckIsInsuredInfoResponse }
     * 
     */
    public WS100512CheckIsInsuredInfoResponse createWS100512CheckIsInsuredInfoResponse() {
        return new WS100512CheckIsInsuredInfoResponse();
    }

    /**
     * Create an instance of {@link WS100513FindOrganizationInfo }
     * 
     */
    public WS100513FindOrganizationInfo createWS100513FindOrganizationInfo() {
        return new WS100513FindOrganizationInfo();
    }

    /**
     * Create an instance of {@link WS100513FindOrganizationInfoResponse }
     * 
     */
    public WS100513FindOrganizationInfoResponse createWS100513FindOrganizationInfoResponse() {
        return new WS100513FindOrganizationInfoResponse();
    }

    /**
     * Create an instance of {@link WS100514GetEmployerNumWithDeptInfo }
     * 
     */
    public WS100514GetEmployerNumWithDeptInfo createWS100514GetEmployerNumWithDeptInfo() {
        return new WS100514GetEmployerNumWithDeptInfo();
    }

    /**
     * Create an instance of {@link WS100514GetEmployerNumWithDeptInfoResponse }
     * 
     */
    public WS100514GetEmployerNumWithDeptInfoResponse createWS100514GetEmployerNumWithDeptInfoResponse() {
        return new WS100514GetEmployerNumWithDeptInfoResponse();
    }

    /**
     * Create an instance of {@link WS100515ForeignEmployerInfo }
     * 
     */
    public WS100515ForeignEmployerInfo createWS100515ForeignEmployerInfo() {
        return new WS100515ForeignEmployerInfo();
    }

    /**
     * Create an instance of {@link WS100515ForeignEmployerInfoResponse }
     * 
     */
    public WS100515ForeignEmployerInfoResponse createWS100515ForeignEmployerInfoResponse() {
        return new WS100515ForeignEmployerInfoResponse();
    }

    /**
     * Create an instance of {@link WS100516GetInsuredForLastThreeMonthInfo }
     * 
     */
    public WS100516GetInsuredForLastThreeMonthInfo createWS100516GetInsuredForLastThreeMonthInfo() {
        return new WS100516GetInsuredForLastThreeMonthInfo();
    }

    /**
     * Create an instance of {@link WS100516GetInsuredForLastThreeMonthInfoResponse }
     * 
     */
    public WS100516GetInsuredForLastThreeMonthInfoResponse createWS100516GetInsuredForLastThreeMonthInfoResponse() {
        return new WS100516GetInsuredForLastThreeMonthInfoResponse();
    }

    /**
     * Create an instance of {@link WS100517CheckMotherTimeAllInfo }
     * 
     */
    public WS100517CheckMotherTimeAllInfo createWS100517CheckMotherTimeAllInfo() {
        return new WS100517CheckMotherTimeAllInfo();
    }

    /**
     * Create an instance of {@link WS100517CheckMotherTimeAllInfoResponse }
     * 
     */
    public WS100517CheckMotherTimeAllInfoResponse createWS100517CheckMotherTimeAllInfoResponse() {
        return new WS100517CheckMotherTimeAllInfoResponse();
    }

    /**
     * Create an instance of {@link WS100518GetPensionInformationData }
     * 
     */
    public WS100518GetPensionInformationData createWS100518GetPensionInformationData() {
        return new WS100518GetPensionInformationData();
    }

    /**
     * Create an instance of {@link WS100518GetPensionInformationDataResponse }
     * 
     */
    public WS100518GetPensionInformationDataResponse createWS100518GetPensionInformationDataResponse() {
        return new WS100518GetPensionInformationDataResponse();
    }

    /**
     * Create an instance of {@link WS100519CheckChildMoney }
     * 
     */
    public WS100519CheckChildMoney createWS100519CheckChildMoney() {
        return new WS100519CheckChildMoney();
    }

    /**
     * Create an instance of {@link WS100519CheckChildMoneyResponse }
     * 
     */
    public WS100519CheckChildMoneyResponse createWS100519CheckChildMoneyResponse() {
        return new WS100519CheckChildMoneyResponse();
    }

    /**
     * Create an instance of {@link WS100520CheckHouseHoldChild }
     * 
     */
    public WS100520CheckHouseHoldChild createWS100520CheckHouseHoldChild() {
        return new WS100520CheckHouseHoldChild();
    }

    /**
     * Create an instance of {@link WS100520CheckHouseHoldChildResponse }
     * 
     */
    public WS100520CheckHouseHoldChildResponse createWS100520CheckHouseHoldChildResponse() {
        return new WS100520CheckHouseHoldChildResponse();
    }

    /**
     * Create an instance of {@link WS100521CheckHouseHoldFood }
     * 
     */
    public WS100521CheckHouseHoldFood createWS100521CheckHouseHoldFood() {
        return new WS100521CheckHouseHoldFood();
    }

    /**
     * Create an instance of {@link WS100521CheckHouseHoldFoodResponse }
     * 
     */
    public WS100521CheckHouseHoldFoodResponse createWS100521CheckHouseHoldFoodResponse() {
        return new WS100521CheckHouseHoldFoodResponse();
    }

    /**
     * Create an instance of {@link WS100522CheckHouseHoldSC }
     * 
     */
    public WS100522CheckHouseHoldSC createWS100522CheckHouseHoldSC() {
        return new WS100522CheckHouseHoldSC();
    }

    /**
     * Create an instance of {@link WS100522CheckHouseHoldSCResponse }
     * 
     */
    public WS100522CheckHouseHoldSCResponse createWS100522CheckHouseHoldSCResponse() {
        return new WS100522CheckHouseHoldSCResponse();
    }

    /**
     * Create an instance of {@link WS100523GetCampVoucherOfElderInfo }
     * 
     */
    public WS100523GetCampVoucherOfElderInfo createWS100523GetCampVoucherOfElderInfo() {
        return new WS100523GetCampVoucherOfElderInfo();
    }

    /**
     * Create an instance of {@link WS100523GetCampVoucherOfElderInfoResponse }
     * 
     */
    public WS100523GetCampVoucherOfElderInfoResponse createWS100523GetCampVoucherOfElderInfoResponse() {
        return new WS100523GetCampVoucherOfElderInfoResponse();
    }

    /**
     * Create an instance of {@link WS100524GetDisabledPersonSupplyInfo }
     * 
     */
    public WS100524GetDisabledPersonSupplyInfo createWS100524GetDisabledPersonSupplyInfo() {
        return new WS100524GetDisabledPersonSupplyInfo();
    }

    /**
     * Create an instance of {@link WS100524GetDisabledPersonSupplyInfoResponse }
     * 
     */
    public WS100524GetDisabledPersonSupplyInfoResponse createWS100524GetDisabledPersonSupplyInfoResponse() {
        return new WS100524GetDisabledPersonSupplyInfoResponse();
    }

    /**
     * Create an instance of {@link WS100525GetOrganizationDeptInfo }
     * 
     */
    public WS100525GetOrganizationDeptInfo createWS100525GetOrganizationDeptInfo() {
        return new WS100525GetOrganizationDeptInfo();
    }

    /**
     * Create an instance of {@link WS100525GetOrganizationDeptInfoResponse }
     * 
     */
    public WS100525GetOrganizationDeptInfoResponse createWS100525GetOrganizationDeptInfoResponse() {
        return new WS100525GetOrganizationDeptInfoResponse();
    }

    /**
     * Create an instance of {@link WS100526ReportLog }
     * 
     */
    public WS100526ReportLog createWS100526ReportLog() {
        return new WS100526ReportLog();
    }

    /**
     * Create an instance of {@link WS100526ReportLogResponse }
     * 
     */
    public WS100526ReportLogResponse createWS100526ReportLogResponse() {
        return new WS100526ReportLogResponse();
    }

    /**
     * Create an instance of {@link WS100527GetPaymentInfo }
     * 
     */
    public WS100527GetPaymentInfo createWS100527GetPaymentInfo() {
        return new WS100527GetPaymentInfo();
    }

    /**
     * Create an instance of {@link WS100527GetPaymentInfoResponse }
     * 
     */
    public WS100527GetPaymentInfoResponse createWS100527GetPaymentInfoResponse() {
        return new WS100527GetPaymentInfoResponse();
    }

    /**
     * Create an instance of {@link WS100528PaymentLog }
     * 
     */
    public WS100528PaymentLog createWS100528PaymentLog() {
        return new WS100528PaymentLog();
    }

    /**
     * Create an instance of {@link WS100528PaymentLogResponse }
     * 
     */
    public WS100528PaymentLogResponse createWS100528PaymentLogResponse() {
        return new WS100528PaymentLogResponse();
    }

    /**
     * Create an instance of {@link WS100529GetSalaryFeeList }
     * 
     */
    public WS100529GetSalaryFeeList createWS100529GetSalaryFeeList() {
        return new WS100529GetSalaryFeeList();
    }

    /**
     * Create an instance of {@link WS100529GetSalaryFeeListResponse }
     * 
     */
    public WS100529GetSalaryFeeListResponse createWS100529GetSalaryFeeListResponse() {
        return new WS100529GetSalaryFeeListResponse();
    }

    /**
     * Create an instance of {@link WS100530OrganizationEmployeeInfo }
     * 
     */
    public WS100530OrganizationEmployeeInfo createWS100530OrganizationEmployeeInfo() {
        return new WS100530OrganizationEmployeeInfo();
    }

    /**
     * Create an instance of {@link WS100530OrganizationEmployeeInfoResponse }
     * 
     */
    public WS100530OrganizationEmployeeInfoResponse createWS100530OrganizationEmployeeInfoResponse() {
        return new WS100530OrganizationEmployeeInfoResponse();
    }

    /**
     * Create an instance of {@link WS100531CheckPensionDate }
     * 
     */
    public WS100531CheckPensionDate createWS100531CheckPensionDate() {
        return new WS100531CheckPensionDate();
    }

    /**
     * Create an instance of {@link WS100531CheckPensionDateResponse }
     * 
     */
    public WS100531CheckPensionDateResponse createWS100531CheckPensionDateResponse() {
        return new WS100531CheckPensionDateResponse();
    }

    /**
     * Create an instance of {@link WS100532CitizenLossOfAbilityToWorkInfo }
     * 
     */
    public WS100532CitizenLossOfAbilityToWorkInfo createWS100532CitizenLossOfAbilityToWorkInfo() {
        return new WS100532CitizenLossOfAbilityToWorkInfo();
    }

    /**
     * Create an instance of {@link WS100532CitizenLossOfAbilityToWorkInfoResponse }
     * 
     */
    public WS100532CitizenLossOfAbilityToWorkInfoResponse createWS100532CitizenLossOfAbilityToWorkInfoResponse() {
        return new WS100532CitizenLossOfAbilityToWorkInfoResponse();
    }

    /**
     * Create an instance of {@link WS100533InsuredListLast3MonthByDate }
     * 
     */
    public WS100533InsuredListLast3MonthByDate createWS100533InsuredListLast3MonthByDate() {
        return new WS100533InsuredListLast3MonthByDate();
    }

    /**
     * Create an instance of {@link WS100533InsuredListLast3MonthByDateResponse }
     * 
     */
    public WS100533InsuredListLast3MonthByDateResponse createWS100533InsuredListLast3MonthByDateResponse() {
        return new WS100533InsuredListLast3MonthByDateResponse();
    }

    /**
     * Create an instance of {@link WS100534OrganizationInfo }
     * 
     */
    public WS100534OrganizationInfo createWS100534OrganizationInfo() {
        return new WS100534OrganizationInfo();
    }

    /**
     * Create an instance of {@link WS100534OrganizationInfoResponse }
     * 
     */
    public WS100534OrganizationInfoResponse createWS100534OrganizationInfoResponse() {
        return new WS100534OrganizationInfoResponse();
    }

    /**
     * Create an instance of {@link WS100535FindOrganizationForMedicalCert }
     * 
     */
    public WS100535FindOrganizationForMedicalCert createWS100535FindOrganizationForMedicalCert() {
        return new WS100535FindOrganizationForMedicalCert();
    }

    /**
     * Create an instance of {@link WS100535FindOrganizationForMedicalCertResponse }
     * 
     */
    public WS100535FindOrganizationForMedicalCertResponse createWS100535FindOrganizationForMedicalCertResponse() {
        return new WS100535FindOrganizationForMedicalCertResponse();
    }

    /**
     * Create an instance of {@link WS100536CheckMotherEmployed }
     * 
     */
    public WS100536CheckMotherEmployed createWS100536CheckMotherEmployed() {
        return new WS100536CheckMotherEmployed();
    }

    /**
     * Create an instance of {@link WS100536CheckMotherEmployedResponse }
     * 
     */
    public WS100536CheckMotherEmployedResponse createWS100536CheckMotherEmployedResponse() {
        return new WS100536CheckMotherEmployedResponse();
    }

    /**
     * Create an instance of {@link WS100537PregnancyChildbirthInfo }
     * 
     */
    public WS100537PregnancyChildbirthInfo createWS100537PregnancyChildbirthInfo() {
        return new WS100537PregnancyChildbirthInfo();
    }

    /**
     * Create an instance of {@link WS100537PregnancyChildbirthInfoResponse }
     * 
     */
    public WS100537PregnancyChildbirthInfoResponse createWS100537PregnancyChildbirthInfoResponse() {
        return new WS100537PregnancyChildbirthInfoResponse();
    }

    /**
     * Create an instance of {@link WS100538DisabilityMedicalCertInfo }
     * 
     */
    public WS100538DisabilityMedicalCertInfo createWS100538DisabilityMedicalCertInfo() {
        return new WS100538DisabilityMedicalCertInfo();
    }

    /**
     * Create an instance of {@link WS100538DisabilityMedicalCertInfoResponse }
     * 
     */
    public WS100538DisabilityMedicalCertInfoResponse createWS100538DisabilityMedicalCertInfoResponse() {
        return new WS100538DisabilityMedicalCertInfoResponse();
    }

    /**
     * Create an instance of {@link WS100539PregnancyChildbirthCertInvalid }
     * 
     */
    public WS100539PregnancyChildbirthCertInvalid createWS100539PregnancyChildbirthCertInvalid() {
        return new WS100539PregnancyChildbirthCertInvalid();
    }

    /**
     * Create an instance of {@link WS100539PregnancyChildbirthCertInvalidResponse }
     * 
     */
    public WS100539PregnancyChildbirthCertInvalidResponse createWS100539PregnancyChildbirthCertInvalidResponse() {
        return new WS100539PregnancyChildbirthCertInvalidResponse();
    }

    /**
     * Create an instance of {@link WS100540DisabilityMedicalCertInvalid }
     * 
     */
    public WS100540DisabilityMedicalCertInvalid createWS100540DisabilityMedicalCertInvalid() {
        return new WS100540DisabilityMedicalCertInvalid();
    }

    /**
     * Create an instance of {@link WS100540DisabilityMedicalCertInvalidResponse }
     * 
     */
    public WS100540DisabilityMedicalCertInvalidResponse createWS100540DisabilityMedicalCertInvalidResponse() {
        return new WS100540DisabilityMedicalCertInvalidResponse();
    }

    /**
     * Create an instance of {@link WS100541HealthInsuranceInfo }
     * 
     */
    public WS100541HealthInsuranceInfo createWS100541HealthInsuranceInfo() {
        return new WS100541HealthInsuranceInfo();
    }

    /**
     * Create an instance of {@link WS100541HealthInsuranceInfoResponse }
     * 
     */
    public WS100541HealthInsuranceInfoResponse createWS100541HealthInsuranceInfoResponse() {
        return new WS100541HealthInsuranceInfoResponse();
    }

    /**
     * Create an instance of {@link WS100542SocialInsuranceInfo }
     * 
     */
    public WS100542SocialInsuranceInfo createWS100542SocialInsuranceInfo() {
        return new WS100542SocialInsuranceInfo();
    }

    /**
     * Create an instance of {@link WS100542SocialInsuranceInfoResponse }
     * 
     */
    public WS100542SocialInsuranceInfoResponse createWS100542SocialInsuranceInfoResponse() {
        return new WS100542SocialInsuranceInfoResponse();
    }

    /**
     * Create an instance of {@link WS100543RetirementListInfo }
     * 
     */
    public WS100543RetirementListInfo createWS100543RetirementListInfo() {
        return new WS100543RetirementListInfo();
    }

    /**
     * Create an instance of {@link WS100543RetirementListInfoResponse }
     * 
     */
    public WS100543RetirementListInfoResponse createWS100543RetirementListInfoResponse() {
        return new WS100543RetirementListInfoResponse();
    }

    /**
     * Create an instance of {@link WS100544GetInsuredForLastThreeMonthOccupationInfo }
     * 
     */
    public WS100544GetInsuredForLastThreeMonthOccupationInfo createWS100544GetInsuredForLastThreeMonthOccupationInfo() {
        return new WS100544GetInsuredForLastThreeMonthOccupationInfo();
    }

    /**
     * Create an instance of {@link WS100544GetInsuredForLastThreeMonthOccupationInfoResponse }
     * 
     */
    public WS100544GetInsuredForLastThreeMonthOccupationInfoResponse createWS100544GetInsuredForLastThreeMonthOccupationInfoResponse() {
        return new WS100544GetInsuredForLastThreeMonthOccupationInfoResponse();
    }

    /**
     * Create an instance of {@link WS100545MedicalCertCheck }
     * 
     */
    public WS100545MedicalCertCheck createWS100545MedicalCertCheck() {
        return new WS100545MedicalCertCheck();
    }

    /**
     * Create an instance of {@link WS100545MedicalCertCheckResponse }
     * 
     */
    public WS100545MedicalCertCheckResponse createWS100545MedicalCertCheckResponse() {
        return new WS100545MedicalCertCheckResponse();
    }

    /**
     * Create an instance of {@link WS100546DisabilityMedicalCertEdit }
     * 
     */
    public WS100546DisabilityMedicalCertEdit createWS100546DisabilityMedicalCertEdit() {
        return new WS100546DisabilityMedicalCertEdit();
    }

    /**
     * Create an instance of {@link WS100546DisabilityMedicalCertEditResponse }
     * 
     */
    public WS100546DisabilityMedicalCertEditResponse createWS100546DisabilityMedicalCertEditResponse() {
        return new WS100546DisabilityMedicalCertEditResponse();
    }

    /**
     * Create an instance of {@link WS100547PregnancyChildbirthEdit }
     * 
     */
    public WS100547PregnancyChildbirthEdit createWS100547PregnancyChildbirthEdit() {
        return new WS100547PregnancyChildbirthEdit();
    }

    /**
     * Create an instance of {@link WS100547PregnancyChildbirthEditResponse }
     * 
     */
    public WS100547PregnancyChildbirthEditResponse createWS100547PregnancyChildbirthEditResponse() {
        return new WS100547PregnancyChildbirthEditResponse();
    }

    /**
     * Create an instance of {@link WS100548DisabilityMedicalCertList }
     * 
     */
    public WS100548DisabilityMedicalCertList createWS100548DisabilityMedicalCertList() {
        return new WS100548DisabilityMedicalCertList();
    }

    /**
     * Create an instance of {@link WS100548DisabilityMedicalCertListResponse }
     * 
     */
    public WS100548DisabilityMedicalCertListResponse createWS100548DisabilityMedicalCertListResponse() {
        return new WS100548DisabilityMedicalCertListResponse();
    }

    /**
     * Create an instance of {@link WS100549DisabilityBenefitsApply }
     * 
     */
    public WS100549DisabilityBenefitsApply createWS100549DisabilityBenefitsApply() {
        return new WS100549DisabilityBenefitsApply();
    }

    /**
     * Create an instance of {@link WS100549DisabilityBenefitsApplyResponse }
     * 
     */
    public WS100549DisabilityBenefitsApplyResponse createWS100549DisabilityBenefitsApplyResponse() {
        return new WS100549DisabilityBenefitsApplyResponse();
    }

    /**
     * Create an instance of {@link WS100550PregnancyChildbirthCertList }
     * 
     */
    public WS100550PregnancyChildbirthCertList createWS100550PregnancyChildbirthCertList() {
        return new WS100550PregnancyChildbirthCertList();
    }

    /**
     * Create an instance of {@link WS100550PregnancyChildbirthCertListResponse }
     * 
     */
    public WS100550PregnancyChildbirthCertListResponse createWS100550PregnancyChildbirthCertListResponse() {
        return new WS100550PregnancyChildbirthCertListResponse();
    }

    /**
     * Create an instance of {@link WS100551PregnancyBenefitsApply }
     * 
     */
    public WS100551PregnancyBenefitsApply createWS100551PregnancyBenefitsApply() {
        return new WS100551PregnancyBenefitsApply();
    }

    /**
     * Create an instance of {@link WS100551PregnancyBenefitsApplyResponse }
     * 
     */
    public WS100551PregnancyBenefitsApplyResponse createWS100551PregnancyBenefitsApplyResponse() {
        return new WS100551PregnancyBenefitsApplyResponse();
    }

    /**
     * Create an instance of {@link WS100552UnemploymentBenefitsList }
     * 
     */
    public WS100552UnemploymentBenefitsList createWS100552UnemploymentBenefitsList() {
        return new WS100552UnemploymentBenefitsList();
    }

    /**
     * Create an instance of {@link WS100552UnemploymentBenefitsListResponse }
     * 
     */
    public WS100552UnemploymentBenefitsListResponse createWS100552UnemploymentBenefitsListResponse() {
        return new WS100552UnemploymentBenefitsListResponse();
    }

    /**
     * Create an instance of {@link WS100553UnemploymentBenefitsApply }
     * 
     */
    public WS100553UnemploymentBenefitsApply createWS100553UnemploymentBenefitsApply() {
        return new WS100553UnemploymentBenefitsApply();
    }

    /**
     * Create an instance of {@link WS100553UnemploymentBenefitsApplyResponse }
     * 
     */
    public WS100553UnemploymentBenefitsApplyResponse createWS100553UnemploymentBenefitsApplyResponse() {
        return new WS100553UnemploymentBenefitsApplyResponse();
    }

    /**
     * Create an instance of {@link WS100554UnemploymentBenefitsCount }
     * 
     */
    public WS100554UnemploymentBenefitsCount createWS100554UnemploymentBenefitsCount() {
        return new WS100554UnemploymentBenefitsCount();
    }

    /**
     * Create an instance of {@link WS100554UnemploymentBenefitsCountResponse }
     * 
     */
    public WS100554UnemploymentBenefitsCountResponse createWS100554UnemploymentBenefitsCountResponse() {
        return new WS100554UnemploymentBenefitsCountResponse();
    }

    /**
     * Create an instance of {@link WS100555GetBankList }
     * 
     */
    public WS100555GetBankList createWS100555GetBankList() {
        return new WS100555GetBankList();
    }

    /**
     * Create an instance of {@link WS100555GetBankListResponse }
     * 
     */
    public WS100555GetBankListResponse createWS100555GetBankListResponse() {
        return new WS100555GetBankListResponse();
    }

    /**
     * Create an instance of {@link WS100556GetHealthInsuranceFee }
     * 
     */
    public WS100556GetHealthInsuranceFee createWS100556GetHealthInsuranceFee() {
        return new WS100556GetHealthInsuranceFee();
    }

    /**
     * Create an instance of {@link WS100556GetHealthInsuranceFeeResponse }
     * 
     */
    public WS100556GetHealthInsuranceFeeResponse createWS100556GetHealthInsuranceFeeResponse() {
        return new WS100556GetHealthInsuranceFeeResponse();
    }

    /**
     * Create an instance of {@link WS100557CitizenInsuranceInfoForStatistic }
     * 
     */
    public WS100557CitizenInsuranceInfoForStatistic createWS100557CitizenInsuranceInfoForStatistic() {
        return new WS100557CitizenInsuranceInfoForStatistic();
    }

    /**
     * Create an instance of {@link WS100557CitizenInsuranceInfoForStatisticResponse }
     * 
     */
    public WS100557CitizenInsuranceInfoForStatisticResponse createWS100557CitizenInsuranceInfoForStatisticResponse() {
        return new WS100557CitizenInsuranceInfoForStatisticResponse();
    }

    /**
     * Create an instance of {@link WS100558OrgInfoForStatistic }
     * 
     */
    public WS100558OrgInfoForStatistic createWS100558OrgInfoForStatistic() {
        return new WS100558OrgInfoForStatistic();
    }

    /**
     * Create an instance of {@link WS100558OrgInfoForStatisticResponse }
     * 
     */
    public WS100558OrgInfoForStatisticResponse createWS100558OrgInfoForStatisticResponse() {
        return new WS100558OrgInfoForStatisticResponse();
    }

    /**
     * Create an instance of {@link WS100559RefundHalfBankList }
     * 
     */
    public WS100559RefundHalfBankList createWS100559RefundHalfBankList() {
        return new WS100559RefundHalfBankList();
    }

    /**
     * Create an instance of {@link WS100559RefundHalfBankListResponse }
     * 
     */
    public WS100559RefundHalfBankListResponse createWS100559RefundHalfBankListResponse() {
        return new WS100559RefundHalfBankListResponse();
    }

    /**
     * Create an instance of {@link WS100560RefundHalfAccountList }
     * 
     */
    public WS100560RefundHalfAccountList createWS100560RefundHalfAccountList() {
        return new WS100560RefundHalfAccountList();
    }

    /**
     * Create an instance of {@link WS100560RefundHalfAccountListResponse }
     * 
     */
    public WS100560RefundHalfAccountListResponse createWS100560RefundHalfAccountListResponse() {
        return new WS100560RefundHalfAccountListResponse();
    }

    /**
     * Create an instance of {@link WS100561RefundHalfCreateAccount }
     * 
     */
    public WS100561RefundHalfCreateAccount createWS100561RefundHalfCreateAccount() {
        return new WS100561RefundHalfCreateAccount();
    }

    /**
     * Create an instance of {@link WS100561RefundHalfCreateAccountResponse }
     * 
     */
    public WS100561RefundHalfCreateAccountResponse createWS100561RefundHalfCreateAccountResponse() {
        return new WS100561RefundHalfCreateAccountResponse();
    }

    /**
     * Create an instance of {@link WS100562RefundHalfUpdateAccount }
     * 
     */
    public WS100562RefundHalfUpdateAccount createWS100562RefundHalfUpdateAccount() {
        return new WS100562RefundHalfUpdateAccount();
    }

    /**
     * Create an instance of {@link WS100562RefundHalfUpdateAccountResponse }
     * 
     */
    public WS100562RefundHalfUpdateAccountResponse createWS100562RefundHalfUpdateAccountResponse() {
        return new WS100562RefundHalfUpdateAccountResponse();
    }

    /**
     * Create an instance of {@link WS100563FuneralAllowanceInfo }
     * 
     */
    public WS100563FuneralAllowanceInfo createWS100563FuneralAllowanceInfo() {
        return new WS100563FuneralAllowanceInfo();
    }

    /**
     * Create an instance of {@link WS100563FuneralAllowanceInfoResponse }
     * 
     */
    public WS100563FuneralAllowanceInfoResponse createWS100563FuneralAllowanceInfoResponse() {
        return new WS100563FuneralAllowanceInfoResponse();
    }

    /**
     * Create an instance of {@link WS100564PensionDocumentInfo }
     * 
     */
    public WS100564PensionDocumentInfo createWS100564PensionDocumentInfo() {
        return new WS100564PensionDocumentInfo();
    }

    /**
     * Create an instance of {@link WS100564PensionDocumentInfoResponse }
     * 
     */
    public WS100564PensionDocumentInfoResponse createWS100564PensionDocumentInfoResponse() {
        return new WS100564PensionDocumentInfoResponse();
    }

    /**
     * Create an instance of {@link WS100565GetCitizenSalaryInfoEng }
     * 
     */
    public WS100565GetCitizenSalaryInfoEng createWS100565GetCitizenSalaryInfoEng() {
        return new WS100565GetCitizenSalaryInfoEng();
    }

    /**
     * Create an instance of {@link WS100565GetCitizenSalaryInfoEngResponse }
     * 
     */
    public WS100565GetCitizenSalaryInfoEngResponse createWS100565GetCitizenSalaryInfoEngResponse() {
        return new WS100565GetCitizenSalaryInfoEngResponse();
    }

    /**
     * Create an instance of {@link WS100566DisabilityPensionDocumentInfo }
     * 
     */
    public WS100566DisabilityPensionDocumentInfo createWS100566DisabilityPensionDocumentInfo() {
        return new WS100566DisabilityPensionDocumentInfo();
    }

    /**
     * Create an instance of {@link WS100566DisabilityPensionDocumentInfoResponse }
     * 
     */
    public WS100566DisabilityPensionDocumentInfoResponse createWS100566DisabilityPensionDocumentInfoResponse() {
        return new WS100566DisabilityPensionDocumentInfoResponse();
    }

    /**
     * Create an instance of {@link WS100567LostCaregiverPensionDocumentInfo }
     * 
     */
    public WS100567LostCaregiverPensionDocumentInfo createWS100567LostCaregiverPensionDocumentInfo() {
        return new WS100567LostCaregiverPensionDocumentInfo();
    }

    /**
     * Create an instance of {@link WS100567LostCaregiverPensionDocumentInfoResponse }
     * 
     */
    public WS100567LostCaregiverPensionDocumentInfoResponse createWS100567LostCaregiverPensionDocumentInfoResponse() {
        return new WS100567LostCaregiverPensionDocumentInfoResponse();
    }

    /**
     * Create an instance of {@link WS100568PensionDocumentEngInfo }
     * 
     */
    public WS100568PensionDocumentEngInfo createWS100568PensionDocumentEngInfo() {
        return new WS100568PensionDocumentEngInfo();
    }

    /**
     * Create an instance of {@link WS100568PensionDocumentEngInfoResponse }
     * 
     */
    public WS100568PensionDocumentEngInfoResponse createWS100568PensionDocumentEngInfoResponse() {
        return new WS100568PensionDocumentEngInfoResponse();
    }

    /**
     * Create an instance of {@link WS100569DisabilityPensionDocumentEngInfo }
     * 
     */
    public WS100569DisabilityPensionDocumentEngInfo createWS100569DisabilityPensionDocumentEngInfo() {
        return new WS100569DisabilityPensionDocumentEngInfo();
    }

    /**
     * Create an instance of {@link WS100569DisabilityPensionDocumentEngInfoResponse }
     * 
     */
    public WS100569DisabilityPensionDocumentEngInfoResponse createWS100569DisabilityPensionDocumentEngInfoResponse() {
        return new WS100569DisabilityPensionDocumentEngInfoResponse();
    }

    /**
     * Create an instance of {@link WS100570LostCaregiverPensionDocumentEngInfo }
     * 
     */
    public WS100570LostCaregiverPensionDocumentEngInfo createWS100570LostCaregiverPensionDocumentEngInfo() {
        return new WS100570LostCaregiverPensionDocumentEngInfo();
    }

    /**
     * Create an instance of {@link WS100570LostCaregiverPensionDocumentEngInfoResponse }
     * 
     */
    public WS100570LostCaregiverPensionDocumentEngInfoResponse createWS100570LostCaregiverPensionDocumentEngInfoResponse() {
        return new WS100570LostCaregiverPensionDocumentEngInfoResponse();
    }

    /**
     * Create an instance of {@link ServiceConfirmAppUserRequestData }
     * 
     */
    public ServiceConfirmAppUserRequestData createServiceConfirmAppUserRequestData() {
        return new ServiceConfirmAppUserRequestData();
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
     * Create an instance of {@link ConfirmAppUser }
     * 
     */
    public ConfirmAppUser createConfirmAppUser() {
        return new ConfirmAppUser();
    }

    /**
     * Create an instance of {@link CheckIsInsuredRequestData }
     * 
     */
    public CheckIsInsuredRequestData createCheckIsInsuredRequestData() {
        return new CheckIsInsuredRequestData();
    }

    /**
     * Create an instance of {@link PensionDocumentEngData }
     * 
     */
    public PensionDocumentEngData createPensionDocumentEngData() {
        return new PensionDocumentEngData();
    }

    /**
     * Create an instance of {@link CheckMotherTimeRequestData }
     * 
     */
    public CheckMotherTimeRequestData createCheckMotherTimeRequestData() {
        return new CheckMotherTimeRequestData();
    }

    /**
     * Create an instance of {@link CheckChildMoneyData }
     * 
     */
    public CheckChildMoneyData createCheckChildMoneyData() {
        return new CheckChildMoneyData();
    }

    /**
     * Create an instance of {@link InsuranceRequestData }
     * 
     */
    public InsuranceRequestData createInsuranceRequestData() {
        return new InsuranceRequestData();
    }

    /**
     * Create an instance of {@link SocialInsuranceData }
     * 
     */
    public SocialInsuranceData createSocialInsuranceData() {
        return new SocialInsuranceData();
    }

    /**
     * Create an instance of {@link SocialInsuranceDetailData }
     * 
     */
    public SocialInsuranceDetailData createSocialInsuranceDetailData() {
        return new SocialInsuranceDetailData();
    }

    /**
     * Create an instance of {@link PregnancyChildbirthInfoRequestData }
     * 
     */
    public PregnancyChildbirthInfoRequestData createPregnancyChildbirthInfoRequestData() {
        return new PregnancyChildbirthInfoRequestData();
    }

    /**
     * Create an instance of {@link MedicalCertNumberData }
     * 
     */
    public MedicalCertNumberData createMedicalCertNumberData() {
        return new MedicalCertNumberData();
    }

    /**
     * Create an instance of {@link WorkHistoryRequestData }
     * 
     */
    public WorkHistoryRequestData createWorkHistoryRequestData() {
        return new WorkHistoryRequestData();
    }

    /**
     * Create an instance of {@link PregnancyChildbirthCertListData }
     * 
     */
    public PregnancyChildbirthCertListData createPregnancyChildbirthCertListData() {
        return new PregnancyChildbirthCertListData();
    }

    /**
     * Create an instance of {@link PregnancyChildbirthCertListDetailData }
     * 
     */
    public PregnancyChildbirthCertListDetailData createPregnancyChildbirthCertListDetailData() {
        return new PregnancyChildbirthCertListDetailData();
    }

    /**
     * Create an instance of {@link SalaryDetail }
     * 
     */
    public SalaryDetail createSalaryDetail() {
        return new SalaryDetail();
    }

    /**
     * Create an instance of {@link ListWrapper }
     * 
     */
    public ListWrapper createListWrapper() {
        return new ListWrapper();
    }

    /**
     * Create an instance of {@link InsuredForLastThreeMonthData }
     * 
     */
    public InsuredForLastThreeMonthData createInsuredForLastThreeMonthData() {
        return new InsuredForLastThreeMonthData();
    }

    /**
     * Create an instance of {@link WorkHistoryData }
     * 
     */
    public WorkHistoryData createWorkHistoryData() {
        return new WorkHistoryData();
    }

    /**
     * Create an instance of {@link WorkHistoryDetial }
     * 
     */
    public WorkHistoryDetial createWorkHistoryDetial() {
        return new WorkHistoryDetial();
    }

    /**
     * Create an instance of {@link FindOrganizationRequest }
     * 
     */
    public FindOrganizationRequest createFindOrganizationRequest() {
        return new FindOrganizationRequest();
    }

    /**
     * Create an instance of {@link OrganizationData }
     * 
     */
    public OrganizationData createOrganizationData() {
        return new OrganizationData();
    }

    /**
     * Create an instance of {@link OrganizationDetailData }
     * 
     */
    public OrganizationDetailData createOrganizationDetailData() {
        return new OrganizationDetailData();
    }

    /**
     * Create an instance of {@link InsuranceCitizenRequestData }
     * 
     */
    public InsuranceCitizenRequestData createInsuranceCitizenRequestData() {
        return new InsuranceCitizenRequestData();
    }

    /**
     * Create an instance of {@link SalaryData }
     * 
     */
    public SalaryData createSalaryData() {
        return new SalaryData();
    }

    /**
     * Create an instance of {@link GetBankListData }
     * 
     */
    public GetBankListData createGetBankListData() {
        return new GetBankListData();
    }

    /**
     * Create an instance of {@link GetBankListDetailData }
     * 
     */
    public GetBankListDetailData createGetBankListDetailData() {
        return new GetBankListDetailData();
    }

    /**
     * Create an instance of {@link ServiceCreateAppUserRequestData }
     * 
     */
    public ServiceCreateAppUserRequestData createServiceCreateAppUserRequestData() {
        return new ServiceCreateAppUserRequestData();
    }

    /**
     * Create an instance of {@link CreateAppUser }
     * 
     */
    public CreateAppUser createCreateAppUser() {
        return new CreateAppUser();
    }

    /**
     * Create an instance of {@link PregnancyBenefitsApplyRequestData }
     * 
     */
    public PregnancyBenefitsApplyRequestData createPregnancyBenefitsApplyRequestData() {
        return new PregnancyBenefitsApplyRequestData();
    }

    /**
     * Create an instance of {@link MedicalCertCheckData }
     * 
     */
    public MedicalCertCheckData createMedicalCertCheckData() {
        return new MedicalCertCheckData();
    }

    /**
     * Create an instance of {@link GetHealthInsuranceFeeData }
     * 
     */
    public GetHealthInsuranceFeeData createGetHealthInsuranceFeeData() {
        return new GetHealthInsuranceFeeData();
    }

    /**
     * Create an instance of {@link GetHealthInsuranceFeeDetailData }
     * 
     */
    public GetHealthInsuranceFeeDetailData createGetHealthInsuranceFeeDetailData() {
        return new GetHealthInsuranceFeeDetailData();
    }

    /**
     * Create an instance of {@link PensionInformationData }
     * 
     */
    public PensionInformationData createPensionInformationData() {
        return new PensionInformationData();
    }

    /**
     * Create an instance of {@link SalaryPensionInquiryData }
     * 
     */
    public SalaryPensionInquiryData createSalaryPensionInquiryData() {
        return new SalaryPensionInquiryData();
    }

    /**
     * Create an instance of {@link UnemploymentBenefitsListData }
     * 
     */
    public UnemploymentBenefitsListData createUnemploymentBenefitsListData() {
        return new UnemploymentBenefitsListData();
    }

    /**
     * Create an instance of {@link UnemploymentBenefitsListDetailData }
     * 
     */
    public UnemploymentBenefitsListDetailData createUnemploymentBenefitsListDetailData() {
        return new UnemploymentBenefitsListDetailData();
    }

    /**
     * Create an instance of {@link ServiceFindAppUserRequestData }
     * 
     */
    public ServiceFindAppUserRequestData createServiceFindAppUserRequestData() {
        return new ServiceFindAppUserRequestData();
    }

    /**
     * Create an instance of {@link FindAppUser }
     * 
     */
    public FindAppUser createFindAppUser() {
        return new FindAppUser();
    }

    /**
     * Create an instance of {@link SiWorkerAccountData }
     * 
     */
    public SiWorkerAccountData createSiWorkerAccountData() {
        return new SiWorkerAccountData();
    }

    /**
     * Create an instance of {@link SiAccountData }
     * 
     */
    public SiAccountData createSiAccountData() {
        return new SiAccountData();
    }

    /**
     * Create an instance of {@link SiAccountUidData }
     * 
     */
    public SiAccountUidData createSiAccountUidData() {
        return new SiAccountUidData();
    }

    /**
     * Create an instance of {@link CampVoucherOfElderData }
     * 
     */
    public CampVoucherOfElderData createCampVoucherOfElderData() {
        return new CampVoucherOfElderData();
    }

    /**
     * Create an instance of {@link CampVoucherOfElderDetailData }
     * 
     */
    public CampVoucherOfElderDetailData createCampVoucherOfElderDetailData() {
        return new CampVoucherOfElderDetailData();
    }

    /**
     * Create an instance of {@link CheckPensionDateRequest }
     * 
     */
    public CheckPensionDateRequest createCheckPensionDateRequest() {
        return new CheckPensionDateRequest();
    }

    /**
     * Create an instance of {@link CheckPensionDateData }
     * 
     */
    public CheckPensionDateData createCheckPensionDateData() {
        return new CheckPensionDateData();
    }

    /**
     * Create an instance of {@link CheckPensionDateDetailData }
     * 
     */
    public CheckPensionDateDetailData createCheckPensionDateDetailData() {
        return new CheckPensionDateDetailData();
    }

    /**
     * Create an instance of {@link PensionDocumentInfoData }
     * 
     */
    public PensionDocumentInfoData createPensionDocumentInfoData() {
        return new PensionDocumentInfoData();
    }

    /**
     * Create an instance of {@link DisabilityBenefitsApplyRequestData }
     * 
     */
    public DisabilityBenefitsApplyRequestData createDisabilityBenefitsApplyRequestData() {
        return new DisabilityBenefitsApplyRequestData();
    }

    /**
     * Create an instance of {@link CheckIsInsuredData }
     * 
     */
    public CheckIsInsuredData createCheckIsInsuredData() {
        return new CheckIsInsuredData();
    }

    /**
     * Create an instance of {@link CitizenLossOfAbilityToWorkData }
     * 
     */
    public CitizenLossOfAbilityToWorkData createCitizenLossOfAbilityToWorkData() {
        return new CitizenLossOfAbilityToWorkData();
    }

    /**
     * Create an instance of {@link ReportLogRequestData }
     * 
     */
    public ReportLogRequestData createReportLogRequestData() {
        return new ReportLogRequestData();
    }

    /**
     * Create an instance of {@link ReportLogData }
     * 
     */
    public ReportLogData createReportLogData() {
        return new ReportLogData();
    }

    /**
     * Create an instance of {@link SalaryFoundByOccupationRequestData }
     * 
     */
    public SalaryFoundByOccupationRequestData createSalaryFoundByOccupationRequestData() {
        return new SalaryFoundByOccupationRequestData();
    }

    /**
     * Create an instance of {@link SalaryFoundByIndutyData }
     * 
     */
    public SalaryFoundByIndutyData createSalaryFoundByIndutyData() {
        return new SalaryFoundByIndutyData();
    }

    /**
     * Create an instance of {@link PaymentRequestData }
     * 
     */
    public PaymentRequestData createPaymentRequestData() {
        return new PaymentRequestData();
    }

    /**
     * Create an instance of {@link PaymentData }
     * 
     */
    public PaymentData createPaymentData() {
        return new PaymentData();
    }

    /**
     * Create an instance of {@link AccountData }
     * 
     */
    public AccountData createAccountData() {
        return new AccountData();
    }

    /**
     * Create an instance of {@link Contract }
     * 
     */
    public Contract createContract() {
        return new Contract();
    }

    /**
     * Create an instance of {@link Schedule }
     * 
     */
    public Schedule createSchedule() {
        return new Schedule();
    }

    /**
     * Create an instance of {@link PaymentTransaction }
     * 
     */
    public PaymentTransaction createPaymentTransaction() {
        return new PaymentTransaction();
    }

    /**
     * Create an instance of {@link MedicalCertCheckRequestData }
     * 
     */
    public MedicalCertCheckRequestData createMedicalCertCheckRequestData() {
        return new MedicalCertCheckRequestData();
    }

    /**
     * Create an instance of {@link MedicalCertInvalidRequestData }
     * 
     */
    public MedicalCertInvalidRequestData createMedicalCertInvalidRequestData() {
        return new MedicalCertInvalidRequestData();
    }

    /**
     * Create an instance of {@link MedicalCertInvalidData }
     * 
     */
    public MedicalCertInvalidData createMedicalCertInvalidData() {
        return new MedicalCertInvalidData();
    }

    /**
     * Create an instance of {@link FuneralAllowanceData }
     * 
     */
    public FuneralAllowanceData createFuneralAllowanceData() {
        return new FuneralAllowanceData();
    }

    /**
     * Create an instance of {@link CheckMotherTimeAllRequestData }
     * 
     */
    public CheckMotherTimeAllRequestData createCheckMotherTimeAllRequestData() {
        return new CheckMotherTimeAllRequestData();
    }

    /**
     * Create an instance of {@link CheckMotherTimeAllData }
     * 
     */
    public CheckMotherTimeAllData createCheckMotherTimeAllData() {
        return new CheckMotherTimeAllData();
    }

    /**
     * Create an instance of {@link CheckMotherTime }
     * 
     */
    public CheckMotherTime createCheckMotherTime() {
        return new CheckMotherTime();
    }

    /**
     * Create an instance of {@link InsuredListLast3MonthByDateData }
     * 
     */
    public InsuredListLast3MonthByDateData createInsuredListLast3MonthByDateData() {
        return new InsuredListLast3MonthByDateData();
    }

    /**
     * Create an instance of {@link ServiceOrganizationDeptRequestData }
     * 
     */
    public ServiceOrganizationDeptRequestData createServiceOrganizationDeptRequestData() {
        return new ServiceOrganizationDeptRequestData();
    }

    /**
     * Create an instance of {@link OrganizationDeptData }
     * 
     */
    public OrganizationDeptData createOrganizationDeptData() {
        return new OrganizationDeptData();
    }

    /**
     * Create an instance of {@link DisabilityMedicalCertEditRequestData }
     * 
     */
    public DisabilityMedicalCertEditRequestData createDisabilityMedicalCertEditRequestData() {
        return new DisabilityMedicalCertEditRequestData();
    }

    /**
     * Create an instance of {@link UnemploymentBenefitsCountData }
     * 
     */
    public UnemploymentBenefitsCountData createUnemploymentBenefitsCountData() {
        return new UnemploymentBenefitsCountData();
    }

    /**
     * Create an instance of {@link RefundHalfAccountData }
     * 
     */
    public RefundHalfAccountData createRefundHalfAccountData() {
        return new RefundHalfAccountData();
    }

    /**
     * Create an instance of {@link RefundHalfAccountDetailData }
     * 
     */
    public RefundHalfAccountDetailData createRefundHalfAccountDetailData() {
        return new RefundHalfAccountDetailData();
    }

    /**
     * Create an instance of {@link GetEmployerNumWithDeptRequest }
     * 
     */
    public GetEmployerNumWithDeptRequest createGetEmployerNumWithDeptRequest() {
        return new GetEmployerNumWithDeptRequest();
    }

    /**
     * Create an instance of {@link GetEmployerNumWithDeptData }
     * 
     */
    public GetEmployerNumWithDeptData createGetEmployerNumWithDeptData() {
        return new GetEmployerNumWithDeptData();
    }

    /**
     * Create an instance of {@link DisabilityMedicalCertRequestData }
     * 
     */
    public DisabilityMedicalCertRequestData createDisabilityMedicalCertRequestData() {
        return new DisabilityMedicalCertRequestData();
    }

    /**
     * Create an instance of {@link RefundHalfBankData }
     * 
     */
    public RefundHalfBankData createRefundHalfBankData() {
        return new RefundHalfBankData();
    }

    /**
     * Create an instance of {@link RefundHalfBankDetailData }
     * 
     */
    public RefundHalfBankDetailData createRefundHalfBankDetailData() {
        return new RefundHalfBankDetailData();
    }

    /**
     * Create an instance of {@link RetirementListData }
     * 
     */
    public RetirementListData createRetirementListData() {
        return new RetirementListData();
    }

    /**
     * Create an instance of {@link RetirementListDetailData }
     * 
     */
    public RetirementListDetailData createRetirementListDetailData() {
        return new RetirementListDetailData();
    }

    /**
     * Create an instance of {@link CitizenInsuranceInfoForStatRequestData }
     * 
     */
    public CitizenInsuranceInfoForStatRequestData createCitizenInsuranceInfoForStatRequestData() {
        return new CitizenInsuranceInfoForStatRequestData();
    }

    /**
     * Create an instance of {@link CitizenInsuranceInfoForStatData }
     * 
     */
    public CitizenInsuranceInfoForStatData createCitizenInsuranceInfoForStatData() {
        return new CitizenInsuranceInfoForStatData();
    }

    /**
     * Create an instance of {@link CitizenInsuranceInfoForStatDetailData }
     * 
     */
    public CitizenInsuranceInfoForStatDetailData createCitizenInsuranceInfoForStatDetailData() {
        return new CitizenInsuranceInfoForStatDetailData();
    }

    /**
     * Create an instance of {@link EmployerRequestData }
     * 
     */
    public EmployerRequestData createEmployerRequestData() {
        return new EmployerRequestData();
    }

    /**
     * Create an instance of {@link EmployerData }
     * 
     */
    public EmployerData createEmployerData() {
        return new EmployerData();
    }

    /**
     * Create an instance of {@link EmployerDetialData }
     * 
     */
    public EmployerDetialData createEmployerDetialData() {
        return new EmployerDetialData();
    }

    /**
     * Create an instance of {@link ForeignEmployerData }
     * 
     */
    public ForeignEmployerData createForeignEmployerData() {
        return new ForeignEmployerData();
    }

    /**
     * Create an instance of {@link SalaryFoundByOccupationData }
     * 
     */
    public SalaryFoundByOccupationData createSalaryFoundByOccupationData() {
        return new SalaryFoundByOccupationData();
    }

    /**
     * Create an instance of {@link RefundHalfAccountRequestData }
     * 
     */
    public RefundHalfAccountRequestData createRefundHalfAccountRequestData() {
        return new RefundHalfAccountRequestData();
    }

    /**
     * Create an instance of {@link RefundHalfMessageData }
     * 
     */
    public RefundHalfMessageData createRefundHalfMessageData() {
        return new RefundHalfMessageData();
    }

    /**
     * Create an instance of {@link OrganizationEmployeeRequestData }
     * 
     */
    public OrganizationEmployeeRequestData createOrganizationEmployeeRequestData() {
        return new OrganizationEmployeeRequestData();
    }

    /**
     * Create an instance of {@link OrganizationEmployeeData }
     * 
     */
    public OrganizationEmployeeData createOrganizationEmployeeData() {
        return new OrganizationEmployeeData();
    }

    /**
     * Create an instance of {@link OrganizationEmployeeDetailData }
     * 
     */
    public OrganizationEmployeeDetailData createOrganizationEmployeeDetailData() {
        return new OrganizationEmployeeDetailData();
    }

    /**
     * Create an instance of {@link InsuredForLastThreeMonthOccupationData }
     * 
     */
    public InsuredForLastThreeMonthOccupationData createInsuredForLastThreeMonthOccupationData() {
        return new InsuredForLastThreeMonthOccupationData();
    }

    /**
     * Create an instance of {@link PregnancyChildbirthEditRequestData }
     * 
     */
    public PregnancyChildbirthEditRequestData createPregnancyChildbirthEditRequestData() {
        return new PregnancyChildbirthEditRequestData();
    }

    /**
     * Create an instance of {@link GetSalaryFeeRequestData }
     * 
     */
    public GetSalaryFeeRequestData createGetSalaryFeeRequestData() {
        return new GetSalaryFeeRequestData();
    }

    /**
     * Create an instance of {@link GetSalaryFeeAllData }
     * 
     */
    public GetSalaryFeeAllData createGetSalaryFeeAllData() {
        return new GetSalaryFeeAllData();
    }

    /**
     * Create an instance of {@link GetSalaryFeeData }
     * 
     */
    public GetSalaryFeeData createGetSalaryFeeData() {
        return new GetSalaryFeeData();
    }

    /**
     * Create an instance of {@link GetSalaryFeeDetailData }
     * 
     */
    public GetSalaryFeeDetailData createGetSalaryFeeDetailData() {
        return new GetSalaryFeeDetailData();
    }

    /**
     * Create an instance of {@link PaymentLogRequestData }
     * 
     */
    public PaymentLogRequestData createPaymentLogRequestData() {
        return new PaymentLogRequestData();
    }

    /**
     * Create an instance of {@link HealthInsuranceData }
     * 
     */
    public HealthInsuranceData createHealthInsuranceData() {
        return new HealthInsuranceData();
    }

    /**
     * Create an instance of {@link HealthInsuranceDetailData }
     * 
     */
    public HealthInsuranceDetailData createHealthInsuranceDetailData() {
        return new HealthInsuranceDetailData();
    }

    /**
     * Create an instance of {@link CheckMotherEmployedData }
     * 
     */
    public CheckMotherEmployedData createCheckMotherEmployedData() {
        return new CheckMotherEmployedData();
    }

    /**
     * Create an instance of {@link CheckMotherEmployedDetailData }
     * 
     */
    public CheckMotherEmployedDetailData createCheckMotherEmployedDetailData() {
        return new CheckMotherEmployedDetailData();
    }

    /**
     * Create an instance of {@link DisabilityMedicalCertListData }
     * 
     */
    public DisabilityMedicalCertListData createDisabilityMedicalCertListData() {
        return new DisabilityMedicalCertListData();
    }

    /**
     * Create an instance of {@link DisabilityMedicalCertListDetailData }
     * 
     */
    public DisabilityMedicalCertListDetailData createDisabilityMedicalCertListDetailData() {
        return new DisabilityMedicalCertListDetailData();
    }

    /**
     * Create an instance of {@link UnemploymentBenefitsApplyRequestData }
     * 
     */
    public UnemploymentBenefitsApplyRequestData createUnemploymentBenefitsApplyRequestData() {
        return new UnemploymentBenefitsApplyRequestData();
    }

    /**
     * Create an instance of {@link OrgInfoForStatisticRequestData }
     * 
     */
    public OrgInfoForStatisticRequestData createOrgInfoForStatisticRequestData() {
        return new OrgInfoForStatisticRequestData();
    }

    /**
     * Create an instance of {@link OrgInfoForStatisticData }
     * 
     */
    public OrgInfoForStatisticData createOrgInfoForStatisticData() {
        return new OrgInfoForStatisticData();
    }

    /**
     * Create an instance of {@link OrgInfoForStatisticDetailData }
     * 
     */
    public OrgInfoForStatisticDetailData createOrgInfoForStatisticDetailData() {
        return new OrgInfoForStatisticDetailData();
    }

    /**
     * Create an instance of {@link GetCitizenSalaryInfoEngData }
     * 
     */
    public GetCitizenSalaryInfoEngData createGetCitizenSalaryInfoEngData() {
        return new GetCitizenSalaryInfoEngData();
    }

    /**
     * Create an instance of {@link GetCitizenSalaryInfoEngDetailData }
     * 
     */
    public GetCitizenSalaryInfoEngDetailData createGetCitizenSalaryInfoEngDetailData() {
        return new GetCitizenSalaryInfoEngDetailData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100501GetCitizenSalaryInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100501GetCitizenSalaryInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100501_getCitizenSalaryInfo")
    public JAXBElement<WS100501GetCitizenSalaryInfo> createWS100501GetCitizenSalaryInfo(WS100501GetCitizenSalaryInfo value) {
        return new JAXBElement<WS100501GetCitizenSalaryInfo>(_WS100501GetCitizenSalaryInfo_QNAME, WS100501GetCitizenSalaryInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100501GetCitizenSalaryInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100501GetCitizenSalaryInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100501_getCitizenSalaryInfoResponse")
    public JAXBElement<WS100501GetCitizenSalaryInfoResponse> createWS100501GetCitizenSalaryInfoResponse(WS100501GetCitizenSalaryInfoResponse value) {
        return new JAXBElement<WS100501GetCitizenSalaryInfoResponse>(_WS100501GetCitizenSalaryInfoResponse_QNAME, WS100501GetCitizenSalaryInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100502GetCitizenPensionInquiry }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100502GetCitizenPensionInquiry }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100502_getCitizenPensionInquiry")
    public JAXBElement<WS100502GetCitizenPensionInquiry> createWS100502GetCitizenPensionInquiry(WS100502GetCitizenPensionInquiry value) {
        return new JAXBElement<WS100502GetCitizenPensionInquiry>(_WS100502GetCitizenPensionInquiry_QNAME, WS100502GetCitizenPensionInquiry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100502GetCitizenPensionInquiryResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100502GetCitizenPensionInquiryResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100502_getCitizenPensionInquiryResponse")
    public JAXBElement<WS100502GetCitizenPensionInquiryResponse> createWS100502GetCitizenPensionInquiryResponse(WS100502GetCitizenPensionInquiryResponse value) {
        return new JAXBElement<WS100502GetCitizenPensionInquiryResponse>(_WS100502GetCitizenPensionInquiryResponse_QNAME, WS100502GetCitizenPensionInquiryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100503GetCheckMotherTimeInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100503GetCheckMotherTimeInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100503_getCheckMotherTimeInfo")
    public JAXBElement<WS100503GetCheckMotherTimeInfo> createWS100503GetCheckMotherTimeInfo(WS100503GetCheckMotherTimeInfo value) {
        return new JAXBElement<WS100503GetCheckMotherTimeInfo>(_WS100503GetCheckMotherTimeInfo_QNAME, WS100503GetCheckMotherTimeInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100503GetCheckMotherTimeInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100503GetCheckMotherTimeInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100503_getCheckMotherTimeInfoResponse")
    public JAXBElement<WS100503GetCheckMotherTimeInfoResponse> createWS100503GetCheckMotherTimeInfoResponse(WS100503GetCheckMotherTimeInfoResponse value) {
        return new JAXBElement<WS100503GetCheckMotherTimeInfoResponse>(_WS100503GetCheckMotherTimeInfoResponse_QNAME, WS100503GetCheckMotherTimeInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100504ConfirmAppUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100504ConfirmAppUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100504_confirmAppUser")
    public JAXBElement<WS100504ConfirmAppUser> createWS100504ConfirmAppUser(WS100504ConfirmAppUser value) {
        return new JAXBElement<WS100504ConfirmAppUser>(_WS100504ConfirmAppUser_QNAME, WS100504ConfirmAppUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100504ConfirmAppUserResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100504ConfirmAppUserResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100504_confirmAppUserResponse")
    public JAXBElement<WS100504ConfirmAppUserResponse> createWS100504ConfirmAppUserResponse(WS100504ConfirmAppUserResponse value) {
        return new JAXBElement<WS100504ConfirmAppUserResponse>(_WS100504ConfirmAppUserResponse_QNAME, WS100504ConfirmAppUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100505CreateAppUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100505CreateAppUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100505_createAppUser")
    public JAXBElement<WS100505CreateAppUser> createWS100505CreateAppUser(WS100505CreateAppUser value) {
        return new JAXBElement<WS100505CreateAppUser>(_WS100505CreateAppUser_QNAME, WS100505CreateAppUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100505CreateAppUserResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100505CreateAppUserResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100505_createAppUserResponse")
    public JAXBElement<WS100505CreateAppUserResponse> createWS100505CreateAppUserResponse(WS100505CreateAppUserResponse value) {
        return new JAXBElement<WS100505CreateAppUserResponse>(_WS100505CreateAppUserResponse_QNAME, WS100505CreateAppUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100506FindAppUser }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100506FindAppUser }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100506_findAppUser")
    public JAXBElement<WS100506FindAppUser> createWS100506FindAppUser(WS100506FindAppUser value) {
        return new JAXBElement<WS100506FindAppUser>(_WS100506FindAppUser_QNAME, WS100506FindAppUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100506FindAppUserResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100506FindAppUserResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100506_findAppUserResponse")
    public JAXBElement<WS100506FindAppUserResponse> createWS100506FindAppUserResponse(WS100506FindAppUserResponse value) {
        return new JAXBElement<WS100506FindAppUserResponse>(_WS100506FindAppUserResponse_QNAME, WS100506FindAppUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100507GetInsureeWorkHistoryInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100507GetInsureeWorkHistoryInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100507_getInsureeWorkHistoryInfo")
    public JAXBElement<WS100507GetInsureeWorkHistoryInfo> createWS100507GetInsureeWorkHistoryInfo(WS100507GetInsureeWorkHistoryInfo value) {
        return new JAXBElement<WS100507GetInsureeWorkHistoryInfo>(_WS100507GetInsureeWorkHistoryInfo_QNAME, WS100507GetInsureeWorkHistoryInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100507GetInsureeWorkHistoryInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100507GetInsureeWorkHistoryInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100507_getInsureeWorkHistoryInfoResponse")
    public JAXBElement<WS100507GetInsureeWorkHistoryInfoResponse> createWS100507GetInsureeWorkHistoryInfoResponse(WS100507GetInsureeWorkHistoryInfoResponse value) {
        return new JAXBElement<WS100507GetInsureeWorkHistoryInfoResponse>(_WS100507GetInsureeWorkHistoryInfoResponse_QNAME, WS100507GetInsureeWorkHistoryInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100508GetSalaryFoundByOccupationInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100508GetSalaryFoundByOccupationInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100508_getSalaryFoundByOccupationInfo")
    public JAXBElement<WS100508GetSalaryFoundByOccupationInfo> createWS100508GetSalaryFoundByOccupationInfo(WS100508GetSalaryFoundByOccupationInfo value) {
        return new JAXBElement<WS100508GetSalaryFoundByOccupationInfo>(_WS100508GetSalaryFoundByOccupationInfo_QNAME, WS100508GetSalaryFoundByOccupationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100508GetSalaryFoundByOccupationInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100508GetSalaryFoundByOccupationInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100508_getSalaryFoundByOccupationInfoResponse")
    public JAXBElement<WS100508GetSalaryFoundByOccupationInfoResponse> createWS100508GetSalaryFoundByOccupationInfoResponse(WS100508GetSalaryFoundByOccupationInfoResponse value) {
        return new JAXBElement<WS100508GetSalaryFoundByOccupationInfoResponse>(_WS100508GetSalaryFoundByOccupationInfoResponse_QNAME, WS100508GetSalaryFoundByOccupationInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100509GetSalaryFoundByIndutyInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100509GetSalaryFoundByIndutyInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100509_getSalaryFoundByIndutyInfo")
    public JAXBElement<WS100509GetSalaryFoundByIndutyInfo> createWS100509GetSalaryFoundByIndutyInfo(WS100509GetSalaryFoundByIndutyInfo value) {
        return new JAXBElement<WS100509GetSalaryFoundByIndutyInfo>(_WS100509GetSalaryFoundByIndutyInfo_QNAME, WS100509GetSalaryFoundByIndutyInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100509GetSalaryFoundByIndutyInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100509GetSalaryFoundByIndutyInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100509_getSalaryFoundByIndutyInfoResponse")
    public JAXBElement<WS100509GetSalaryFoundByIndutyInfoResponse> createWS100509GetSalaryFoundByIndutyInfoResponse(WS100509GetSalaryFoundByIndutyInfoResponse value) {
        return new JAXBElement<WS100509GetSalaryFoundByIndutyInfoResponse>(_WS100509GetSalaryFoundByIndutyInfoResponse_QNAME, WS100509GetSalaryFoundByIndutyInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100510GetSiWorkerAccountInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100510GetSiWorkerAccountInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100510_getSiWorkerAccountInfo")
    public JAXBElement<WS100510GetSiWorkerAccountInfo> createWS100510GetSiWorkerAccountInfo(WS100510GetSiWorkerAccountInfo value) {
        return new JAXBElement<WS100510GetSiWorkerAccountInfo>(_WS100510GetSiWorkerAccountInfo_QNAME, WS100510GetSiWorkerAccountInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100510GetSiWorkerAccountInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100510GetSiWorkerAccountInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100510_getSiWorkerAccountInfoResponse")
    public JAXBElement<WS100510GetSiWorkerAccountInfoResponse> createWS100510GetSiWorkerAccountInfoResponse(WS100510GetSiWorkerAccountInfoResponse value) {
        return new JAXBElement<WS100510GetSiWorkerAccountInfoResponse>(_WS100510GetSiWorkerAccountInfoResponse_QNAME, WS100510GetSiWorkerAccountInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100511GetEmployerInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100511GetEmployerInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100511_getEmployerInfo")
    public JAXBElement<WS100511GetEmployerInfo> createWS100511GetEmployerInfo(WS100511GetEmployerInfo value) {
        return new JAXBElement<WS100511GetEmployerInfo>(_WS100511GetEmployerInfo_QNAME, WS100511GetEmployerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100511GetEmployerInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100511GetEmployerInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100511_getEmployerInfoResponse")
    public JAXBElement<WS100511GetEmployerInfoResponse> createWS100511GetEmployerInfoResponse(WS100511GetEmployerInfoResponse value) {
        return new JAXBElement<WS100511GetEmployerInfoResponse>(_WS100511GetEmployerInfoResponse_QNAME, WS100511GetEmployerInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100512CheckIsInsuredInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100512CheckIsInsuredInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100512_checkIsInsuredInfo")
    public JAXBElement<WS100512CheckIsInsuredInfo> createWS100512CheckIsInsuredInfo(WS100512CheckIsInsuredInfo value) {
        return new JAXBElement<WS100512CheckIsInsuredInfo>(_WS100512CheckIsInsuredInfo_QNAME, WS100512CheckIsInsuredInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100512CheckIsInsuredInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100512CheckIsInsuredInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100512_checkIsInsuredInfoResponse")
    public JAXBElement<WS100512CheckIsInsuredInfoResponse> createWS100512CheckIsInsuredInfoResponse(WS100512CheckIsInsuredInfoResponse value) {
        return new JAXBElement<WS100512CheckIsInsuredInfoResponse>(_WS100512CheckIsInsuredInfoResponse_QNAME, WS100512CheckIsInsuredInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100513FindOrganizationInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100513FindOrganizationInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100513_findOrganizationInfo")
    public JAXBElement<WS100513FindOrganizationInfo> createWS100513FindOrganizationInfo(WS100513FindOrganizationInfo value) {
        return new JAXBElement<WS100513FindOrganizationInfo>(_WS100513FindOrganizationInfo_QNAME, WS100513FindOrganizationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100513FindOrganizationInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100513FindOrganizationInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100513_findOrganizationInfoResponse")
    public JAXBElement<WS100513FindOrganizationInfoResponse> createWS100513FindOrganizationInfoResponse(WS100513FindOrganizationInfoResponse value) {
        return new JAXBElement<WS100513FindOrganizationInfoResponse>(_WS100513FindOrganizationInfoResponse_QNAME, WS100513FindOrganizationInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100514GetEmployerNumWithDeptInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100514GetEmployerNumWithDeptInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100514_getEmployerNumWithDeptInfo")
    public JAXBElement<WS100514GetEmployerNumWithDeptInfo> createWS100514GetEmployerNumWithDeptInfo(WS100514GetEmployerNumWithDeptInfo value) {
        return new JAXBElement<WS100514GetEmployerNumWithDeptInfo>(_WS100514GetEmployerNumWithDeptInfo_QNAME, WS100514GetEmployerNumWithDeptInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100514GetEmployerNumWithDeptInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100514GetEmployerNumWithDeptInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100514_getEmployerNumWithDeptInfoResponse")
    public JAXBElement<WS100514GetEmployerNumWithDeptInfoResponse> createWS100514GetEmployerNumWithDeptInfoResponse(WS100514GetEmployerNumWithDeptInfoResponse value) {
        return new JAXBElement<WS100514GetEmployerNumWithDeptInfoResponse>(_WS100514GetEmployerNumWithDeptInfoResponse_QNAME, WS100514GetEmployerNumWithDeptInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100515ForeignEmployerInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100515ForeignEmployerInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100515_foreignEmployerInfo")
    public JAXBElement<WS100515ForeignEmployerInfo> createWS100515ForeignEmployerInfo(WS100515ForeignEmployerInfo value) {
        return new JAXBElement<WS100515ForeignEmployerInfo>(_WS100515ForeignEmployerInfo_QNAME, WS100515ForeignEmployerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100515ForeignEmployerInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100515ForeignEmployerInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100515_foreignEmployerInfoResponse")
    public JAXBElement<WS100515ForeignEmployerInfoResponse> createWS100515ForeignEmployerInfoResponse(WS100515ForeignEmployerInfoResponse value) {
        return new JAXBElement<WS100515ForeignEmployerInfoResponse>(_WS100515ForeignEmployerInfoResponse_QNAME, WS100515ForeignEmployerInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100516GetInsuredForLastThreeMonthInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100516GetInsuredForLastThreeMonthInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100516_getInsuredForLastThreeMonthInfo")
    public JAXBElement<WS100516GetInsuredForLastThreeMonthInfo> createWS100516GetInsuredForLastThreeMonthInfo(WS100516GetInsuredForLastThreeMonthInfo value) {
        return new JAXBElement<WS100516GetInsuredForLastThreeMonthInfo>(_WS100516GetInsuredForLastThreeMonthInfo_QNAME, WS100516GetInsuredForLastThreeMonthInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100516GetInsuredForLastThreeMonthInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100516GetInsuredForLastThreeMonthInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100516_getInsuredForLastThreeMonthInfoResponse")
    public JAXBElement<WS100516GetInsuredForLastThreeMonthInfoResponse> createWS100516GetInsuredForLastThreeMonthInfoResponse(WS100516GetInsuredForLastThreeMonthInfoResponse value) {
        return new JAXBElement<WS100516GetInsuredForLastThreeMonthInfoResponse>(_WS100516GetInsuredForLastThreeMonthInfoResponse_QNAME, WS100516GetInsuredForLastThreeMonthInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100517CheckMotherTimeAllInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100517CheckMotherTimeAllInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100517_checkMotherTimeAllInfo")
    public JAXBElement<WS100517CheckMotherTimeAllInfo> createWS100517CheckMotherTimeAllInfo(WS100517CheckMotherTimeAllInfo value) {
        return new JAXBElement<WS100517CheckMotherTimeAllInfo>(_WS100517CheckMotherTimeAllInfo_QNAME, WS100517CheckMotherTimeAllInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100517CheckMotherTimeAllInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100517CheckMotherTimeAllInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100517_checkMotherTimeAllInfoResponse")
    public JAXBElement<WS100517CheckMotherTimeAllInfoResponse> createWS100517CheckMotherTimeAllInfoResponse(WS100517CheckMotherTimeAllInfoResponse value) {
        return new JAXBElement<WS100517CheckMotherTimeAllInfoResponse>(_WS100517CheckMotherTimeAllInfoResponse_QNAME, WS100517CheckMotherTimeAllInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100518GetPensionInformationData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100518GetPensionInformationData }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100518_getPensionInformationData")
    public JAXBElement<WS100518GetPensionInformationData> createWS100518GetPensionInformationData(WS100518GetPensionInformationData value) {
        return new JAXBElement<WS100518GetPensionInformationData>(_WS100518GetPensionInformationData_QNAME, WS100518GetPensionInformationData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100518GetPensionInformationDataResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100518GetPensionInformationDataResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100518_getPensionInformationDataResponse")
    public JAXBElement<WS100518GetPensionInformationDataResponse> createWS100518GetPensionInformationDataResponse(WS100518GetPensionInformationDataResponse value) {
        return new JAXBElement<WS100518GetPensionInformationDataResponse>(_WS100518GetPensionInformationDataResponse_QNAME, WS100518GetPensionInformationDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100519CheckChildMoney }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100519CheckChildMoney }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100519_checkChildMoney")
    public JAXBElement<WS100519CheckChildMoney> createWS100519CheckChildMoney(WS100519CheckChildMoney value) {
        return new JAXBElement<WS100519CheckChildMoney>(_WS100519CheckChildMoney_QNAME, WS100519CheckChildMoney.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100519CheckChildMoneyResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100519CheckChildMoneyResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100519_checkChildMoneyResponse")
    public JAXBElement<WS100519CheckChildMoneyResponse> createWS100519CheckChildMoneyResponse(WS100519CheckChildMoneyResponse value) {
        return new JAXBElement<WS100519CheckChildMoneyResponse>(_WS100519CheckChildMoneyResponse_QNAME, WS100519CheckChildMoneyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100520CheckHouseHoldChild }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100520CheckHouseHoldChild }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100520_checkHouseHoldChild")
    public JAXBElement<WS100520CheckHouseHoldChild> createWS100520CheckHouseHoldChild(WS100520CheckHouseHoldChild value) {
        return new JAXBElement<WS100520CheckHouseHoldChild>(_WS100520CheckHouseHoldChild_QNAME, WS100520CheckHouseHoldChild.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100520CheckHouseHoldChildResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100520CheckHouseHoldChildResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100520_checkHouseHoldChildResponse")
    public JAXBElement<WS100520CheckHouseHoldChildResponse> createWS100520CheckHouseHoldChildResponse(WS100520CheckHouseHoldChildResponse value) {
        return new JAXBElement<WS100520CheckHouseHoldChildResponse>(_WS100520CheckHouseHoldChildResponse_QNAME, WS100520CheckHouseHoldChildResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100521CheckHouseHoldFood }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100521CheckHouseHoldFood }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100521_checkHouseHoldFood")
    public JAXBElement<WS100521CheckHouseHoldFood> createWS100521CheckHouseHoldFood(WS100521CheckHouseHoldFood value) {
        return new JAXBElement<WS100521CheckHouseHoldFood>(_WS100521CheckHouseHoldFood_QNAME, WS100521CheckHouseHoldFood.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100521CheckHouseHoldFoodResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100521CheckHouseHoldFoodResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100521_checkHouseHoldFoodResponse")
    public JAXBElement<WS100521CheckHouseHoldFoodResponse> createWS100521CheckHouseHoldFoodResponse(WS100521CheckHouseHoldFoodResponse value) {
        return new JAXBElement<WS100521CheckHouseHoldFoodResponse>(_WS100521CheckHouseHoldFoodResponse_QNAME, WS100521CheckHouseHoldFoodResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100522CheckHouseHoldSC }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100522CheckHouseHoldSC }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100522_checkHouseHoldSC")
    public JAXBElement<WS100522CheckHouseHoldSC> createWS100522CheckHouseHoldSC(WS100522CheckHouseHoldSC value) {
        return new JAXBElement<WS100522CheckHouseHoldSC>(_WS100522CheckHouseHoldSC_QNAME, WS100522CheckHouseHoldSC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100522CheckHouseHoldSCResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100522CheckHouseHoldSCResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100522_checkHouseHoldSCResponse")
    public JAXBElement<WS100522CheckHouseHoldSCResponse> createWS100522CheckHouseHoldSCResponse(WS100522CheckHouseHoldSCResponse value) {
        return new JAXBElement<WS100522CheckHouseHoldSCResponse>(_WS100522CheckHouseHoldSCResponse_QNAME, WS100522CheckHouseHoldSCResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100523GetCampVoucherOfElderInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100523GetCampVoucherOfElderInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100523_getCampVoucherOfElderInfo")
    public JAXBElement<WS100523GetCampVoucherOfElderInfo> createWS100523GetCampVoucherOfElderInfo(WS100523GetCampVoucherOfElderInfo value) {
        return new JAXBElement<WS100523GetCampVoucherOfElderInfo>(_WS100523GetCampVoucherOfElderInfo_QNAME, WS100523GetCampVoucherOfElderInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100523GetCampVoucherOfElderInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100523GetCampVoucherOfElderInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100523_getCampVoucherOfElderInfoResponse")
    public JAXBElement<WS100523GetCampVoucherOfElderInfoResponse> createWS100523GetCampVoucherOfElderInfoResponse(WS100523GetCampVoucherOfElderInfoResponse value) {
        return new JAXBElement<WS100523GetCampVoucherOfElderInfoResponse>(_WS100523GetCampVoucherOfElderInfoResponse_QNAME, WS100523GetCampVoucherOfElderInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100524GetDisabledPersonSupplyInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100524GetDisabledPersonSupplyInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100524_getDisabledPersonSupplyInfo")
    public JAXBElement<WS100524GetDisabledPersonSupplyInfo> createWS100524GetDisabledPersonSupplyInfo(WS100524GetDisabledPersonSupplyInfo value) {
        return new JAXBElement<WS100524GetDisabledPersonSupplyInfo>(_WS100524GetDisabledPersonSupplyInfo_QNAME, WS100524GetDisabledPersonSupplyInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100524GetDisabledPersonSupplyInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100524GetDisabledPersonSupplyInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100524_getDisabledPersonSupplyInfoResponse")
    public JAXBElement<WS100524GetDisabledPersonSupplyInfoResponse> createWS100524GetDisabledPersonSupplyInfoResponse(WS100524GetDisabledPersonSupplyInfoResponse value) {
        return new JAXBElement<WS100524GetDisabledPersonSupplyInfoResponse>(_WS100524GetDisabledPersonSupplyInfoResponse_QNAME, WS100524GetDisabledPersonSupplyInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100525GetOrganizationDeptInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100525GetOrganizationDeptInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100525_getOrganizationDeptInfo")
    public JAXBElement<WS100525GetOrganizationDeptInfo> createWS100525GetOrganizationDeptInfo(WS100525GetOrganizationDeptInfo value) {
        return new JAXBElement<WS100525GetOrganizationDeptInfo>(_WS100525GetOrganizationDeptInfo_QNAME, WS100525GetOrganizationDeptInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100525GetOrganizationDeptInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100525GetOrganizationDeptInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100525_getOrganizationDeptInfoResponse")
    public JAXBElement<WS100525GetOrganizationDeptInfoResponse> createWS100525GetOrganizationDeptInfoResponse(WS100525GetOrganizationDeptInfoResponse value) {
        return new JAXBElement<WS100525GetOrganizationDeptInfoResponse>(_WS100525GetOrganizationDeptInfoResponse_QNAME, WS100525GetOrganizationDeptInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100526ReportLog }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100526ReportLog }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100526_reportLog")
    public JAXBElement<WS100526ReportLog> createWS100526ReportLog(WS100526ReportLog value) {
        return new JAXBElement<WS100526ReportLog>(_WS100526ReportLog_QNAME, WS100526ReportLog.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100526ReportLogResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100526ReportLogResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100526_reportLogResponse")
    public JAXBElement<WS100526ReportLogResponse> createWS100526ReportLogResponse(WS100526ReportLogResponse value) {
        return new JAXBElement<WS100526ReportLogResponse>(_WS100526ReportLogResponse_QNAME, WS100526ReportLogResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100527GetPaymentInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100527GetPaymentInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100527_getPaymentInfo")
    public JAXBElement<WS100527GetPaymentInfo> createWS100527GetPaymentInfo(WS100527GetPaymentInfo value) {
        return new JAXBElement<WS100527GetPaymentInfo>(_WS100527GetPaymentInfo_QNAME, WS100527GetPaymentInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100527GetPaymentInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100527GetPaymentInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100527_getPaymentInfoResponse")
    public JAXBElement<WS100527GetPaymentInfoResponse> createWS100527GetPaymentInfoResponse(WS100527GetPaymentInfoResponse value) {
        return new JAXBElement<WS100527GetPaymentInfoResponse>(_WS100527GetPaymentInfoResponse_QNAME, WS100527GetPaymentInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100528PaymentLog }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100528PaymentLog }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100528_paymentLog")
    public JAXBElement<WS100528PaymentLog> createWS100528PaymentLog(WS100528PaymentLog value) {
        return new JAXBElement<WS100528PaymentLog>(_WS100528PaymentLog_QNAME, WS100528PaymentLog.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100528PaymentLogResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100528PaymentLogResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100528_paymentLogResponse")
    public JAXBElement<WS100528PaymentLogResponse> createWS100528PaymentLogResponse(WS100528PaymentLogResponse value) {
        return new JAXBElement<WS100528PaymentLogResponse>(_WS100528PaymentLogResponse_QNAME, WS100528PaymentLogResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100529GetSalaryFeeList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100529GetSalaryFeeList }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100529_getSalaryFeeList")
    public JAXBElement<WS100529GetSalaryFeeList> createWS100529GetSalaryFeeList(WS100529GetSalaryFeeList value) {
        return new JAXBElement<WS100529GetSalaryFeeList>(_WS100529GetSalaryFeeList_QNAME, WS100529GetSalaryFeeList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100529GetSalaryFeeListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100529GetSalaryFeeListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100529_getSalaryFeeListResponse")
    public JAXBElement<WS100529GetSalaryFeeListResponse> createWS100529GetSalaryFeeListResponse(WS100529GetSalaryFeeListResponse value) {
        return new JAXBElement<WS100529GetSalaryFeeListResponse>(_WS100529GetSalaryFeeListResponse_QNAME, WS100529GetSalaryFeeListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100530OrganizationEmployeeInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100530OrganizationEmployeeInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100530_organizationEmployeeInfo")
    public JAXBElement<WS100530OrganizationEmployeeInfo> createWS100530OrganizationEmployeeInfo(WS100530OrganizationEmployeeInfo value) {
        return new JAXBElement<WS100530OrganizationEmployeeInfo>(_WS100530OrganizationEmployeeInfo_QNAME, WS100530OrganizationEmployeeInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100530OrganizationEmployeeInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100530OrganizationEmployeeInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100530_organizationEmployeeInfoResponse")
    public JAXBElement<WS100530OrganizationEmployeeInfoResponse> createWS100530OrganizationEmployeeInfoResponse(WS100530OrganizationEmployeeInfoResponse value) {
        return new JAXBElement<WS100530OrganizationEmployeeInfoResponse>(_WS100530OrganizationEmployeeInfoResponse_QNAME, WS100530OrganizationEmployeeInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100531CheckPensionDate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100531CheckPensionDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100531_checkPensionDate")
    public JAXBElement<WS100531CheckPensionDate> createWS100531CheckPensionDate(WS100531CheckPensionDate value) {
        return new JAXBElement<WS100531CheckPensionDate>(_WS100531CheckPensionDate_QNAME, WS100531CheckPensionDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100531CheckPensionDateResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100531CheckPensionDateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100531_checkPensionDateResponse")
    public JAXBElement<WS100531CheckPensionDateResponse> createWS100531CheckPensionDateResponse(WS100531CheckPensionDateResponse value) {
        return new JAXBElement<WS100531CheckPensionDateResponse>(_WS100531CheckPensionDateResponse_QNAME, WS100531CheckPensionDateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100532CitizenLossOfAbilityToWorkInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100532CitizenLossOfAbilityToWorkInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100532_citizenLossOfAbilityToWorkInfo")
    public JAXBElement<WS100532CitizenLossOfAbilityToWorkInfo> createWS100532CitizenLossOfAbilityToWorkInfo(WS100532CitizenLossOfAbilityToWorkInfo value) {
        return new JAXBElement<WS100532CitizenLossOfAbilityToWorkInfo>(_WS100532CitizenLossOfAbilityToWorkInfo_QNAME, WS100532CitizenLossOfAbilityToWorkInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100532CitizenLossOfAbilityToWorkInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100532CitizenLossOfAbilityToWorkInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100532_citizenLossOfAbilityToWorkInfoResponse")
    public JAXBElement<WS100532CitizenLossOfAbilityToWorkInfoResponse> createWS100532CitizenLossOfAbilityToWorkInfoResponse(WS100532CitizenLossOfAbilityToWorkInfoResponse value) {
        return new JAXBElement<WS100532CitizenLossOfAbilityToWorkInfoResponse>(_WS100532CitizenLossOfAbilityToWorkInfoResponse_QNAME, WS100532CitizenLossOfAbilityToWorkInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100533InsuredListLast3MonthByDate }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100533InsuredListLast3MonthByDate }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100533_insuredListLast3MonthByDate")
    public JAXBElement<WS100533InsuredListLast3MonthByDate> createWS100533InsuredListLast3MonthByDate(WS100533InsuredListLast3MonthByDate value) {
        return new JAXBElement<WS100533InsuredListLast3MonthByDate>(_WS100533InsuredListLast3MonthByDate_QNAME, WS100533InsuredListLast3MonthByDate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100533InsuredListLast3MonthByDateResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100533InsuredListLast3MonthByDateResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100533_insuredListLast3MonthByDateResponse")
    public JAXBElement<WS100533InsuredListLast3MonthByDateResponse> createWS100533InsuredListLast3MonthByDateResponse(WS100533InsuredListLast3MonthByDateResponse value) {
        return new JAXBElement<WS100533InsuredListLast3MonthByDateResponse>(_WS100533InsuredListLast3MonthByDateResponse_QNAME, WS100533InsuredListLast3MonthByDateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100534OrganizationInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100534OrganizationInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100534_organizationInfo")
    public JAXBElement<WS100534OrganizationInfo> createWS100534OrganizationInfo(WS100534OrganizationInfo value) {
        return new JAXBElement<WS100534OrganizationInfo>(_WS100534OrganizationInfo_QNAME, WS100534OrganizationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100534OrganizationInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100534OrganizationInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100534_organizationInfoResponse")
    public JAXBElement<WS100534OrganizationInfoResponse> createWS100534OrganizationInfoResponse(WS100534OrganizationInfoResponse value) {
        return new JAXBElement<WS100534OrganizationInfoResponse>(_WS100534OrganizationInfoResponse_QNAME, WS100534OrganizationInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100535FindOrganizationForMedicalCert }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100535FindOrganizationForMedicalCert }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100535_findOrganizationForMedicalCert")
    public JAXBElement<WS100535FindOrganizationForMedicalCert> createWS100535FindOrganizationForMedicalCert(WS100535FindOrganizationForMedicalCert value) {
        return new JAXBElement<WS100535FindOrganizationForMedicalCert>(_WS100535FindOrganizationForMedicalCert_QNAME, WS100535FindOrganizationForMedicalCert.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100535FindOrganizationForMedicalCertResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100535FindOrganizationForMedicalCertResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100535_findOrganizationForMedicalCertResponse")
    public JAXBElement<WS100535FindOrganizationForMedicalCertResponse> createWS100535FindOrganizationForMedicalCertResponse(WS100535FindOrganizationForMedicalCertResponse value) {
        return new JAXBElement<WS100535FindOrganizationForMedicalCertResponse>(_WS100535FindOrganizationForMedicalCertResponse_QNAME, WS100535FindOrganizationForMedicalCertResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100536CheckMotherEmployed }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100536CheckMotherEmployed }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100536_checkMotherEmployed")
    public JAXBElement<WS100536CheckMotherEmployed> createWS100536CheckMotherEmployed(WS100536CheckMotherEmployed value) {
        return new JAXBElement<WS100536CheckMotherEmployed>(_WS100536CheckMotherEmployed_QNAME, WS100536CheckMotherEmployed.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100536CheckMotherEmployedResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100536CheckMotherEmployedResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100536_checkMotherEmployedResponse")
    public JAXBElement<WS100536CheckMotherEmployedResponse> createWS100536CheckMotherEmployedResponse(WS100536CheckMotherEmployedResponse value) {
        return new JAXBElement<WS100536CheckMotherEmployedResponse>(_WS100536CheckMotherEmployedResponse_QNAME, WS100536CheckMotherEmployedResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100537PregnancyChildbirthInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100537PregnancyChildbirthInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100537_pregnancyChildbirthInfo")
    public JAXBElement<WS100537PregnancyChildbirthInfo> createWS100537PregnancyChildbirthInfo(WS100537PregnancyChildbirthInfo value) {
        return new JAXBElement<WS100537PregnancyChildbirthInfo>(_WS100537PregnancyChildbirthInfo_QNAME, WS100537PregnancyChildbirthInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100537PregnancyChildbirthInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100537PregnancyChildbirthInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100537_pregnancyChildbirthInfoResponse")
    public JAXBElement<WS100537PregnancyChildbirthInfoResponse> createWS100537PregnancyChildbirthInfoResponse(WS100537PregnancyChildbirthInfoResponse value) {
        return new JAXBElement<WS100537PregnancyChildbirthInfoResponse>(_WS100537PregnancyChildbirthInfoResponse_QNAME, WS100537PregnancyChildbirthInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100538DisabilityMedicalCertInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100538DisabilityMedicalCertInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100538_disabilityMedicalCertInfo")
    public JAXBElement<WS100538DisabilityMedicalCertInfo> createWS100538DisabilityMedicalCertInfo(WS100538DisabilityMedicalCertInfo value) {
        return new JAXBElement<WS100538DisabilityMedicalCertInfo>(_WS100538DisabilityMedicalCertInfo_QNAME, WS100538DisabilityMedicalCertInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100538DisabilityMedicalCertInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100538DisabilityMedicalCertInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100538_disabilityMedicalCertInfoResponse")
    public JAXBElement<WS100538DisabilityMedicalCertInfoResponse> createWS100538DisabilityMedicalCertInfoResponse(WS100538DisabilityMedicalCertInfoResponse value) {
        return new JAXBElement<WS100538DisabilityMedicalCertInfoResponse>(_WS100538DisabilityMedicalCertInfoResponse_QNAME, WS100538DisabilityMedicalCertInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100539PregnancyChildbirthCertInvalid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100539PregnancyChildbirthCertInvalid }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100539_pregnancyChildbirthCertInvalid")
    public JAXBElement<WS100539PregnancyChildbirthCertInvalid> createWS100539PregnancyChildbirthCertInvalid(WS100539PregnancyChildbirthCertInvalid value) {
        return new JAXBElement<WS100539PregnancyChildbirthCertInvalid>(_WS100539PregnancyChildbirthCertInvalid_QNAME, WS100539PregnancyChildbirthCertInvalid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100539PregnancyChildbirthCertInvalidResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100539PregnancyChildbirthCertInvalidResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100539_pregnancyChildbirthCertInvalidResponse")
    public JAXBElement<WS100539PregnancyChildbirthCertInvalidResponse> createWS100539PregnancyChildbirthCertInvalidResponse(WS100539PregnancyChildbirthCertInvalidResponse value) {
        return new JAXBElement<WS100539PregnancyChildbirthCertInvalidResponse>(_WS100539PregnancyChildbirthCertInvalidResponse_QNAME, WS100539PregnancyChildbirthCertInvalidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100540DisabilityMedicalCertInvalid }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100540DisabilityMedicalCertInvalid }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100540_disabilityMedicalCertInvalid")
    public JAXBElement<WS100540DisabilityMedicalCertInvalid> createWS100540DisabilityMedicalCertInvalid(WS100540DisabilityMedicalCertInvalid value) {
        return new JAXBElement<WS100540DisabilityMedicalCertInvalid>(_WS100540DisabilityMedicalCertInvalid_QNAME, WS100540DisabilityMedicalCertInvalid.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100540DisabilityMedicalCertInvalidResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100540DisabilityMedicalCertInvalidResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100540_disabilityMedicalCertInvalidResponse")
    public JAXBElement<WS100540DisabilityMedicalCertInvalidResponse> createWS100540DisabilityMedicalCertInvalidResponse(WS100540DisabilityMedicalCertInvalidResponse value) {
        return new JAXBElement<WS100540DisabilityMedicalCertInvalidResponse>(_WS100540DisabilityMedicalCertInvalidResponse_QNAME, WS100540DisabilityMedicalCertInvalidResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100541HealthInsuranceInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100541HealthInsuranceInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100541_healthInsuranceInfo")
    public JAXBElement<WS100541HealthInsuranceInfo> createWS100541HealthInsuranceInfo(WS100541HealthInsuranceInfo value) {
        return new JAXBElement<WS100541HealthInsuranceInfo>(_WS100541HealthInsuranceInfo_QNAME, WS100541HealthInsuranceInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100541HealthInsuranceInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100541HealthInsuranceInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100541_healthInsuranceInfoResponse")
    public JAXBElement<WS100541HealthInsuranceInfoResponse> createWS100541HealthInsuranceInfoResponse(WS100541HealthInsuranceInfoResponse value) {
        return new JAXBElement<WS100541HealthInsuranceInfoResponse>(_WS100541HealthInsuranceInfoResponse_QNAME, WS100541HealthInsuranceInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100542SocialInsuranceInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100542SocialInsuranceInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100542_socialInsuranceInfo")
    public JAXBElement<WS100542SocialInsuranceInfo> createWS100542SocialInsuranceInfo(WS100542SocialInsuranceInfo value) {
        return new JAXBElement<WS100542SocialInsuranceInfo>(_WS100542SocialInsuranceInfo_QNAME, WS100542SocialInsuranceInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100542SocialInsuranceInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100542SocialInsuranceInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100542_socialInsuranceInfoResponse")
    public JAXBElement<WS100542SocialInsuranceInfoResponse> createWS100542SocialInsuranceInfoResponse(WS100542SocialInsuranceInfoResponse value) {
        return new JAXBElement<WS100542SocialInsuranceInfoResponse>(_WS100542SocialInsuranceInfoResponse_QNAME, WS100542SocialInsuranceInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100543RetirementListInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100543RetirementListInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100543_retirementListInfo")
    public JAXBElement<WS100543RetirementListInfo> createWS100543RetirementListInfo(WS100543RetirementListInfo value) {
        return new JAXBElement<WS100543RetirementListInfo>(_WS100543RetirementListInfo_QNAME, WS100543RetirementListInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100543RetirementListInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100543RetirementListInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100543_retirementListInfoResponse")
    public JAXBElement<WS100543RetirementListInfoResponse> createWS100543RetirementListInfoResponse(WS100543RetirementListInfoResponse value) {
        return new JAXBElement<WS100543RetirementListInfoResponse>(_WS100543RetirementListInfoResponse_QNAME, WS100543RetirementListInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100544GetInsuredForLastThreeMonthOccupationInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100544GetInsuredForLastThreeMonthOccupationInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100544_getInsuredForLastThreeMonthOccupationInfo")
    public JAXBElement<WS100544GetInsuredForLastThreeMonthOccupationInfo> createWS100544GetInsuredForLastThreeMonthOccupationInfo(WS100544GetInsuredForLastThreeMonthOccupationInfo value) {
        return new JAXBElement<WS100544GetInsuredForLastThreeMonthOccupationInfo>(_WS100544GetInsuredForLastThreeMonthOccupationInfo_QNAME, WS100544GetInsuredForLastThreeMonthOccupationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100544GetInsuredForLastThreeMonthOccupationInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100544GetInsuredForLastThreeMonthOccupationInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100544_getInsuredForLastThreeMonthOccupationInfoResponse")
    public JAXBElement<WS100544GetInsuredForLastThreeMonthOccupationInfoResponse> createWS100544GetInsuredForLastThreeMonthOccupationInfoResponse(WS100544GetInsuredForLastThreeMonthOccupationInfoResponse value) {
        return new JAXBElement<WS100544GetInsuredForLastThreeMonthOccupationInfoResponse>(_WS100544GetInsuredForLastThreeMonthOccupationInfoResponse_QNAME, WS100544GetInsuredForLastThreeMonthOccupationInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100545MedicalCertCheck }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100545MedicalCertCheck }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100545_medicalCertCheck")
    public JAXBElement<WS100545MedicalCertCheck> createWS100545MedicalCertCheck(WS100545MedicalCertCheck value) {
        return new JAXBElement<WS100545MedicalCertCheck>(_WS100545MedicalCertCheck_QNAME, WS100545MedicalCertCheck.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100545MedicalCertCheckResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100545MedicalCertCheckResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100545_medicalCertCheckResponse")
    public JAXBElement<WS100545MedicalCertCheckResponse> createWS100545MedicalCertCheckResponse(WS100545MedicalCertCheckResponse value) {
        return new JAXBElement<WS100545MedicalCertCheckResponse>(_WS100545MedicalCertCheckResponse_QNAME, WS100545MedicalCertCheckResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100546DisabilityMedicalCertEdit }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100546DisabilityMedicalCertEdit }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100546_disabilityMedicalCertEdit")
    public JAXBElement<WS100546DisabilityMedicalCertEdit> createWS100546DisabilityMedicalCertEdit(WS100546DisabilityMedicalCertEdit value) {
        return new JAXBElement<WS100546DisabilityMedicalCertEdit>(_WS100546DisabilityMedicalCertEdit_QNAME, WS100546DisabilityMedicalCertEdit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100546DisabilityMedicalCertEditResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100546DisabilityMedicalCertEditResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100546_disabilityMedicalCertEditResponse")
    public JAXBElement<WS100546DisabilityMedicalCertEditResponse> createWS100546DisabilityMedicalCertEditResponse(WS100546DisabilityMedicalCertEditResponse value) {
        return new JAXBElement<WS100546DisabilityMedicalCertEditResponse>(_WS100546DisabilityMedicalCertEditResponse_QNAME, WS100546DisabilityMedicalCertEditResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100547PregnancyChildbirthEdit }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100547PregnancyChildbirthEdit }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100547_pregnancyChildbirthEdit")
    public JAXBElement<WS100547PregnancyChildbirthEdit> createWS100547PregnancyChildbirthEdit(WS100547PregnancyChildbirthEdit value) {
        return new JAXBElement<WS100547PregnancyChildbirthEdit>(_WS100547PregnancyChildbirthEdit_QNAME, WS100547PregnancyChildbirthEdit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100547PregnancyChildbirthEditResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100547PregnancyChildbirthEditResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100547_pregnancyChildbirthEditResponse")
    public JAXBElement<WS100547PregnancyChildbirthEditResponse> createWS100547PregnancyChildbirthEditResponse(WS100547PregnancyChildbirthEditResponse value) {
        return new JAXBElement<WS100547PregnancyChildbirthEditResponse>(_WS100547PregnancyChildbirthEditResponse_QNAME, WS100547PregnancyChildbirthEditResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100548DisabilityMedicalCertList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100548DisabilityMedicalCertList }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100548_disabilityMedicalCertList")
    public JAXBElement<WS100548DisabilityMedicalCertList> createWS100548DisabilityMedicalCertList(WS100548DisabilityMedicalCertList value) {
        return new JAXBElement<WS100548DisabilityMedicalCertList>(_WS100548DisabilityMedicalCertList_QNAME, WS100548DisabilityMedicalCertList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100548DisabilityMedicalCertListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100548DisabilityMedicalCertListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100548_disabilityMedicalCertListResponse")
    public JAXBElement<WS100548DisabilityMedicalCertListResponse> createWS100548DisabilityMedicalCertListResponse(WS100548DisabilityMedicalCertListResponse value) {
        return new JAXBElement<WS100548DisabilityMedicalCertListResponse>(_WS100548DisabilityMedicalCertListResponse_QNAME, WS100548DisabilityMedicalCertListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100549DisabilityBenefitsApply }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100549DisabilityBenefitsApply }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100549_disabilityBenefitsApply")
    public JAXBElement<WS100549DisabilityBenefitsApply> createWS100549DisabilityBenefitsApply(WS100549DisabilityBenefitsApply value) {
        return new JAXBElement<WS100549DisabilityBenefitsApply>(_WS100549DisabilityBenefitsApply_QNAME, WS100549DisabilityBenefitsApply.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100549DisabilityBenefitsApplyResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100549DisabilityBenefitsApplyResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100549_disabilityBenefitsApplyResponse")
    public JAXBElement<WS100549DisabilityBenefitsApplyResponse> createWS100549DisabilityBenefitsApplyResponse(WS100549DisabilityBenefitsApplyResponse value) {
        return new JAXBElement<WS100549DisabilityBenefitsApplyResponse>(_WS100549DisabilityBenefitsApplyResponse_QNAME, WS100549DisabilityBenefitsApplyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100550PregnancyChildbirthCertList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100550PregnancyChildbirthCertList }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100550_pregnancyChildbirthCertList")
    public JAXBElement<WS100550PregnancyChildbirthCertList> createWS100550PregnancyChildbirthCertList(WS100550PregnancyChildbirthCertList value) {
        return new JAXBElement<WS100550PregnancyChildbirthCertList>(_WS100550PregnancyChildbirthCertList_QNAME, WS100550PregnancyChildbirthCertList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100550PregnancyChildbirthCertListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100550PregnancyChildbirthCertListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100550_pregnancyChildbirthCertListResponse")
    public JAXBElement<WS100550PregnancyChildbirthCertListResponse> createWS100550PregnancyChildbirthCertListResponse(WS100550PregnancyChildbirthCertListResponse value) {
        return new JAXBElement<WS100550PregnancyChildbirthCertListResponse>(_WS100550PregnancyChildbirthCertListResponse_QNAME, WS100550PregnancyChildbirthCertListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100551PregnancyBenefitsApply }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100551PregnancyBenefitsApply }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100551_pregnancyBenefitsApply")
    public JAXBElement<WS100551PregnancyBenefitsApply> createWS100551PregnancyBenefitsApply(WS100551PregnancyBenefitsApply value) {
        return new JAXBElement<WS100551PregnancyBenefitsApply>(_WS100551PregnancyBenefitsApply_QNAME, WS100551PregnancyBenefitsApply.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100551PregnancyBenefitsApplyResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100551PregnancyBenefitsApplyResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100551_pregnancyBenefitsApplyResponse")
    public JAXBElement<WS100551PregnancyBenefitsApplyResponse> createWS100551PregnancyBenefitsApplyResponse(WS100551PregnancyBenefitsApplyResponse value) {
        return new JAXBElement<WS100551PregnancyBenefitsApplyResponse>(_WS100551PregnancyBenefitsApplyResponse_QNAME, WS100551PregnancyBenefitsApplyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100552UnemploymentBenefitsList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100552UnemploymentBenefitsList }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100552_unemploymentBenefitsList")
    public JAXBElement<WS100552UnemploymentBenefitsList> createWS100552UnemploymentBenefitsList(WS100552UnemploymentBenefitsList value) {
        return new JAXBElement<WS100552UnemploymentBenefitsList>(_WS100552UnemploymentBenefitsList_QNAME, WS100552UnemploymentBenefitsList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100552UnemploymentBenefitsListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100552UnemploymentBenefitsListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100552_unemploymentBenefitsListResponse")
    public JAXBElement<WS100552UnemploymentBenefitsListResponse> createWS100552UnemploymentBenefitsListResponse(WS100552UnemploymentBenefitsListResponse value) {
        return new JAXBElement<WS100552UnemploymentBenefitsListResponse>(_WS100552UnemploymentBenefitsListResponse_QNAME, WS100552UnemploymentBenefitsListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100553UnemploymentBenefitsApply }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100553UnemploymentBenefitsApply }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100553_unemploymentBenefitsApply")
    public JAXBElement<WS100553UnemploymentBenefitsApply> createWS100553UnemploymentBenefitsApply(WS100553UnemploymentBenefitsApply value) {
        return new JAXBElement<WS100553UnemploymentBenefitsApply>(_WS100553UnemploymentBenefitsApply_QNAME, WS100553UnemploymentBenefitsApply.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100553UnemploymentBenefitsApplyResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100553UnemploymentBenefitsApplyResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100553_unemploymentBenefitsApplyResponse")
    public JAXBElement<WS100553UnemploymentBenefitsApplyResponse> createWS100553UnemploymentBenefitsApplyResponse(WS100553UnemploymentBenefitsApplyResponse value) {
        return new JAXBElement<WS100553UnemploymentBenefitsApplyResponse>(_WS100553UnemploymentBenefitsApplyResponse_QNAME, WS100553UnemploymentBenefitsApplyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100554UnemploymentBenefitsCount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100554UnemploymentBenefitsCount }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100554_unemploymentBenefitsCount")
    public JAXBElement<WS100554UnemploymentBenefitsCount> createWS100554UnemploymentBenefitsCount(WS100554UnemploymentBenefitsCount value) {
        return new JAXBElement<WS100554UnemploymentBenefitsCount>(_WS100554UnemploymentBenefitsCount_QNAME, WS100554UnemploymentBenefitsCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100554UnemploymentBenefitsCountResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100554UnemploymentBenefitsCountResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100554_unemploymentBenefitsCountResponse")
    public JAXBElement<WS100554UnemploymentBenefitsCountResponse> createWS100554UnemploymentBenefitsCountResponse(WS100554UnemploymentBenefitsCountResponse value) {
        return new JAXBElement<WS100554UnemploymentBenefitsCountResponse>(_WS100554UnemploymentBenefitsCountResponse_QNAME, WS100554UnemploymentBenefitsCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100555GetBankList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100555GetBankList }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100555_getBankList")
    public JAXBElement<WS100555GetBankList> createWS100555GetBankList(WS100555GetBankList value) {
        return new JAXBElement<WS100555GetBankList>(_WS100555GetBankList_QNAME, WS100555GetBankList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100555GetBankListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100555GetBankListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100555_getBankListResponse")
    public JAXBElement<WS100555GetBankListResponse> createWS100555GetBankListResponse(WS100555GetBankListResponse value) {
        return new JAXBElement<WS100555GetBankListResponse>(_WS100555GetBankListResponse_QNAME, WS100555GetBankListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100556GetHealthInsuranceFee }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100556GetHealthInsuranceFee }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100556_getHealthInsuranceFee")
    public JAXBElement<WS100556GetHealthInsuranceFee> createWS100556GetHealthInsuranceFee(WS100556GetHealthInsuranceFee value) {
        return new JAXBElement<WS100556GetHealthInsuranceFee>(_WS100556GetHealthInsuranceFee_QNAME, WS100556GetHealthInsuranceFee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100556GetHealthInsuranceFeeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100556GetHealthInsuranceFeeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100556_getHealthInsuranceFeeResponse")
    public JAXBElement<WS100556GetHealthInsuranceFeeResponse> createWS100556GetHealthInsuranceFeeResponse(WS100556GetHealthInsuranceFeeResponse value) {
        return new JAXBElement<WS100556GetHealthInsuranceFeeResponse>(_WS100556GetHealthInsuranceFeeResponse_QNAME, WS100556GetHealthInsuranceFeeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100557CitizenInsuranceInfoForStatistic }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100557CitizenInsuranceInfoForStatistic }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100557_citizenInsuranceInfoForStatistic")
    public JAXBElement<WS100557CitizenInsuranceInfoForStatistic> createWS100557CitizenInsuranceInfoForStatistic(WS100557CitizenInsuranceInfoForStatistic value) {
        return new JAXBElement<WS100557CitizenInsuranceInfoForStatistic>(_WS100557CitizenInsuranceInfoForStatistic_QNAME, WS100557CitizenInsuranceInfoForStatistic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100557CitizenInsuranceInfoForStatisticResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100557CitizenInsuranceInfoForStatisticResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100557_citizenInsuranceInfoForStatisticResponse")
    public JAXBElement<WS100557CitizenInsuranceInfoForStatisticResponse> createWS100557CitizenInsuranceInfoForStatisticResponse(WS100557CitizenInsuranceInfoForStatisticResponse value) {
        return new JAXBElement<WS100557CitizenInsuranceInfoForStatisticResponse>(_WS100557CitizenInsuranceInfoForStatisticResponse_QNAME, WS100557CitizenInsuranceInfoForStatisticResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100558OrgInfoForStatistic }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100558OrgInfoForStatistic }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100558_orgInfoForStatistic")
    public JAXBElement<WS100558OrgInfoForStatistic> createWS100558OrgInfoForStatistic(WS100558OrgInfoForStatistic value) {
        return new JAXBElement<WS100558OrgInfoForStatistic>(_WS100558OrgInfoForStatistic_QNAME, WS100558OrgInfoForStatistic.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100558OrgInfoForStatisticResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100558OrgInfoForStatisticResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100558_orgInfoForStatisticResponse")
    public JAXBElement<WS100558OrgInfoForStatisticResponse> createWS100558OrgInfoForStatisticResponse(WS100558OrgInfoForStatisticResponse value) {
        return new JAXBElement<WS100558OrgInfoForStatisticResponse>(_WS100558OrgInfoForStatisticResponse_QNAME, WS100558OrgInfoForStatisticResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100559RefundHalfBankList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100559RefundHalfBankList }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100559_refundHalfBankList")
    public JAXBElement<WS100559RefundHalfBankList> createWS100559RefundHalfBankList(WS100559RefundHalfBankList value) {
        return new JAXBElement<WS100559RefundHalfBankList>(_WS100559RefundHalfBankList_QNAME, WS100559RefundHalfBankList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100559RefundHalfBankListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100559RefundHalfBankListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100559_refundHalfBankListResponse")
    public JAXBElement<WS100559RefundHalfBankListResponse> createWS100559RefundHalfBankListResponse(WS100559RefundHalfBankListResponse value) {
        return new JAXBElement<WS100559RefundHalfBankListResponse>(_WS100559RefundHalfBankListResponse_QNAME, WS100559RefundHalfBankListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100560RefundHalfAccountList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100560RefundHalfAccountList }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100560_refundHalfAccountList")
    public JAXBElement<WS100560RefundHalfAccountList> createWS100560RefundHalfAccountList(WS100560RefundHalfAccountList value) {
        return new JAXBElement<WS100560RefundHalfAccountList>(_WS100560RefundHalfAccountList_QNAME, WS100560RefundHalfAccountList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100560RefundHalfAccountListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100560RefundHalfAccountListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100560_refundHalfAccountListResponse")
    public JAXBElement<WS100560RefundHalfAccountListResponse> createWS100560RefundHalfAccountListResponse(WS100560RefundHalfAccountListResponse value) {
        return new JAXBElement<WS100560RefundHalfAccountListResponse>(_WS100560RefundHalfAccountListResponse_QNAME, WS100560RefundHalfAccountListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100561RefundHalfCreateAccount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100561RefundHalfCreateAccount }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100561_refundHalfCreateAccount")
    public JAXBElement<WS100561RefundHalfCreateAccount> createWS100561RefundHalfCreateAccount(WS100561RefundHalfCreateAccount value) {
        return new JAXBElement<WS100561RefundHalfCreateAccount>(_WS100561RefundHalfCreateAccount_QNAME, WS100561RefundHalfCreateAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100561RefundHalfCreateAccountResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100561RefundHalfCreateAccountResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100561_refundHalfCreateAccountResponse")
    public JAXBElement<WS100561RefundHalfCreateAccountResponse> createWS100561RefundHalfCreateAccountResponse(WS100561RefundHalfCreateAccountResponse value) {
        return new JAXBElement<WS100561RefundHalfCreateAccountResponse>(_WS100561RefundHalfCreateAccountResponse_QNAME, WS100561RefundHalfCreateAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100562RefundHalfUpdateAccount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100562RefundHalfUpdateAccount }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100562_refundHalfUpdateAccount")
    public JAXBElement<WS100562RefundHalfUpdateAccount> createWS100562RefundHalfUpdateAccount(WS100562RefundHalfUpdateAccount value) {
        return new JAXBElement<WS100562RefundHalfUpdateAccount>(_WS100562RefundHalfUpdateAccount_QNAME, WS100562RefundHalfUpdateAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100562RefundHalfUpdateAccountResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100562RefundHalfUpdateAccountResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100562_refundHalfUpdateAccountResponse")
    public JAXBElement<WS100562RefundHalfUpdateAccountResponse> createWS100562RefundHalfUpdateAccountResponse(WS100562RefundHalfUpdateAccountResponse value) {
        return new JAXBElement<WS100562RefundHalfUpdateAccountResponse>(_WS100562RefundHalfUpdateAccountResponse_QNAME, WS100562RefundHalfUpdateAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100563FuneralAllowanceInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100563FuneralAllowanceInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100563_funeralAllowanceInfo")
    public JAXBElement<WS100563FuneralAllowanceInfo> createWS100563FuneralAllowanceInfo(WS100563FuneralAllowanceInfo value) {
        return new JAXBElement<WS100563FuneralAllowanceInfo>(_WS100563FuneralAllowanceInfo_QNAME, WS100563FuneralAllowanceInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100563FuneralAllowanceInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100563FuneralAllowanceInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100563_funeralAllowanceInfoResponse")
    public JAXBElement<WS100563FuneralAllowanceInfoResponse> createWS100563FuneralAllowanceInfoResponse(WS100563FuneralAllowanceInfoResponse value) {
        return new JAXBElement<WS100563FuneralAllowanceInfoResponse>(_WS100563FuneralAllowanceInfoResponse_QNAME, WS100563FuneralAllowanceInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100564PensionDocumentInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100564PensionDocumentInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100564_pensionDocumentInfo")
    public JAXBElement<WS100564PensionDocumentInfo> createWS100564PensionDocumentInfo(WS100564PensionDocumentInfo value) {
        return new JAXBElement<WS100564PensionDocumentInfo>(_WS100564PensionDocumentInfo_QNAME, WS100564PensionDocumentInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100564PensionDocumentInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100564PensionDocumentInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100564_pensionDocumentInfoResponse")
    public JAXBElement<WS100564PensionDocumentInfoResponse> createWS100564PensionDocumentInfoResponse(WS100564PensionDocumentInfoResponse value) {
        return new JAXBElement<WS100564PensionDocumentInfoResponse>(_WS100564PensionDocumentInfoResponse_QNAME, WS100564PensionDocumentInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100565GetCitizenSalaryInfoEng }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100565GetCitizenSalaryInfoEng }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100565_getCitizenSalaryInfoEng")
    public JAXBElement<WS100565GetCitizenSalaryInfoEng> createWS100565GetCitizenSalaryInfoEng(WS100565GetCitizenSalaryInfoEng value) {
        return new JAXBElement<WS100565GetCitizenSalaryInfoEng>(_WS100565GetCitizenSalaryInfoEng_QNAME, WS100565GetCitizenSalaryInfoEng.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100565GetCitizenSalaryInfoEngResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100565GetCitizenSalaryInfoEngResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100565_getCitizenSalaryInfoEngResponse")
    public JAXBElement<WS100565GetCitizenSalaryInfoEngResponse> createWS100565GetCitizenSalaryInfoEngResponse(WS100565GetCitizenSalaryInfoEngResponse value) {
        return new JAXBElement<WS100565GetCitizenSalaryInfoEngResponse>(_WS100565GetCitizenSalaryInfoEngResponse_QNAME, WS100565GetCitizenSalaryInfoEngResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100566DisabilityPensionDocumentInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100566DisabilityPensionDocumentInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100566_disabilityPensionDocumentInfo")
    public JAXBElement<WS100566DisabilityPensionDocumentInfo> createWS100566DisabilityPensionDocumentInfo(WS100566DisabilityPensionDocumentInfo value) {
        return new JAXBElement<WS100566DisabilityPensionDocumentInfo>(_WS100566DisabilityPensionDocumentInfo_QNAME, WS100566DisabilityPensionDocumentInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100566DisabilityPensionDocumentInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100566DisabilityPensionDocumentInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100566_disabilityPensionDocumentInfoResponse")
    public JAXBElement<WS100566DisabilityPensionDocumentInfoResponse> createWS100566DisabilityPensionDocumentInfoResponse(WS100566DisabilityPensionDocumentInfoResponse value) {
        return new JAXBElement<WS100566DisabilityPensionDocumentInfoResponse>(_WS100566DisabilityPensionDocumentInfoResponse_QNAME, WS100566DisabilityPensionDocumentInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100567LostCaregiverPensionDocumentInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100567LostCaregiverPensionDocumentInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100567_lostCaregiverPensionDocumentInfo")
    public JAXBElement<WS100567LostCaregiverPensionDocumentInfo> createWS100567LostCaregiverPensionDocumentInfo(WS100567LostCaregiverPensionDocumentInfo value) {
        return new JAXBElement<WS100567LostCaregiverPensionDocumentInfo>(_WS100567LostCaregiverPensionDocumentInfo_QNAME, WS100567LostCaregiverPensionDocumentInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100567LostCaregiverPensionDocumentInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100567LostCaregiverPensionDocumentInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100567_lostCaregiverPensionDocumentInfoResponse")
    public JAXBElement<WS100567LostCaregiverPensionDocumentInfoResponse> createWS100567LostCaregiverPensionDocumentInfoResponse(WS100567LostCaregiverPensionDocumentInfoResponse value) {
        return new JAXBElement<WS100567LostCaregiverPensionDocumentInfoResponse>(_WS100567LostCaregiverPensionDocumentInfoResponse_QNAME, WS100567LostCaregiverPensionDocumentInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100568PensionDocumentEngInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100568PensionDocumentEngInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100568_pensionDocumentEngInfo")
    public JAXBElement<WS100568PensionDocumentEngInfo> createWS100568PensionDocumentEngInfo(WS100568PensionDocumentEngInfo value) {
        return new JAXBElement<WS100568PensionDocumentEngInfo>(_WS100568PensionDocumentEngInfo_QNAME, WS100568PensionDocumentEngInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100568PensionDocumentEngInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100568PensionDocumentEngInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100568_pensionDocumentEngInfoResponse")
    public JAXBElement<WS100568PensionDocumentEngInfoResponse> createWS100568PensionDocumentEngInfoResponse(WS100568PensionDocumentEngInfoResponse value) {
        return new JAXBElement<WS100568PensionDocumentEngInfoResponse>(_WS100568PensionDocumentEngInfoResponse_QNAME, WS100568PensionDocumentEngInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100569DisabilityPensionDocumentEngInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100569DisabilityPensionDocumentEngInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100569_disabilityPensionDocumentEngInfo")
    public JAXBElement<WS100569DisabilityPensionDocumentEngInfo> createWS100569DisabilityPensionDocumentEngInfo(WS100569DisabilityPensionDocumentEngInfo value) {
        return new JAXBElement<WS100569DisabilityPensionDocumentEngInfo>(_WS100569DisabilityPensionDocumentEngInfo_QNAME, WS100569DisabilityPensionDocumentEngInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100569DisabilityPensionDocumentEngInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100569DisabilityPensionDocumentEngInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100569_disabilityPensionDocumentEngInfoResponse")
    public JAXBElement<WS100569DisabilityPensionDocumentEngInfoResponse> createWS100569DisabilityPensionDocumentEngInfoResponse(WS100569DisabilityPensionDocumentEngInfoResponse value) {
        return new JAXBElement<WS100569DisabilityPensionDocumentEngInfoResponse>(_WS100569DisabilityPensionDocumentEngInfoResponse_QNAME, WS100569DisabilityPensionDocumentEngInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100570LostCaregiverPensionDocumentEngInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100570LostCaregiverPensionDocumentEngInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100570_lostCaregiverPensionDocumentEngInfo")
    public JAXBElement<WS100570LostCaregiverPensionDocumentEngInfo> createWS100570LostCaregiverPensionDocumentEngInfo(WS100570LostCaregiverPensionDocumentEngInfo value) {
        return new JAXBElement<WS100570LostCaregiverPensionDocumentEngInfo>(_WS100570LostCaregiverPensionDocumentEngInfo_QNAME, WS100570LostCaregiverPensionDocumentEngInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100570LostCaregiverPensionDocumentEngInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100570LostCaregiverPensionDocumentEngInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://insurance.xyp.gov.mn/", name = "WS100570_lostCaregiverPensionDocumentEngInfoResponse")
    public JAXBElement<WS100570LostCaregiverPensionDocumentEngInfoResponse> createWS100570LostCaregiverPensionDocumentEngInfoResponse(WS100570LostCaregiverPensionDocumentEngInfoResponse value) {
        return new JAXBElement<WS100570LostCaregiverPensionDocumentEngInfoResponse>(_WS100570LostCaregiverPensionDocumentEngInfoResponse_QNAME, WS100570LostCaregiverPensionDocumentEngInfoResponse.class, null, value);
    }

}
