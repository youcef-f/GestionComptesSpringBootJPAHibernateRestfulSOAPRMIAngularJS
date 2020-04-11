package com.gestioncomptes.servicesrestful;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gestioncomptes.entities.Compte;
import com.gestioncomptes.metier.ICompteMetier;

@RestController
public class CompteRestService {

	@Autowired
	private ICompteMetier compteMetier;

	@RequestMapping(value = "/comptes", method = RequestMethod.POST)
	// @ResponseBody Par defaut en json
	public Compte saveCompte(@RequestBody Compte compte) {
		return compteMetier.saveCompte(compte);
	}

	@RequestMapping(value = "/comptes", method = RequestMethod.GET)
	// @ResponseBody Par defaut en json
	public List<Compte> listcompte() {
		return compteMetier.listCompte();
	}

	@RequestMapping(value = "/comptes/{code}", method = RequestMethod.GET)
	public Compte getCompte(@PathVariable("code") String codeCompte) {
		return compteMetier.getCompte(codeCompte);
	}

}
