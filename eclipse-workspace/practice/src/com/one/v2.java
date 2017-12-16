package com.one;

import java.util.Scanner;

public class v2 {

	public static void main(String[] args) {
		//判斷積偶數
		System.out.println("請輸入一個數字");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		if (n % 2 == 0) {
			System.out.println("偶數");
		} else {
			System.out.println("積數");
		}	
	}
}
