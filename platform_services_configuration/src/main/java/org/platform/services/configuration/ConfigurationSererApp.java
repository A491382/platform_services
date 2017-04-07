package org.platform.services.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 
 * @author Brook
 *
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigurationSererApp {
	
	
	public static void main(String[] args) {
		
		SpringApplication.run(ConfigurationSererApp.class, args);
		
	}
	
	
}
