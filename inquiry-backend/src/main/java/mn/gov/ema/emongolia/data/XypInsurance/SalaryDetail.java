
package mn.gov.ema.emongolia.data.XypInsurance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for salaryDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="salaryDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="salaryAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salaryDays" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="salaryMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salaryDetail", propOrder = {
    "salaryAmount",
    "salaryDays",
    "salaryMonth"
})
public class SalaryDetail {

    protected String salaryAmount;
    protected int salaryDays;
    protected String salaryMonth;

    /**
     * Gets the value of the salaryAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalaryAmount() {
        return salaryAmount;
    }

    /**
     * Sets the value of the salaryAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalaryAmount(String value) {
        this.salaryAmount = value;
    }

    /**
     * Gets the value of the salaryDays property.
     * 
     */
    public int getSalaryDays() {
        return salaryDays;
    }

    /**
     * Sets the value of the salaryDays property.
     * 
     */
    public void setSalaryDays(int value) {
        this.salaryDays = value;
    }

    /**
     * Gets the value of the salaryMonth property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalaryMonth() {
        return salaryMonth;
    }

    /**
     * Sets the value of the salaryMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalaryMonth(String value) {
        this.salaryMonth = value;
    }

}
