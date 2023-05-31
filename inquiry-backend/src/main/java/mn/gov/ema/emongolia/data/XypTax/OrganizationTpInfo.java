
package mn.gov.ema.emongolia.data.XypTax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for organizationTpInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="organizationTpInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addressInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyRegDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="companyRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="entType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="legalGroupType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="legalStatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ownerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="refEntStatus" type="{http://tax.xyp.gov.mn/}organizationRefEntStatus" minOccurs="0"/&gt;
 *         &lt;element name="tin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "organizationTpInfo", propOrder = {
    "addressInfo",
    "companyRegDate",
    "companyRegnum",
    "entStatus",
    "entType",
    "id",
    "legalGroupType",
    "legalStatusName",
    "name",
    "ownerName",
    "refEntStatus",
    "tin"
})
public class OrganizationTpInfo {

    protected String addressInfo;
    protected String companyRegDate;
    protected String companyRegnum;
    protected String entStatus;
    protected int entType;
    protected int id;
    protected int legalGroupType;
    protected String legalStatusName;
    protected String name;
    protected String ownerName;
    protected OrganizationRefEntStatus refEntStatus;
    protected String tin;

    /**
     * Gets the value of the addressInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressInfo() {
        return addressInfo;
    }

    /**
     * Sets the value of the addressInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressInfo(String value) {
        this.addressInfo = value;
    }

    /**
     * Gets the value of the companyRegDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyRegDate() {
        return companyRegDate;
    }

    /**
     * Sets the value of the companyRegDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyRegDate(String value) {
        this.companyRegDate = value;
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
     * Gets the value of the entStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntStatus() {
        return entStatus;
    }

    /**
     * Sets the value of the entStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntStatus(String value) {
        this.entStatus = value;
    }

    /**
     * Gets the value of the entType property.
     * 
     */
    public int getEntType() {
        return entType;
    }

    /**
     * Sets the value of the entType property.
     * 
     */
    public void setEntType(int value) {
        this.entType = value;
    }

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the legalGroupType property.
     * 
     */
    public int getLegalGroupType() {
        return legalGroupType;
    }

    /**
     * Sets the value of the legalGroupType property.
     * 
     */
    public void setLegalGroupType(int value) {
        this.legalGroupType = value;
    }

    /**
     * Gets the value of the legalStatusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalStatusName() {
        return legalStatusName;
    }

    /**
     * Sets the value of the legalStatusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalStatusName(String value) {
        this.legalStatusName = value;
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
     * Gets the value of the ownerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets the value of the ownerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerName(String value) {
        this.ownerName = value;
    }

    /**
     * Gets the value of the refEntStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationRefEntStatus }
     *     
     */
    public OrganizationRefEntStatus getRefEntStatus() {
        return refEntStatus;
    }

    /**
     * Sets the value of the refEntStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationRefEntStatus }
     *     
     */
    public void setRefEntStatus(OrganizationRefEntStatus value) {
        this.refEntStatus = value;
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

}
