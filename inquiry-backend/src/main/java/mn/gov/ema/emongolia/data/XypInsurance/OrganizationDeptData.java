
package mn.gov.ema.emongolia.data.XypInsurance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for organizationDeptData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="organizationDeptData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aimag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="debt" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="insuranceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "organizationDeptData", propOrder = {
    "aimag",
    "debt",
    "insuranceNumber"
})
public class OrganizationDeptData {

    protected String aimag;
    protected int debt;
    protected String insuranceNumber;

    /**
     * Gets the value of the aimag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAimag() {
        return aimag;
    }

    /**
     * Sets the value of the aimag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAimag(String value) {
        this.aimag = value;
    }

    /**
     * Gets the value of the debt property.
     * 
     */
    public int getDebt() {
        return debt;
    }

    /**
     * Sets the value of the debt property.
     * 
     */
    public void setDebt(int value) {
        this.debt = value;
    }

    /**
     * Gets the value of the insuranceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    /**
     * Sets the value of the insuranceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceNumber(String value) {
        this.insuranceNumber = value;
    }

}
