package com.wipro.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MobileSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <MobileSetDemo> mobile=new HashSet<>();
		MobileSetDemo m1=new MobileSetDemo("Apple",15,90000);
		MobileSetDemo m2 = new MobileSetDemo("Samsung", 15, 75000);
		MobileSetDemo m3 = new MobileSetDemo("OnePlus", 10, 55000);
		MobileSetDemo m4 = new MobileSetDemo("Xiaomi", 20, 25000);
		MobileSetDemo m5 = new MobileSetDemo("Realme", 18, 22000);
		MobileSetDemo m6 = new MobileSetDemo("Oppo", 14, 30000);
		MobileSetDemo m7 = new MobileSetDemo("Vivo", 16, 28000);
		MobileSetDemo m8 = new MobileSetDemo("Google Pixel", 8, 80000);
		MobileSetDemo m9 = new MobileSetDemo("Motorola", 11, 27000);
		MobileSetDemo m10 = new MobileSetDemo("Nothing", 9, 35000);
		mobile.add(m1);
		mobile.add(m2);
		mobile.add(m3);
		mobile.add(m4);
		mobile.add(m5);
		mobile.add(m6);
		mobile.add(m7);
		mobile.add(m8);
		mobile.add(m9);
		mobile.add(m10);
		
		Iterator<MobileSetDemo> m= mobile.iterator();
		while(m.hasNext())
		{
			System.out.println(m.next());
		}


	}

}
