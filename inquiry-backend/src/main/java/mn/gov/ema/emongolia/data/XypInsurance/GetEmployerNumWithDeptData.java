
package mn.gov.ema.emongolia.data.XypInsurance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getEmployerNumWithDeptData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getEmployerNumWithDeptData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="benClass06Num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="benClass07Num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="employeeForForeign" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="employeeForMgl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="orgDebt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "getEmployerNumWithDeptData", propOrder = {
    "benClass06Num",
    "benClass07Num",
    "employeeForForeign",
    "employeeForMgl",
    "month",
    "orgDebt",
    "year"
})
public class GetEmployerNumWithDeptData {

    protected String benClass06Num;
    protected String benClass07Num;
    protected String employeeForForeign;
    protected String employeeForMgl;
    protected int month;
    protected String orgDebt;
    protected int year;

    /**
     * Gets the value of the benClass06Num property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenClass06Num() {
        return benClass06Num;
    }

    /**
     * Sets the value of the benClass06Num property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenClass06Num(String value) {
        this.benClass06Num = value;
    }

    /**
     * Gets the value of the benClass07Num property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenClass07Num() {
        return benClass07Num;
    }

    /**
     * Sets the value of the benClass07Num property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenClass07Num(String value) {
        this.benClass07Num = value;
    }

    /**
     * Gets the value of the employeeForForeign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeForForeign() {
        return employeeForForeign;
    }

    /**
     * Sets the value of the employeeForForeign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeForForeign(String value) {
        this.employeeForForeign = value;
    }

    /**
     * Gets the value of the employeeForMgl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeForMgl() {
        return employeeForMgl;
    }

    /**
     * Sets the value of the employeeForMgl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeForMgl(String value) {
        this.employeeForMgl = value;
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
     * Gets the value of the orgDebt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgDebt() {
        return orgDebt;
    }

    /**
     * Sets the value of the orgDebt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgDebt(String value) {
        this.orgDebt = value;
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
