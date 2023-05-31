
package mn.gov.ema.emongolia.data.XypHealth;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WS300110_eHealthOnlineAppointmentOrder complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WS300110_eHealthOnlineAppointmentOrder"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://health.xyp.gov.mn/}eHealthAppointmentOrderRequestData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS300110_eHealthOnlineAppointmentOrder", propOrder = {
    "request"
})
public class WS300110EHealthOnlineAppointmentOrder {

    protected EHealthAppointmentOrderRequestData request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link EHealthAppointmentOrderRequestData }
     *     
     */
    public EHealthAppointmentOrderRequestData getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link EHealthAppointmentOrderRequestData }
     *     
     */
    public void setRequest(EHealthAppointmentOrderRequestData value) {
        this.request = value;
    }

}
