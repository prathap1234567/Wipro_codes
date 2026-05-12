package com.wipro.methodreference;

public class Box {
	int value;
	Box(int value){
		this.value=value;
	}
	@Override
	public String toString() {
		return "Box [value=" + value + "]";
	}

}
