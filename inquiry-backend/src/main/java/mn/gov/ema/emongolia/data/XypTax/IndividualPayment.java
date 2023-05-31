
package mn.gov.ema.emongolia.data.XypTax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for individualPayment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="individualPayment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="officeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="periodId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="periodType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxtypeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tranYear" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "individualPayment", propOrder = {
    "amount",
    "officeName",
    "periodId",
    "periodType",
    "taxtypeName",
    "tranYear"
})
public class IndividualPayment {

    protected int amount;
    protected String officeName;
    protected int periodId;
    protected String periodType;
    protected String taxtypeName;
    protected int tranYear;

    /**
     * Gets the value of the amount property.
     * 
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(int value) {
        this.amount = value;
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
     * Gets the value of the periodId property.
     * 
     */
    public int getPeriodId() {
        return periodId;
    }

    /**
     * Sets the value of the periodId property.
     * 
     */
    public void setPeriodId(int value) {
        this.periodId = value;
    }

    /**
     * Gets the value of the periodType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodType() {
        return periodType;
    }

    /**
     * Sets the value of the periodType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodType(String value) {
        this.periodType = value;
    }

    /**
     * Gets the value of the taxtypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxtypeName() {
        return taxtypeName;
    }

    /**
     * Sets the value of the taxtypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxtypeName(String value) {
        this.taxtypeName = value;
    }

    /**
     * Gets the value of the tranYear property.
     * 
     */
    public int getTranYear() {
        return tranYear;
    }

    /**
     * Sets the value of the tranYear property.
     * 
     */
    public void setTranYear(int value) {
        this.tranYear = value;
    }

}
