
package webservice_producer.goodbyeworld;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the webservice_producer.goodbyeworld package. 
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

    private final static QName _SayAdios_QNAME = new QName("http://webservice_producer/goodbyeworld", "sayAdios");
    private final static QName _SayGoodbyeWithoutResponse_QNAME = new QName("http://webservice_producer/goodbyeworld", "sayGoodbyeWithoutResponse");
    private final static QName _SayGoodbye_QNAME = new QName("http://webservice_producer/goodbyeworld", "sayGoodbye");
    private final static QName _SayAdiosResponse_QNAME = new QName("http://webservice_producer/goodbyeworld", "sayAdiosResponse");
    private final static QName _SayGoodbyeResponse_QNAME = new QName("http://webservice_producer/goodbyeworld", "sayGoodbyeResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: webservice_producer.goodbyeworld
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SayAdiosResponse }
     * 
     */
    public SayAdiosResponse createSayAdiosResponse() {
        return new SayAdiosResponse();
    }

    /**
     * Create an instance of {@link SayGoodbyeWithoutResponse }
     * 
     */
    public SayGoodbyeWithoutResponse createSayGoodbyeWithoutResponse() {
        return new SayGoodbyeWithoutResponse();
    }

    /**
     * Create an instance of {@link SayGoodbyeResponse }
     * 
     */
    public SayGoodbyeResponse createSayGoodbyeResponse() {
        return new SayGoodbyeResponse();
    }

    /**
     * Create an instance of {@link SayAdios }
     * 
     */
    public SayAdios createSayAdios() {
        return new SayAdios();
    }

    /**
     * Create an instance of {@link SayGoodbye }
     * 
     */
    public SayGoodbye createSayGoodbye() {
        return new SayGoodbye();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayAdios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice_producer/goodbyeworld", name = "sayAdios")
    public JAXBElement<SayAdios> createSayAdios(SayAdios value) {
        return new JAXBElement<SayAdios>(_SayAdios_QNAME, SayAdios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayGoodbyeWithoutResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice_producer/goodbyeworld", name = "sayGoodbyeWithoutResponse")
    public JAXBElement<SayGoodbyeWithoutResponse> createSayGoodbyeWithoutResponse(SayGoodbyeWithoutResponse value) {
        return new JAXBElement<SayGoodbyeWithoutResponse>(_SayGoodbyeWithoutResponse_QNAME, SayGoodbyeWithoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayGoodbye }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice_producer/goodbyeworld", name = "sayGoodbye")
    public JAXBElement<SayGoodbye> createSayGoodbye(SayGoodbye value) {
        return new JAXBElement<SayGoodbye>(_SayGoodbye_QNAME, SayGoodbye.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayAdiosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice_producer/goodbyeworld", name = "sayAdiosResponse")
    public JAXBElement<SayAdiosResponse> createSayAdiosResponse(SayAdiosResponse value) {
        return new JAXBElement<SayAdiosResponse>(_SayAdiosResponse_QNAME, SayAdiosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayGoodbyeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice_producer/goodbyeworld", name = "sayGoodbyeResponse")
    public JAXBElement<SayGoodbyeResponse> createSayGoodbyeResponse(SayGoodbyeResponse value) {
        return new JAXBElement<SayGoodbyeResponse>(_SayGoodbyeResponse_QNAME, SayGoodbyeResponse.class, null, value);
    }

}
