package com.test;

import java.util.Scanner;

class Ga{
	Scanner sc= new Scanner (System.in);
	public 	int n;
	public void ut() {
	
		System.out.println("Enter The Number:\n");
		n=sc.nextInt();
	}
	
   protected void f() {
	   if(n%2==0) {
			System.out.println("Even Number");
	   }
	   else
		   System.out.println("Odd Number");
   }
	
}
public class Number {
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
   Ga h=new Ga();
   h.ut();
   h.f();
	}

}
