
package mn.gov.ema.emongolia.data.XypInsurance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for schedule complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="schedule"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="calMonth" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="calYear" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="payDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "schedule", propOrder = {
    "calMonth",
    "calYear",
    "payDate",
    "status"
})
public class Schedule {

    protected int calMonth;
    protected int calYear;
    protected String payDate;
    protected boolean status;

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
     * Gets the value of the payDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayDate() {
        return payDate;
    }

    /**
     * Sets the value of the payDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayDate(String value) {
        this.payDate = value;
    }

    /**
     * Gets the value of the status property.
     * 
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     */
    public void setStatus(boolean value) {
        this.status = value;
    }

}
