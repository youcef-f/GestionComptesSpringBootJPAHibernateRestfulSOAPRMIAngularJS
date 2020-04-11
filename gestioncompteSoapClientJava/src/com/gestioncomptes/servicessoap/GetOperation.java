
package com.gestioncomptes.servicessoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getOperation complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="getOperation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeCcodeCompteSourceompte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="page" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="size" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOperation", propOrder = {
    "codeCcodeCompteSourceompte",
    "page",
    "size"
})
public class GetOperation {

    protected String codeCcodeCompteSourceompte;
    protected int page;
    protected int size;

    /**
     * Obtient la valeur de la propri�t� codeCcodeCompteSourceompte.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeCcodeCompteSourceompte() {
        return codeCcodeCompteSourceompte;
    }

    /**
     * D�finit la valeur de la propri�t� codeCcodeCompteSourceompte.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeCcodeCompteSourceompte(String value) {
        this.codeCcodeCompteSourceompte = value;
    }

    /**
     * Obtient la valeur de la propri�t� page.
     * 
     */
    public int getPage() {
        return page;
    }

    /**
     * D�finit la valeur de la propri�t� page.
     * 
     */
    public void setPage(int value) {
        this.page = value;
    }

    /**
     * Obtient la valeur de la propri�t� size.
     * 
     */
    public int getSize() {
        return size;
    }

    /**
     * D�finit la valeur de la propri�t� size.
     * 
     */
    public void setSize(int value) {
        this.size = value;
    }

}
