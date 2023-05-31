
package mn.gov.ema.emongolia.data.XypCitizen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for childrenBasicInfoData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="childrenBasicInfoData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listData" type="{http://citizen.xyp.gov.mn/}childData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "childrenBasicInfoData", propOrder = {
    "listData"
})
public class ChildrenBasicInfoData {

    @XmlElement(nillable = true)
    protected List<ChildData> listData;

    /**
     * Gets the value of the listData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildData }
     * 
     * 
     */
    public List<ChildData> getListData() {
        if (listData == null) {
            listData = new ArrayList<ChildData>();
        }
        return this.listData;
    }

}