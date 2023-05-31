
package mn.gov.ema.emongolia.data.XypHealth;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WS300109_eHealthOnlineTimeOrderList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WS300109_eHealthOnlineTimeOrderList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://health.xyp.gov.mn/}ehealtBasicRequestData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS300109_eHealthOnlineTimeOrderList", propOrder = {
    "request"
})
public class WS300109EHealthOnlineTimeOrderList {

    protected EhealtBasicRequestData request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link EhealtBasicRequestData }
     *     
     */
    public EhealtBasicRequestData getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link EhealtBasicRequestData }
     *     
     */
    public void setRequest(EhealtBasicRequestData value) {
        this.request = value;
    }

}
