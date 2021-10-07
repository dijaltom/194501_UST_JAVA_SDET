package com.test;

public class this_prgm2 {
	int a;
	int b;

	this_prgm2() {
		this(10, 50);
	}

	this_prgm2(int a, int b) {
		System.out.println(this.a);
		this.a = a;
		this.b = b;
		System.out.println(a + "," + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		this_prgm2 rt = new this_prgm2();
	}

}
