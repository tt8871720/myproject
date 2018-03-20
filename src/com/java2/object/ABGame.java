package com.java2.object;

public class ABGame {

	public static void main(String[] args) {
		String secret = "6413";
		String number = "6234";
		int a = 0;
		int b = 0;
		int length = secret.length();
		int len = number.length();
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < len; j++) {
				char s = secret.charAt(i);
				char n = number.charAt(j);
				if (s == n & i == j) {
					a = a + 1;
				} else {
					if (s == n) {
						b = b + 1;
					}

				}

			}

		}System.out.println(a + "A" + b + "B");
	}
}
