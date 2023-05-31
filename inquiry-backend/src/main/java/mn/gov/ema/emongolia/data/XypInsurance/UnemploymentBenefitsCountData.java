
package mn.gov.ema.emongolia.data.XypInsurance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for unemploymentBenefitsCountData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="unemploymentBenefitsCountData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="calculatePercent" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="workMonth" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unemploymentBenefitsCountData", propOrder = {
    "calculatePercent",
    "workMonth"
})
public class UnemploymentBenefitsCountData {

    protected int calculatePercent;
    protected int workMonth;

    /**
     * Gets the value of the calculatePercent property.
     * 
     */
    public int getCalculatePercent() {
        return calculatePercent;
    }

    /**
     * Sets the value of the calculatePercent property.
     * 
     */
    public void setCalculatePercent(int value) {
        this.calculatePercent = value;
    }

    /**
     * Gets the value of the workMonth property.
     * 
     */
    public int getWorkMonth() {
        return workMonth;
    }

    /**
     * Sets the value of the workMonth property.
     * 
     */
    public void setWorkMonth(int value) {
        this.workMonth = value;
    }

}
