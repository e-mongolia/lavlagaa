
package mn.gov.ema.emongolia.data.XypInsurance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WS100514_getEmployerNumWithDeptInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WS100514_getEmployerNumWithDeptInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://insurance.xyp.gov.mn/}getEmployerNumWithDeptRequest" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS100514_getEmployerNumWithDeptInfo", propOrder = {
    "request"
})
public class WS100514GetEmployerNumWithDeptInfo {

    protected GetEmployerNumWithDeptRequest request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link GetEmployerNumWithDeptRequest }
     *     
     */
    public GetEmployerNumWithDeptRequest getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetEmployerNumWithDeptRequest }
     *     
     */
    public void setRequest(GetEmployerNumWithDeptRequest value) {
        this.request = value;
    }

}