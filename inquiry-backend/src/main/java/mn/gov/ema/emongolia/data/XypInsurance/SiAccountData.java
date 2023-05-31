
package mn.gov.ema.emongolia.data.XypInsurance;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for siAccountData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="siAccountData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="burdun" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="salary" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="shimAo" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="shimD" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="zardun" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "siAccountData", propOrder = {
    "burdun",
    "month",
    "salary",
    "shimAo",
    "shimD",
    "zardun"
})
public class SiAccountData {

    protected Double burdun;
    protected Integer month;
    protected Double salary;
    protected Double shimAo;
    protected Double shimD;
    protected Double zardun;

    /**
     * Gets the value of the burdun property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBurdun() {
        return burdun;
    }

    /**
     * Sets the value of the burdun property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBurdun(Double value) {
        this.burdun = value;
    }

    /**
     * Gets the value of the month property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMonth(Integer value) {
        this.month = value;
    }

    /**
     * Gets the value of the salary property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSalary() {
        return salary;
    }

    /**
     * Sets the value of the salary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSalary(Double value) {
        this.salary = value;
    }

    /**
     * Gets the value of the shimAo property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShimAo() {
        return shimAo;
    }

    /**
     * Sets the value of the shimAo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShimAo(Double value) {
        this.shimAo = value;
    }

    /**
     * Gets the value of the shimD property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getShimD() {
        return shimD;
    }

    /**
     * Sets the value of the shimD property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setShimD(Double value) {
        this.shimD = value;
    }

    /**
     * Gets the value of the zardun property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getZardun() {
        return zardun;
    }

    /**
     * Sets the value of the zardun property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setZardun(Double value) {
        this.zardun = value;
    }

}
