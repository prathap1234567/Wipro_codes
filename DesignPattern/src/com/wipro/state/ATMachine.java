package com.wipro.state;

public class ATMachine {

	ATMState state;

	public void setState(ATMState state) {
		this.state = state;
	}
	
	void checkATM()
	{
		state.handle();
	}

}