package com.ust.test.junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionTestCase1 {

	DivisionTest divisionTest1 = new DivisionTest(10, 2); 
	DivisionTest divisionTest2 = new DivisionTest(10, 0); 

	@Test
	public void test() {
		System.out.println("In DivisionTestCase1.test");
		assertEquals(5, divisionTest1.division());
	}

	@Test(expected = ArithmeticException.class)  
	public void testException() {
		System.out.println("In DivisionTestCase1.testException");
		assertEquals(5, divisionTest2.division());
	}
}
