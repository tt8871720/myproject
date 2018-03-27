package com.java2.object;

import java.util.ArrayList;
import java.util.List;

public class ArrayTester {

	public static void main(String[] args){
		List<Integer> cards = new ArrayList<>();
		cards.add(11);
		cards.add(22);
		cards.add(86);
		cards.add(33);
		//System.out.println("now remove: " + cards.get(2));
		//cards.remove(2);
		System.out.println("now remove: " + cards.remove(2));
		System.out.println("cards.size: " + cards.size());
		System.out.println("cards(2): " + cards.get(2)); {
			
		}

	}

}
