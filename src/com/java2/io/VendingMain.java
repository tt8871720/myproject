package com.java2.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VendingMain {
	/*此賣機可投入5 , 10 , 50
	 * 還錢時也是,按0時結束*/
	public static void main(String[] args) {
	VendingMachine vm = new VendingMachine();
FileReader fr;
try {
	fr = new FileReader("Vending.txt");
	BufferedReader bf = new BufferedReader(fr);
	String line = bf.readLine();
	String[] tokens = line.split(",");
	int count = Integer.parseInt(tokens[0]);
	for (int i = 0; i < count; i++) {
		String name = tokens[i*2+1];
		int price  = Integer.parseInt(tokens[i*2+2]);
vm.drinks.add(new Drink(i+1 , name , price));
	}
	vm.on();
	
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
}