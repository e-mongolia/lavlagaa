
package mn.gov.ema.emongolia.data.XypHealth;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WS300111_eHealthTimeOrderApprove complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WS300111_eHealthTimeOrderApprove"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://health.xyp.gov.mn/}eHealthTimeOrderApproveRequestData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS300111_eHealthTimeOrderApprove", propOrder = {
    "request"
})
public class WS300111EHealthTimeOrderApprove {

    protected EHealthTimeOrderApproveRequestData request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link EHealthTimeOrderApproveRequestData }
     *     
     */
    public EHealthTimeOrderApproveRequestData getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link EHealthTimeOrderApproveRequestData }
     *     
     */
    public void setRequest(EHealthTimeOrderApproveRequestData value) {
        this.request = value;
    }

}
