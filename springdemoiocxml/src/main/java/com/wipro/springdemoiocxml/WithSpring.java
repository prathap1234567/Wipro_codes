package com.wipro.springdemoiocxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.springdemobean.Car;
import com.wipro.springdemobean.Engine;

public class WithSpring {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Spring2.xml");
		Car c1=ctx.getBean(Car.class);
		Car c2=ctx.getBean(Car.class);
		Engine e1=ctx.getBean(Engine.class);
		Engine e2=ctx.getBean(Engine.class);
		
		c1.drive();
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
	}
}
