
package mn.gov.ema.emongolia.data.XypGovernment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for generalDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="generalDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="assetQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="changedComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="changedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="companyLiability" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="founderCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="founderDecisionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="founderDecisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="legalEntityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="owhershipType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registerDecisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registerNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regulationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="shareHolderCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxOrg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toWorkBeginDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toWorkEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="toWorkPeriodChecked" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generalDetailData", propOrder = {
    "assetQty",
    "changedComment",
    "changedDate",
    "companyLiability",
    "companyName",
    "companyRegnum",
    "founderCount",
    "founderDecisionDate",
    "founderDecisionNumber",
    "legalEntityName",
    "owhershipType",
    "registerDecisionNumber",
    "registerNumber",
    "regulationDate",
    "shareHolderCount",
    "status",
    "taxOrg",
    "toWorkBeginDate",
    "toWorkEndDate",
    "toWorkPeriodChecked"
})
public class GeneralDetailData {

    protected String assetQty;
    protected String changedComment;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changedDate;
    protected String companyLiability;
    protected String companyName;
    protected String companyRegnum;
    protected int founderCount;
    protected String founderDecisionDate;
    protected String founderDecisionNumber;
    protected String legalEntityName;
    protected String owhershipType;
    protected String registerDecisionNumber;
    protected String registerNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar regulationDate;
    protected int shareHolderCount;
    protected String status;
    protected String taxOrg;
    protected String toWorkBeginDate;
    protected String toWorkEndDate;
    protected String toWorkPeriodChecked;

    /**
     * Gets the value of the assetQty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetQty() {
        return assetQty;
    }

    /**
     * Sets the value of the assetQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetQty(String value) {
        this.assetQty = value;
    }

    /**
     * Gets the value of the changedComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangedComment() {
        return changedComment;
    }

    /**
     * Sets the value of the changedComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangedComment(String value) {
        this.changedComment = value;
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
     * Gets the value of the founderCount property.
     * 
     */
    public int getFounderCount() {
        return founderCount;
    }

    /**
     * Sets the value of the founderCount property.
     * 
     */
    public void setFounderCount(int value) {
        this.founderCount = value;
    }

    /**
     * Gets the value of the founderDecisionDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFounderDecisionDate() {
        return founderDecisionDate;
    }

    /**
     * Sets the value of the founderDecisionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFounderDecisionDate(String value) {
        this.founderDecisionDate = value;
    }

    /**
     * Gets the value of the founderDecisionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFounderDecisionNumber() {
        return founderDecisionNumber;
    }

    /**
     * Sets the value of the founderDecisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFounderDecisionNumber(String value) {
        this.founderDecisionNumber = value;
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
     * Gets the value of the registerDecisionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegisterDecisionNumber() {
        return registerDecisionNumber;
    }

    /**
     * Sets the value of the registerDecisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegisterDecisionNumber(String value) {
        this.registerDecisionNumber = value;
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
     * Gets the value of the regulationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegulationDate() {
        return regulationDate;
    }

    /**
     * Sets the value of the regulationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegulationDate(XMLGregorianCalendar value) {
        this.regulationDate = value;
    }

    /**
     * Gets the value of the shareHolderCount property.
     * 
     */
    public int getShareHolderCount() {
        return shareHolderCount;
    }

    /**
     * Sets the value of the shareHolderCount property.
     * 
     */
    public void setShareHolderCount(int value) {
        this.shareHolderCount = value;
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

    /**
     * Gets the value of the toWorkBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToWorkBeginDate() {
        return toWorkBeginDate;
    }

    /**
     * Sets the value of the toWorkBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToWorkBeginDate(String value) {
        this.toWorkBeginDate = value;
    }

    /**
     * Gets the value of the toWorkEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToWorkEndDate() {
        return toWorkEndDate;
    }

    /**
     * Sets the value of the toWorkEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToWorkEndDate(String value) {
        this.toWorkEndDate = value;
    }

    /**
     * Gets the value of the toWorkPeriodChecked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToWorkPeriodChecked() {
        return toWorkPeriodChecked;
    }

    /**
     * Sets the value of the toWorkPeriodChecked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToWorkPeriodChecked(String value) {
        this.toWorkPeriodChecked = value;
    }

}
