package com.gestioncomptes.service.rmi;

import com.gestioncomptes.entities.Compte;
import com.gestioncomptes.metier.PageOperation;

public interface IBanqueRmiService  {
	
	public Compte saveCompte(Compte compte)  ;
	public Compte getCompte(String codeCompte)  ;
	public boolean verser(String codeCompte, double montant, Long codeEmploye) ;
	public boolean retirer(String codeCompte, double montant, Long codeEmploye) ;
	public boolean virement(String codeCompteSource, String codeCompteDestination, double montant, Long codeEmploye)  ;
	public PageOperation getOperation(String codeCompte, int page, int size) ;
	
	
}
