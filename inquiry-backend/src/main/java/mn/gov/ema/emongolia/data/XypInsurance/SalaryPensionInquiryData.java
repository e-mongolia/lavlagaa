
package mn.gov.ema.emongolia.data.XypInsurance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for salaryPensionInquiryData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="salaryPensionInquiryData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pensioner" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salaryPensionInquiryData", propOrder = {
    "pensioner"
})
public class SalaryPensionInquiryData {

    protected boolean pensioner;

    /**
     * Gets the value of the pensioner property.
     * 
     */
    public boolean isPensioner() {
        return pensioner;
    }

    /**
     * Sets the value of the pensioner property.
     * 
     */
    public void setPensioner(boolean value) {
        this.pensioner = value;
    }

}
