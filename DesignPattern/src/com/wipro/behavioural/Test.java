package com.wipro.behavioural;

public class Test {

	public static void main(String[] args) {

		Devices d1=new Devices("Mobile");
		Devices d2=new Devices("TV");
		WeatherStation ws =new WeatherStation("Weather Station");
		ws.addDevice(d1);
		ws.addDevice(d2);
		ws.upload("32 Degree");

	}

}