
package mn.gov.ema.emongolia.data.XypProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for propertyInfoAddressDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propertyInfoAddressDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fullAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="personCorpIdno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="personNmCorpNn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="personSurnm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="propertyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registDe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tuluv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zoriulalt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propertyInfoAddressDetailData", propOrder = {
    "fullAddress",
    "personCorpIdno",
    "personNmCorpNn",
    "personSurnm",
    "propertyNumber",
    "registDe",
    "tuluv",
    "zoriulalt"
})
public class PropertyInfoAddressDetailData {

    protected String fullAddress;
    protected String personCorpIdno;
    protected String personNmCorpNn;
    protected String personSurnm;
    protected String propertyNumber;
    protected String registDe;
    protected String tuluv;
    protected String zoriulalt;

    /**
     * Gets the value of the fullAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullAddress() {
        return fullAddress;
    }

    /**
     * Sets the value of the fullAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullAddress(String value) {
        this.fullAddress = value;
    }

    /**
     * Gets the value of the personCorpIdno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonCorpIdno() {
        return personCorpIdno;
    }

    /**
     * Sets the value of the personCorpIdno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonCorpIdno(String value) {
        this.personCorpIdno = value;
    }

    /**
     * Gets the value of the personNmCorpNn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonNmCorpNn() {
        return personNmCorpNn;
    }

    /**
     * Sets the value of the personNmCorpNn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonNmCorpNn(String value) {
        this.personNmCorpNn = value;
    }

    /**
     * Gets the value of the personSurnm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonSurnm() {
        return personSurnm;
    }

    /**
     * Sets the value of the personSurnm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonSurnm(String value) {
        this.personSurnm = value;
    }

    /**
     * Gets the value of the propertyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyNumber() {
        return propertyNumber;
    }

    /**
     * Sets the value of the propertyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyNumber(String value) {
        this.propertyNumber = value;
    }

    /**
     * Gets the value of the registDe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistDe() {
        return registDe;
    }

    /**
     * Sets the value of the registDe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistDe(String value) {
        this.registDe = value;
    }

    /**
     * Gets the value of the tuluv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTuluv() {
        return tuluv;
    }

    /**
     * Sets the value of the tuluv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTuluv(String value) {
        this.tuluv = value;
    }

    /**
     * Gets the value of the zoriulalt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoriulalt() {
        return zoriulalt;
    }

    /**
     * Sets the value of the zoriulalt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoriulalt(String value) {
        this.zoriulalt = value;
    }

}
