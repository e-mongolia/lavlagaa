
package mn.gov.ema.emongolia.data.XypTransport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WS100422_getCitizenPenaltyList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WS100422_getCitizenPenaltyList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://transport.xyp.gov.mn/}citizenPenaltyListRequestData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS100422_getCitizenPenaltyList", propOrder = {
    "request"
})
public class WS100422GetCitizenPenaltyList {

    protected CitizenPenaltyListRequestData request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link CitizenPenaltyListRequestData }
     *     
     */
    public CitizenPenaltyListRequestData getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link CitizenPenaltyListRequestData }
     *     
     */
    public void setRequest(CitizenPenaltyListRequestData value) {
        this.request = value;
    }

}
