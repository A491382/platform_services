package org.platform.services.api1.web.controller;

import java.util.List;

import org.platform.services.api1.domain.User;
import org.platform.services.api1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Brook
 *
 */
@RestController
public class UserController {
	
	@Autowired
	private UserService userservice;
	
	@RequestMapping(value = "api1/users", method = RequestMethod.GET)
	@ResponseBody
	public List<User> getAllUsers() {
		return userservice.getUserList();
	}
	

	@RequestMapping(value = "api1/user", method = RequestMethod.GET)
	@ResponseBody
	public User getUser(String username) {
		return userservice.getUser(username);
	}
}
