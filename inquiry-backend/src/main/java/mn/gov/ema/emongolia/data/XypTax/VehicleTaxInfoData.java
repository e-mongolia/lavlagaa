
package mn.gov.ema.emongolia.data.XypTax;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vehicleTaxInfoData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vehicleTaxInfoData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="lstVehicleTaxData" type="{http://tax.xyp.gov.mn/}vehicleTaxInfoDataDetial" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vehicleTaxInfoData", propOrder = {
    "lstVehicleTaxData"
})
public class VehicleTaxInfoData {

    @XmlElement(nillable = true)
    protected List<VehicleTaxInfoDataDetial> lstVehicleTaxData;

    /**
     * Gets the value of the lstVehicleTaxData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lstVehicleTaxData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLstVehicleTaxData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleTaxInfoDataDetial }
     * 
     * 
     */
    public List<VehicleTaxInfoDataDetial> getLstVehicleTaxData() {
        if (lstVehicleTaxData == null) {
            lstVehicleTaxData = new ArrayList<VehicleTaxInfoDataDetial>();
        }
        return this.lstVehicleTaxData;
    }

}
