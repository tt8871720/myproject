package com.java2.object;

public class TestTime {int testingtime;
	int starttime;	

int endtime;
String necessity;
public TestTime(int starttime , int testingtime ,int endtime){
	this.starttime = starttime;
	this.testingtime = testingtime;
	this.endtime = endtime;
	}

	
	public void print(){
		
		System.out.print(starttime + "~" + endtime + "necessity : ");
	}



}
