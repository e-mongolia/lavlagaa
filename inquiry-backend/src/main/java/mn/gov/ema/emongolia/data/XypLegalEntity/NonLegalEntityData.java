
package mn.gov.ema.emongolia.data.XypLegalEntity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for nonLegalEntityData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="nonLegalEntityData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="checked" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nonLegalEntityData", propOrder = {
    "checked"
})
public class NonLegalEntityData {

    protected boolean checked;

    /**
     * Gets the value of the checked property.
     * 
     */
    public boolean isChecked() {
        return checked;
    }

    /**
     * Sets the value of the checked property.
     * 
     */
    public void setChecked(boolean value) {
        this.checked = value;
    }

}
