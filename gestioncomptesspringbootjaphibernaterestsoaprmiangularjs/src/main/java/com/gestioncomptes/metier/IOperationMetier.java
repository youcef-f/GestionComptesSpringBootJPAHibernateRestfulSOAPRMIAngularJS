package com.gestioncomptes.metier;

import com.gestioncomptes.entities.Compte;
import com.gestioncomptes.metier.exception.MontantRetraitEleveException;

public interface IOperationMetier {

	public boolean verser(String codeCompte, double montant,Long codeEmploye);
	public boolean retirer(String codeCompte, double montant,Long codeEmploye) ;
	public boolean virement(String codeCompteSource,String codeCompteDestination,double montant, Long codeEmploye);
	public PageOperation getOperation (String codeCompte, int page, int size); 
	
	
}
