package com.One.shop;

public class Silver extends Customer {
	public Silver(int amount){
		super(amount);
		super.discount = 0.1f;
	}
}
