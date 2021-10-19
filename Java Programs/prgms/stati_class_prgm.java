package com.test;

class Static{
	static int a;
	static String b;
    static void  Satic() {
		System.out.println("Number:"+a);
		System.out.println("Name:"+b);
	}
}

public class stati_class_prgm {
   static int count=0;
   public void incr() {
	   count++;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Static oj=new Static();
      oj.a=4551;
      oj.b="ghjkedgf";
      oj.Satic();
      stati_class_prgm vg=new stati_class_prgm();
      vg.incr();
      System.out.print("==============>"+vg.count);
	}

}
