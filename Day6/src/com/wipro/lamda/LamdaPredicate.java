package com.wipro.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LamdaPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Predicate<List<Integer>> even= list ->{
	 for(Integer n:list) {
		 if(n%2!=0) {
			 return false;
		 }
	 }
	 return true;
 };
 List<Integer> list=Arrays.asList(8,6,12,22);
 System.out.println(even.test(list));
 
	}

}
