
package mn.gov.ema.emongolia.data.XypLegalEntity130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for generalDataToTax complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="generalDataToTax"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bsnEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="bsnPdType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bsnStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="companyRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dutyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="foundationDecName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="foundationDecNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nationRegNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownershipType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalCapital" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generalDataToTax", propOrder = {
    "bsnEndDate",
    "bsnPdType",
    "bsnStartDate",
    "companyRegnum",
    "dutyType",
    "foundationDecName",
    "foundationDecNo",
    "nationRegNo",
    "ownershipType",
    "regDate",
    "status",
    "title",
    "totalCapital"
})
public class GeneralDataToTax {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bsnEndDate;
    protected String bsnPdType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bsnStartDate;
    protected String companyRegnum;
    protected String dutyType;
    protected String foundationDecName;
    protected String foundationDecNo;
    protected String nationRegNo;
    protected String ownershipType;
    protected String regDate;
    protected String status;
    protected String title;
    protected Double totalCapital;

    /**
     * Gets the value of the bsnEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBsnEndDate() {
        return bsnEndDate;
    }

    /**
     * Sets the value of the bsnEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBsnEndDate(XMLGregorianCalendar value) {
        this.bsnEndDate = value;
    }

    /**
     * Gets the value of the bsnPdType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBsnPdType() {
        return bsnPdType;
    }

    /**
     * Sets the value of the bsnPdType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBsnPdType(String value) {
        this.bsnPdType = value;
    }

    /**
     * Gets the value of the bsnStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBsnStartDate() {
        return bsnStartDate;
    }

    /**
     * Sets the value of the bsnStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBsnStartDate(XMLGregorianCalendar value) {
        this.bsnStartDate = value;
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
     * Gets the value of the dutyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDutyType() {
        return dutyType;
    }

    /**
     * Sets the value of the dutyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDutyType(String value) {
        this.dutyType = value;
    }

    /**
     * Gets the value of the foundationDecName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoundationDecName() {
        return foundationDecName;
    }

    /**
     * Sets the value of the foundationDecName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoundationDecName(String value) {
        this.foundationDecName = value;
    }

    /**
     * Gets the value of the foundationDecNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFoundationDecNo() {
        return foundationDecNo;
    }

    /**
     * Sets the value of the foundationDecNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFoundationDecNo(String value) {
        this.foundationDecNo = value;
    }

    /**
     * Gets the value of the nationRegNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationRegNo() {
        return nationRegNo;
    }

    /**
     * Sets the value of the nationRegNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationRegNo(String value) {
        this.nationRegNo = value;
    }

    /**
     * Gets the value of the ownershipType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnershipType() {
        return ownershipType;
    }

    /**
     * Sets the value of the ownershipType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnershipType(String value) {
        this.ownershipType = value;
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
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the totalCapital property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getTotalCapital() {
        return totalCapital;
    }

    /**
     * Sets the value of the totalCapital property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setTotalCapital(Double value) {
        this.totalCapital = value;
    }

}
