package com.wipro.collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MobileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Mobile> mobile= new PriorityQueue<>(Comparator.comparing(Mobile::getPrice).reversed());
		Mobile m1=new Mobile("Apple",90000);
		Mobile m2 = new Mobile("Samsung", 45000);
		Mobile m3 = new Mobile("OnePlus", 40000);
		Mobile m4 = new Mobile("Xiaomi", 20000);
		Mobile m5 = new Mobile("Realme", 18000);
		Mobile m6 = new Mobile("Oppo", 22000);
		Mobile m7 = new Mobile("Vivo", 21000);
		Mobile m8 = new Mobile("Google Pixel", 60000);
		Mobile m9 = new Mobile("Motorola", 25000);
		Mobile m10 = new Mobile("Nothing", 30000);
		
		mobile.offer(m1);
		mobile.offer(m2);
		mobile.offer(m3);
		mobile.offer(m4);
		mobile.offer(m5);
		mobile.offer(m6);
		mobile.offer(m7);
		mobile.offer(m8);
		mobile.offer(m9);
		mobile.offer(m10);
		
		System.out.println(mobile);
		mobile.remove();
		System.out.println(mobile);
		
	}

}
