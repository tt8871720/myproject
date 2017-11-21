package com.fju.mid;

import java.util.Scanner;

public class GameTester {

	public static void main(String[] args) {
		int i = -1;
		while(i !=0){
			System.out.println("Please enter a number:");
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
	i = Integer.parseInt(line);	
		switch (i) {
		case 2:
			System.out.println("向下");
			break;
		case 4:
			System.out.println("向左");
			break;
		case 8:
			System.out.println("向上");
			break;
		case 6:
			System.out.println("向右");
			break;
		default:
		}
	}}
}