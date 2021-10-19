package com.ust.test;

public class WrapperClass2 {

	public static void main(String[] args) {
		
		Integer aObj=Integer.valueOf(23);
		Double bObj=Double.valueOf(23.2225);
		int a=aObj.intValue();
		double b=bObj.doubleValue();
		
		System.out.println("The value of a: " + a);
		System.out.println("The value of b: " + b);
		
		
		// Here we are converting objects into primitive using wrapper class

	}

}
