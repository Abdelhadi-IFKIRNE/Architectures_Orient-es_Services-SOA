
package proxy;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.0
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "bankAccountServiceService", targetNamespace = "http://ws/", wsdlLocation = "http://localhost:8989/bankAccounrService?wsdl")
public class BankAccountServiceService
    extends Service
{

    private final static URL BANKACCOUNTSERVICESERVICE_WSDL_LOCATION;
    private final static WebServiceException BANKACCOUNTSERVICESERVICE_EXCEPTION;
    private final static QName BANKACCOUNTSERVICESERVICE_QNAME = new QName("http://ws/", "bankAccountServiceService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8989/bankAccounrService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        BANKACCOUNTSERVICESERVICE_WSDL_LOCATION = url;
        BANKACCOUNTSERVICESERVICE_EXCEPTION = e;
    }

    public BankAccountServiceService() {
        super(__getWsdlLocation(), BANKACCOUNTSERVICESERVICE_QNAME);
    }

    public BankAccountServiceService(WebServiceFeature... features) {
        super(__getWsdlLocation(), BANKACCOUNTSERVICESERVICE_QNAME, features);
    }

    public BankAccountServiceService(URL wsdlLocation) {
        super(wsdlLocation, BANKACCOUNTSERVICESERVICE_QNAME);
    }

    public BankAccountServiceService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, BANKACCOUNTSERVICESERVICE_QNAME, features);
    }

    public BankAccountServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public BankAccountServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns BankAccountService
     */
    @WebEndpoint(name = "bankAccountServicePort")
    public BankAccountService getBankAccountServicePort() {
        return super.getPort(new QName("http://ws/", "bankAccountServicePort"), BankAccountService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns BankAccountService
     */
    @WebEndpoint(name = "bankAccountServicePort")
    public BankAccountService getBankAccountServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "bankAccountServicePort"), BankAccountService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (BANKACCOUNTSERVICESERVICE_EXCEPTION!= null) {
            throw BANKACCOUNTSERVICESERVICE_EXCEPTION;
        }
        return BANKACCOUNTSERVICESERVICE_WSDL_LOCATION;
    }

}
