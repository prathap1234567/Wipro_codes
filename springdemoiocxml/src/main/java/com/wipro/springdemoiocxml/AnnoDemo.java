package com.wipro.springdemoiocxml;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wipro.springdemobean.Person;

public class AnnoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext();
		ctx.scan("com.wipro.springdemobean");
		ctx.refresh();
		Person person=ctx.getBean(Person.class);
		person.getPass().setPassportNumber(754962);
		person.setName("Prathap");
		System.out.println(person);
		
	}

}
