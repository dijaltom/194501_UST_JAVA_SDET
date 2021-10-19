package com.test;

class n{
	void speed(int v) {
		   System.out.println("first method: "+ v);
	}
}

public class overriding_1 extends n {
   void speed(int v) {
	   System.out.println("second method: "+ v);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overriding_1 i=new overriding_1();
		i.speed(20);
	}

}
