
package mn.gov.ema.emongolia.data.XypProperty;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for propertyData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="propertyData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://property.xyp.gov.mn/}propertyBaseData"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="processList" type="{http://property.xyp.gov.mn/}propertyProcessData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "propertyData", propOrder = {
    "processList"
})
public class PropertyData
    extends PropertyBaseData
{

    @XmlElement(nillable = true)
    protected List<PropertyProcessData> processList;

    /**
     * Gets the value of the processList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyProcessData }
     * 
     * 
     */
    public List<PropertyProcessData> getProcessList() {
        if (processList == null) {
            processList = new ArrayList<PropertyProcessData>();
        }
        return this.processList;
    }

}
