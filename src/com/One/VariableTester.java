package com.One;

import java.util.Random;

public class VariableTester {

	public static void main(String[] args) {
		
int age = 0;
float weight = (float)42.6;
char c = 66;
char c2 = 'Z';
//
int i = c2;
System.out.println((int)c2);
//System.out.println(i);
boolean pass = true;
System.out.println(!pass);

String s = new String("Hellooooooooooo");
String s2 = "ohohohoh";
System.out.println(s2);
int len = s.length();
System.out.println("len:"+ len);
System.out.println(s.charAt(1));

Random r = new Random();
int n1 = (r.nextInt(6)+1);
System.out.println(n1);
System.out.println(r.nextInt(6)+1);
System.out.println(9<2);
float x = 9.2f;
int y = 5;
float z = x/y;
//int z = (int)(x/y);
System.out.println(z);
System.out.println(y>>1);

//y--;
y = y - 1;
System.out.println(y);
String data = "123";
int n = Integer.parseInt(data);
String mydata = String.valueOf(n);

	}

}
