package com.ibm;

import java.util.Random;

public class Dice {
//https://litotom.com/fju1219/
	public static void main(String[] args) {
		for (int i = 0; i <=10; i++) {
		Random r = new Random();
		int r1 = (r.nextInt(6)+1);
		int r2 = (r.nextInt(6)+1);
		int r3 = (r.nextInt(6)+1);
		int r4 = (r.nextInt(6)+1);
		System.out.print(r4 + " " +r1+ " "+ r2 + " " +r3 );
if(r1 !=r2 & r2 !=r3 & r3 != r4 & r1 != r4 & r2 != r4& r1 != r3){
	System.out.print(" * ");
}

System.out.println();}
}}