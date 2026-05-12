package com.wipro.thread;

import java.util.concurrent.*;

public class CallableTest {

    public static void main(String[] args) {
       
        ExecutorService service = Executors.newSingleThreadExecutor();
        MyThreadCallable task = new MyThreadCallable();

        Future<Integer> f = service.submit(task);

        System.out.println("Waiting to return data");

        try {
            int result = f.get(); 
            System.out.println("Sum of first 10 even numbers= " + result);

        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        service.shutdown(); 
    }
}