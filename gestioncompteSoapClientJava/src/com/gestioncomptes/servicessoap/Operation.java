
package com.gestioncomptes.servicessoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java pour operation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="operation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="compte" type="{http://servicessoap.gestioncomptes.com/}compte" minOccurs="0"/>
 *         &lt;element name="dateOperation" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="employe" type="{http://servicessoap.gestioncomptes.com/}employe" minOccurs="0"/>
 *         &lt;element name="montant" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="numeroOperation" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "operation", propOrder = {
    "compte",
    "dateOperation",
    "employe",
    "montant",
    "numeroOperation"
})
public class Operation {

    protected Compte compte;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOperation;
    protected Employe employe;
    protected double montant;
    protected Long numeroOperation;

    /**
     * Obtient la valeur de la propriété compte.
     * 
     * @return
     *     possible object is
     *     {@link Compte }
     *     
     */
    public Compte getCompte() {
        return compte;
    }

    /**
     * Définit la valeur de la propriété compte.
     * 
     * @param value
     *     allowed object is
     *     {@link Compte }
     *     
     */
    public void setCompte(Compte value) {
        this.compte = value;
    }

    /**
     * Obtient la valeur de la propriété dateOperation.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOperation() {
        return dateOperation;
    }

    /**
     * Définit la valeur de la propriété dateOperation.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOperation(XMLGregorianCalendar value) {
        this.dateOperation = value;
    }

    /**
     * Obtient la valeur de la propriété employe.
     * 
     * @return
     *     possible object is
     *     {@link Employe }
     *     
     */
    public Employe getEmploye() {
        return employe;
    }

    /**
     * Définit la valeur de la propriété employe.
     * 
     * @param value
     *     allowed object is
     *     {@link Employe }
     *     
     */
    public void setEmploye(Employe value) {
        this.employe = value;
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
     * Obtient la valeur de la propriété numeroOperation.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getNumeroOperation() {
        return numeroOperation;
    }

    /**
     * Définit la valeur de la propriété numeroOperation.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setNumeroOperation(Long value) {
        this.numeroOperation = value;
    }

}
