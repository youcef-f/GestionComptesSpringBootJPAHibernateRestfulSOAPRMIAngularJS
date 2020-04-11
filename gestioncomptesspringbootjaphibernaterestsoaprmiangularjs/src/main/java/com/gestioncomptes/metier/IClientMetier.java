package com.gestioncomptes.metier;

import java.util.List;

import com.gestioncomptes.entities.Client;

public interface IClientMetier {

	public Client saveClient(Client client);

	public List<Client> listclients();

}
