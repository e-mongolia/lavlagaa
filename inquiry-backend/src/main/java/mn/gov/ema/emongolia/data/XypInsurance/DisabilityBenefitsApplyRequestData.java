
package mn.gov.ema.emongolia.data.XypInsurance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for disabilityBenefitsApplyRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="disabilityBenefitsApplyRequestData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://insurance.xyp.gov.mn/}serviceRequest"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bankAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="bankId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="calculatePercent" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="medicalCertnumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regnum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "disabilityBenefitsApplyRequestData", propOrder = {
    "bankAccount",
    "bankId",
    "calculatePercent",
    "email",
    "medicalCertnumber",
    "phone",
    "regnum",
    "workMonth"
})
public class DisabilityBenefitsApplyRequestData
    extends ServiceRequest
{

    protected String bankAccount;
    protected int bankId;
    protected int calculatePercent;
    protected String email;
    protected String medicalCertnumber;
    protected String phone;
    protected String regnum;
    protected int workMonth;

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
     * Gets the value of the medicalCertnumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicalCertnumber() {
        return medicalCertnumber;
    }

    /**
     * Sets the value of the medicalCertnumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicalCertnumber(String value) {
        this.medicalCertnumber = value;
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
