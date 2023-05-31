
package mn.gov.ema.emongolia.data.XypTax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceLogTenderData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceLogTenderData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="call_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="call_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dedicate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dedicate_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dedicate_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entity_address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entity_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entity_tin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="etype_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="etype_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="head_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="off_code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="organisation_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reg_date" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="resultCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceLogTenderData", namespace = "http://ws/", propOrder = {
    "callDate",
    "callNumber",
    "dedicate",
    "dedicateDate",
    "dedicateNumber",
    "entityAddress",
    "entityName",
    "entityTin",
    "etypeCode",
    "etypeName",
    "headName",
    "offCode",
    "organisationId",
    "regDate",
    "resultCode"
})
public class ServiceLogTenderData {

    @XmlElement(name = "call_date")
    protected String callDate;
    @XmlElement(name = "call_number")
    protected String callNumber;
    protected String dedicate;
    @XmlElement(name = "dedicate_date")
    protected String dedicateDate;
    @XmlElement(name = "dedicate_number")
    protected String dedicateNumber;
    @XmlElement(name = "entity_address")
    protected String entityAddress;
    @XmlElement(name = "entity_name")
    protected String entityName;
    @XmlElement(name = "entity_tin")
    protected String entityTin;
    @XmlElement(name = "etype_code")
    protected String etypeCode;
    @XmlElement(name = "etype_name")
    protected String etypeName;
    @XmlElement(name = "head_name")
    protected String headName;
    @XmlElement(name = "off_code")
    protected String offCode;
    @XmlElement(name = "organisation_id")
    protected String organisationId;
    @XmlElement(name = "reg_date")
    protected String regDate;
    protected int resultCode;

    /**
     * Gets the value of the callDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallDate() {
        return callDate;
    }

    /**
     * Sets the value of the callDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallDate(String value) {
        this.callDate = value;
    }

    /**
     * Gets the value of the callNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallNumber() {
        return callNumber;
    }

    /**
     * Sets the value of the callNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallNumber(String value) {
        this.callNumber = value;
    }

    /**
     * Gets the value of the dedicate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDedicate() {
        return dedicate;
    }

    /**
     * Sets the value of the dedicate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDedicate(String value) {
        this.dedicate = value;
    }

    /**
     * Gets the value of the dedicateDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDedicateDate() {
        return dedicateDate;
    }

    /**
     * Sets the value of the dedicateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDedicateDate(String value) {
        this.dedicateDate = value;
    }

    /**
     * Gets the value of the dedicateNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDedicateNumber() {
        return dedicateNumber;
    }

    /**
     * Sets the value of the dedicateNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDedicateNumber(String value) {
        this.dedicateNumber = value;
    }

    /**
     * Gets the value of the entityAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityAddress() {
        return entityAddress;
    }

    /**
     * Sets the value of the entityAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityAddress(String value) {
        this.entityAddress = value;
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
     * Gets the value of the entityTin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityTin() {
        return entityTin;
    }

    /**
     * Sets the value of the entityTin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityTin(String value) {
        this.entityTin = value;
    }

    /**
     * Gets the value of the etypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtypeCode() {
        return etypeCode;
    }

    /**
     * Sets the value of the etypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtypeCode(String value) {
        this.etypeCode = value;
    }

    /**
     * Gets the value of the etypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEtypeName() {
        return etypeName;
    }

    /**
     * Sets the value of the etypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEtypeName(String value) {
        this.etypeName = value;
    }

    /**
     * Gets the value of the headName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadName() {
        return headName;
    }

    /**
     * Sets the value of the headName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadName(String value) {
        this.headName = value;
    }

    /**
     * Gets the value of the offCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffCode() {
        return offCode;
    }

    /**
     * Sets the value of the offCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffCode(String value) {
        this.offCode = value;
    }

    /**
     * Gets the value of the organisationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganisationId() {
        return organisationId;
    }

    /**
     * Sets the value of the organisationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganisationId(String value) {
        this.organisationId = value;
    }

    /**
     * Gets the value of the regDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegDate() {
        return regDate;
    }

    /**
     * Sets the value of the regDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegDate(String value) {
        this.regDate = value;
    }

    /**
     * Gets the value of the resultCode property.
     * 
     */
    public int getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     */
    public void setResultCode(int value) {
        this.resultCode = value;
    }

}
