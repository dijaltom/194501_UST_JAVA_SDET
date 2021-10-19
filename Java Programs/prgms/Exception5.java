package com.ust.test;

public class Exception5 {

	public static void main(String[] args) {
		try {
			String a = "this is like chipping";
			char c = a.charAt(24);
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("StringIndexOutOfBoundsException");
			
		}
		

	}

}
