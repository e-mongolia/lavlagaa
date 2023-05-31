
package mn.gov.ema.emongolia.data.XypInsurance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for socialInsuranceDetailData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="socialInsuranceDetailData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="benClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="calMonth" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="calYear" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "socialInsuranceDetailData", propOrder = {
    "benClass",
    "calMonth",
    "calYear",
    "province"
})
public class SocialInsuranceDetailData {

    protected String benClass;
    protected int calMonth;
    protected int calYear;
    protected String province;

    /**
     * Gets the value of the benClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenClass() {
        return benClass;
    }

    /**
     * Sets the value of the benClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenClass(String value) {
        this.benClass = value;
    }

    /**
     * Gets the value of the calMonth property.
     * 
     */
    public int getCalMonth() {
        return calMonth;
    }

    /**
     * Sets the value of the calMonth property.
     * 
     */
    public void setCalMonth(int value) {
        this.calMonth = value;
    }

    /**
     * Gets the value of the calYear property.
     * 
     */
    public int getCalYear() {
        return calYear;
    }

    /**
     * Sets the value of the calYear property.
     * 
     */
    public void setCalYear(int value) {
        this.calYear = value;
    }

    /**
     * Gets the value of the province property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvince() {
        return province;
    }

    /**
     * Sets the value of the province property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvince(String value) {
        this.province = value;
    }

}
