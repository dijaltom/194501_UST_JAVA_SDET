package com.test;

public class Prgm3 {
  int a,h;
  boolean b,c;
  String name; 
  private Prgm3() {
		h=3;
		c=true;
		name="Hello";
  }
  public Prgm3(String n) {
	  name=n;
  }
  public void name()
  {
	  System.out.println("==="+name);
  }
	public static void main(String[] args) {
	// TODO Auto-generated method stub
Prgm3 ob=new Prgm3();
Prgm3 obj=new Prgm3(".net");
obj.name();
ob.name();
System.out.println("a="+ob.a);
System.out.println("b="+ob.b);
System.out.println("h="+ob.h);
System.out.println("c="+ob.c);
	}

}
