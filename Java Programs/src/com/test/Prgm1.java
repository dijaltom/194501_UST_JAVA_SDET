package com.test;

import java.util.Scanner;

public class Prgm1 {
	int n=5;
	static Scanner sc=new Scanner(System.in);
public static void main(String [] args) {


	System.out.println("Enter your age:"+"\n");
	int b=sc.nextInt();
	if(b<18) 
		System.out.println("Oops!");
	
		else
			System.out.println("Wow!");
	
}
}
