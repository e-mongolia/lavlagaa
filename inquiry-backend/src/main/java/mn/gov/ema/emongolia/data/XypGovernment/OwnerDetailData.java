
package mn.gov.ema.emongolia.data.XypGovernment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ownerDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ownerDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="assetPercent" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="assetQty" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="changedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="classification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyLiability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="legalEntityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="owhershipType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registeredNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ownerDetailData", propOrder = {
    "assetPercent",
    "assetQty",
    "changedDate",
    "classification",
    "companyLiability",
    "companyName",
    "companyRegnum",
    "firstname",
    "lastname",
    "legalEntityName",
    "owhershipType",
    "registerNumber",
    "registeredNumber",
    "regnum",
    "status",
    "taxOrg"
})
public class OwnerDetailData {

    protected double assetPercent;
    protected double assetQty;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changedDate;
    protected String classification;
    protected String companyLiability;
    protected String companyName;
    protected String companyRegnum;
    protected String firstname;
    protected String lastname;
    protected String legalEntityName;
    protected String owhershipType;
    protected String registerNumber;
    protected String registeredNumber;
    protected String regnum;
    protected String status;
    protected String taxOrg;

    /**
     * Gets the value of the assetPercent property.
     * 
     */
    public double getAssetPercent() {
        return assetPercent;
    }

    /**
     * Sets the value of the assetPercent property.
     * 
     */
    public void setAssetPercent(double value) {
        this.assetPercent = value;
    }

    /**
     * Gets the value of the assetQty property.
     * 
     */
    public double getAssetQty() {
        return assetQty;
    }

    /**
     * Sets the value of the assetQty property.
     * 
     */
    public void setAssetQty(double value) {
        this.assetQty = value;
    }

    /**
     * Gets the value of the changedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChangedDate() {
        return changedDate;
    }

    /**
     * Sets the value of the changedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChangedDate(XMLGregorianCalendar value) {
        this.changedDate = value;
    }

    /**
     * Gets the value of the classification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassification() {
        return classification;
    }

    /**
     * Sets the value of the classification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassification(String value) {
        this.classification = value;
    }

    /**
     * Gets the value of the companyLiability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyLiability() {
        return companyLiability;
    }

    /**
     * Sets the value of the companyLiability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyLiability(String value) {
        this.companyLiability = value;
    }

    /**
     * Gets the value of the companyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyName(String value) {
        this.companyName = value;
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
     * Gets the value of the legalEntityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalEntityName() {
        return legalEntityName;
    }

    /**
     * Sets the value of the legalEntityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalEntityName(String value) {
        this.legalEntityName = value;
    }

    /**
     * Gets the value of the owhershipType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwhershipType() {
        return owhershipType;
    }

    /**
     * Sets the value of the owhershipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwhershipType(String value) {
        this.owhershipType = value;
    }

    /**
     * Gets the value of the registerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterNumber() {
        return registerNumber;
    }

    /**
     * Sets the value of the registerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterNumber(String value) {
        this.registerNumber = value;
    }

    /**
     * Gets the value of the registeredNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisteredNumber() {
        return registeredNumber;
    }

    /**
     * Sets the value of the registeredNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisteredNumber(String value) {
        this.registeredNumber = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the taxOrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxOrg() {
        return taxOrg;
    }

    /**
     * Sets the value of the taxOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxOrg(String value) {
        this.taxOrg = value;
    }

}
