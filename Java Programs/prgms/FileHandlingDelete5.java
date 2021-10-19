package com.ust.test;
import java.io.*;
public class FileHandlingDelete5 {

	public static void main(String[] args) {
		File f=new File("D:\\test5.txt");
		
		boolean value = f.delete();
		if(value) {
			System.out.println("The file is deleted");
		}
		else {
			System.out.println("The file is not deleted");
		}
		// TODO Auto-generated method stub

	}

}
