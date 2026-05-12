package com.wipro.basic;
 
public class ConditionalDemo {
 
	public static void main(String[] args) {
		
		
		System.out.println(isEven(11));
 
	}
	
	static boolean isEven(int num)
	{
		if(num%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
 
}
 
 