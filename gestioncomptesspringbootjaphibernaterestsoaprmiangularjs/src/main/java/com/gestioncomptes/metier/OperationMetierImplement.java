package com.gestioncomptes.metier;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gestioncomptes.dao.ICompteRepository;
import com.gestioncomptes.dao.IEmployeRepository;
import com.gestioncomptes.dao.IOperationRepository;
import com.gestioncomptes.entities.Compte;
import com.gestioncomptes.entities.Employe;
import com.gestioncomptes.entities.Operation;
import com.gestioncomptes.entities.Retrait;
import com.gestioncomptes.entities.Versement;
import com.gestioncomptes.metier.exception.MontantRetraitEleveException;

@Service
public class OperationMetierImplement implements IOperationMetier {

	@Autowired
	private IOperationRepository operationRepository;

	@Autowired
	private ICompteRepository compteRepository;

	@Autowired
	private IEmployeRepository employeRepository;

	@Transactional
	@Override
	public boolean verser(String codeCompte, double montant, Long codeEmploye) {

		Compte compte = compteRepository.findById(codeCompte).orElse(null);

		Employe employe = employeRepository.findById(codeEmploye).orElse(null);

		Operation operation = new Versement();
		operation.setMontant(montant);
		operation.setDateOperation(new Date());
		operation.setEmploye(employe);
		operation.setCompte(compte);

		operationRepository.save(operation);

		compte.setSolde(compte.getSolde() + montant);
		//compteRepository.save(compte);

		return true;
	}

	@Transactional
	@Override
	public boolean retirer(String codeCompte, double montant, Long codeEmploye)  {
		Compte compte = compteRepository.findById(codeCompte).orElse(null);

		Employe employe = employeRepository.findById(codeEmploye).orElse(null);
      
    		if (compte.getSolde() < montant)
				throw new RuntimeException("Solde insuffisant");
			

		Operation operation = new Retrait();
		operation.setMontant(montant);
		operation.setDateOperation(new Date());
		operation.setEmploye(employe);
		operation.setCompte(compte);

		operationRepository.save(operation);

		compte.setSolde(compte.getSolde() - montant);
		//compteRepository.save(compte);

		return true;
	}

	@Transactional
	@Override
	public boolean virement(String codeCompteSource, String codeCompteDestination, double montant, Long codeEmploye) {
       retirer(codeCompteSource, montant, codeEmploye) ; 
       verser(codeCompteDestination, montant, codeEmploye);
		return true;

	}

	@Override
	public PageOperation getOperation(String codeCompte, int page, int size) {
		// TODO Auto-generated method stub
		
	
		Pageable sortedByName =
				  PageRequest.of(page, size, Sort.by("numeroOperation"));

		Page<Operation> operation = operationRepository.getOperation(codeCompte, sortedByName ) ; 
		
		PageOperation pageOperation=new PageOperation();
		pageOperation.setOperations(operation.getContent());
		pageOperation.setNombreOperationsInPage(operation.getNumberOfElements()); // number item in page
		pageOperation.setPageCourant(operation.getNumber());  // page courant
		pageOperation.setTotalOperations((int) operation.getTotalElements());
		pageOperation.setTotalPages(operation.getTotalPages());
		
		
		return  pageOperation;
	}
	

}
