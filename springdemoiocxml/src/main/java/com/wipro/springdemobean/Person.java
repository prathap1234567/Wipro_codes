package com.wipro.springdemobean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="person")
@Scope("prototype")
public class Person {
	String name;
	Passport pass;
	
	public Passport getPass() {
		return pass;
	}
	public void setPass(Passport pass) {
		this.pass = pass;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", pass=" + pass + "]";
	}
	
	
	@Autowired
	public Person(Passport pass) {
		super();
		this.pass = pass;
	}
	

}
