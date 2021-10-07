package com.test;
import java.util.*;
public class Limitloop {
static Scanner h=new Scanner(System.in);
public static void main(String []args){
	int sum=0,b;
	System.out.println("Enter the number:");
	b=h.nextInt();
	while(b>=0) {
		sum+=b;
		System.out.println("Enter the number:");
		b=h.nextInt();
		
	}
	System.out.print("===>Sum"+sum);
	h.close();
	do {
		sum+=b;
		System.out.println("Enter the number:");
		b=h.nextInt();
	}
	
	while(b>=0);
	System.out.print("===>Sum"+sum);
	h.close();
	
	
}
}
