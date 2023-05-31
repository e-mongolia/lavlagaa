
package mn.gov.ema.emongolia.data.XypProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for propertyListDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propertyListDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fullAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="movedCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="movedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="movedJustification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownershipId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownershipStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="personCorpId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="personNameCorp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="propertyNationRegisterNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="propertyServiceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="propertySize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serviceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serviceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propertyListDetailData", propOrder = {
    "code",
    "codeName",
    "firstname",
    "fullAddress",
    "lastname",
    "movedCount",
    "movedDate",
    "movedJustification",
    "ownershipId",
    "ownershipStatus",
    "personCorpId",
    "personNameCorp",
    "propertyNationRegisterNumber",
    "propertyServiceId",
    "propertySize",
    "serviceDate",
    "serviceName",
    "serviceType"
})
public class PropertyListDetailData {

    protected String code;
    protected String codeName;
    protected String firstname;
    protected String fullAddress;
    protected String lastname;
    protected int movedCount;
    protected String movedDate;
    protected String movedJustification;
    protected String ownershipId;
    protected String ownershipStatus;
    protected String personCorpId;
    protected String personNameCorp;
    protected String propertyNationRegisterNumber;
    protected String propertyServiceId;
    protected String propertySize;
    protected String serviceDate;
    protected String serviceName;
    protected String serviceType;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the codeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeName() {
        return codeName;
    }

    /**
     * Sets the value of the codeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeName(String value) {
        this.codeName = value;
    }

    /**
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstname(String value) {
        this.firstname = value;
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
     * Gets the value of the lastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastname(String value) {
        this.lastname = value;
    }

    /**
     * Gets the value of the movedCount property.
     * 
     */
    public int getMovedCount() {
        return movedCount;
    }

    /**
     * Sets the value of the movedCount property.
     * 
     */
    public void setMovedCount(int value) {
        this.movedCount = value;
    }

    /**
     * Gets the value of the movedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovedDate() {
        return movedDate;
    }

    /**
     * Sets the value of the movedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovedDate(String value) {
        this.movedDate = value;
    }

    /**
     * Gets the value of the movedJustification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMovedJustification() {
        return movedJustification;
    }

    /**
     * Sets the value of the movedJustification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMovedJustification(String value) {
        this.movedJustification = value;
    }

    /**
     * Gets the value of the ownershipId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnershipId() {
        return ownershipId;
    }

    /**
     * Sets the value of the ownershipId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnershipId(String value) {
        this.ownershipId = value;
    }

    /**
     * Gets the value of the ownershipStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnershipStatus() {
        return ownershipStatus;
    }

    /**
     * Sets the value of the ownershipStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnershipStatus(String value) {
        this.ownershipStatus = value;
    }

    /**
     * Gets the value of the personCorpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonCorpId() {
        return personCorpId;
    }

    /**
     * Sets the value of the personCorpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonCorpId(String value) {
        this.personCorpId = value;
    }

    /**
     * Gets the value of the personNameCorp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonNameCorp() {
        return personNameCorp;
    }

    /**
     * Sets the value of the personNameCorp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonNameCorp(String value) {
        this.personNameCorp = value;
    }

    /**
     * Gets the value of the propertyNationRegisterNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyNationRegisterNumber() {
        return propertyNationRegisterNumber;
    }

    /**
     * Sets the value of the propertyNationRegisterNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyNationRegisterNumber(String value) {
        this.propertyNationRegisterNumber = value;
    }

    /**
     * Gets the value of the propertyServiceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyServiceId() {
        return propertyServiceId;
    }

    /**
     * Sets the value of the propertyServiceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyServiceId(String value) {
        this.propertyServiceId = value;
    }

    /**
     * Gets the value of the propertySize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertySize() {
        return propertySize;
    }

    /**
     * Sets the value of the propertySize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertySize(String value) {
        this.propertySize = value;
    }

    /**
     * Gets the value of the serviceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDate() {
        return serviceDate;
    }

    /**
     * Sets the value of the serviceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDate(String value) {
        this.serviceDate = value;
    }

    /**
     * Gets the value of the serviceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Sets the value of the serviceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Gets the value of the serviceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

}
