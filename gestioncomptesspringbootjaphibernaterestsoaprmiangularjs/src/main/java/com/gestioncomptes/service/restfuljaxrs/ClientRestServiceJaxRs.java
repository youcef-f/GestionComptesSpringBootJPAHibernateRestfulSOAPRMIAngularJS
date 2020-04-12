package com.gestioncomptes.service.restfuljaxrs;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gestioncomptes.entities.Client;
import com.gestioncomptes.metier.IClientMetier;

@Component
// annotation JAX-RS
@Path("/")
public class ClientRestServiceJaxRs {

	@Autowired
	private IClientMetier clientmetier;
	private final static Log LOG = LogFactory.getLog(ClientRestServiceJaxRs.class);

	@GET
	@Consumes("application/json")
	@Produces("application/json")
	@Path("/healthcheck")
	public String doesItWorks() {
		LOG.debug("It works");

		return "It works!";
	}

	@POST
	@Path("/clients")
	@Produces(MediaType.APPLICATION_JSON)
	public Client saveClient(Client client) {
		return clientmetier.saveClient(client);
	}

	@GET
	@Path("/clients")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Client> listclients() {
		return clientmetier.listclients();
	}

}
