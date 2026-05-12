package com.wipro.springdemo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDemoTest implements CommandLineRunner {

		// TODO Auto-generated method stub
		@Autowired
	    ApplicationContext applicationContext;
		
		public static void main(String[] args) {
			SpringApplication.run(SpringDemoTest.class, args);
		 
	 
	 
		}

		
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Food food=applicationContext.getBean(Food.class);
		food.setFoodName("Briyani");
		food.setFoodType("NON_VEG");
		System.out.println(food);
	}

}
