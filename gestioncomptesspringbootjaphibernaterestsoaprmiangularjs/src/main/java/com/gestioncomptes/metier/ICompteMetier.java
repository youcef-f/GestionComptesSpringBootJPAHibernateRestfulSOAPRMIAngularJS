package com.gestioncomptes.metier;

import java.util.List;

import com.gestioncomptes.entities.Client;
import com.gestioncomptes.entities.Compte;

public interface ICompteMetier {

	public Compte saveCompte(Compte compte);

	public Compte getCompte(String codeCompte);

	public List<Compte> listCompte();

}
