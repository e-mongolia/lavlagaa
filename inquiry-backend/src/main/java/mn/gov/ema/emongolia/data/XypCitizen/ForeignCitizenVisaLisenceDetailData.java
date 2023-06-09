
package mn.gov.ema.emongolia.data.XypCitizen;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for foreignCitizenVisaLisenceDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="foreignCitizenVisaLisenceDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inverterName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inverterRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="passportNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="visaLisenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "foreignCitizenVisaLisenceDetailData", propOrder = {
    "birthDate",
    "countryName",
    "firstName",
    "inverterName",
    "inverterRegnum",
    "lastName",
    "passportNumber",
    "sex",
    "visaLisenceNumber"
})
public class ForeignCitizenVisaLisenceDetailData {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthDate;
    protected String countryName;
    protected String firstName;
    protected String inverterName;
    protected String inverterRegnum;
    protected String lastName;
    protected String passportNumber;
    protected String sex;
    protected String visaLisenceNumber;

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the inverterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInverterName() {
        return inverterName;
    }

    /**
     * Sets the value of the inverterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInverterName(String value) {
        this.inverterName = value;
    }

    /**
     * Gets the value of the inverterRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInverterRegnum() {
        return inverterRegnum;
    }

    /**
     * Sets the value of the inverterRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInverterRegnum(String value) {
        this.inverterRegnum = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the passportNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportNumber() {
        return passportNumber;
    }

    /**
     * Sets the value of the passportNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportNumber(String value) {
        this.passportNumber = value;
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex(String value) {
        this.sex = value;
    }

    /**
     * Gets the value of the visaLisenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaLisenceNumber() {
        return visaLisenceNumber;
    }

    /**
     * Sets the value of the visaLisenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaLisenceNumber(String value) {
        this.visaLisenceNumber = value;
    }

}
