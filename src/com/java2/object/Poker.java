package com.java2.object;

import java.util.Random;

public class Poker {
	String flowers = "SDHC";
	int cards[] = new int[52];
	Random random = new Random();

	public Poker() {
		for (int i = 0; i < cards.length; i++) {
			cards[i] = i;
			System.out.println((i % 13) + 1 + "" + (flowers.charAt(i / 13)) + "");
		}
	}

	public void shuffle() {
		for (int i = 0; i < cards.length; i++) {
			int s = random.nextInt(52);
			int tmp = cards[i];
			cards[i] = cards[s];
			cards[s] = tmp;
		}
	}

	public void show(){
		for (int i = 0; i < cards.length; i++) {
			int c = cards[i];
			System.out.print((c % 13) + 1 + "" + (flowers.charAt(c / 13)) + " ");
/*每十三個換行*/			if (i % 13 == 0) {
				System.out.println();
			}
		}
	}
}
