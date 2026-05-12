package com.wipro.oops1.array;

public class Array {

	public static void main(String[] args) {
		
		int arr[]= {1,23,45,67,2};
		System.out.println("sum = "+arr(arr));
	}
		public static int arr(int[] arr) {
			int sum=0;
			for(int i=0;i<arr.length;i++) {
				sum=sum+arr[i];
			}
			return sum;
			
		}
	
}