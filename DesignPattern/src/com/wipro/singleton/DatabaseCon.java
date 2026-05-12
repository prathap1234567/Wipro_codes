package com.wipro.singleton;

public class DatabaseCon {

	private static DatabaseCon db=null;
	
	private DatabaseCon(){
		
	}
	public static void getConnection(String dbinfo){
		System.out.println(dbinfo);
		
	}
	public static DatabaseCon getKey()
	 {
		 if(db==null)
		 {
			 db=new DatabaseCon();
		 }
		 return db;
		 
	 }

}
