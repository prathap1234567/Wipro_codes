package com.wipro.springdemobean;

public class Ink {

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	String make;

	@Override
	public String toString() {
		return "Ink [make=" + make + "]";
	}
}
