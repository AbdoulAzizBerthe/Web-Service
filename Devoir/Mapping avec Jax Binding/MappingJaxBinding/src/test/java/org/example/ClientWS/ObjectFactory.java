
package org.example.ClientWS;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.example.ClientWS package. 
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

    private final static QName _ListOperation_QNAME = new QName("http://Web_Service.example.org/", "ListOperation");
    private final static QName _ListOperationResponse_QNAME = new QName("http://Web_Service.example.org/", "ListOperationResponse");
    private final static QName _Ajout_QNAME = new QName("http://Web_Service.example.org/", "ajout");
    private final static QName _AjoutResponse_QNAME = new QName("http://Web_Service.example.org/", "ajoutResponse");
    private final static QName _ToString_QNAME = new QName("http://Web_Service.example.org/", "toString");
    private final static QName _ToStringResponse_QNAME = new QName("http://Web_Service.example.org/", "toStringResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.example.ClientWS
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListOperation }
     * 
     * @return
     *     the new instance of {@link ListOperation }
     */
    public ListOperation createListOperation() {
        return new ListOperation();
    }

    /**
     * Create an instance of {@link ListOperationResponse }
     * 
     * @return
     *     the new instance of {@link ListOperationResponse }
     */
    public ListOperationResponse createListOperationResponse() {
        return new ListOperationResponse();
    }

    /**
     * Create an instance of {@link Ajout }
     * 
     * @return
     *     the new instance of {@link Ajout }
     */
    public Ajout createAjout() {
        return new Ajout();
    }

    /**
     * Create an instance of {@link AjoutResponse }
     * 
     * @return
     *     the new instance of {@link AjoutResponse }
     */
    public AjoutResponse createAjoutResponse() {
        return new AjoutResponse();
    }

    /**
     * Create an instance of {@link ToString }
     * 
     * @return
     *     the new instance of {@link ToString }
     */
    public ToString createToString() {
        return new ToString();
    }

    /**
     * Create an instance of {@link ToStringResponse }
     * 
     * @return
     *     the new instance of {@link ToStringResponse }
     */
    public ToStringResponse createToStringResponse() {
        return new ToStringResponse();
    }

    /**
     * Create an instance of {@link Operation }
     * 
     * @return
     *     the new instance of {@link Operation }
     */
    public Operation createOperation() {
        return new Operation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOperation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListOperation }{@code >}
     */
    @XmlElementDecl(namespace = "http://Web_Service.example.org/", name = "ListOperation")
    public JAXBElement<ListOperation> createListOperation(ListOperation value) {
        return new JAXBElement<>(_ListOperation_QNAME, ListOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOperationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListOperationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Web_Service.example.org/", name = "ListOperationResponse")
    public JAXBElement<ListOperationResponse> createListOperationResponse(ListOperationResponse value) {
        return new JAXBElement<>(_ListOperationResponse_QNAME, ListOperationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ajout }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Ajout }{@code >}
     */
    @XmlElementDecl(namespace = "http://Web_Service.example.org/", name = "ajout")
    public JAXBElement<Ajout> createAjout(Ajout value) {
        return new JAXBElement<>(_Ajout_QNAME, Ajout.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjoutResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AjoutResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Web_Service.example.org/", name = "ajoutResponse")
    public JAXBElement<AjoutResponse> createAjoutResponse(AjoutResponse value) {
        return new JAXBElement<>(_AjoutResponse_QNAME, AjoutResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToString }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ToString }{@code >}
     */
    @XmlElementDecl(namespace = "http://Web_Service.example.org/", name = "toString")
    public JAXBElement<ToString> createToString(ToString value) {
        return new JAXBElement<>(_ToString_QNAME, ToString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ToStringResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ToStringResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://Web_Service.example.org/", name = "toStringResponse")
    public JAXBElement<ToStringResponse> createToStringResponse(ToStringResponse value) {
        return new JAXBElement<>(_ToStringResponse_QNAME, ToStringResponse.class, null, value);
    }

}
