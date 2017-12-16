package com.fju.mid;

public class ScoreTester {
	/*
	 * score<60 Failed 60-69 Passed 70-79 Good 80-89 Great 90-100 Excellent
	 * 
	 */

	public static void main(String[] args) {
		int score = 1;
		int standard = score / 10;
		switch (standard) {
		case 6:
			System.out.println("Passed");
			break;
		case 7:
			System.out.println("Good");
			break;
		case 8:
			System.out.println("Great");
			break;
		case 9:
			System.out.println("Excellent");
			break;
		case 10:
			System.out.println("Excellent");
			break;
		default:
			System.out.println("Failed");
			break;
		}

	}

}
