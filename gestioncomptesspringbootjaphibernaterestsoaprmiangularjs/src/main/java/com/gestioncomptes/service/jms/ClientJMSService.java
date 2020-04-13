package com.gestioncomptes.service.jms;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.gestioncomptes.entities.Client;
import com.gestioncomptes.metier.IClientMetier;


// Consumer

@Component
public class ClientJMSService {

	
	// Id of consumer
	//String messageSelector = "SpringServerID";

	// for producer message
	String topicNameClientJmsToServerSpring = "clientJmsToServerSpring";

	
	@Autowired
	private IClientMetier clientmetier;

	
	@JmsListener(destination = "clientJmsToServerSpring")
	public void saveClient(Message message) throws Exception {

		if (message instanceof TextMessage) {
              String contentMessage = ((TextMessage) message).getText();
              System.out.println("****************************************");
              System.out.println("Reception message: " + contentMessage);
              
              Client client = new Client(contentMessage) ; 
              clientmetier.saveClient(client);
              
		}

	}
	
	

}
