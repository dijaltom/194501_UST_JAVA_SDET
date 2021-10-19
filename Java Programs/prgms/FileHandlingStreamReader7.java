package com.ust.test;
import java.io.InputStreamReader;
import java.io.FileInputStream;
public class FileHandlingStreamReader7 {

	public static void main(String[] args) {
		
		char[] array=new char[100];
		
		try {
			FileInputStream f=new FileInputStream("D:\\test4.txt");
			InputStreamReader i=new InputStreamReader(f);
			
			i.read(array);
			System.out.println("data in the stream");
			System.out.println(array);
			i.close();
			
			
		}catch(Exception e) {
			e.getStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
