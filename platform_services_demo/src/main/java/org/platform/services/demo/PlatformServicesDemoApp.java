package org.platform.services.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 
 * @author Brook
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages="org.platform.services.demo.service")
public class PlatformServicesDemoApp {
	
	public static void main(String[] args) {

		SpringApplication.run(PlatformServicesDemoApp.class, args);

	}
}
