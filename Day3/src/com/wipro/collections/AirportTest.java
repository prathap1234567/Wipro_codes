package com.wipro.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AirportTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<Airport> airport=new ArrayList<>();
      
      Airport p1=new Airport("Netaji Subhash Chandra Bose International Airport" ,"Kolkata", "CCU");
      Airport p2 = new Airport("Indira Gandhi International Airport", "Delhi", "DEL");
      Airport p3 = new Airport("Chhatrapati Shivaji Maharaj International Airport", "Mumbai", "BOM");
      Airport p4 = new Airport("Kempegowda International Airport", "Bangalore", "BLR");
      Airport p5 = new Airport("Chennai International Airport", "Chennai", "MAA");
      Airport p6 = new Airport("Rajiv Gandhi International Airport", "Hyderabad", "HYD");
      Airport p7 = new Airport("Cochin International Airport", "Kochi", "COK");
      Airport p8 = new Airport("Sardar Vallabhbhai Patel International Airport", "Ahmedabad", "AMD");
      Airport p9 = new Airport("Pune Airport", "Pune", "PNQ");
      Airport p10 = new Airport("Goa International Airport", "Goa", "GOI");
      Airport p11 = new Airport("Jaipur International Airport", "Jaipur", "JAI");
      Airport p12 = new Airport("Trivandrum International Airport", "Thiruvananthapuram", "TRV");
      Airport p13 = new Airport("Lokpriya Gopinath Bordoloi International Airport", "Guwahati", "GAU");
      Airport p14 = new Airport("Chandigarh International Airport", "Chandigarh", "IXC");
      Airport p15 = new Airport("Biju Patnaik International Airport", "Bhubaneswar", "BBI");
      
      airport.add(p1);
      airport.add(p2);
      airport.add(p3);
      airport.add(p4);
      airport.add(p5);
      airport.add(p6);
      airport.add(p7);
      airport.add(p8);
      airport.add(p9);
      airport.add(p10);
      airport.add(p11);
      airport.add(p12);
      airport.add(p13);
      airport.add(p14);
      airport.add(p15);
      
      //Collections.sort(airport, new SortAirport());
      
      Comparator<Airport> airportcompare= Comparator .comparing(Airport::getAirportName).
    		                                         thenComparing(Airport::getCityName);
      Collections.sort(airport,airportcompare);
		

     for(Airport a:airport) {
    	System.out.println(a);
      }
      
	}

}
