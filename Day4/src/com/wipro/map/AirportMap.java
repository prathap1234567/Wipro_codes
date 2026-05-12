package com.wipro.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AirportMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> airport=new HashMap<>();
		//Map<String,String> airport=new TreeMap<>();
		//Map<String,String> airport=new LinkedHashMap<>();
		airport.put("Chn", "Chennai");
		airport.put("Del", "Delhi");
		airport.put("Mum", "Mumbai");
		airport.put("Kol", "Kolkata");
		airport.put("Blr", "Bangalore");
		airport.put("Hyd", "Hyderabad");
		airport.put("Pune", "Pune");
		airport.put("Goa", "Goa");
		airport.put("Coc", "Cochin");
		airport.put("Jai", "Jaipur");
		airport.put(null, null);
		airport.put(null, null);
		
		for(Map.Entry<String,String> entry:airport.entrySet()) {
			System.out.println("Key= "+entry.getKey()+"Value= "+entry.getValue());
		}
		System.out.println(airport.get("Coc"));
		System.out.println(airport.containsValue("Coimbatore"));
		

	}

}
