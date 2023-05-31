
package mn.gov.ema.emongolia.data.XypEducation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WS400103_childrenInfoByParentCivilId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WS400103_childrenInfoByParentCivilId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://education.xyp.gov.mn/}registrationCivilIdRequestData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS400103_childrenInfoByParentCivilId", propOrder = {
    "request"
})
public class WS400103ChildrenInfoByParentCivilId {

    protected RegistrationCivilIdRequestData request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationCivilIdRequestData }
     *     
     */
    public RegistrationCivilIdRequestData getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationCivilIdRequestData }
     *     
     */
    public void setRequest(RegistrationCivilIdRequestData value) {
        this.request = value;
    }

}
