
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


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

    private final static QName _Conversion_QNAME = new QName("http://ws/", "conversion");
    private final static QName _ConversionResponse_QNAME = new QName("http://ws/", "conversionResponse");
    private final static QName _GetAccount_QNAME = new QName("http://ws/", "getAccount");
    private final static QName _GetAccountResponse_QNAME = new QName("http://ws/", "getAccountResponse");
    private final static QName _GetAllAccount_QNAME = new QName("http://ws/", "getAllAccount");
    private final static QName _GetAllAccountResponse_QNAME = new QName("http://ws/", "getAllAccountResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Conversion }
     * 
     * @return
     *     the new instance of {@link Conversion }
     */
    public Conversion createConversion() {
        return new Conversion();
    }

    /**
     * Create an instance of {@link ConversionResponse }
     * 
     * @return
     *     the new instance of {@link ConversionResponse }
     */
    public ConversionResponse createConversionResponse() {
        return new ConversionResponse();
    }

    /**
     * Create an instance of {@link GetAccount }
     * 
     * @return
     *     the new instance of {@link GetAccount }
     */
    public GetAccount createGetAccount() {
        return new GetAccount();
    }

    /**
     * Create an instance of {@link GetAccountResponse }
     * 
     * @return
     *     the new instance of {@link GetAccountResponse }
     */
    public GetAccountResponse createGetAccountResponse() {
        return new GetAccountResponse();
    }

    /**
     * Create an instance of {@link GetAllAccount }
     * 
     * @return
     *     the new instance of {@link GetAllAccount }
     */
    public GetAllAccount createGetAllAccount() {
        return new GetAllAccount();
    }

    /**
     * Create an instance of {@link GetAllAccountResponse }
     * 
     * @return
     *     the new instance of {@link GetAllAccountResponse }
     */
    public GetAllAccountResponse createGetAllAccountResponse() {
        return new GetAllAccountResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     * @return
     *     the new instance of {@link Compte }
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Conversion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Conversion }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "conversion")
    public JAXBElement<Conversion> createConversion(Conversion value) {
        return new JAXBElement<>(_Conversion_QNAME, Conversion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConversionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "conversionResponse")
    public JAXBElement<ConversionResponse> createConversionResponse(ConversionResponse value) {
        return new JAXBElement<>(_ConversionResponse_QNAME, ConversionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccount }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAccount")
    public JAXBElement<GetAccount> createGetAccount(GetAccount value) {
        return new JAXBElement<>(_GetAccount_QNAME, GetAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAccountResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAccountResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAccountResponse")
    public JAXBElement<GetAccountResponse> createGetAccountResponse(GetAccountResponse value) {
        return new JAXBElement<>(_GetAccountResponse_QNAME, GetAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAccount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllAccount }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAllAccount")
    public JAXBElement<GetAllAccount> createGetAllAccount(GetAllAccount value) {
        return new JAXBElement<>(_GetAllAccount_QNAME, GetAllAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllAccountResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetAllAccountResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getAllAccountResponse")
    public JAXBElement<GetAllAccountResponse> createGetAllAccountResponse(GetAllAccountResponse value) {
        return new JAXBElement<>(_GetAllAccountResponse_QNAME, GetAllAccountResponse.class, null, value);
    }

}
