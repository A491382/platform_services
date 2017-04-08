/**
 * 
 */
package org.platform.services.demo.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Brook
 *
 */
@Controller
public class ConfigurationController {
	
	@Value("${hello}")
	private String hello;
	
	@Value("${helloencrypt}")
	private String helloencrypt;
	
	@RequestMapping(value = "demo/cfg", method = RequestMethod.GET)
	@ResponseBody
	public String cfg() {
		return "hello "+hello;
	}
	
	
	@RequestMapping(value = "demo/cfg/encrypt", method = RequestMethod.GET)
	@ResponseBody
	public String helloencrypt() {
		return "helloencrypt "+hello;
	}

}
