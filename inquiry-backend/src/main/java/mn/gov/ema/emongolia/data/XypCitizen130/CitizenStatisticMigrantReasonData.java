
package mn.gov.ema.emongolia.data.XypCitizen130;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for citizenStatisticMigrantReasonData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="citizenStatisticMigrantReasonData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listData" type="{http://citizen.xyp.gov.mn/}citizenStatisticMigrantReasonDetailData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "citizenStatisticMigrantReasonData", propOrder = {
    "listData"
})
public class CitizenStatisticMigrantReasonData {

    @XmlElement(nillable = true)
    protected List<CitizenStatisticMigrantReasonDetailData> listData;

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
     * {@link CitizenStatisticMigrantReasonDetailData }
     * 
     * 
     */
    public List<CitizenStatisticMigrantReasonDetailData> getListData() {
        if (listData == null) {
            listData = new ArrayList<CitizenStatisticMigrantReasonDetailData>();
        }
        return this.listData;
    }

}
