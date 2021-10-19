package com.ust.test;

public class Exception8 {
	static void checkAge(int age) {
		if(age<18) {
			throw new ArithmeticException("Access Denied");
		}
		else {
			System.out.println("Access granted");
		}
	}

	public static void main(String[] args) {
		checkAge(7);
		

	}

}
