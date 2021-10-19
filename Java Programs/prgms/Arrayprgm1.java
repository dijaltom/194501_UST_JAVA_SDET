package com.test;

public class Arrayprgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,5,5,8,46,65},sum=0;
		System.out.println("==============================for loop===========================");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			sum+=a[i];
		}
		System.out.println("sum:"+sum);
		System.out.println("===================enhanced for loop==============================");
		for(int g:a) {
			System.out.println("=="+g);
		}
		System.out.println("total lenght:\n"+a.length+"\naverage of this array:"+(sum/a.length));
	}

}
