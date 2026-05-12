package com.wipro.behavioural;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {

	String stationName;

	public WeatherStation(String stationName) {
		super();
		this.stationName = stationName;
	}

	List<Devices> devices = new ArrayList<>();

	void addDevice(Devices device) {

		devices.add(device);

	}

	void removeDevice(Devices device) {

		devices.remove(device);

	}

	void upload(String temp) {

		System.out.println("Temperature - " + temp + " updated on " + stationName);

		sendNotification(temp);

	}

	void sendNotification(String temp) {

		for (Devices de : devices) {

			de.update(temp);

		}

	}

}