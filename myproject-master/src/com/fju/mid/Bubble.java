package com.fju.mid;

public class Bubble {

	public static void main(String[] args) {
		int n[] = { 1,2,3,4,5,6 };
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j <n.length; j++) {
				if (n[j] > n[i]) {
					int tmp = n[j];
					n[j] = n[i];
					n[i] = tmp;
					continue;

				}

			}
			
		}
		for (int p = 0; p < n.length; p++) {
			System.out.print(n[p]+ " ");

		}	}
}
