package org.platform.services.demo.web;

import java.util.List;
import java.util.Map;

import org.platform.services.demo.service.Api1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Brook
 *
 */
@RestController
public class FeignController {
	
	@Autowired
	Api1Service api1service;

	
	@RequestMapping(value = "demo/feign/user", method = RequestMethod.GET)
	@ResponseBody
	public Map<String,Object> getUser(String username) {
		return api1service.getUser(username);
	}
	
	
	@RequestMapping(value = "demo/feign/users", method = RequestMethod.GET)
	@ResponseBody
	public List<Map<String,Object>> getUsers() {
		return api1service.getUsers();
	}
}
