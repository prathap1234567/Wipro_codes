package com.wipro.oops1.assignment2.Question2;

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("Toyota", "Glanza", 2025, 4, "Petrol");
		car1.displayInfo();
		car1.startEngine();
		car1.accelerate();
		car1.stopEngine();
	
		Motorcycle bike1 = new Motorcycle("Duke", "390", 2026, false, 390);
		
		System.out.println("Bike");
		bike1.displayInfo();
		bike1.startEngine();
		bike1.wheelie();
		bike1.stopEngine();
	
	}

}
