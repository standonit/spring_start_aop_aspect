package com.spring.course;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("dogBean")

public class Dog implements Pet {
	//private String name;
	
	public Dog() {
		System.out.println("Dog bean is created");
	}
	
	
	@Override
	public void say() {
		System.out.println("Bow-wow");
	}


	/*public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}*/
		
		/*@PostConstruct
		protected void init() {
			System.out.println("Class dog: init method");
		}
		
		@PreDestroy
		private void destroy() {
			System.out.println("Class dog: destroy method");
		}*/
		
	}


