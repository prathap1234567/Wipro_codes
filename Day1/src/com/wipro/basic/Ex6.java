package com.wipro.basic;

import java.util.*;
public class Ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int day = sc.nextInt();  
		boolean vacation = sc.nextBoolean();
		String result = alarmClock(day, vacation);
		System.out.println(result);
	}
	
	static String alarmClock(int day, boolean vacation) {
		if (vacation) {
			if (day == 0 || day == 6) {
				return "off";
			} else {
				return "10:00";
			}
		} else {
			if (day == 0 || day == 6) {
				return "10:00";
			} else {
				return "7:00";
			}
		}
	}
	

}


