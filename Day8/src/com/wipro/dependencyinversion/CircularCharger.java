package com.wipro.dependencyinversion;

public class CircularCharger implements Charger {
	public void charge() {
		System.out.println("Type c Charger");
	}

}
