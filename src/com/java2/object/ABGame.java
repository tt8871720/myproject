package com.java2.object;

import java.util.Scanner;

public class ABGame {

	public static void main(String[] args) {
		String secret = "6413";
		// String number = "6341";
		int a = 0;
		int b = 0;
		while (a != 4) {
			/* AB歸零 */
			a = 0;
			b = 0;
			System.out.print("請輸入一組數字");
			Scanner scanner = new Scanner(System.in);
			String number = scanner.nextLine();
			int length = secret.length();
			int len = number.length();
			for (int i = 0; i < length; i++) {
				for (int j = 0; j < len; j++) {
					char s = secret.charAt(i);
					char n = number.charAt(j);
					if (s == n & i == j) {
						a++;
						//break;
					} else {
						if (s == n) {
							b++;
						}

					}

				}

			}
			System.out.println(a + "A" + b + "B");
		}
	}
}
