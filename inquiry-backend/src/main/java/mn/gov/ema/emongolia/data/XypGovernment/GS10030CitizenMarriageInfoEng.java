
package mn.gov.ema.emongolia.data.XypGovernment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GS10030_citizenMarriageInfoEng complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GS10030_citizenMarriageInfoEng"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://government.xyp.gov.mn/}citizenIDCardInfoEngRequestData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GS10030_citizenMarriageInfoEng", propOrder = {
    "request"
})
public class GS10030CitizenMarriageInfoEng {

    protected CitizenIDCardInfoEngRequestData request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link CitizenIDCardInfoEngRequestData }
     *     
     */
    public CitizenIDCardInfoEngRequestData getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link CitizenIDCardInfoEngRequestData }
     *     
     */
    public void setRequest(CitizenIDCardInfoEngRequestData value) {
        this.request = value;
    }

}
