package com.one;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
			// Q1//
			System.out.println("請問誰年紀最大" + "1.周杰倫" + "2.華晨宇" + "3.梁朝偉 ");
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			int age = Integer.parseInt(line);
			if (age == 3) {
				System.out.println("恭喜你答對了");
			} else {
				System.out.println("答錯了,答案是3 ");

	}

}}
