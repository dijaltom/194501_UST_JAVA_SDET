package com.ust.test;
import java.io.*;
class FileHandling1 {

	public static void main(String[] args) {
		try {
			BufferedWriter b=new BufferedWriter(new FileWriter("D:\\test.txt"));
			b.write("hello" + "\n" + "karlos" + "\n");
			b.write("hello\n");
			b.write("hello\n");
			b.close();
			System.out.println("file created");
		}catch(Exception ex) {
			return;
		}
		

	}

}
