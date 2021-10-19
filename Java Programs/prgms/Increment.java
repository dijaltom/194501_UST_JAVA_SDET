package com.test;

public class Increment {

	public static void main(String[] args) {
    int a=5,b=5,sum=0;
//    System.out.println("a="+a+"\nb="+b+"\nsum="+sum);
//    sum=a+b++;
    System.out.println("a="+a+"\nb="+b+"\nsum="+sum);
    sum=a-++b;
    System.out.println("a="+a+"\nb="+b+"\nsum="+sum);
	}

}
