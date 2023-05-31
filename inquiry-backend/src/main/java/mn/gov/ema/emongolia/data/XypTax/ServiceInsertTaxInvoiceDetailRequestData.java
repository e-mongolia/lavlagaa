
package mn.gov.ema.emongolia.data.XypTax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceInsertTaxInvoiceDetailRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceInsertTaxInvoiceDetailRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tax.xyp.gov.mn/}serviceRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="invoiceId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="paymentDetailId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="typeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceInsertTaxInvoiceDetailRequestData", propOrder = {
    "amount",
    "invoiceId",
    "paymentDetailId",
    "typeId",
    "year"
})
public class ServiceInsertTaxInvoiceDetailRequestData
    extends ServiceRequest
{

    protected int amount;
    protected int invoiceId;
    protected int paymentDetailId;
    protected String typeId;
    protected int year;

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
     * Gets the value of the invoiceId property.
     * 
     */
    public int getInvoiceId() {
        return invoiceId;
    }

    /**
     * Sets the value of the invoiceId property.
     * 
     */
    public void setInvoiceId(int value) {
        this.invoiceId = value;
    }

    /**
     * Gets the value of the paymentDetailId property.
     * 
     */
    public int getPaymentDetailId() {
        return paymentDetailId;
    }

    /**
     * Sets the value of the paymentDetailId property.
     * 
     */
    public void setPaymentDetailId(int value) {
        this.paymentDetailId = value;
    }

    /**
     * Gets the value of the typeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeId(String value) {
        this.typeId = value;
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
