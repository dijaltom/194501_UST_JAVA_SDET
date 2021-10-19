package com.ust.test;
import java.io.FileReader;
import java.io.BufferedReader;
public class FileHandlingBufferReader9 {

	public static void main(String[] args) {
		char[] array=new char[100];
		try {
		
		FileReader f=new FileReader("D:\\test4.txt");
		BufferedReader i=new BufferedReader(f);
		
		i.read(array);
		System.out.println("data is in the file");
		System.out.println(array);
		i.close();
		
		// TODO Auto-generated method stub

	}catch(Exception e) 
	{
		e.getStackTrace();
	}
}	
}



