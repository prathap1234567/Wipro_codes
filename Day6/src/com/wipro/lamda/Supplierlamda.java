package com.wipro.lamda;

import java.util.function.Supplier;

public class Supplierlamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Supplier<String> otp=()->""+ ((int)(Math.random()*900000)+100000);
  System.out.println(otp.get());
		
	}

}
