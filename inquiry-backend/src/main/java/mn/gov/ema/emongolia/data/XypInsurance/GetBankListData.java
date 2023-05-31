
package mn.gov.ema.emongolia.data.XypInsurance;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getBankListData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getBankListData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listdata" type="{http://insurance.xyp.gov.mn/}getBankListDetailData" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getBankListData", propOrder = {
    "listdata"
})
public class GetBankListData {

    @XmlElement(nillable = true)
    protected List<GetBankListDetailData> listdata;

    /**
     * Gets the value of the listdata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listdata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListdata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetBankListDetailData }
     * 
     * 
     */
    public List<GetBankListDetailData> getListdata() {
        if (listdata == null) {
            listdata = new ArrayList<GetBankListDetailData>();
        }
        return this.listdata;
    }

}
