
package mn.gov.ema.emongolia.data.XypLegalEntity;

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
 * generated in the mn.gov.itc.emongolia.data.XypLegalEntity package. 
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

    private final static QName _WS100301GetLegalEntityInfo_QNAME = new QName("http://les.xyp.gov.mn/", "WS100301_getLegalEntityInfo");
    private final static QName _WS100301GetLegalEntityInfoResponse_QNAME = new QName("http://les.xyp.gov.mn/", "WS100301_getLegalEntityInfoResponse");
    private final static QName _WS100302GetLegalEntityChangeInfo_QNAME = new QName("http://les.xyp.gov.mn/", "WS100302_getLegalEntityChangeInfo");
    private final static QName _WS100302GetLegalEntityChangeInfoResponse_QNAME = new QName("http://les.xyp.gov.mn/", "WS100302_getLegalEntityChangeInfoResponse");
    private final static QName _WS100303GetLegalEntityLiquidationInfo_QNAME = new QName("http://les.xyp.gov.mn/", "WS100303_getLegalEntityLiquidationInfo");
    private final static QName _WS100303GetLegalEntityLiquidationInfoResponse_QNAME = new QName("http://les.xyp.gov.mn/", "WS100303_getLegalEntityLiquidationInfoResponse");
    private final static QName _WS100304GetLegalEntityNewlyCreatedInfo_QNAME = new QName("http://les.xyp.gov.mn/", "WS100304_getLegalEntityNewlyCreatedInfo");
    private final static QName _WS100304GetLegalEntityNewlyCreatedInfoResponse_QNAME = new QName("http://les.xyp.gov.mn/", "WS100304_getLegalEntityNewlyCreatedInfoResponse");
    private final static QName _WS100305SearchLegalEntityName_QNAME = new QName("http://les.xyp.gov.mn/", "WS100305_searchLegalEntityName");
    private final static QName _WS100305SearchLegalEntityNameResponse_QNAME = new QName("http://les.xyp.gov.mn/", "WS100305_searchLegalEntityNameResponse");
    private final static QName _WS100306GetNonLegalEntityInfo_QNAME = new QName("http://les.xyp.gov.mn/", "WS100306_getNonLegalEntityInfo");
    private final static QName _WS100306GetNonLegalEntityInfoResponse_QNAME = new QName("http://les.xyp.gov.mn/", "WS100306_getNonLegalEntityInfoResponse");
    private final static QName _WS100307GetLegalEntityInfoWithRegnum_QNAME = new QName("http://les.xyp.gov.mn/", "WS100307_getLegalEntityInfoWithRegnum");
    private final static QName _WS100307GetLegalEntityInfoWithRegnumResponse_QNAME = new QName("http://les.xyp.gov.mn/", "WS100307_getLegalEntityInfoWithRegnumResponse");
    private final static QName _WS100308LegalEntityDoingCriminalLiability_QNAME = new QName("http://les.xyp.gov.mn/", "WS100308_legalEntityDoingCriminalLiability");
    private final static QName _WS100308LegalEntityDoingCriminalLiabilityResponse_QNAME = new QName("http://les.xyp.gov.mn/", "WS100308_legalEntityDoingCriminalLiabilityResponse");
    private final static QName _WS100309LegalEntityWasCriminalLiability_QNAME = new QName("http://les.xyp.gov.mn/", "WS100309_legalEntityWasCriminalLiability");
    private final static QName _WS100309LegalEntityWasCriminalLiabilityResponse_QNAME = new QName("http://les.xyp.gov.mn/", "WS100309_legalEntityWasCriminalLiabilityResponse");
    private final static QName _WS100310LegalEntityReorganizedInfo_QNAME = new QName("http://les.xyp.gov.mn/", "WS100310_legalEntityReorganizedInfo");
    private final static QName _WS100310LegalEntityReorganizedInfoResponse_QNAME = new QName("http://les.xyp.gov.mn/", "WS100310_legalEntityReorganizedInfoResponse");
    private final static QName _WS100311GetLegalEntityInfoToTax_QNAME = new QName("http://les.xyp.gov.mn/", "WS100311_getLegalEntityInfoToTax");
    private final static QName _WS100311GetLegalEntityInfoToTaxResponse_QNAME = new QName("http://les.xyp.gov.mn/", "WS100311_getLegalEntityInfoToTaxResponse");
    private final static QName _WS100312CheckDebtOfCustomsInfo_QNAME = new QName("http://les.xyp.gov.mn/", "WS100312_checkDebtOfCustomsInfo");
    private final static QName _WS100312CheckDebtOfCustomsInfoResponse_QNAME = new QName("http://les.xyp.gov.mn/", "WS100312_checkDebtOfCustomsInfoResponse");
    private final static QName _WS100313CitizenLegalEntityList_QNAME = new QName("http://les.xyp.gov.mn/", "WS100313_citizenLegalEntityList");
    private final static QName _WS100313CitizenLegalEntityListResponse_QNAME = new QName("http://les.xyp.gov.mn/", "WS100313_citizenLegalEntityListResponse");
    private final static QName _WS100314CitizenShareHolderCompanyInfo_QNAME = new QName("http://les.xyp.gov.mn/", "WS100314_citizenShareHolderCompanyInfo");
    private final static QName _WS100314CitizenShareHolderCompanyInfoResponse_QNAME = new QName("http://les.xyp.gov.mn/", "WS100314_citizenShareHolderCompanyInfoResponse");
    private final static QName _WS100315CheckLegalEntityDirector_QNAME = new QName("http://les.xyp.gov.mn/", "WS100315_checkLegalEntityDirector");
    private final static QName _WS100315CheckLegalEntityDirectorResponse_QNAME = new QName("http://les.xyp.gov.mn/", "WS100315_checkLegalEntityDirectorResponse");
    private final static QName _WS100316LegalEntityOpenData_QNAME = new QName("http://les.xyp.gov.mn/", "WS100316_legalEntityOpenData");
    private final static QName _WS100316LegalEntityOpenDataResponse_QNAME = new QName("http://les.xyp.gov.mn/", "WS100316_legalEntityOpenDataResponse");
    private final static QName _WS100317FindLesNameInfo_QNAME = new QName("http://les.xyp.gov.mn/", "WS100317_findLesNameInfo");
    private final static QName _WS100317FindLesNameInfoResponse_QNAME = new QName("http://les.xyp.gov.mn/", "WS100317_findLesNameInfoResponse");
    private final static QName _WS100318LegalEntityOfficialNamesInfo_QNAME = new QName("http://les.xyp.gov.mn/", "WS100318_legalEntityOfficialNamesInfo");
    private final static QName _WS100318LegalEntityOfficialNamesInfoResponse_QNAME = new QName("http://les.xyp.gov.mn/", "WS100318_legalEntityOfficialNamesInfoResponse");
    private final static QName _WS100319LegalEntityIndustryInfo_QNAME = new QName("http://les.xyp.gov.mn/", "WS100319_legalEntityIndustryInfo");
    private final static QName _WS100319LegalEntityIndustryInfoResponse_QNAME = new QName("http://les.xyp.gov.mn/", "WS100319_legalEntityIndustryInfoResponse");
    private final static QName _WS100320CreateInqCustoms_QNAME = new QName("http://les.xyp.gov.mn/", "WS100320_createInqCustoms");
    private final static QName _WS100320CreateInqCustomsResponse_QNAME = new QName("http://les.xyp.gov.mn/", "WS100320_createInqCustomsResponse");
    private final static QName _WS100321GetCustomsInqInfo_QNAME = new QName("http://les.xyp.gov.mn/", "WS100321_getCustomsInqInfo");
    private final static QName _WS100321GetCustomsInqInfoResponse_QNAME = new QName("http://les.xyp.gov.mn/", "WS100321_getCustomsInqInfoResponse");
    private final static QName _WS100322LegalEntityIndustryLicenseInfo_QNAME = new QName("http://les.xyp.gov.mn/", "WS100322_legalEntityIndustryLicenseInfo");
    private final static QName _WS100322LegalEntityIndustryLicenseInfoResponse_QNAME = new QName("http://les.xyp.gov.mn/", "WS100322_legalEntityIndustryLicenseInfoResponse");
    private final static QName _WS100323LegalEntityNonPaymentInfo_QNAME = new QName("http://les.xyp.gov.mn/", "WS100323_legalEntityNonPaymentInfo");
    private final static QName _WS100323LegalEntityNonPaymentInfoResponse_QNAME = new QName("http://les.xyp.gov.mn/", "WS100323_legalEntityNonPaymentInfoResponse");
    private final static QName _WS100324LegalEntityGeneralInfo_QNAME = new QName("http://les.xyp.gov.mn/", "WS100324_legalEntityGeneralInfo");
    private final static QName _WS100324LegalEntityGeneralInfoResponse_QNAME = new QName("http://les.xyp.gov.mn/", "WS100324_legalEntityGeneralInfoResponse");
    private final static QName _WS100325LegalEntityFinalOwnerInfo_QNAME = new QName("http://les.xyp.gov.mn/", "WS100325_legalEntityFinalOwnerInfo");
    private final static QName _WS100325LegalEntityFinalOwnerInfoResponse_QNAME = new QName("http://les.xyp.gov.mn/", "WS100325_legalEntityFinalOwnerInfoResponse");
    private final static QName _WS100326LegalEntityStampInfo_QNAME = new QName("http://les.xyp.gov.mn/", "WS100326_legalEntityStampInfo");
    private final static QName _WS100326LegalEntityStampInfoResponse_QNAME = new QName("http://les.xyp.gov.mn/", "WS100326_legalEntityStampInfoResponse");
    private final static QName _WS100327GetCustomsOffnsInfo_QNAME = new QName("http://les.xyp.gov.mn/", "WS100327_getCustomsOffnsInfo");
    private final static QName _WS100327GetCustomsOffnsInfoResponse_QNAME = new QName("http://les.xyp.gov.mn/", "WS100327_getCustomsOffnsInfoResponse");
    private final static QName _WS100328CheckLegalEntityNameInfo_QNAME = new QName("http://les.xyp.gov.mn/", "WS100328_checkLegalEntityNameInfo");
    private final static QName _WS100328CheckLegalEntityNameInfoResponse_QNAME = new QName("http://les.xyp.gov.mn/", "WS100328_checkLegalEntityNameInfoResponse");
    private final static QName _WS100329EnergyLicenseCertificateInfo_QNAME = new QName("http://les.xyp.gov.mn/", "WS100329_energyLicenseCertificateInfo");
    private final static QName _WS100329EnergyLicenseCertificateInfoResponse_QNAME = new QName("http://les.xyp.gov.mn/", "WS100329_energyLicenseCertificateInfoResponse");
    private final static QName _WS100330LiquidationInfoService_QNAME = new QName("http://les.xyp.gov.mn/", "WS100330_liquidationInfoService");
    private final static QName _WS100330LiquidationInfoServiceResponse_QNAME = new QName("http://les.xyp.gov.mn/", "WS100330_liquidationInfoServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mn.gov.itc.emongolia.data.XypLegalEntity
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WS100301GetLegalEntityInfo }
     * 
     */
    public WS100301GetLegalEntityInfo createWS100301GetLegalEntityInfo() {
        return new WS100301GetLegalEntityInfo();
    }

    /**
     * Create an instance of {@link WS100301GetLegalEntityInfoResponse }
     * 
     */
    public WS100301GetLegalEntityInfoResponse createWS100301GetLegalEntityInfoResponse() {
        return new WS100301GetLegalEntityInfoResponse();
    }

    /**
     * Create an instance of {@link WS100302GetLegalEntityChangeInfo }
     * 
     */
    public WS100302GetLegalEntityChangeInfo createWS100302GetLegalEntityChangeInfo() {
        return new WS100302GetLegalEntityChangeInfo();
    }

    /**
     * Create an instance of {@link WS100302GetLegalEntityChangeInfoResponse }
     * 
     */
    public WS100302GetLegalEntityChangeInfoResponse createWS100302GetLegalEntityChangeInfoResponse() {
        return new WS100302GetLegalEntityChangeInfoResponse();
    }

    /**
     * Create an instance of {@link WS100303GetLegalEntityLiquidationInfo }
     * 
     */
    public WS100303GetLegalEntityLiquidationInfo createWS100303GetLegalEntityLiquidationInfo() {
        return new WS100303GetLegalEntityLiquidationInfo();
    }

    /**
     * Create an instance of {@link WS100303GetLegalEntityLiquidationInfoResponse }
     * 
     */
    public WS100303GetLegalEntityLiquidationInfoResponse createWS100303GetLegalEntityLiquidationInfoResponse() {
        return new WS100303GetLegalEntityLiquidationInfoResponse();
    }

    /**
     * Create an instance of {@link WS100304GetLegalEntityNewlyCreatedInfo }
     * 
     */
    public WS100304GetLegalEntityNewlyCreatedInfo createWS100304GetLegalEntityNewlyCreatedInfo() {
        return new WS100304GetLegalEntityNewlyCreatedInfo();
    }

    /**
     * Create an instance of {@link WS100304GetLegalEntityNewlyCreatedInfoResponse }
     * 
     */
    public WS100304GetLegalEntityNewlyCreatedInfoResponse createWS100304GetLegalEntityNewlyCreatedInfoResponse() {
        return new WS100304GetLegalEntityNewlyCreatedInfoResponse();
    }

    /**
     * Create an instance of {@link WS100305SearchLegalEntityName }
     * 
     */
    public WS100305SearchLegalEntityName createWS100305SearchLegalEntityName() {
        return new WS100305SearchLegalEntityName();
    }

    /**
     * Create an instance of {@link WS100305SearchLegalEntityNameResponse }
     * 
     */
    public WS100305SearchLegalEntityNameResponse createWS100305SearchLegalEntityNameResponse() {
        return new WS100305SearchLegalEntityNameResponse();
    }

    /**
     * Create an instance of {@link WS100306GetNonLegalEntityInfo }
     * 
     */
    public WS100306GetNonLegalEntityInfo createWS100306GetNonLegalEntityInfo() {
        return new WS100306GetNonLegalEntityInfo();
    }

    /**
     * Create an instance of {@link WS100306GetNonLegalEntityInfoResponse }
     * 
     */
    public WS100306GetNonLegalEntityInfoResponse createWS100306GetNonLegalEntityInfoResponse() {
        return new WS100306GetNonLegalEntityInfoResponse();
    }

    /**
     * Create an instance of {@link WS100307GetLegalEntityInfoWithRegnum }
     * 
     */
    public WS100307GetLegalEntityInfoWithRegnum createWS100307GetLegalEntityInfoWithRegnum() {
        return new WS100307GetLegalEntityInfoWithRegnum();
    }

    /**
     * Create an instance of {@link WS100307GetLegalEntityInfoWithRegnumResponse }
     * 
     */
    public WS100307GetLegalEntityInfoWithRegnumResponse createWS100307GetLegalEntityInfoWithRegnumResponse() {
        return new WS100307GetLegalEntityInfoWithRegnumResponse();
    }

    /**
     * Create an instance of {@link WS100308LegalEntityDoingCriminalLiability }
     * 
     */
    public WS100308LegalEntityDoingCriminalLiability createWS100308LegalEntityDoingCriminalLiability() {
        return new WS100308LegalEntityDoingCriminalLiability();
    }

    /**
     * Create an instance of {@link WS100308LegalEntityDoingCriminalLiabilityResponse }
     * 
     */
    public WS100308LegalEntityDoingCriminalLiabilityResponse createWS100308LegalEntityDoingCriminalLiabilityResponse() {
        return new WS100308LegalEntityDoingCriminalLiabilityResponse();
    }

    /**
     * Create an instance of {@link WS100309LegalEntityWasCriminalLiability }
     * 
     */
    public WS100309LegalEntityWasCriminalLiability createWS100309LegalEntityWasCriminalLiability() {
        return new WS100309LegalEntityWasCriminalLiability();
    }

    /**
     * Create an instance of {@link WS100309LegalEntityWasCriminalLiabilityResponse }
     * 
     */
    public WS100309LegalEntityWasCriminalLiabilityResponse createWS100309LegalEntityWasCriminalLiabilityResponse() {
        return new WS100309LegalEntityWasCriminalLiabilityResponse();
    }

    /**
     * Create an instance of {@link WS100310LegalEntityReorganizedInfo }
     * 
     */
    public WS100310LegalEntityReorganizedInfo createWS100310LegalEntityReorganizedInfo() {
        return new WS100310LegalEntityReorganizedInfo();
    }

    /**
     * Create an instance of {@link WS100310LegalEntityReorganizedInfoResponse }
     * 
     */
    public WS100310LegalEntityReorganizedInfoResponse createWS100310LegalEntityReorganizedInfoResponse() {
        return new WS100310LegalEntityReorganizedInfoResponse();
    }

    /**
     * Create an instance of {@link WS100311GetLegalEntityInfoToTax }
     * 
     */
    public WS100311GetLegalEntityInfoToTax createWS100311GetLegalEntityInfoToTax() {
        return new WS100311GetLegalEntityInfoToTax();
    }

    /**
     * Create an instance of {@link WS100311GetLegalEntityInfoToTaxResponse }
     * 
     */
    public WS100311GetLegalEntityInfoToTaxResponse createWS100311GetLegalEntityInfoToTaxResponse() {
        return new WS100311GetLegalEntityInfoToTaxResponse();
    }

    /**
     * Create an instance of {@link WS100312CheckDebtOfCustomsInfo }
     * 
     */
    public WS100312CheckDebtOfCustomsInfo createWS100312CheckDebtOfCustomsInfo() {
        return new WS100312CheckDebtOfCustomsInfo();
    }

    /**
     * Create an instance of {@link WS100312CheckDebtOfCustomsInfoResponse }
     * 
     */
    public WS100312CheckDebtOfCustomsInfoResponse createWS100312CheckDebtOfCustomsInfoResponse() {
        return new WS100312CheckDebtOfCustomsInfoResponse();
    }

    /**
     * Create an instance of {@link WS100313CitizenLegalEntityList }
     * 
     */
    public WS100313CitizenLegalEntityList createWS100313CitizenLegalEntityList() {
        return new WS100313CitizenLegalEntityList();
    }

    /**
     * Create an instance of {@link WS100313CitizenLegalEntityListResponse }
     * 
     */
    public WS100313CitizenLegalEntityListResponse createWS100313CitizenLegalEntityListResponse() {
        return new WS100313CitizenLegalEntityListResponse();
    }

    /**
     * Create an instance of {@link WS100314CitizenShareHolderCompanyInfo }
     * 
     */
    public WS100314CitizenShareHolderCompanyInfo createWS100314CitizenShareHolderCompanyInfo() {
        return new WS100314CitizenShareHolderCompanyInfo();
    }

    /**
     * Create an instance of {@link WS100314CitizenShareHolderCompanyInfoResponse }
     * 
     */
    public WS100314CitizenShareHolderCompanyInfoResponse createWS100314CitizenShareHolderCompanyInfoResponse() {
        return new WS100314CitizenShareHolderCompanyInfoResponse();
    }

    /**
     * Create an instance of {@link WS100315CheckLegalEntityDirector }
     * 
     */
    public WS100315CheckLegalEntityDirector createWS100315CheckLegalEntityDirector() {
        return new WS100315CheckLegalEntityDirector();
    }

    /**
     * Create an instance of {@link WS100315CheckLegalEntityDirectorResponse }
     * 
     */
    public WS100315CheckLegalEntityDirectorResponse createWS100315CheckLegalEntityDirectorResponse() {
        return new WS100315CheckLegalEntityDirectorResponse();
    }

    /**
     * Create an instance of {@link WS100316LegalEntityOpenData }
     * 
     */
    public WS100316LegalEntityOpenData createWS100316LegalEntityOpenData() {
        return new WS100316LegalEntityOpenData();
    }

    /**
     * Create an instance of {@link WS100316LegalEntityOpenDataResponse }
     * 
     */
    public WS100316LegalEntityOpenDataResponse createWS100316LegalEntityOpenDataResponse() {
        return new WS100316LegalEntityOpenDataResponse();
    }

    /**
     * Create an instance of {@link WS100317FindLesNameInfo }
     * 
     */
    public WS100317FindLesNameInfo createWS100317FindLesNameInfo() {
        return new WS100317FindLesNameInfo();
    }

    /**
     * Create an instance of {@link WS100317FindLesNameInfoResponse }
     * 
     */
    public WS100317FindLesNameInfoResponse createWS100317FindLesNameInfoResponse() {
        return new WS100317FindLesNameInfoResponse();
    }

    /**
     * Create an instance of {@link WS100318LegalEntityOfficialNamesInfo }
     * 
     */
    public WS100318LegalEntityOfficialNamesInfo createWS100318LegalEntityOfficialNamesInfo() {
        return new WS100318LegalEntityOfficialNamesInfo();
    }

    /**
     * Create an instance of {@link WS100318LegalEntityOfficialNamesInfoResponse }
     * 
     */
    public WS100318LegalEntityOfficialNamesInfoResponse createWS100318LegalEntityOfficialNamesInfoResponse() {
        return new WS100318LegalEntityOfficialNamesInfoResponse();
    }

    /**
     * Create an instance of {@link WS100319LegalEntityIndustryInfo }
     * 
     */
    public WS100319LegalEntityIndustryInfo createWS100319LegalEntityIndustryInfo() {
        return new WS100319LegalEntityIndustryInfo();
    }

    /**
     * Create an instance of {@link WS100319LegalEntityIndustryInfoResponse }
     * 
     */
    public WS100319LegalEntityIndustryInfoResponse createWS100319LegalEntityIndustryInfoResponse() {
        return new WS100319LegalEntityIndustryInfoResponse();
    }

    /**
     * Create an instance of {@link WS100320CreateInqCustoms }
     * 
     */
    public WS100320CreateInqCustoms createWS100320CreateInqCustoms() {
        return new WS100320CreateInqCustoms();
    }

    /**
     * Create an instance of {@link WS100320CreateInqCustomsResponse }
     * 
     */
    public WS100320CreateInqCustomsResponse createWS100320CreateInqCustomsResponse() {
        return new WS100320CreateInqCustomsResponse();
    }

    /**
     * Create an instance of {@link WS100321GetCustomsInqInfo }
     * 
     */
    public WS100321GetCustomsInqInfo createWS100321GetCustomsInqInfo() {
        return new WS100321GetCustomsInqInfo();
    }

    /**
     * Create an instance of {@link WS100321GetCustomsInqInfoResponse }
     * 
     */
    public WS100321GetCustomsInqInfoResponse createWS100321GetCustomsInqInfoResponse() {
        return new WS100321GetCustomsInqInfoResponse();
    }

    /**
     * Create an instance of {@link WS100322LegalEntityIndustryLicenseInfo }
     * 
     */
    public WS100322LegalEntityIndustryLicenseInfo createWS100322LegalEntityIndustryLicenseInfo() {
        return new WS100322LegalEntityIndustryLicenseInfo();
    }

    /**
     * Create an instance of {@link WS100322LegalEntityIndustryLicenseInfoResponse }
     * 
     */
    public WS100322LegalEntityIndustryLicenseInfoResponse createWS100322LegalEntityIndustryLicenseInfoResponse() {
        return new WS100322LegalEntityIndustryLicenseInfoResponse();
    }

    /**
     * Create an instance of {@link WS100323LegalEntityNonPaymentInfo }
     * 
     */
    public WS100323LegalEntityNonPaymentInfo createWS100323LegalEntityNonPaymentInfo() {
        return new WS100323LegalEntityNonPaymentInfo();
    }

    /**
     * Create an instance of {@link WS100323LegalEntityNonPaymentInfoResponse }
     * 
     */
    public WS100323LegalEntityNonPaymentInfoResponse createWS100323LegalEntityNonPaymentInfoResponse() {
        return new WS100323LegalEntityNonPaymentInfoResponse();
    }

    /**
     * Create an instance of {@link WS100324LegalEntityGeneralInfo }
     * 
     */
    public WS100324LegalEntityGeneralInfo createWS100324LegalEntityGeneralInfo() {
        return new WS100324LegalEntityGeneralInfo();
    }

    /**
     * Create an instance of {@link WS100324LegalEntityGeneralInfoResponse }
     * 
     */
    public WS100324LegalEntityGeneralInfoResponse createWS100324LegalEntityGeneralInfoResponse() {
        return new WS100324LegalEntityGeneralInfoResponse();
    }

    /**
     * Create an instance of {@link WS100325LegalEntityFinalOwnerInfo }
     * 
     */
    public WS100325LegalEntityFinalOwnerInfo createWS100325LegalEntityFinalOwnerInfo() {
        return new WS100325LegalEntityFinalOwnerInfo();
    }

    /**
     * Create an instance of {@link WS100325LegalEntityFinalOwnerInfoResponse }
     * 
     */
    public WS100325LegalEntityFinalOwnerInfoResponse createWS100325LegalEntityFinalOwnerInfoResponse() {
        return new WS100325LegalEntityFinalOwnerInfoResponse();
    }

    /**
     * Create an instance of {@link WS100326LegalEntityStampInfo }
     * 
     */
    public WS100326LegalEntityStampInfo createWS100326LegalEntityStampInfo() {
        return new WS100326LegalEntityStampInfo();
    }

    /**
     * Create an instance of {@link WS100326LegalEntityStampInfoResponse }
     * 
     */
    public WS100326LegalEntityStampInfoResponse createWS100326LegalEntityStampInfoResponse() {
        return new WS100326LegalEntityStampInfoResponse();
    }

    /**
     * Create an instance of {@link WS100327GetCustomsOffnsInfo }
     * 
     */
    public WS100327GetCustomsOffnsInfo createWS100327GetCustomsOffnsInfo() {
        return new WS100327GetCustomsOffnsInfo();
    }

    /**
     * Create an instance of {@link WS100327GetCustomsOffnsInfoResponse }
     * 
     */
    public WS100327GetCustomsOffnsInfoResponse createWS100327GetCustomsOffnsInfoResponse() {
        return new WS100327GetCustomsOffnsInfoResponse();
    }

    /**
     * Create an instance of {@link WS100328CheckLegalEntityNameInfo }
     * 
     */
    public WS100328CheckLegalEntityNameInfo createWS100328CheckLegalEntityNameInfo() {
        return new WS100328CheckLegalEntityNameInfo();
    }

    /**
     * Create an instance of {@link WS100328CheckLegalEntityNameInfoResponse }
     * 
     */
    public WS100328CheckLegalEntityNameInfoResponse createWS100328CheckLegalEntityNameInfoResponse() {
        return new WS100328CheckLegalEntityNameInfoResponse();
    }

    /**
     * Create an instance of {@link WS100329EnergyLicenseCertificateInfo }
     * 
     */
    public WS100329EnergyLicenseCertificateInfo createWS100329EnergyLicenseCertificateInfo() {
        return new WS100329EnergyLicenseCertificateInfo();
    }

    /**
     * Create an instance of {@link WS100329EnergyLicenseCertificateInfoResponse }
     * 
     */
    public WS100329EnergyLicenseCertificateInfoResponse createWS100329EnergyLicenseCertificateInfoResponse() {
        return new WS100329EnergyLicenseCertificateInfoResponse();
    }

    /**
     * Create an instance of {@link WS100330LiquidationInfoService }
     * 
     */
    public WS100330LiquidationInfoService createWS100330LiquidationInfoService() {
        return new WS100330LiquidationInfoService();
    }

    /**
     * Create an instance of {@link WS100330LiquidationInfoServiceResponse }
     * 
     */
    public WS100330LiquidationInfoServiceResponse createWS100330LiquidationInfoServiceResponse() {
        return new WS100330LiquidationInfoServiceResponse();
    }

    /**
     * Create an instance of {@link NonLegalEntityRequestData }
     * 
     */
    public NonLegalEntityRequestData createNonLegalEntityRequestData() {
        return new NonLegalEntityRequestData();
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
     * Create an instance of {@link CitizenShareHolderCompanyData }
     * 
     */
    public CitizenShareHolderCompanyData createCitizenShareHolderCompanyData() {
        return new CitizenShareHolderCompanyData();
    }

    /**
     * Create an instance of {@link CitizenShareHolderCompanyDetailData }
     * 
     */
    public CitizenShareHolderCompanyDetailData createCitizenShareHolderCompanyDetailData() {
        return new CitizenShareHolderCompanyDetailData();
    }

    /**
     * Create an instance of {@link EnergyLicenseCertRequestData }
     * 
     */
    public EnergyLicenseCertRequestData createEnergyLicenseCertRequestData() {
        return new EnergyLicenseCertRequestData();
    }

    /**
     * Create an instance of {@link EnergyLicenseCertificateData }
     * 
     */
    public EnergyLicenseCertificateData createEnergyLicenseCertificateData() {
        return new EnergyLicenseCertificateData();
    }

    /**
     * Create an instance of {@link EnergyLicenseCertificateDetailData }
     * 
     */
    public EnergyLicenseCertificateDetailData createEnergyLicenseCertificateDetailData() {
        return new EnergyLicenseCertificateDetailData();
    }

    /**
     * Create an instance of {@link LegalEntityFinalOwnerRequestData }
     * 
     */
    public LegalEntityFinalOwnerRequestData createLegalEntityFinalOwnerRequestData() {
        return new LegalEntityFinalOwnerRequestData();
    }

    /**
     * Create an instance of {@link LegalEntityFinalOwnerData }
     * 
     */
    public LegalEntityFinalOwnerData createLegalEntityFinalOwnerData() {
        return new LegalEntityFinalOwnerData();
    }

    /**
     * Create an instance of {@link LegalEntityFinalOwnerDetailData }
     * 
     */
    public LegalEntityFinalOwnerDetailData createLegalEntityFinalOwnerDetailData() {
        return new LegalEntityFinalOwnerDetailData();
    }

    /**
     * Create an instance of {@link EntityNumberData }
     * 
     */
    public EntityNumberData createEntityNumberData() {
        return new EntityNumberData();
    }

    /**
     * Create an instance of {@link LegalEntityReorganizedData }
     * 
     */
    public LegalEntityReorganizedData createLegalEntityReorganizedData() {
        return new LegalEntityReorganizedData();
    }

    /**
     * Create an instance of {@link EntityRequestData }
     * 
     */
    public EntityRequestData createEntityRequestData() {
        return new EntityRequestData();
    }

    /**
     * Create an instance of {@link ListWrapper }
     * 
     */
    public ListWrapper createListWrapper() {
        return new ListWrapper();
    }

    /**
     * Create an instance of {@link LegalEntityNewData }
     * 
     */
    public LegalEntityNewData createLegalEntityNewData() {
        return new LegalEntityNewData();
    }

    /**
     * Create an instance of {@link LegalEntityRequestData }
     * 
     */
    public LegalEntityRequestData createLegalEntityRequestData() {
        return new LegalEntityRequestData();
    }

    /**
     * Create an instance of {@link LegalEntityIndustryLicenseData }
     * 
     */
    public LegalEntityIndustryLicenseData createLegalEntityIndustryLicenseData() {
        return new LegalEntityIndustryLicenseData();
    }

    /**
     * Create an instance of {@link LegalEntityIndustryLicenseDetailData }
     * 
     */
    public LegalEntityIndustryLicenseDetailData createLegalEntityIndustryLicenseDetailData() {
        return new LegalEntityIndustryLicenseDetailData();
    }

    /**
     * Create an instance of {@link LiquidationData }
     * 
     */
    public LiquidationData createLiquidationData() {
        return new LiquidationData();
    }

    /**
     * Create an instance of {@link CheckLegalEntityNameData }
     * 
     */
    public CheckLegalEntityNameData createCheckLegalEntityNameData() {
        return new CheckLegalEntityNameData();
    }

    /**
     * Create an instance of {@link ServiceSearchLegalEntityNameRequestData }
     * 
     */
    public ServiceSearchLegalEntityNameRequestData createServiceSearchLegalEntityNameRequestData() {
        return new ServiceSearchLegalEntityNameRequestData();
    }

    /**
     * Create an instance of {@link SearchLegalEntityNameData }
     * 
     */
    public SearchLegalEntityNameData createSearchLegalEntityNameData() {
        return new SearchLegalEntityNameData();
    }

    /**
     * Create an instance of {@link SearchLegalEntityNameDetailData }
     * 
     */
    public SearchLegalEntityNameDetailData createSearchLegalEntityNameDetailData() {
        return new SearchLegalEntityNameDetailData();
    }

    /**
     * Create an instance of {@link CreateInqCustomsRequestData }
     * 
     */
    public CreateInqCustomsRequestData createCreateInqCustomsRequestData() {
        return new CreateInqCustomsRequestData();
    }

    /**
     * Create an instance of {@link CreateInqCustomsData }
     * 
     */
    public CreateInqCustomsData createCreateInqCustomsData() {
        return new CreateInqCustomsData();
    }

    /**
     * Create an instance of {@link LegalEntityDataToTax }
     * 
     */
    public LegalEntityDataToTax createLegalEntityDataToTax() {
        return new LegalEntityDataToTax();
    }

    /**
     * Create an instance of {@link AddressDataToTax }
     * 
     */
    public AddressDataToTax createAddressDataToTax() {
        return new AddressDataToTax();
    }

    /**
     * Create an instance of {@link BranchDataToTax }
     * 
     */
    public BranchDataToTax createBranchDataToTax() {
        return new BranchDataToTax();
    }

    /**
     * Create an instance of {@link FounderDataToTax }
     * 
     */
    public FounderDataToTax createFounderDataToTax() {
        return new FounderDataToTax();
    }

    /**
     * Create an instance of {@link GeneralDataToTax }
     * 
     */
    public GeneralDataToTax createGeneralDataToTax() {
        return new GeneralDataToTax();
    }

    /**
     * Create an instance of {@link GeneralRDataToTax }
     * 
     */
    public GeneralRDataToTax createGeneralRDataToTax() {
        return new GeneralRDataToTax();
    }

    /**
     * Create an instance of {@link IndutyDataToTax }
     * 
     */
    public IndutyDataToTax createIndutyDataToTax() {
        return new IndutyDataToTax();
    }

    /**
     * Create an instance of {@link LegalEntityGeneralData }
     * 
     */
    public LegalEntityGeneralData createLegalEntityGeneralData() {
        return new LegalEntityGeneralData();
    }

    /**
     * Create an instance of {@link CitizenLegalEntityListData }
     * 
     */
    public CitizenLegalEntityListData createCitizenLegalEntityListData() {
        return new CitizenLegalEntityListData();
    }

    /**
     * Create an instance of {@link CitizenLegalEntityListDetailData }
     * 
     */
    public CitizenLegalEntityListDetailData createCitizenLegalEntityListDetailData() {
        return new CitizenLegalEntityListDetailData();
    }

    /**
     * Create an instance of {@link FindLesNameRequestData }
     * 
     */
    public FindLesNameRequestData createFindLesNameRequestData() {
        return new FindLesNameRequestData();
    }

    /**
     * Create an instance of {@link FindLesNameData }
     * 
     */
    public FindLesNameData createFindLesNameData() {
        return new FindLesNameData();
    }

    /**
     * Create an instance of {@link FindLesNameDetailData }
     * 
     */
    public FindLesNameDetailData createFindLesNameDetailData() {
        return new FindLesNameDetailData();
    }

    /**
     * Create an instance of {@link CheckDebtOfCustomsRequestData }
     * 
     */
    public CheckDebtOfCustomsRequestData createCheckDebtOfCustomsRequestData() {
        return new CheckDebtOfCustomsRequestData();
    }

    /**
     * Create an instance of {@link CheckDebtOfCustomsData }
     * 
     */
    public CheckDebtOfCustomsData createCheckDebtOfCustomsData() {
        return new CheckDebtOfCustomsData();
    }

    /**
     * Create an instance of {@link NonLegalEntityData }
     * 
     */
    public NonLegalEntityData createNonLegalEntityData() {
        return new NonLegalEntityData();
    }

    /**
     * Create an instance of {@link LegalEntityStampData }
     * 
     */
    public LegalEntityStampData createLegalEntityStampData() {
        return new LegalEntityStampData();
    }

    /**
     * Create an instance of {@link LegalEntityNonPaymentData }
     * 
     */
    public LegalEntityNonPaymentData createLegalEntityNonPaymentData() {
        return new LegalEntityNonPaymentData();
    }

    /**
     * Create an instance of {@link LegalEntityData }
     * 
     */
    public LegalEntityData createLegalEntityData() {
        return new LegalEntityData();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link AddressUnit }
     * 
     */
    public AddressUnit createAddressUnit() {
        return new AddressUnit();
    }

    /**
     * Create an instance of {@link Branch }
     * 
     */
    public Branch createBranch() {
        return new Branch();
    }

    /**
     * Create an instance of {@link Capital }
     * 
     */
    public Capital createCapital() {
        return new Capital();
    }

    /**
     * Create an instance of {@link ChangeFond }
     * 
     */
    public ChangeFond createChangeFond() {
        return new ChangeFond();
    }

    /**
     * Create an instance of {@link ChangeName }
     * 
     */
    public ChangeName createChangeName() {
        return new ChangeName();
    }

    /**
     * Create an instance of {@link Founder }
     * 
     */
    public Founder createFounder() {
        return new Founder();
    }

    /**
     * Create an instance of {@link General }
     * 
     */
    public General createGeneral() {
        return new General();
    }

    /**
     * Create an instance of {@link GeneralR }
     * 
     */
    public GeneralR createGeneralR() {
        return new GeneralR();
    }

    /**
     * Create an instance of {@link Induty }
     * 
     */
    public Induty createInduty() {
        return new Induty();
    }

    /**
     * Create an instance of {@link ShareHolder }
     * 
     */
    public ShareHolder createShareHolder() {
        return new ShareHolder();
    }

    /**
     * Create an instance of {@link StakeHolder }
     * 
     */
    public StakeHolder createStakeHolder() {
        return new StakeHolder();
    }

    /**
     * Create an instance of {@link LegalEntityChangeData }
     * 
     */
    public LegalEntityChangeData createLegalEntityChangeData() {
        return new LegalEntityChangeData();
    }

    /**
     * Create an instance of {@link LegalEntityOpenData }
     * 
     */
    public LegalEntityOpenData createLegalEntityOpenData() {
        return new LegalEntityOpenData();
    }

    /**
     * Create an instance of {@link LegalEntityWasCriminalLiabilityData }
     * 
     */
    public LegalEntityWasCriminalLiabilityData createLegalEntityWasCriminalLiabilityData() {
        return new LegalEntityWasCriminalLiabilityData();
    }

    /**
     * Create an instance of {@link LegalEntityWasCriminalLiabilityDetailData }
     * 
     */
    public LegalEntityWasCriminalLiabilityDetailData createLegalEntityWasCriminalLiabilityDetailData() {
        return new LegalEntityWasCriminalLiabilityDetailData();
    }

    /**
     * Create an instance of {@link LegalEntityIndustryData }
     * 
     */
    public LegalEntityIndustryData createLegalEntityIndustryData() {
        return new LegalEntityIndustryData();
    }

    /**
     * Create an instance of {@link LegalEntityIndustryDetailData }
     * 
     */
    public LegalEntityIndustryDetailData createLegalEntityIndustryDetailData() {
        return new LegalEntityIndustryDetailData();
    }

    /**
     * Create an instance of {@link LegalEntityOfficialNamesData }
     * 
     */
    public LegalEntityOfficialNamesData createLegalEntityOfficialNamesData() {
        return new LegalEntityOfficialNamesData();
    }

    /**
     * Create an instance of {@link LegalEntityOfficialNamesDetailData }
     * 
     */
    public LegalEntityOfficialNamesDetailData createLegalEntityOfficialNamesDetailData() {
        return new LegalEntityOfficialNamesDetailData();
    }

    /**
     * Create an instance of {@link CheckLegalEntityData }
     * 
     */
    public CheckLegalEntityData createCheckLegalEntityData() {
        return new CheckLegalEntityData();
    }

    /**
     * Create an instance of {@link LegalEntityDoingCriminalLiabilityData }
     * 
     */
    public LegalEntityDoingCriminalLiabilityData createLegalEntityDoingCriminalLiabilityData() {
        return new LegalEntityDoingCriminalLiabilityData();
    }

    /**
     * Create an instance of {@link LegalEntityLiquidationData }
     * 
     */
    public LegalEntityLiquidationData createLegalEntityLiquidationData() {
        return new LegalEntityLiquidationData();
    }

    /**
     * Create an instance of {@link GetCustomsOffnsRequestData }
     * 
     */
    public GetCustomsOffnsRequestData createGetCustomsOffnsRequestData() {
        return new GetCustomsOffnsRequestData();
    }

    /**
     * Create an instance of {@link GetCustomsOffnsData }
     * 
     */
    public GetCustomsOffnsData createGetCustomsOffnsData() {
        return new GetCustomsOffnsData();
    }

    /**
     * Create an instance of {@link GetCustomsOffnsDetailData }
     * 
     */
    public GetCustomsOffnsDetailData createGetCustomsOffnsDetailData() {
        return new GetCustomsOffnsDetailData();
    }

    /**
     * Create an instance of {@link GetCustomsInqRequestData }
     * 
     */
    public GetCustomsInqRequestData createGetCustomsInqRequestData() {
        return new GetCustomsInqRequestData();
    }

    /**
     * Create an instance of {@link GetCustomsInqData }
     * 
     */
    public GetCustomsInqData createGetCustomsInqData() {
        return new GetCustomsInqData();
    }

    /**
     * Create an instance of {@link GetCustomsInqDetailData }
     * 
     */
    public GetCustomsInqDetailData createGetCustomsInqDetailData() {
        return new GetCustomsInqDetailData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100301GetLegalEntityInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100301GetLegalEntityInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100301_getLegalEntityInfo")
    public JAXBElement<WS100301GetLegalEntityInfo> createWS100301GetLegalEntityInfo(WS100301GetLegalEntityInfo value) {
        return new JAXBElement<WS100301GetLegalEntityInfo>(_WS100301GetLegalEntityInfo_QNAME, WS100301GetLegalEntityInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100301GetLegalEntityInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100301GetLegalEntityInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100301_getLegalEntityInfoResponse")
    public JAXBElement<WS100301GetLegalEntityInfoResponse> createWS100301GetLegalEntityInfoResponse(WS100301GetLegalEntityInfoResponse value) {
        return new JAXBElement<WS100301GetLegalEntityInfoResponse>(_WS100301GetLegalEntityInfoResponse_QNAME, WS100301GetLegalEntityInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100302GetLegalEntityChangeInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100302GetLegalEntityChangeInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100302_getLegalEntityChangeInfo")
    public JAXBElement<WS100302GetLegalEntityChangeInfo> createWS100302GetLegalEntityChangeInfo(WS100302GetLegalEntityChangeInfo value) {
        return new JAXBElement<WS100302GetLegalEntityChangeInfo>(_WS100302GetLegalEntityChangeInfo_QNAME, WS100302GetLegalEntityChangeInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100302GetLegalEntityChangeInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100302GetLegalEntityChangeInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100302_getLegalEntityChangeInfoResponse")
    public JAXBElement<WS100302GetLegalEntityChangeInfoResponse> createWS100302GetLegalEntityChangeInfoResponse(WS100302GetLegalEntityChangeInfoResponse value) {
        return new JAXBElement<WS100302GetLegalEntityChangeInfoResponse>(_WS100302GetLegalEntityChangeInfoResponse_QNAME, WS100302GetLegalEntityChangeInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100303GetLegalEntityLiquidationInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100303GetLegalEntityLiquidationInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100303_getLegalEntityLiquidationInfo")
    public JAXBElement<WS100303GetLegalEntityLiquidationInfo> createWS100303GetLegalEntityLiquidationInfo(WS100303GetLegalEntityLiquidationInfo value) {
        return new JAXBElement<WS100303GetLegalEntityLiquidationInfo>(_WS100303GetLegalEntityLiquidationInfo_QNAME, WS100303GetLegalEntityLiquidationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100303GetLegalEntityLiquidationInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100303GetLegalEntityLiquidationInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100303_getLegalEntityLiquidationInfoResponse")
    public JAXBElement<WS100303GetLegalEntityLiquidationInfoResponse> createWS100303GetLegalEntityLiquidationInfoResponse(WS100303GetLegalEntityLiquidationInfoResponse value) {
        return new JAXBElement<WS100303GetLegalEntityLiquidationInfoResponse>(_WS100303GetLegalEntityLiquidationInfoResponse_QNAME, WS100303GetLegalEntityLiquidationInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100304GetLegalEntityNewlyCreatedInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100304GetLegalEntityNewlyCreatedInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100304_getLegalEntityNewlyCreatedInfo")
    public JAXBElement<WS100304GetLegalEntityNewlyCreatedInfo> createWS100304GetLegalEntityNewlyCreatedInfo(WS100304GetLegalEntityNewlyCreatedInfo value) {
        return new JAXBElement<WS100304GetLegalEntityNewlyCreatedInfo>(_WS100304GetLegalEntityNewlyCreatedInfo_QNAME, WS100304GetLegalEntityNewlyCreatedInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100304GetLegalEntityNewlyCreatedInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100304GetLegalEntityNewlyCreatedInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100304_getLegalEntityNewlyCreatedInfoResponse")
    public JAXBElement<WS100304GetLegalEntityNewlyCreatedInfoResponse> createWS100304GetLegalEntityNewlyCreatedInfoResponse(WS100304GetLegalEntityNewlyCreatedInfoResponse value) {
        return new JAXBElement<WS100304GetLegalEntityNewlyCreatedInfoResponse>(_WS100304GetLegalEntityNewlyCreatedInfoResponse_QNAME, WS100304GetLegalEntityNewlyCreatedInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100305SearchLegalEntityName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100305SearchLegalEntityName }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100305_searchLegalEntityName")
    public JAXBElement<WS100305SearchLegalEntityName> createWS100305SearchLegalEntityName(WS100305SearchLegalEntityName value) {
        return new JAXBElement<WS100305SearchLegalEntityName>(_WS100305SearchLegalEntityName_QNAME, WS100305SearchLegalEntityName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100305SearchLegalEntityNameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100305SearchLegalEntityNameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100305_searchLegalEntityNameResponse")
    public JAXBElement<WS100305SearchLegalEntityNameResponse> createWS100305SearchLegalEntityNameResponse(WS100305SearchLegalEntityNameResponse value) {
        return new JAXBElement<WS100305SearchLegalEntityNameResponse>(_WS100305SearchLegalEntityNameResponse_QNAME, WS100305SearchLegalEntityNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100306GetNonLegalEntityInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100306GetNonLegalEntityInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100306_getNonLegalEntityInfo")
    public JAXBElement<WS100306GetNonLegalEntityInfo> createWS100306GetNonLegalEntityInfo(WS100306GetNonLegalEntityInfo value) {
        return new JAXBElement<WS100306GetNonLegalEntityInfo>(_WS100306GetNonLegalEntityInfo_QNAME, WS100306GetNonLegalEntityInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100306GetNonLegalEntityInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100306GetNonLegalEntityInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100306_getNonLegalEntityInfoResponse")
    public JAXBElement<WS100306GetNonLegalEntityInfoResponse> createWS100306GetNonLegalEntityInfoResponse(WS100306GetNonLegalEntityInfoResponse value) {
        return new JAXBElement<WS100306GetNonLegalEntityInfoResponse>(_WS100306GetNonLegalEntityInfoResponse_QNAME, WS100306GetNonLegalEntityInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100307GetLegalEntityInfoWithRegnum }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100307GetLegalEntityInfoWithRegnum }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100307_getLegalEntityInfoWithRegnum")
    public JAXBElement<WS100307GetLegalEntityInfoWithRegnum> createWS100307GetLegalEntityInfoWithRegnum(WS100307GetLegalEntityInfoWithRegnum value) {
        return new JAXBElement<WS100307GetLegalEntityInfoWithRegnum>(_WS100307GetLegalEntityInfoWithRegnum_QNAME, WS100307GetLegalEntityInfoWithRegnum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100307GetLegalEntityInfoWithRegnumResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100307GetLegalEntityInfoWithRegnumResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100307_getLegalEntityInfoWithRegnumResponse")
    public JAXBElement<WS100307GetLegalEntityInfoWithRegnumResponse> createWS100307GetLegalEntityInfoWithRegnumResponse(WS100307GetLegalEntityInfoWithRegnumResponse value) {
        return new JAXBElement<WS100307GetLegalEntityInfoWithRegnumResponse>(_WS100307GetLegalEntityInfoWithRegnumResponse_QNAME, WS100307GetLegalEntityInfoWithRegnumResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100308LegalEntityDoingCriminalLiability }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100308LegalEntityDoingCriminalLiability }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100308_legalEntityDoingCriminalLiability")
    public JAXBElement<WS100308LegalEntityDoingCriminalLiability> createWS100308LegalEntityDoingCriminalLiability(WS100308LegalEntityDoingCriminalLiability value) {
        return new JAXBElement<WS100308LegalEntityDoingCriminalLiability>(_WS100308LegalEntityDoingCriminalLiability_QNAME, WS100308LegalEntityDoingCriminalLiability.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100308LegalEntityDoingCriminalLiabilityResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100308LegalEntityDoingCriminalLiabilityResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100308_legalEntityDoingCriminalLiabilityResponse")
    public JAXBElement<WS100308LegalEntityDoingCriminalLiabilityResponse> createWS100308LegalEntityDoingCriminalLiabilityResponse(WS100308LegalEntityDoingCriminalLiabilityResponse value) {
        return new JAXBElement<WS100308LegalEntityDoingCriminalLiabilityResponse>(_WS100308LegalEntityDoingCriminalLiabilityResponse_QNAME, WS100308LegalEntityDoingCriminalLiabilityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100309LegalEntityWasCriminalLiability }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100309LegalEntityWasCriminalLiability }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100309_legalEntityWasCriminalLiability")
    public JAXBElement<WS100309LegalEntityWasCriminalLiability> createWS100309LegalEntityWasCriminalLiability(WS100309LegalEntityWasCriminalLiability value) {
        return new JAXBElement<WS100309LegalEntityWasCriminalLiability>(_WS100309LegalEntityWasCriminalLiability_QNAME, WS100309LegalEntityWasCriminalLiability.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100309LegalEntityWasCriminalLiabilityResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100309LegalEntityWasCriminalLiabilityResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100309_legalEntityWasCriminalLiabilityResponse")
    public JAXBElement<WS100309LegalEntityWasCriminalLiabilityResponse> createWS100309LegalEntityWasCriminalLiabilityResponse(WS100309LegalEntityWasCriminalLiabilityResponse value) {
        return new JAXBElement<WS100309LegalEntityWasCriminalLiabilityResponse>(_WS100309LegalEntityWasCriminalLiabilityResponse_QNAME, WS100309LegalEntityWasCriminalLiabilityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100310LegalEntityReorganizedInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100310LegalEntityReorganizedInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100310_legalEntityReorganizedInfo")
    public JAXBElement<WS100310LegalEntityReorganizedInfo> createWS100310LegalEntityReorganizedInfo(WS100310LegalEntityReorganizedInfo value) {
        return new JAXBElement<WS100310LegalEntityReorganizedInfo>(_WS100310LegalEntityReorganizedInfo_QNAME, WS100310LegalEntityReorganizedInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100310LegalEntityReorganizedInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100310LegalEntityReorganizedInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100310_legalEntityReorganizedInfoResponse")
    public JAXBElement<WS100310LegalEntityReorganizedInfoResponse> createWS100310LegalEntityReorganizedInfoResponse(WS100310LegalEntityReorganizedInfoResponse value) {
        return new JAXBElement<WS100310LegalEntityReorganizedInfoResponse>(_WS100310LegalEntityReorganizedInfoResponse_QNAME, WS100310LegalEntityReorganizedInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100311GetLegalEntityInfoToTax }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100311GetLegalEntityInfoToTax }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100311_getLegalEntityInfoToTax")
    public JAXBElement<WS100311GetLegalEntityInfoToTax> createWS100311GetLegalEntityInfoToTax(WS100311GetLegalEntityInfoToTax value) {
        return new JAXBElement<WS100311GetLegalEntityInfoToTax>(_WS100311GetLegalEntityInfoToTax_QNAME, WS100311GetLegalEntityInfoToTax.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100311GetLegalEntityInfoToTaxResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100311GetLegalEntityInfoToTaxResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100311_getLegalEntityInfoToTaxResponse")
    public JAXBElement<WS100311GetLegalEntityInfoToTaxResponse> createWS100311GetLegalEntityInfoToTaxResponse(WS100311GetLegalEntityInfoToTaxResponse value) {
        return new JAXBElement<WS100311GetLegalEntityInfoToTaxResponse>(_WS100311GetLegalEntityInfoToTaxResponse_QNAME, WS100311GetLegalEntityInfoToTaxResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100312CheckDebtOfCustomsInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100312CheckDebtOfCustomsInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100312_checkDebtOfCustomsInfo")
    public JAXBElement<WS100312CheckDebtOfCustomsInfo> createWS100312CheckDebtOfCustomsInfo(WS100312CheckDebtOfCustomsInfo value) {
        return new JAXBElement<WS100312CheckDebtOfCustomsInfo>(_WS100312CheckDebtOfCustomsInfo_QNAME, WS100312CheckDebtOfCustomsInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100312CheckDebtOfCustomsInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100312CheckDebtOfCustomsInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100312_checkDebtOfCustomsInfoResponse")
    public JAXBElement<WS100312CheckDebtOfCustomsInfoResponse> createWS100312CheckDebtOfCustomsInfoResponse(WS100312CheckDebtOfCustomsInfoResponse value) {
        return new JAXBElement<WS100312CheckDebtOfCustomsInfoResponse>(_WS100312CheckDebtOfCustomsInfoResponse_QNAME, WS100312CheckDebtOfCustomsInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100313CitizenLegalEntityList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100313CitizenLegalEntityList }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100313_citizenLegalEntityList")
    public JAXBElement<WS100313CitizenLegalEntityList> createWS100313CitizenLegalEntityList(WS100313CitizenLegalEntityList value) {
        return new JAXBElement<WS100313CitizenLegalEntityList>(_WS100313CitizenLegalEntityList_QNAME, WS100313CitizenLegalEntityList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100313CitizenLegalEntityListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100313CitizenLegalEntityListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100313_citizenLegalEntityListResponse")
    public JAXBElement<WS100313CitizenLegalEntityListResponse> createWS100313CitizenLegalEntityListResponse(WS100313CitizenLegalEntityListResponse value) {
        return new JAXBElement<WS100313CitizenLegalEntityListResponse>(_WS100313CitizenLegalEntityListResponse_QNAME, WS100313CitizenLegalEntityListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100314CitizenShareHolderCompanyInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100314CitizenShareHolderCompanyInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100314_citizenShareHolderCompanyInfo")
    public JAXBElement<WS100314CitizenShareHolderCompanyInfo> createWS100314CitizenShareHolderCompanyInfo(WS100314CitizenShareHolderCompanyInfo value) {
        return new JAXBElement<WS100314CitizenShareHolderCompanyInfo>(_WS100314CitizenShareHolderCompanyInfo_QNAME, WS100314CitizenShareHolderCompanyInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100314CitizenShareHolderCompanyInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100314CitizenShareHolderCompanyInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100314_citizenShareHolderCompanyInfoResponse")
    public JAXBElement<WS100314CitizenShareHolderCompanyInfoResponse> createWS100314CitizenShareHolderCompanyInfoResponse(WS100314CitizenShareHolderCompanyInfoResponse value) {
        return new JAXBElement<WS100314CitizenShareHolderCompanyInfoResponse>(_WS100314CitizenShareHolderCompanyInfoResponse_QNAME, WS100314CitizenShareHolderCompanyInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100315CheckLegalEntityDirector }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100315CheckLegalEntityDirector }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100315_checkLegalEntityDirector")
    public JAXBElement<WS100315CheckLegalEntityDirector> createWS100315CheckLegalEntityDirector(WS100315CheckLegalEntityDirector value) {
        return new JAXBElement<WS100315CheckLegalEntityDirector>(_WS100315CheckLegalEntityDirector_QNAME, WS100315CheckLegalEntityDirector.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100315CheckLegalEntityDirectorResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100315CheckLegalEntityDirectorResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100315_checkLegalEntityDirectorResponse")
    public JAXBElement<WS100315CheckLegalEntityDirectorResponse> createWS100315CheckLegalEntityDirectorResponse(WS100315CheckLegalEntityDirectorResponse value) {
        return new JAXBElement<WS100315CheckLegalEntityDirectorResponse>(_WS100315CheckLegalEntityDirectorResponse_QNAME, WS100315CheckLegalEntityDirectorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100316LegalEntityOpenData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100316LegalEntityOpenData }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100316_legalEntityOpenData")
    public JAXBElement<WS100316LegalEntityOpenData> createWS100316LegalEntityOpenData(WS100316LegalEntityOpenData value) {
        return new JAXBElement<WS100316LegalEntityOpenData>(_WS100316LegalEntityOpenData_QNAME, WS100316LegalEntityOpenData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100316LegalEntityOpenDataResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100316LegalEntityOpenDataResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100316_legalEntityOpenDataResponse")
    public JAXBElement<WS100316LegalEntityOpenDataResponse> createWS100316LegalEntityOpenDataResponse(WS100316LegalEntityOpenDataResponse value) {
        return new JAXBElement<WS100316LegalEntityOpenDataResponse>(_WS100316LegalEntityOpenDataResponse_QNAME, WS100316LegalEntityOpenDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100317FindLesNameInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100317FindLesNameInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100317_findLesNameInfo")
    public JAXBElement<WS100317FindLesNameInfo> createWS100317FindLesNameInfo(WS100317FindLesNameInfo value) {
        return new JAXBElement<WS100317FindLesNameInfo>(_WS100317FindLesNameInfo_QNAME, WS100317FindLesNameInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100317FindLesNameInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100317FindLesNameInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100317_findLesNameInfoResponse")
    public JAXBElement<WS100317FindLesNameInfoResponse> createWS100317FindLesNameInfoResponse(WS100317FindLesNameInfoResponse value) {
        return new JAXBElement<WS100317FindLesNameInfoResponse>(_WS100317FindLesNameInfoResponse_QNAME, WS100317FindLesNameInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100318LegalEntityOfficialNamesInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100318LegalEntityOfficialNamesInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100318_legalEntityOfficialNamesInfo")
    public JAXBElement<WS100318LegalEntityOfficialNamesInfo> createWS100318LegalEntityOfficialNamesInfo(WS100318LegalEntityOfficialNamesInfo value) {
        return new JAXBElement<WS100318LegalEntityOfficialNamesInfo>(_WS100318LegalEntityOfficialNamesInfo_QNAME, WS100318LegalEntityOfficialNamesInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100318LegalEntityOfficialNamesInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100318LegalEntityOfficialNamesInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100318_legalEntityOfficialNamesInfoResponse")
    public JAXBElement<WS100318LegalEntityOfficialNamesInfoResponse> createWS100318LegalEntityOfficialNamesInfoResponse(WS100318LegalEntityOfficialNamesInfoResponse value) {
        return new JAXBElement<WS100318LegalEntityOfficialNamesInfoResponse>(_WS100318LegalEntityOfficialNamesInfoResponse_QNAME, WS100318LegalEntityOfficialNamesInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100319LegalEntityIndustryInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100319LegalEntityIndustryInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100319_legalEntityIndustryInfo")
    public JAXBElement<WS100319LegalEntityIndustryInfo> createWS100319LegalEntityIndustryInfo(WS100319LegalEntityIndustryInfo value) {
        return new JAXBElement<WS100319LegalEntityIndustryInfo>(_WS100319LegalEntityIndustryInfo_QNAME, WS100319LegalEntityIndustryInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100319LegalEntityIndustryInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100319LegalEntityIndustryInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100319_legalEntityIndustryInfoResponse")
    public JAXBElement<WS100319LegalEntityIndustryInfoResponse> createWS100319LegalEntityIndustryInfoResponse(WS100319LegalEntityIndustryInfoResponse value) {
        return new JAXBElement<WS100319LegalEntityIndustryInfoResponse>(_WS100319LegalEntityIndustryInfoResponse_QNAME, WS100319LegalEntityIndustryInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100320CreateInqCustoms }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100320CreateInqCustoms }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100320_createInqCustoms")
    public JAXBElement<WS100320CreateInqCustoms> createWS100320CreateInqCustoms(WS100320CreateInqCustoms value) {
        return new JAXBElement<WS100320CreateInqCustoms>(_WS100320CreateInqCustoms_QNAME, WS100320CreateInqCustoms.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100320CreateInqCustomsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100320CreateInqCustomsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100320_createInqCustomsResponse")
    public JAXBElement<WS100320CreateInqCustomsResponse> createWS100320CreateInqCustomsResponse(WS100320CreateInqCustomsResponse value) {
        return new JAXBElement<WS100320CreateInqCustomsResponse>(_WS100320CreateInqCustomsResponse_QNAME, WS100320CreateInqCustomsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100321GetCustomsInqInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100321GetCustomsInqInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100321_getCustomsInqInfo")
    public JAXBElement<WS100321GetCustomsInqInfo> createWS100321GetCustomsInqInfo(WS100321GetCustomsInqInfo value) {
        return new JAXBElement<WS100321GetCustomsInqInfo>(_WS100321GetCustomsInqInfo_QNAME, WS100321GetCustomsInqInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100321GetCustomsInqInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100321GetCustomsInqInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100321_getCustomsInqInfoResponse")
    public JAXBElement<WS100321GetCustomsInqInfoResponse> createWS100321GetCustomsInqInfoResponse(WS100321GetCustomsInqInfoResponse value) {
        return new JAXBElement<WS100321GetCustomsInqInfoResponse>(_WS100321GetCustomsInqInfoResponse_QNAME, WS100321GetCustomsInqInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100322LegalEntityIndustryLicenseInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100322LegalEntityIndustryLicenseInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100322_legalEntityIndustryLicenseInfo")
    public JAXBElement<WS100322LegalEntityIndustryLicenseInfo> createWS100322LegalEntityIndustryLicenseInfo(WS100322LegalEntityIndustryLicenseInfo value) {
        return new JAXBElement<WS100322LegalEntityIndustryLicenseInfo>(_WS100322LegalEntityIndustryLicenseInfo_QNAME, WS100322LegalEntityIndustryLicenseInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100322LegalEntityIndustryLicenseInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100322LegalEntityIndustryLicenseInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100322_legalEntityIndustryLicenseInfoResponse")
    public JAXBElement<WS100322LegalEntityIndustryLicenseInfoResponse> createWS100322LegalEntityIndustryLicenseInfoResponse(WS100322LegalEntityIndustryLicenseInfoResponse value) {
        return new JAXBElement<WS100322LegalEntityIndustryLicenseInfoResponse>(_WS100322LegalEntityIndustryLicenseInfoResponse_QNAME, WS100322LegalEntityIndustryLicenseInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100323LegalEntityNonPaymentInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100323LegalEntityNonPaymentInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100323_legalEntityNonPaymentInfo")
    public JAXBElement<WS100323LegalEntityNonPaymentInfo> createWS100323LegalEntityNonPaymentInfo(WS100323LegalEntityNonPaymentInfo value) {
        return new JAXBElement<WS100323LegalEntityNonPaymentInfo>(_WS100323LegalEntityNonPaymentInfo_QNAME, WS100323LegalEntityNonPaymentInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100323LegalEntityNonPaymentInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100323LegalEntityNonPaymentInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100323_legalEntityNonPaymentInfoResponse")
    public JAXBElement<WS100323LegalEntityNonPaymentInfoResponse> createWS100323LegalEntityNonPaymentInfoResponse(WS100323LegalEntityNonPaymentInfoResponse value) {
        return new JAXBElement<WS100323LegalEntityNonPaymentInfoResponse>(_WS100323LegalEntityNonPaymentInfoResponse_QNAME, WS100323LegalEntityNonPaymentInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100324LegalEntityGeneralInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100324LegalEntityGeneralInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100324_legalEntityGeneralInfo")
    public JAXBElement<WS100324LegalEntityGeneralInfo> createWS100324LegalEntityGeneralInfo(WS100324LegalEntityGeneralInfo value) {
        return new JAXBElement<WS100324LegalEntityGeneralInfo>(_WS100324LegalEntityGeneralInfo_QNAME, WS100324LegalEntityGeneralInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100324LegalEntityGeneralInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100324LegalEntityGeneralInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100324_legalEntityGeneralInfoResponse")
    public JAXBElement<WS100324LegalEntityGeneralInfoResponse> createWS100324LegalEntityGeneralInfoResponse(WS100324LegalEntityGeneralInfoResponse value) {
        return new JAXBElement<WS100324LegalEntityGeneralInfoResponse>(_WS100324LegalEntityGeneralInfoResponse_QNAME, WS100324LegalEntityGeneralInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100325LegalEntityFinalOwnerInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100325LegalEntityFinalOwnerInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100325_legalEntityFinalOwnerInfo")
    public JAXBElement<WS100325LegalEntityFinalOwnerInfo> createWS100325LegalEntityFinalOwnerInfo(WS100325LegalEntityFinalOwnerInfo value) {
        return new JAXBElement<WS100325LegalEntityFinalOwnerInfo>(_WS100325LegalEntityFinalOwnerInfo_QNAME, WS100325LegalEntityFinalOwnerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100325LegalEntityFinalOwnerInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100325LegalEntityFinalOwnerInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100325_legalEntityFinalOwnerInfoResponse")
    public JAXBElement<WS100325LegalEntityFinalOwnerInfoResponse> createWS100325LegalEntityFinalOwnerInfoResponse(WS100325LegalEntityFinalOwnerInfoResponse value) {
        return new JAXBElement<WS100325LegalEntityFinalOwnerInfoResponse>(_WS100325LegalEntityFinalOwnerInfoResponse_QNAME, WS100325LegalEntityFinalOwnerInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100326LegalEntityStampInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100326LegalEntityStampInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100326_legalEntityStampInfo")
    public JAXBElement<WS100326LegalEntityStampInfo> createWS100326LegalEntityStampInfo(WS100326LegalEntityStampInfo value) {
        return new JAXBElement<WS100326LegalEntityStampInfo>(_WS100326LegalEntityStampInfo_QNAME, WS100326LegalEntityStampInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100326LegalEntityStampInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100326LegalEntityStampInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100326_legalEntityStampInfoResponse")
    public JAXBElement<WS100326LegalEntityStampInfoResponse> createWS100326LegalEntityStampInfoResponse(WS100326LegalEntityStampInfoResponse value) {
        return new JAXBElement<WS100326LegalEntityStampInfoResponse>(_WS100326LegalEntityStampInfoResponse_QNAME, WS100326LegalEntityStampInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100327GetCustomsOffnsInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100327GetCustomsOffnsInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100327_getCustomsOffnsInfo")
    public JAXBElement<WS100327GetCustomsOffnsInfo> createWS100327GetCustomsOffnsInfo(WS100327GetCustomsOffnsInfo value) {
        return new JAXBElement<WS100327GetCustomsOffnsInfo>(_WS100327GetCustomsOffnsInfo_QNAME, WS100327GetCustomsOffnsInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100327GetCustomsOffnsInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100327GetCustomsOffnsInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100327_getCustomsOffnsInfoResponse")
    public JAXBElement<WS100327GetCustomsOffnsInfoResponse> createWS100327GetCustomsOffnsInfoResponse(WS100327GetCustomsOffnsInfoResponse value) {
        return new JAXBElement<WS100327GetCustomsOffnsInfoResponse>(_WS100327GetCustomsOffnsInfoResponse_QNAME, WS100327GetCustomsOffnsInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100328CheckLegalEntityNameInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100328CheckLegalEntityNameInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100328_checkLegalEntityNameInfo")
    public JAXBElement<WS100328CheckLegalEntityNameInfo> createWS100328CheckLegalEntityNameInfo(WS100328CheckLegalEntityNameInfo value) {
        return new JAXBElement<WS100328CheckLegalEntityNameInfo>(_WS100328CheckLegalEntityNameInfo_QNAME, WS100328CheckLegalEntityNameInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100328CheckLegalEntityNameInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100328CheckLegalEntityNameInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100328_checkLegalEntityNameInfoResponse")
    public JAXBElement<WS100328CheckLegalEntityNameInfoResponse> createWS100328CheckLegalEntityNameInfoResponse(WS100328CheckLegalEntityNameInfoResponse value) {
        return new JAXBElement<WS100328CheckLegalEntityNameInfoResponse>(_WS100328CheckLegalEntityNameInfoResponse_QNAME, WS100328CheckLegalEntityNameInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100329EnergyLicenseCertificateInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100329EnergyLicenseCertificateInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100329_energyLicenseCertificateInfo")
    public JAXBElement<WS100329EnergyLicenseCertificateInfo> createWS100329EnergyLicenseCertificateInfo(WS100329EnergyLicenseCertificateInfo value) {
        return new JAXBElement<WS100329EnergyLicenseCertificateInfo>(_WS100329EnergyLicenseCertificateInfo_QNAME, WS100329EnergyLicenseCertificateInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100329EnergyLicenseCertificateInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100329EnergyLicenseCertificateInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100329_energyLicenseCertificateInfoResponse")
    public JAXBElement<WS100329EnergyLicenseCertificateInfoResponse> createWS100329EnergyLicenseCertificateInfoResponse(WS100329EnergyLicenseCertificateInfoResponse value) {
        return new JAXBElement<WS100329EnergyLicenseCertificateInfoResponse>(_WS100329EnergyLicenseCertificateInfoResponse_QNAME, WS100329EnergyLicenseCertificateInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100330LiquidationInfoService }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100330LiquidationInfoService }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100330_liquidationInfoService")
    public JAXBElement<WS100330LiquidationInfoService> createWS100330LiquidationInfoService(WS100330LiquidationInfoService value) {
        return new JAXBElement<WS100330LiquidationInfoService>(_WS100330LiquidationInfoService_QNAME, WS100330LiquidationInfoService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS100330LiquidationInfoServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS100330LiquidationInfoServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://les.xyp.gov.mn/", name = "WS100330_liquidationInfoServiceResponse")
    public JAXBElement<WS100330LiquidationInfoServiceResponse> createWS100330LiquidationInfoServiceResponse(WS100330LiquidationInfoServiceResponse value) {
        return new JAXBElement<WS100330LiquidationInfoServiceResponse>(_WS100330LiquidationInfoServiceResponse_QNAME, WS100330LiquidationInfoServiceResponse.class, null, value);
    }

}
