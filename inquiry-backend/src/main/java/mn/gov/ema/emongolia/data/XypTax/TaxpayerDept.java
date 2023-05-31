
package mn.gov.ema.emongolia.data.XypTax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taxpayerDept complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taxpayerDept"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="before_nonpayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="before_overpayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="call_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nonpayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="overpayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remainder_nonpayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="remainder_overpayment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="resultCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="return_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tax_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taxpayerDept", namespace = "http://ws/", propOrder = {
    "beforeNonpayment",
    "beforeOverpayment",
    "callNumber",
    "id",
    "nonpayment",
    "overpayment",
    "remainderNonpayment",
    "remainderOverpayment",
    "resultCode",
    "returnType",
    "taxType"
})
public class TaxpayerDept {

    @XmlElement(name = "before_nonpayment")
    protected String beforeNonpayment;
    @XmlElement(name = "before_overpayment")
    protected String beforeOverpayment;
    @XmlElement(name = "call_number")
    protected String callNumber;
    protected String id;
    protected String nonpayment;
    protected String overpayment;
    @XmlElement(name = "remainder_nonpayment")
    protected String remainderNonpayment;
    @XmlElement(name = "remainder_overpayment")
    protected String remainderOverpayment;
    protected int resultCode;
    @XmlElement(name = "return_type")
    protected String returnType;
    @XmlElement(name = "tax_type")
    protected String taxType;

    /**
     * Gets the value of the beforeNonpayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeforeNonpayment() {
        return beforeNonpayment;
    }

    /**
     * Sets the value of the beforeNonpayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeforeNonpayment(String value) {
        this.beforeNonpayment = value;
    }

    /**
     * Gets the value of the beforeOverpayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeforeOverpayment() {
        return beforeOverpayment;
    }

    /**
     * Sets the value of the beforeOverpayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeforeOverpayment(String value) {
        this.beforeOverpayment = value;
    }

    /**
     * Gets the value of the callNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallNumber() {
        return callNumber;
    }

    /**
     * Sets the value of the callNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallNumber(String value) {
        this.callNumber = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the nonpayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonpayment() {
        return nonpayment;
    }

    /**
     * Sets the value of the nonpayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonpayment(String value) {
        this.nonpayment = value;
    }

    /**
     * Gets the value of the overpayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverpayment() {
        return overpayment;
    }

    /**
     * Sets the value of the overpayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverpayment(String value) {
        this.overpayment = value;
    }

    /**
     * Gets the value of the remainderNonpayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemainderNonpayment() {
        return remainderNonpayment;
    }

    /**
     * Sets the value of the remainderNonpayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemainderNonpayment(String value) {
        this.remainderNonpayment = value;
    }

    /**
     * Gets the value of the remainderOverpayment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemainderOverpayment() {
        return remainderOverpayment;
    }

    /**
     * Sets the value of the remainderOverpayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemainderOverpayment(String value) {
        this.remainderOverpayment = value;
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

    /**
     * Gets the value of the returnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnType() {
        return returnType;
    }

    /**
     * Sets the value of the returnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnType(String value) {
        this.returnType = value;
    }

    /**
     * Gets the value of the taxType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxType() {
        return taxType;
    }

    /**
     * Sets the value of the taxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxType(String value) {
        this.taxType = value;
    }

}
