package com.ust.test.junit;


import static org.junit.Assert.*;
import org.junit.Test;
 
public class DivisionTestCase2 {

	DivisionTest divisionTest = new DivisionTest(10, 5); 
	@Test
	public void test() {
		System.out.println("In DivisionTestCase2.test");
		assertEquals(2, divisionTest.division());
	}	
}
