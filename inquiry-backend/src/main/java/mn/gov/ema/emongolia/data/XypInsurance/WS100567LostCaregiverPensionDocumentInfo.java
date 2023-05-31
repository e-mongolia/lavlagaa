
package mn.gov.ema.emongolia.data.XypInsurance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WS100567_lostCaregiverPensionDocumentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WS100567_lostCaregiverPensionDocumentInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://insurance.xyp.gov.mn/}checkIsInsuredRequestData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS100567_lostCaregiverPensionDocumentInfo", propOrder = {
    "request"
})
public class WS100567LostCaregiverPensionDocumentInfo {

    protected CheckIsInsuredRequestData request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link CheckIsInsuredRequestData }
     *     
     */
    public CheckIsInsuredRequestData getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckIsInsuredRequestData }
     *     
     */
    public void setRequest(CheckIsInsuredRequestData value) {
        this.request = value;
    }

}
