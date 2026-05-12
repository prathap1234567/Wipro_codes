package com.wipro.methodreference;

import java.util.List;

public class Methodtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> nums=List.of(1,2,3,4);
		
           nums
    		  .stream()
    		  .map(Box::new)
              .forEach(System.out::println);
	}

}
