package com.One;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("請輸入一個數字");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int p = Integer.parseInt(line);
		if (p % 2 == 0) {
			System.out.println("是偶數");
		} else {
			System.out.println("是基數");
		}
	}
}
