/* 
* 有一文字檔儲存了課表資料(schedule.txt) 請讀取資料後，設計程式可檢查是否有空檔?
* 如: 請輸入星期(1-7):2
	 * 請輸入時(0-24):11 【有空檔】 請輸入星期(1-7):4 請輸入時(0-24):14 【有課: C004 English 到 16時 】
	 */
package com.java2.finialpractice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Schedule {
	List<Course> courses = new ArrayList<>();

	public Schedule() {
		read();
		Scanner scanner = new Scanner(System.in);
		System.out.println("歡迎使用查詢系統 ");
		
		System.out.println("請輸入星期(1-7)");
		int day = scanner.nextInt();
		System.out.println(" 請輸入時(0-24)");
		int start = scanner.nextInt();
	boolean avail = true;
		for (Course c : courses) {
			if (!c.isAvailable(day, start)) {
				avail = false;
			System.out.println("有課 + ......");		
				break;
			}
		}
		if (avail) {	
			System.out.println("空堂");
			
		}
	}

	public void read() {
		try {
			FileReader r = new FileReader("schedule.txt");
			BufferedReader in = new BufferedReader(r);
			String line = in.readLine();// 讀一行(第一行)
			String[] tokens = line.split(",");
			while (line != null) {
				line = in.readLine();// 再讀一行(二三四行一直讀下去)
				for (int a = 0; a == 4; a++) {
					String id = tokens[0];
					String subject = tokens[1];
					int day = Integer.parseInt(tokens[2]);
					int start = Integer.parseInt(tokens[3]);
					int hours = Integer.parseInt(tokens[4]);
					courses.add(new Course(id, subject, day, start, hours));
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
new Schedule();
	}
}