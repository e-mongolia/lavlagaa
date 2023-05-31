
package mn.gov.ema.emongolia.data.XypTax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceIncomeData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceIncomeData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="descCallNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descIncomeAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descIncomeYear" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descLogId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descTin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceIncomeData", propOrder = {
    "descCallNumber",
    "descIncomeAmount",
    "descIncomeYear",
    "descLogId",
    "descTin"
})
public class ServiceIncomeData {

    protected String descCallNumber;
    protected String descIncomeAmount;
    protected String descIncomeYear;
    protected String descLogId;
    protected String descTin;

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

}
