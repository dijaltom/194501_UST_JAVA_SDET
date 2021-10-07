package com.test;
import java.util.*;
class c1 {
	void t() {
		System.out.println("Hello");
	}
}

class c2 extends c1 {
	void c() {
		System.out.println("How \nare");
	}
}

class c3 extends c2 {
	void d() {
		System.out.println("You?");
	}
}

public class Hierarchical_inheritance extends c3 {
Scanner g=new Scanner(System.in);
int a;
 void g() {
	 
			System.out.println("Enter a number : ");
			a=g.nextInt();
			System.out.println("Good!pressed number: "+a);
		
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Hierarchical_inheritance o =new  Hierarchical_inheritance();
		 c1 n=new c3();
		 n.t();
		o.t() ;
		o.c();o.d();
		o.g();
	}
}
