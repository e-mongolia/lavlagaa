
package mn.gov.ema.emongolia.data.XypGovernment;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for notaryVehicleData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="notaryVehicleData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dataArray" type="{http://government.xyp.gov.mn/}notaryVehicleDetailData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notaryVehicleData", propOrder = {
    "dataArray"
})
public class NotaryVehicleData {

    @XmlElement(nillable = true)
    protected List<NotaryVehicleDetailData> dataArray;

    /**
     * Gets the value of the dataArray property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataArray property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataArray().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotaryVehicleDetailData }
     * 
     * 
     */
    public List<NotaryVehicleDetailData> getDataArray() {
        if (dataArray == null) {
            dataArray = new ArrayList<NotaryVehicleDetailData>();
        }
        return this.dataArray;
    }

}
