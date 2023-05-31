
package mn.gov.ema.emongolia.data.XypCitizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for citizenChangeRegnumData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citizenChangeRegnumData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="causeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="causeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="forename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="givenname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regnumNew" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regnumOld" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "citizenChangeRegnumData", propOrder = {
    "causeCode",
    "causeName",
    "forename",
    "givenname",
    "regnumNew",
    "regnumOld",
    "surname"
})
public class CitizenChangeRegnumData {

    protected String causeCode;
    protected String causeName;
    protected String forename;
    protected String givenname;
    protected String regnumNew;
    protected String regnumOld;
    protected String surname;

    /**
     * Gets the value of the causeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCauseCode() {
        return causeCode;
    }

    /**
     * Sets the value of the causeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCauseCode(String value) {
        this.causeCode = value;
    }

    /**
     * Gets the value of the causeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCauseName() {
        return causeName;
    }

    /**
     * Sets the value of the causeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCauseName(String value) {
        this.causeName = value;
    }

    /**
     * Gets the value of the forename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForename() {
        return forename;
    }

    /**
     * Sets the value of the forename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForename(String value) {
        this.forename = value;
    }

    /**
     * Gets the value of the givenname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenname() {
        return givenname;
    }

    /**
     * Sets the value of the givenname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenname(String value) {
        this.givenname = value;
    }

    /**
     * Gets the value of the regnumNew property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnumNew() {
        return regnumNew;
    }

    /**
     * Sets the value of the regnumNew property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegnumNew(String value) {
        this.regnumNew = value;
    }

    /**
     * Gets the value of the regnumOld property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnumOld() {
        return regnumOld;
    }

    /**
     * Sets the value of the regnumOld property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegnumOld(String value) {
        this.regnumOld = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

}
