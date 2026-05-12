package com.wipro.springdemoiocxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.springdemobean.Vehicle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx= new ClassPathXmlApplicationContext("Spring.xml");
    	Vehicle v=ctx.getBean(Vehicle.class);
     	System.out.println(v);
     	v.setRegistrationNumber(7328);
     	v.setMake("Honda");
     	System.out.println(v.getRegistrationNumber());
     	System.out.println(v.getMake());
     	
     	Vehicle v1=ctx.getBean(Vehicle.class);
     	System.out.println(v1);
     	v1.setRegistrationNumber(7854);
     	v1.setMake("TATA");
     	System.out.println(v1.getRegistrationNumber());
     	System.out.println(v1.getMake());


    }
}
