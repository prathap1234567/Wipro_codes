package com.wipro.basic;
import java.util.*;
public class SumEx9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt();
     int c=sc.nextInt();
      int result=printSum(a,b,c );
     System.out.println(result);
     }
	static int printSum (int a, int b, int c) {
		int sum = 0;
        if (a!= b && a!= c) {
            sum += a;
        }
        if (b!= a && b!= c) {
            sum += b;
        }
        if (c!= a && c!= b) {
            sum += c;
        }
        return sum;
		}
	}


