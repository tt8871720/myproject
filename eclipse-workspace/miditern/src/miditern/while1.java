package miditern;

import java.util.Scanner;

public class while1 {

	public static void main(String[] args) {
		System.out.print("Please enter a number:");
		 	Scanner scanner = new Scanner(System.in);
		 String line = scanner.nextLine();
		 int i = Integer.parseInt(line);
		 int j = 1 ;
		 while(j <= i) {
			 System.out.print(j + " ");
			 j = j + 1;
			 if(j % 5 == 0) {
				 System.out.print( "*");
			 }
			 if(j>=11) {
				 break;
			 }
		 }
		}
		
			

	}

