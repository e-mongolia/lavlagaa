
package mn.gov.ema.emongolia.data.XypProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for landCadastreApplicantDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="landCadastreApplicantDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="application" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dateOfBirth" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="mainApplicant" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="personRegister" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="prCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="prDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ptCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ptDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "landCadastreApplicantDetailData", propOrder = {
    "application",
    "dateOfBirth",
    "firstName",
    "gender",
    "mainApplicant",
    "middleName",
    "name",
    "personRegister",
    "prCode",
    "prDesc",
    "ptCode",
    "ptDesc"
})
public class LandCadastreApplicantDetailData {

    protected int application;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfBirth;
    protected String firstName;
    protected int gender;
    protected boolean mainApplicant;
    protected String middleName;
    protected String name;
    protected String personRegister;
    protected int prCode;
    protected String prDesc;
    protected int ptCode;
    protected String ptDesc;

    /**
     * Gets the value of the application property.
     * 
     */
    public int getApplication() {
        return application;
    }

    /**
     * Sets the value of the application property.
     * 
     */
    public void setApplication(int value) {
        this.application = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfBirth(XMLGregorianCalendar value) {
        this.dateOfBirth = value;
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
     * Gets the value of the gender property.
     * 
     */
    public int getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     */
    public void setGender(int value) {
        this.gender = value;
    }

    /**
     * Gets the value of the mainApplicant property.
     * 
     */
    public boolean isMainApplicant() {
        return mainApplicant;
    }

    /**
     * Sets the value of the mainApplicant property.
     * 
     */
    public void setMainApplicant(boolean value) {
        this.mainApplicant = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the personRegister property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonRegister() {
        return personRegister;
    }

    /**
     * Sets the value of the personRegister property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonRegister(String value) {
        this.personRegister = value;
    }

    /**
     * Gets the value of the prCode property.
     * 
     */
    public int getPrCode() {
        return prCode;
    }

    /**
     * Sets the value of the prCode property.
     * 
     */
    public void setPrCode(int value) {
        this.prCode = value;
    }

    /**
     * Gets the value of the prDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrDesc() {
        return prDesc;
    }

    /**
     * Sets the value of the prDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrDesc(String value) {
        this.prDesc = value;
    }

    /**
     * Gets the value of the ptCode property.
     * 
     */
    public int getPtCode() {
        return ptCode;
    }

    /**
     * Sets the value of the ptCode property.
     * 
     */
    public void setPtCode(int value) {
        this.ptCode = value;
    }

    /**
     * Gets the value of the ptDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtDesc() {
        return ptDesc;
    }

    /**
     * Sets the value of the ptDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtDesc(String value) {
        this.ptDesc = value;
    }

}
