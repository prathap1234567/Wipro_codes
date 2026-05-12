package com.wipro.springdemobean;

import org.springframework.stereotype.Component;

@Component
public class Passport {

	int passportNumber;
	@Override
	public String toString() {
		return "Passport [passportNumber=" + passportNumber + "]";
	}

	public int getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(int passportNumber) {
		this.passportNumber = passportNumber;
	}

}
