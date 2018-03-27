package com.java2.object;

import java.util.ArrayList;
import java.util.List;

import com.One.snow.Random;

public class Poker2 {
	Random random = new Random();
	String flowers = "SDHC";
	List<Integer> cards = new ArrayList<>();
//定義Array大小
	public Poker2() {
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 14; j++) {
				for (int n = 0; n < 52; n++) {
				int c = flowers.charAt(i);
				cards.set(n,j +c);
			}
}
		}
	}
	public void shuffle() {
for (int i = 0; i < cards.size(); i++) {
//	int s =
}
	}

}