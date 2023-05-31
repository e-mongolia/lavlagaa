
package mn.gov.ema.emongolia.data.XypProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for impositionBodyDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="impositionBodyDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="impositionTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="impositionYearAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paidTotalAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paidYearAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="plusAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
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
@XmlType(name = "impositionBodyDetail", propOrder = {
    "impositionTotalAmount",
    "impositionYearAmount",
    "paidTotalAmount",
    "paidYearAmount",
    "plusAmount",
    "year"
})
public class ImpositionBodyDetail {

    protected String impositionTotalAmount;
    protected String impositionYearAmount;
    protected String paidTotalAmount;
    protected String paidYearAmount;
    protected double plusAmount;
    protected int year;

    /**
     * Gets the value of the impositionTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpositionTotalAmount() {
        return impositionTotalAmount;
    }

    /**
     * Sets the value of the impositionTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpositionTotalAmount(String value) {
        this.impositionTotalAmount = value;
    }

    /**
     * Gets the value of the impositionYearAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImpositionYearAmount() {
        return impositionYearAmount;
    }

    /**
     * Sets the value of the impositionYearAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImpositionYearAmount(String value) {
        this.impositionYearAmount = value;
    }

    /**
     * Gets the value of the paidTotalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaidTotalAmount() {
        return paidTotalAmount;
    }

    /**
     * Sets the value of the paidTotalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaidTotalAmount(String value) {
        this.paidTotalAmount = value;
    }

    /**
     * Gets the value of the paidYearAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaidYearAmount() {
        return paidYearAmount;
    }

    /**
     * Sets the value of the paidYearAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaidYearAmount(String value) {
        this.paidYearAmount = value;
    }

    /**
     * Gets the value of the plusAmount property.
     * 
     */
    public double getPlusAmount() {
        return plusAmount;
    }

    /**
     * Sets the value of the plusAmount property.
     * 
     */
    public void setPlusAmount(double value) {
        this.plusAmount = value;
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
