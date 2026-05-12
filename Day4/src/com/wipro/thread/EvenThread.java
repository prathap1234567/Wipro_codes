package com.wipro.thread;


	public class EvenThread extends Thread {

	    public void run() {
	        int count = 0;

	        for (int n = 1; count < 20; n++) {
	            if (n % 2 == 0) {
	                System.out.println("Even: " + n);
	                count++;
	            }
	        }
	    }
	}