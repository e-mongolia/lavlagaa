
package mn.gov.ema.emongolia.data.XypMeta;

import mn.gov.ema.emongolia.data.ServiceResponse.ServiceResponse;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MetaService", targetNamespace = "http://meta.xyp.gov.mn/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MetaService {


    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypMeta.ServiceResponse
     */
    @WebMethod(operationName = "WS100008_registerOTPRequest")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100008_registerOTPRequest", targetNamespace = "http://meta.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypMeta.WS100008RegisterOTPRequest")
    @ResponseWrapper(localName = "WS100008_registerOTPRequestResponse", targetNamespace = "http://meta.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypMeta.WS100008RegisterOTPRequestResponse")
    public ServiceResponse ws100008RegisterOTPRequest(
        @WebParam(name = "request", targetNamespace = "")
        RegisterOTPRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypMeta.ServiceResponse
     */
    @WebMethod(operationName = "WS100002_mock")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100002_mock", targetNamespace = "http://meta.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypMeta.WS100002Mock")
    @ResponseWrapper(localName = "WS100002_mockResponse", targetNamespace = "http://meta.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypMeta.WS100002MockResponse")
    public ServiceResponse ws100002Mock(
        @WebParam(name = "request", targetNamespace = "")
        MockRequestData request);

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypMeta.ServiceResponse
     */
    @WebMethod(operationName = "WS100009_checkOtp")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100009_checkOtp", targetNamespace = "http://meta.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypMeta.WS100009CheckOtp")
    @ResponseWrapper(localName = "WS100009_checkOtpResponse", targetNamespace = "http://meta.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypMeta.WS100009CheckOtpResponse")
    public ServiceResponse ws100009CheckOtp(
        @WebParam(name = "request", targetNamespace = "")
        CheckOtpRequestData request);

    /**
     * 
     * @return
     *     returns mn.gov.itc.emongolia.data.XypMeta.ServiceResponse
     */
    @WebMethod(operationName = "WS100001_listAccess")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100001_listAccess", targetNamespace = "http://meta.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypMeta.WS100001ListAccess")
    @ResponseWrapper(localName = "WS100001_listAccessResponse", targetNamespace = "http://meta.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypMeta.WS100001ListAccessResponse")
    public ServiceResponse ws100001ListAccess();

    /**
     * 
     * @param request
     * @return
     *     returns mn.gov.itc.emongolia.data.XypMeta.ServiceResponse
     */
    @WebMethod(operationName = "WS100003_getLog")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "WS100003_getLog", targetNamespace = "http://meta.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypMeta.WS100003GetLog")
    @ResponseWrapper(localName = "WS100003_getLogResponse", targetNamespace = "http://meta.xyp.gov.mn/", className = "mn.gov.itc.emongolia.data.XypMeta.WS100003GetLogResponse")
    public ServiceResponse ws100003GetLog(
        @WebParam(name = "request", targetNamespace = "")
        LogRequestData request);

}