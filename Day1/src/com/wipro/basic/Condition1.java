package com.wipro.basic;

import java.util.*;
public class Condition1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt(); 
			boolean result = nearTen(num);
			System.out.println(result);
		}

	static boolean nearTen(int num) {
		int rem = num % 10;
		if (rem <= 2 || rem >= 8) {
			return true;
		} else {
			return false;
		}
	}

}




