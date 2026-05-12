package com.wipro.basic;

import java.util.*;
public class StringEx16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = sc.nextInt();	
		String result = "";	
		for (int i = n; i > 0; i--) {
			result += str.substring(0, i);
		}
		
		System.out.println(result);
	}

}