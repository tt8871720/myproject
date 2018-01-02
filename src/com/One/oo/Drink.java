package com.One.oo;

public class Drink {
	//price key 皆是instance variable=屬性
	int price;
	String key;
	
	public Drink(String key, int price) {
		this.key = key; 
		this.price = price;
		//String key, int price 是參數 = local variable
		//this.instance variable = local variable
	}
}
