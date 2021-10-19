package com.test;

public class overloading_1 {

	int display(int a) {
		return a;
	}

	int display(int a, int b, int c) {
		return(a+b+c);
	}

	long display(int a, int b) {
		return(a*b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overloading_1 ob = new overloading_1();
	     System.out.println("first method: "+ ob.display(50));
	     System.out.println("second method: "+ ob.display(50,80,60));
	     System.out.println("third method: "+ ob.display(50,2));

	}

}
