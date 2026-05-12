package com.wipro.collections;

public class Airport  implements Comparable<Airport>{

	private String airportName;
	private String cityName;
	private String airportShortCode;
	
	public Airport(String airportName, String cityName, String airportShortCode) {
		super();
		this.airportName = airportName;
		this.cityName = cityName;
		this.airportShortCode = airportShortCode;
	}
	
	@Override
	public String toString() {
		return "Airport [airportName=" + airportName + ", cityName=" + cityName + ", airportShortCode="
				+ airportShortCode + "]";
	}
	
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getAirportShortCode() {
		return airportShortCode;
	}
	public void setAirportShortCode(String airportShortCode) {
		this.airportShortCode = airportShortCode;
	}

	@Override
	public int compareTo(Airport o) {
		// TODO Auto-generated method stub
		 return this.getAirportShortCode().compareTo(o.getAirportShortCode());
	}

	


	




	
}
