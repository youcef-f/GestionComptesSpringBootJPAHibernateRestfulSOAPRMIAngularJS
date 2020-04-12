package com.gestioncomptes.techn;

import java.rmi.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

import com.gestioncomptes.service.rmi.IBanqueRmiService;

@Configuration // permet de creer un bean spring
public class ServiceRmiServerConfig {

	@Bean
	// @Autowired // demande à spring d'injecter automatiquement les parameteres de
	// cette methode.
	public RmiServiceExporter getRMI(ApplicationContext applicationContext) throws UnknownHostException {
		RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
		rmiServiceExporter.setService(applicationContext.getBean("Banque-Service-RMI"));
		rmiServiceExporter.setRegistryPort(1099);
		// rmiServiceExporter.setRegistryHost("localhost");
		rmiServiceExporter.setServiceName("BanqueRmi"); // publié dans annuaire sous le nom du JNDI "BaqueRMI"
		rmiServiceExporter.setServiceInterface(IBanqueRmiService.class);
		return rmiServiceExporter;
	}

}
