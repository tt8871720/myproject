package com.java2.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class Test {

	public static void main(String[] args) {
List<Integer>list = new ArrayList<>() ;
	list.add(5);
	list.add(87);
	list.add(4);
	list.add(5);
	System.out.println(list);
	
	//Set不接受重複內容,hash不按照順序儲存
	Set<Integer> set = new HashSet<>();
	set.add(5);
	set.add(56);
	set.add(7);
	set.add(56);
	System.out.println(set);
	
	Set<String> set2 = new HashSet<>();
	set2.add("Dog");
	set2.add("Bird");
	set2.add("Dog");
	System.out.println(set2);
//	Map<K, V>K V為值,若用maptree則會按大小排列
	Map<String ,String> stock = new HashMap<>();
	stock.put("abs", "125");
	stock.put("fi", "56");
	stock.put("bgh" , "358");
	System.out.println(stock);
}}
