
package de.hypoport.fil.example.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SoapDokStoreService", targetNamespace = "http://dokstore.documents.hypoport.de/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SoapDokStoreService {


    /**
     * 
     * @param appPassword
     * @param dokStoreDokumentId
     * @param gueltigBis
     * @param appCode
     * @param requestToken
     */
    @WebMethod
    @RequestWrapper(localName = "register", targetNamespace = "http://dokstore.documents.hypoport.de/", className = "de.hypoport.fil.example.soap.Register")
    @ResponseWrapper(localName = "registerResponse", targetNamespace = "http://dokstore.documents.hypoport.de/", className = "de.hypoport.fil.example.soap.RegisterResponse")
    public void register(
        @WebParam(name = "dokStoreDokumentId", targetNamespace = "")
        String dokStoreDokumentId,
        @WebParam(name = "gueltigBis", targetNamespace = "")
        XMLGregorianCalendar gueltigBis,
        @WebParam(name = "appCode", targetNamespace = "")
        String appCode,
        @WebParam(name = "appPassword", targetNamespace = "")
        String appPassword,
        @WebParam(name = "requestToken", targetNamespace = "")
        String requestToken);

    /**
     * 
     * @param appPassword
     * @param soapDokument
     * @param appCode
     * @param requestToken
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "dokStoreDokumentId", targetNamespace = "http://dokstore.documents.hypoport.de/")
    @RequestWrapper(localName = "putDokument", targetNamespace = "http://dokstore.documents.hypoport.de/", className = "de.hypoport.fil.example.soap.PutDokument")
    @ResponseWrapper(localName = "putDokumentResponse", targetNamespace = "http://dokstore.documents.hypoport.de/", className = "de.hypoport.fil.example.soap.PutDokumentResponse")
    public String putDokument(
        @WebParam(name = "soapDokument", targetNamespace = "")
        SoapDokStoreDokument soapDokument,
        @WebParam(name = "appCode", targetNamespace = "")
        String appCode,
        @WebParam(name = "appPassword", targetNamespace = "")
        String appPassword,
        @WebParam(name = "requestToken", targetNamespace = "")
        String requestToken);

    /**
     * 
     * @param appPassword
     * @param dokStoreDokumentId
     * @param appCode
     * @param requestToken
     */
    @WebMethod
    @RequestWrapper(localName = "unregister", targetNamespace = "http://dokstore.documents.hypoport.de/", className = "de.hypoport.fil.example.soap.Unregister")
    @ResponseWrapper(localName = "unregisterResponse", targetNamespace = "http://dokstore.documents.hypoport.de/", className = "de.hypoport.fil.example.soap.UnregisterResponse")
    public void unregister(
        @WebParam(name = "dokStoreDokumentId", targetNamespace = "")
        String dokStoreDokumentId,
        @WebParam(name = "appCode", targetNamespace = "")
        String appCode,
        @WebParam(name = "appPassword", targetNamespace = "")
        String appPassword,
        @WebParam(name = "requestToken", targetNamespace = "")
        String requestToken);

    /**
     * 
     * @param appPassword
     * @param appCode
     * @param requestToken
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "dokStoreDokumentId", targetNamespace = "http://dokstore.documents.hypoport.de/")
    @RequestWrapper(localName = "createEmptyDokument", targetNamespace = "http://dokstore.documents.hypoport.de/", className = "de.hypoport.fil.example.soap.CreateEmptyDokument")
    @ResponseWrapper(localName = "createEmptyDokumentResponse", targetNamespace = "http://dokstore.documents.hypoport.de/", className = "de.hypoport.fil.example.soap.CreateEmptyDokumentResponse")
    public String createEmptyDokument(
        @WebParam(name = "appCode", targetNamespace = "")
        String appCode,
        @WebParam(name = "appPassword", targetNamespace = "")
        String appPassword,
        @WebParam(name = "requestToken", targetNamespace = "")
        String requestToken);

    /**
     * 
     * @param appPassword
     * @param dokStoreDokumentId
     * @param appCode
     * @param requestToken
     * @return
     *     returns de.hypoport.fil.example.soap.SoapDokStoreDokument
     */
    @WebMethod
    @WebResult(name = "soapDokument", targetNamespace = "http://dokstore.documents.hypoport.de/")
    @RequestWrapper(localName = "getDokument", targetNamespace = "http://dokstore.documents.hypoport.de/", className = "de.hypoport.fil.example.soap.GetDokument")
    @ResponseWrapper(localName = "getDokumentResponse", targetNamespace = "http://dokstore.documents.hypoport.de/", className = "de.hypoport.fil.example.soap.GetDokumentResponse")
    public SoapDokStoreDokument getDokument(
        @WebParam(name = "dokStoreDokumentId", targetNamespace = "")
        String dokStoreDokumentId,
        @WebParam(name = "appCode", targetNamespace = "")
        String appCode,
        @WebParam(name = "appPassword", targetNamespace = "")
        String appPassword,
        @WebParam(name = "requestToken", targetNamespace = "")
        String requestToken);

    /**
     * 
     * @param appPassword
     * @param dokStoreDokumentId
     * @param soapDokument
     * @param appCode
     * @param requestToken
     */
    @WebMethod
    @RequestWrapper(localName = "putDokumentWithId", targetNamespace = "http://dokstore.documents.hypoport.de/", className = "de.hypoport.fil.example.soap.PutDokumentWithId")
    @ResponseWrapper(localName = "putDokumentWithIdResponse", targetNamespace = "http://dokstore.documents.hypoport.de/", className = "de.hypoport.fil.example.soap.PutDokumentWithIdResponse")
    public void putDokumentWithId(
        @WebParam(name = "soapDokument", targetNamespace = "")
        SoapDokStoreDokument soapDokument,
        @WebParam(name = "appCode", targetNamespace = "")
        String appCode,
        @WebParam(name = "appPassword", targetNamespace = "")
        String appPassword,
        @WebParam(name = "requestToken", targetNamespace = "")
        String requestToken,
        @WebParam(name = "dokStoreDokumentId", targetNamespace = "")
        String dokStoreDokumentId);

}
