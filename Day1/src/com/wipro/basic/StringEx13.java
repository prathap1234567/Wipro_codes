package com.wipro.basic;
import java.util.*;
public class StringEx13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String  str=sc.nextLine();
		int n=sc.nextInt();
		String sub1=str.substring(0,n);
		String sub2=str.substring(str.length() - n);
		String result=sub1+sub2;
		System.out.print(result);

	}

}
