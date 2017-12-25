package com.kao;

import java.util.Scanner;

public class Final {

	public static void main(String[] args) {
		int a = -1;
		int p = 0;
		System.out.println("販賣機餘額:" + p);
		while (a < 0) {
			System.out.println("請投幣或選擇飲料(a,b或c),或輸入0結束");
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			int e = Integer.parseInt(line);
			System.out.println("販賣機餘額:" + (p + e));

		}

	}
}