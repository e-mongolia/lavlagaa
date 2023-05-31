
package mn.gov.ema.emongolia.data.XypEducation;

import mn.gov.ema.emongolia.data.AuthorizationData.AuthorizationData;
import mn.gov.ema.emongolia.data.AuthorizationData.AuthorizationEntity;
import mn.gov.ema.emongolia.data.ServiceResponse.ServiceResponse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mn.gov.itc.emongolia.data.XypEducation package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _WS400101UeeReferenceService_QNAME = new QName("http://education.xyp.gov.mn/", "WS400101_ueeReferenceService");
    private final static QName _WS400101UeeReferenceServiceResponse_QNAME = new QName("http://education.xyp.gov.mn/", "WS400101_ueeReferenceServiceResponse");
    private final static QName _WS400102KindergartenDescription_QNAME = new QName("http://education.xyp.gov.mn/", "WS400102_kindergartenDescription");
    private final static QName _WS400102KindergartenDescriptionResponse_QNAME = new QName("http://education.xyp.gov.mn/", "WS400102_kindergartenDescriptionResponse");
    private final static QName _WS400103ChildrenInfoByParentCivilId_QNAME = new QName("http://education.xyp.gov.mn/", "WS400103_childrenInfoByParentCivilId");
    private final static QName _WS400103ChildrenInfoByParentCivilIdResponse_QNAME = new QName("http://education.xyp.gov.mn/", "WS400103_childrenInfoByParentCivilIdResponse");
    private final static QName _WS400104SendKindergartenEnrollment_QNAME = new QName("http://education.xyp.gov.mn/", "WS400104_sendKindergartenEnrollment");
    private final static QName _WS400104SendKindergartenEnrollmentResponse_QNAME = new QName("http://education.xyp.gov.mn/", "WS400104_sendKindergartenEnrollmentResponse");
    private final static QName _WS400105CheckKindergartenEnrollment_QNAME = new QName("http://education.xyp.gov.mn/", "WS400105_checkKindergartenEnrollment");
    private final static QName _WS400105CheckKindergartenEnrollmentResponse_QNAME = new QName("http://education.xyp.gov.mn/", "WS400105_checkKindergartenEnrollmentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mn.gov.itc.emongolia.data.XypEducation
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WS400101UeeReferenceService }
     * 
     */
    public WS400101UeeReferenceService createWS400101UeeReferenceService() {
        return new WS400101UeeReferenceService();
    }

    /**
     * Create an instance of {@link WS400101UeeReferenceServiceResponse }
     * 
     */
    public WS400101UeeReferenceServiceResponse createWS400101UeeReferenceServiceResponse() {
        return new WS400101UeeReferenceServiceResponse();
    }

    /**
     * Create an instance of {@link WS400102KindergartenDescription }
     * 
     */
    public WS400102KindergartenDescription createWS400102KindergartenDescription() {
        return new WS400102KindergartenDescription();
    }

    /**
     * Create an instance of {@link WS400102KindergartenDescriptionResponse }
     * 
     */
    public WS400102KindergartenDescriptionResponse createWS400102KindergartenDescriptionResponse() {
        return new WS400102KindergartenDescriptionResponse();
    }

    /**
     * Create an instance of {@link WS400103ChildrenInfoByParentCivilId }
     * 
     */
    public WS400103ChildrenInfoByParentCivilId createWS400103ChildrenInfoByParentCivilId() {
        return new WS400103ChildrenInfoByParentCivilId();
    }

    /**
     * Create an instance of {@link WS400103ChildrenInfoByParentCivilIdResponse }
     * 
     */
    public WS400103ChildrenInfoByParentCivilIdResponse createWS400103ChildrenInfoByParentCivilIdResponse() {
        return new WS400103ChildrenInfoByParentCivilIdResponse();
    }

    /**
     * Create an instance of {@link WS400104SendKindergartenEnrollment }
     * 
     */
    public WS400104SendKindergartenEnrollment createWS400104SendKindergartenEnrollment() {
        return new WS400104SendKindergartenEnrollment();
    }

    /**
     * Create an instance of {@link WS400104SendKindergartenEnrollmentResponse }
     * 
     */
    public WS400104SendKindergartenEnrollmentResponse createWS400104SendKindergartenEnrollmentResponse() {
        return new WS400104SendKindergartenEnrollmentResponse();
    }

    /**
     * Create an instance of {@link WS400105CheckKindergartenEnrollment }
     * 
     */
    public WS400105CheckKindergartenEnrollment createWS400105CheckKindergartenEnrollment() {
        return new WS400105CheckKindergartenEnrollment();
    }

    /**
     * Create an instance of {@link WS400105CheckKindergartenEnrollmentResponse }
     * 
     */
    public WS400105CheckKindergartenEnrollmentResponse createWS400105CheckKindergartenEnrollmentResponse() {
        return new WS400105CheckKindergartenEnrollmentResponse();
    }

    /**
     * Create an instance of {@link RegistrationCivilIdRequestData }
     * 
     */
    public RegistrationCivilIdRequestData createRegistrationCivilIdRequestData() {
        return new RegistrationCivilIdRequestData();
    }

    /**
     * Create an instance of {@link RegistrationBasicRequest }
     * 
     */
    public RegistrationBasicRequest createRegistrationBasicRequest() {
        return new RegistrationBasicRequest();
    }

    /**
     * Create an instance of {@link ServiceRequest }
     * 
     */
    public ServiceRequest createServiceRequest() {
        return new ServiceRequest();
    }

    /**
     * Create an instance of {@link AuthorizationData }
     * 
     */
    public AuthorizationData createAuthorizationData() {
        return new AuthorizationData();
    }

    /**
     * Create an instance of {@link AuthorizationEntity }
     * 
     */
    public AuthorizationEntity createAuthorizationEntity() {
        return new AuthorizationEntity();
    }

    /**
     * Create an instance of {@link ServiceResponse }
     * 
     */
    public ServiceResponse createServiceResponse() {
        return new ServiceResponse();
    }

    /**
     * Create an instance of {@link ChildrenInfoByParentCivilIdData }
     * 
     */
    public ChildrenInfoByParentCivilIdData createChildrenInfoByParentCivilIdData() {
        return new ChildrenInfoByParentCivilIdData();
    }

    /**
     * Create an instance of {@link ChildrenInfoByParentCivilIdDetailData }
     * 
     */
    public ChildrenInfoByParentCivilIdDetailData createChildrenInfoByParentCivilIdDetailData() {
        return new ChildrenInfoByParentCivilIdDetailData();
    }

    /**
     * Create an instance of {@link CivilIdRequestData }
     * 
     */
    public CivilIdRequestData createCivilIdRequestData() {
        return new CivilIdRequestData();
    }

    /**
     * Create an instance of {@link CheckKindergartenEnrollmentData }
     * 
     */
    public CheckKindergartenEnrollmentData createCheckKindergartenEnrollmentData() {
        return new CheckKindergartenEnrollmentData();
    }

    /**
     * Create an instance of {@link UeeReferenceRequestData }
     * 
     */
    public UeeReferenceRequestData createUeeReferenceRequestData() {
        return new UeeReferenceRequestData();
    }

    /**
     * Create an instance of {@link UeeReferenceData }
     * 
     */
    public UeeReferenceData createUeeReferenceData() {
        return new UeeReferenceData();
    }

    /**
     * Create an instance of {@link UeeGlobalScoreDetail }
     * 
     */
    public UeeGlobalScoreDetail createUeeGlobalScoreDetail() {
        return new UeeGlobalScoreDetail();
    }

    /**
     * Create an instance of {@link UeeLocalScoreDetail }
     * 
     */
    public UeeLocalScoreDetail createUeeLocalScoreDetail() {
        return new UeeLocalScoreDetail();
    }

    /**
     * Create an instance of {@link RegnumRequestData }
     * 
     */
    public RegnumRequestData createRegnumRequestData() {
        return new RegnumRequestData();
    }

    /**
     * Create an instance of {@link KindergartenDescriptionData }
     * 
     */
    public KindergartenDescriptionData createKindergartenDescriptionData() {
        return new KindergartenDescriptionData();
    }

    /**
     * Create an instance of {@link KindergartenEnrollmentRequestData }
     * 
     */
    public KindergartenEnrollmentRequestData createKindergartenEnrollmentRequestData() {
        return new KindergartenEnrollmentRequestData();
    }

    /**
     * Create an instance of {@link KindergartenEnrollmentData }
     * 
     */
    public KindergartenEnrollmentData createKindergartenEnrollmentData() {
        return new KindergartenEnrollmentData();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS400101UeeReferenceService }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS400101UeeReferenceService }{@code >}
     */
    @XmlElementDecl(namespace = "http://education.xyp.gov.mn/", name = "WS400101_ueeReferenceService")
    public JAXBElement<WS400101UeeReferenceService> createWS400101UeeReferenceService(WS400101UeeReferenceService value) {
        return new JAXBElement<WS400101UeeReferenceService>(_WS400101UeeReferenceService_QNAME, WS400101UeeReferenceService.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS400101UeeReferenceServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS400101UeeReferenceServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://education.xyp.gov.mn/", name = "WS400101_ueeReferenceServiceResponse")
    public JAXBElement<WS400101UeeReferenceServiceResponse> createWS400101UeeReferenceServiceResponse(WS400101UeeReferenceServiceResponse value) {
        return new JAXBElement<WS400101UeeReferenceServiceResponse>(_WS400101UeeReferenceServiceResponse_QNAME, WS400101UeeReferenceServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS400102KindergartenDescription }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS400102KindergartenDescription }{@code >}
     */
    @XmlElementDecl(namespace = "http://education.xyp.gov.mn/", name = "WS400102_kindergartenDescription")
    public JAXBElement<WS400102KindergartenDescription> createWS400102KindergartenDescription(WS400102KindergartenDescription value) {
        return new JAXBElement<WS400102KindergartenDescription>(_WS400102KindergartenDescription_QNAME, WS400102KindergartenDescription.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS400102KindergartenDescriptionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS400102KindergartenDescriptionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://education.xyp.gov.mn/", name = "WS400102_kindergartenDescriptionResponse")
    public JAXBElement<WS400102KindergartenDescriptionResponse> createWS400102KindergartenDescriptionResponse(WS400102KindergartenDescriptionResponse value) {
        return new JAXBElement<WS400102KindergartenDescriptionResponse>(_WS400102KindergartenDescriptionResponse_QNAME, WS400102KindergartenDescriptionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS400103ChildrenInfoByParentCivilId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS400103ChildrenInfoByParentCivilId }{@code >}
     */
    @XmlElementDecl(namespace = "http://education.xyp.gov.mn/", name = "WS400103_childrenInfoByParentCivilId")
    public JAXBElement<WS400103ChildrenInfoByParentCivilId> createWS400103ChildrenInfoByParentCivilId(WS400103ChildrenInfoByParentCivilId value) {
        return new JAXBElement<WS400103ChildrenInfoByParentCivilId>(_WS400103ChildrenInfoByParentCivilId_QNAME, WS400103ChildrenInfoByParentCivilId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS400103ChildrenInfoByParentCivilIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS400103ChildrenInfoByParentCivilIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://education.xyp.gov.mn/", name = "WS400103_childrenInfoByParentCivilIdResponse")
    public JAXBElement<WS400103ChildrenInfoByParentCivilIdResponse> createWS400103ChildrenInfoByParentCivilIdResponse(WS400103ChildrenInfoByParentCivilIdResponse value) {
        return new JAXBElement<WS400103ChildrenInfoByParentCivilIdResponse>(_WS400103ChildrenInfoByParentCivilIdResponse_QNAME, WS400103ChildrenInfoByParentCivilIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS400104SendKindergartenEnrollment }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS400104SendKindergartenEnrollment }{@code >}
     */
    @XmlElementDecl(namespace = "http://education.xyp.gov.mn/", name = "WS400104_sendKindergartenEnrollment")
    public JAXBElement<WS400104SendKindergartenEnrollment> createWS400104SendKindergartenEnrollment(WS400104SendKindergartenEnrollment value) {
        return new JAXBElement<WS400104SendKindergartenEnrollment>(_WS400104SendKindergartenEnrollment_QNAME, WS400104SendKindergartenEnrollment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS400104SendKindergartenEnrollmentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS400104SendKindergartenEnrollmentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://education.xyp.gov.mn/", name = "WS400104_sendKindergartenEnrollmentResponse")
    public JAXBElement<WS400104SendKindergartenEnrollmentResponse> createWS400104SendKindergartenEnrollmentResponse(WS400104SendKindergartenEnrollmentResponse value) {
        return new JAXBElement<WS400104SendKindergartenEnrollmentResponse>(_WS400104SendKindergartenEnrollmentResponse_QNAME, WS400104SendKindergartenEnrollmentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS400105CheckKindergartenEnrollment }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS400105CheckKindergartenEnrollment }{@code >}
     */
    @XmlElementDecl(namespace = "http://education.xyp.gov.mn/", name = "WS400105_checkKindergartenEnrollment")
    public JAXBElement<WS400105CheckKindergartenEnrollment> createWS400105CheckKindergartenEnrollment(WS400105CheckKindergartenEnrollment value) {
        return new JAXBElement<WS400105CheckKindergartenEnrollment>(_WS400105CheckKindergartenEnrollment_QNAME, WS400105CheckKindergartenEnrollment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WS400105CheckKindergartenEnrollmentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link WS400105CheckKindergartenEnrollmentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://education.xyp.gov.mn/", name = "WS400105_checkKindergartenEnrollmentResponse")
    public JAXBElement<WS400105CheckKindergartenEnrollmentResponse> createWS400105CheckKindergartenEnrollmentResponse(WS400105CheckKindergartenEnrollmentResponse value) {
        return new JAXBElement<WS400105CheckKindergartenEnrollmentResponse>(_WS400105CheckKindergartenEnrollmentResponse_QNAME, WS400105CheckKindergartenEnrollmentResponse.class, null, value);
    }

}
