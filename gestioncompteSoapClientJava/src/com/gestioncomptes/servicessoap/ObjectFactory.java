
package com.gestioncomptes.servicessoap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.gestioncomptes.servicessoap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Verser_QNAME = new QName("http://servicessoap.gestioncomptes.com/", "verser");
    private final static QName _GetOperation_QNAME = new QName("http://servicessoap.gestioncomptes.com/", "getOperation");
    private final static QName _MontantRetraitEleveException_QNAME = new QName("http://servicessoap.gestioncomptes.com/", "MontantRetraitEleveException");
    private final static QName _RetirerResponse_QNAME = new QName("http://servicessoap.gestioncomptes.com/", "retirerResponse");
    private final static QName _VirementResponse_QNAME = new QName("http://servicessoap.gestioncomptes.com/", "virementResponse");
    private final static QName _Retirer_QNAME = new QName("http://servicessoap.gestioncomptes.com/", "retirer");
    private final static QName _Virement_QNAME = new QName("http://servicessoap.gestioncomptes.com/", "virement");
    private final static QName _GetOperationResponse_QNAME = new QName("http://servicessoap.gestioncomptes.com/", "getOperationResponse");
    private final static QName _VerserResponse_QNAME = new QName("http://servicessoap.gestioncomptes.com/", "verserResponse");
    private final static QName _GetCompteResponse_QNAME = new QName("http://servicessoap.gestioncomptes.com/", "getCompteResponse");
    private final static QName _GetCompte_QNAME = new QName("http://servicessoap.gestioncomptes.com/", "getCompte");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.gestioncomptes.servicessoap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCompte }
     * 
     */
    public GetCompte createGetCompte() {
        return new GetCompte();
    }

    /**
     * Create an instance of {@link GetCompteResponse }
     * 
     */
    public GetCompteResponse createGetCompteResponse() {
        return new GetCompteResponse();
    }

    /**
     * Create an instance of {@link Retirer }
     * 
     */
    public Retirer createRetirer() {
        return new Retirer();
    }

    /**
     * Create an instance of {@link RetirerResponse }
     * 
     */
    public RetirerResponse createRetirerResponse() {
        return new RetirerResponse();
    }

    /**
     * Create an instance of {@link VirementResponse }
     * 
     */
    public VirementResponse createVirementResponse() {
        return new VirementResponse();
    }

    /**
     * Create an instance of {@link GetOperationResponse }
     * 
     */
    public GetOperationResponse createGetOperationResponse() {
        return new GetOperationResponse();
    }

    /**
     * Create an instance of {@link VerserResponse }
     * 
     */
    public VerserResponse createVerserResponse() {
        return new VerserResponse();
    }

    /**
     * Create an instance of {@link Virement }
     * 
     */
    public Virement createVirement() {
        return new Virement();
    }

    /**
     * Create an instance of {@link GetOperation }
     * 
     */
    public GetOperation createGetOperation() {
        return new GetOperation();
    }

    /**
     * Create an instance of {@link MontantRetraitEleveException }
     * 
     */
    public MontantRetraitEleveException createMontantRetraitEleveException() {
        return new MontantRetraitEleveException();
    }

    /**
     * Create an instance of {@link Verser }
     * 
     */
    public Verser createVerser() {
        return new Verser();
    }

    /**
     * Create an instance of {@link CC }
     * 
     */
    public CC createCC() {
        return new CC();
    }

    /**
     * Create an instance of {@link CE }
     * 
     */
    public CE createCE() {
        return new CE();
    }

    /**
     * Create an instance of {@link Employe }
     * 
     */
    public Employe createEmploye() {
        return new Employe();
    }

    /**
     * Create an instance of {@link PageOperation }
     * 
     */
    public PageOperation createPageOperation() {
        return new PageOperation();
    }

    /**
     * Create an instance of {@link Client }
     * 
     */
    public Client createClient() {
        return new Client();
    }

    /**
     * Create an instance of {@link Operation }
     * 
     */
    public Operation createOperation() {
        return new Operation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Verser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicessoap.gestioncomptes.com/", name = "verser")
    public JAXBElement<Verser> createVerser(Verser value) {
        return new JAXBElement<Verser>(_Verser_QNAME, Verser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOperation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicessoap.gestioncomptes.com/", name = "getOperation")
    public JAXBElement<GetOperation> createGetOperation(GetOperation value) {
        return new JAXBElement<GetOperation>(_GetOperation_QNAME, GetOperation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MontantRetraitEleveException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicessoap.gestioncomptes.com/", name = "MontantRetraitEleveException")
    public JAXBElement<MontantRetraitEleveException> createMontantRetraitEleveException(MontantRetraitEleveException value) {
        return new JAXBElement<MontantRetraitEleveException>(_MontantRetraitEleveException_QNAME, MontantRetraitEleveException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetirerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicessoap.gestioncomptes.com/", name = "retirerResponse")
    public JAXBElement<RetirerResponse> createRetirerResponse(RetirerResponse value) {
        return new JAXBElement<RetirerResponse>(_RetirerResponse_QNAME, RetirerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VirementResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicessoap.gestioncomptes.com/", name = "virementResponse")
    public JAXBElement<VirementResponse> createVirementResponse(VirementResponse value) {
        return new JAXBElement<VirementResponse>(_VirementResponse_QNAME, VirementResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Retirer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicessoap.gestioncomptes.com/", name = "retirer")
    public JAXBElement<Retirer> createRetirer(Retirer value) {
        return new JAXBElement<Retirer>(_Retirer_QNAME, Retirer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Virement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicessoap.gestioncomptes.com/", name = "virement")
    public JAXBElement<Virement> createVirement(Virement value) {
        return new JAXBElement<Virement>(_Virement_QNAME, Virement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOperationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicessoap.gestioncomptes.com/", name = "getOperationResponse")
    public JAXBElement<GetOperationResponse> createGetOperationResponse(GetOperationResponse value) {
        return new JAXBElement<GetOperationResponse>(_GetOperationResponse_QNAME, GetOperationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicessoap.gestioncomptes.com/", name = "verserResponse")
    public JAXBElement<VerserResponse> createVerserResponse(VerserResponse value) {
        return new JAXBElement<VerserResponse>(_VerserResponse_QNAME, VerserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicessoap.gestioncomptes.com/", name = "getCompteResponse")
    public JAXBElement<GetCompteResponse> createGetCompteResponse(GetCompteResponse value) {
        return new JAXBElement<GetCompteResponse>(_GetCompteResponse_QNAME, GetCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicessoap.gestioncomptes.com/", name = "getCompte")
    public JAXBElement<GetCompte> createGetCompte(GetCompte value) {
        return new JAXBElement<GetCompte>(_GetCompte_QNAME, GetCompte.class, null, value);
    }

}
