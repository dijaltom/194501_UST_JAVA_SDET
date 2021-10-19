package com.ust.test;

public class WrapperClass1 {

	public static void main(String[] args) {
		int a=5;
		double b=5.55;
		
		Integer aObj=Integer.valueOf(a);
		Double bObj=Double.valueOf(b);
		
		if(aObj instanceof Integer) {
			System.out.println("An object of Integer is created");
		}
		
		if(bObj instanceof Double) {
			System.out.println("An object of Double is created");
		}
		// Here we converted primitive data types into objects

	}

}
