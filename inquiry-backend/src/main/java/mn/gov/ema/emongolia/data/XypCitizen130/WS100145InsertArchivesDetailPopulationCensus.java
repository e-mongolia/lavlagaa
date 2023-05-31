
package mn.gov.ema.emongolia.data.XypCitizen130;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WS100145_insertArchivesDetailPopulationCensus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WS100145_insertArchivesDetailPopulationCensus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://citizen.xyp.gov.mn/}insertCitizenArchivesPopulationCensus" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WS100145_insertArchivesDetailPopulationCensus", propOrder = {
    "request"
})
public class WS100145InsertArchivesDetailPopulationCensus {

    protected InsertCitizenArchivesPopulationCensus request;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link InsertCitizenArchivesPopulationCensus }
     *     
     */
    public InsertCitizenArchivesPopulationCensus getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link InsertCitizenArchivesPopulationCensus }
     *     
     */
    public void setRequest(InsertCitizenArchivesPopulationCensus value) {
        this.request = value;
    }

}
