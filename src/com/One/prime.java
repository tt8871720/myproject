package com.One;

public class prime {

	public static void main(String[] args) {
		int n = 5;
		boolean prime = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				prime = false;
				break;
			}
		}
		if (prime) {
			System.out.println(n + " IS PRIME NUMBER");
		} else {
			System.out.println(n + " NOT PRIME NUMBER");

		}
	}
}
