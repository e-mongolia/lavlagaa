
package mn.gov.ema.emongolia.data.XypProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for propertyRentContractDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propertyRentContractDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contractPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="personCorpIdno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="personNmCorpNn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="personSurnm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="properyNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registDe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propertyRentContractDetailData", propOrder = {
    "contractPrice",
    "personCorpIdno",
    "personNmCorpNn",
    "personSurnm",
    "properyNum",
    "registDe"
})
public class PropertyRentContractDetailData {

    protected String contractPrice;
    protected String personCorpIdno;
    protected String personNmCorpNn;
    protected String personSurnm;
    protected String properyNum;
    protected String registDe;

    /**
     * Gets the value of the contractPrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractPrice() {
        return contractPrice;
    }

    /**
     * Sets the value of the contractPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractPrice(String value) {
        this.contractPrice = value;
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
     * Gets the value of the properyNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProperyNum() {
        return properyNum;
    }

    /**
     * Sets the value of the properyNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProperyNum(String value) {
        this.properyNum = value;
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

}
