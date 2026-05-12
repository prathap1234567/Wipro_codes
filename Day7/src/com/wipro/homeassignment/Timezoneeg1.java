package com.wipro.homeassignment;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Timezoneeg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZoneId zone = ZoneId.of("Asia/Kolkata");
		//System.out.println(zone);
		LocalDateTime local= LocalDateTime.now();
		//System.out.println(local);
		ZonedDateTime zone1=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
		ZonedDateTime zone2=ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(zone2.getOffset());
		System.out.println(zone2);
		System.out.println(zone1);
		
	}

}
