
package mn.gov.ema.emongolia.data.XypTax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for taxOrganizationTT03Detial complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taxOrganizationTT03Detial"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="doneDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="entityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="frequency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isActive" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isXReport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="officeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="period" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="receiptDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="submittedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="TAG001A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG002A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG003A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG004A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG005A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG006A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG007A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG008A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG009A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG010A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG011A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG012A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG013A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG014A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG015A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG016A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG017A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG018A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG019A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG020A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG021A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG022A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG023A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG024A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG025A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG026A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG027A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG028A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG029A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG030A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG031A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG032A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG033A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG034A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG035A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG036A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG037A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG038A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG039A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG040A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG041A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG042A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG043A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG044A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG045A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG046A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG047A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG048A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG049A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG050A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG051A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG052A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG053A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG054A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG055A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG056A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG057A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG058A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG059A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG060A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG061A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG062A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG063A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="taxPeriod" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="taxReportCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxReportFormId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxYear" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="tin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="updatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="workflowStatusId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taxOrganizationTT03Detial", propOrder = {
    "createdDate",
    "doneDate",
    "entityName",
    "frequency",
    "isActive",
    "isXReport",
    "officeCode",
    "period",
    "receiptDate",
    "submittedDate",
    "tag001A",
    "tag002A",
    "tag003A",
    "tag004A",
    "tag005A",
    "tag006A",
    "tag007A",
    "tag008A",
    "tag009A",
    "tag010A",
    "tag011A",
    "tag012A",
    "tag013A",
    "tag014A",
    "tag015A",
    "tag016A",
    "tag017A",
    "tag018A",
    "tag019A",
    "tag020A",
    "tag021A",
    "tag022A",
    "tag023A",
    "tag024A",
    "tag025A",
    "tag026A",
    "tag027A",
    "tag028A",
    "tag029A",
    "tag030A",
    "tag031A",
    "tag032A",
    "tag033A",
    "tag034A",
    "tag035A",
    "tag036A",
    "tag037A",
    "tag038A",
    "tag039A",
    "tag040A",
    "tag041A",
    "tag042A",
    "tag043A",
    "tag044A",
    "tag045A",
    "tag046A",
    "tag047A",
    "tag048A",
    "tag049A",
    "tag050A",
    "tag051A",
    "tag052A",
    "tag053A",
    "tag054A",
    "tag055A",
    "tag056A",
    "tag057A",
    "tag058A",
    "tag059A",
    "tag060A",
    "tag061A",
    "tag062A",
    "tag063A",
    "taxPeriod",
    "taxReportCode",
    "taxReportFormId",
    "taxYear",
    "tin",
    "updatedDate",
    "workflowStatusId"
})
public class TaxOrganizationTT03Detial {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar doneDate;
    protected String entityName;
    protected String frequency;
    protected String isActive;
    protected String isXReport;
    protected String officeCode;
    protected String period;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receiptDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submittedDate;
    @XmlElement(name = "TAG001A")
    protected double tag001A;
    @XmlElement(name = "TAG002A")
    protected double tag002A;
    @XmlElement(name = "TAG003A")
    protected double tag003A;
    @XmlElement(name = "TAG004A")
    protected double tag004A;
    @XmlElement(name = "TAG005A")
    protected double tag005A;
    @XmlElement(name = "TAG006A")
    protected double tag006A;
    @XmlElement(name = "TAG007A")
    protected double tag007A;
    @XmlElement(name = "TAG008A")
    protected double tag008A;
    @XmlElement(name = "TAG009A")
    protected double tag009A;
    @XmlElement(name = "TAG010A")
    protected double tag010A;
    @XmlElement(name = "TAG011A")
    protected double tag011A;
    @XmlElement(name = "TAG012A")
    protected double tag012A;
    @XmlElement(name = "TAG013A")
    protected double tag013A;
    @XmlElement(name = "TAG014A")
    protected double tag014A;
    @XmlElement(name = "TAG015A")
    protected double tag015A;
    @XmlElement(name = "TAG016A")
    protected double tag016A;
    @XmlElement(name = "TAG017A")
    protected double tag017A;
    @XmlElement(name = "TAG018A")
    protected double tag018A;
    @XmlElement(name = "TAG019A")
    protected double tag019A;
    @XmlElement(name = "TAG020A")
    protected double tag020A;
    @XmlElement(name = "TAG021A")
    protected double tag021A;
    @XmlElement(name = "TAG022A")
    protected double tag022A;
    @XmlElement(name = "TAG023A")
    protected double tag023A;
    @XmlElement(name = "TAG024A")
    protected double tag024A;
    @XmlElement(name = "TAG025A")
    protected double tag025A;
    @XmlElement(name = "TAG026A")
    protected double tag026A;
    @XmlElement(name = "TAG027A")
    protected double tag027A;
    @XmlElement(name = "TAG028A")
    protected double tag028A;
    @XmlElement(name = "TAG029A")
    protected double tag029A;
    @XmlElement(name = "TAG030A")
    protected double tag030A;
    @XmlElement(name = "TAG031A")
    protected double tag031A;
    @XmlElement(name = "TAG032A")
    protected double tag032A;
    @XmlElement(name = "TAG033A")
    protected double tag033A;
    @XmlElement(name = "TAG034A")
    protected double tag034A;
    @XmlElement(name = "TAG035A")
    protected double tag035A;
    @XmlElement(name = "TAG036A")
    protected double tag036A;
    @XmlElement(name = "TAG037A")
    protected double tag037A;
    @XmlElement(name = "TAG038A")
    protected double tag038A;
    @XmlElement(name = "TAG039A")
    protected double tag039A;
    @XmlElement(name = "TAG040A")
    protected double tag040A;
    @XmlElement(name = "TAG041A")
    protected double tag041A;
    @XmlElement(name = "TAG042A")
    protected double tag042A;
    @XmlElement(name = "TAG043A")
    protected double tag043A;
    @XmlElement(name = "TAG044A")
    protected double tag044A;
    @XmlElement(name = "TAG045A")
    protected double tag045A;
    @XmlElement(name = "TAG046A")
    protected double tag046A;
    @XmlElement(name = "TAG047A")
    protected double tag047A;
    @XmlElement(name = "TAG048A")
    protected double tag048A;
    @XmlElement(name = "TAG049A")
    protected double tag049A;
    @XmlElement(name = "TAG050A")
    protected double tag050A;
    @XmlElement(name = "TAG051A")
    protected double tag051A;
    @XmlElement(name = "TAG052A")
    protected double tag052A;
    @XmlElement(name = "TAG053A")
    protected double tag053A;
    @XmlElement(name = "TAG054A")
    protected double tag054A;
    @XmlElement(name = "TAG055A")
    protected double tag055A;
    @XmlElement(name = "TAG056A")
    protected double tag056A;
    @XmlElement(name = "TAG057A")
    protected double tag057A;
    @XmlElement(name = "TAG058A")
    protected double tag058A;
    @XmlElement(name = "TAG059A")
    protected double tag059A;
    @XmlElement(name = "TAG060A")
    protected double tag060A;
    @XmlElement(name = "TAG061A")
    protected double tag061A;
    @XmlElement(name = "TAG062A")
    protected double tag062A;
    @XmlElement(name = "TAG063A")
    protected double tag063A;
    protected int taxPeriod;
    protected String taxReportCode;
    protected String taxReportFormId;
    protected int taxYear;
    protected String tin;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar updatedDate;
    protected String workflowStatusId;

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the doneDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDoneDate() {
        return doneDate;
    }

    /**
     * Sets the value of the doneDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDoneDate(XMLGregorianCalendar value) {
        this.doneDate = value;
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
     * Gets the value of the frequency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrequency(String value) {
        this.frequency = value;
    }

    /**
     * Gets the value of the isActive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsActive() {
        return isActive;
    }

    /**
     * Sets the value of the isActive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsActive(String value) {
        this.isActive = value;
    }

    /**
     * Gets the value of the isXReport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsXReport() {
        return isXReport;
    }

    /**
     * Sets the value of the isXReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsXReport(String value) {
        this.isXReport = value;
    }

    /**
     * Gets the value of the officeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeCode() {
        return officeCode;
    }

    /**
     * Sets the value of the officeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeCode(String value) {
        this.officeCode = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriod(String value) {
        this.period = value;
    }

    /**
     * Gets the value of the receiptDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceiptDate() {
        return receiptDate;
    }

    /**
     * Sets the value of the receiptDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceiptDate(XMLGregorianCalendar value) {
        this.receiptDate = value;
    }

    /**
     * Gets the value of the submittedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmittedDate() {
        return submittedDate;
    }

    /**
     * Sets the value of the submittedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmittedDate(XMLGregorianCalendar value) {
        this.submittedDate = value;
    }

    /**
     * Gets the value of the tag001A property.
     * 
     */
    public double getTAG001A() {
        return tag001A;
    }

    /**
     * Sets the value of the tag001A property.
     * 
     */
    public void setTAG001A(double value) {
        this.tag001A = value;
    }

    /**
     * Gets the value of the tag002A property.
     * 
     */
    public double getTAG002A() {
        return tag002A;
    }

    /**
     * Sets the value of the tag002A property.
     * 
     */
    public void setTAG002A(double value) {
        this.tag002A = value;
    }

    /**
     * Gets the value of the tag003A property.
     * 
     */
    public double getTAG003A() {
        return tag003A;
    }

    /**
     * Sets the value of the tag003A property.
     * 
     */
    public void setTAG003A(double value) {
        this.tag003A = value;
    }

    /**
     * Gets the value of the tag004A property.
     * 
     */
    public double getTAG004A() {
        return tag004A;
    }

    /**
     * Sets the value of the tag004A property.
     * 
     */
    public void setTAG004A(double value) {
        this.tag004A = value;
    }

    /**
     * Gets the value of the tag005A property.
     * 
     */
    public double getTAG005A() {
        return tag005A;
    }

    /**
     * Sets the value of the tag005A property.
     * 
     */
    public void setTAG005A(double value) {
        this.tag005A = value;
    }

    /**
     * Gets the value of the tag006A property.
     * 
     */
    public double getTAG006A() {
        return tag006A;
    }

    /**
     * Sets the value of the tag006A property.
     * 
     */
    public void setTAG006A(double value) {
        this.tag006A = value;
    }

    /**
     * Gets the value of the tag007A property.
     * 
     */
    public double getTAG007A() {
        return tag007A;
    }

    /**
     * Sets the value of the tag007A property.
     * 
     */
    public void setTAG007A(double value) {
        this.tag007A = value;
    }

    /**
     * Gets the value of the tag008A property.
     * 
     */
    public double getTAG008A() {
        return tag008A;
    }

    /**
     * Sets the value of the tag008A property.
     * 
     */
    public void setTAG008A(double value) {
        this.tag008A = value;
    }

    /**
     * Gets the value of the tag009A property.
     * 
     */
    public double getTAG009A() {
        return tag009A;
    }

    /**
     * Sets the value of the tag009A property.
     * 
     */
    public void setTAG009A(double value) {
        this.tag009A = value;
    }

    /**
     * Gets the value of the tag010A property.
     * 
     */
    public double getTAG010A() {
        return tag010A;
    }

    /**
     * Sets the value of the tag010A property.
     * 
     */
    public void setTAG010A(double value) {
        this.tag010A = value;
    }

    /**
     * Gets the value of the tag011A property.
     * 
     */
    public double getTAG011A() {
        return tag011A;
    }

    /**
     * Sets the value of the tag011A property.
     * 
     */
    public void setTAG011A(double value) {
        this.tag011A = value;
    }

    /**
     * Gets the value of the tag012A property.
     * 
     */
    public double getTAG012A() {
        return tag012A;
    }

    /**
     * Sets the value of the tag012A property.
     * 
     */
    public void setTAG012A(double value) {
        this.tag012A = value;
    }

    /**
     * Gets the value of the tag013A property.
     * 
     */
    public double getTAG013A() {
        return tag013A;
    }

    /**
     * Sets the value of the tag013A property.
     * 
     */
    public void setTAG013A(double value) {
        this.tag013A = value;
    }

    /**
     * Gets the value of the tag014A property.
     * 
     */
    public double getTAG014A() {
        return tag014A;
    }

    /**
     * Sets the value of the tag014A property.
     * 
     */
    public void setTAG014A(double value) {
        this.tag014A = value;
    }

    /**
     * Gets the value of the tag015A property.
     * 
     */
    public double getTAG015A() {
        return tag015A;
    }

    /**
     * Sets the value of the tag015A property.
     * 
     */
    public void setTAG015A(double value) {
        this.tag015A = value;
    }

    /**
     * Gets the value of the tag016A property.
     * 
     */
    public double getTAG016A() {
        return tag016A;
    }

    /**
     * Sets the value of the tag016A property.
     * 
     */
    public void setTAG016A(double value) {
        this.tag016A = value;
    }

    /**
     * Gets the value of the tag017A property.
     * 
     */
    public double getTAG017A() {
        return tag017A;
    }

    /**
     * Sets the value of the tag017A property.
     * 
     */
    public void setTAG017A(double value) {
        this.tag017A = value;
    }

    /**
     * Gets the value of the tag018A property.
     * 
     */
    public double getTAG018A() {
        return tag018A;
    }

    /**
     * Sets the value of the tag018A property.
     * 
     */
    public void setTAG018A(double value) {
        this.tag018A = value;
    }

    /**
     * Gets the value of the tag019A property.
     * 
     */
    public double getTAG019A() {
        return tag019A;
    }

    /**
     * Sets the value of the tag019A property.
     * 
     */
    public void setTAG019A(double value) {
        this.tag019A = value;
    }

    /**
     * Gets the value of the tag020A property.
     * 
     */
    public double getTAG020A() {
        return tag020A;
    }

    /**
     * Sets the value of the tag020A property.
     * 
     */
    public void setTAG020A(double value) {
        this.tag020A = value;
    }

    /**
     * Gets the value of the tag021A property.
     * 
     */
    public double getTAG021A() {
        return tag021A;
    }

    /**
     * Sets the value of the tag021A property.
     * 
     */
    public void setTAG021A(double value) {
        this.tag021A = value;
    }

    /**
     * Gets the value of the tag022A property.
     * 
     */
    public double getTAG022A() {
        return tag022A;
    }

    /**
     * Sets the value of the tag022A property.
     * 
     */
    public void setTAG022A(double value) {
        this.tag022A = value;
    }

    /**
     * Gets the value of the tag023A property.
     * 
     */
    public double getTAG023A() {
        return tag023A;
    }

    /**
     * Sets the value of the tag023A property.
     * 
     */
    public void setTAG023A(double value) {
        this.tag023A = value;
    }

    /**
     * Gets the value of the tag024A property.
     * 
     */
    public double getTAG024A() {
        return tag024A;
    }

    /**
     * Sets the value of the tag024A property.
     * 
     */
    public void setTAG024A(double value) {
        this.tag024A = value;
    }

    /**
     * Gets the value of the tag025A property.
     * 
     */
    public double getTAG025A() {
        return tag025A;
    }

    /**
     * Sets the value of the tag025A property.
     * 
     */
    public void setTAG025A(double value) {
        this.tag025A = value;
    }

    /**
     * Gets the value of the tag026A property.
     * 
     */
    public double getTAG026A() {
        return tag026A;
    }

    /**
     * Sets the value of the tag026A property.
     * 
     */
    public void setTAG026A(double value) {
        this.tag026A = value;
    }

    /**
     * Gets the value of the tag027A property.
     * 
     */
    public double getTAG027A() {
        return tag027A;
    }

    /**
     * Sets the value of the tag027A property.
     * 
     */
    public void setTAG027A(double value) {
        this.tag027A = value;
    }

    /**
     * Gets the value of the tag028A property.
     * 
     */
    public double getTAG028A() {
        return tag028A;
    }

    /**
     * Sets the value of the tag028A property.
     * 
     */
    public void setTAG028A(double value) {
        this.tag028A = value;
    }

    /**
     * Gets the value of the tag029A property.
     * 
     */
    public double getTAG029A() {
        return tag029A;
    }

    /**
     * Sets the value of the tag029A property.
     * 
     */
    public void setTAG029A(double value) {
        this.tag029A = value;
    }

    /**
     * Gets the value of the tag030A property.
     * 
     */
    public double getTAG030A() {
        return tag030A;
    }

    /**
     * Sets the value of the tag030A property.
     * 
     */
    public void setTAG030A(double value) {
        this.tag030A = value;
    }

    /**
     * Gets the value of the tag031A property.
     * 
     */
    public double getTAG031A() {
        return tag031A;
    }

    /**
     * Sets the value of the tag031A property.
     * 
     */
    public void setTAG031A(double value) {
        this.tag031A = value;
    }

    /**
     * Gets the value of the tag032A property.
     * 
     */
    public double getTAG032A() {
        return tag032A;
    }

    /**
     * Sets the value of the tag032A property.
     * 
     */
    public void setTAG032A(double value) {
        this.tag032A = value;
    }

    /**
     * Gets the value of the tag033A property.
     * 
     */
    public double getTAG033A() {
        return tag033A;
    }

    /**
     * Sets the value of the tag033A property.
     * 
     */
    public void setTAG033A(double value) {
        this.tag033A = value;
    }

    /**
     * Gets the value of the tag034A property.
     * 
     */
    public double getTAG034A() {
        return tag034A;
    }

    /**
     * Sets the value of the tag034A property.
     * 
     */
    public void setTAG034A(double value) {
        this.tag034A = value;
    }

    /**
     * Gets the value of the tag035A property.
     * 
     */
    public double getTAG035A() {
        return tag035A;
    }

    /**
     * Sets the value of the tag035A property.
     * 
     */
    public void setTAG035A(double value) {
        this.tag035A = value;
    }

    /**
     * Gets the value of the tag036A property.
     * 
     */
    public double getTAG036A() {
        return tag036A;
    }

    /**
     * Sets the value of the tag036A property.
     * 
     */
    public void setTAG036A(double value) {
        this.tag036A = value;
    }

    /**
     * Gets the value of the tag037A property.
     * 
     */
    public double getTAG037A() {
        return tag037A;
    }

    /**
     * Sets the value of the tag037A property.
     * 
     */
    public void setTAG037A(double value) {
        this.tag037A = value;
    }

    /**
     * Gets the value of the tag038A property.
     * 
     */
    public double getTAG038A() {
        return tag038A;
    }

    /**
     * Sets the value of the tag038A property.
     * 
     */
    public void setTAG038A(double value) {
        this.tag038A = value;
    }

    /**
     * Gets the value of the tag039A property.
     * 
     */
    public double getTAG039A() {
        return tag039A;
    }

    /**
     * Sets the value of the tag039A property.
     * 
     */
    public void setTAG039A(double value) {
        this.tag039A = value;
    }

    /**
     * Gets the value of the tag040A property.
     * 
     */
    public double getTAG040A() {
        return tag040A;
    }

    /**
     * Sets the value of the tag040A property.
     * 
     */
    public void setTAG040A(double value) {
        this.tag040A = value;
    }

    /**
     * Gets the value of the tag041A property.
     * 
     */
    public double getTAG041A() {
        return tag041A;
    }

    /**
     * Sets the value of the tag041A property.
     * 
     */
    public void setTAG041A(double value) {
        this.tag041A = value;
    }

    /**
     * Gets the value of the tag042A property.
     * 
     */
    public double getTAG042A() {
        return tag042A;
    }

    /**
     * Sets the value of the tag042A property.
     * 
     */
    public void setTAG042A(double value) {
        this.tag042A = value;
    }

    /**
     * Gets the value of the tag043A property.
     * 
     */
    public double getTAG043A() {
        return tag043A;
    }

    /**
     * Sets the value of the tag043A property.
     * 
     */
    public void setTAG043A(double value) {
        this.tag043A = value;
    }

    /**
     * Gets the value of the tag044A property.
     * 
     */
    public double getTAG044A() {
        return tag044A;
    }

    /**
     * Sets the value of the tag044A property.
     * 
     */
    public void setTAG044A(double value) {
        this.tag044A = value;
    }

    /**
     * Gets the value of the tag045A property.
     * 
     */
    public double getTAG045A() {
        return tag045A;
    }

    /**
     * Sets the value of the tag045A property.
     * 
     */
    public void setTAG045A(double value) {
        this.tag045A = value;
    }

    /**
     * Gets the value of the tag046A property.
     * 
     */
    public double getTAG046A() {
        return tag046A;
    }

    /**
     * Sets the value of the tag046A property.
     * 
     */
    public void setTAG046A(double value) {
        this.tag046A = value;
    }

    /**
     * Gets the value of the tag047A property.
     * 
     */
    public double getTAG047A() {
        return tag047A;
    }

    /**
     * Sets the value of the tag047A property.
     * 
     */
    public void setTAG047A(double value) {
        this.tag047A = value;
    }

    /**
     * Gets the value of the tag048A property.
     * 
     */
    public double getTAG048A() {
        return tag048A;
    }

    /**
     * Sets the value of the tag048A property.
     * 
     */
    public void setTAG048A(double value) {
        this.tag048A = value;
    }

    /**
     * Gets the value of the tag049A property.
     * 
     */
    public double getTAG049A() {
        return tag049A;
    }

    /**
     * Sets the value of the tag049A property.
     * 
     */
    public void setTAG049A(double value) {
        this.tag049A = value;
    }

    /**
     * Gets the value of the tag050A property.
     * 
     */
    public double getTAG050A() {
        return tag050A;
    }

    /**
     * Sets the value of the tag050A property.
     * 
     */
    public void setTAG050A(double value) {
        this.tag050A = value;
    }

    /**
     * Gets the value of the tag051A property.
     * 
     */
    public double getTAG051A() {
        return tag051A;
    }

    /**
     * Sets the value of the tag051A property.
     * 
     */
    public void setTAG051A(double value) {
        this.tag051A = value;
    }

    /**
     * Gets the value of the tag052A property.
     * 
     */
    public double getTAG052A() {
        return tag052A;
    }

    /**
     * Sets the value of the tag052A property.
     * 
     */
    public void setTAG052A(double value) {
        this.tag052A = value;
    }

    /**
     * Gets the value of the tag053A property.
     * 
     */
    public double getTAG053A() {
        return tag053A;
    }

    /**
     * Sets the value of the tag053A property.
     * 
     */
    public void setTAG053A(double value) {
        this.tag053A = value;
    }

    /**
     * Gets the value of the tag054A property.
     * 
     */
    public double getTAG054A() {
        return tag054A;
    }

    /**
     * Sets the value of the tag054A property.
     * 
     */
    public void setTAG054A(double value) {
        this.tag054A = value;
    }

    /**
     * Gets the value of the tag055A property.
     * 
     */
    public double getTAG055A() {
        return tag055A;
    }

    /**
     * Sets the value of the tag055A property.
     * 
     */
    public void setTAG055A(double value) {
        this.tag055A = value;
    }

    /**
     * Gets the value of the tag056A property.
     * 
     */
    public double getTAG056A() {
        return tag056A;
    }

    /**
     * Sets the value of the tag056A property.
     * 
     */
    public void setTAG056A(double value) {
        this.tag056A = value;
    }

    /**
     * Gets the value of the tag057A property.
     * 
     */
    public double getTAG057A() {
        return tag057A;
    }

    /**
     * Sets the value of the tag057A property.
     * 
     */
    public void setTAG057A(double value) {
        this.tag057A = value;
    }

    /**
     * Gets the value of the tag058A property.
     * 
     */
    public double getTAG058A() {
        return tag058A;
    }

    /**
     * Sets the value of the tag058A property.
     * 
     */
    public void setTAG058A(double value) {
        this.tag058A = value;
    }

    /**
     * Gets the value of the tag059A property.
     * 
     */
    public double getTAG059A() {
        return tag059A;
    }

    /**
     * Sets the value of the tag059A property.
     * 
     */
    public void setTAG059A(double value) {
        this.tag059A = value;
    }

    /**
     * Gets the value of the tag060A property.
     * 
     */
    public double getTAG060A() {
        return tag060A;
    }

    /**
     * Sets the value of the tag060A property.
     * 
     */
    public void setTAG060A(double value) {
        this.tag060A = value;
    }

    /**
     * Gets the value of the tag061A property.
     * 
     */
    public double getTAG061A() {
        return tag061A;
    }

    /**
     * Sets the value of the tag061A property.
     * 
     */
    public void setTAG061A(double value) {
        this.tag061A = value;
    }

    /**
     * Gets the value of the tag062A property.
     * 
     */
    public double getTAG062A() {
        return tag062A;
    }

    /**
     * Sets the value of the tag062A property.
     * 
     */
    public void setTAG062A(double value) {
        this.tag062A = value;
    }

    /**
     * Gets the value of the tag063A property.
     * 
     */
    public double getTAG063A() {
        return tag063A;
    }

    /**
     * Sets the value of the tag063A property.
     * 
     */
    public void setTAG063A(double value) {
        this.tag063A = value;
    }

    /**
     * Gets the value of the taxPeriod property.
     * 
     */
    public int getTaxPeriod() {
        return taxPeriod;
    }

    /**
     * Sets the value of the taxPeriod property.
     * 
     */
    public void setTaxPeriod(int value) {
        this.taxPeriod = value;
    }

    /**
     * Gets the value of the taxReportCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxReportCode() {
        return taxReportCode;
    }

    /**
     * Sets the value of the taxReportCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxReportCode(String value) {
        this.taxReportCode = value;
    }

    /**
     * Gets the value of the taxReportFormId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxReportFormId() {
        return taxReportFormId;
    }

    /**
     * Sets the value of the taxReportFormId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxReportFormId(String value) {
        this.taxReportFormId = value;
    }

    /**
     * Gets the value of the taxYear property.
     * 
     */
    public int getTaxYear() {
        return taxYear;
    }

    /**
     * Sets the value of the taxYear property.
     * 
     */
    public void setTaxYear(int value) {
        this.taxYear = value;
    }

    /**
     * Gets the value of the tin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTin() {
        return tin;
    }

    /**
     * Sets the value of the tin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTin(String value) {
        this.tin = value;
    }

    /**
     * Gets the value of the updatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdatedDate() {
        return updatedDate;
    }

    /**
     * Sets the value of the updatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdatedDate(XMLGregorianCalendar value) {
        this.updatedDate = value;
    }

    /**
     * Gets the value of the workflowStatusId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkflowStatusId() {
        return workflowStatusId;
    }

    /**
     * Sets the value of the workflowStatusId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkflowStatusId(String value) {
        this.workflowStatusId = value;
    }

}
