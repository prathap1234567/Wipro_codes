package com.wipro.optional;

import java.util.Optional;

public class HelloOpitional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hello";
		 Optional<String> opt= Optional.of(str);
		 System.out.println(opt.get());

	}

}
