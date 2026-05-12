package com.wipro.basic;
import java.util.*;
public class Day1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();  
		printFibbo(n);
	}
	static void printFibbo(int n) {
		int a = 0, b = 1;
		for (int i = 0; i < n; i++) {
			System.out.print(a + " ");
			int next = a + b;
			a = b;
			b = next;
		}
	}
	}




