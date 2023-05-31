
package mn.gov.ema.emongolia.data.XypLegalEntity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WS100319_legalEntityIndustryInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WS100319_legalEntityIndustryInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://les.xyp.gov.mn/}nonLegalEntityRequestData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS100319_legalEntityIndustryInfo", propOrder = {
    "request"
})
public class WS100319LegalEntityIndustryInfo {

    protected NonLegalEntityRequestData request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link NonLegalEntityRequestData }
     *     
     */
    public NonLegalEntityRequestData getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonLegalEntityRequestData }
     *     
     */
    public void setRequest(NonLegalEntityRequestData value) {
        this.request = value;
    }

}
