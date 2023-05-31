
package mn.gov.ema.emongolia.data.XypLegalEntity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for entityNumberData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="entityNumberData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://les.xyp.gov.mn/}serviceRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="legalEntityNumber" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "entityNumberData", propOrder = {
    "legalEntityNumber"
})
public class EntityNumberData
    extends ServiceRequest
{

    protected int legalEntityNumber;

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

}
