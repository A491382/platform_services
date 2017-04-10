/**
 * 
 */
package org.platform.services.demo.service;

import java.util.Map;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Administrator
 *
 */
@FeignClient(name="PLATFORM_SERVICES_API1")
public interface Api1Service {
	
	@RequestMapping(value = "/api1/user", method = RequestMethod.GET)
	Map<String, Object> getUser(@RequestParam(value = "username",  required = true)String username);

}
