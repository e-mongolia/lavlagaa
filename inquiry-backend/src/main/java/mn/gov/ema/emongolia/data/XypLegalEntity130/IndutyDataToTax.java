
package mn.gov.ema.emongolia.data.XypLegalEntity130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for indutyDataToTax complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="indutyDataToTax"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="companyRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indutyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indutyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="permissionEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="permissionInstt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="permissionIssuer" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="permissionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="permissionStartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="regDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "indutyDataToTax", propOrder = {
    "companyRegnum",
    "indutyCode",
    "indutyName",
    "permissionEndDate",
    "permissionInstt",
    "permissionIssuer",
    "permissionNumber",
    "permissionStartDate",
    "regDate",
    "status"
})
public class IndutyDataToTax {

    protected String companyRegnum;
    protected String indutyCode;
    protected String indutyName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar permissionEndDate;
    protected String permissionInstt;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar permissionIssuer;
    protected String permissionNumber;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar permissionStartDate;
    protected String regDate;
    protected String status;

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
     * Gets the value of the indutyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndutyCode() {
        return indutyCode;
    }

    /**
     * Sets the value of the indutyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndutyCode(String value) {
        this.indutyCode = value;
    }

    /**
     * Gets the value of the indutyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndutyName() {
        return indutyName;
    }

    /**
     * Sets the value of the indutyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndutyName(String value) {
        this.indutyName = value;
    }

    /**
     * Gets the value of the permissionEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPermissionEndDate() {
        return permissionEndDate;
    }

    /**
     * Sets the value of the permissionEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPermissionEndDate(XMLGregorianCalendar value) {
        this.permissionEndDate = value;
    }

    /**
     * Gets the value of the permissionInstt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermissionInstt() {
        return permissionInstt;
    }

    /**
     * Sets the value of the permissionInstt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermissionInstt(String value) {
        this.permissionInstt = value;
    }

    /**
     * Gets the value of the permissionIssuer property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPermissionIssuer() {
        return permissionIssuer;
    }

    /**
     * Sets the value of the permissionIssuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPermissionIssuer(XMLGregorianCalendar value) {
        this.permissionIssuer = value;
    }

    /**
     * Gets the value of the permissionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermissionNumber() {
        return permissionNumber;
    }

    /**
     * Sets the value of the permissionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermissionNumber(String value) {
        this.permissionNumber = value;
    }

    /**
     * Gets the value of the permissionStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPermissionStartDate() {
        return permissionStartDate;
    }

    /**
     * Sets the value of the permissionStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPermissionStartDate(XMLGregorianCalendar value) {
        this.permissionStartDate = value;
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

}
