package com.fju.mid;

public class Bubble {

	public static void main(String[] args) {
		int n[] = { 51, 23, 6, 65, 15 };
		for (int i = 0; i < n.length; i++) {
		for (int j = 0; j < n.length; j++) {/* j = i +1*/
			if(n[j] > n[i]){
				int tmp = n[j];
				n[j] = n[i];
				n[i] = tmp;
				continue;
				}

	}}for(int p = 0;p<n.length;p++){
		System.out.print(n[p] + " ");}}}

