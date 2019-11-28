package com.ustglobal.filehandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReadingClass {

	public static void main(String[] args) {

		String path = "C:\\Users\\dell\\Desktop\\text.txt";
		FileReader reader = null;
		try {
			reader = new FileReader(path);  // this line may throw exception so handle it here only
			//			int i1 = reader.read();  //return type of read method is integer
			//			char ch1 = (char)i1;     // here we have type casted
			//			System.out.println(ch1);
			//			
			//			int i2 = reader.read();
			//			char ch2 = (char)i2;
			//			System.out.println(ch2

			//instead of above use while loop

			int i;
			while((i=reader.read())!=-1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}// end of main
}//end of FileReadingClass
