
package mn.gov.ema.emongolia.data.XypProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for collateralPropertyInfoDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="collateralPropertyInfoDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contractNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contractPrice" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contractTermFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contractTermTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="personNmCorpNm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="propertyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "collateralPropertyInfoDetailData", propOrder = {
    "contractNo",
    "contractPrice",
    "contractTermFrom",
    "contractTermTo",
    "personNmCorpNm",
    "propertyNumber",
    "registDe"
})
public class CollateralPropertyInfoDetailData {

    protected String contractNo;
    protected String contractPrice;
    protected String contractTermFrom;
    protected String contractTermTo;
    protected String personNmCorpNm;
    protected String propertyNumber;
    protected String registDe;

    /**
     * Gets the value of the contractNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNo() {
        return contractNo;
    }

    /**
     * Sets the value of the contractNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNo(String value) {
        this.contractNo = value;
    }

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
     * Gets the value of the contractTermFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractTermFrom() {
        return contractTermFrom;
    }

    /**
     * Sets the value of the contractTermFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractTermFrom(String value) {
        this.contractTermFrom = value;
    }

    /**
     * Gets the value of the contractTermTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractTermTo() {
        return contractTermTo;
    }

    /**
     * Sets the value of the contractTermTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractTermTo(String value) {
        this.contractTermTo = value;
    }

    /**
     * Gets the value of the personNmCorpNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonNmCorpNm() {
        return personNmCorpNm;
    }

    /**
     * Sets the value of the personNmCorpNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonNmCorpNm(String value) {
        this.personNmCorpNm = value;
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

}
