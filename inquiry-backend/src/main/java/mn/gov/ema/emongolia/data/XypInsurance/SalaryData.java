
package mn.gov.ema.emongolia.data.XypInsurance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for salaryData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="salaryData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="domName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgSiID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paid" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="salaryAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="salaryFee" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
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
@XmlType(name = "salaryData", propOrder = {
    "domName",
    "month",
    "orgName",
    "orgSiID",
    "paid",
    "salaryAmount",
    "salaryFee",
    "year"
})
public class SalaryData {

    protected String domName;
    protected int month;
    protected String orgName;
    protected String orgSiID;
    protected boolean paid;
    protected double salaryAmount;
    protected double salaryFee;
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
     * Gets the value of the orgSiID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgSiID() {
        return orgSiID;
    }

    /**
     * Sets the value of the orgSiID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgSiID(String value) {
        this.orgSiID = value;
    }

    /**
     * Gets the value of the paid property.
     * 
     */
    public boolean isPaid() {
        return paid;
    }

    /**
     * Sets the value of the paid property.
     * 
     */
    public void setPaid(boolean value) {
        this.paid = value;
    }

    /**
     * Gets the value of the salaryAmount property.
     * 
     */
    public double getSalaryAmount() {
        return salaryAmount;
    }

    /**
     * Sets the value of the salaryAmount property.
     * 
     */
    public void setSalaryAmount(double value) {
        this.salaryAmount = value;
    }

    /**
     * Gets the value of the salaryFee property.
     * 
     */
    public double getSalaryFee() {
        return salaryFee;
    }

    /**
     * Sets the value of the salaryFee property.
     * 
     */
    public void setSalaryFee(double value) {
        this.salaryFee = value;
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
