package miditern;

import java.util.Scanner;

public class switch1 {

	public static void main(String[] args) {
		System.out.println("Please enter a number");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int i = Integer.parseInt(line);
		switch (i) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("懶得打");
		}

	}

}
