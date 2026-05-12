package com.wipro.springdemobean;

public class Car {
	Engine engine;
	public void drive(){
		System.out.println("Car Running");
		engine.start();
	}
	
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
}
