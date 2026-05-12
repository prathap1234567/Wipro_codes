package com.wipro.collections;

import java.util.Comparator;

public class SortAirport implements Comparator<Airport> {
 
	public int compare(Airport o1, Airport o2) {
		return o1.getCityName().compareTo(o2.getCityName());

	}
}
