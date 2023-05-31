
package mn.gov.ema.emongolia.data.XypTax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for taxOrganizationTT11Detial complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taxOrganizationTT11Detial"&gt;
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
 *         &lt;element name="receiptDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="submittedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="TAG001A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG001B" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG002A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG002B" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG003A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG003B" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG004A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG004B" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG005A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG005B" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG006A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG006B" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG007A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG007B" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG008A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG008B" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG009A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG009B" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG010A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG010B" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG011A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG011B" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG012A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG012B" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG013A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG013B" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG014A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG014B" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG015A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG015B" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG016A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG016B" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG017A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG017B" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG018A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG018B" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG019A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG019B" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG020A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG020B" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG021A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG021B" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG022A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG022B" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG023A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG023B" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG024A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG024B" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG025A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG025B" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG026A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG026B" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG027A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG027B" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG028A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG028B" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG029A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG029B" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG030A" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="TAG030B" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
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
@XmlType(name = "taxOrganizationTT11Detial", propOrder = {
    "createdDate",
    "doneDate",
    "entityName",
    "frequency",
    "isActive",
    "isXReport",
    "officeCode",
    "receiptDate",
    "submittedDate",
    "tag001A",
    "tag001B",
    "tag002A",
    "tag002B",
    "tag003A",
    "tag003B",
    "tag004A",
    "tag004B",
    "tag005A",
    "tag005B",
    "tag006A",
    "tag006B",
    "tag007A",
    "tag007B",
    "tag008A",
    "tag008B",
    "tag009A",
    "tag009B",
    "tag010A",
    "tag010B",
    "tag011A",
    "tag011B",
    "tag012A",
    "tag012B",
    "tag013A",
    "tag013B",
    "tag014A",
    "tag014B",
    "tag015A",
    "tag015B",
    "tag016A",
    "tag016B",
    "tag017A",
    "tag017B",
    "tag018A",
    "tag018B",
    "tag019A",
    "tag019B",
    "tag020A",
    "tag020B",
    "tag021A",
    "tag021B",
    "tag022A",
    "tag022B",
    "tag023A",
    "tag023B",
    "tag024A",
    "tag024B",
    "tag025A",
    "tag025B",
    "tag026A",
    "tag026B",
    "tag027A",
    "tag027B",
    "tag028A",
    "tag028B",
    "tag029A",
    "tag029B",
    "tag030A",
    "tag030B",
    "taxPeriod",
    "taxReportCode",
    "taxReportFormId",
    "taxYear",
    "tin",
    "updatedDate",
    "workflowStatusId"
})
public class TaxOrganizationTT11Detial {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar doneDate;
    protected String entityName;
    protected String frequency;
    protected String isActive;
    protected String isXReport;
    protected String officeCode;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receiptDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submittedDate;
    @XmlElement(name = "TAG001A")
    protected double tag001A;
    @XmlElement(name = "TAG001B")
    protected double tag001B;
    @XmlElement(name = "TAG002A")
    protected double tag002A;
    @XmlElement(name = "TAG002B")
    protected double tag002B;
    @XmlElement(name = "TAG003A")
    protected double tag003A;
    @XmlElement(name = "TAG003B")
    protected double tag003B;
    @XmlElement(name = "TAG004A")
    protected double tag004A;
    @XmlElement(name = "TAG004B")
    protected double tag004B;
    @XmlElement(name = "TAG005A")
    protected double tag005A;
    @XmlElement(name = "TAG005B")
    protected double tag005B;
    @XmlElement(name = "TAG006A")
    protected double tag006A;
    @XmlElement(name = "TAG006B")
    protected double tag006B;
    @XmlElement(name = "TAG007A")
    protected double tag007A;
    @XmlElement(name = "TAG007B")
    protected double tag007B;
    @XmlElement(name = "TAG008A")
    protected double tag008A;
    @XmlElement(name = "TAG008B")
    protected double tag008B;
    @XmlElement(name = "TAG009A")
    protected double tag009A;
    @XmlElement(name = "TAG009B")
    protected double tag009B;
    @XmlElement(name = "TAG010A")
    protected double tag010A;
    @XmlElement(name = "TAG010B")
    protected double tag010B;
    @XmlElement(name = "TAG011A")
    protected double tag011A;
    @XmlElement(name = "TAG011B")
    protected double tag011B;
    @XmlElement(name = "TAG012A")
    protected double tag012A;
    @XmlElement(name = "TAG012B")
    protected double tag012B;
    @XmlElement(name = "TAG013A")
    protected double tag013A;
    @XmlElement(name = "TAG013B")
    protected double tag013B;
    @XmlElement(name = "TAG014A")
    protected double tag014A;
    @XmlElement(name = "TAG014B")
    protected double tag014B;
    @XmlElement(name = "TAG015A")
    protected double tag015A;
    @XmlElement(name = "TAG015B")
    protected double tag015B;
    @XmlElement(name = "TAG016A")
    protected double tag016A;
    @XmlElement(name = "TAG016B")
    protected double tag016B;
    @XmlElement(name = "TAG017A")
    protected double tag017A;
    @XmlElement(name = "TAG017B")
    protected double tag017B;
    @XmlElement(name = "TAG018A")
    protected double tag018A;
    @XmlElement(name = "TAG018B")
    protected double tag018B;
    @XmlElement(name = "TAG019A")
    protected double tag019A;
    @XmlElement(name = "TAG019B")
    protected double tag019B;
    @XmlElement(name = "TAG020A")
    protected double tag020A;
    @XmlElement(name = "TAG020B")
    protected double tag020B;
    @XmlElement(name = "TAG021A")
    protected double tag021A;
    @XmlElement(name = "TAG021B")
    protected double tag021B;
    @XmlElement(name = "TAG022A")
    protected double tag022A;
    @XmlElement(name = "TAG022B")
    protected double tag022B;
    @XmlElement(name = "TAG023A")
    protected double tag023A;
    @XmlElement(name = "TAG023B")
    protected double tag023B;
    @XmlElement(name = "TAG024A")
    protected double tag024A;
    @XmlElement(name = "TAG024B")
    protected double tag024B;
    @XmlElement(name = "TAG025A")
    protected double tag025A;
    @XmlElement(name = "TAG025B")
    protected double tag025B;
    @XmlElement(name = "TAG026A")
    protected double tag026A;
    @XmlElement(name = "TAG026B")
    protected double tag026B;
    @XmlElement(name = "TAG027A")
    protected double tag027A;
    @XmlElement(name = "TAG027B")
    protected double tag027B;
    @XmlElement(name = "TAG028A")
    protected double tag028A;
    @XmlElement(name = "TAG028B")
    protected double tag028B;
    @XmlElement(name = "TAG029A")
    protected double tag029A;
    @XmlElement(name = "TAG029B")
    protected double tag029B;
    @XmlElement(name = "TAG030A")
    protected double tag030A;
    @XmlElement(name = "TAG030B")
    protected double tag030B;
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
     * Gets the value of the tag001B property.
     * 
     */
    public double getTAG001B() {
        return tag001B;
    }

    /**
     * Sets the value of the tag001B property.
     * 
     */
    public void setTAG001B(double value) {
        this.tag001B = value;
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
     * Gets the value of the tag002B property.
     * 
     */
    public double getTAG002B() {
        return tag002B;
    }

    /**
     * Sets the value of the tag002B property.
     * 
     */
    public void setTAG002B(double value) {
        this.tag002B = value;
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
     * Gets the value of the tag003B property.
     * 
     */
    public double getTAG003B() {
        return tag003B;
    }

    /**
     * Sets the value of the tag003B property.
     * 
     */
    public void setTAG003B(double value) {
        this.tag003B = value;
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
     * Gets the value of the tag004B property.
     * 
     */
    public double getTAG004B() {
        return tag004B;
    }

    /**
     * Sets the value of the tag004B property.
     * 
     */
    public void setTAG004B(double value) {
        this.tag004B = value;
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
     * Gets the value of the tag005B property.
     * 
     */
    public double getTAG005B() {
        return tag005B;
    }

    /**
     * Sets the value of the tag005B property.
     * 
     */
    public void setTAG005B(double value) {
        this.tag005B = value;
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
     * Gets the value of the tag006B property.
     * 
     */
    public double getTAG006B() {
        return tag006B;
    }

    /**
     * Sets the value of the tag006B property.
     * 
     */
    public void setTAG006B(double value) {
        this.tag006B = value;
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
     * Gets the value of the tag007B property.
     * 
     */
    public double getTAG007B() {
        return tag007B;
    }

    /**
     * Sets the value of the tag007B property.
     * 
     */
    public void setTAG007B(double value) {
        this.tag007B = value;
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
     * Gets the value of the tag008B property.
     * 
     */
    public double getTAG008B() {
        return tag008B;
    }

    /**
     * Sets the value of the tag008B property.
     * 
     */
    public void setTAG008B(double value) {
        this.tag008B = value;
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
     * Gets the value of the tag009B property.
     * 
     */
    public double getTAG009B() {
        return tag009B;
    }

    /**
     * Sets the value of the tag009B property.
     * 
     */
    public void setTAG009B(double value) {
        this.tag009B = value;
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
     * Gets the value of the tag010B property.
     * 
     */
    public double getTAG010B() {
        return tag010B;
    }

    /**
     * Sets the value of the tag010B property.
     * 
     */
    public void setTAG010B(double value) {
        this.tag010B = value;
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
     * Gets the value of the tag011B property.
     * 
     */
    public double getTAG011B() {
        return tag011B;
    }

    /**
     * Sets the value of the tag011B property.
     * 
     */
    public void setTAG011B(double value) {
        this.tag011B = value;
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
     * Gets the value of the tag012B property.
     * 
     */
    public double getTAG012B() {
        return tag012B;
    }

    /**
     * Sets the value of the tag012B property.
     * 
     */
    public void setTAG012B(double value) {
        this.tag012B = value;
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
     * Gets the value of the tag013B property.
     * 
     */
    public double getTAG013B() {
        return tag013B;
    }

    /**
     * Sets the value of the tag013B property.
     * 
     */
    public void setTAG013B(double value) {
        this.tag013B = value;
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
     * Gets the value of the tag014B property.
     * 
     */
    public double getTAG014B() {
        return tag014B;
    }

    /**
     * Sets the value of the tag014B property.
     * 
     */
    public void setTAG014B(double value) {
        this.tag014B = value;
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
     * Gets the value of the tag015B property.
     * 
     */
    public double getTAG015B() {
        return tag015B;
    }

    /**
     * Sets the value of the tag015B property.
     * 
     */
    public void setTAG015B(double value) {
        this.tag015B = value;
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
     * Gets the value of the tag016B property.
     * 
     */
    public double getTAG016B() {
        return tag016B;
    }

    /**
     * Sets the value of the tag016B property.
     * 
     */
    public void setTAG016B(double value) {
        this.tag016B = value;
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
     * Gets the value of the tag017B property.
     * 
     */
    public double getTAG017B() {
        return tag017B;
    }

    /**
     * Sets the value of the tag017B property.
     * 
     */
    public void setTAG017B(double value) {
        this.tag017B = value;
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
     * Gets the value of the tag018B property.
     * 
     */
    public double getTAG018B() {
        return tag018B;
    }

    /**
     * Sets the value of the tag018B property.
     * 
     */
    public void setTAG018B(double value) {
        this.tag018B = value;
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
     * Gets the value of the tag019B property.
     * 
     */
    public double getTAG019B() {
        return tag019B;
    }

    /**
     * Sets the value of the tag019B property.
     * 
     */
    public void setTAG019B(double value) {
        this.tag019B = value;
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
     * Gets the value of the tag020B property.
     * 
     */
    public double getTAG020B() {
        return tag020B;
    }

    /**
     * Sets the value of the tag020B property.
     * 
     */
    public void setTAG020B(double value) {
        this.tag020B = value;
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
     * Gets the value of the tag021B property.
     * 
     */
    public double getTAG021B() {
        return tag021B;
    }

    /**
     * Sets the value of the tag021B property.
     * 
     */
    public void setTAG021B(double value) {
        this.tag021B = value;
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
     * Gets the value of the tag022B property.
     * 
     */
    public double getTAG022B() {
        return tag022B;
    }

    /**
     * Sets the value of the tag022B property.
     * 
     */
    public void setTAG022B(double value) {
        this.tag022B = value;
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
     * Gets the value of the tag023B property.
     * 
     */
    public double getTAG023B() {
        return tag023B;
    }

    /**
     * Sets the value of the tag023B property.
     * 
     */
    public void setTAG023B(double value) {
        this.tag023B = value;
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
     * Gets the value of the tag024B property.
     * 
     */
    public double getTAG024B() {
        return tag024B;
    }

    /**
     * Sets the value of the tag024B property.
     * 
     */
    public void setTAG024B(double value) {
        this.tag024B = value;
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
     * Gets the value of the tag025B property.
     * 
     */
    public double getTAG025B() {
        return tag025B;
    }

    /**
     * Sets the value of the tag025B property.
     * 
     */
    public void setTAG025B(double value) {
        this.tag025B = value;
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
     * Gets the value of the tag026B property.
     * 
     */
    public double getTAG026B() {
        return tag026B;
    }

    /**
     * Sets the value of the tag026B property.
     * 
     */
    public void setTAG026B(double value) {
        this.tag026B = value;
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
     * Gets the value of the tag027B property.
     * 
     */
    public double getTAG027B() {
        return tag027B;
    }

    /**
     * Sets the value of the tag027B property.
     * 
     */
    public void setTAG027B(double value) {
        this.tag027B = value;
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
     * Gets the value of the tag028B property.
     * 
     */
    public double getTAG028B() {
        return tag028B;
    }

    /**
     * Sets the value of the tag028B property.
     * 
     */
    public void setTAG028B(double value) {
        this.tag028B = value;
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
     * Gets the value of the tag029B property.
     * 
     */
    public double getTAG029B() {
        return tag029B;
    }

    /**
     * Sets the value of the tag029B property.
     * 
     */
    public void setTAG029B(double value) {
        this.tag029B = value;
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
     * Gets the value of the tag030B property.
     * 
     */
    public double getTAG030B() {
        return tag030B;
    }

    /**
     * Sets the value of the tag030B property.
     * 
     */
    public void setTAG030B(double value) {
        this.tag030B = value;
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
