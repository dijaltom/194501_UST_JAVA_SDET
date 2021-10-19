package com.ust.test;
import java.io.*;
public class FileHandling3 {

	public static void main(String[] args) {
		char[] array = new char[100];
		try {
		FileReader i=new FileReader("D:\\test2.txt");
		i.read(array);
		System.out.println("Data in the file:");
		System.out.println(array);
		i.close();
		
		// TODO Auto-generated method stub

	}catch(Exception e){
		e.getStackTrace();
		
	}
		
	}

}
