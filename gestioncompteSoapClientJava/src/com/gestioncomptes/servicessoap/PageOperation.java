
package com.gestioncomptes.servicessoap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour pageOperation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="pageOperation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nombreOperationsInPage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="operations" type="{http://servicessoap.gestioncomptes.com/}operation" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="pageCourant" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalOperations" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalPages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pageOperation", propOrder = {
    "nombreOperationsInPage",
    "operations",
    "pageCourant",
    "totalOperations",
    "totalPages"
})
public class PageOperation {

    protected int nombreOperationsInPage;
    @XmlElement(nillable = true)
    protected List<Operation> operations;
    protected int pageCourant;
    protected int totalOperations;
    protected int totalPages;

    /**
     * Obtient la valeur de la propriété nombreOperationsInPage.
     * 
     */
    public int getNombreOperationsInPage() {
        return nombreOperationsInPage;
    }

    /**
     * Définit la valeur de la propriété nombreOperationsInPage.
     * 
     */
    public void setNombreOperationsInPage(int value) {
        this.nombreOperationsInPage = value;
    }

    /**
     * Gets the value of the operations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Operation }
     * 
     * 
     */
    public List<Operation> getOperations() {
        if (operations == null) {
            operations = new ArrayList<Operation>();
        }
        return this.operations;
    }

    /**
     * Obtient la valeur de la propriété pageCourant.
     * 
     */
    public int getPageCourant() {
        return pageCourant;
    }

    /**
     * Définit la valeur de la propriété pageCourant.
     * 
     */
    public void setPageCourant(int value) {
        this.pageCourant = value;
    }

    /**
     * Obtient la valeur de la propriété totalOperations.
     * 
     */
    public int getTotalOperations() {
        return totalOperations;
    }

    /**
     * Définit la valeur de la propriété totalOperations.
     * 
     */
    public void setTotalOperations(int value) {
        this.totalOperations = value;
    }

    /**
     * Obtient la valeur de la propriété totalPages.
     * 
     */
    public int getTotalPages() {
        return totalPages;
    }

    /**
     * Définit la valeur de la propriété totalPages.
     * 
     */
    public void setTotalPages(int value) {
        this.totalPages = value;
    }

}
