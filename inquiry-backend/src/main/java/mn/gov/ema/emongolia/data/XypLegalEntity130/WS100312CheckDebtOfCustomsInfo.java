
package mn.gov.ema.emongolia.data.XypLegalEntity130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WS100312_checkDebtOfCustomsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WS100312_checkDebtOfCustomsInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://les.xyp.gov.mn/}checkDebtOfCustomsRequestData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS100312_checkDebtOfCustomsInfo", propOrder = {
    "request"
})
public class WS100312CheckDebtOfCustomsInfo {

    protected CheckDebtOfCustomsRequestData request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link CheckDebtOfCustomsRequestData }
     *     
     */
    public CheckDebtOfCustomsRequestData getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckDebtOfCustomsRequestData }
     *     
     */
    public void setRequest(CheckDebtOfCustomsRequestData value) {
        this.request = value;
    }

}
