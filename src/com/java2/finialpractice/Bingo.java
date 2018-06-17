package com.java2.finialpractice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Bingo {
	
	public static void main(String[] args) {
List<Integer> num = new ArrayList<>();
		try {
			FileReader fi = new FileReader("bingo.txt");
			BufferedReader bu = new BufferedReader(fi);
			String line = bu.readLine();
			int data = Integer.parseInt(line);
			int frame = (int) Math.sqrt(data);
			System.out.println("邊寬 :" + frame);
			for (int i = 1; i <= data; i++) {
				num.add(i);}
			 Collections.shuffle(num);
				System.out.println(num + "\t");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


	}

}
