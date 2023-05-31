
package mn.gov.ema.emongolia.data.XypProperty;

import mn.gov.ema.emongolia.data.AuthorizationData.AuthorizationData;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for serviceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="serviceRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="auth" type="{http://property.xyp.gov.mn/}authorizationData" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceRequest", propOrder = {
    "auth"
})
@XmlSeeAlso({
    LandOwningRequestData.class,
    PropertyRequestData.class,
    CheckLandMortgageRequestData.class,
    LandDirectionRequest.class,
    GetPropertyBasicRequestData.class,
    LandOwningInfoByPersonIdRequestData.class,
    PropertyNumberRequestData.class,
    PropertyAddressRequestData.class,
    ServicePropertyListRequestData.class,
    PropertyToObligateRequestData.class,
    LandRelatedInfoByParcelIdRequestData.class,
    LandInfoByPersonParcelIdsRequestData.class,
    LandOwningRequest.class,
    ServiceInsertHotelInfoRequestData.class,
    LandSuitorRequest.class,
    GetCadastralMapRequestData.class,
    ServiceIsPropertyCheckRequestData.class,
    LandSettlementActRequestData.class,
    PropertyInfoBetweenDateRequestData.class,
    AddressMoreRequestData.class,
    PropertyLandOwnerRequestData.class
})
public class ServiceRequest {

    protected AuthorizationData auth;

    /**
     * Gets the value of the auth property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationData }
     *     
     */
    public AuthorizationData getAuth() {
        return auth;
    }

    /**
     * Sets the value of the auth property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationData }
     *     
     */
    public void setAuth(AuthorizationData value) {
        this.auth = value;
    }

}
