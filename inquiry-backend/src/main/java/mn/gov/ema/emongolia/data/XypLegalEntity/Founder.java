
package mn.gov.ema.emongolia.data.XypLegalEntity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for founder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="founder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="companyRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyStateRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createdUserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sharePercent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shareQty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="shareTotalAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="shareUnitPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stakeHolderRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="stakeHolderTypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "founder", propOrder = {
    "companyRegnum",
    "companyStateRegnum",
    "countryName",
    "createdDate",
    "createdUserName",
    "firstName",
    "lastName",
    "sharePercent",
    "shareQty",
    "shareTotalAmount",
    "shareUnitPrice",
    "stakeHolderRegnum",
    "stakeHolderTypeName",
    "status"
})
public class Founder {

    protected String companyRegnum;
    protected String companyStateRegnum;
    protected String countryName;
    protected String createdDate;
    protected String createdUserName;
    protected String firstName;
    protected String lastName;
    protected String sharePercent;
    protected String shareQty;
    protected double shareTotalAmount;
    protected String shareUnitPrice;
    protected String stakeHolderRegnum;
    protected String stakeHolderTypeName;
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
     * Gets the value of the companyStateRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyStateRegnum() {
        return companyStateRegnum;
    }

    /**
     * Sets the value of the companyStateRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyStateRegnum(String value) {
        this.companyStateRegnum = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedDate(String value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the createdUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedUserName() {
        return createdUserName;
    }

    /**
     * Sets the value of the createdUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedUserName(String value) {
        this.createdUserName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the sharePercent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSharePercent() {
        return sharePercent;
    }

    /**
     * Sets the value of the sharePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSharePercent(String value) {
        this.sharePercent = value;
    }

    /**
     * Gets the value of the shareQty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareQty() {
        return shareQty;
    }

    /**
     * Sets the value of the shareQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareQty(String value) {
        this.shareQty = value;
    }

    /**
     * Gets the value of the shareTotalAmount property.
     * 
     */
    public double getShareTotalAmount() {
        return shareTotalAmount;
    }

    /**
     * Sets the value of the shareTotalAmount property.
     * 
     */
    public void setShareTotalAmount(double value) {
        this.shareTotalAmount = value;
    }

    /**
     * Gets the value of the shareUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareUnitPrice() {
        return shareUnitPrice;
    }

    /**
     * Sets the value of the shareUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareUnitPrice(String value) {
        this.shareUnitPrice = value;
    }

    /**
     * Gets the value of the stakeHolderRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStakeHolderRegnum() {
        return stakeHolderRegnum;
    }

    /**
     * Sets the value of the stakeHolderRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStakeHolderRegnum(String value) {
        this.stakeHolderRegnum = value;
    }

    /**
     * Gets the value of the stakeHolderTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStakeHolderTypeName() {
        return stakeHolderTypeName;
    }

    /**
     * Sets the value of the stakeHolderTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStakeHolderTypeName(String value) {
        this.stakeHolderTypeName = value;
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
