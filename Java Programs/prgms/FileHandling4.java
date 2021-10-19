package com.ust.test;
import java.io.*;
public class FileHandling4 {

	public static void main(String[] args) {
		String data="Hi, I am data. I am very big in size";
		try {
			FileWriter o= new FileWriter("D:\\test4.txt");
			o.write(data);
			System.out.println("Data available in file");
			
			o.close();
			
		}catch(Exception e) {
			e.getStackTrace();		}
		// TODO Auto-generated method stub

	}

}
