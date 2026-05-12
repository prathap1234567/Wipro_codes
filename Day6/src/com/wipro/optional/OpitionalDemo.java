package com.wipro.optional;

import java.util.Optional;

public class OpitionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="";
		Optional<String> user=Optional.ofNullable(str);
		String result=user.orElse("Guest");
		if(user.isPresent() && result==null) {
			result="unknown";
		}
		System.out.println(result);

	}

}
