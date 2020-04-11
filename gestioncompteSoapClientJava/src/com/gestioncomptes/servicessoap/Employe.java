
package com.gestioncomptes.servicessoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour employe complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="employe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeEmploye" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="nomEmploye" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "employe", propOrder = {
    "codeEmploye",
    "nomEmploye"
})
public class Employe {

    protected Long codeEmploye;
    protected String nomEmploye;

    /**
     * Obtient la valeur de la propriété codeEmploye.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCodeEmploye() {
        return codeEmploye;
    }

    /**
     * Définit la valeur de la propriété codeEmploye.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCodeEmploye(Long value) {
        this.codeEmploye = value;
    }

    /**
     * Obtient la valeur de la propriété nomEmploye.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomEmploye() {
        return nomEmploye;
    }

    /**
     * Définit la valeur de la propriété nomEmploye.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomEmploye(String value) {
        this.nomEmploye = value;
    }

}
