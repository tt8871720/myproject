package com.One.oo;

public class Student {// 沒勾main方法,但卻有繼承語法
	int english;//稱為屬性(property field),在第一層
	int chinese;
	int math;
	String name;
public Student(String n ,int e, int c, int m);{
	english = e;
	chinese = c;
	math = m;
	name = n;
}

	public void print() {//print為方法  public void前面空,不回傳
		System.out.println(english + " \t"+chinese + "\t" + math);
	}public int getAverage(){//回傳
		return(english + math + chinese)/3;
	}
}
