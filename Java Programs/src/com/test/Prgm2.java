package com.test;

public class Prgm2 {

	public static void main(String[] args) {
		int a[]= {1,2,3,8,6,5,110,9,7,1};
		for (int i=0;i<=10;i++)
		{
			if(i==2) {
				continue;
			}
			else if(i==5)
				break;
			
	System.out.print(a[i]);
			
		}
	}

}
