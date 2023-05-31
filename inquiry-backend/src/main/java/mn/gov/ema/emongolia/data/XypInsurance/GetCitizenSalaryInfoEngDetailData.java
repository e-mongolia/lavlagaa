
package mn.gov.ema.emongolia.data.XypInsurance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getCitizenSalaryInfoEngDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getCitizenSalaryInfoEngDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="domName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="isPayed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="occcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgRegId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgndid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salary" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="shim" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
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
@XmlType(name = "getCitizenSalaryInfoEngDetailData", propOrder = {
    "domName",
    "isPayed",
    "month",
    "occcode",
    "orgName",
    "orgRegId",
    "orgndid",
    "salary",
    "shim",
    "year"
})
public class GetCitizenSalaryInfoEngDetailData {

    protected String domName;
    protected String isPayed;
    protected int month;
    protected String occcode;
    protected String orgName;
    protected String orgRegId;
    protected String orgndid;
    protected Double salary;
    protected Double shim;
    protected int year;

    /**
     * Gets the value of the domName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomName() {
        return domName;
    }

    /**
     * Sets the value of the domName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomName(String value) {
        this.domName = value;
    }

    /**
     * Gets the value of the isPayed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPayed() {
        return isPayed;
    }

    /**
     * Sets the value of the isPayed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPayed(String value) {
        this.isPayed = value;
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
     * Gets the value of the occcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOcccode() {
        return occcode;
    }

    /**
     * Sets the value of the occcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOcccode(String value) {
        this.occcode = value;
    }

    /**
     * Gets the value of the orgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * Sets the value of the orgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgName(String value) {
        this.orgName = value;
    }

    /**
     * Gets the value of the orgRegId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgRegId() {
        return orgRegId;
    }

    /**
     * Sets the value of the orgRegId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgRegId(String value) {
        this.orgRegId = value;
    }

    /**
     * Gets the value of the orgndid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgndid() {
        return orgndid;
    }

    /**
     * Sets the value of the orgndid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgndid(String value) {
        this.orgndid = value;
    }

    /**
     * Gets the value of the salary property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSalary() {
        return salary;
    }

    /**
     * Sets the value of the salary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSalary(Double value) {
        this.salary = value;
    }

    /**
     * Gets the value of the shim property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShim() {
        return shim;
    }

    /**
     * Sets the value of the shim property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShim(Double value) {
        this.shim = value;
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
