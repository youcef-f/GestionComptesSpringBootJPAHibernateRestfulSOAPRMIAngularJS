package com.gestioncomptes.servicessoap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gestioncomptes.entities.Compte;
import com.gestioncomptes.metier.ICompteMetier;
import com.gestioncomptes.metier.IOperationMetier;
import com.gestioncomptes.metier.PageOperation;
import com.gestioncomptes.metier.exception.MontantRetraitEleveException;

// pour des besoin de démonstraton nous creer juste un we server qui permet de:
//  consulter un compte
// faire toutes les opérations sur compte : consulter operation, effectuer retrait versement virement  ..

// @Component => rend cette classe comment étant un composant spring afin que spring puisse l'instancier
@Component

//@WebService(name = "BanqueWebService")
@WebService // Web service Soap avec JAX-WS
public class BanqueSoapService {

	@Autowired
	private ICompteMetier compteMetier;

	@Autowired
	private IOperationMetier operationMetier;

	// @WebMethod(operationName = "consulterCompte")
	@WebMethod
	public Compte getCompte(@WebParam(name = "codeCompte") String codeCompte) {
		return compteMetier.getCompte(codeCompte);
	}

	@WebMethod
	public boolean verser(@WebParam(name = "codeCompte") String codeCompte, @WebParam(name = "montant") double montant,
			@WebParam(name = "codeEmploye") Long codeEmploye) {
		return operationMetier.verser(codeCompte, montant, codeEmploye);
	}

	@WebMethod
	public boolean retirer(@WebParam(name = "codeCompte") String codeCompte, @WebParam(name = "montant") double montant,
			@WebParam(name = "codeEmploye") Long codeEmploye) throws MontantRetraitEleveException {
		return operationMetier.retirer(codeCompte, montant, codeEmploye);
	}

	@WebMethod
	public boolean virement(@WebParam(name = "codeCcodeCompteSourceompte") String codeCompteSource,
			@WebParam(name = "codeCompteDestination") String codeCompteDestination,
			@WebParam(name = "montant") double montant, @WebParam(name = "codeEmploye") Long codeEmploye) {
		return operationMetier.virement(codeCompteSource, codeCompteDestination, montant, codeEmploye);
	}

	@WebMethod
	public PageOperation getOperation(@WebParam(name = "codeCcodeCompteSourceompte") String codeCompte,
			@WebParam(name = "page") int page, @WebParam(name = "size") int size) {
		return operationMetier.getOperation(codeCompte, page, size);
	}

}
