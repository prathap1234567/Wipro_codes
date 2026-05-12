package com.wipro.springdemobean;
import java.util.List;

public class OrderService {
	
	int orderId;
	String customerName;
	PaymentService paymentService;	
	List<String> items;
	
		public OrderService(int orderId,String customerName,PaymentService paymentService) {
			
		this.orderId=orderId;
		this.customerName= customerName;
		this.paymentService= paymentService;
		
		}
		public OrderService(){
			
		}
		public void setItems(List<String> items) {
			
		     this.items=items;
		}
		
		public void placeOrder() {
			
	     	System.out.println("Order ID "+orderId);
	    	System.out.println("Customer Name "+customerName);
		    System.out.println("Items ");
		    
		for(String item:items){
		 
			System.out.println(item);
		
		}
		  paymentService.pay();
	}
}