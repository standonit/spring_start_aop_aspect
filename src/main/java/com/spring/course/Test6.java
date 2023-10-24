package com.spring.course;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

		Person person = context.getBean("personBean", Person.class);
		person.callYourPet();
		
		Person person2 = context.getBean("personBean2", Person.class);
		person2.callYourPet();

		
		
		
		
		
		
		
		
		
	}

}
