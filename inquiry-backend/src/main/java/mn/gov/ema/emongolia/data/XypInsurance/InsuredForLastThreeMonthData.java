
package mn.gov.ema.emongolia.data.XypInsurance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insuredForLastThreeMonthData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insuredForLastThreeMonthData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aimagId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aimagNer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="benClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="calMonth" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="calYear" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="isPayed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgRegId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insuredForLastThreeMonthData", propOrder = {
    "aimagId",
    "aimagNer",
    "benClass",
    "calMonth",
    "calYear",
    "isPayed",
    "orgName",
    "orgRegId"
})
public class InsuredForLastThreeMonthData {

    protected String aimagId;
    protected String aimagNer;
    protected String benClass;
    protected int calMonth;
    protected int calYear;
    protected String isPayed;
    protected String orgName;
    protected String orgRegId;

    /**
     * Gets the value of the aimagId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAimagId() {
        return aimagId;
    }

    /**
     * Sets the value of the aimagId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimagId(String value) {
        this.aimagId = value;
    }

    /**
     * Gets the value of the aimagNer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAimagNer() {
        return aimagNer;
    }

    /**
     * Sets the value of the aimagNer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimagNer(String value) {
        this.aimagNer = value;
    }

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
     * Gets the value of the isPayed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsPayed() {
        return isPayed;
    }

    /**
     * Sets the value of the isPayed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsPayed(String value) {
        this.isPayed = value;
    }

    /**
     * Gets the value of the orgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * Sets the value of the orgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgName(String value) {
        this.orgName = value;
    }

    /**
     * Gets the value of the orgRegId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgRegId() {
        return orgRegId;
    }

    /**
     * Sets the value of the orgRegId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgRegId(String value) {
        this.orgRegId = value;
    }

}
