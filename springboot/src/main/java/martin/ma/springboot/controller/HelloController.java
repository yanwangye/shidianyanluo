package martin.ma.springboot.controller;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class HelloController {
	
	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
}
