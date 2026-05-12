package com.wipro.oops1.polymorphisms;

public  class EmailNotification implements Notification{

	@Override
	public void send(String message) {
		// TODO Auto-generated method stub
		System.out.println("EmailNotification "+message);
		
	}
	

}
