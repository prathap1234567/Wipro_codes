package com.wipro.basic;
import java.util.*;
public class StringEx14 {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        String str = sc.nextLine();
		        String result = "";
		        if (str.length() >= 1 && str.charAt(0) != 'x') {
		            result += str.charAt(0);
		        }
		        if (str.length() >= 2 && str.charAt(1) != 'x') {
		            result += str.charAt(1);
		        }
		        if (str.length() > 2) {
		            result += str.substring(2);
		        }

		        System.out.println(result);
		    }
		
	}


