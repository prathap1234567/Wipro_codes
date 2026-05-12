package com.wipro.factory;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("Specify Shape");
		Scanner sc=new Scanner(System.in);
		String type=sc.next();
		Shape shape=ShapeFactory.getObject(type);
		shape.shapeReq(" Your Required Shape");
}
}