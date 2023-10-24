package com.spring.course;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Dog myDog = context.getBean("dogBean", Dog.class);
		myDog.say();
		/*Dog yourDog = context.getBean("dogBean", Dog.class);
		System.out.println("Переменные ссылаются ссылаються на один и тот же объект?" 
		+ (myDog==yourDog));
		System.out.println(myDog);
		System.out.println(yourDog);*/
		
		context.close();
	}

}
