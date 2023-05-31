
package mn.gov.ema.emongolia.data.XypCitizen130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WS100146_insertArchivesDetailReadingRoom complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WS100146_insertArchivesDetailReadingRoom"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://citizen.xyp.gov.mn/}insertCitizenArchivesReadingRoomOrder" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS100146_insertArchivesDetailReadingRoom", propOrder = {
    "request"
})
public class WS100146InsertArchivesDetailReadingRoom {

    protected InsertCitizenArchivesReadingRoomOrder request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link InsertCitizenArchivesReadingRoomOrder }
     *     
     */
    public InsertCitizenArchivesReadingRoomOrder getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertCitizenArchivesReadingRoomOrder }
     *     
     */
    public void setRequest(InsertCitizenArchivesReadingRoomOrder value) {
        this.request = value;
    }

}
