package com.ust.test;
import java.io.*;
public class FileHandlingNew6 {

	public static void main(String[] args) {
		File f=new File("D:\\test6.txt");
		boolean value=f.mkdir();
		if(value) {
			System.out.println("File has been created");
		}else {
			System.out.println("File already exists");
		}
		
		// TODO Auto-generated method stub

	}

}
