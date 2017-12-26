package com.kao;

import java.util.Scanner;

public class Final {
	public static void main(String[] args) {
		int h = -1;
		int p = 0;
		while (h < 0) {
			System.out.println("販賣機餘額:" + p);
			System.out.println("請投幣或選擇飲料(a,b或c),或輸入0結束");
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			
			switch (line) { 
			case "5":
				p = p + 5;
				break;
			case "10":
				p = p + 10;
				break;
			case "1":
				p = p + 1;
				break;
			case "0": h =1;break;
			case "a":
				if (p - 15 >= 0) {
					p = p - 15;
					System.out.println("DON!");
					System.out.println("販賣機餘額:" + p);
				} else {
					System.out.println("BEEP!");
				}break;
			case "b":
				if (p - 20 >= 0) {
					p = p - 20;
					System.out.println("DON!");
					System.out.println("販賣機餘額:" + p);
				} else {
					System.out.println("BEEP!");
				}break;
			case "c":
				if (p - 30 >= 0) {p = p - 30;
					System.out.println("DON!");
					System.out.println("販賣機餘額:" + p);
				} else {
					System.out.println("BEEP!");
				}break;
			}
		}
	}
}
