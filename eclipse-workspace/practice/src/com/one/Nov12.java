package com.one;

import java.util.Random;

public class Nov12 {

	public static void main(String[] args) {
		
		//1-10random
		Random r = new Random();
		int r1 = (r.nextInt(10)+1);
		System.out.println(r1);
		System.out.println(r.nextInt(10)+1);

		//99乘法表
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if(i * j < 10) {
					System.out.print(i + " x " + j + " =  " + (i * j) + "\t");
				}else
				System.out.print(i + " x " + j + " = " + (i * j) + "\t");
				
			}System.out.println();
			
		}
		
		
			
				

			
		
}}
