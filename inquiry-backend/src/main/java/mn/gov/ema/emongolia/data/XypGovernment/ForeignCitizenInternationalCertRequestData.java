
package mn.gov.ema.emongolia.data.XypGovernment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for foreignCitizenInternationalCertRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="foreignCitizenInternationalCertRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://government.xyp.gov.mn/}serviceRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="passportNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "foreignCitizenInternationalCertRequestData", propOrder = {
    "passportNum"
})
public class ForeignCitizenInternationalCertRequestData
    extends ServiceRequest
{

    protected String passportNum;

    /**
     * Gets the value of the passportNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportNum() {
        return passportNum;
    }

    /**
     * Sets the value of the passportNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportNum(String value) {
        this.passportNum = value;
    }

}
