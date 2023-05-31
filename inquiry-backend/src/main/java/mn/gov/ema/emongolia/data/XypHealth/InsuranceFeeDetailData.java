
package mn.gov.ema.emongolia.data.XypHealth;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insuranceFeeDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insuranceFeeDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="govCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="govCodeId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="govGroup" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="officeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="officeId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="officeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subOfficeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subOfficeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insuranceFeeDetailData", propOrder = {
    "createdDate",
    "govCode",
    "govCodeId",
    "govGroup",
    "month",
    "officeCode",
    "officeId",
    "officeName",
    "regnum",
    "subOfficeCode",
    "subOfficeName",
    "year"
})
public class InsuranceFeeDetailData {

    protected int createdDate;
    protected String govCode;
    protected int govCodeId;
    protected int govGroup;
    protected int month;
    protected String officeCode;
    protected int officeId;
    protected String officeName;
    protected String regnum;
    protected String subOfficeCode;
    protected String subOfficeName;
    protected int year;

    /**
     * Gets the value of the createdDate property.
     * 
     */
    public int getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     */
    public void setCreatedDate(int value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the govCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovCode() {
        return govCode;
    }

    /**
     * Sets the value of the govCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovCode(String value) {
        this.govCode = value;
    }

    /**
     * Gets the value of the govCodeId property.
     * 
     */
    public int getGovCodeId() {
        return govCodeId;
    }

    /**
     * Sets the value of the govCodeId property.
     * 
     */
    public void setGovCodeId(int value) {
        this.govCodeId = value;
    }

    /**
     * Gets the value of the govGroup property.
     * 
     */
    public int getGovGroup() {
        return govGroup;
    }

    /**
     * Sets the value of the govGroup property.
     * 
     */
    public void setGovGroup(int value) {
        this.govGroup = value;
    }

    /**
     * Gets the value of the month property.
     * 
     */
    public int getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     */
    public void setMonth(int value) {
        this.month = value;
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
     * Gets the value of the officeId property.
     * 
     */
    public int getOfficeId() {
        return officeId;
    }

    /**
     * Sets the value of the officeId property.
     * 
     */
    public void setOfficeId(int value) {
        this.officeId = value;
    }

    /**
     * Gets the value of the officeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeName() {
        return officeName;
    }

    /**
     * Sets the value of the officeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeName(String value) {
        this.officeName = value;
    }

    /**
     * Gets the value of the regnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnum() {
        return regnum;
    }

    /**
     * Sets the value of the regnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegnum(String value) {
        this.regnum = value;
    }

    /**
     * Gets the value of the subOfficeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubOfficeCode() {
        return subOfficeCode;
    }

    /**
     * Sets the value of the subOfficeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubOfficeCode(String value) {
        this.subOfficeCode = value;
    }

    /**
     * Gets the value of the subOfficeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubOfficeName() {
        return subOfficeName;
    }

    /**
     * Sets the value of the subOfficeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubOfficeName(String value) {
        this.subOfficeName = value;
    }

    /**
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

}
