
package de.hypoport.fil.example.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für register complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="register">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dokStoreDokumentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gueltigBis" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
@XmlType(name = "register", propOrder = {
    "dokStoreDokumentId",
    "gueltigBis",
    "appCode",
    "appPassword",
    "requestToken"
})
public class Register {

    @XmlElement(required = true)
    protected String dokStoreDokumentId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar gueltigBis;
    @XmlElement(required = true)
    protected String appCode;
    @XmlElement(required = true)
    protected String appPassword;
    @XmlElement(required = true)
    protected String requestToken;

    /**
     * Ruft den Wert der dokStoreDokumentId-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDokStoreDokumentId() {
        return dokStoreDokumentId;
    }

    /**
     * Legt den Wert der dokStoreDokumentId-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDokStoreDokumentId(String value) {
        this.dokStoreDokumentId = value;
    }

    /**
     * Ruft den Wert der gueltigBis-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGueltigBis() {
        return gueltigBis;
    }

    /**
     * Legt den Wert der gueltigBis-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGueltigBis(XMLGregorianCalendar value) {
        this.gueltigBis = value;
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
