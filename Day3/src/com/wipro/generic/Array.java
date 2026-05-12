package com.wipro.generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
    List<String> list = new ArrayList<>();
     list.add("prathap");
     list.add("laptop");
	 list.add("mobile");
	 list.add("notepad");
	 list.add("word");
	System.out.println(list);
	
	System.out.println("The Element "+list.get(2));
	
	Collections.sort(list);
    System.out.println("Ascending "+list); 
    
    Collections.sort(list,Comparator.reverseOrder());
    System.out.println("Descending "+list); 
    
    list.remove(2);
    System.out.println(list); 
    
    for(int i=0;i<list.size();i++) 
    {
    	System.out.println(list.get(i));
    }
    
    for(String i:list)
	{
		System.out.println(i);
	}

    list.clear();
	System.out.println(list);




	}

}
