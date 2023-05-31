
package mn.gov.ema.emongolia.data.XypTax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for salaryInfoData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="salaryInfoData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="call_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="period" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="resultCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="return_period" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="return_submitted" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="return_type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tag001a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tag001b" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tag002a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tag002b" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tag003a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tag003b" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tag011a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tag011b" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tag019a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tag019b" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tag021a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tag021b" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tag022a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tag022b" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tag023a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tag023b" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tag024a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tag024b" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tag025a" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tag025b" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salaryInfoData", namespace = "http://ws/", propOrder = {
    "callNumber",
    "id",
    "period",
    "resultCode",
    "returnPeriod",
    "returnSubmitted",
    "returnType",
    "tag001A",
    "tag001B",
    "tag002A",
    "tag002B",
    "tag003A",
    "tag003B",
    "tag011A",
    "tag011B",
    "tag019A",
    "tag019B",
    "tag021A",
    "tag021B",
    "tag022A",
    "tag022B",
    "tag023A",
    "tag023B",
    "tag024A",
    "tag024B",
    "tag025A",
    "tag025B"
})
public class SalaryInfoData {

    @XmlElement(name = "call_number")
    protected String callNumber;
    protected String id;
    protected String period;
    protected int resultCode;
    @XmlElement(name = "return_period")
    protected String returnPeriod;
    @XmlElement(name = "return_submitted")
    protected String returnSubmitted;
    @XmlElement(name = "return_type")
    protected String returnType;
    @XmlElement(name = "tag001a")
    protected String tag001A;
    @XmlElement(name = "tag001b")
    protected String tag001B;
    @XmlElement(name = "tag002a")
    protected String tag002A;
    @XmlElement(name = "tag002b")
    protected String tag002B;
    @XmlElement(name = "tag003a")
    protected String tag003A;
    @XmlElement(name = "tag003b")
    protected String tag003B;
    @XmlElement(name = "tag011a")
    protected String tag011A;
    @XmlElement(name = "tag011b")
    protected String tag011B;
    @XmlElement(name = "tag019a")
    protected String tag019A;
    @XmlElement(name = "tag019b")
    protected String tag019B;
    @XmlElement(name = "tag021a")
    protected String tag021A;
    @XmlElement(name = "tag021b")
    protected String tag021B;
    @XmlElement(name = "tag022a")
    protected String tag022A;
    @XmlElement(name = "tag022b")
    protected String tag022B;
    @XmlElement(name = "tag023a")
    protected String tag023A;
    @XmlElement(name = "tag023b")
    protected String tag023B;
    @XmlElement(name = "tag024a")
    protected String tag024A;
    @XmlElement(name = "tag024b")
    protected String tag024B;
    @XmlElement(name = "tag025a")
    protected String tag025A;
    @XmlElement(name = "tag025b")
    protected String tag025B;

    /**
     * Gets the value of the callNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCallNumber() {
        return callNumber;
    }

    /**
     * Sets the value of the callNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCallNumber(String value) {
        this.callNumber = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriod(String value) {
        this.period = value;
    }

    /**
     * Gets the value of the resultCode property.
     * 
     */
    public int getResultCode() {
        return resultCode;
    }

    /**
     * Sets the value of the resultCode property.
     * 
     */
    public void setResultCode(int value) {
        this.resultCode = value;
    }

    /**
     * Gets the value of the returnPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnPeriod() {
        return returnPeriod;
    }

    /**
     * Sets the value of the returnPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnPeriod(String value) {
        this.returnPeriod = value;
    }

    /**
     * Gets the value of the returnSubmitted property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnSubmitted() {
        return returnSubmitted;
    }

    /**
     * Sets the value of the returnSubmitted property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnSubmitted(String value) {
        this.returnSubmitted = value;
    }

    /**
     * Gets the value of the returnType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnType() {
        return returnType;
    }

    /**
     * Sets the value of the returnType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnType(String value) {
        this.returnType = value;
    }

    /**
     * Gets the value of the tag001A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag001A() {
        return tag001A;
    }

    /**
     * Sets the value of the tag001A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag001A(String value) {
        this.tag001A = value;
    }

    /**
     * Gets the value of the tag001B property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag001B() {
        return tag001B;
    }

    /**
     * Sets the value of the tag001B property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag001B(String value) {
        this.tag001B = value;
    }

    /**
     * Gets the value of the tag002A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag002A() {
        return tag002A;
    }

    /**
     * Sets the value of the tag002A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag002A(String value) {
        this.tag002A = value;
    }

    /**
     * Gets the value of the tag002B property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag002B() {
        return tag002B;
    }

    /**
     * Sets the value of the tag002B property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag002B(String value) {
        this.tag002B = value;
    }

    /**
     * Gets the value of the tag003A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag003A() {
        return tag003A;
    }

    /**
     * Sets the value of the tag003A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag003A(String value) {
        this.tag003A = value;
    }

    /**
     * Gets the value of the tag003B property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag003B() {
        return tag003B;
    }

    /**
     * Sets the value of the tag003B property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag003B(String value) {
        this.tag003B = value;
    }

    /**
     * Gets the value of the tag011A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag011A() {
        return tag011A;
    }

    /**
     * Sets the value of the tag011A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag011A(String value) {
        this.tag011A = value;
    }

    /**
     * Gets the value of the tag011B property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag011B() {
        return tag011B;
    }

    /**
     * Sets the value of the tag011B property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag011B(String value) {
        this.tag011B = value;
    }

    /**
     * Gets the value of the tag019A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag019A() {
        return tag019A;
    }

    /**
     * Sets the value of the tag019A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag019A(String value) {
        this.tag019A = value;
    }

    /**
     * Gets the value of the tag019B property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag019B() {
        return tag019B;
    }

    /**
     * Sets the value of the tag019B property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag019B(String value) {
        this.tag019B = value;
    }

    /**
     * Gets the value of the tag021A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag021A() {
        return tag021A;
    }

    /**
     * Sets the value of the tag021A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag021A(String value) {
        this.tag021A = value;
    }

    /**
     * Gets the value of the tag021B property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag021B() {
        return tag021B;
    }

    /**
     * Sets the value of the tag021B property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag021B(String value) {
        this.tag021B = value;
    }

    /**
     * Gets the value of the tag022A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag022A() {
        return tag022A;
    }

    /**
     * Sets the value of the tag022A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag022A(String value) {
        this.tag022A = value;
    }

    /**
     * Gets the value of the tag022B property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag022B() {
        return tag022B;
    }

    /**
     * Sets the value of the tag022B property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag022B(String value) {
        this.tag022B = value;
    }

    /**
     * Gets the value of the tag023A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag023A() {
        return tag023A;
    }

    /**
     * Sets the value of the tag023A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag023A(String value) {
        this.tag023A = value;
    }

    /**
     * Gets the value of the tag023B property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag023B() {
        return tag023B;
    }

    /**
     * Sets the value of the tag023B property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag023B(String value) {
        this.tag023B = value;
    }

    /**
     * Gets the value of the tag024A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag024A() {
        return tag024A;
    }

    /**
     * Sets the value of the tag024A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag024A(String value) {
        this.tag024A = value;
    }

    /**
     * Gets the value of the tag024B property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag024B() {
        return tag024B;
    }

    /**
     * Sets the value of the tag024B property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag024B(String value) {
        this.tag024B = value;
    }

    /**
     * Gets the value of the tag025A property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag025A() {
        return tag025A;
    }

    /**
     * Sets the value of the tag025A property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag025A(String value) {
        this.tag025A = value;
    }

    /**
     * Gets the value of the tag025B property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTag025B() {
        return tag025B;
    }

    /**
     * Sets the value of the tag025B property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTag025B(String value) {
        this.tag025B = value;
    }

}
