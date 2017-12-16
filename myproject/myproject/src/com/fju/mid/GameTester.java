package com.fju.mid;

import java.util.Scanner;

public class GameTester {

	public static void main(String[] args) {
		int pos = 0;
		int roll = 3;
		int col = 5;
		int i = -1;
		int hp = 100;
		while (i != 0) {
			System.out.println(pos);
			System.out.println("Please enter a number:");
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			i = Integer.parseInt(line);
			switch (i) {
		
			case 2:
				System.out.println("向下");
				if (pos / col <= roll - 1) {
					pos = pos + col;
					hp = hp -5;
				}else{
					hp =hp -30;}
					break;
			
			case 4:
				System.out.println("向左");
				if (pos == 4 & pos == 9 & pos == 14) {
					pos = pos - 1;
					hp = hp -5;}
					break;
		
			case 8:
				System.out.println("向上");
				if (pos / col >= 0) {
					pos = pos - 5;
					hp = hp -5 ;}else{
						hp = hp -30;}
break;
			case 6:
				System.out.println("向右");
				if (pos / col >= 0) {
					pos = pos + 1;	hp = hp -5 ;}else{
		hp = hp -30;}
					break;
			default:
			}
}

}}