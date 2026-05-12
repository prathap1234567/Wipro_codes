package com.wipro.oops1.polymorphisms;

public class SmsNotification implements Notification {

	@Override
	public void send(String message) {
		// TODO Auto-generated method stub
		System.out.println("SMS notification "+message);
		
	}

}
