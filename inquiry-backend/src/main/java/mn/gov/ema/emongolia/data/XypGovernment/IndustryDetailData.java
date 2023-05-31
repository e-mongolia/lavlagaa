
package mn.gov.ema.emongolia.data.XypGovernment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for industryDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="industryDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="changedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="companyLiability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="industryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="industryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="legalEntityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lisenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lisenced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lisencedByDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="lisencedByOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registeredNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "industryDetailData", propOrder = {
    "changedDate",
    "companyLiability",
    "companyRegnum",
    "industryCode",
    "industryName",
    "legalEntityName",
    "lisenceNumber",
    "lisenced",
    "lisencedByDate",
    "lisencedByOrg",
    "registerNumber",
    "registeredNumber",
    "status",
    "taxOrg"
})
public class IndustryDetailData {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changedDate;
    protected String companyLiability;
    protected String companyRegnum;
    protected String industryCode;
    protected String industryName;
    protected String legalEntityName;
    protected String lisenceNumber;
    protected String lisenced;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lisencedByDate;
    protected String lisencedByOrg;
    protected String registerNumber;
    protected String registeredNumber;
    protected String status;
    protected String taxOrg;

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
     * Gets the value of the industryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryCode() {
        return industryCode;
    }

    /**
     * Sets the value of the industryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryCode(String value) {
        this.industryCode = value;
    }

    /**
     * Gets the value of the industryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustryName() {
        return industryName;
    }

    /**
     * Sets the value of the industryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustryName(String value) {
        this.industryName = value;
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
     * Gets the value of the lisenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLisenceNumber() {
        return lisenceNumber;
    }

    /**
     * Sets the value of the lisenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLisenceNumber(String value) {
        this.lisenceNumber = value;
    }

    /**
     * Gets the value of the lisenced property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLisenced() {
        return lisenced;
    }

    /**
     * Sets the value of the lisenced property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLisenced(String value) {
        this.lisenced = value;
    }

    /**
     * Gets the value of the lisencedByDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLisencedByDate() {
        return lisencedByDate;
    }

    /**
     * Sets the value of the lisencedByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLisencedByDate(XMLGregorianCalendar value) {
        this.lisencedByDate = value;
    }

    /**
     * Gets the value of the lisencedByOrg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLisencedByOrg() {
        return lisencedByOrg;
    }

    /**
     * Sets the value of the lisencedByOrg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLisencedByOrg(String value) {
        this.lisencedByOrg = value;
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
