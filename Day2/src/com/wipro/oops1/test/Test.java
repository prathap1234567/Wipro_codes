package com.wipro.oops1.test;

import com.wipro.oops1.inheritance.Bird;
import com.wipro.oops1.inheritance.Human;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird=new Bird();
		bird.fly();
		bird.name="peacock";
		System.out.println("The bird name is: " + bird.name);
		Human human=new Human();
		human.sleeping();
		human.speak();

	}

}
