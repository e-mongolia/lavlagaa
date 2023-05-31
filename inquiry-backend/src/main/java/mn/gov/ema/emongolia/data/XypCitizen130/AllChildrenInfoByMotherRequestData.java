
package mn.gov.ema.emongolia.data.XypCitizen130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for allChildrenInfoByMotherRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="allChildrenInfoByMotherRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://citizen.xyp.gov.mn/}registrationBasicRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="motherRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "allChildrenInfoByMotherRequestData", propOrder = {
    "motherRegnum"
})
public class AllChildrenInfoByMotherRequestData
    extends RegistrationBasicRequest
{

    protected String motherRegnum;

    /**
     * Gets the value of the motherRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherRegnum() {
        return motherRegnum;
    }

    /**
     * Sets the value of the motherRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherRegnum(String value) {
        this.motherRegnum = value;
    }

}
