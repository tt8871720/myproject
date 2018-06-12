package com.java2.io;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;;

public class VendingMachine {
	Scanner scanner = new Scanner(System.in);
List<Drink> drinks = new ArrayList<>();
VendingMachine vm = new VendingMachine();

public void on(){
	System.out.print("請投幣");
for (int i = 0; i < drinks.size(); i++) {
	Drink drink = drinks.get(i);
	System.out.println(drink.getId() + "\t" + drink.getName() + "\t" + drink.getPrice());
}
int data = -1;
Scanner scanner = new Scanner(System.in);
while(data != 0){
	data = scanner.nextInt();
	switch(data){
	case 0 :
		break;
	}
	
}

}}
