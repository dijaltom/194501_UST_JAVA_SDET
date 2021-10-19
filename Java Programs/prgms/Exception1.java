package com.ust.test;

public class Exception1 {

	public static void main(String[] args) {
		String str="abc";
		String str1=null;
		try {
		System.out.println(str1.length());
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	

	}

}
