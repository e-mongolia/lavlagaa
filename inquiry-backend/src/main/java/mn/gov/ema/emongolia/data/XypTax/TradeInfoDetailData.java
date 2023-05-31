
package mn.gov.ema.emongolia.data.XypTax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for tradeInfoDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tradeInfoDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contractStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="directorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="directorRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="founderName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="founderRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="locationLat" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="locationLng" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="operationCourse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="operationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tradeContractDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="tradeContractEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="tradeContractOrganization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tradeInfoDetailData", propOrder = {
    "address",
    "contractStatus",
    "directorName",
    "directorRegnum",
    "entityName",
    "founderName",
    "founderRegnum",
    "id",
    "lastname",
    "locationLat",
    "locationLng",
    "operationCourse",
    "operationStatus",
    "operationType",
    "orgRegnum",
    "tradeContractDate",
    "tradeContractEndDate",
    "tradeContractOrganization"
})
public class TradeInfoDetailData {

    protected String address;
    protected String contractStatus;
    protected String directorName;
    protected String directorRegnum;
    protected String entityName;
    protected String founderName;
    protected String founderRegnum;
    protected String id;
    protected String lastname;
    protected int locationLat;
    protected int locationLng;
    protected String operationCourse;
    protected String operationStatus;
    protected String operationType;
    protected String orgRegnum;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tradeContractDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tradeContractEndDate;
    protected String tradeContractOrganization;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the contractStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractStatus() {
        return contractStatus;
    }

    /**
     * Sets the value of the contractStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractStatus(String value) {
        this.contractStatus = value;
    }

    /**
     * Gets the value of the directorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectorName() {
        return directorName;
    }

    /**
     * Sets the value of the directorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectorName(String value) {
        this.directorName = value;
    }

    /**
     * Gets the value of the directorRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectorRegnum() {
        return directorRegnum;
    }

    /**
     * Sets the value of the directorRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectorRegnum(String value) {
        this.directorRegnum = value;
    }

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityName(String value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the founderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFounderName() {
        return founderName;
    }

    /**
     * Sets the value of the founderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFounderName(String value) {
        this.founderName = value;
    }

    /**
     * Gets the value of the founderRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFounderRegnum() {
        return founderRegnum;
    }

    /**
     * Sets the value of the founderRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFounderRegnum(String value) {
        this.founderRegnum = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
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
     * Gets the value of the locationLat property.
     * 
     */
    public int getLocationLat() {
        return locationLat;
    }

    /**
     * Sets the value of the locationLat property.
     * 
     */
    public void setLocationLat(int value) {
        this.locationLat = value;
    }

    /**
     * Gets the value of the locationLng property.
     * 
     */
    public int getLocationLng() {
        return locationLng;
    }

    /**
     * Sets the value of the locationLng property.
     * 
     */
    public void setLocationLng(int value) {
        this.locationLng = value;
    }

    /**
     * Gets the value of the operationCourse property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationCourse() {
        return operationCourse;
    }

    /**
     * Sets the value of the operationCourse property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationCourse(String value) {
        this.operationCourse = value;
    }

    /**
     * Gets the value of the operationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationStatus() {
        return operationStatus;
    }

    /**
     * Sets the value of the operationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationStatus(String value) {
        this.operationStatus = value;
    }

    /**
     * Gets the value of the operationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationType() {
        return operationType;
    }

    /**
     * Sets the value of the operationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationType(String value) {
        this.operationType = value;
    }

    /**
     * Gets the value of the orgRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgRegnum() {
        return orgRegnum;
    }

    /**
     * Sets the value of the orgRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgRegnum(String value) {
        this.orgRegnum = value;
    }

    /**
     * Gets the value of the tradeContractDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTradeContractDate() {
        return tradeContractDate;
    }

    /**
     * Sets the value of the tradeContractDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTradeContractDate(XMLGregorianCalendar value) {
        this.tradeContractDate = value;
    }

    /**
     * Gets the value of the tradeContractEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTradeContractEndDate() {
        return tradeContractEndDate;
    }

    /**
     * Sets the value of the tradeContractEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTradeContractEndDate(XMLGregorianCalendar value) {
        this.tradeContractEndDate = value;
    }

    /**
     * Gets the value of the tradeContractOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeContractOrganization() {
        return tradeContractOrganization;
    }

    /**
     * Sets the value of the tradeContractOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeContractOrganization(String value) {
        this.tradeContractOrganization = value;
    }

}
