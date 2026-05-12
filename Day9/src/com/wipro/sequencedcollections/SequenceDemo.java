package com.wipro.sequencedcollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SequenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> list= new ArrayList();
		list.add("Prathap");
		list.add("Dhoni");
		list.add("Virat");
		list.add("Rohit");
		list.add("Jaddu");
		String val=list.getFirst();
		String val1=list.getLast();
		list.add("Hardik");
		System.out.println(val);
		System.out.println(val1);
		list.addFirst("Sachin");
		list.addLast("Sanju");
		System.out.println(list);
		List<String> str=list.reversed();
		System.out.println(str);
	}

}
