
package mn.gov.ema.emongolia.data.XypLegalEntity;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for legalEntityDataToTax complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="legalEntityDataToTax"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="address" type="{http://les.xyp.gov.mn/}addressDataToTax" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="branch" type="{http://les.xyp.gov.mn/}branchDataToTax" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="founder" type="{http://les.xyp.gov.mn/}founderDataToTax" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="general" type="{http://les.xyp.gov.mn/}generalDataToTax" minOccurs="0"/&gt;
 *         &lt;element name="generalR" type="{http://les.xyp.gov.mn/}generalRDataToTax" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="induty" type="{http://les.xyp.gov.mn/}indutyDataToTax" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "legalEntityDataToTax", propOrder = {
    "address",
    "branch",
    "founder",
    "general",
    "generalR",
    "induty"
})
public class LegalEntityDataToTax {

    @XmlElement(nillable = true)
    protected List<AddressDataToTax> address;
    @XmlElement(nillable = true)
    protected List<BranchDataToTax> branch;
    @XmlElement(nillable = true)
    protected List<FounderDataToTax> founder;
    protected GeneralDataToTax general;
    @XmlElement(nillable = true)
    protected List<GeneralRDataToTax> generalR;
    @XmlElement(nillable = true)
    protected List<IndutyDataToTax> induty;

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
     * {@link AddressDataToTax }
     * 
     * 
     */
    public List<AddressDataToTax> getAddress() {
        if (address == null) {
            address = new ArrayList<AddressDataToTax>();
        }
        return this.address;
    }

    /**
     * Gets the value of the branch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the branch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBranch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BranchDataToTax }
     * 
     * 
     */
    public List<BranchDataToTax> getBranch() {
        if (branch == null) {
            branch = new ArrayList<BranchDataToTax>();
        }
        return this.branch;
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
     * {@link FounderDataToTax }
     * 
     * 
     */
    public List<FounderDataToTax> getFounder() {
        if (founder == null) {
            founder = new ArrayList<FounderDataToTax>();
        }
        return this.founder;
    }

    /**
     * Gets the value of the general property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralDataToTax }
     *     
     */
    public GeneralDataToTax getGeneral() {
        return general;
    }

    /**
     * Sets the value of the general property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralDataToTax }
     *     
     */
    public void setGeneral(GeneralDataToTax value) {
        this.general = value;
    }

    /**
     * Gets the value of the generalR property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the generalR property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGeneralR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GeneralRDataToTax }
     * 
     * 
     */
    public List<GeneralRDataToTax> getGeneralR() {
        if (generalR == null) {
            generalR = new ArrayList<GeneralRDataToTax>();
        }
        return this.generalR;
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
     * {@link IndutyDataToTax }
     * 
     * 
     */
    public List<IndutyDataToTax> getInduty() {
        if (induty == null) {
            induty = new ArrayList<IndutyDataToTax>();
        }
        return this.induty;
    }

}
