package com.gestioncomptes.dao.projection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;

import com.gestioncomptes.entities.Client;


//Une projection et l'équivalent d'une vue
@Projection(name="projectionclient2", types = {Client.class})
public interface IClientProjection2 {

	// Voir la classe Client
	//private Long codeClient; 
	//private String nomClient;
	//private Collection<Compte> comptes; 
	
	// on veut recuperer le nomClient avec son codeClient sous une seul reponse
	 @Value("#{target.nomClient} #{target.codeClient}")
	public String getFullNomCode() ; // nom peut etre n'importe quoig
	
}
