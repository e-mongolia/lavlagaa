
package mn.gov.ema.emongolia.data.XypInsurance;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for siWorkerAccountData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="siWorkerAccountData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="barcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="c1" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="c2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="garuld" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="huu" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="lstAccountData" type="{http://insurance.xyp.gov.mn/}siAccountData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lstAccountUId" type="{http://insurance.xyp.gov.mn/}siAccountUidData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="lstOrgName" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "siWorkerAccountData", propOrder = {
    "barcode",
    "c1",
    "c2",
    "garuld",
    "huu",
    "lstAccountData",
    "lstAccountUId",
    "lstOrgName",
    "year"
})
public class SiWorkerAccountData {

    protected String barcode;
    protected Double c1;
    protected Double c2;
    protected Double garuld;
    protected Double huu;
    @XmlElement(nillable = true)
    protected List<SiAccountData> lstAccountData;
    @XmlElement(nillable = true)
    protected List<SiAccountUidData> lstAccountUId;
    @XmlElement(nillable = true)
    protected List<String> lstOrgName;
    protected int year;

    /**
     * Gets the value of the barcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * Sets the value of the barcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBarcode(String value) {
        this.barcode = value;
    }

    /**
     * Gets the value of the c1 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getC1() {
        return c1;
    }

    /**
     * Sets the value of the c1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setC1(Double value) {
        this.c1 = value;
    }

    /**
     * Gets the value of the c2 property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getC2() {
        return c2;
    }

    /**
     * Sets the value of the c2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setC2(Double value) {
        this.c2 = value;
    }

    /**
     * Gets the value of the garuld property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGaruld() {
        return garuld;
    }

    /**
     * Sets the value of the garuld property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGaruld(Double value) {
        this.garuld = value;
    }

    /**
     * Gets the value of the huu property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHuu() {
        return huu;
    }

    /**
     * Sets the value of the huu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHuu(Double value) {
        this.huu = value;
    }

    /**
     * Gets the value of the lstAccountData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lstAccountData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLstAccountData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiAccountData }
     * 
     * 
     */
    public List<SiAccountData> getLstAccountData() {
        if (lstAccountData == null) {
            lstAccountData = new ArrayList<SiAccountData>();
        }
        return this.lstAccountData;
    }

    /**
     * Gets the value of the lstAccountUId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lstAccountUId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLstAccountUId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiAccountUidData }
     * 
     * 
     */
    public List<SiAccountUidData> getLstAccountUId() {
        if (lstAccountUId == null) {
            lstAccountUId = new ArrayList<SiAccountUidData>();
        }
        return this.lstAccountUId;
    }

    /**
     * Gets the value of the lstOrgName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lstOrgName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLstOrgName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getLstOrgName() {
        if (lstOrgName == null) {
            lstOrgName = new ArrayList<String>();
        }
        return this.lstOrgName;
    }

    /**
     * Gets the value of the year property.
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

}
