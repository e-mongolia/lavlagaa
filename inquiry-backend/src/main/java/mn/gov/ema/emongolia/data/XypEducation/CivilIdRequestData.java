
package mn.gov.ema.emongolia.data.XypEducation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for civilIdRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="civilIdRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://education.xyp.gov.mn/}serviceRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="civilId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "civilIdRequestData", propOrder = {
    "civilId"
})
public class CivilIdRequestData
    extends ServiceRequest
{

    protected String civilId;

    /**
     * Gets the value of the civilId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCivilId() {
        return civilId;
    }

    /**
     * Sets the value of the civilId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCivilId(String value) {
        this.civilId = value;
    }

}
