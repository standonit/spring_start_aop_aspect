package com.spring.course;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		
		
		Dog myDog = context.getBean("myPet", Dog.class);
		//myDog.setName("Lil");
		Dog yourDog = context.getBean("myPet", Dog.class);
		//yourDog.setName("Peep");
		
		//System.out.println(myDog.getName());
		//System.out.println(yourDog.getName());
		//System.out.println((myDog == yourDog));
		
	}

}
