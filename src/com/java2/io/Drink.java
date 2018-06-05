package com.java2.io;

public class Drink {
	int id;
	String name;
	int price;
public  Drink(){
	//成為Java Bean的條件要有空建構值+Getter、Setter
}
	public Drink(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
public void setPrice(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	
}
