
package mn.gov.ema.emongolia.data.XypTransport;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getECData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getECData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="baseType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carBrand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carMark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carModel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carTotalWeight" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="checkupPassed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="checkupPassedDateAgain" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="hasPenalty" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="insuranceDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noAxile" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="resultCodeTax" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="taxPaid" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getECData", propOrder = {
    "baseType",
    "carBrand",
    "carClass",
    "carCountry",
    "carMark",
    "carModel",
    "carTotalWeight",
    "checkupPassed",
    "checkupPassedDateAgain",
    "hasPenalty",
    "insuranceDate",
    "noAxile",
    "resultCodeTax",
    "taxPaid"
})
public class GetECData {

    protected String baseType;
    protected String carBrand;
    protected String carClass;
    protected String carCountry;
    protected String carMark;
    protected String carModel;
    protected int carTotalWeight;
    protected boolean checkupPassed;
    protected String checkupPassedDateAgain;
    protected int hasPenalty;
    protected String insuranceDate;
    protected int noAxile;
    protected int resultCodeTax;
    protected boolean taxPaid;

    /**
     * Gets the value of the baseType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseType() {
        return baseType;
    }

    /**
     * Sets the value of the baseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseType(String value) {
        this.baseType = value;
    }

    /**
     * Gets the value of the carBrand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarBrand() {
        return carBrand;
    }

    /**
     * Sets the value of the carBrand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarBrand(String value) {
        this.carBrand = value;
    }

    /**
     * Gets the value of the carClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarClass() {
        return carClass;
    }

    /**
     * Sets the value of the carClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarClass(String value) {
        this.carClass = value;
    }

    /**
     * Gets the value of the carCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarCountry() {
        return carCountry;
    }

    /**
     * Sets the value of the carCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarCountry(String value) {
        this.carCountry = value;
    }

    /**
     * Gets the value of the carMark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarMark() {
        return carMark;
    }

    /**
     * Sets the value of the carMark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarMark(String value) {
        this.carMark = value;
    }

    /**
     * Gets the value of the carModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarModel() {
        return carModel;
    }

    /**
     * Sets the value of the carModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarModel(String value) {
        this.carModel = value;
    }

    /**
     * Gets the value of the carTotalWeight property.
     * 
     */
    public int getCarTotalWeight() {
        return carTotalWeight;
    }

    /**
     * Sets the value of the carTotalWeight property.
     * 
     */
    public void setCarTotalWeight(int value) {
        this.carTotalWeight = value;
    }

    /**
     * Gets the value of the checkupPassed property.
     * 
     */
    public boolean isCheckupPassed() {
        return checkupPassed;
    }

    /**
     * Sets the value of the checkupPassed property.
     * 
     */
    public void setCheckupPassed(boolean value) {
        this.checkupPassed = value;
    }

    /**
     * Gets the value of the checkupPassedDateAgain property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckupPassedDateAgain() {
        return checkupPassedDateAgain;
    }

    /**
     * Sets the value of the checkupPassedDateAgain property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckupPassedDateAgain(String value) {
        this.checkupPassedDateAgain = value;
    }

    /**
     * Gets the value of the hasPenalty property.
     * 
     */
    public int getHasPenalty() {
        return hasPenalty;
    }

    /**
     * Sets the value of the hasPenalty property.
     * 
     */
    public void setHasPenalty(int value) {
        this.hasPenalty = value;
    }

    /**
     * Gets the value of the insuranceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceDate() {
        return insuranceDate;
    }

    /**
     * Sets the value of the insuranceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceDate(String value) {
        this.insuranceDate = value;
    }

    /**
     * Gets the value of the noAxile property.
     * 
     */
    public int getNoAxile() {
        return noAxile;
    }

    /**
     * Sets the value of the noAxile property.
     * 
     */
    public void setNoAxile(int value) {
        this.noAxile = value;
    }

    /**
     * Gets the value of the resultCodeTax property.
     * 
     */
    public int getResultCodeTax() {
        return resultCodeTax;
    }

    /**
     * Sets the value of the resultCodeTax property.
     * 
     */
    public void setResultCodeTax(int value) {
        this.resultCodeTax = value;
    }

    /**
     * Gets the value of the taxPaid property.
     * 
     */
    public boolean isTaxPaid() {
        return taxPaid;
    }

    /**
     * Sets the value of the taxPaid property.
     * 
     */
    public void setTaxPaid(boolean value) {
        this.taxPaid = value;
    }

}
