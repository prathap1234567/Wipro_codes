package com.wipro.springdemoiocxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.springdemobean.OrderService;

public class AppTest3 {
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		OrderService order=ctx.getBean(OrderService.class);
		System.out.println(order);
		order.placeOrder();
	
	}
}