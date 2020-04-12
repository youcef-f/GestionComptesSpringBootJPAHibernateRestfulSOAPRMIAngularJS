package com.gestioncomptes.techn;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.gestioncomptes.service.restfuljaxrs.ClientRestServiceJaxRs;

@Configuration

//@ApplicationPath("/jaxs")
public class JerseyConfig {

	  //@Bean  Commenter pour désactiver jersey
	  public ResourceConfig getJersey() {
		  ResourceConfig resourceConfig = new ResourceConfig();
		  
	        resourceConfig.register(ClientRestServiceJaxRs.class);
	        
	        return resourceConfig ; 
	  }
}