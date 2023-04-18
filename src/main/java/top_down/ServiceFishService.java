
package top_down;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.2
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "service.FishService", targetNamespace = "http://service/", wsdlLocation = "file:/home/maciej/IdeaProjects/Lista3RSI/src/main/resources/fishservice.wsdl")
public class ServiceFishService
    extends Service
{

    private final static URL SERVICEFISHSERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVICEFISHSERVICE_EXCEPTION;
    private final static QName SERVICEFISHSERVICE_QNAME = new QName("http://service/", "service.FishService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/home/maciej/IdeaProjects/Lista3RSI/src/main/resources/fishservice.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICEFISHSERVICE_WSDL_LOCATION = url;
        SERVICEFISHSERVICE_EXCEPTION = e;
    }

    public ServiceFishService() {
        super(__getWsdlLocation(), SERVICEFISHSERVICE_QNAME);
    }

    public ServiceFishService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICEFISHSERVICE_QNAME, features);
    }

    public ServiceFishService(URL wsdlLocation) {
        super(wsdlLocation, SERVICEFISHSERVICE_QNAME);
    }

    public ServiceFishService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICEFISHSERVICE_QNAME, features);
    }

    public ServiceFishService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServiceFishService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns FishService
     */
    @WebEndpoint(name = "FishServiceImplPort")
    public FishService getFishServiceImplPort() {
        return super.getPort(new QName("http://service/", "FishServiceImplPort"), FishService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns FishService
     */
    @WebEndpoint(name = "FishServiceImplPort")
    public FishService getFishServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service/", "FishServiceImplPort"), FishService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICEFISHSERVICE_EXCEPTION!= null) {
            throw SERVICEFISHSERVICE_EXCEPTION;
        }
        return SERVICEFISHSERVICE_WSDL_LOCATION;
    }

}