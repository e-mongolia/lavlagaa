
package mn.gov.ema.emongolia.data.XypTransport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for orgRegnumRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="orgRegnumRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://transport.xyp.gov.mn/}serviceRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="orgRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "orgRegnumRequestData", propOrder = {
    "orgRegnum"
})
public class OrgRegnumRequestData
    extends ServiceRequest
{

    protected String orgRegnum;

    /**
     * Gets the value of the orgRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgRegnum() {
        return orgRegnum;
    }

    /**
     * Sets the value of the orgRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgRegnum(String value) {
        this.orgRegnum = value;
    }

}
