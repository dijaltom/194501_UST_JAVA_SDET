package com.ust.test.junit;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;


public class JTestExample1 {
	@BeforeClass
	public static void beforeclass() {
		System.out.println("In beforeClass method");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("In afterclass method");
	}
	@Before
	public void before() {
		System.out.println("In before method");
	}
	@After
	public void after() {
		System.out.println("In after method");
	}
	

	@Test
	public void test() {
		System.out.println("In TestCase");
		//fail("Not yet implemented");
		
	}
	@Test
	public void test1() {
		System.out.println("In TestCase1");
	}
	@Ignore
	@Test
	public void test2() {
		System.out.println("In testCase2");
	}

}
