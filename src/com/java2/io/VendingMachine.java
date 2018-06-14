package com.java2.io;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
	List<Drink> drinks = new ArrayList<>();

	public void on() {
		int money = 0;
		for (int i = 0; i < drinks.size(); i++) {
			Drink drink = drinks.get(i);
			System.out.println(drink.getId() + "\t" + drink.getName() + "\t" + drink.getPrice());
		}
		Scanner scanner = new Scanner(System.in);
		int data = 1;
		while (data != 0) {
			System.out.println("請投錢，現在＄: " + money);
			data = scanner.nextInt();
			switch (data) {
			case 50:
				money = 50 + money;
				break;
			case 10:
				money = 10 + money;
				break;
			case 5:
				money = 5 + money;
				break;
			case 1:
				money = money - 25;
				System.out.println("your Coke");
				break;
			case 2:
				money = money - 30;
				System.out.println("your Apple Juice");
				break;
			case 3:
				money = money - 20;
				System.out.println("your Sprite");
				break;
			}
			if (money < 0) {
				System.out.println("餘額不足");
			}
		}
	}
}
