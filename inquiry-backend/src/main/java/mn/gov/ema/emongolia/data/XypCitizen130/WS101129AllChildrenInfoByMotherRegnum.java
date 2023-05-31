
package mn.gov.ema.emongolia.data.XypCitizen130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WS101129_allChildrenInfoByMotherRegnum complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WS101129_allChildrenInfoByMotherRegnum"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://citizen.xyp.gov.mn/}allChildrenInfoByMotherRequestData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS101129_allChildrenInfoByMotherRegnum", propOrder = {
    "request"
})
public class WS101129AllChildrenInfoByMotherRegnum {

    protected AllChildrenInfoByMotherRequestData request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link AllChildrenInfoByMotherRequestData }
     *     
     */
    public AllChildrenInfoByMotherRequestData getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllChildrenInfoByMotherRequestData }
     *     
     */
    public void setRequest(AllChildrenInfoByMotherRequestData value) {
        this.request = value;
    }

}
