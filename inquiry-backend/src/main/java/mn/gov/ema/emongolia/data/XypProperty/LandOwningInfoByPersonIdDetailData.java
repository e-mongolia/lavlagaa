
package mn.gov.ema.emongolia.data.XypProperty;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for landOwningInfoByPersonIdDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="landOwningInfoByPersonIdDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="addressKhashaa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressStreetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aimagCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bagKhorooName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contractActive" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="contractNum" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="parcelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rightType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="soumDistrictName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "landOwningInfoByPersonIdDetailData", propOrder = {
    "addressKhashaa",
    "addressStreetName",
    "aimagCityName",
    "bagKhorooName",
    "contractActive",
    "contractNum",
    "parcelId",
    "rightType",
    "soumDistrictName"
})
public class LandOwningInfoByPersonIdDetailData {

    protected String addressKhashaa;
    protected String addressStreetName;
    protected String aimagCityName;
    protected String bagKhorooName;
    protected boolean contractActive;
    protected int contractNum;
    protected String parcelId;
    protected int rightType;
    protected String soumDistrictName;

    /**
     * Gets the value of the addressKhashaa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressKhashaa() {
        return addressKhashaa;
    }

    /**
     * Sets the value of the addressKhashaa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressKhashaa(String value) {
        this.addressKhashaa = value;
    }

    /**
     * Gets the value of the addressStreetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressStreetName() {
        return addressStreetName;
    }

    /**
     * Sets the value of the addressStreetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressStreetName(String value) {
        this.addressStreetName = value;
    }

    /**
     * Gets the value of the aimagCityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAimagCityName() {
        return aimagCityName;
    }

    /**
     * Sets the value of the aimagCityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimagCityName(String value) {
        this.aimagCityName = value;
    }

    /**
     * Gets the value of the bagKhorooName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBagKhorooName() {
        return bagKhorooName;
    }

    /**
     * Sets the value of the bagKhorooName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBagKhorooName(String value) {
        this.bagKhorooName = value;
    }

    /**
     * Gets the value of the contractActive property.
     * 
     */
    public boolean isContractActive() {
        return contractActive;
    }

    /**
     * Sets the value of the contractActive property.
     * 
     */
    public void setContractActive(boolean value) {
        this.contractActive = value;
    }

    /**
     * Gets the value of the contractNum property.
     * 
     */
    public int getContractNum() {
        return contractNum;
    }

    /**
     * Sets the value of the contractNum property.
     * 
     */
    public void setContractNum(int value) {
        this.contractNum = value;
    }

    /**
     * Gets the value of the parcelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParcelId() {
        return parcelId;
    }

    /**
     * Sets the value of the parcelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParcelId(String value) {
        this.parcelId = value;
    }

    /**
     * Gets the value of the rightType property.
     * 
     */
    public int getRightType() {
        return rightType;
    }

    /**
     * Sets the value of the rightType property.
     * 
     */
    public void setRightType(int value) {
        this.rightType = value;
    }

    /**
     * Gets the value of the soumDistrictName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoumDistrictName() {
        return soumDistrictName;
    }

    /**
     * Sets the value of the soumDistrictName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoumDistrictName(String value) {
        this.soumDistrictName = value;
    }

}
