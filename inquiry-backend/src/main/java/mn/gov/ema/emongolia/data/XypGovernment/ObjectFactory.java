
package mn.gov.ema.emongolia.data.XypGovernment;

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
 * generated in the mn.gov.itc.emongolia.data.XypGovernment package. 
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

    private final static QName _GS10001CitizenDiagnosisInfo_QNAME = new QName("http://government.xyp.gov.mn/", "GS10001_citizenDiagnosisInfo");
    private final static QName _GS10001CitizenDiagnosisInfoResponse_QNAME = new QName("http://government.xyp.gov.mn/", "GS10001_citizenDiagnosisInfoResponse");
    private final static QName _GS10002CitizenCovid19EPass_QNAME = new QName("http://government.xyp.gov.mn/", "GS10002_citizenCovid19EPass");
    private final static QName _GS10002CitizenCovid19EPassResponse_QNAME = new QName("http://government.xyp.gov.mn/", "GS10002_citizenCovid19EPassResponse");
    private final static QName _GS10003LegalEntityBranchInfo_QNAME = new QName("http://government.xyp.gov.mn/", "GS10003_legalEntityBranchInfo");
    private final static QName _GS10003LegalEntityBranchInfoResponse_QNAME = new QName("http://government.xyp.gov.mn/", "GS10003_legalEntityBranchInfoResponse");
    private final static QName _GS10004LegalEntityClosuresInfo_QNAME = new QName("http://government.xyp.gov.mn/", "GS10004_legalEntityClosuresInfo");
    private final static QName _GS10004LegalEntityClosuresInfoResponse_QNAME = new QName("http://government.xyp.gov.mn/", "GS10004_legalEntityClosuresInfoResponse");
    private final static QName _GS10005LegalEntityFounderInfo_QNAME = new QName("http://government.xyp.gov.mn/", "GS10005_legalEntityFounderInfo");
    private final static QName _GS10005LegalEntityFounderInfoResponse_QNAME = new QName("http://government.xyp.gov.mn/", "GS10005_legalEntityFounderInfoResponse");
    private final static QName _GS10006LegalEntityIndustryInfo_QNAME = new QName("http://government.xyp.gov.mn/", "GS10006_legalEntityIndustryInfo");
    private final static QName _GS10006LegalEntityIndustryInfoResponse_QNAME = new QName("http://government.xyp.gov.mn/", "GS10006_legalEntityIndustryInfoResponse");
    private final static QName _GS10007LegalEntityOwnerInfo_QNAME = new QName("http://government.xyp.gov.mn/", "GS10007_legalEntityOwnerInfo");
    private final static QName _GS10007LegalEntityOwnerInfoResponse_QNAME = new QName("http://government.xyp.gov.mn/", "GS10007_legalEntityOwnerInfoResponse");
    private final static QName _GS10008LegalEntityGeneralInfo_QNAME = new QName("http://government.xyp.gov.mn/", "GS10008_legalEntityGeneralInfo");
    private final static QName _GS10008LegalEntityGeneralInfoResponse_QNAME = new QName("http://government.xyp.gov.mn/", "GS10008_legalEntityGeneralInfoResponse");
    private final static QName _GS10009LegalEntityShareHolderInfo_QNAME = new QName("http://government.xyp.gov.mn/", "GS10009_legalEntityShareHolderInfo");
    private final static QName _GS10009LegalEntityShareHolderInfoResponse_QNAME = new QName("http://government.xyp.gov.mn/", "GS10009_legalEntityShareHolderInfoResponse");
    private final static QName _GS10010LegalEntityStakeHolderInfo_QNAME = new QName("http://government.xyp.gov.mn/", "GS10010_legalEntityStakeHolderInfo");
    private final static QName _GS10010LegalEntityStakeHolderInfoResponse_QNAME = new QName("http://government.xyp.gov.mn/", "GS10010_legalEntityStakeHolderInfoResponse");
    private final static QName _GS10011ChildrenBirthInfo_QNAME = new QName("http://government.xyp.gov.mn/", "GS10011_childrenBirthInfo");
    private final static QName _GS10011ChildrenBirthInfoResponse_QNAME = new QName("http://government.xyp.gov.mn/", "GS10011_childrenBirthInfoResponse");
    private final static QName _GS10012CitizenAddressArrivedInfo_QNAME = new QName("http://government.xyp.gov.mn/", "GS10012_citizenAddressArrivedInfo");
    private final static QName _GS10012CitizenAddressArrivedInfoResponse_QNAME = new QName("http://government.xyp.gov.mn/", "GS10012_citizenAddressArrivedInfoResponse");
    private final static QName _GS10013CitizenChangeNameInfo_QNAME = new QName("http://government.xyp.gov.mn/", "GS10013_citizenChangeNameInfo");
    private final static QName _GS10013CitizenChangeNameInfoResponse_QNAME = new QName("http://government.xyp.gov.mn/", "GS10013_citizenChangeNameInfoResponse");
    private final static QName _GS10014CitizenChangeRegnumInfo_QNAME = new QName("http://government.xyp.gov.mn/", "GS10014_citizenChangeRegnumInfo");
    private final static QName _GS10014CitizenChangeRegnumInfoResponse_QNAME = new QName("http://government.xyp.gov.mn/", "GS10014_citizenChangeRegnumInfoResponse");
    private final static QName _GS10015CitizenIDCardFirstTimeInfo_QNAME = new QName("http://government.xyp.gov.mn/", "GS10015_citizenIDCardFirstTimeInfo");
    private final static QName _GS10015CitizenIDCardFirstTimeInfoResponse_QNAME = new QName("http://government.xyp.gov.mn/", "GS10015_citizenIDCardFirstTimeInfoResponse");
    private final static QName _GS10016Covid19MedicalCertificateInfo_QNAME = new QName("http://government.xyp.gov.mn/", "GS10016_covid19MedicalCertificateInfo");
    private final static QName _GS10016Covid19MedicalCertificateInfoResponse_QNAME = new QName("http://government.xyp.gov.mn/", "GS10016_covid19MedicalCertificateInfoResponse");
    private final static QName _GS10017CitizenInternationalCert_QNAME = new QName("http://government.xyp.gov.mn/", "GS10017_citizenInternationalCert");
    private final static QName _GS10017CitizenInternationalCertResponse_QNAME = new QName("http://government.xyp.gov.mn/", "GS10017_citizenInternationalCertResponse");
    private final static QName _GS10018ForeignCitizenInternationalCert_QNAME = new QName("http://government.xyp.gov.mn/", "GS10018_foreignCitizenInternationalCert");
    private final static QName _GS10018ForeignCitizenInternationalCertResponse_QNAME = new QName("http://government.xyp.gov.mn/", "GS10018_foreignCitizenInternationalCertResponse");
    private final static QName _GS10019FirearmOwnerCertificateInfo_QNAME = new QName("http://government.xyp.gov.mn/", "GS10019_firearmOwnerCertificateInfo");
    private final static QName _GS10019FirearmOwnerCertificateInfoResponse_QNAME = new QName("http://government.xyp.gov.mn/", "GS10019_firearmOwnerCertificateInfoResponse");
    private final static QName _GS10020NonAdultCitizenInfo_QNAME = new QName("http://government.xyp.gov.mn/", "GS10020_nonAdultCitizenInfo");
    private final static QName _GS10020NonAdultCitizenInfoResponse_QNAME = new QName("http://government.xyp.gov.mn/", "GS10020_nonAdultCitizenInfoResponse");
    private final static QName _GS10021CovidVaccineDoseCount_QNAME = new QName("http://government.xyp.gov.mn/", "GS10021_covidVaccineDoseCount");
    private final static QName _GS10021CovidVaccineDoseCountResponse_QNAME = new QName("http://government.xyp.gov.mn/", "GS10021_covidVaccineDoseCountResponse");
    private final static QName _GS10022StudentSoldierInfo_QNAME = new QName("http://government.xyp.gov.mn/", "GS10022_studentSoldierInfo");
    private final static QName _GS10022StudentSoldierInfoResponse_QNAME = new QName("http://government.xyp.gov.mn/", "GS10022_studentSoldierInfoResponse");
    private final static QName _GS10023NotaryTrustInfo_QNAME = new QName("http://government.xyp.gov.mn/", "GS10023_notaryTrustInfo");
    private final static QName _GS10023NotaryTrustInfoResponse_QNAME = new QName("http://government.xyp.gov.mn/", "GS10023_notaryTrustInfoResponse");
    private final static QName _GS10024NotaryVehicleInfo_QNAME = new QName("http://government.xyp.gov.mn/", "GS10024_notaryVehicleInfo");
    private final static QName _GS10024NotaryVehicleInfoResponse_QNAME = new QName("http://government.xyp.gov.mn/", "GS10024_notaryVehicleInfoResponse");
    private final static QName _GS10025NotaryTrustArchivedInfo_QNAME = new QName("http://government.xyp.gov.mn/", "GS10025_notaryTrustArchivedInfo");
    private final static QName _GS10025NotaryTrustArchivedInfoResponse_QNAME = new QName("http://government.xyp.gov.mn/", "GS10025_notaryTrustArchivedInfoResponse");
    private final static QName _GS10026CitizenIDCardInfoEng_QNAME = new QName("http://government.xyp.gov.mn/", "GS10026_citizenIDCardInfoEng");
    private final static QName _GS10026CitizenIDCardInfoEngResponse_QNAME = new QName("http://government.xyp.gov.mn/", "GS10026_citizenIDCardInfoEngResponse");
    private final static QName _GS10027CitizenBirthInfoEng_QNAME = new QName("http://government.xyp.gov.mn/", "GS10027_citizenBirthInfoEng");
    private final static QName _GS10027CitizenBirthInfoEngResponse_QNAME = new QName("http://government.xyp.gov.mn/", "GS10027_citizenBirthInfoEngResponse");
    private final static QName _GS10028CitizenNonPaymentEngInfo_QNAME = new QName("http://government.xyp.gov.mn/", "GS10028_citizenNonPaymentEngInfo");
    private final static QName _GS10028CitizenNonPaymentEngInfoResponse_QNAME = new QName("http://government.xyp.gov.mn/", "GS10028_citizenNonPaymentEngInfoResponse");
    private final static QName _GS10029CitizenNoMarriageInfoData_QNAME = new QName("http://government.xyp.gov.mn/", "GS10029_citizenNoMarriageInfoData");
    private final static QName _GS10029CitizenNoMarriageInfoDataResponse_QNAME = new QName("http://government.xyp.gov.mn/", "GS10029_citizenNoMarriageInfoDataResponse");
    private final static QName _GS10030CitizenMarriageInfoEng_QNAME = new QName("http://government.xyp.gov.mn/", "GS10030_citizenMarriageInfoEng");
    private final static QName _GS10030CitizenMarriageInfoEngResponse_QNAME = new QName("http://government.xyp.gov.mn/", "GS10030_citizenMarriageInfoEngResponse");
    private final static QName _GS10031SsoPhoneCheck_QNAME = new QName("http://government.xyp.gov.mn/", "GS10031_ssoPhoneCheck");
    private final static QName _GS10031SsoPhoneCheckResponse_QNAME = new QName("http://government.xyp.gov.mn/", "GS10031_ssoPhoneCheckResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mn.gov.itc.emongolia.data.XypGovernment
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GS10001CitizenDiagnosisInfo }
     * 
     */
    public GS10001CitizenDiagnosisInfo createGS10001CitizenDiagnosisInfo() {
        return new GS10001CitizenDiagnosisInfo();
    }

    /**
     * Create an instance of {@link GS10001CitizenDiagnosisInfoResponse }
     * 
     */
    public GS10001CitizenDiagnosisInfoResponse createGS10001CitizenDiagnosisInfoResponse() {
        return new GS10001CitizenDiagnosisInfoResponse();
    }

    /**
     * Create an instance of {@link GS10002CitizenCovid19EPass }
     * 
     */
    public GS10002CitizenCovid19EPass createGS10002CitizenCovid19EPass() {
        return new GS10002CitizenCovid19EPass();
    }

    /**
     * Create an instance of {@link GS10002CitizenCovid19EPassResponse }
     * 
     */
    public GS10002CitizenCovid19EPassResponse createGS10002CitizenCovid19EPassResponse() {
        return new GS10002CitizenCovid19EPassResponse();
    }

    /**
     * Create an instance of {@link GS10003LegalEntityBranchInfo }
     * 
     */
    public GS10003LegalEntityBranchInfo createGS10003LegalEntityBranchInfo() {
        return new GS10003LegalEntityBranchInfo();
    }

    /**
     * Create an instance of {@link GS10003LegalEntityBranchInfoResponse }
     * 
     */
    public GS10003LegalEntityBranchInfoResponse createGS10003LegalEntityBranchInfoResponse() {
        return new GS10003LegalEntityBranchInfoResponse();
    }

    /**
     * Create an instance of {@link GS10004LegalEntityClosuresInfo }
     * 
     */
    public GS10004LegalEntityClosuresInfo createGS10004LegalEntityClosuresInfo() {
        return new GS10004LegalEntityClosuresInfo();
    }

    /**
     * Create an instance of {@link GS10004LegalEntityClosuresInfoResponse }
     * 
     */
    public GS10004LegalEntityClosuresInfoResponse createGS10004LegalEntityClosuresInfoResponse() {
        return new GS10004LegalEntityClosuresInfoResponse();
    }

    /**
     * Create an instance of {@link GS10005LegalEntityFounderInfo }
     * 
     */
    public GS10005LegalEntityFounderInfo createGS10005LegalEntityFounderInfo() {
        return new GS10005LegalEntityFounderInfo();
    }

    /**
     * Create an instance of {@link GS10005LegalEntityFounderInfoResponse }
     * 
     */
    public GS10005LegalEntityFounderInfoResponse createGS10005LegalEntityFounderInfoResponse() {
        return new GS10005LegalEntityFounderInfoResponse();
    }

    /**
     * Create an instance of {@link GS10006LegalEntityIndustryInfo }
     * 
     */
    public GS10006LegalEntityIndustryInfo createGS10006LegalEntityIndustryInfo() {
        return new GS10006LegalEntityIndustryInfo();
    }

    /**
     * Create an instance of {@link GS10006LegalEntityIndustryInfoResponse }
     * 
     */
    public GS10006LegalEntityIndustryInfoResponse createGS10006LegalEntityIndustryInfoResponse() {
        return new GS10006LegalEntityIndustryInfoResponse();
    }

    /**
     * Create an instance of {@link GS10007LegalEntityOwnerInfo }
     * 
     */
    public GS10007LegalEntityOwnerInfo createGS10007LegalEntityOwnerInfo() {
        return new GS10007LegalEntityOwnerInfo();
    }

    /**
     * Create an instance of {@link GS10007LegalEntityOwnerInfoResponse }
     * 
     */
    public GS10007LegalEntityOwnerInfoResponse createGS10007LegalEntityOwnerInfoResponse() {
        return new GS10007LegalEntityOwnerInfoResponse();
    }

    /**
     * Create an instance of {@link GS10008LegalEntityGeneralInfo }
     * 
     */
    public GS10008LegalEntityGeneralInfo createGS10008LegalEntityGeneralInfo() {
        return new GS10008LegalEntityGeneralInfo();
    }

    /**
     * Create an instance of {@link GS10008LegalEntityGeneralInfoResponse }
     * 
     */
    public GS10008LegalEntityGeneralInfoResponse createGS10008LegalEntityGeneralInfoResponse() {
        return new GS10008LegalEntityGeneralInfoResponse();
    }

    /**
     * Create an instance of {@link GS10009LegalEntityShareHolderInfo }
     * 
     */
    public GS10009LegalEntityShareHolderInfo createGS10009LegalEntityShareHolderInfo() {
        return new GS10009LegalEntityShareHolderInfo();
    }

    /**
     * Create an instance of {@link GS10009LegalEntityShareHolderInfoResponse }
     * 
     */
    public GS10009LegalEntityShareHolderInfoResponse createGS10009LegalEntityShareHolderInfoResponse() {
        return new GS10009LegalEntityShareHolderInfoResponse();
    }

    /**
     * Create an instance of {@link GS10010LegalEntityStakeHolderInfo }
     * 
     */
    public GS10010LegalEntityStakeHolderInfo createGS10010LegalEntityStakeHolderInfo() {
        return new GS10010LegalEntityStakeHolderInfo();
    }

    /**
     * Create an instance of {@link GS10010LegalEntityStakeHolderInfoResponse }
     * 
     */
    public GS10010LegalEntityStakeHolderInfoResponse createGS10010LegalEntityStakeHolderInfoResponse() {
        return new GS10010LegalEntityStakeHolderInfoResponse();
    }

    /**
     * Create an instance of {@link GS10011ChildrenBirthInfo }
     * 
     */
    public GS10011ChildrenBirthInfo createGS10011ChildrenBirthInfo() {
        return new GS10011ChildrenBirthInfo();
    }

    /**
     * Create an instance of {@link GS10011ChildrenBirthInfoResponse }
     * 
     */
    public GS10011ChildrenBirthInfoResponse createGS10011ChildrenBirthInfoResponse() {
        return new GS10011ChildrenBirthInfoResponse();
    }

    /**
     * Create an instance of {@link GS10012CitizenAddressArrivedInfo }
     * 
     */
    public GS10012CitizenAddressArrivedInfo createGS10012CitizenAddressArrivedInfo() {
        return new GS10012CitizenAddressArrivedInfo();
    }

    /**
     * Create an instance of {@link GS10012CitizenAddressArrivedInfoResponse }
     * 
     */
    public GS10012CitizenAddressArrivedInfoResponse createGS10012CitizenAddressArrivedInfoResponse() {
        return new GS10012CitizenAddressArrivedInfoResponse();
    }

    /**
     * Create an instance of {@link GS10013CitizenChangeNameInfo }
     * 
     */
    public GS10013CitizenChangeNameInfo createGS10013CitizenChangeNameInfo() {
        return new GS10013CitizenChangeNameInfo();
    }

    /**
     * Create an instance of {@link GS10013CitizenChangeNameInfoResponse }
     * 
     */
    public GS10013CitizenChangeNameInfoResponse createGS10013CitizenChangeNameInfoResponse() {
        return new GS10013CitizenChangeNameInfoResponse();
    }

    /**
     * Create an instance of {@link GS10014CitizenChangeRegnumInfo }
     * 
     */
    public GS10014CitizenChangeRegnumInfo createGS10014CitizenChangeRegnumInfo() {
        return new GS10014CitizenChangeRegnumInfo();
    }

    /**
     * Create an instance of {@link GS10014CitizenChangeRegnumInfoResponse }
     * 
     */
    public GS10014CitizenChangeRegnumInfoResponse createGS10014CitizenChangeRegnumInfoResponse() {
        return new GS10014CitizenChangeRegnumInfoResponse();
    }

    /**
     * Create an instance of {@link GS10015CitizenIDCardFirstTimeInfo }
     * 
     */
    public GS10015CitizenIDCardFirstTimeInfo createGS10015CitizenIDCardFirstTimeInfo() {
        return new GS10015CitizenIDCardFirstTimeInfo();
    }

    /**
     * Create an instance of {@link GS10015CitizenIDCardFirstTimeInfoResponse }
     * 
     */
    public GS10015CitizenIDCardFirstTimeInfoResponse createGS10015CitizenIDCardFirstTimeInfoResponse() {
        return new GS10015CitizenIDCardFirstTimeInfoResponse();
    }

    /**
     * Create an instance of {@link GS10016Covid19MedicalCertificateInfo }
     * 
     */
    public GS10016Covid19MedicalCertificateInfo createGS10016Covid19MedicalCertificateInfo() {
        return new GS10016Covid19MedicalCertificateInfo();
    }

    /**
     * Create an instance of {@link GS10016Covid19MedicalCertificateInfoResponse }
     * 
     */
    public GS10016Covid19MedicalCertificateInfoResponse createGS10016Covid19MedicalCertificateInfoResponse() {
        return new GS10016Covid19MedicalCertificateInfoResponse();
    }

    /**
     * Create an instance of {@link GS10017CitizenInternationalCert }
     * 
     */
    public GS10017CitizenInternationalCert createGS10017CitizenInternationalCert() {
        return new GS10017CitizenInternationalCert();
    }

    /**
     * Create an instance of {@link GS10017CitizenInternationalCertResponse }
     * 
     */
    public GS10017CitizenInternationalCertResponse createGS10017CitizenInternationalCertResponse() {
        return new GS10017CitizenInternationalCertResponse();
    }

    /**
     * Create an instance of {@link GS10018ForeignCitizenInternationalCert }
     * 
     */
    public GS10018ForeignCitizenInternationalCert createGS10018ForeignCitizenInternationalCert() {
        return new GS10018ForeignCitizenInternationalCert();
    }

    /**
     * Create an instance of {@link GS10018ForeignCitizenInternationalCertResponse }
     * 
     */
    public GS10018ForeignCitizenInternationalCertResponse createGS10018ForeignCitizenInternationalCertResponse() {
        return new GS10018ForeignCitizenInternationalCertResponse();
    }

    /**
     * Create an instance of {@link GS10019FirearmOwnerCertificateInfo }
     * 
     */
    public GS10019FirearmOwnerCertificateInfo createGS10019FirearmOwnerCertificateInfo() {
        return new GS10019FirearmOwnerCertificateInfo();
    }

    /**
     * Create an instance of {@link GS10019FirearmOwnerCertificateInfoResponse }
     * 
     */
    public GS10019FirearmOwnerCertificateInfoResponse createGS10019FirearmOwnerCertificateInfoResponse() {
        return new GS10019FirearmOwnerCertificateInfoResponse();
    }

    /**
     * Create an instance of {@link GS10020NonAdultCitizenInfo }
     * 
     */
    public GS10020NonAdultCitizenInfo createGS10020NonAdultCitizenInfo() {
        return new GS10020NonAdultCitizenInfo();
    }

    /**
     * Create an instance of {@link GS10020NonAdultCitizenInfoResponse }
     * 
     */
    public GS10020NonAdultCitizenInfoResponse createGS10020NonAdultCitizenInfoResponse() {
        return new GS10020NonAdultCitizenInfoResponse();
    }

    /**
     * Create an instance of {@link GS10021CovidVaccineDoseCount }
     * 
     */
    public GS10021CovidVaccineDoseCount createGS10021CovidVaccineDoseCount() {
        return new GS10021CovidVaccineDoseCount();
    }

    /**
     * Create an instance of {@link GS10021CovidVaccineDoseCountResponse }
     * 
     */
    public GS10021CovidVaccineDoseCountResponse createGS10021CovidVaccineDoseCountResponse() {
        return new GS10021CovidVaccineDoseCountResponse();
    }

    /**
     * Create an instance of {@link GS10022StudentSoldierInfo }
     * 
     */
    public GS10022StudentSoldierInfo createGS10022StudentSoldierInfo() {
        return new GS10022StudentSoldierInfo();
    }

    /**
     * Create an instance of {@link GS10022StudentSoldierInfoResponse }
     * 
     */
    public GS10022StudentSoldierInfoResponse createGS10022StudentSoldierInfoResponse() {
        return new GS10022StudentSoldierInfoResponse();
    }

    /**
     * Create an instance of {@link GS10023NotaryTrustInfo }
     * 
     */
    public GS10023NotaryTrustInfo createGS10023NotaryTrustInfo() {
        return new GS10023NotaryTrustInfo();
    }

    /**
     * Create an instance of {@link GS10023NotaryTrustInfoResponse }
     * 
     */
    public GS10023NotaryTrustInfoResponse createGS10023NotaryTrustInfoResponse() {
        return new GS10023NotaryTrustInfoResponse();
    }

    /**
     * Create an instance of {@link GS10024NotaryVehicleInfo }
     * 
     */
    public GS10024NotaryVehicleInfo createGS10024NotaryVehicleInfo() {
        return new GS10024NotaryVehicleInfo();
    }

    /**
     * Create an instance of {@link GS10024NotaryVehicleInfoResponse }
     * 
     */
    public GS10024NotaryVehicleInfoResponse createGS10024NotaryVehicleInfoResponse() {
        return new GS10024NotaryVehicleInfoResponse();
    }

    /**
     * Create an instance of {@link GS10025NotaryTrustArchivedInfo }
     * 
     */
    public GS10025NotaryTrustArchivedInfo createGS10025NotaryTrustArchivedInfo() {
        return new GS10025NotaryTrustArchivedInfo();
    }

    /**
     * Create an instance of {@link GS10025NotaryTrustArchivedInfoResponse }
     * 
     */
    public GS10025NotaryTrustArchivedInfoResponse createGS10025NotaryTrustArchivedInfoResponse() {
        return new GS10025NotaryTrustArchivedInfoResponse();
    }

    /**
     * Create an instance of {@link GS10026CitizenIDCardInfoEng }
     * 
     */
    public GS10026CitizenIDCardInfoEng createGS10026CitizenIDCardInfoEng() {
        return new GS10026CitizenIDCardInfoEng();
    }

    /**
     * Create an instance of {@link GS10026CitizenIDCardInfoEngResponse }
     * 
     */
    public GS10026CitizenIDCardInfoEngResponse createGS10026CitizenIDCardInfoEngResponse() {
        return new GS10026CitizenIDCardInfoEngResponse();
    }

    /**
     * Create an instance of {@link GS10027CitizenBirthInfoEng }
     * 
     */
    public GS10027CitizenBirthInfoEng createGS10027CitizenBirthInfoEng() {
        return new GS10027CitizenBirthInfoEng();
    }

    /**
     * Create an instance of {@link GS10027CitizenBirthInfoEngResponse }
     * 
     */
    public GS10027CitizenBirthInfoEngResponse createGS10027CitizenBirthInfoEngResponse() {
        return new GS10027CitizenBirthInfoEngResponse();
    }

    /**
     * Create an instance of {@link GS10028CitizenNonPaymentEngInfo }
     * 
     */
    public GS10028CitizenNonPaymentEngInfo createGS10028CitizenNonPaymentEngInfo() {
        return new GS10028CitizenNonPaymentEngInfo();
    }

    /**
     * Create an instance of {@link GS10028CitizenNonPaymentEngInfoResponse }
     * 
     */
    public GS10028CitizenNonPaymentEngInfoResponse createGS10028CitizenNonPaymentEngInfoResponse() {
        return new GS10028CitizenNonPaymentEngInfoResponse();
    }

    /**
     * Create an instance of {@link GS10029CitizenNoMarriageInfoData }
     * 
     */
    public GS10029CitizenNoMarriageInfoData createGS10029CitizenNoMarriageInfoData() {
        return new GS10029CitizenNoMarriageInfoData();
    }

    /**
     * Create an instance of {@link GS10029CitizenNoMarriageInfoDataResponse }
     * 
     */
    public GS10029CitizenNoMarriageInfoDataResponse createGS10029CitizenNoMarriageInfoDataResponse() {
        return new GS10029CitizenNoMarriageInfoDataResponse();
    }

    /**
     * Create an instance of {@link GS10030CitizenMarriageInfoEng }
     * 
     */
    public GS10030CitizenMarriageInfoEng createGS10030CitizenMarriageInfoEng() {
        return new GS10030CitizenMarriageInfoEng();
    }

    /**
     * Create an instance of {@link GS10030CitizenMarriageInfoEngResponse }
     * 
     */
    public GS10030CitizenMarriageInfoEngResponse createGS10030CitizenMarriageInfoEngResponse() {
        return new GS10030CitizenMarriageInfoEngResponse();
    }

    /**
     * Create an instance of {@link GS10031SsoPhoneCheck }
     * 
     */
    public GS10031SsoPhoneCheck createGS10031SsoPhoneCheck() {
        return new GS10031SsoPhoneCheck();
    }

    /**
     * Create an instance of {@link GS10031SsoPhoneCheckResponse }
     * 
     */
    public GS10031SsoPhoneCheckResponse createGS10031SsoPhoneCheckResponse() {
        return new GS10031SsoPhoneCheckResponse();
    }

    /**
     * Create an instance of {@link LegalEntityRequestData }
     * 
     */
    public LegalEntityRequestData createLegalEntityRequestData() {
        return new LegalEntityRequestData();
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
     * Create an instance of {@link LegalEntityOwnerData }
     * 
     */
    public LegalEntityOwnerData createLegalEntityOwnerData() {
        return new LegalEntityOwnerData();
    }

    /**
     * Create an instance of {@link OwnerDetailData }
     * 
     */
    public OwnerDetailData createOwnerDetailData() {
        return new OwnerDetailData();
    }

    /**
     * Create an instance of {@link LegalEntityStakeHolderData }
     * 
     */
    public LegalEntityStakeHolderData createLegalEntityStakeHolderData() {
        return new LegalEntityStakeHolderData();
    }

    /**
     * Create an instance of {@link StakeHolderDetailData }
     * 
     */
    public StakeHolderDetailData createStakeHolderDetailData() {
        return new StakeHolderDetailData();
    }

    /**
     * Create an instance of {@link CovidVaccineDoseCountRequestData }
     * 
     */
    public CovidVaccineDoseCountRequestData createCovidVaccineDoseCountRequestData() {
        return new CovidVaccineDoseCountRequestData();
    }

    /**
     * Create an instance of {@link CitizenNonPaymentEngData }
     * 
     */
    public CitizenNonPaymentEngData createCitizenNonPaymentEngData() {
        return new CitizenNonPaymentEngData();
    }

    /**
     * Create an instance of {@link LegalEntityClosuresData }
     * 
     */
    public LegalEntityClosuresData createLegalEntityClosuresData() {
        return new LegalEntityClosuresData();
    }

    /**
     * Create an instance of {@link ClosuresDetailData }
     * 
     */
    public ClosuresDetailData createClosuresDetailData() {
        return new ClosuresDetailData();
    }

    /**
     * Create an instance of {@link CitizenIDCardInfoEngRequestData }
     * 
     */
    public CitizenIDCardInfoEngRequestData createCitizenIDCardInfoEngRequestData() {
        return new CitizenIDCardInfoEngRequestData();
    }

    /**
     * Create an instance of {@link RegistrationBasicRequest }
     * 
     */
    public RegistrationBasicRequest createRegistrationBasicRequest() {
        return new RegistrationBasicRequest();
    }

    /**
     * Create an instance of {@link CitizenNoMarriageInfoEngData }
     * 
     */
    public CitizenNoMarriageInfoEngData createCitizenNoMarriageInfoEngData() {
        return new CitizenNoMarriageInfoEngData();
    }

    /**
     * Create an instance of {@link SsoPhoneCheckRequestData }
     * 
     */
    public SsoPhoneCheckRequestData createSsoPhoneCheckRequestData() {
        return new SsoPhoneCheckRequestData();
    }

    /**
     * Create an instance of {@link ResultData }
     * 
     */
    public ResultData createResultData() {
        return new ResultData();
    }

    /**
     * Create an instance of {@link CitizenDiagnosysRequestData }
     * 
     */
    public CitizenDiagnosysRequestData createCitizenDiagnosysRequestData() {
        return new CitizenDiagnosysRequestData();
    }

    /**
     * Create an instance of {@link CitizenDiagnosisData }
     * 
     */
    public CitizenDiagnosisData createCitizenDiagnosisData() {
        return new CitizenDiagnosisData();
    }

    /**
     * Create an instance of {@link CovidPCRResultDetailData }
     * 
     */
    public CovidPCRResultDetailData createCovidPCRResultDetailData() {
        return new CovidPCRResultDetailData();
    }

    /**
     * Create an instance of {@link CovidVaccineDoseCountData }
     * 
     */
    public CovidVaccineDoseCountData createCovidVaccineDoseCountData() {
        return new CovidVaccineDoseCountData();
    }

    /**
     * Create an instance of {@link NotaryRequestData }
     * 
     */
    public NotaryRequestData createNotaryRequestData() {
        return new NotaryRequestData();
    }

    /**
     * Create an instance of {@link NotaryTrustData }
     * 
     */
    public NotaryTrustData createNotaryTrustData() {
        return new NotaryTrustData();
    }

    /**
     * Create an instance of {@link NotaryTrustDetailData }
     * 
     */
    public NotaryTrustDetailData createNotaryTrustDetailData() {
        return new NotaryTrustDetailData();
    }

    /**
     * Create an instance of {@link CitizenCovid19EPassRequestData }
     * 
     */
    public CitizenCovid19EPassRequestData createCitizenCovid19EPassRequestData() {
        return new CitizenCovid19EPassRequestData();
    }

    /**
     * Create an instance of {@link CitizenCovid19EPassData }
     * 
     */
    public CitizenCovid19EPassData createCitizenCovid19EPassData() {
        return new CitizenCovid19EPassData();
    }

    /**
     * Create an instance of {@link LegalEntityIndustryData }
     * 
     */
    public LegalEntityIndustryData createLegalEntityIndustryData() {
        return new LegalEntityIndustryData();
    }

    /**
     * Create an instance of {@link IndustryDetailData }
     * 
     */
    public IndustryDetailData createIndustryDetailData() {
        return new IndustryDetailData();
    }

    /**
     * Create an instance of {@link FirearmOwnerCertificateRequestData }
     * 
     */
    public FirearmOwnerCertificateRequestData createFirearmOwnerCertificateRequestData() {
        return new FirearmOwnerCertificateRequestData();
    }

    /**
     * Create an instance of {@link FirearmOwnerCertificateData }
     * 
     */
    public FirearmOwnerCertificateData createFirearmOwnerCertificateData() {
        return new FirearmOwnerCertificateData();
    }

    /**
     * Create an instance of {@link LegalEntityFounderData }
     * 
     */
    public LegalEntityFounderData createLegalEntityFounderData() {
        return new LegalEntityFounderData();
    }

    /**
     * Create an instance of {@link FounderDetailData }
     * 
     */
    public FounderDetailData createFounderDetailData() {
        return new FounderDetailData();
    }

    /**
     * Create an instance of {@link Covid19InternationalCertRequestData }
     * 
     */
    public Covid19InternationalCertRequestData createCovid19InternationalCertRequestData() {
        return new Covid19InternationalCertRequestData();
    }

    /**
     * Create an instance of {@link Covid19InternationalCertData }
     * 
     */
    public Covid19InternationalCertData createCovid19InternationalCertData() {
        return new Covid19InternationalCertData();
    }

    /**
     * Create an instance of {@link Covid19NatData }
     * 
     */
    public Covid19NatData createCovid19NatData() {
        return new Covid19NatData();
    }

    /**
     * Create an instance of {@link Covid19PersonalData }
     * 
     */
    public Covid19PersonalData createCovid19PersonalData() {
        return new Covid19PersonalData();
    }

    /**
     * Create an instance of {@link VaccineData }
     * 
     */
    public VaccineData createVaccineData() {
        return new VaccineData();
    }

    /**
     * Create an instance of {@link MedicalCertificateData }
     * 
     */
    public MedicalCertificateData createMedicalCertificateData() {
        return new MedicalCertificateData();
    }

    /**
     * Create an instance of {@link Covid19VaccineData }
     * 
     */
    public Covid19VaccineData createCovid19VaccineData() {
        return new Covid19VaccineData();
    }

    /**
     * Create an instance of {@link LegalEntityGeneralData }
     * 
     */
    public LegalEntityGeneralData createLegalEntityGeneralData() {
        return new LegalEntityGeneralData();
    }

    /**
     * Create an instance of {@link GeneralDetailData }
     * 
     */
    public GeneralDetailData createGeneralDetailData() {
        return new GeneralDetailData();
    }

    /**
     * Create an instance of {@link NotaryVehicleData }
     * 
     */
    public NotaryVehicleData createNotaryVehicleData() {
        return new NotaryVehicleData();
    }

    /**
     * Create an instance of {@link NotaryVehicleDetailData }
     * 
     */
    public NotaryVehicleDetailData createNotaryVehicleDetailData() {
        return new NotaryVehicleDetailData();
    }

    /**
     * Create an instance of {@link CitizenBirthInfoEngData }
     * 
     */
    public CitizenBirthInfoEngData createCitizenBirthInfoEngData() {
        return new CitizenBirthInfoEngData();
    }

    /**
     * Create an instance of {@link CitizenBriefData }
     * 
     */
    public CitizenBriefData createCitizenBriefData() {
        return new CitizenBriefData();
    }

    /**
     * Create an instance of {@link StudentSoldierRequestData }
     * 
     */
    public StudentSoldierRequestData createStudentSoldierRequestData() {
        return new StudentSoldierRequestData();
    }

    /**
     * Create an instance of {@link StudentSoldierData }
     * 
     */
    public StudentSoldierData createStudentSoldierData() {
        return new StudentSoldierData();
    }

    /**
     * Create an instance of {@link CitizenIDCardInfoEngData }
     * 
     */
    public CitizenIDCardInfoEngData createCitizenIDCardInfoEngData() {
        return new CitizenIDCardInfoEngData();
    }

    /**
     * Create an instance of {@link CitizenIdCardAddressDetailData }
     * 
     */
    public CitizenIdCardAddressDetailData createCitizenIdCardAddressDetailData() {
        return new CitizenIdCardAddressDetailData();
    }

    /**
     * Create an instance of {@link CitizenMarriageInfoEngData }
     * 
     */
    public CitizenMarriageInfoEngData createCitizenMarriageInfoEngData() {
        return new CitizenMarriageInfoEngData();
    }

    /**
     * Create an instance of {@link CitizenMarriageBriefData }
     * 
     */
    public CitizenMarriageBriefData createCitizenMarriageBriefData() {
        return new CitizenMarriageBriefData();
    }

    /**
     * Create an instance of {@link LegalEntityShareHolderData }
     * 
     */
    public LegalEntityShareHolderData createLegalEntityShareHolderData() {
        return new LegalEntityShareHolderData();
    }

    /**
     * Create an instance of {@link ShareHolderDetailData }
     * 
     */
    public ShareHolderDetailData createShareHolderDetailData() {
        return new ShareHolderDetailData();
    }

    /**
     * Create an instance of {@link LegalEntityBranchData }
     * 
     */
    public LegalEntityBranchData createLegalEntityBranchData() {
        return new LegalEntityBranchData();
    }

    /**
     * Create an instance of {@link BranchDetailData }
     * 
     */
    public BranchDetailData createBranchDetailData() {
        return new BranchDetailData();
    }

    /**
     * Create an instance of {@link ForeignCitizenInternationalCertRequestData }
     * 
     */
    public ForeignCitizenInternationalCertRequestData createForeignCitizenInternationalCertRequestData() {
        return new ForeignCitizenInternationalCertRequestData();
    }

    /**
     * Create an instance of {@link Covid19MedicalCertificateRequestData }
     * 
     */
    public Covid19MedicalCertificateRequestData createCovid19MedicalCertificateRequestData() {
        return new Covid19MedicalCertificateRequestData();
    }

    /**
     * Create an instance of {@link Covid19MedicalCertificateData }
     * 
     */
    public Covid19MedicalCertificateData createCovid19MedicalCertificateData() {
        return new Covid19MedicalCertificateData();
    }

    /**
     * Create an instance of {@link NonAdultCitizenRequestData }
     * 
     */
    public NonAdultCitizenRequestData createNonAdultCitizenRequestData() {
        return new NonAdultCitizenRequestData();
    }

    /**
     * Create an instance of {@link NonAdultCitizenData }
     * 
     */
    public NonAdultCitizenData createNonAdultCitizenData() {
        return new NonAdultCitizenData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10001CitizenDiagnosisInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10001CitizenDiagnosisInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10001_citizenDiagnosisInfo")
    public JAXBElement<GS10001CitizenDiagnosisInfo> createGS10001CitizenDiagnosisInfo(GS10001CitizenDiagnosisInfo value) {
        return new JAXBElement<GS10001CitizenDiagnosisInfo>(_GS10001CitizenDiagnosisInfo_QNAME, GS10001CitizenDiagnosisInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10001CitizenDiagnosisInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10001CitizenDiagnosisInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10001_citizenDiagnosisInfoResponse")
    public JAXBElement<GS10001CitizenDiagnosisInfoResponse> createGS10001CitizenDiagnosisInfoResponse(GS10001CitizenDiagnosisInfoResponse value) {
        return new JAXBElement<GS10001CitizenDiagnosisInfoResponse>(_GS10001CitizenDiagnosisInfoResponse_QNAME, GS10001CitizenDiagnosisInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10002CitizenCovid19EPass }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10002CitizenCovid19EPass }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10002_citizenCovid19EPass")
    public JAXBElement<GS10002CitizenCovid19EPass> createGS10002CitizenCovid19EPass(GS10002CitizenCovid19EPass value) {
        return new JAXBElement<GS10002CitizenCovid19EPass>(_GS10002CitizenCovid19EPass_QNAME, GS10002CitizenCovid19EPass.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10002CitizenCovid19EPassResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10002CitizenCovid19EPassResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10002_citizenCovid19EPassResponse")
    public JAXBElement<GS10002CitizenCovid19EPassResponse> createGS10002CitizenCovid19EPassResponse(GS10002CitizenCovid19EPassResponse value) {
        return new JAXBElement<GS10002CitizenCovid19EPassResponse>(_GS10002CitizenCovid19EPassResponse_QNAME, GS10002CitizenCovid19EPassResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10003LegalEntityBranchInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10003LegalEntityBranchInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10003_legalEntityBranchInfo")
    public JAXBElement<GS10003LegalEntityBranchInfo> createGS10003LegalEntityBranchInfo(GS10003LegalEntityBranchInfo value) {
        return new JAXBElement<GS10003LegalEntityBranchInfo>(_GS10003LegalEntityBranchInfo_QNAME, GS10003LegalEntityBranchInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10003LegalEntityBranchInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10003LegalEntityBranchInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10003_legalEntityBranchInfoResponse")
    public JAXBElement<GS10003LegalEntityBranchInfoResponse> createGS10003LegalEntityBranchInfoResponse(GS10003LegalEntityBranchInfoResponse value) {
        return new JAXBElement<GS10003LegalEntityBranchInfoResponse>(_GS10003LegalEntityBranchInfoResponse_QNAME, GS10003LegalEntityBranchInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10004LegalEntityClosuresInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10004LegalEntityClosuresInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10004_legalEntityClosuresInfo")
    public JAXBElement<GS10004LegalEntityClosuresInfo> createGS10004LegalEntityClosuresInfo(GS10004LegalEntityClosuresInfo value) {
        return new JAXBElement<GS10004LegalEntityClosuresInfo>(_GS10004LegalEntityClosuresInfo_QNAME, GS10004LegalEntityClosuresInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10004LegalEntityClosuresInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10004LegalEntityClosuresInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10004_legalEntityClosuresInfoResponse")
    public JAXBElement<GS10004LegalEntityClosuresInfoResponse> createGS10004LegalEntityClosuresInfoResponse(GS10004LegalEntityClosuresInfoResponse value) {
        return new JAXBElement<GS10004LegalEntityClosuresInfoResponse>(_GS10004LegalEntityClosuresInfoResponse_QNAME, GS10004LegalEntityClosuresInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10005LegalEntityFounderInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10005LegalEntityFounderInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10005_legalEntityFounderInfo")
    public JAXBElement<GS10005LegalEntityFounderInfo> createGS10005LegalEntityFounderInfo(GS10005LegalEntityFounderInfo value) {
        return new JAXBElement<GS10005LegalEntityFounderInfo>(_GS10005LegalEntityFounderInfo_QNAME, GS10005LegalEntityFounderInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10005LegalEntityFounderInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10005LegalEntityFounderInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10005_legalEntityFounderInfoResponse")
    public JAXBElement<GS10005LegalEntityFounderInfoResponse> createGS10005LegalEntityFounderInfoResponse(GS10005LegalEntityFounderInfoResponse value) {
        return new JAXBElement<GS10005LegalEntityFounderInfoResponse>(_GS10005LegalEntityFounderInfoResponse_QNAME, GS10005LegalEntityFounderInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10006LegalEntityIndustryInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10006LegalEntityIndustryInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10006_legalEntityIndustryInfo")
    public JAXBElement<GS10006LegalEntityIndustryInfo> createGS10006LegalEntityIndustryInfo(GS10006LegalEntityIndustryInfo value) {
        return new JAXBElement<GS10006LegalEntityIndustryInfo>(_GS10006LegalEntityIndustryInfo_QNAME, GS10006LegalEntityIndustryInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10006LegalEntityIndustryInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10006LegalEntityIndustryInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10006_legalEntityIndustryInfoResponse")
    public JAXBElement<GS10006LegalEntityIndustryInfoResponse> createGS10006LegalEntityIndustryInfoResponse(GS10006LegalEntityIndustryInfoResponse value) {
        return new JAXBElement<GS10006LegalEntityIndustryInfoResponse>(_GS10006LegalEntityIndustryInfoResponse_QNAME, GS10006LegalEntityIndustryInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10007LegalEntityOwnerInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10007LegalEntityOwnerInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10007_legalEntityOwnerInfo")
    public JAXBElement<GS10007LegalEntityOwnerInfo> createGS10007LegalEntityOwnerInfo(GS10007LegalEntityOwnerInfo value) {
        return new JAXBElement<GS10007LegalEntityOwnerInfo>(_GS10007LegalEntityOwnerInfo_QNAME, GS10007LegalEntityOwnerInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10007LegalEntityOwnerInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10007LegalEntityOwnerInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10007_legalEntityOwnerInfoResponse")
    public JAXBElement<GS10007LegalEntityOwnerInfoResponse> createGS10007LegalEntityOwnerInfoResponse(GS10007LegalEntityOwnerInfoResponse value) {
        return new JAXBElement<GS10007LegalEntityOwnerInfoResponse>(_GS10007LegalEntityOwnerInfoResponse_QNAME, GS10007LegalEntityOwnerInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10008LegalEntityGeneralInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10008LegalEntityGeneralInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10008_legalEntityGeneralInfo")
    public JAXBElement<GS10008LegalEntityGeneralInfo> createGS10008LegalEntityGeneralInfo(GS10008LegalEntityGeneralInfo value) {
        return new JAXBElement<GS10008LegalEntityGeneralInfo>(_GS10008LegalEntityGeneralInfo_QNAME, GS10008LegalEntityGeneralInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10008LegalEntityGeneralInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10008LegalEntityGeneralInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10008_legalEntityGeneralInfoResponse")
    public JAXBElement<GS10008LegalEntityGeneralInfoResponse> createGS10008LegalEntityGeneralInfoResponse(GS10008LegalEntityGeneralInfoResponse value) {
        return new JAXBElement<GS10008LegalEntityGeneralInfoResponse>(_GS10008LegalEntityGeneralInfoResponse_QNAME, GS10008LegalEntityGeneralInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10009LegalEntityShareHolderInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10009LegalEntityShareHolderInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10009_legalEntityShareHolderInfo")
    public JAXBElement<GS10009LegalEntityShareHolderInfo> createGS10009LegalEntityShareHolderInfo(GS10009LegalEntityShareHolderInfo value) {
        return new JAXBElement<GS10009LegalEntityShareHolderInfo>(_GS10009LegalEntityShareHolderInfo_QNAME, GS10009LegalEntityShareHolderInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10009LegalEntityShareHolderInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10009LegalEntityShareHolderInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10009_legalEntityShareHolderInfoResponse")
    public JAXBElement<GS10009LegalEntityShareHolderInfoResponse> createGS10009LegalEntityShareHolderInfoResponse(GS10009LegalEntityShareHolderInfoResponse value) {
        return new JAXBElement<GS10009LegalEntityShareHolderInfoResponse>(_GS10009LegalEntityShareHolderInfoResponse_QNAME, GS10009LegalEntityShareHolderInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10010LegalEntityStakeHolderInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10010LegalEntityStakeHolderInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10010_legalEntityStakeHolderInfo")
    public JAXBElement<GS10010LegalEntityStakeHolderInfo> createGS10010LegalEntityStakeHolderInfo(GS10010LegalEntityStakeHolderInfo value) {
        return new JAXBElement<GS10010LegalEntityStakeHolderInfo>(_GS10010LegalEntityStakeHolderInfo_QNAME, GS10010LegalEntityStakeHolderInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10010LegalEntityStakeHolderInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10010LegalEntityStakeHolderInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10010_legalEntityStakeHolderInfoResponse")
    public JAXBElement<GS10010LegalEntityStakeHolderInfoResponse> createGS10010LegalEntityStakeHolderInfoResponse(GS10010LegalEntityStakeHolderInfoResponse value) {
        return new JAXBElement<GS10010LegalEntityStakeHolderInfoResponse>(_GS10010LegalEntityStakeHolderInfoResponse_QNAME, GS10010LegalEntityStakeHolderInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10011ChildrenBirthInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10011ChildrenBirthInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10011_childrenBirthInfo")
    public JAXBElement<GS10011ChildrenBirthInfo> createGS10011ChildrenBirthInfo(GS10011ChildrenBirthInfo value) {
        return new JAXBElement<GS10011ChildrenBirthInfo>(_GS10011ChildrenBirthInfo_QNAME, GS10011ChildrenBirthInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10011ChildrenBirthInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10011ChildrenBirthInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10011_childrenBirthInfoResponse")
    public JAXBElement<GS10011ChildrenBirthInfoResponse> createGS10011ChildrenBirthInfoResponse(GS10011ChildrenBirthInfoResponse value) {
        return new JAXBElement<GS10011ChildrenBirthInfoResponse>(_GS10011ChildrenBirthInfoResponse_QNAME, GS10011ChildrenBirthInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10012CitizenAddressArrivedInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10012CitizenAddressArrivedInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10012_citizenAddressArrivedInfo")
    public JAXBElement<GS10012CitizenAddressArrivedInfo> createGS10012CitizenAddressArrivedInfo(GS10012CitizenAddressArrivedInfo value) {
        return new JAXBElement<GS10012CitizenAddressArrivedInfo>(_GS10012CitizenAddressArrivedInfo_QNAME, GS10012CitizenAddressArrivedInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10012CitizenAddressArrivedInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10012CitizenAddressArrivedInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10012_citizenAddressArrivedInfoResponse")
    public JAXBElement<GS10012CitizenAddressArrivedInfoResponse> createGS10012CitizenAddressArrivedInfoResponse(GS10012CitizenAddressArrivedInfoResponse value) {
        return new JAXBElement<GS10012CitizenAddressArrivedInfoResponse>(_GS10012CitizenAddressArrivedInfoResponse_QNAME, GS10012CitizenAddressArrivedInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10013CitizenChangeNameInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10013CitizenChangeNameInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10013_citizenChangeNameInfo")
    public JAXBElement<GS10013CitizenChangeNameInfo> createGS10013CitizenChangeNameInfo(GS10013CitizenChangeNameInfo value) {
        return new JAXBElement<GS10013CitizenChangeNameInfo>(_GS10013CitizenChangeNameInfo_QNAME, GS10013CitizenChangeNameInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10013CitizenChangeNameInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10013CitizenChangeNameInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10013_citizenChangeNameInfoResponse")
    public JAXBElement<GS10013CitizenChangeNameInfoResponse> createGS10013CitizenChangeNameInfoResponse(GS10013CitizenChangeNameInfoResponse value) {
        return new JAXBElement<GS10013CitizenChangeNameInfoResponse>(_GS10013CitizenChangeNameInfoResponse_QNAME, GS10013CitizenChangeNameInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10014CitizenChangeRegnumInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10014CitizenChangeRegnumInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10014_citizenChangeRegnumInfo")
    public JAXBElement<GS10014CitizenChangeRegnumInfo> createGS10014CitizenChangeRegnumInfo(GS10014CitizenChangeRegnumInfo value) {
        return new JAXBElement<GS10014CitizenChangeRegnumInfo>(_GS10014CitizenChangeRegnumInfo_QNAME, GS10014CitizenChangeRegnumInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10014CitizenChangeRegnumInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10014CitizenChangeRegnumInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10014_citizenChangeRegnumInfoResponse")
    public JAXBElement<GS10014CitizenChangeRegnumInfoResponse> createGS10014CitizenChangeRegnumInfoResponse(GS10014CitizenChangeRegnumInfoResponse value) {
        return new JAXBElement<GS10014CitizenChangeRegnumInfoResponse>(_GS10014CitizenChangeRegnumInfoResponse_QNAME, GS10014CitizenChangeRegnumInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10015CitizenIDCardFirstTimeInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10015CitizenIDCardFirstTimeInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10015_citizenIDCardFirstTimeInfo")
    public JAXBElement<GS10015CitizenIDCardFirstTimeInfo> createGS10015CitizenIDCardFirstTimeInfo(GS10015CitizenIDCardFirstTimeInfo value) {
        return new JAXBElement<GS10015CitizenIDCardFirstTimeInfo>(_GS10015CitizenIDCardFirstTimeInfo_QNAME, GS10015CitizenIDCardFirstTimeInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10015CitizenIDCardFirstTimeInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10015CitizenIDCardFirstTimeInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10015_citizenIDCardFirstTimeInfoResponse")
    public JAXBElement<GS10015CitizenIDCardFirstTimeInfoResponse> createGS10015CitizenIDCardFirstTimeInfoResponse(GS10015CitizenIDCardFirstTimeInfoResponse value) {
        return new JAXBElement<GS10015CitizenIDCardFirstTimeInfoResponse>(_GS10015CitizenIDCardFirstTimeInfoResponse_QNAME, GS10015CitizenIDCardFirstTimeInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10016Covid19MedicalCertificateInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10016Covid19MedicalCertificateInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10016_covid19MedicalCertificateInfo")
    public JAXBElement<GS10016Covid19MedicalCertificateInfo> createGS10016Covid19MedicalCertificateInfo(GS10016Covid19MedicalCertificateInfo value) {
        return new JAXBElement<GS10016Covid19MedicalCertificateInfo>(_GS10016Covid19MedicalCertificateInfo_QNAME, GS10016Covid19MedicalCertificateInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10016Covid19MedicalCertificateInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10016Covid19MedicalCertificateInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10016_covid19MedicalCertificateInfoResponse")
    public JAXBElement<GS10016Covid19MedicalCertificateInfoResponse> createGS10016Covid19MedicalCertificateInfoResponse(GS10016Covid19MedicalCertificateInfoResponse value) {
        return new JAXBElement<GS10016Covid19MedicalCertificateInfoResponse>(_GS10016Covid19MedicalCertificateInfoResponse_QNAME, GS10016Covid19MedicalCertificateInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10017CitizenInternationalCert }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10017CitizenInternationalCert }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10017_citizenInternationalCert")
    public JAXBElement<GS10017CitizenInternationalCert> createGS10017CitizenInternationalCert(GS10017CitizenInternationalCert value) {
        return new JAXBElement<GS10017CitizenInternationalCert>(_GS10017CitizenInternationalCert_QNAME, GS10017CitizenInternationalCert.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10017CitizenInternationalCertResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10017CitizenInternationalCertResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10017_citizenInternationalCertResponse")
    public JAXBElement<GS10017CitizenInternationalCertResponse> createGS10017CitizenInternationalCertResponse(GS10017CitizenInternationalCertResponse value) {
        return new JAXBElement<GS10017CitizenInternationalCertResponse>(_GS10017CitizenInternationalCertResponse_QNAME, GS10017CitizenInternationalCertResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10018ForeignCitizenInternationalCert }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10018ForeignCitizenInternationalCert }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10018_foreignCitizenInternationalCert")
    public JAXBElement<GS10018ForeignCitizenInternationalCert> createGS10018ForeignCitizenInternationalCert(GS10018ForeignCitizenInternationalCert value) {
        return new JAXBElement<GS10018ForeignCitizenInternationalCert>(_GS10018ForeignCitizenInternationalCert_QNAME, GS10018ForeignCitizenInternationalCert.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10018ForeignCitizenInternationalCertResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10018ForeignCitizenInternationalCertResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10018_foreignCitizenInternationalCertResponse")
    public JAXBElement<GS10018ForeignCitizenInternationalCertResponse> createGS10018ForeignCitizenInternationalCertResponse(GS10018ForeignCitizenInternationalCertResponse value) {
        return new JAXBElement<GS10018ForeignCitizenInternationalCertResponse>(_GS10018ForeignCitizenInternationalCertResponse_QNAME, GS10018ForeignCitizenInternationalCertResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10019FirearmOwnerCertificateInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10019FirearmOwnerCertificateInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10019_firearmOwnerCertificateInfo")
    public JAXBElement<GS10019FirearmOwnerCertificateInfo> createGS10019FirearmOwnerCertificateInfo(GS10019FirearmOwnerCertificateInfo value) {
        return new JAXBElement<GS10019FirearmOwnerCertificateInfo>(_GS10019FirearmOwnerCertificateInfo_QNAME, GS10019FirearmOwnerCertificateInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10019FirearmOwnerCertificateInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10019FirearmOwnerCertificateInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10019_firearmOwnerCertificateInfoResponse")
    public JAXBElement<GS10019FirearmOwnerCertificateInfoResponse> createGS10019FirearmOwnerCertificateInfoResponse(GS10019FirearmOwnerCertificateInfoResponse value) {
        return new JAXBElement<GS10019FirearmOwnerCertificateInfoResponse>(_GS10019FirearmOwnerCertificateInfoResponse_QNAME, GS10019FirearmOwnerCertificateInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10020NonAdultCitizenInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10020NonAdultCitizenInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10020_nonAdultCitizenInfo")
    public JAXBElement<GS10020NonAdultCitizenInfo> createGS10020NonAdultCitizenInfo(GS10020NonAdultCitizenInfo value) {
        return new JAXBElement<GS10020NonAdultCitizenInfo>(_GS10020NonAdultCitizenInfo_QNAME, GS10020NonAdultCitizenInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10020NonAdultCitizenInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10020NonAdultCitizenInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10020_nonAdultCitizenInfoResponse")
    public JAXBElement<GS10020NonAdultCitizenInfoResponse> createGS10020NonAdultCitizenInfoResponse(GS10020NonAdultCitizenInfoResponse value) {
        return new JAXBElement<GS10020NonAdultCitizenInfoResponse>(_GS10020NonAdultCitizenInfoResponse_QNAME, GS10020NonAdultCitizenInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10021CovidVaccineDoseCount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10021CovidVaccineDoseCount }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10021_covidVaccineDoseCount")
    public JAXBElement<GS10021CovidVaccineDoseCount> createGS10021CovidVaccineDoseCount(GS10021CovidVaccineDoseCount value) {
        return new JAXBElement<GS10021CovidVaccineDoseCount>(_GS10021CovidVaccineDoseCount_QNAME, GS10021CovidVaccineDoseCount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10021CovidVaccineDoseCountResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10021CovidVaccineDoseCountResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10021_covidVaccineDoseCountResponse")
    public JAXBElement<GS10021CovidVaccineDoseCountResponse> createGS10021CovidVaccineDoseCountResponse(GS10021CovidVaccineDoseCountResponse value) {
        return new JAXBElement<GS10021CovidVaccineDoseCountResponse>(_GS10021CovidVaccineDoseCountResponse_QNAME, GS10021CovidVaccineDoseCountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10022StudentSoldierInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10022StudentSoldierInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10022_studentSoldierInfo")
    public JAXBElement<GS10022StudentSoldierInfo> createGS10022StudentSoldierInfo(GS10022StudentSoldierInfo value) {
        return new JAXBElement<GS10022StudentSoldierInfo>(_GS10022StudentSoldierInfo_QNAME, GS10022StudentSoldierInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10022StudentSoldierInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10022StudentSoldierInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10022_studentSoldierInfoResponse")
    public JAXBElement<GS10022StudentSoldierInfoResponse> createGS10022StudentSoldierInfoResponse(GS10022StudentSoldierInfoResponse value) {
        return new JAXBElement<GS10022StudentSoldierInfoResponse>(_GS10022StudentSoldierInfoResponse_QNAME, GS10022StudentSoldierInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10023NotaryTrustInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10023NotaryTrustInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10023_notaryTrustInfo")
    public JAXBElement<GS10023NotaryTrustInfo> createGS10023NotaryTrustInfo(GS10023NotaryTrustInfo value) {
        return new JAXBElement<GS10023NotaryTrustInfo>(_GS10023NotaryTrustInfo_QNAME, GS10023NotaryTrustInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10023NotaryTrustInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10023NotaryTrustInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10023_notaryTrustInfoResponse")
    public JAXBElement<GS10023NotaryTrustInfoResponse> createGS10023NotaryTrustInfoResponse(GS10023NotaryTrustInfoResponse value) {
        return new JAXBElement<GS10023NotaryTrustInfoResponse>(_GS10023NotaryTrustInfoResponse_QNAME, GS10023NotaryTrustInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10024NotaryVehicleInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10024NotaryVehicleInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10024_notaryVehicleInfo")
    public JAXBElement<GS10024NotaryVehicleInfo> createGS10024NotaryVehicleInfo(GS10024NotaryVehicleInfo value) {
        return new JAXBElement<GS10024NotaryVehicleInfo>(_GS10024NotaryVehicleInfo_QNAME, GS10024NotaryVehicleInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10024NotaryVehicleInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10024NotaryVehicleInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10024_notaryVehicleInfoResponse")
    public JAXBElement<GS10024NotaryVehicleInfoResponse> createGS10024NotaryVehicleInfoResponse(GS10024NotaryVehicleInfoResponse value) {
        return new JAXBElement<GS10024NotaryVehicleInfoResponse>(_GS10024NotaryVehicleInfoResponse_QNAME, GS10024NotaryVehicleInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10025NotaryTrustArchivedInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10025NotaryTrustArchivedInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10025_notaryTrustArchivedInfo")
    public JAXBElement<GS10025NotaryTrustArchivedInfo> createGS10025NotaryTrustArchivedInfo(GS10025NotaryTrustArchivedInfo value) {
        return new JAXBElement<GS10025NotaryTrustArchivedInfo>(_GS10025NotaryTrustArchivedInfo_QNAME, GS10025NotaryTrustArchivedInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10025NotaryTrustArchivedInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10025NotaryTrustArchivedInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10025_notaryTrustArchivedInfoResponse")
    public JAXBElement<GS10025NotaryTrustArchivedInfoResponse> createGS10025NotaryTrustArchivedInfoResponse(GS10025NotaryTrustArchivedInfoResponse value) {
        return new JAXBElement<GS10025NotaryTrustArchivedInfoResponse>(_GS10025NotaryTrustArchivedInfoResponse_QNAME, GS10025NotaryTrustArchivedInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10026CitizenIDCardInfoEng }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10026CitizenIDCardInfoEng }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10026_citizenIDCardInfoEng")
    public JAXBElement<GS10026CitizenIDCardInfoEng> createGS10026CitizenIDCardInfoEng(GS10026CitizenIDCardInfoEng value) {
        return new JAXBElement<GS10026CitizenIDCardInfoEng>(_GS10026CitizenIDCardInfoEng_QNAME, GS10026CitizenIDCardInfoEng.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10026CitizenIDCardInfoEngResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10026CitizenIDCardInfoEngResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10026_citizenIDCardInfoEngResponse")
    public JAXBElement<GS10026CitizenIDCardInfoEngResponse> createGS10026CitizenIDCardInfoEngResponse(GS10026CitizenIDCardInfoEngResponse value) {
        return new JAXBElement<GS10026CitizenIDCardInfoEngResponse>(_GS10026CitizenIDCardInfoEngResponse_QNAME, GS10026CitizenIDCardInfoEngResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10027CitizenBirthInfoEng }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10027CitizenBirthInfoEng }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10027_citizenBirthInfoEng")
    public JAXBElement<GS10027CitizenBirthInfoEng> createGS10027CitizenBirthInfoEng(GS10027CitizenBirthInfoEng value) {
        return new JAXBElement<GS10027CitizenBirthInfoEng>(_GS10027CitizenBirthInfoEng_QNAME, GS10027CitizenBirthInfoEng.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10027CitizenBirthInfoEngResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10027CitizenBirthInfoEngResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10027_citizenBirthInfoEngResponse")
    public JAXBElement<GS10027CitizenBirthInfoEngResponse> createGS10027CitizenBirthInfoEngResponse(GS10027CitizenBirthInfoEngResponse value) {
        return new JAXBElement<GS10027CitizenBirthInfoEngResponse>(_GS10027CitizenBirthInfoEngResponse_QNAME, GS10027CitizenBirthInfoEngResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10028CitizenNonPaymentEngInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10028CitizenNonPaymentEngInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10028_citizenNonPaymentEngInfo")
    public JAXBElement<GS10028CitizenNonPaymentEngInfo> createGS10028CitizenNonPaymentEngInfo(GS10028CitizenNonPaymentEngInfo value) {
        return new JAXBElement<GS10028CitizenNonPaymentEngInfo>(_GS10028CitizenNonPaymentEngInfo_QNAME, GS10028CitizenNonPaymentEngInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10028CitizenNonPaymentEngInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10028CitizenNonPaymentEngInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10028_citizenNonPaymentEngInfoResponse")
    public JAXBElement<GS10028CitizenNonPaymentEngInfoResponse> createGS10028CitizenNonPaymentEngInfoResponse(GS10028CitizenNonPaymentEngInfoResponse value) {
        return new JAXBElement<GS10028CitizenNonPaymentEngInfoResponse>(_GS10028CitizenNonPaymentEngInfoResponse_QNAME, GS10028CitizenNonPaymentEngInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10029CitizenNoMarriageInfoData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10029CitizenNoMarriageInfoData }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10029_citizenNoMarriageInfoData")
    public JAXBElement<GS10029CitizenNoMarriageInfoData> createGS10029CitizenNoMarriageInfoData(GS10029CitizenNoMarriageInfoData value) {
        return new JAXBElement<GS10029CitizenNoMarriageInfoData>(_GS10029CitizenNoMarriageInfoData_QNAME, GS10029CitizenNoMarriageInfoData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10029CitizenNoMarriageInfoDataResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10029CitizenNoMarriageInfoDataResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10029_citizenNoMarriageInfoDataResponse")
    public JAXBElement<GS10029CitizenNoMarriageInfoDataResponse> createGS10029CitizenNoMarriageInfoDataResponse(GS10029CitizenNoMarriageInfoDataResponse value) {
        return new JAXBElement<GS10029CitizenNoMarriageInfoDataResponse>(_GS10029CitizenNoMarriageInfoDataResponse_QNAME, GS10029CitizenNoMarriageInfoDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10030CitizenMarriageInfoEng }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10030CitizenMarriageInfoEng }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10030_citizenMarriageInfoEng")
    public JAXBElement<GS10030CitizenMarriageInfoEng> createGS10030CitizenMarriageInfoEng(GS10030CitizenMarriageInfoEng value) {
        return new JAXBElement<GS10030CitizenMarriageInfoEng>(_GS10030CitizenMarriageInfoEng_QNAME, GS10030CitizenMarriageInfoEng.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10030CitizenMarriageInfoEngResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10030CitizenMarriageInfoEngResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10030_citizenMarriageInfoEngResponse")
    public JAXBElement<GS10030CitizenMarriageInfoEngResponse> createGS10030CitizenMarriageInfoEngResponse(GS10030CitizenMarriageInfoEngResponse value) {
        return new JAXBElement<GS10030CitizenMarriageInfoEngResponse>(_GS10030CitizenMarriageInfoEngResponse_QNAME, GS10030CitizenMarriageInfoEngResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10031SsoPhoneCheck }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10031SsoPhoneCheck }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10031_ssoPhoneCheck")
    public JAXBElement<GS10031SsoPhoneCheck> createGS10031SsoPhoneCheck(GS10031SsoPhoneCheck value) {
        return new JAXBElement<GS10031SsoPhoneCheck>(_GS10031SsoPhoneCheck_QNAME, GS10031SsoPhoneCheck.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GS10031SsoPhoneCheckResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GS10031SsoPhoneCheckResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://government.xyp.gov.mn/", name = "GS10031_ssoPhoneCheckResponse")
    public JAXBElement<GS10031SsoPhoneCheckResponse> createGS10031SsoPhoneCheckResponse(GS10031SsoPhoneCheckResponse value) {
        return new JAXBElement<GS10031SsoPhoneCheckResponse>(_GS10031SsoPhoneCheckResponse_QNAME, GS10031SsoPhoneCheckResponse.class, null, value);
    }

}
