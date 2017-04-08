# platform_services_demo


> demo for how using spring cloud to build up microservices 



### Demo List

- configuration service 

> ''' @Controller
> '''public class ConfigurationController {	
> '''	@Value("${hello}")
> '''	private String hello;
	
> '''	@RequestMapping(value = "demo/cfg", method = RequestMethod.GET)
> '''	@ResponseBody
> '''	public String cfg() {
> '''		return "hello "+hello;
> '''	}
> '''}

- ZUUL

- OAuth2

- Eureka

- Ribbon

- Hystrix

- Sleuth