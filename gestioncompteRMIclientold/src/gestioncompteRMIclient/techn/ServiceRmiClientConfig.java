package gestioncompteRMIclient.techn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

import com.gestioncomptes.servicermi.IBanqueRmiService;

@Configuration
public class ServiceRmiClientConfig {

	@Bean
	public RmiProxyFactoryBean rmiProxy() {
		RmiProxyFactoryBean proxy = new RmiProxyFactoryBean();

		proxy.setServiceUrl("rmi://localhost:1099/BanqueRmi");
		proxy.setServiceInterface(IBanqueRmiService.class);
		return proxy;
	}

}