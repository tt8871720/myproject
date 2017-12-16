package com.one;


public class nine {
	public static void main(String[] args) {
		//float int char(字元) length
		int x = 5;
		float y = 1.5f; // (float)1.5
		float z = y / x;
		System.out.println(y);
		System.out.println(y / x);
		y = y + 1;
		System.out.println(y);
		char c = 70;//ACCII表,A=65 Z=90 
		char c1 = 'Z';
		System.out.println(c);
		System.out.println((int)c1);
	String s = new String("ABCDEFGJ");
	System.out.println(s);
	String s2 = new String("okok");
	int len = s.length();//幾字元
	System.out.println("len:" + len);
	System.out.println(s.charAt(7));//charAt第幾個字+1
	
	}
}