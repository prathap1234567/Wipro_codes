package com.wipro.oops1.polymorphisms;

public class UserLogin {

	String login(String username, String password) {
		return username + password  ;
	}
	String login(String email, int otp) {
		return email + otp ;
		
	}
	Long login(long mobileNumber) {
		
		return mobileNumber  ;
		
	}
	
	
}
