package com.one;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// Q3//印出星星
		System.out.println("請輸入一個數字");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int w = Integer.parseInt(line);
				for (int i = w; i >=0; i--) {
					for (int j = w + 1; j > i; j--)
					System.out.print("*");
				System.out.println();
			}
			}
				
								

								}

