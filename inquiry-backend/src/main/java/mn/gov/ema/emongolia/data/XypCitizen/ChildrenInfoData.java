
package mn.gov.ema.emongolia.data.XypCitizen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for childrenInfoData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="childrenInfoData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listData" type="{http://citizen.xyp.gov.mn/}childrenInfoDetailData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "childrenInfoData", propOrder = {
    "listData"
})
public class ChildrenInfoData {

    @XmlElement(nillable = true)
    protected List<ChildrenInfoDetailData> listData;

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
     * {@link ChildrenInfoDetailData }
     * 
     * 
     */
    public List<ChildrenInfoDetailData> getListData() {
        if (listData == null) {
            listData = new ArrayList<ChildrenInfoDetailData>();
        }
        return this.listData;
    }

}
