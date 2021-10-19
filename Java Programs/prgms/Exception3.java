package com.ust.test;

public class Exception3 {

	public static void main(String[] args) {
		try {
			int divideByZero=5/0;
		}
		catch(ArithmeticException e) {
			System.out.println("ArthimeticException => " +e.getMessage() );
			
		}
		finally {
			System.out.println("This is the final block");
		
		}

	}

}
