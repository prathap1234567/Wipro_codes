package com.wipro.springdemoiocxml;

import com.wipro.springdemobean.Car;
import com.wipro.springdemobean.Engine;

public class WithoutSpring {
	public static void main(String[] args) {
		
		Engine e=new Engine();
		Car c=new Car();
		c.setEngine(e);
		c.drive();
		System.out.println(e.hashCode());
		System.out.println(c.hashCode());
	
	}
}