package com.wipro.collections;
import java.util.Stack;
public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Stack <Integer> num=new Stack<>();

        Stack<Integer> stack = new Stack<>();
        stack.push(52);
        stack.push(47);
        stack.push(49);
        stack.push(10);
        stack.push(63);
        System.out.println(stack);
      
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        

        
	}

}
