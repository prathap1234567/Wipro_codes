package com.wipro.dq;

public class Person {

	public String name;
	public String pan;
	
	public Person(String name, String pan) {
		super();
		this.name = name;
		this.pan = pan;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", pan=" + pan + "]";
	}
}
