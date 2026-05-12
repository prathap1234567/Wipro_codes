package com.wipro.thread;


public class OddThread extends Thread {
	
	    public void run() {
	        int count = 0;
	        for (int i = 1;i<= 40; i++) {
	            if (i % 2 != 0) {
	                System.out.println("Odd: " + i);
	                count++;
	            }
	        }
	    }
	}
  
 

