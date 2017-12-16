package com.fju.mid;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		int b = 13;
		for (int a = 1; a <= b ; a++) {
			if(a%3 == 0){
				continue;
			}
			System.out.print(a +" ");
		
		} 
		int c = 1; 
		while(c<=13){
			System.out.print(c+ " ");
			c =c++;
	System.out.print("Please enter a number:");
	Scanner scanner = new Scanner(System.in);
	//String line  = scanner.nextLine();
	//int i = Integer.parseInt(line);
	int i;
	i= Integer.parseInt(scanner.nextLine());
	int j = 1;
	
	while(j<=i){
		System.out.print(j + " ");
		j = j+1;
		if(j % 5 ==0){
			System.out.print("*");
		}
		if(j==11){
			break;
			
	}
	

	}

}}}
