package com.java2.io;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamTest {

	public static void main(String[] args) throws FileNotFoundException{
		PrintStream out = new PrintStream("print.txt");
		out.println("200");
out.flush();
out.close();
	}

}
