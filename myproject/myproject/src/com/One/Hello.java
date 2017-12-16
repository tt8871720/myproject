package com.One;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
System.out.println("Hello World");
Person p = new Person();
p.sayHello();
System.out.println("請輸入你的名字");
Scanner scanner = new Scanner(System.in);
String line = scanner.nextLine();
System.out.println("Hi," +line);
System.out.println("你幾歲?");
line = scanner.nextLine();
int age = Integer.parseInt(line);
System.out.println(age);
System.out.println(age>21);

	}
}
