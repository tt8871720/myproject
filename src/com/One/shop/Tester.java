package com.One.shop;

import java.awt.List;
import java.util.ArrayList;

import javax.management.openmbean.ArrayType;

public class Tester {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();// 集合大小沒有限制,可放1,4.2,dog,...
		// 但當異質時,需轉型加int String,而質如果一樣時,加上<Integer>泛型就不用
		a.add(5);
		a.add(7);
		a.add(9);
		a.add(11);
		a.remove(1);
		/*int n = a.get(0);
		int n1 = a.get(3);
		 int n = (int)a.get(0); String n1 = (String)a.get(3);
		 */
		System.out.println(a.size());
		for (int p = 0; p < a.size(); p++) {
			System.out.println(a.get(p));
		}
		ArrayList<Customer> customers = new ArrayList<>();//Customer為父類別
		Customer c1 = new Customer(1000);
		customers.add(c1);
		Silver c2 = new Silver(1000);
		customers.add(c2);
		Gold c3 = new Gold(1000);
		customers.add(c3);
		for (int i = 0; i < customers.size(); i++) {
			Customer C = customers.get(i);
			C.print();

		}
		// c1.print();
		// c2.print();
		// c3.pint();

	}

}
