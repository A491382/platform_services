package org.platform.services.demo;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

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
@EnableFeignClients
@EnableDiscoveryClient
public class PlatformServicesDemoApp {
	
	public static void main(String[] args) throws URISyntaxException {
		
//		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA11111");		
//		try {
//			String host = new URI("http://PLATFORMSERVICESAPI1").getHost();
//			System.out.println(host);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA22222222");
		SpringApplication.run(PlatformServicesDemoApp.class, args);

	}
}
