
package mn.gov.ema.emongolia.data.XypTransport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vehicleLegalEntityTotalData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vehicleLegalEntityTotalData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="totalVehicles" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicleLegalEntityTotalData", propOrder = {
    "totalVehicles"
})
public class VehicleLegalEntityTotalData {

    protected int totalVehicles;

    /**
     * Gets the value of the totalVehicles property.
     * 
     */
    public int getTotalVehicles() {
        return totalVehicles;
    }

    /**
     * Sets the value of the totalVehicles property.
     * 
     */
    public void setTotalVehicles(int value) {
        this.totalVehicles = value;
    }

}
