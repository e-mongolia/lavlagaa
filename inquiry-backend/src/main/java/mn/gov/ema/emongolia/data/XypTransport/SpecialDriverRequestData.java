
package mn.gov.ema.emongolia.data.XypTransport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for specialDriverRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="specialDriverRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://transport.xyp.gov.mn/}serviceRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="licenseNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "specialDriverRequestData", propOrder = {
    "licenseNumber",
    "regnum"
})
public class SpecialDriverRequestData
    extends ServiceRequest
{

    protected int licenseNumber;
    protected String regnum;

    /**
     * Gets the value of the licenseNumber property.
     * 
     */
    public int getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * Sets the value of the licenseNumber property.
     * 
     */
    public void setLicenseNumber(int value) {
        this.licenseNumber = value;
    }

    /**
     * Gets the value of the regnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnum() {
        return regnum;
    }

    /**
     * Sets the value of the regnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegnum(String value) {
        this.regnum = value;
    }

}