package com.java2.object;

public class PokerTester {

	public static void main(String[] args) {
String flower = "SHDC";
int[] cards = new int[52];
for (int i = 0; i <52; i++) {
	System.out.println((i%13) + (flower.charAt(i/13)));
	
}

	}

}
