package com.fju.mid;

public class Pbubble {

	public static void main(String[] args) {
	int n[] = {1,2,3,4,5,6};
	for (int i = 0; i < n.length; i++) {
		for (int j = i + 1; j < n.length; j++) {
			if(n[i] > n[j]) {
				/*System.out.println(i + "," + j);*/
			int tmp = n[i];
			n[i] = n[j];
			n[i] = tmp;
			}
				
		}
	}
	for(int num :n) {//num隨便設
		System.out.print(num + " ");
	}
	}
}
