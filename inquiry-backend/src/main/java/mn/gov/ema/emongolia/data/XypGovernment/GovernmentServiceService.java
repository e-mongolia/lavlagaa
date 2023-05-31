
package mn.gov.ema.emongolia.data.XypGovernment;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "GovernmentServiceService", targetNamespace = "http://government.xyp.gov.mn/", wsdlLocation = "https://xyp.gov.mn/government-service-1.5.0/ws?WSDL")
public class GovernmentServiceService
    extends Service
{

    private final static URL GOVERNMENTSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException GOVERNMENTSERVICESERVICE_EXCEPTION;
    private final static QName GOVERNMENTSERVICESERVICE_QNAME = new QName("http://government.xyp.gov.mn/", "GovernmentServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://xyp.gov.mn/government-service-1.5.0/ws?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GOVERNMENTSERVICESERVICE_WSDL_LOCATION = url;
        GOVERNMENTSERVICESERVICE_EXCEPTION = e;
    }

    public GovernmentServiceService() {
        super(__getWsdlLocation(), GOVERNMENTSERVICESERVICE_QNAME);
    }

    public GovernmentServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), GOVERNMENTSERVICESERVICE_QNAME, features);
    }

    public GovernmentServiceService(URL wsdlLocation) {
        super(wsdlLocation, GOVERNMENTSERVICESERVICE_QNAME);
    }

    public GovernmentServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, GOVERNMENTSERVICESERVICE_QNAME, features);
    }

    public GovernmentServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GovernmentServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns GovernmentService
     */
    @WebEndpoint(name = "GovernmentServicePort")
    public GovernmentService getGovernmentServicePort() {
        return super.getPort(new QName("http://government.xyp.gov.mn/", "GovernmentServicePort"), GovernmentService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GovernmentService
     */
    @WebEndpoint(name = "GovernmentServicePort")
    public GovernmentService getGovernmentServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://government.xyp.gov.mn/", "GovernmentServicePort"), GovernmentService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (GOVERNMENTSERVICESERVICE_EXCEPTION!= null) {
            throw GOVERNMENTSERVICESERVICE_EXCEPTION;
        }
        return GOVERNMENTSERVICESERVICE_WSDL_LOCATION;
    }

}
