
package mn.gov.ema.emongolia.data.XypGovernment;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GS10028_citizenNonPaymentEngInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GS10028_citizenNonPaymentEngInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://government.xyp.gov.mn/}covidVaccineDoseCountRequestData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GS10028_citizenNonPaymentEngInfo", propOrder = {
    "request"
})
public class GS10028CitizenNonPaymentEngInfo {

    protected CovidVaccineDoseCountRequestData request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link CovidVaccineDoseCountRequestData }
     *     
     */
    public CovidVaccineDoseCountRequestData getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link CovidVaccineDoseCountRequestData }
     *     
     */
    public void setRequest(CovidVaccineDoseCountRequestData value) {
        this.request = value;
    }

}
