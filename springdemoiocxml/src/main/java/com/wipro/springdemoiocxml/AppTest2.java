package com.wipro.springdemoiocxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.springdemobean.Pen;

public class AppTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx= new ClassPathXmlApplicationContext("spring.xml");
     Pen pen=ctx.getBean(Pen.class);
     System.out.println(pen);
     System.out.println(pen.getInk().getMake());
     
	}

}
