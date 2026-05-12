package com.wipro.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer,List<Integer>> fn = new Function<>() {

			@Override
			public List<Integer> apply(Integer t){
				// TODO Auto-generated method stub
				List<Integer>list= new ArrayList<>();
				for(int i =0; i<t;i++) {
					list.add(i*2);
				}
				
				return list;
			}
		};
		int n=3; 
		List<Integer>even=fn.apply(n);
		System.out.println(even);
	}

}
