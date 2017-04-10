package org.platform.services.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 
 * @author Brook
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class RegistrySererApp {
	
	
	public static void main(String[] args) {
		SpringApplication.run(RegistrySererApp.class, args);
		
	}
	
	
}