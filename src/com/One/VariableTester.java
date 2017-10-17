package com.One;

import java.util.Random;

public class VariableTester {

	public static void main(String[] args) {
		
int age = 0;
float weight = (float)42.6;
char c = 66;
char c2 = 'Y';
//
int i = c2;
System.out.println(i);
//System.out.println((int)c2);
boolean pass = true;
System.out.println(!pass);
String s = new String("Hello");
System.out.println(s);

Random r = new Random();
int n1 = (r.nextInt(6)+1);
System.out.println(n1);
System.out.println(r.nextInt(6)+1);
System.out.println(9<2);
 
	}

}
