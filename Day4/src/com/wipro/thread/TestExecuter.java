package com.wipro.thread;

import java.util.concurrent.Executors;

public class TestExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Runnable r= new ExcecuterDemo();
		   
		   EXecuter service= Executors.newSingleThreadExecutor();
	       service.submit(r);
	       service.shutdown();
			

		}
	}

}
