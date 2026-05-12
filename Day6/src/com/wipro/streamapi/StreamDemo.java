package com.wipro.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<String> str= Arrays.asList("prathap","rajesh","gokul","gokul","Ramu");
      
      Predicate<String> p=n->n.length()%2==0;
      Function<String,String>f=n -> n.toUpperCase();
      List<String> result=str
    		  
      .stream()
      .distinct()
      .filter(p)
      .map(f)
      .collect(Collectors.toList());
      System.out.println(result);
	}

}
