package com.one;

import java.util.Scanner;

public class Variable {
	//if else練習
	public static void main(String[] args) {
		System.out.println("fdf");
		for (int a = 7; a > 0; a--) {
			System.out.print("");
			for (int b = 8; b > a; b--) {
				System.out.print("/");
			}System.out.println();
		}
		
			
		System.out.println("請輸入你的年齡");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int age = Integer.parseInt(line);
		if (age < 13) {
			System.out.println("國小嗎?");
		} else {
			if (age < 18) {
				System.out.println("高中嗎?");
			} else {
				if (age < 22) {
					System.out.println("大學嗎?");
				} else {
					System.out.println("你讀研究所嗎?");
				}
			}
		}
	}
}
