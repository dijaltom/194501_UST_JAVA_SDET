package com.test;
class d{
	String g()
	{
		return ("How are you?");
	}
}
public class overriding_2 extends d{
	String g()
	{
		return ("World");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overriding_2 h=new overriding_2();
		System.out.println("Hello "+h.g());
		d r=new d();

		System.out.println("Hello,"+r.g());
	}

}
