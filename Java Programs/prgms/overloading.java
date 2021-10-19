package com.test;
 class Ay{
	 int a, b;
	 float ar,br;
	 void display() {
		 System.out.println("Vlaue is:"+5);		 
	 }
	 void display(int g,int h)
	 {
		 a=g;
		 b=h;
		 System.out.println("value is"+a+b);
	 }
 }
public class overloading {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Ay r =new Ay();
   r.display();
   r.display(66, 50);
	}

}
