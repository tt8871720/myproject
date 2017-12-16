package com.one;

import java.util.Scanner;

public class dog {

	public static void main(String[] args) {
		//印出星星
		System.out.println("please key im a number");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int s = Integer.parseInt(line);
		for (int w = s; w > 0; w--) {
			System.out.print("");
			for (int d = s + 1; d > w ; d--) {
				System.out.print("*");
				
			}System.out.println();
	}

}}
