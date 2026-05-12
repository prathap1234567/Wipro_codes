package com.wipro.state;

public class AuthorizedState implements ATMState {

	@Override
	public void handle() {
		
		System.out.println("Withdrawal allowed");
	}

}