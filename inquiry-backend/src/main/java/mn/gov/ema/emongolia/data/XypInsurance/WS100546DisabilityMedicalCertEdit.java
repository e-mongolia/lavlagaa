
package mn.gov.ema.emongolia.data.XypInsurance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WS100546_disabilityMedicalCertEdit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WS100546_disabilityMedicalCertEdit"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://insurance.xyp.gov.mn/}disabilityMedicalCertEditRequestData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS100546_disabilityMedicalCertEdit", propOrder = {
    "request"
})
public class WS100546DisabilityMedicalCertEdit {

    protected DisabilityMedicalCertEditRequestData request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link DisabilityMedicalCertEditRequestData }
     *     
     */
    public DisabilityMedicalCertEditRequestData getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisabilityMedicalCertEditRequestData }
     *     
     */
    public void setRequest(DisabilityMedicalCertEditRequestData value) {
        this.request = value;
    }

}
