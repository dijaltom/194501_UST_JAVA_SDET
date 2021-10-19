package com.test;
import java.util.*;
public class Switchcase {
	Scanner sc=new Scanner(System.in);
	int a,b;
	char t;
    public void s() {
    	System.out.println("Enter the First Value and Second Value");
    	a=sc.nextInt();
    	b=sc.nextInt();
    	System.out.println("Enter the operator:");
    	t=sc.next().charAt(0);
    	
    }
public void n() {
    	switch(t)
    	{
    	case '+':
    		System.out.println(a+"+"+b+"="+(a+b));
    		break;
    	case '-':
    		System.out.println(a+"-"+b+"="+(a-b));
    		break;
    	case '*':
    		System.out.println(a+"*"+b+"="+(a*b));
    		break;
    	case '%':
    		System.out.println(a+"%"+b+"="+(a%b));
    		break;
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Switchcase g=new Switchcase();
    g.s();
    g.n();
	}

}
