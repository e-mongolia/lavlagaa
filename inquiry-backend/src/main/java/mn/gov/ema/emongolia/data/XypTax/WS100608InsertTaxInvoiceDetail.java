
package mn.gov.ema.emongolia.data.XypTax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WS100608_insertTaxInvoiceDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WS100608_insertTaxInvoiceDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://tax.xyp.gov.mn/}serviceInsertTaxInvoiceDetailRequestData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS100608_insertTaxInvoiceDetail", propOrder = {
    "request"
})
public class WS100608InsertTaxInvoiceDetail {

    protected ServiceInsertTaxInvoiceDetailRequestData request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceInsertTaxInvoiceDetailRequestData }
     *     
     */
    public ServiceInsertTaxInvoiceDetailRequestData getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceInsertTaxInvoiceDetailRequestData }
     *     
     */
    public void setRequest(ServiceInsertTaxInvoiceDetailRequestData value) {
        this.request = value;
    }

}
