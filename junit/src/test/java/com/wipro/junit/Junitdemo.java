package com.wipro.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Junitdemo {

	@Test
	void arrLength() {
		int arr[]= {23,45,54,21,7};
		assertEquals(5,arr.length);
	}

}
