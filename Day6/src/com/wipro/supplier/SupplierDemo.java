package com.wipro.supplier;

import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier <Double> randomnum=new Supplier<>() {

			@Override
			public Double get() {
				// TODO Auto-generated method stub
				return Math.random();
			}
			
		};
		try {
			System.out.println(randomnum.get());
			Thread.sleep(10);
			System.out.println(randomnum.get());
			Thread.sleep(10);System.out.println(randomnum.get());
			Thread.sleep(10);
		}catch(Exception ex) {
			
		}
		
		

	}

}
