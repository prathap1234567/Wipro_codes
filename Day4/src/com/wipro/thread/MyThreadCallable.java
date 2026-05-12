
package com.wipro.thread;

import java.util.concurrent.Callable;

public class MyThreadCallable implements Callable<Integer> {
	
    public Integer call() {
	int sum=0;
     for (int i = 1; i <= 10; i++) {
         sum += (2 * i);
     }

     return sum;
}
    
}