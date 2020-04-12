package com.gestioncomptes.service.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gestioncomptes.entities.Compte;
import com.gestioncomptes.metier.IClientMetier;
import com.gestioncomptes.metier.ICompteMetier;
import com.gestioncomptes.metier.IOperationMetier;
import com.gestioncomptes.metier.PageOperation;

@Component("Banque-Service-RMI") // rendre la classe comment un composant spring. Lui donner un nom pour etre
									// ensuite etre utiliser.

public class BanqueRmiServiceImplement implements IBanqueRmiService {

	@Autowired
	ICompteMetier compteMetier;

	@Autowired
	IClientMetier clientMetier;

	@Autowired
	IOperationMetier operationMetier;

	protected BanqueRmiServiceImplement() {
		super();
	}

	@Override
	public Compte saveCompte(Compte compte) {
		return compteMetier.saveCompte(compte);
	}

	@Override
	public Compte getCompte(String codeCompte) {
		return compteMetier.getCompte(codeCompte);
	}

	@Override
	public boolean verser(String codeCompte, double montant, Long codeEmploye) {
		return operationMetier.verser(codeCompte, montant, codeEmploye);
	}

	@Override
	public boolean retirer(String codeCompte, double montant, Long codeEmploye) {
		return operationMetier.retirer(codeCompte, montant, codeEmploye);
	}

	@Override
	public boolean virement(String codeCompteSource, String codeCompteDestination, double montant, Long codeEmploye) {
		return operationMetier.virement(codeCompteSource, codeCompteDestination, montant, codeEmploye);
	}

	@Override
	public PageOperation getOperation(String codeCompte, int page, int size) {
		return operationMetier.getOperation(codeCompte, page, size);
	}
}
