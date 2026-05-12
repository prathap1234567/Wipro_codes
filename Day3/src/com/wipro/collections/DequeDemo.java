package com.wipro.collections;

import java.util.LinkedList;


import java.util.Deque;


public class DequeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Deque <String> name=new LinkedList<>();
		name.offer("prathap");
		name.offer("ram");
		name.offer("candran");
		name.offer("gokul");
		name.offerLast("ashis");
		System.out.println(name);
		name.removeFirst();
		System.out.println(name);


	}

}
