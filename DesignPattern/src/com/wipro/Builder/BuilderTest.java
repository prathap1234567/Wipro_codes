package com.wipro.Builder;
public class BuilderTest {

	public static void main(String[] args) {
		 
		CarBuilder carBuilder= new CarBuilder();
		Car car=carBuilder
		.setMake("TATA")
		.setFuelType("Petrol")		
		.setNumberOfWheels(4)
		.setCylinderCapacity(3)
		.build();
		
		System.out.println(car);
		

	}

}
