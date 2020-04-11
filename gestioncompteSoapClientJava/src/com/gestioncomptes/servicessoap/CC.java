
package com.gestioncomptes.servicessoap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour CC complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="CC">
 *   &lt;complexContent>
 *     &lt;extension base="{http://servicessoap.gestioncomptes.com/}compte">
 *       &lt;sequence>
 *         &lt;element name="decouvert" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CC", propOrder = {
    "decouvert"
})
public class CC
    extends Compte
{

    protected double decouvert;

    /**
     * Obtient la valeur de la propri�t� decouvert.
     * 
     */
    public double getDecouvert() {
        return decouvert;
    }

    /**
     * D�finit la valeur de la propri�t� decouvert.
     * 
     */
    public void setDecouvert(double value) {
        this.decouvert = value;
    }

}
