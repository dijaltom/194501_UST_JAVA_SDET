package com.ust.test;

public class Exception6 {

	public static void main(String[] args) {
		try {
			int num=Integer.parseInt("aka");
			System.out.println(num);
		
		}catch(NumberFormatException e) {
			System.out.println("NumberFormatException");
		}

	}

}
