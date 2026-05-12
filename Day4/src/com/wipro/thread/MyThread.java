package com.wipro.thread;

public class MyThread extends Thread {
	
	public void run() {
		for(int i=0;i<=5;i++) {
			
			System.out.println(Thread.currentThread().getName()+"Thread RUnning");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
