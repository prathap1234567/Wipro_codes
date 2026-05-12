package com.wipro.thread;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Thread Strated");
		MyThread m1=new MyThread();
		MyThread m2=new MyThread();
		m1.start();
		m2.start();
		
			try {
				m1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				m2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	
		System.out.println("My Thread Ended");


	}

}
