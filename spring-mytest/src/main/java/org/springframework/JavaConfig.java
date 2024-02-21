package org.springframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
public class JavaConfig {
	@Bean
	public User user(){
		return new User("1","张三");
	}
}