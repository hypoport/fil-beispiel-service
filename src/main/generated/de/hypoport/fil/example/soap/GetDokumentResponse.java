
package de.hypoport.fil.example.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für getDokumentResponse complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="getDokumentResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="soapDokument" type="{http://dokstore.documents.hypoport.de/}soapDokStoreDokument" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getDokumentResponse", propOrder = {
    "soapDokument"
})
public class GetDokumentResponse {

    @XmlElement(namespace = "http://dokstore.documents.hypoport.de/")
    protected SoapDokStoreDokument soapDokument;

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

}
