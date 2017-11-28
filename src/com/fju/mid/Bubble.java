package com.fju.mid;

public class Bubble {

	public static void main(String[] args) {
		int n[] = { 51, 23, 6, 65, 15 };
		for (int i = 0; i < n.length; i++) {
		for (int j = 1; j < n.length; j++) {
			if (n[i] > n[j]) {
				int tmp = n[i];
				n[i] = n[j];
				n[j] = tmp;
				continue;}else{
			System.out.print(n[i] + " ");
			}
			}

		}}
	}

