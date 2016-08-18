
package de.hypoport.fil.example.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.hypoport.fil.example.soap package. 
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

    private final static QName _CreateEmptyDokumentResponse_QNAME = new QName("http://dokstore.documents.hypoport.de/", "createEmptyDokumentResponse");
    private final static QName _PutDokumentWithIdResponse_QNAME = new QName("http://dokstore.documents.hypoport.de/", "putDokumentWithIdResponse");
    private final static QName _Register_QNAME = new QName("http://dokstore.documents.hypoport.de/", "register");
    private final static QName _PutDokument_QNAME = new QName("http://dokstore.documents.hypoport.de/", "putDokument");
    private final static QName _Unregister_QNAME = new QName("http://dokstore.documents.hypoport.de/", "unregister");
    private final static QName _RegisterResponse_QNAME = new QName("http://dokstore.documents.hypoport.de/", "registerResponse");
    private final static QName _CreateEmptyDokument_QNAME = new QName("http://dokstore.documents.hypoport.de/", "createEmptyDokument");
    private final static QName _GetDokument_QNAME = new QName("http://dokstore.documents.hypoport.de/", "getDokument");
    private final static QName _PutDokumentResponse_QNAME = new QName("http://dokstore.documents.hypoport.de/", "putDokumentResponse");
    private final static QName _PutDokumentWithId_QNAME = new QName("http://dokstore.documents.hypoport.de/", "putDokumentWithId");
    private final static QName _GetDokumentResponse_QNAME = new QName("http://dokstore.documents.hypoport.de/", "getDokumentResponse");
    private final static QName _UnregisterResponse_QNAME = new QName("http://dokstore.documents.hypoport.de/", "unregisterResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.hypoport.fil.example.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PutDokumentWithId }
     * 
     */
    public PutDokumentWithId createPutDokumentWithId() {
        return new PutDokumentWithId();
    }

    /**
     * Create an instance of {@link GetDokumentResponse }
     * 
     */
    public GetDokumentResponse createGetDokumentResponse() {
        return new GetDokumentResponse();
    }

    /**
     * Create an instance of {@link UnregisterResponse }
     * 
     */
    public UnregisterResponse createUnregisterResponse() {
        return new UnregisterResponse();
    }

    /**
     * Create an instance of {@link CreateEmptyDokument }
     * 
     */
    public CreateEmptyDokument createCreateEmptyDokument() {
        return new CreateEmptyDokument();
    }

    /**
     * Create an instance of {@link GetDokument }
     * 
     */
    public GetDokument createGetDokument() {
        return new GetDokument();
    }

    /**
     * Create an instance of {@link PutDokumentResponse }
     * 
     */
    public PutDokumentResponse createPutDokumentResponse() {
        return new PutDokumentResponse();
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link Unregister }
     * 
     */
    public Unregister createUnregister() {
        return new Unregister();
    }

    /**
     * Create an instance of {@link PutDokument }
     * 
     */
    public PutDokument createPutDokument() {
        return new PutDokument();
    }

    /**
     * Create an instance of {@link CreateEmptyDokumentResponse }
     * 
     */
    public CreateEmptyDokumentResponse createCreateEmptyDokumentResponse() {
        return new CreateEmptyDokumentResponse();
    }

    /**
     * Create an instance of {@link PutDokumentWithIdResponse }
     * 
     */
    public PutDokumentWithIdResponse createPutDokumentWithIdResponse() {
        return new PutDokumentWithIdResponse();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link SoapDokStoreDokument }
     * 
     */
    public SoapDokStoreDokument createSoapDokStoreDokument() {
        return new SoapDokStoreDokument();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEmptyDokumentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dokstore.documents.hypoport.de/", name = "createEmptyDokumentResponse")
    public JAXBElement<CreateEmptyDokumentResponse> createCreateEmptyDokumentResponse(CreateEmptyDokumentResponse value) {
        return new JAXBElement<CreateEmptyDokumentResponse>(_CreateEmptyDokumentResponse_QNAME, CreateEmptyDokumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutDokumentWithIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dokstore.documents.hypoport.de/", name = "putDokumentWithIdResponse")
    public JAXBElement<PutDokumentWithIdResponse> createPutDokumentWithIdResponse(PutDokumentWithIdResponse value) {
        return new JAXBElement<PutDokumentWithIdResponse>(_PutDokumentWithIdResponse_QNAME, PutDokumentWithIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Register }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dokstore.documents.hypoport.de/", name = "register")
    public JAXBElement<Register> createRegister(Register value) {
        return new JAXBElement<Register>(_Register_QNAME, Register.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutDokument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dokstore.documents.hypoport.de/", name = "putDokument")
    public JAXBElement<PutDokument> createPutDokument(PutDokument value) {
        return new JAXBElement<PutDokument>(_PutDokument_QNAME, PutDokument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Unregister }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dokstore.documents.hypoport.de/", name = "unregister")
    public JAXBElement<Unregister> createUnregister(Unregister value) {
        return new JAXBElement<Unregister>(_Unregister_QNAME, Unregister.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dokstore.documents.hypoport.de/", name = "registerResponse")
    public JAXBElement<RegisterResponse> createRegisterResponse(RegisterResponse value) {
        return new JAXBElement<RegisterResponse>(_RegisterResponse_QNAME, RegisterResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateEmptyDokument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dokstore.documents.hypoport.de/", name = "createEmptyDokument")
    public JAXBElement<CreateEmptyDokument> createCreateEmptyDokument(CreateEmptyDokument value) {
        return new JAXBElement<CreateEmptyDokument>(_CreateEmptyDokument_QNAME, CreateEmptyDokument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDokument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dokstore.documents.hypoport.de/", name = "getDokument")
    public JAXBElement<GetDokument> createGetDokument(GetDokument value) {
        return new JAXBElement<GetDokument>(_GetDokument_QNAME, GetDokument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutDokumentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dokstore.documents.hypoport.de/", name = "putDokumentResponse")
    public JAXBElement<PutDokumentResponse> createPutDokumentResponse(PutDokumentResponse value) {
        return new JAXBElement<PutDokumentResponse>(_PutDokumentResponse_QNAME, PutDokumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PutDokumentWithId }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dokstore.documents.hypoport.de/", name = "putDokumentWithId")
    public JAXBElement<PutDokumentWithId> createPutDokumentWithId(PutDokumentWithId value) {
        return new JAXBElement<PutDokumentWithId>(_PutDokumentWithId_QNAME, PutDokumentWithId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDokumentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dokstore.documents.hypoport.de/", name = "getDokumentResponse")
    public JAXBElement<GetDokumentResponse> createGetDokumentResponse(GetDokumentResponse value) {
        return new JAXBElement<GetDokumentResponse>(_GetDokumentResponse_QNAME, GetDokumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnregisterResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dokstore.documents.hypoport.de/", name = "unregisterResponse")
    public JAXBElement<UnregisterResponse> createUnregisterResponse(UnregisterResponse value) {
        return new JAXBElement<UnregisterResponse>(_UnregisterResponse_QNAME, UnregisterResponse.class, null, value);
    }

}
