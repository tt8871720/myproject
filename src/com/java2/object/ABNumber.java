package com.java2.object;

import java.util.Scanner;

public class ABNumber {
String num;
public ABNumber(String num){
	this.num = num; 
}
//驗證validate
public int validate(String secret){
	int result = 0;
	int length = secret.length();
	int len = num.length();
	for (int i = 0; i < length; i++) {
		for (int j = 0; j < len; j++) {
			char s = secret.charAt(i);
			char n = num.charAt(j);
			if (s == n & i == j) {
				result = result + 10;
				//break;
			} else {
				if (s == n) {
				result = result + 1; 
				}

			}

		}

	}
	return result;
}
}
