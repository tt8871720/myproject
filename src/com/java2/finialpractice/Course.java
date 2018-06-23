package com.java2.finialpractice;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Course {
	
String  id;
String subject;
int day;
int start;
int hours;
public Course(String id, String subject , int day , int start , int hours ){
	this.id = id;
	this.subject = subject;
	  this.day = day;
	  this.start = start;
	  this.hours = hours;
}

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public int getDay() {
	return day;
}
public void setDay(int day) {
	this.day = day;
}
public int getStart() {
	return start;
}
public void setStart(int start) {
	this.start = start;
}
public int getHours() {
	return hours;
}
public void setHours(int hours) {
	this.hours = hours;
}
public boolean isAvailable(int day , int start){
	Boolean avail; //= false;
	if(this.day == day && (start + hours) > this.start && start < this.start) 
	//沒課
		avail = true;
	
	return avail = true;
}
	
}

