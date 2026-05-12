package com.wipro.oops1.test;

import com.wipro.oops1.inheritance.Circle;
import com.wipro.oops1.inheritance.Rectangle;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle=new Circle();
		circle.radius();
	    circle.colour="red";
	    System.out.println("colour of circle - "+circle.colour);
	    
		Rectangle rectangle=new Rectangle();
		rectangle.colour="blue";
		 System.out.println("colour of rectangle - "+rectangle.colour);
		rectangle.draw();
		

	}

}
