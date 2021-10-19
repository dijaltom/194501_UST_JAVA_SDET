package com.ust.test;

public class GenericsClassExample1 {

	public static void main(String[] args) {
		GenericsClass<Integer> intObj = new GenericsClass<>(5);
		System.out.println("Generic class returns: " + intObj.getData());
		
		
		GenericsClass<String>stringObj=new GenericsClass<>("Java programming");
		System.out.println("Genreic class returns" + stringObj.getData());
	}

}
class GenericsClass<T>{
	private T data;
	public GenericsClass(T data) {
		this.data=data;
	}
	public T getData() {
		return this.data;
	}
		
	}

