package martin.ma.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import martin.ma.springboot.config.ConfigBean;
import martin.ma.springboot.config.User;

@RestController
@EnableConfigurationProperties({ConfigBean.class,User.class})
public class ReadConfigBeancontroller {
	@Autowired
	ConfigBean configBean;
	
	@RequestMapping(value="/config")
	public String readConfigBean() {
		return configBean.getGreeting()+">>>>"+configBean.getName()+">>>>>>"+configBean.getUuid();
	}
	
	@Autowired
	User user;
	@RequestMapping(value="/user")
	public String user() {
		return user.getName()+user.getAge();
	}
}
