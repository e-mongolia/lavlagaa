
package mn.gov.ema.emongolia.data.XypTax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tenderIncomes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tenderIncomes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="incomeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="incomeYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tenderIncomes", propOrder = {
    "incomeAmount",
    "incomeYear"
})
public class TenderIncomes {

    protected String incomeAmount;
    protected String incomeYear;

    /**
     * Gets the value of the incomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomeAmount() {
        return incomeAmount;
    }

    /**
     * Sets the value of the incomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomeAmount(String value) {
        this.incomeAmount = value;
    }

    /**
     * Gets the value of the incomeYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomeYear() {
        return incomeYear;
    }

    /**
     * Sets the value of the incomeYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomeYear(String value) {
        this.incomeYear = value;
    }

}
