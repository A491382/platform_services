package org.platform.services.configuration.devops.web;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.config.server.encryption.EncryptionController;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConfigurationEncryptController {
	
	@Autowired
	EncryptionController encryptionController;
		
	@RequestMapping(value = "/help/encrypt/status", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> status() {
		return encryptionController.status();
	}
	
	
	@RequestMapping(value = "/help/encrypt", method = RequestMethod.POST)
	@ResponseBody
	public String encrypt(@RequestBody String data) {

		return encryptionController.encrypt("application", "default", data, MediaType.TEXT_PLAIN);
	}
	
	
	@RequestMapping(value = "/help/decrypt", method = RequestMethod.POST)
	@ResponseBody
	public String decrypt(@RequestBody String data) {

		return encryptionController.decrypt("application", "default", data, MediaType.TEXT_PLAIN);
	}


}