
package de.hypoport.fil.example.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für putDokumentResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="putDokumentResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dokStoreDokumentId" type="{http://www.w3.org/2001/XMLSchema}string" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "putDokumentResponse", propOrder = {
    "dokStoreDokumentId"
})
public class PutDokumentResponse {

    @XmlElement(namespace = "http://dokstore.documents.hypoport.de/", required = true)
    protected String dokStoreDokumentId;

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

}
