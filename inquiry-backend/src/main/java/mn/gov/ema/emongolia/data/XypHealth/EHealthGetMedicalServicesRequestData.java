
package mn.gov.ema.emongolia.data.XypHealth;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for eHealthGetMedicalServicesRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="eHealthGetMedicalServicesRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://health.xyp.gov.mn/}serviceRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hospitalId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "eHealthGetMedicalServicesRequestData", propOrder = {
    "hospitalId"
})
public class EHealthGetMedicalServicesRequestData
    extends ServiceRequest
{

    protected int hospitalId;

    /**
     * Gets the value of the hospitalId property.
     * 
     */
    public int getHospitalId() {
        return hospitalId;
    }

    /**
     * Sets the value of the hospitalId property.
     * 
     */
    public void setHospitalId(int value) {
        this.hospitalId = value;
    }

}
