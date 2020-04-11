package com.gestioncomptes.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestioncomptes.dao.IClientRepository;
import com.gestioncomptes.entities.Client;

@Service
public class ClientMetierImplement implements IClientMetier {

	@Autowired
	private IClientRepository clientRepository;

	@Override
	public Client saveClient(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public List<Client> listclients() {
		return clientRepository.findAll();
	}

}
