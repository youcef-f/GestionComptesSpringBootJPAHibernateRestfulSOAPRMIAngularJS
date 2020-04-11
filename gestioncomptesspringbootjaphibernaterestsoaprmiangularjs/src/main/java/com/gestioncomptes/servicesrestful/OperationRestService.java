package com.gestioncomptes.servicesrestful;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gestioncomptes.metier.IOperationMetier;
import com.gestioncomptes.metier.PageOperation;
import com.gestioncomptes.metier.exception.MontantRetraitEleveException;

@RestController
public class OperationRestService {

	@Autowired
	private IOperationMetier operationMetier;

	@RequestMapping(value = "/operations", method = RequestMethod.GET)
	public PageOperation getOperation(@RequestParam int page, @RequestParam int size, @RequestParam String codeCompte) {

		return operationMetier.getOperation(codeCompte, page, size);
	}

	@RequestMapping(value = "/versement", method = RequestMethod.PUT)
	public boolean verser(@RequestParam String codeCompte, @RequestParam double montant,
			@RequestParam Long codeEmploye) {
		return operationMetier.verser(codeCompte, montant, codeEmploye);
	}

	@RequestMapping(value = "/retrait", method = RequestMethod.PUT)
	public boolean retirer(@RequestParam String codeCompte, @RequestParam double montant,
			@RequestParam Long codeEmploye) throws MontantRetraitEleveException {
		return operationMetier.retirer(codeCompte, montant, codeEmploye);
	}

	@RequestMapping(value = "/virement", method = RequestMethod.PUT)
	public boolean virement(@RequestParam String codeCompteSource, @RequestParam String codeCompteDestination,
			@RequestParam double montant, Long codeEmploye) {
		return operationMetier.virement(codeCompteSource, codeCompteDestination, montant, codeEmploye);
	}

	// consulter une page operations

}
