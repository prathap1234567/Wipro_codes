package com.wipro.lamda;

import java.util.function.Function;

public class FunctionLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, Long>fn =n->Long.valueOf(n*n)+100;
		System.out.println(fn.apply(5));
	}

}
