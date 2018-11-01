package martin.ma.springboot.filter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
	
	@Bean
	public FilterRegistrationBean<CommonFilter> filterRegistrationBean() {
		FilterRegistrationBean<CommonFilter> bean = new FilterRegistrationBean<CommonFilter>();
		bean.setFilter(new CommonFilter());
		List<String> list = new ArrayList<>();
		list.add("/*");
		bean.setUrlPatterns(list);
		bean.setName("common-filter");
		bean.setOrder(0);
		return bean;
	}
	
}
