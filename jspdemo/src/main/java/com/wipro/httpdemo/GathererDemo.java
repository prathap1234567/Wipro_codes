package com.wipro.httpdemo;

import java.util.List;
import java.util.stream.Gatherers;

public class GathererDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> s=List.of("Prathap","Ragul","Deepak","Sharma","Dhoni","virat");
		System.out.println("--Fixed Window--");
		s.stream().gather(Gatherers.windowFixed(2)).forEach(System.out::println);
		System.out.println("--Fixed Window--");
		System.out.println("--Sliding Window--");
	    s.stream().gather(Gatherers.windowSliding(2)).forEach(System.out::println);
		System.out.println("--Sliding Window--");
		System.out.println("--Fold--");
		s.stream().gather(Gatherers.fold(()->"",(con,name)-> con+ "-" + name))
		.forEach(System.out::println);
	}

}
