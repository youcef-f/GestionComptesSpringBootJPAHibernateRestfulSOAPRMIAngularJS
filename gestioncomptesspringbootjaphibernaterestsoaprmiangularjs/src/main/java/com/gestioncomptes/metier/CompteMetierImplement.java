package com.gestioncomptes.metier;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestioncomptes.dao.ICompteRepository;
import com.gestioncomptes.entities.Compte;

@Service
public class CompteMetierImplement implements ICompteMetier {

	@Autowired
	private ICompteRepository compteRepository;

	@Override
	public Compte saveCompte(Compte compte) {
		// TODO Auto-generated method stub
		compte.setDateCreation(new Date());
		return compteRepository.save(compte);
	}

	@Override
	public Compte getCompte(String codeCompte) {
		// TODO Auto-generated method stub
		return compteRepository.findById(codeCompte).orElse(null);
	}

	@Override
	public List<Compte> listCompte() {
		// TODO Auto-generated method stub
		return compteRepository.findAll();
	}

}
