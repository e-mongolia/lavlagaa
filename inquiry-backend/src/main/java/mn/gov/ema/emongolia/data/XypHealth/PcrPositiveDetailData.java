
package mn.gov.ema.emongolia.data.XypHealth;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pcrPositiveDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pcrPositiveDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aimagCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bagCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="barcode" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="resultDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="soumCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="specimensType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="testLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="testResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="testType" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pcrPositiveDetailData", propOrder = {
    "aimagCode",
    "bagCode",
    "barcode",
    "firstName",
    "lastname",
    "regnum",
    "resultDate",
    "soumCode",
    "specimensType",
    "testLocation",
    "testResult",
    "testType"
})
public class PcrPositiveDetailData {

    protected String aimagCode;
    protected String bagCode;
    protected double barcode;
    protected String firstName;
    protected String lastname;
    protected String regnum;
    protected String resultDate;
    protected String soumCode;
    protected int specimensType;
    protected String testLocation;
    protected int testResult;
    protected int testType;

    /**
     * Gets the value of the aimagCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAimagCode() {
        return aimagCode;
    }

    /**
     * Sets the value of the aimagCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimagCode(String value) {
        this.aimagCode = value;
    }

    /**
     * Gets the value of the bagCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBagCode() {
        return bagCode;
    }

    /**
     * Sets the value of the bagCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBagCode(String value) {
        this.bagCode = value;
    }

    /**
     * Gets the value of the barcode property.
     * 
     */
    public double getBarcode() {
        return barcode;
    }

    /**
     * Sets the value of the barcode property.
     * 
     */
    public void setBarcode(double value) {
        this.barcode = value;
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
     * Gets the value of the lastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastname(String value) {
        this.lastname = value;
    }

    /**
     * Gets the value of the regnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegnum() {
        return regnum;
    }

    /**
     * Sets the value of the regnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegnum(String value) {
        this.regnum = value;
    }

    /**
     * Gets the value of the resultDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultDate() {
        return resultDate;
    }

    /**
     * Sets the value of the resultDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultDate(String value) {
        this.resultDate = value;
    }

    /**
     * Gets the value of the soumCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoumCode() {
        return soumCode;
    }

    /**
     * Sets the value of the soumCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoumCode(String value) {
        this.soumCode = value;
    }

    /**
     * Gets the value of the specimensType property.
     * 
     */
    public int getSpecimensType() {
        return specimensType;
    }

    /**
     * Sets the value of the specimensType property.
     * 
     */
    public void setSpecimensType(int value) {
        this.specimensType = value;
    }

    /**
     * Gets the value of the testLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestLocation() {
        return testLocation;
    }

    /**
     * Sets the value of the testLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestLocation(String value) {
        this.testLocation = value;
    }

    /**
     * Gets the value of the testResult property.
     * 
     */
    public int getTestResult() {
        return testResult;
    }

    /**
     * Sets the value of the testResult property.
     * 
     */
    public void setTestResult(int value) {
        this.testResult = value;
    }

    /**
     * Gets the value of the testType property.
     * 
     */
    public int getTestType() {
        return testType;
    }

    /**
     * Sets the value of the testType property.
     * 
     */
    public void setTestType(int value) {
        this.testType = value;
    }

}
