
package mn.gov.ema.emongolia.data.XypInsurance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for medicalCertInvalidRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="medicalCertInvalidRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://insurance.xyp.gov.mn/}serviceRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="medicalCert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "medicalCertInvalidRequestData", propOrder = {
    "medicalCert"
})
public class MedicalCertInvalidRequestData
    extends ServiceRequest
{

    protected String medicalCert;

    /**
     * Gets the value of the medicalCert property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicalCert() {
        return medicalCert;
    }

    /**
     * Sets the value of the medicalCert property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicalCert(String value) {
        this.medicalCert = value;
    }

}
