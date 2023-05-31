
package mn.gov.ema.emongolia.data.XypGovernment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for covidVaccineDoseCountData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="covidVaccineDoseCountData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="vaccineDoseCount" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "covidVaccineDoseCountData", propOrder = {
    "vaccineDoseCount"
})
public class CovidVaccineDoseCountData {

    protected int vaccineDoseCount;

    /**
     * Gets the value of the vaccineDoseCount property.
     * 
     */
    public int getVaccineDoseCount() {
        return vaccineDoseCount;
    }

    /**
     * Sets the value of the vaccineDoseCount property.
     * 
     */
    public void setVaccineDoseCount(int value) {
        this.vaccineDoseCount = value;
    }

}
