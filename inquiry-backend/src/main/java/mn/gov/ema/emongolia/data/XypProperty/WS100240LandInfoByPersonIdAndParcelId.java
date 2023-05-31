
package mn.gov.ema.emongolia.data.XypProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WS100240_landInfoByPersonIdAndParcelId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WS100240_landInfoByPersonIdAndParcelId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://property.xyp.gov.mn/}landInfoByPersonParcelIdsRequestData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS100240_landInfoByPersonIdAndParcelId", propOrder = {
    "request"
})
public class WS100240LandInfoByPersonIdAndParcelId {

    protected LandInfoByPersonParcelIdsRequestData request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link LandInfoByPersonParcelIdsRequestData }
     *     
     */
    public LandInfoByPersonParcelIdsRequestData getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link LandInfoByPersonParcelIdsRequestData }
     *     
     */
    public void setRequest(LandInfoByPersonParcelIdsRequestData value) {
        this.request = value;
    }

}
