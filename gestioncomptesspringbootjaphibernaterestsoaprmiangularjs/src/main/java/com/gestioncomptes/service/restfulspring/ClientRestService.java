package com.gestioncomptes.service.restfulspring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gestioncomptes.entities.Client;
import com.gestioncomptes.metier.IClientMetier;

@RestController // commenter @RestController si l'on souhaite plutot faire du "Spring data rest". 
// Sinon il faut renomer les endpoints coté "RestControler" car @RepositoryRestResource utilise les noms des entités.
public class ClientRestService {

	@Autowired
	private IClientMetier clientmetier;

	@GetMapping("/test")
	// @RequestMapping(value = "/test", method = RequestMethod.GET)
	// @ResponseBody Par defaut en json
	public String test() {
		return "hello world";
	}

	// @RequestMapping(value = "/clients", method = RequestMethod.POST)
	@PostMapping("/clients")
	// @ResponseBody Par defaut en json
	public Client saveClient(@RequestBody Client client) {
		return clientmetier.saveClient(client);
	}

	// @RequestMapping(value = "/clients", method = RequestMethod.GET)
	@GetMapping("/clients")
	// @ResponseBody
	public List<Client> listclient() {
		return clientmetier.listclients();
	}

}
