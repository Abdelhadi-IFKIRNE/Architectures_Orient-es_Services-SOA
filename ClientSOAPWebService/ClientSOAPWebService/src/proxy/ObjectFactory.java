
package proxy;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
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

    private final static QName _GetOneAccountResponse_QNAME = new QName("http://WebServices/", "getOneAccountResponse");
    private final static QName _GetListOfAccountsResponse_QNAME = new QName("http://WebServices/", "getListOfAccountsResponse");
    private final static QName _ConversionEuroToDhResponse_QNAME = new QName("http://WebServices/", "conversionEuroToDhResponse");
    private final static QName _GetListOfAccounts_QNAME = new QName("http://WebServices/", "getListOfAccounts");
    private final static QName _ConversionEuroToDh_QNAME = new QName("http://WebServices/", "conversionEuroToDh");
    private final static QName _GetOneAccount_QNAME = new QName("http://WebServices/", "getOneAccount");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetOneAccountResponse }
     * 
     */
    public GetOneAccountResponse createGetOneAccountResponse() {
        return new GetOneAccountResponse();
    }

    /**
     * Create an instance of {@link GetListOfAccountsResponse }
     * 
     */
    public GetListOfAccountsResponse createGetListOfAccountsResponse() {
        return new GetListOfAccountsResponse();
    }

    /**
     * Create an instance of {@link GetListOfAccounts }
     * 
     */
    public GetListOfAccounts createGetListOfAccounts() {
        return new GetListOfAccounts();
    }

    /**
     * Create an instance of {@link ConversionEuroToDhResponse }
     * 
     */
    public ConversionEuroToDhResponse createConversionEuroToDhResponse() {
        return new ConversionEuroToDhResponse();
    }

    /**
     * Create an instance of {@link ConversionEuroToDh }
     * 
     */
    public ConversionEuroToDh createConversionEuroToDh() {
        return new ConversionEuroToDh();
    }

    /**
     * Create an instance of {@link GetOneAccount }
     * 
     */
    public GetOneAccount createGetOneAccount() {
        return new GetOneAccount();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOneAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "getOneAccountResponse")
    public JAXBElement<GetOneAccountResponse> createGetOneAccountResponse(GetOneAccountResponse value) {
        return new JAXBElement<GetOneAccountResponse>(_GetOneAccountResponse_QNAME, GetOneAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListOfAccountsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "getListOfAccountsResponse")
    public JAXBElement<GetListOfAccountsResponse> createGetListOfAccountsResponse(GetListOfAccountsResponse value) {
        return new JAXBElement<GetListOfAccountsResponse>(_GetListOfAccountsResponse_QNAME, GetListOfAccountsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDhResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "conversionEuroToDhResponse")
    public JAXBElement<ConversionEuroToDhResponse> createConversionEuroToDhResponse(ConversionEuroToDhResponse value) {
        return new JAXBElement<ConversionEuroToDhResponse>(_ConversionEuroToDhResponse_QNAME, ConversionEuroToDhResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetListOfAccounts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "getListOfAccounts")
    public JAXBElement<GetListOfAccounts> createGetListOfAccounts(GetListOfAccounts value) {
        return new JAXBElement<GetListOfAccounts>(_GetListOfAccounts_QNAME, GetListOfAccounts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDh }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "conversionEuroToDh")
    public JAXBElement<ConversionEuroToDh> createConversionEuroToDh(ConversionEuroToDh value) {
        return new JAXBElement<ConversionEuroToDh>(_ConversionEuroToDh_QNAME, ConversionEuroToDh.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOneAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebServices/", name = "getOneAccount")
    public JAXBElement<GetOneAccount> createGetOneAccount(GetOneAccount value) {
        return new JAXBElement<GetOneAccount>(_GetOneAccount_QNAME, GetOneAccount.class, null, value);
    }

}
