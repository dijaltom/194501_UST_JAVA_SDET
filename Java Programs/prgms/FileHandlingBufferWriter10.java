package com.ust.test;
import java.io.FileWriter;
import java.io.BufferedWriter;
public class FileHandlingBufferWriter10 {

	public static void main(String[] args) {
		String data="I am writing to you in this regard";
		try {
			FileWriter f=new FileWriter("D:\\test10.txt");
			
			BufferedWriter b=new BufferedWriter(f);
			
			b.write(data);
			b.close();
			System.out.println("New file created");
			
		}catch(Exception e) {
			e.getStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
