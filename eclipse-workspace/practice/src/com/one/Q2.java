package com.one;

public class Q2 {

	public static void main(String[] args) {
		// Q2//1-1000質數
				for (int a = 2; a <= 1000; a++) {
					boolean prime = true;
					for (int b = 2; b < a; b++) {
						if (a % b == 0) {
							prime = false;
							break;
						}
					}if (prime) {
						System.out.print(a + " ");
						/* 只印出不符合if式子,及印出(true) */

	}

}}}
