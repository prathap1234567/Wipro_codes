package com.wipro.basic;
import java.util.*;
public class StringEx15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String a = sc.nextLine().toLowerCase();
String b = sc.nextLine().toLowerCase();
boolean result = false;
if (a.length() >= b.length()) {
	String sub = a.substring(a.length() - b.length());
	if (sub.equals(b)) {
		result = true;
	}
}
if (b.length() >= a.length()) {
	String sub = b.substring(b.length() - a.length());
	if (sub.equals(a)) {
		result = true;
	}
}

System.out.println(result);
	
	}

}

