package com.wipro.oops1.polymorphisms;
import java.util.*;
public class NotificationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Notification Type Email 1, SMS 2, WAN 3");
			
			Notification notification=null;
			
			int option= sc.nextInt();
			if(option==1)
			{
				notification= new EmailNotification();
			}
			else if(option==2)
			{
				notification= new SmsNotification();
			}
			else {
				notification= new WanNotification();
			}
			
			
			notification.send("Welcome");
			


	}

}
