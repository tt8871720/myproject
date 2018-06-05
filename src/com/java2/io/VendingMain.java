package com.java2.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VendingMain extends Drink{
	/*此賣機可投入5 , 10 , 50
	 * 還錢時也是,按0時結束*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Drink> drinks = new ArrayList<>();
		VendingMachine vm = new VendingMachine();
		try {
			
			FileReader fr = new FileReader("Vending.txt");
			BufferedReader bf = new BufferedReader(fr);
			try {
				String line = bf.readLine();
				String [] token = line.split(",");
				for (int i = 0; i < token.length; i++) {
			int name = Integer.parseInt(token[1]);
			
					int amount = Integer.parseInt(token[1]);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		//on();
	}

}
