
package mn.gov.ema.emongolia.data.XypHealth;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pcrPositiveData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pcrPositiveData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listData" type="{http://health.xyp.gov.mn/}pcrPositiveDetailData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="totalPage" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="totalRow" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pcrPositiveData", propOrder = {
    "listData",
    "totalPage",
    "totalRow"
})
public class PcrPositiveData {

    @XmlElement(nillable = true)
    protected List<PcrPositiveDetailData> listData;
    protected int totalPage;
    protected int totalRow;

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
     * {@link PcrPositiveDetailData }
     * 
     * 
     */
    public List<PcrPositiveDetailData> getListData() {
        if (listData == null) {
            listData = new ArrayList<PcrPositiveDetailData>();
        }
        return this.listData;
    }

    /**
     * Gets the value of the totalPage property.
     * 
     */
    public int getTotalPage() {
        return totalPage;
    }

    /**
     * Sets the value of the totalPage property.
     * 
     */
    public void setTotalPage(int value) {
        this.totalPage = value;
    }

    /**
     * Gets the value of the totalRow property.
     * 
     */
    public int getTotalRow() {
        return totalRow;
    }

    /**
     * Sets the value of the totalRow property.
     * 
     */
    public void setTotalRow(int value) {
        this.totalRow = value;
    }

}
