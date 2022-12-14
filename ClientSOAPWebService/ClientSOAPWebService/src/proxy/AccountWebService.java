
package proxy;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "AccountWebService", targetNamespace = "http://WebServices/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AccountWebService {


    /**
     * 
     * @param code
     * @return
     *     returns proxy.Compte
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getOneAccount", targetNamespace = "http://WebServices/", className = "proxy.GetOneAccount")
    @ResponseWrapper(localName = "getOneAccountResponse", targetNamespace = "http://WebServices/", className = "proxy.GetOneAccountResponse")
    @Action(input = "http://WebServices/AccountWebService/getOneAccountRequest", output = "http://WebServices/AccountWebService/getOneAccountResponse")
    public Compte getOneAccount(
        @WebParam(name = "code", targetNamespace = "")
        String code);

    /**
     * 
     * @param amount
     * @return
     *     returns double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "conversionEuroToDh", targetNamespace = "http://WebServices/", className = "proxy.ConversionEuroToDh")
    @ResponseWrapper(localName = "conversionEuroToDhResponse", targetNamespace = "http://WebServices/", className = "proxy.ConversionEuroToDhResponse")
    @Action(input = "http://WebServices/AccountWebService/conversionEuroToDhRequest", output = "http://WebServices/AccountWebService/conversionEuroToDhResponse")
    public double conversionEuroToDh(
        @WebParam(name = "amount", targetNamespace = "")
        double amount);

    /**
     * 
     * @return
     *     returns java.util.List<proxy.Compte>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getListOfAccounts", targetNamespace = "http://WebServices/", className = "proxy.GetListOfAccounts")
    @ResponseWrapper(localName = "getListOfAccountsResponse", targetNamespace = "http://WebServices/", className = "proxy.GetListOfAccountsResponse")
    @Action(input = "http://WebServices/AccountWebService/getListOfAccountsRequest", output = "http://WebServices/AccountWebService/getListOfAccountsResponse")
    public List<Compte> getListOfAccounts();

}
