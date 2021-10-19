package com.test;

class Mdain{
	 static String clg;
     String fg;
     int a;
}
public class stati_class_prgm2 {
    
	public static void main(String[] args) {
	
		Mdain ob1 =new Mdain();
		Mdain ob2 =new Mdain();
		Mdain.clg="SJCET";
		ob1.fg="ABC";
		ob2.fg="DEF";
		ob1.a=4;
		ob2.a=8;
		//ob1.clg="HAAA";
		//
		System.out.println("Name:"+ob1.fg+"\nNo"+ob1.a+"\nClgName:"+ob1.clg);
		ob2.clg="ehfdjk";
		System.out.println("Name:"+ob2.fg+"\nNo"+ob2.a+"\nClgName:"+ob2.clg);
		
		

	}

}
