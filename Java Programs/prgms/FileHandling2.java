package com.ust.test;
import java.io.*;
public class FileHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("D:\\test2.txt");
		
		try {
			boolean value = f.createNewFile();
			if(value) {
				System.out.println("The new file is created");
			}
			else {
				System.out.println("The file already exists");
			}
		}
		catch(Exception e) {
			e.getStackTrace();
			}

	}

}
