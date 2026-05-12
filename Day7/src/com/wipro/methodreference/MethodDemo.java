package com.wipro.methodreference;

import java.util.List;
import java.util.stream.Collectors;

public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  List<String> list=List.of(" 10 "," 20 "," 30 ");
  List<Integer>result=list
		  .stream()
		  .map(String::trim)
		  .map(Integer::parseInt)
		  .collect(Collectors.toList());
  System.out.println(result);
	}

}
