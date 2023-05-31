
package mn.gov.ema.emongolia.data.XypInsurance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for workHistoryDetial complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workHistoryDetial"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aimagName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="directorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="directorPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="directorRegnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgNdId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orgRegId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="somName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workHistoryDetial", propOrder = {
    "aimagName",
    "directorName",
    "directorPhone",
    "directorRegnum",
    "endDate",
    "orgName",
    "orgNdId",
    "orgRegId",
    "phone",
    "somName",
    "startDate"
})
public class WorkHistoryDetial {

    protected String aimagName;
    protected String directorName;
    protected String directorPhone;
    protected String directorRegnum;
    protected String endDate;
    protected String orgName;
    protected String orgNdId;
    protected String orgRegId;
    protected String phone;
    protected String somName;
    protected String startDate;

    /**
     * Gets the value of the aimagName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAimagName() {
        return aimagName;
    }

    /**
     * Sets the value of the aimagName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimagName(String value) {
        this.aimagName = value;
    }

    /**
     * Gets the value of the directorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectorName() {
        return directorName;
    }

    /**
     * Sets the value of the directorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectorName(String value) {
        this.directorName = value;
    }

    /**
     * Gets the value of the directorPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectorPhone() {
        return directorPhone;
    }

    /**
     * Sets the value of the directorPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectorPhone(String value) {
        this.directorPhone = value;
    }

    /**
     * Gets the value of the directorRegnum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirectorRegnum() {
        return directorRegnum;
    }

    /**
     * Sets the value of the directorRegnum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirectorRegnum(String value) {
        this.directorRegnum = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(String value) {
        this.endDate = value;
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
     * Gets the value of the orgNdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgNdId() {
        return orgNdId;
    }

    /**
     * Sets the value of the orgNdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgNdId(String value) {
        this.orgNdId = value;
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

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the somName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSomName() {
        return somName;
    }

    /**
     * Sets the value of the somName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSomName(String value) {
        this.somName = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

}
