package com.wipro.junit;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class CalculaterTest {
	
		
		Calculator calc = new Calculator();
		
		@BeforeAll
		static void initialAll() {
			System.out.println("Starting Test");
		}
		
		@AfterAll
		static void lastAll() {
			System.out.println("Test ended");
		}
		
		@BeforeEach
		void setup() {
			System.out.println("Before each Test");
		}
		
		@AfterEach
		void tearDown() {
			System.out.println("After each test");
		}
		 @ParameterizedTest
		 @CsvSource({"10,5,15","59,1,60","8,8,16"})
		
		void testAdd(int num1,int num2,int expectedValue){
			assertEquals(expectedValue,calc.add(num1,num2));
		}
		 @ParameterizedTest
		 @CsvSource({"5,5,0","7,1,6","14,7,7"})
		
		void testSub(int num1,int num2,int expectedValue){
			assertEquals(expectedValue,calc.sub(num1,num2));
		}
		 @ParameterizedTest
		 @CsvSource({"8,8,64","11,2,22","5,6,30"})
		
		void testMul(int num1,int num2,int expectedValue){
			assertEquals(expectedValue,calc.mul(num1,num2));
		 }
		 @ParameterizedTest
		 @CsvSource({"14,7,2","6,3,2","80,8,10"})
		
		void testDiv(int num1,int num2,int expectedValue){
				assertEquals(expectedValue,calc.div(num1,num2));
		 }

	}
