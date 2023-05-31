
package mn.gov.ema.emongolia.data.XypLegalEntity;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for legalEntityOpenData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="legalEntityOpenData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://les.xyp.gov.mn/}address" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="founder" type="{http://les.xyp.gov.mn/}founder" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="general" type="{http://les.xyp.gov.mn/}general" minOccurs="0"/&gt;
 *         &lt;element name="generalR" type="{http://les.xyp.gov.mn/}generalR" minOccurs="0"/&gt;
 *         &lt;element name="induty" type="{http://les.xyp.gov.mn/}induty" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "legalEntityOpenData", propOrder = {
    "address",
    "founder",
    "general",
    "generalR",
    "induty"
})
public class LegalEntityOpenData {

    @XmlElement(nillable = true)
    protected List<Address> address;
    @XmlElement(nillable = true)
    protected List<Founder> founder;
    protected General general;
    protected GeneralR generalR;
    @XmlElement(nillable = true)
    protected List<Induty> induty;

    /**
     * Gets the value of the address property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the address property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Address }
     * 
     * 
     */
    public List<Address> getAddress() {
        if (address == null) {
            address = new ArrayList<Address>();
        }
        return this.address;
    }

    /**
     * Gets the value of the founder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the founder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFounder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Founder }
     * 
     * 
     */
    public List<Founder> getFounder() {
        if (founder == null) {
            founder = new ArrayList<Founder>();
        }
        return this.founder;
    }

    /**
     * Gets the value of the general property.
     * 
     * @return
     *     possible object is
     *     {@link General }
     *     
     */
    public General getGeneral() {
        return general;
    }

    /**
     * Sets the value of the general property.
     * 
     * @param value
     *     allowed object is
     *     {@link General }
     *     
     */
    public void setGeneral(General value) {
        this.general = value;
    }

    /**
     * Gets the value of the generalR property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralR }
     *     
     */
    public GeneralR getGeneralR() {
        return generalR;
    }

    /**
     * Sets the value of the generalR property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralR }
     *     
     */
    public void setGeneralR(GeneralR value) {
        this.generalR = value;
    }

    /**
     * Gets the value of the induty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the induty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInduty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Induty }
     * 
     * 
     */
    public List<Induty> getInduty() {
        if (induty == null) {
            induty = new ArrayList<Induty>();
        }
        return this.induty;
    }

}
