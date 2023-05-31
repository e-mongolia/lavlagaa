
package mn.gov.ema.emongolia.data.XypTax;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userInfoData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userInfoData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="call_number" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="createddate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="department_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="department_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="domainname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="max_created" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="office_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="office_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="parentname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="position_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="position_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registryno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="resultCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="usergroup_id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usergroup_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usergrouppkid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userInfoData", namespace = "http://ws/", propOrder = {
    "callNumber",
    "createddate",
    "departmentId",
    "departmentName",
    "domainname",
    "email",
    "id",
    "maxCreated",
    "name",
    "officeId",
    "officeName",
    "parentname",
    "phone",
    "positionId",
    "positionName",
    "registryno",
    "resultCode",
    "usergroupId",
    "usergroupName",
    "usergrouppkid"
})
public class UserInfoData {

    @XmlElement(name = "call_number")
    protected String callNumber;
    protected String createddate;
    @XmlElement(name = "department_id")
    protected String departmentId;
    @XmlElement(name = "department_name")
    protected String departmentName;
    protected String domainname;
    protected String email;
    protected String id;
    @XmlElement(name = "max_created")
    protected String maxCreated;
    protected String name;
    @XmlElement(name = "office_id")
    protected String officeId;
    @XmlElement(name = "office_name")
    protected String officeName;
    protected String parentname;
    protected String phone;
    @XmlElement(name = "position_id")
    protected String positionId;
    @XmlElement(name = "position_name")
    protected String positionName;
    protected String registryno;
    protected int resultCode;
    @XmlElement(name = "usergroup_id")
    protected String usergroupId;
    @XmlElement(name = "usergroup_name")
    protected String usergroupName;
    protected String usergrouppkid;

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
     * Gets the value of the createddate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateddate() {
        return createddate;
    }

    /**
     * Sets the value of the createddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateddate(String value) {
        this.createddate = value;
    }

    /**
     * Gets the value of the departmentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentId() {
        return departmentId;
    }

    /**
     * Sets the value of the departmentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentId(String value) {
        this.departmentId = value;
    }

    /**
     * Gets the value of the departmentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * Sets the value of the departmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentName(String value) {
        this.departmentName = value;
    }

    /**
     * Gets the value of the domainname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDomainname() {
        return domainname;
    }

    /**
     * Sets the value of the domainname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDomainname(String value) {
        this.domainname = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
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
     * Gets the value of the maxCreated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxCreated() {
        return maxCreated;
    }

    /**
     * Sets the value of the maxCreated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxCreated(String value) {
        this.maxCreated = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the officeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeId() {
        return officeId;
    }

    /**
     * Sets the value of the officeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeId(String value) {
        this.officeId = value;
    }

    /**
     * Gets the value of the officeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeName() {
        return officeName;
    }

    /**
     * Sets the value of the officeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeName(String value) {
        this.officeName = value;
    }

    /**
     * Gets the value of the parentname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentname() {
        return parentname;
    }

    /**
     * Sets the value of the parentname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentname(String value) {
        this.parentname = value;
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
     * Gets the value of the positionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionId() {
        return positionId;
    }

    /**
     * Sets the value of the positionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionId(String value) {
        this.positionId = value;
    }

    /**
     * Gets the value of the positionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionName() {
        return positionName;
    }

    /**
     * Sets the value of the positionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionName(String value) {
        this.positionName = value;
    }

    /**
     * Gets the value of the registryno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistryno() {
        return registryno;
    }

    /**
     * Sets the value of the registryno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistryno(String value) {
        this.registryno = value;
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
     * Gets the value of the usergroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsergroupId() {
        return usergroupId;
    }

    /**
     * Sets the value of the usergroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsergroupId(String value) {
        this.usergroupId = value;
    }

    /**
     * Gets the value of the usergroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsergroupName() {
        return usergroupName;
    }

    /**
     * Sets the value of the usergroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsergroupName(String value) {
        this.usergroupName = value;
    }

    /**
     * Gets the value of the usergrouppkid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsergrouppkid() {
        return usergrouppkid;
    }

    /**
     * Sets the value of the usergrouppkid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsergrouppkid(String value) {
        this.usergrouppkid = value;
    }

}
