
package mn.gov.ema.emongolia.data.XypLegalEntity130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WS100327_getCustomsOffnsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WS100327_getCustomsOffnsInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://les.xyp.gov.mn/}getCustomsOffnsRequestData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS100327_getCustomsOffnsInfo", propOrder = {
    "request"
})
public class WS100327GetCustomsOffnsInfo {

    protected GetCustomsOffnsRequestData request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link GetCustomsOffnsRequestData }
     *     
     */
    public GetCustomsOffnsRequestData getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetCustomsOffnsRequestData }
     *     
     */
    public void setRequest(GetCustomsOffnsRequestData value) {
        this.request = value;
    }

}
