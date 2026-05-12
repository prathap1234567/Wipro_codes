package com.wipro.generic;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
      Box<String> box = new Box<String>();
      box.printTwo("Prathap");  
      Box<Integer> b = new Box<Integer>();
      b.printTwo(5); 
      Box<Float> f = new Box<Float>();
      f.printTwo(5.1f); 
      
	}

}
