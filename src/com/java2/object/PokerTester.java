package com.java2.object;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PokerTester {

	public static void main(String[] args) {
		String flowers = "SDHC";
		List<Integer> cards = new ArrayList<>();
		//定義撲克牌,會跳到Poker
		Poker poker = new Poker();
		Poker2 poker2 = new Poker2();
		//打散+顯示是一組的
poker.shuffle();
poker.show();
	System.out.println(cards.size());	

	}

}
