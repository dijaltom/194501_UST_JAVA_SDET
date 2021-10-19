package com.ust.test.junit;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import static org.junit.Assert.*;
import org.junit.Test;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	DivisionTestCase1.class,
	DivisionTestCase2.class
})
class TestSuite {
	
	
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
}
