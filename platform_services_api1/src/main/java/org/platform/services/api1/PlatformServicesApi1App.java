package org.platform.services.api1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 
 * @author Brook
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PlatformServicesApi1App {
	
	public static void main(String[] args) {

		SpringApplication.run(PlatformServicesApi1App.class, args);

	}
}
