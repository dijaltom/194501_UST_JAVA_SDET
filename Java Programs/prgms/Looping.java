package com.test;

public class Looping {
    static int a[];
    static float j=0,s=0,u,o;
	public static void main(String[] args) {
    for(int i=1;i<=10;i++)
    { 
    	System.out.println(i);
    }
		
    System.out.println("================================================================");
	while(j<=10) {
		System.out.println("==>"+s);
		s=s+j+2.5f;
		j++;
	}
	System.out.println("================================================================");
	do 
	{
		System.out.println("_______________"+u);
		u++;
	}
	while(u<=10);
	}
}
