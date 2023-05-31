
package mn.gov.ema.emongolia.data.XypLegalEntity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="address"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addressStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressType" type="{http://les.xyp.gov.mn/}addressUnit" minOccurs="0"/&gt;
 *         &lt;element name="apartment" type="{http://les.xyp.gov.mn/}addressUnit" minOccurs="0"/&gt;
 *         &lt;element name="bagKhoroo" type="{http://les.xyp.gov.mn/}addressUnit" minOccurs="0"/&gt;
 *         &lt;element name="companyRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createdUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="door" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mobileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="postBox" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="region" type="{http://les.xyp.gov.mn/}addressUnit" minOccurs="0"/&gt;
 *         &lt;element name="soumDistrict" type="{http://les.xyp.gov.mn/}addressUnit" minOccurs="0"/&gt;
 *         &lt;element name="stateCity" type="{http://les.xyp.gov.mn/}addressUnit" minOccurs="0"/&gt;
 *         &lt;element name="street" type="{http://les.xyp.gov.mn/}addressUnit" minOccurs="0"/&gt;
 *         &lt;element name="town" type="{http://les.xyp.gov.mn/}addressUnit" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "address", propOrder = {
    "addressStatus",
    "addressType",
    "apartment",
    "bagKhoroo",
    "companyRegnum",
    "createdDate",
    "createdUserName",
    "door",
    "email",
    "fax",
    "mobileNumber",
    "phoneNumber",
    "postBox",
    "region",
    "soumDistrict",
    "stateCity",
    "street",
    "town"
})
public class Address {

    protected String addressStatus;
    protected AddressUnit addressType;
    protected AddressUnit apartment;
    protected AddressUnit bagKhoroo;
    protected String companyRegnum;
    protected String createdDate;
    protected String createdUserName;
    protected String door;
    protected String email;
    protected String fax;
    protected String mobileNumber;
    protected String phoneNumber;
    protected String postBox;
    protected AddressUnit region;
    protected AddressUnit soumDistrict;
    protected AddressUnit stateCity;
    protected AddressUnit street;
    protected AddressUnit town;

    /**
     * Gets the value of the addressStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressStatus() {
        return addressStatus;
    }

    /**
     * Sets the value of the addressStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressStatus(String value) {
        this.addressStatus = value;
    }

    /**
     * Gets the value of the addressType property.
     * 
     * @return
     *     possible object is
     *     {@link AddressUnit }
     *     
     */
    public AddressUnit getAddressType() {
        return addressType;
    }

    /**
     * Sets the value of the addressType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressUnit }
     *     
     */
    public void setAddressType(AddressUnit value) {
        this.addressType = value;
    }

    /**
     * Gets the value of the apartment property.
     * 
     * @return
     *     possible object is
     *     {@link AddressUnit }
     *     
     */
    public AddressUnit getApartment() {
        return apartment;
    }

    /**
     * Sets the value of the apartment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressUnit }
     *     
     */
    public void setApartment(AddressUnit value) {
        this.apartment = value;
    }

    /**
     * Gets the value of the bagKhoroo property.
     * 
     * @return
     *     possible object is
     *     {@link AddressUnit }
     *     
     */
    public AddressUnit getBagKhoroo() {
        return bagKhoroo;
    }

    /**
     * Sets the value of the bagKhoroo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressUnit }
     *     
     */
    public void setBagKhoroo(AddressUnit value) {
        this.bagKhoroo = value;
    }

    /**
     * Gets the value of the companyRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyRegnum() {
        return companyRegnum;
    }

    /**
     * Sets the value of the companyRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyRegnum(String value) {
        this.companyRegnum = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedDate(String value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the createdUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedUserName() {
        return createdUserName;
    }

    /**
     * Sets the value of the createdUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedUserName(String value) {
        this.createdUserName = value;
    }

    /**
     * Gets the value of the door property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDoor() {
        return door;
    }

    /**
     * Sets the value of the door property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDoor(String value) {
        this.door = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the mobileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Sets the value of the mobileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNumber(String value) {
        this.mobileNumber = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneNumber(String value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the postBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostBox() {
        return postBox;
    }

    /**
     * Sets the value of the postBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostBox(String value) {
        this.postBox = value;
    }

    /**
     * Gets the value of the region property.
     * 
     * @return
     *     possible object is
     *     {@link AddressUnit }
     *     
     */
    public AddressUnit getRegion() {
        return region;
    }

    /**
     * Sets the value of the region property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressUnit }
     *     
     */
    public void setRegion(AddressUnit value) {
        this.region = value;
    }

    /**
     * Gets the value of the soumDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link AddressUnit }
     *     
     */
    public AddressUnit getSoumDistrict() {
        return soumDistrict;
    }

    /**
     * Sets the value of the soumDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressUnit }
     *     
     */
    public void setSoumDistrict(AddressUnit value) {
        this.soumDistrict = value;
    }

    /**
     * Gets the value of the stateCity property.
     * 
     * @return
     *     possible object is
     *     {@link AddressUnit }
     *     
     */
    public AddressUnit getStateCity() {
        return stateCity;
    }

    /**
     * Sets the value of the stateCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressUnit }
     *     
     */
    public void setStateCity(AddressUnit value) {
        this.stateCity = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link AddressUnit }
     *     
     */
    public AddressUnit getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressUnit }
     *     
     */
    public void setStreet(AddressUnit value) {
        this.street = value;
    }

    /**
     * Gets the value of the town property.
     * 
     * @return
     *     possible object is
     *     {@link AddressUnit }
     *     
     */
    public AddressUnit getTown() {
        return town;
    }

    /**
     * Sets the value of the town property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressUnit }
     *     
     */
    public void setTown(AddressUnit value) {
        this.town = value;
    }

}
