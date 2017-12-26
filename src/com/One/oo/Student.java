package com.One.oo;

public class Student {// 沒勾main方法,但卻有繼承語法
	int english;//稱為屬性(property field,instance variable),在第一層
	int chinese;
	int math;
	String name;
	static int pass = 60;//(static)共用後,變成class variable
public Student(){
	}
public Student(String name ,int english, int chinese, int math){
	this.english = english;
	this.chinese = chinese;
	this.math = math;
	this.name = name;
}//this-為辨別類別裡屬性(instance variable)與區域的建構值(local variable)
public Student (String name){
	this.name = name;}
	public void print() {//instance  method = print為方法  public void前面空,不回傳,括號沒東西 沒參數值
		System.out.println(pass);
		System.out.println(english + " \t"+chinese + "\t" + math);
	}public int getAverage(){//回傳,instance  method = getAverage,方法
		return(english + math + chinese)/3;
	}
}
