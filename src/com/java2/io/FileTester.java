package com.java2.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTester {

	public static void main(String[] args) {
	try {
		FileOutputStream out = new FileOutputStream("data.txt");
		out.write(66);
		out.write(99);
		out.write(101);
		out.flush();
		out.close();
	} catch (FileNotFoundException e) {//catch裡是要找的錯誤
		// TODO Auto-generated catch block
		e.printStackTrace();//有錯誤時會顯示
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	}

}
