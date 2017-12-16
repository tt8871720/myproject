package com.one;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		//乘法表  判斷質數 boolean true false
		for (int t = 1; t < 10; t++) {
			for (int n = 3; n <= 6; n++) {
				System.out.print(n + " x " + t + " = " + (t * n) + "\t");
			}
			System.out.println();
		}//"\t"向右空格對齊
		int p = 2;
		for (int j = 5; j <= 10; j++) {
			if (2 * j < 10) {
				System.out.println("2 x " + j + " =  " + (2 * j));
			} else {
				System.out.println("2 x " + j + " = " + (2 * j));
			}
		}
		System.out.println("輸入一個數字");
Scanner scanner = new Scanner(System.in);
String line = scanner.nextLine();
int b = Integer.parseInt(line);
		boolean prime = false;
		for (int i = 2; i < b; i++) {
			if (b % i == 0) {
				prime = true;
				break;
			}
		}
		if (prime) {
			System.out.println("不是質數");
		} else {
			System.out.println("是質數");
		}
	}
}
