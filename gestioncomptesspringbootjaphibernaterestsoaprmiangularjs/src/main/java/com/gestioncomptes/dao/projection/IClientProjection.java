package com.gestioncomptes.dao.projection;

import org.springframework.data.rest.core.config.Projection;

import com.gestioncomptes.entities.Client;


@Projection(name="projectionclient1", types = {Client.class})
public interface IClientProjection {

	// Voir la classe Client
	//private Long codeClient; Ici on veut pas le codeClient
	//public Long getCodeClient();
	//private String nomClient;
	public String getNonClient();  // On veut voir uniquement le nom du client . Attention à la syntaxe. Majuscule aud début de l'attribut

	//private Collection<Compte> comptes; 
	
	
}
