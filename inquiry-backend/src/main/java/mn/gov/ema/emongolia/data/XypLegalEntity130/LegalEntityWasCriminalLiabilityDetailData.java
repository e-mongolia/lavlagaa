
package mn.gov.ema.emongolia.data.XypLegalEntity130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for legalEntityWasCriminalLiabilityDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="legalEntityWasCriminalLiabilityDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="companyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyRegister" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="courtName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="decreeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endPunishment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exemptDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="legalAct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="property" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="punishmentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="punishmentLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="punishmentTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="punishmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "legalEntityWasCriminalLiabilityDetailData", propOrder = {
    "companyNumber",
    "companyRegister",
    "courtName",
    "decreeNumber",
    "description",
    "endPunishment",
    "exemptDate",
    "legalAct",
    "name",
    "property",
    "punishmentDate",
    "punishmentLevel",
    "punishmentTime",
    "punishmentType",
    "statusId"
})
public class LegalEntityWasCriminalLiabilityDetailData {

    protected String companyNumber;
    protected String companyRegister;
    protected String courtName;
    protected String decreeNumber;
    protected String description;
    protected String endPunishment;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exemptDate;
    protected String legalAct;
    protected String name;
    protected String property;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar punishmentDate;
    protected String punishmentLevel;
    protected String punishmentTime;
    protected String punishmentType;
    protected String statusId;

    /**
     * Gets the value of the companyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyNumber() {
        return companyNumber;
    }

    /**
     * Sets the value of the companyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyNumber(String value) {
        this.companyNumber = value;
    }

    /**
     * Gets the value of the companyRegister property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyRegister() {
        return companyRegister;
    }

    /**
     * Sets the value of the companyRegister property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyRegister(String value) {
        this.companyRegister = value;
    }

    /**
     * Gets the value of the courtName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourtName() {
        return courtName;
    }

    /**
     * Sets the value of the courtName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourtName(String value) {
        this.courtName = value;
    }

    /**
     * Gets the value of the decreeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecreeNumber() {
        return decreeNumber;
    }

    /**
     * Sets the value of the decreeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecreeNumber(String value) {
        this.decreeNumber = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the endPunishment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndPunishment() {
        return endPunishment;
    }

    /**
     * Sets the value of the endPunishment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndPunishment(String value) {
        this.endPunishment = value;
    }

    /**
     * Gets the value of the exemptDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExemptDate() {
        return exemptDate;
    }

    /**
     * Sets the value of the exemptDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExemptDate(XMLGregorianCalendar value) {
        this.exemptDate = value;
    }

    /**
     * Gets the value of the legalAct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalAct() {
        return legalAct;
    }

    /**
     * Sets the value of the legalAct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalAct(String value) {
        this.legalAct = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the property property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperty() {
        return property;
    }

    /**
     * Sets the value of the property property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperty(String value) {
        this.property = value;
    }

    /**
     * Gets the value of the punishmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPunishmentDate() {
        return punishmentDate;
    }

    /**
     * Sets the value of the punishmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPunishmentDate(XMLGregorianCalendar value) {
        this.punishmentDate = value;
    }

    /**
     * Gets the value of the punishmentLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPunishmentLevel() {
        return punishmentLevel;
    }

    /**
     * Sets the value of the punishmentLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPunishmentLevel(String value) {
        this.punishmentLevel = value;
    }

    /**
     * Gets the value of the punishmentTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPunishmentTime() {
        return punishmentTime;
    }

    /**
     * Sets the value of the punishmentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPunishmentTime(String value) {
        this.punishmentTime = value;
    }

    /**
     * Gets the value of the punishmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPunishmentType() {
        return punishmentType;
    }

    /**
     * Sets the value of the punishmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPunishmentType(String value) {
        this.punishmentType = value;
    }

    /**
     * Gets the value of the statusId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusId() {
        return statusId;
    }

    /**
     * Sets the value of the statusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusId(String value) {
        this.statusId = value;
    }

}
