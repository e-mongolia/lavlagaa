
package mn.gov.ema.emongolia.data.XypTax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceIncomeLog complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceIncomeLog"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="desc_call_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desc_income_amount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desc_income_year" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desc_log_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desc_tin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="resultCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceIncomeLog", namespace = "http://ws/", propOrder = {
    "descCallNumber",
    "descIncomeAmount",
    "descIncomeYear",
    "descLogId",
    "descTin",
    "resultCode"
})
public class ServiceIncomeLog {

    @XmlElement(name = "desc_call_number")
    protected String descCallNumber;
    @XmlElement(name = "desc_income_amount")
    protected String descIncomeAmount;
    @XmlElement(name = "desc_income_year")
    protected String descIncomeYear;
    @XmlElement(name = "desc_log_id")
    protected String descLogId;
    @XmlElement(name = "desc_tin")
    protected String descTin;
    protected int resultCode;

    /**
     * Gets the value of the descCallNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescCallNumber() {
        return descCallNumber;
    }

    /**
     * Sets the value of the descCallNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescCallNumber(String value) {
        this.descCallNumber = value;
    }

    /**
     * Gets the value of the descIncomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescIncomeAmount() {
        return descIncomeAmount;
    }

    /**
     * Sets the value of the descIncomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescIncomeAmount(String value) {
        this.descIncomeAmount = value;
    }

    /**
     * Gets the value of the descIncomeYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescIncomeYear() {
        return descIncomeYear;
    }

    /**
     * Sets the value of the descIncomeYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescIncomeYear(String value) {
        this.descIncomeYear = value;
    }

    /**
     * Gets the value of the descLogId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescLogId() {
        return descLogId;
    }

    /**
     * Sets the value of the descLogId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescLogId(String value) {
        this.descLogId = value;
    }

    /**
     * Gets the value of the descTin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescTin() {
        return descTin;
    }

    /**
     * Sets the value of the descTin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescTin(String value) {
        this.descTin = value;
    }

    /**
     * Gets the value of the resultCode property.
     * 
     */
    public int getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     */
    public void setResultCode(int value) {
        this.resultCode = value;
    }

}
