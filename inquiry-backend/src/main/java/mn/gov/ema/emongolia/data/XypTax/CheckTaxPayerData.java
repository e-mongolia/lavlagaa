
package mn.gov.ema.emongolia.data.XypTax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for checkTaxPayerData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="checkTaxPayerData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="taxPayed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkTaxPayerData", propOrder = {
    "taxPayed"
})
public class CheckTaxPayerData {

    protected boolean taxPayed;

    /**
     * Gets the value of the taxPayed property.
     * 
     */
    public boolean isTaxPayed() {
        return taxPayed;
    }

    /**
     * Sets the value of the taxPayed property.
     * 
     */
    public void setTaxPayed(boolean value) {
        this.taxPayed = value;
    }

}
