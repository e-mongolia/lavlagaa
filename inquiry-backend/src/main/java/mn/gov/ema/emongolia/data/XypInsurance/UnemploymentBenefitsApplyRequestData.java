
package mn.gov.ema.emongolia.data.XypInsurance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for unemploymentBenefitsApplyRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="unemploymentBenefitsApplyRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://insurance.xyp.gov.mn/}serviceRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="aimagCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="bankAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="calculatePercent" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="dismissalDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dismissalOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="firstname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="handoverDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="handoverOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="registrationDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="soumCode" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="workMonth" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unemploymentBenefitsApplyRequestData", propOrder = {
    "address",
    "aimagCode",
    "bankAccount",
    "bankId",
    "calculatePercent",
    "dismissalDate",
    "dismissalOrder",
    "email",
    "firstname",
    "handoverDate",
    "handoverOrder",
    "lastname",
    "phone",
    "registrationDate",
    "regnum",
    "soumCode",
    "surname",
    "workMonth"
})
public class UnemploymentBenefitsApplyRequestData
    extends ServiceRequest
{

    protected String address;
    protected int aimagCode;
    protected String bankAccount;
    protected int bankId;
    protected int calculatePercent;
    protected String dismissalDate;
    protected String dismissalOrder;
    protected String email;
    protected String firstname;
    protected String handoverDate;
    protected String handoverOrder;
    protected String lastname;
    protected String phone;
    protected String registrationDate;
    protected String regnum;
    protected int soumCode;
    protected String surname;
    protected int workMonth;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the aimagCode property.
     * 
     */
    public int getAimagCode() {
        return aimagCode;
    }

    /**
     * Sets the value of the aimagCode property.
     * 
     */
    public void setAimagCode(int value) {
        this.aimagCode = value;
    }

    /**
     * Gets the value of the bankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccount() {
        return bankAccount;
    }

    /**
     * Sets the value of the bankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccount(String value) {
        this.bankAccount = value;
    }

    /**
     * Gets the value of the bankId property.
     * 
     */
    public int getBankId() {
        return bankId;
    }

    /**
     * Sets the value of the bankId property.
     * 
     */
    public void setBankId(int value) {
        this.bankId = value;
    }

    /**
     * Gets the value of the calculatePercent property.
     * 
     */
    public int getCalculatePercent() {
        return calculatePercent;
    }

    /**
     * Sets the value of the calculatePercent property.
     * 
     */
    public void setCalculatePercent(int value) {
        this.calculatePercent = value;
    }

    /**
     * Gets the value of the dismissalDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDismissalDate() {
        return dismissalDate;
    }

    /**
     * Sets the value of the dismissalDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDismissalDate(String value) {
        this.dismissalDate = value;
    }

    /**
     * Gets the value of the dismissalOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDismissalOrder() {
        return dismissalOrder;
    }

    /**
     * Sets the value of the dismissalOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDismissalOrder(String value) {
        this.dismissalOrder = value;
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
     * Gets the value of the firstname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Sets the value of the firstname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstname(String value) {
        this.firstname = value;
    }

    /**
     * Gets the value of the handoverDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandoverDate() {
        return handoverDate;
    }

    /**
     * Sets the value of the handoverDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandoverDate(String value) {
        this.handoverDate = value;
    }

    /**
     * Gets the value of the handoverOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandoverOrder() {
        return handoverOrder;
    }

    /**
     * Sets the value of the handoverOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandoverOrder(String value) {
        this.handoverOrder = value;
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
     * Gets the value of the registrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationDate() {
        return registrationDate;
    }

    /**
     * Sets the value of the registrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationDate(String value) {
        this.registrationDate = value;
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
     * Gets the value of the soumCode property.
     * 
     */
    public int getSoumCode() {
        return soumCode;
    }

    /**
     * Sets the value of the soumCode property.
     * 
     */
    public void setSoumCode(int value) {
        this.soumCode = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the workMonth property.
     * 
     */
    public int getWorkMonth() {
        return workMonth;
    }

    /**
     * Sets the value of the workMonth property.
     * 
     */
    public void setWorkMonth(int value) {
        this.workMonth = value;
    }

}
