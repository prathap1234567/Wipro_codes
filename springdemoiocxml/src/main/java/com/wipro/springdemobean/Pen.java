package com.wipro.springdemobean;

public class Pen {

	String make;
	Ink ink;
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public Ink getInk() {
		return ink;
	}
	public void setInk(Ink ink) {
		this.ink = ink;
	}
	public Pen( Ink ink) {
		super();
		
		this.ink = ink;
	}
	@Override
	public String toString() {
		return "Pen [make=" + make + ", ink=" + ink + "]";
	}
	public Pen() {
		super();
		// TODO Auto-generated constructor stub
	}
}
	