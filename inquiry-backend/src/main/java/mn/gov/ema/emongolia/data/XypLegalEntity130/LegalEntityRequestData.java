
package mn.gov.ema.emongolia.data.XypLegalEntity130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for legalEntityRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="legalEntityRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://les.xyp.gov.mn/}serviceRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="legalEntityNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
@XmlType(name = "legalEntityRequestData", propOrder = {
    "legalEntityNumber",
    "regnum"
})
public class LegalEntityRequestData
    extends ServiceRequest
{

    protected int legalEntityNumber;
    protected String regnum;

    /**
     * Gets the value of the legalEntityNumber property.
     * 
     */
    public int getLegalEntityNumber() {
        return legalEntityNumber;
    }

    /**
     * Sets the value of the legalEntityNumber property.
     * 
     */
    public void setLegalEntityNumber(int value) {
        this.legalEntityNumber = value;
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
