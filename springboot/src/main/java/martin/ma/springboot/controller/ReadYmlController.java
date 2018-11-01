package martin.ma.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReadYmlController {
	@Value("${my.name}")
	private String name;
	
	@Value("${my.age}")
	private int age;
	
	@RequestMapping(value="/yml")
	public String readYml() {
		return name+" "+age;
	}
	
}
