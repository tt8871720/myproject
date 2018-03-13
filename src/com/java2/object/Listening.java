package com.java2.object;

public class Listening extends TestTime {
	private String necessity = "headphone";
public Listening(){
	super();
	super.starthour = 10;
	super.startmins = 00;
	super.testingtime = 80;
	super.section = "Listening";

}
@Override 
public  void print(){
	System.out.print(section + ":" + starthour + startmins + "~" + endhour + endmins + "necessity:" + necessity);
}
}
