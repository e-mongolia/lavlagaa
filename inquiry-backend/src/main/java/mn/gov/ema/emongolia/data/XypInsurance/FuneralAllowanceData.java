
package mn.gov.ema.emongolia.data.XypInsurance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for funeralAllowanceData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="funeralAllowanceData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="received" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "funeralAllowanceData", propOrder = {
    "received"
})
public class FuneralAllowanceData {

    protected boolean received;

    /**
     * Gets the value of the received property.
     * 
     */
    public boolean isReceived() {
        return received;
    }

    /**
     * Sets the value of the received property.
     * 
     */
    public void setReceived(boolean value) {
        this.received = value;
    }

}
