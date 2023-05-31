
package mn.gov.ema.emongolia.data.XypInsurance;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for salaryFoundByOccupationData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="salaryFoundByOccupationData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dun1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="dun2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="dun3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="num1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="num2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="num3" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ocCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ocName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="occCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="occName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sal1" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="sal2" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="sal3" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "salaryFoundByOccupationData", propOrder = {
    "dun1",
    "dun2",
    "dun3",
    "num1",
    "num2",
    "num3",
    "ocCode",
    "ocName",
    "occCode",
    "occName",
    "sal1",
    "sal2",
    "sal3"
})
public class SalaryFoundByOccupationData {

    protected BigDecimal dun1;
    protected BigDecimal dun2;
    protected BigDecimal dun3;
    protected int num1;
    protected int num2;
    protected int num3;
    protected String ocCode;
    protected String ocName;
    protected String occCode;
    protected String occName;
    protected BigDecimal sal1;
    protected BigDecimal sal2;
    protected BigDecimal sal3;

    /**
     * Gets the value of the dun1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDun1() {
        return dun1;
    }

    /**
     * Sets the value of the dun1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDun1(BigDecimal value) {
        this.dun1 = value;
    }

    /**
     * Gets the value of the dun2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDun2() {
        return dun2;
    }

    /**
     * Sets the value of the dun2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDun2(BigDecimal value) {
        this.dun2 = value;
    }

    /**
     * Gets the value of the dun3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDun3() {
        return dun3;
    }

    /**
     * Sets the value of the dun3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDun3(BigDecimal value) {
        this.dun3 = value;
    }

    /**
     * Gets the value of the num1 property.
     * 
     */
    public int getNum1() {
        return num1;
    }

    /**
     * Sets the value of the num1 property.
     * 
     */
    public void setNum1(int value) {
        this.num1 = value;
    }

    /**
     * Gets the value of the num2 property.
     * 
     */
    public int getNum2() {
        return num2;
    }

    /**
     * Sets the value of the num2 property.
     * 
     */
    public void setNum2(int value) {
        this.num2 = value;
    }

    /**
     * Gets the value of the num3 property.
     * 
     */
    public int getNum3() {
        return num3;
    }

    /**
     * Sets the value of the num3 property.
     * 
     */
    public void setNum3(int value) {
        this.num3 = value;
    }

    /**
     * Gets the value of the ocCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOcCode() {
        return ocCode;
    }

    /**
     * Sets the value of the ocCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOcCode(String value) {
        this.ocCode = value;
    }

    /**
     * Gets the value of the ocName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOcName() {
        return ocName;
    }

    /**
     * Sets the value of the ocName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOcName(String value) {
        this.ocName = value;
    }

    /**
     * Gets the value of the occCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccCode() {
        return occCode;
    }

    /**
     * Sets the value of the occCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccCode(String value) {
        this.occCode = value;
    }

    /**
     * Gets the value of the occName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccName() {
        return occName;
    }

    /**
     * Sets the value of the occName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccName(String value) {
        this.occName = value;
    }

    /**
     * Gets the value of the sal1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSal1() {
        return sal1;
    }

    /**
     * Sets the value of the sal1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSal1(BigDecimal value) {
        this.sal1 = value;
    }

    /**
     * Gets the value of the sal2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSal2() {
        return sal2;
    }

    /**
     * Sets the value of the sal2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSal2(BigDecimal value) {
        this.sal2 = value;
    }

    /**
     * Gets the value of the sal3 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSal3() {
        return sal3;
    }

    /**
     * Sets the value of the sal3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSal3(BigDecimal value) {
        this.sal3 = value;
    }

}
