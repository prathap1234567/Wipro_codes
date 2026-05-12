package com.wipro.predicate;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Set<Integer>> checknull=new Predicate<>() {

			@Override
			public boolean test(Set<Integer> set) {
				// TODO Auto-generated method stub
				
				return set.contains(null);
			}
			
		};
		Set<Integer> set=new HashSet<>();
		set.add(55);
		set.add(45);
		set.add(14);
		set.add(null);
		
		System.out.println(checknull.test(set));
	

	}

}
