package com.ust.test;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
public class FileHandlingStreamReader8 {

	public static void main(String[] args) {
		String data="This is a new line, in a new file";
		
		try {
			FileOutputStream f=new FileOutputStream("D:\\test8.txt");
			OutputStreamWriter o=new OutputStreamWriter(f);
			
			o.write(data);
			o.close();
			
			
			 
			
		}catch(Exception e) {
			e.getStackTrace();
		}
		// TODO Auto-generated method stub

	}

}
