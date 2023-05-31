
package mn.gov.ema.emongolia.data.XypTax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for privateTaxPayerRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="privateTaxPayerRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tax.xyp.gov.mn/}serviceRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beginNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="endNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "privateTaxPayerRequestData", propOrder = {
    "beginNumber",
    "endNumber"
})
public class PrivateTaxPayerRequestData
    extends ServiceRequest
{

    protected int beginNumber;
    protected int endNumber;

    /**
     * Gets the value of the beginNumber property.
     * 
     */
    public int getBeginNumber() {
        return beginNumber;
    }

    /**
     * Sets the value of the beginNumber property.
     * 
     */
    public void setBeginNumber(int value) {
        this.beginNumber = value;
    }

    /**
     * Gets the value of the endNumber property.
     * 
     */
    public int getEndNumber() {
        return endNumber;
    }

    /**
     * Sets the value of the endNumber property.
     * 
     */
    public void setEndNumber(int value) {
        this.endNumber = value;
    }

}
