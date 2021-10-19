package com.ust.test;

public class Exception2 {

	public static void main(String[] args) {
		int a=0, b=10;
		int c=b/a;
		System.out.println(c);
		try {
			c=b/a;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		

	}

}
