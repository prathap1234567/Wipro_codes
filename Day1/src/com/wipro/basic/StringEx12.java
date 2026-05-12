package com.wipro.basic;
import java.util.*;
public class StringEx12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int n=str.length()/2;
		String sub=str.substring(0,n);
		System.out.println(sub);

	}

}
