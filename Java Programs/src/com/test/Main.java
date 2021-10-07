package com.test;

public class Main {
public int b;
public String h;
public float ba;
public void display(int a,String y,float t ) {
	b=a;
	h=y;
	ba=t;
	System.out.println("Hello my dear "+h+" id number :"+a+" and your salary will be "+t);
}
public static void main(String []args)
{
	Main er = new Main();
	er.display(8,"bibin", 50.8f);
}
}
