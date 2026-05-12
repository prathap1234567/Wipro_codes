package com.wipro.optional;

import java.util.Optional;

public class EmptyOpitional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
       Optional<String> opt=Optional.empty();
       if(opt.isPresent()) {
    	   System.out.println(opt.get());
       }
       else {
    	   System.out.println("No value");
       }
	}

}
