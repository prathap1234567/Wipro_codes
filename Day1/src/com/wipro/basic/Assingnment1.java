package com.wipro.basic;
import java.util.*;
public class Assingnment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      for(int i=1;i<=100;i++) {
    	  if(i%3==0 && i%5==0) {
    		  System.out.print("FizzBuzz ");
    	  }
    	  else if(i%3==0) {
    		  System.out.print("Fizz ");
    	  }
    	  else if(i%5==0) {
    		  System.out.print("Buzz ");
    	  }
    	  else
    	  {
    		  System.out.print(i+" ");
    	  }
      }
	}

}
