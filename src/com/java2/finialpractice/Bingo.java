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
import java.util.Scanner;

public class Bingo {
	List<Integer> num = new ArrayList<>();

	public static void main(String[] args) {
		Bingo bingo = new Bingo();
		bingo.print();
		bingo.play();
		bingo.after();
	}

	public void print() {
		List<Integer> num = new ArrayList<>();

		try {
			FileReader fi = new FileReader("bingo.txt");
			BufferedReader bu = new BufferedReader(fi);
			String line = bu.readLine();
			int data = Integer.parseInt(line);
			int frame = (int) Math.sqrt(data);
			System.out.println("邊寬 :" + frame);
			for (int i = 1; i <= data; i++) {
				// System.out.println(i);
				num.add(i);
				Collections.shuffle(num);
			}
			// System.out.println(num + "\t");}
			for (int j = 0; j < num.size(); j++) {
				
				if (num.get(j) < 10) {
					System.out.print(num.get(j) + "\t");
				} else {
					System.out.print(num.get(j) + "\t");
				}
				if (j % 5 == 4) {
					System.out.println();
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void play() {
		int a = 1;
		while (a != 0) {
	
			System.out.println("請輸入一個數字");
			Scanner scan = new Scanner(System.in);
			int enter = scan.nextInt();
			int chose = 0;
			if (enter == 0) {
				System.out.println("Game Over");
				a = 0;
			} else {
				for (int i = 0; i < num.size(); i++) {
					if (enter == num.get(i)) {
						int c = num.get(i);
						c = chose;
						break;
					
					}
				}
			}
		}
	}

public void after() {
		for (int j = 0; j < num.size(); j++) {
			System.out.println(num.get(j));
		}
	}
}
