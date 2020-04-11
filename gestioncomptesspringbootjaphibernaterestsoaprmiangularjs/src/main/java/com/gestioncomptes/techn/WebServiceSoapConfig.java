package com.gestioncomptes.techn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.jaxws.SimpleJaxWsServiceExporter;


@Configuration // permet de creer un bean spring
public class WebServiceSoapConfig {
	
	
	@Bean
	public SimpleJaxWsServiceExporter getJWS() {

		SimpleJaxWsServiceExporter simpleJaxWsServiceExporter = new SimpleJaxWsServiceExporter();
		simpleJaxWsServiceExporter.setBaseAddress("http://localhost:8089/Banque");
		return simpleJaxWsServiceExporter;
	}
	
	


}
