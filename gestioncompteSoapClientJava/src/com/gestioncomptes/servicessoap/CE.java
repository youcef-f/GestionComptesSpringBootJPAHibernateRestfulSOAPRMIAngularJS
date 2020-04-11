
package com.gestioncomptes.servicessoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CE complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CE">
 *   &lt;complexContent>
 *     &lt;extension base="{http://servicessoap.gestioncomptes.com/}compte">
 *       &lt;sequence>
 *         &lt;element name="taux" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CE", propOrder = {
    "taux"
})
public class CE
    extends Compte
{

    protected double taux;

    /**
     * Obtient la valeur de la propriété taux.
     * 
     */
    public double getTaux() {
        return taux;
    }

    /**
     * Définit la valeur de la propriété taux.
     * 
     */
    public void setTaux(double value) {
        this.taux = value;
    }

}
