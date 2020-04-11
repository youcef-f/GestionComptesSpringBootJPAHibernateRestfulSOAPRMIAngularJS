package com.gestioncomptes.servicesrestful;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gestioncomptes.entities.Client;
import com.gestioncomptes.metier.IClientMetier;

@RestController
public class ClientRestService {

	@Autowired
	private IClientMetier clientmetier;

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	// @ResponseBody Par defaut en json
	public String test() {
		return "hello world";
	}

	@RequestMapping(value = "/clients", method = RequestMethod.POST)
	// @ResponseBody Par defaut en json
	public Client saveClient(@RequestBody Client client) {
		return clientmetier.saveClient(client);
	}

	@RequestMapping(value = "/clients", method = RequestMethod.GET)
	// @ResponseBody
	public List<Client> listclient() {
		return clientmetier.listclients();
	}

}
