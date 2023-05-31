
package mn.gov.ema.emongolia.data.XypLegalEntity130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for legalEntityNewData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="legalEntityNewData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="companyTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indutyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indutyTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lesNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nationRegNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxofcCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxofcName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telnoOne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telnoTwo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "legalEntityNewData", propOrder = {
    "companyTitle",
    "email",
    "indutyCode",
    "indutyTitle",
    "lesNumber",
    "nationRegNo",
    "regDate",
    "statusCode",
    "statusName",
    "taxofcCode",
    "taxofcName",
    "telnoOne",
    "telnoTwo"
})
public class LegalEntityNewData {

    protected String companyTitle;
    protected String email;
    protected String indutyCode;
    protected String indutyTitle;
    protected int lesNumber;
    protected String nationRegNo;
    protected String regDate;
    protected String statusCode;
    protected String statusName;
    protected String taxofcCode;
    protected String taxofcName;
    protected String telnoOne;
    protected String telnoTwo;

    /**
     * Gets the value of the companyTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyTitle() {
        return companyTitle;
    }

    /**
     * Sets the value of the companyTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyTitle(String value) {
        this.companyTitle = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
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
     * Gets the value of the indutyTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndutyTitle() {
        return indutyTitle;
    }

    /**
     * Sets the value of the indutyTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndutyTitle(String value) {
        this.indutyTitle = value;
    }

    /**
     * Gets the value of the lesNumber property.
     * 
     */
    public int getLesNumber() {
        return lesNumber;
    }

    /**
     * Sets the value of the lesNumber property.
     * 
     */
    public void setLesNumber(int value) {
        this.lesNumber = value;
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
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the statusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusName() {
        return statusName;
    }

    /**
     * Sets the value of the statusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusName(String value) {
        this.statusName = value;
    }

    /**
     * Gets the value of the taxofcCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxofcCode() {
        return taxofcCode;
    }

    /**
     * Sets the value of the taxofcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxofcCode(String value) {
        this.taxofcCode = value;
    }

    /**
     * Gets the value of the taxofcName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxofcName() {
        return taxofcName;
    }

    /**
     * Sets the value of the taxofcName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxofcName(String value) {
        this.taxofcName = value;
    }

    /**
     * Gets the value of the telnoOne property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelnoOne() {
        return telnoOne;
    }

    /**
     * Sets the value of the telnoOne property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelnoOne(String value) {
        this.telnoOne = value;
    }

    /**
     * Gets the value of the telnoTwo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelnoTwo() {
        return telnoTwo;
    }

    /**
     * Sets the value of the telnoTwo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelnoTwo(String value) {
        this.telnoTwo = value;
    }

}
