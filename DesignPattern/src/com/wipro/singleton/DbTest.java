package com.wipro.singleton;

public class DbTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DatabaseCon db1=DatabaseCon.getKey();
		System.out.println(db1);
		DatabaseCon.getConnection("here is your db1");
		DatabaseCon db2=DatabaseCon.getKey();
		System.out.println(db2);
		DatabaseCon.getConnection("here is your db2");
	}

}
