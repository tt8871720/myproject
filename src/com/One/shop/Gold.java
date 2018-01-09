package com.One.shop;

public class Gold extends Silver{
	int feedback;
public Gold(int amount){
	super(amount);
super.discount = 0.1f;
}
@Override//改變父類別內容時
public void print(){
	int total = (int) (amount * (1 - discount ));
	int feedback = amount - total;
	System.out.print(amount + "\t" + total + "\t" + feedback);
}
}
