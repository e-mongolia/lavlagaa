
package mn.gov.ema.emongolia.data.XypTransport;

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
 *         &lt;element name="auth" type="{http://transport.xyp.gov.mn/}authorizationData" minOccurs="0"/&gt;
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
    GetECDataRequestData.class,
    ServiceUpdatePenaltyPaymentRequestData.class,
    VehicleBorderPassRequestData.class,
    ServiceDriverLicenseInfoData.class,
    VehicleLimitedRequestData.class,
    VehicleListRequestData.class,
    GetImportExportRequestData.class,
    CitizenPenaltyListRequestData.class,
    VehicleInspectionRequestData.class,
    VehicleLegalEntityInfoRequestData.class,
    VehicleRequestData.class,
    TransportRequestData.class,
    ServiceVehicleImportInfoData.class,
    PermittedVehiclesListRequestData.class,
    InternationalDriverLicenseRequestData.class,
    CheckECLIcenseFromKioskRequestData.class,
    OrgRegnumRequestData.class,
    TransportCheckGPSPaymentRequestData.class,
    VehicleInspectionByPlateNoRequestData.class,
    OwnerRequestData.class,
    SpecialDriverRequestData.class,
    ServiceVehiclePenaltyInfoRequestData.class
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
