
package com.gestioncomptes.servicessoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour virement complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="virement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codeCcodeCompteSourceompte" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codeCompteDestination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="montant" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="codeEmploye" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "virement", propOrder = {
    "codeCcodeCompteSourceompte",
    "codeCompteDestination",
    "montant",
    "codeEmploye"
})
public class Virement {

    protected String codeCcodeCompteSourceompte;
    protected String codeCompteDestination;
    protected double montant;
    protected Long codeEmploye;

    /**
     * Obtient la valeur de la propriété codeCcodeCompteSourceompte.
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
     * Définit la valeur de la propriété codeCcodeCompteSourceompte.
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
     * Obtient la valeur de la propriété codeCompteDestination.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeCompteDestination() {
        return codeCompteDestination;
    }

    /**
     * Définit la valeur de la propriété codeCompteDestination.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeCompteDestination(String value) {
        this.codeCompteDestination = value;
    }

    /**
     * Obtient la valeur de la propriété montant.
     * 
     */
    public double getMontant() {
        return montant;
    }

    /**
     * Définit la valeur de la propriété montant.
     * 
     */
    public void setMontant(double value) {
        this.montant = value;
    }

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

}
