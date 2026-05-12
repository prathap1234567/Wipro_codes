package com.wipro.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<List<Integer>> cons=new Consumer<>(){
			
			@Override
			public void accept(List<Integer>list){
				int sum= 0;
				for (Integer i : list){
					if (i%2== 0) { 
						sum=sum+ i;
					}
				}
				
				System.out.println("Sum of even numbers: " + sum);
			}
		};
		
		List<Integer> list = Arrays.asList(1, 5, 6, 8, 19);
		cons.accept(list);

}
}
