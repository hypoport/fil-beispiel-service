
package de.hypoport.fil.example.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für putDokument complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="putDokument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="soapDokument" type="{http://dokstore.documents.hypoport.de/}soapDokStoreDokument"/>
 *         &lt;element name="appCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="appPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="requestToken" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "putDokument", propOrder = {
    "soapDokument",
    "appCode",
    "appPassword",
    "requestToken"
})
public class PutDokument {

    @XmlElement(required = true)
    protected SoapDokStoreDokument soapDokument;
    @XmlElement(required = true)
    protected String appCode;
    @XmlElement(required = true)
    protected String appPassword;
    @XmlElement(required = true)
    protected String requestToken;

    /**
     * Ruft den Wert der soapDokument-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link SoapDokStoreDokument }
     *     
     */
    public SoapDokStoreDokument getSoapDokument() {
        return soapDokument;
    }

    /**
     * Legt den Wert der soapDokument-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link SoapDokStoreDokument }
     *     
     */
    public void setSoapDokument(SoapDokStoreDokument value) {
        this.soapDokument = value;
    }

    /**
     * Ruft den Wert der appCode-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * Legt den Wert der appCode-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppCode(String value) {
        this.appCode = value;
    }

    /**
     * Ruft den Wert der appPassword-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppPassword() {
        return appPassword;
    }

    /**
     * Legt den Wert der appPassword-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppPassword(String value) {
        this.appPassword = value;
    }

    /**
     * Ruft den Wert der requestToken-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestToken() {
        return requestToken;
    }

    /**
     * Legt den Wert der requestToken-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestToken(String value) {
        this.requestToken = value;
    }

}
