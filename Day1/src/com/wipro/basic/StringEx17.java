package com.wipro.basic;

import java.util.*;
public class StringEx17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String result = "";	
		int len = str.length();
		for (int i = len / 2; i > 0; i--) {
			String start = str.substring(0, i);
			String end = str.substring(len - i);
			
			if (start.equals(end)) {
				result = start;
				break;
			}
		}
		
		System.out.println(result);
	}
}


