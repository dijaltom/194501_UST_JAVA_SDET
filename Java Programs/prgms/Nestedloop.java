package com.test;

public class Nestedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<6;++i) {
			for(int j=1;j<5;++j) {
				if(i==5 || j==2)
				{
					continue;
				}
				
				System.out.print("\t"+i+j+"\n");
			}
		}
		
	}

}
