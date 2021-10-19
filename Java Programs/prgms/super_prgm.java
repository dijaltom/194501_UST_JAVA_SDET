package com.test;
class A{
	A(){
		System.out.println("HAI");
	}
void fg()	{
	System.out.println("wsgfjc");
}
}
class B extends A{
	B()
	{
		
		super();
		super.fg();
		
	}
	void fg()	{
		System.out.println("hello");
	}
}
public class super_prgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 B t=new B();
 t.fg();
 
	}

}
