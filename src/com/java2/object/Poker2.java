package com.java2.object;

import java.util.ArrayList;
import java.util.Random;

public class Poker2 {
	String flowers = "SDHC";
	ArrayList<Integer> cards = new ArrayList<>();
	Random random = new Random();

	public Poker2() {
		for (int i = 0; i < 52; i++) {
			cards.add((i % 13) + 1);
			System.out.println(cards.get(i) + "" + flowers.charAt(i / 13));
		}
	}

	public void shuffle2() {
		for (int i = 0; i < 52; i++) {
			int c = random.nextInt(52);
			cards.set(i,c);
			System.out.print((cards.get(i) % 13) +1 + "" +
			flowers.charAt(cards.get(i) / 13) + " ");
			if(i % 13 == 0) {
				System.out.println();
			}
	}}
	


	}
