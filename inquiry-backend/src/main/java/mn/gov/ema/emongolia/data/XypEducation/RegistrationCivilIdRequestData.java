
package mn.gov.ema.emongolia.data.XypEducation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for registrationCivilIdRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="registrationCivilIdRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://education.xyp.gov.mn/}registrationBasicRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parentCivilid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "registrationCivilIdRequestData", propOrder = {
    "parentCivilid"
})
public class RegistrationCivilIdRequestData
    extends RegistrationBasicRequest
{

    protected String parentCivilid;

    /**
     * Gets the value of the parentCivilid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentCivilid() {
        return parentCivilid;
    }

    /**
     * Sets the value of the parentCivilid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentCivilid(String value) {
        this.parentCivilid = value;
    }

}
