package com.wipro.lamda;

public class EvendemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      IEven even=(num)->num%2==0;
      System.out.println(even.isEven(6));
	}

}
