package com.One;

import java.util.Scanner;

public class AgeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("請輸入你的年齡");
Scanner scanner = new Scanner (System.in);
String line = scanner.nextLine();
int age = Integer.parseInt(line);
if(age < 12){
	System.out.println("小學?");
}else{
	if(age < 15){System.out.println("國中?");
    }else{ 
	    if(age < 18){
	    	System.out.println("高中?");
	    }else{
		System.out.println("...");
	    }}
	}
	}
	}
 
