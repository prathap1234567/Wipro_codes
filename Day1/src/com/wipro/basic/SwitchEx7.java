package com.wipro.basic;
import java.util.*;
public class SwitchEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String result=getSeason(n);
		System.out.println(result);
	}
	static String getSeason(int n) {
		switch(n){
			case 1:
				return "Summer";
			case 2:
				return "winter";
	        case 3:
	            return "Rainy";
	        case 4:
	            return "Spring";
	         default:
	            return "Invalid choice";
				
		}
	}

}
