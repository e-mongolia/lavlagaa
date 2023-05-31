
package mn.gov.ema.emongolia.data.XypCitizen;

import mn.gov.ema.emongolia.data.AuthorizationData.AuthorizationData;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="auth" type="{http://citizen.xyp.gov.mn/}authorizationData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceRequest", propOrder = {
    "auth"
})
@XmlSeeAlso({
    CitizenRequestData.class,
    GetFireArmRequestData.class,
    CitizenEducationRequestData.class,
    CitizenStatisticRequestData.class,
    ServiceCitizenBorderPassRequestData.class,
    CitizenDenationalizationRequestData.class,
    ServiceInsertBirthInfoRequestData.class,
    ChildRequestData.class,
    CitizenGraduateSchoolRequestData.class,
    ServiceSoumDistrictInfoRequestData.class,
    ServiceGenerateRegisterNumberRequestData.class,
    ServiceCheckCitizenAddressInfoRequestData.class,
    GetDictionaryRequestData.class,
    GetPassportIssuedRequestData.class,
    InsertCitizenArchivesOrderRequestData.class,
    Covid19InternationalCertRequestData.class,
    ServiceCitizenLookUpInfoRequestData.class,
    CitizenCriminalLiabilityRequestData.class,
    ServiceCheckCitizenRegnumRequestData.class,
    ServiceChildrenInfoRequestData.class,
    BirthInfoParentRegnumRequestData.class,
    ServiceCitizenLookUpAddressRequestData.class,
    CitizenFoulDataRequest.class,
    ServiceCitizenBirthInfoRequestData.class,
    ServiceAddressApartmentInfoRequestData.class,
    ServiceInsertForeignCitizenInHotelRequestData.class,
    ServiceCitizenDeceaseInfoRequestData.class,
    InsertNotaryRequestData.class,
    PassportInvalidInfoRequestData.class,
    CovidPCRRequestData.class,
    ChildrenBasicInfoRequest.class,
    ServiceBagKhorooInfoRequestData.class,
    ServiceBorderPassInfoRequestData.class,
    ChildrenInfoByMotherRequestData.class,
    ServicePassortInfoRequestData.class,
    CitizenReleasedInfoRequestData.class,
    Covid19VaccineCertificateRequest.class,
    ServiceAddressStreetInfoRequestData.class,
    RegistrationBasicRequest.class,
    CheckCitizenInfoRequestData.class,
    GraduateInfoByYearRequestData.class
})
public class ServiceRequest {

    protected AuthorizationData auth;

    /**
     * Gets the value of the auth property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationData }
     *     
     */
    public AuthorizationData getAuth() {
        return auth;
    }

    /**
     * Sets the value of the auth property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationData }
     *     
     */
    public void setAuth(AuthorizationData value) {
        this.auth = value;
    }

}
