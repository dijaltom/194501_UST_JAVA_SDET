package com.ust.test.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivisionTest {
	
	int num1, num2;	
	public DivisionTest(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}	
	public int division() throws ArithmeticException{
		return num1/num2;
	}
}
