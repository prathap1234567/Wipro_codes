package com.wipro.behavioural;

public class Devices implements Observe {

	String deviceName;

	public Devices(String deviceName) {
		super();
		this.deviceName = deviceName;
	}

	@Override
	public void update(String temp) {
		System.out.println(deviceName + " received temperature - " + temp);
	}

}