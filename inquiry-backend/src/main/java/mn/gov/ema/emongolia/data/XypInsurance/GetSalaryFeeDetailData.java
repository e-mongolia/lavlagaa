
package mn.gov.ema.emongolia.data.XypInsurance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getSalaryFeeDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getSalaryFeeDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="feeClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="feeMonth" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="feeYear" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getSalaryFeeDetailData", propOrder = {
    "feeClass",
    "feeMonth",
    "feeYear"
})
public class GetSalaryFeeDetailData {

    protected String feeClass;
    protected int feeMonth;
    protected int feeYear;

    /**
     * Gets the value of the feeClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeClass() {
        return feeClass;
    }

    /**
     * Sets the value of the feeClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeClass(String value) {
        this.feeClass = value;
    }

    /**
     * Gets the value of the feeMonth property.
     * 
     */
    public int getFeeMonth() {
        return feeMonth;
    }

    /**
     * Sets the value of the feeMonth property.
     * 
     */
    public void setFeeMonth(int value) {
        this.feeMonth = value;
    }

    /**
     * Gets the value of the feeYear property.
     * 
     */
    public int getFeeYear() {
        return feeYear;
    }

    /**
     * Sets the value of the feeYear property.
     * 
     */
    public void setFeeYear(int value) {
        this.feeYear = value;
    }

}
