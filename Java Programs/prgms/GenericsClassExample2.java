package com.ust.test;

public class GenericsClassExample2 {

	public static void main(String[] args) {
		
		DemoClass demo =new DemoClass();
		
		demo.<String>genericsMethod("Java programming");
		
		demo.<Integer>genericsMethod(25);
		// TODO Auto-generated method stub

	}

}

class DemoClass{
	public <T> void genericsMethod(T data) {
		System.out.println("Generics Method:");
		System.out.println("Data passed" + data);
	}
}
