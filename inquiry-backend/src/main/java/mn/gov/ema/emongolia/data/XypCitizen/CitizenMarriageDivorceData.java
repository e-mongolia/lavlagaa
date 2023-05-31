
package mn.gov.ema.emongolia.data.XypCitizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for citizenMarriageDivorceData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citizenMarriageDivorceData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cancelCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cancelDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cancelDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cancelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="courtCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="courtDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="courtDistrict" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="courtId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="husband" type="{http://citizen.xyp.gov.mn/}citizenMarriageBriefData" minOccurs="0"/&gt;
 *         &lt;element name="marriedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="wife" type="{http://citizen.xyp.gov.mn/}citizenMarriageBriefData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "citizenMarriageDivorceData", propOrder = {
    "cancelCity",
    "cancelDate",
    "cancelDistrict",
    "cancelId",
    "courtCity",
    "courtDate",
    "courtDistrict",
    "courtId",
    "husband",
    "marriedDate",
    "wife"
})
public class CitizenMarriageDivorceData {

    protected String cancelCity;
    protected String cancelDate;
    protected String cancelDistrict;
    protected String cancelId;
    protected String courtCity;
    protected String courtDate;
    protected String courtDistrict;
    protected String courtId;
    protected CitizenMarriageBriefData husband;
    protected String marriedDate;
    protected CitizenMarriageBriefData wife;

    /**
     * Gets the value of the cancelCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelCity() {
        return cancelCity;
    }

    /**
     * Sets the value of the cancelCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelCity(String value) {
        this.cancelCity = value;
    }

    /**
     * Gets the value of the cancelDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelDate() {
        return cancelDate;
    }

    /**
     * Sets the value of the cancelDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelDate(String value) {
        this.cancelDate = value;
    }

    /**
     * Gets the value of the cancelDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelDistrict() {
        return cancelDistrict;
    }

    /**
     * Sets the value of the cancelDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelDistrict(String value) {
        this.cancelDistrict = value;
    }

    /**
     * Gets the value of the cancelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelId() {
        return cancelId;
    }

    /**
     * Sets the value of the cancelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelId(String value) {
        this.cancelId = value;
    }

    /**
     * Gets the value of the courtCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourtCity() {
        return courtCity;
    }

    /**
     * Sets the value of the courtCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourtCity(String value) {
        this.courtCity = value;
    }

    /**
     * Gets the value of the courtDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourtDate() {
        return courtDate;
    }

    /**
     * Sets the value of the courtDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourtDate(String value) {
        this.courtDate = value;
    }

    /**
     * Gets the value of the courtDistrict property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourtDistrict() {
        return courtDistrict;
    }

    /**
     * Sets the value of the courtDistrict property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourtDistrict(String value) {
        this.courtDistrict = value;
    }

    /**
     * Gets the value of the courtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourtId() {
        return courtId;
    }

    /**
     * Sets the value of the courtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourtId(String value) {
        this.courtId = value;
    }

    /**
     * Gets the value of the husband property.
     * 
     * @return
     *     possible object is
     *     {@link CitizenMarriageBriefData }
     *     
     */
    public CitizenMarriageBriefData getHusband() {
        return husband;
    }

    /**
     * Sets the value of the husband property.
     * 
     * @param value
     *     allowed object is
     *     {@link CitizenMarriageBriefData }
     *     
     */
    public void setHusband(CitizenMarriageBriefData value) {
        this.husband = value;
    }

    /**
     * Gets the value of the marriedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriedDate() {
        return marriedDate;
    }

    /**
     * Sets the value of the marriedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriedDate(String value) {
        this.marriedDate = value;
    }

    /**
     * Gets the value of the wife property.
     * 
     * @return
     *     possible object is
     *     {@link CitizenMarriageBriefData }
     *     
     */
    public CitizenMarriageBriefData getWife() {
        return wife;
    }

    /**
     * Sets the value of the wife property.
     * 
     * @param value
     *     allowed object is
     *     {@link CitizenMarriageBriefData }
     *     
     */
    public void setWife(CitizenMarriageBriefData value) {
        this.wife = value;
    }

}
