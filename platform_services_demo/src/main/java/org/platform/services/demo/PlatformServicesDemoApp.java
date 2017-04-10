package org.platform.services.demo;

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
public class PlatformServicesDemoApp {
	
	public static void main(String[] args) {

		SpringApplication.run(PlatformServicesDemoApp.class, args);

	}
}
