package com.spring.course;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan("com.example.demo")
@PropertySource("classpath:application.properties")
public class MyConfig {

	@Bean
	@Scope("singleton")
	public Pet catBean() {
		return new Cat();
	}
	
	@Bean
	public Pet dogBean() {
		return new Dog();
	}
	
	@Bean
	@Scope("prototype")
	public Person personBean() {
		return new Person(catBean());
	}
	@Bean
	public Person personBean2() {
		return new Person(dogBean());
	}
	
}
