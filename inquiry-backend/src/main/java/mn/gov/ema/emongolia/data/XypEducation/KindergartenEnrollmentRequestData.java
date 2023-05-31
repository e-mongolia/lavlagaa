
package mn.gov.ema.emongolia.data.XypEducation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for kindergartenEnrollmentRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="kindergartenEnrollmentRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://education.xyp.gov.mn/}serviceRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addressApartmentId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="addressApartmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressDetail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="addressRegionId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="addressRegionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressStreetId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="addressStreetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressTownId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="addressTownName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="arrivedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="cityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="civilId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="contactCivilId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="contactGuardianType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactPersonId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="contactPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="districtCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="districtName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fullAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="institutionId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="institutionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="khorooCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="khorooName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="recruiterFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recruiterId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="requestStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ubLocationFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "kindergartenEnrollmentRequestData", propOrder = {
    "addressApartmentId",
    "addressApartmentName",
    "addressDetail",
    "addressId",
    "addressRegionId",
    "addressRegionName",
    "addressStreetId",
    "addressStreetName",
    "addressTownId",
    "addressTownName",
    "addressTypeCode",
    "addressTypeName",
    "arrivedDate",
    "birthDate",
    "cityCode",
    "cityName",
    "civilId",
    "contactCivilId",
    "contactGuardianType",
    "contactPersonId",
    "contactPhone",
    "contactRegnum",
    "districtCode",
    "districtName",
    "firstName",
    "fullAddress",
    "institutionId",
    "institutionName",
    "khorooCode",
    "khorooName",
    "lastName",
    "personId",
    "recruiterFlag",
    "recruiterId",
    "regnum",
    "requestStatus",
    "ubLocationFlag"
})
public class KindergartenEnrollmentRequestData
    extends ServiceRequest
{

    protected int addressApartmentId;
    protected String addressApartmentName;
    protected String addressDetail;
    protected int addressId;
    protected int addressRegionId;
    protected String addressRegionName;
    protected int addressStreetId;
    protected String addressStreetName;
    protected int addressTownId;
    protected String addressTownName;
    protected String addressTypeCode;
    protected String addressTypeName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivedDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthDate;
    protected String cityCode;
    protected String cityName;
    protected Long civilId;
    protected Long contactCivilId;
    protected String contactGuardianType;
    protected Long contactPersonId;
    protected String contactPhone;
    protected String contactRegnum;
    protected String districtCode;
    protected String districtName;
    protected String firstName;
    protected String fullAddress;
    protected int institutionId;
    protected String institutionName;
    protected String khorooCode;
    protected String khorooName;
    protected String lastName;
    protected Long personId;
    protected String recruiterFlag;
    protected Long recruiterId;
    protected String regnum;
    protected String requestStatus;
    protected String ubLocationFlag;

    /**
     * Gets the value of the addressApartmentId property.
     * 
     */
    public int getAddressApartmentId() {
        return addressApartmentId;
    }

    /**
     * Sets the value of the addressApartmentId property.
     * 
     */
    public void setAddressApartmentId(int value) {
        this.addressApartmentId = value;
    }

    /**
     * Gets the value of the addressApartmentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressApartmentName() {
        return addressApartmentName;
    }

    /**
     * Sets the value of the addressApartmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressApartmentName(String value) {
        this.addressApartmentName = value;
    }

    /**
     * Gets the value of the addressDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressDetail() {
        return addressDetail;
    }

    /**
     * Sets the value of the addressDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressDetail(String value) {
        this.addressDetail = value;
    }

    /**
     * Gets the value of the addressId property.
     * 
     */
    public int getAddressId() {
        return addressId;
    }

    /**
     * Sets the value of the addressId property.
     * 
     */
    public void setAddressId(int value) {
        this.addressId = value;
    }

    /**
     * Gets the value of the addressRegionId property.
     * 
     */
    public int getAddressRegionId() {
        return addressRegionId;
    }

    /**
     * Sets the value of the addressRegionId property.
     * 
     */
    public void setAddressRegionId(int value) {
        this.addressRegionId = value;
    }

    /**
     * Gets the value of the addressRegionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressRegionName() {
        return addressRegionName;
    }

    /**
     * Sets the value of the addressRegionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressRegionName(String value) {
        this.addressRegionName = value;
    }

    /**
     * Gets the value of the addressStreetId property.
     * 
     */
    public int getAddressStreetId() {
        return addressStreetId;
    }

    /**
     * Sets the value of the addressStreetId property.
     * 
     */
    public void setAddressStreetId(int value) {
        this.addressStreetId = value;
    }

    /**
     * Gets the value of the addressStreetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressStreetName() {
        return addressStreetName;
    }

    /**
     * Sets the value of the addressStreetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressStreetName(String value) {
        this.addressStreetName = value;
    }

    /**
     * Gets the value of the addressTownId property.
     * 
     */
    public int getAddressTownId() {
        return addressTownId;
    }

    /**
     * Sets the value of the addressTownId property.
     * 
     */
    public void setAddressTownId(int value) {
        this.addressTownId = value;
    }

    /**
     * Gets the value of the addressTownName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressTownName() {
        return addressTownName;
    }

    /**
     * Sets the value of the addressTownName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressTownName(String value) {
        this.addressTownName = value;
    }

    /**
     * Gets the value of the addressTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressTypeCode() {
        return addressTypeCode;
    }

    /**
     * Sets the value of the addressTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressTypeCode(String value) {
        this.addressTypeCode = value;
    }

    /**
     * Gets the value of the addressTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressTypeName() {
        return addressTypeName;
    }

    /**
     * Sets the value of the addressTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressTypeName(String value) {
        this.addressTypeName = value;
    }

    /**
     * Gets the value of the arrivedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivedDate() {
        return arrivedDate;
    }

    /**
     * Sets the value of the arrivedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivedDate(XMLGregorianCalendar value) {
        this.arrivedDate = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the cityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * Sets the value of the cityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityCode(String value) {
        this.cityCode = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the civilId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCivilId() {
        return civilId;
    }

    /**
     * Sets the value of the civilId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCivilId(Long value) {
        this.civilId = value;
    }

    /**
     * Gets the value of the contactCivilId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContactCivilId() {
        return contactCivilId;
    }

    /**
     * Sets the value of the contactCivilId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContactCivilId(Long value) {
        this.contactCivilId = value;
    }

    /**
     * Gets the value of the contactGuardianType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactGuardianType() {
        return contactGuardianType;
    }

    /**
     * Sets the value of the contactGuardianType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactGuardianType(String value) {
        this.contactGuardianType = value;
    }

    /**
     * Gets the value of the contactPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getContactPersonId() {
        return contactPersonId;
    }

    /**
     * Sets the value of the contactPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setContactPersonId(Long value) {
        this.contactPersonId = value;
    }

    /**
     * Gets the value of the contactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactPhone() {
        return contactPhone;
    }

    /**
     * Sets the value of the contactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactPhone(String value) {
        this.contactPhone = value;
    }

    /**
     * Gets the value of the contactRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactRegnum() {
        return contactRegnum;
    }

    /**
     * Sets the value of the contactRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactRegnum(String value) {
        this.contactRegnum = value;
    }

    /**
     * Gets the value of the districtCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictCode() {
        return districtCode;
    }

    /**
     * Sets the value of the districtCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictCode(String value) {
        this.districtCode = value;
    }

    /**
     * Gets the value of the districtName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictName() {
        return districtName;
    }

    /**
     * Sets the value of the districtName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictName(String value) {
        this.districtName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the fullAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullAddress() {
        return fullAddress;
    }

    /**
     * Sets the value of the fullAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullAddress(String value) {
        this.fullAddress = value;
    }

    /**
     * Gets the value of the institutionId property.
     * 
     */
    public int getInstitutionId() {
        return institutionId;
    }

    /**
     * Sets the value of the institutionId property.
     * 
     */
    public void setInstitutionId(int value) {
        this.institutionId = value;
    }

    /**
     * Gets the value of the institutionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstitutionName() {
        return institutionName;
    }

    /**
     * Sets the value of the institutionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstitutionName(String value) {
        this.institutionName = value;
    }

    /**
     * Gets the value of the khorooCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKhorooCode() {
        return khorooCode;
    }

    /**
     * Sets the value of the khorooCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKhorooCode(String value) {
        this.khorooCode = value;
    }

    /**
     * Gets the value of the khorooName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKhorooName() {
        return khorooName;
    }

    /**
     * Sets the value of the khorooName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKhorooName(String value) {
        this.khorooName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the personId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPersonId(Long value) {
        this.personId = value;
    }

    /**
     * Gets the value of the recruiterFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecruiterFlag() {
        return recruiterFlag;
    }

    /**
     * Sets the value of the recruiterFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecruiterFlag(String value) {
        this.recruiterFlag = value;
    }

    /**
     * Gets the value of the recruiterId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRecruiterId() {
        return recruiterId;
    }

    /**
     * Sets the value of the recruiterId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRecruiterId(Long value) {
        this.recruiterId = value;
    }

    /**
     * Gets the value of the regnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnum() {
        return regnum;
    }

    /**
     * Sets the value of the regnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegnum(String value) {
        this.regnum = value;
    }

    /**
     * Gets the value of the requestStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestStatus() {
        return requestStatus;
    }

    /**
     * Sets the value of the requestStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestStatus(String value) {
        this.requestStatus = value;
    }

    /**
     * Gets the value of the ubLocationFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUbLocationFlag() {
        return ubLocationFlag;
    }

    /**
     * Sets the value of the ubLocationFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUbLocationFlag(String value) {
        this.ubLocationFlag = value;
    }

}
