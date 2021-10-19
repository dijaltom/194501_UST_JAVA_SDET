package com.ust.test;
import java.io.*;

public class Exception4 {
	public static void findFile() throws IOException{
		File newFile=new File("test.txt");
		FileInputStream stream=new FileInputStream(newFile);
	}

	public static void main(String[] args) {
		try {
			findFile();
		}catch(IOException e){
			System.out.println(e);
			
		}
		finally {
			System.out.println("There is file a not found exception");
		}
		

	}

}
