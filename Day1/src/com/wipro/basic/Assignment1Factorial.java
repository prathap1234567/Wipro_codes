package com.wipro.basic;
import java.util.*;
public class Assignment1Factorial {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int result=fact(n);
    System.out.print(result);
    
	}
	static int fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}

}
