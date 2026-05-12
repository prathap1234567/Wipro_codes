package com.wipro.exception;

public class Exceptiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String str1="2";
		int n1=Integer.parseInt(str1);
		System.out.println(n1);
		
        try {
        	String str2="2L";
        	int n2=Integer.parseInt(str2);
        	System.out.println(n2);
        	
        }
        catch(NumberFormatException e) {
        	System.out.println("undefined Formet");
        }
        finally{
        	System.out.println("done");
        	
        }
        
        
		
	}

}
