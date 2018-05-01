package com.One.oo;

public class Stepik {

	public static void main(String[] args) {
		class Employee {
String  name;
String email;
int experience;
			 public String[] Employee(String name , String email,int experience){
				 this.email = email;
				 this.name = name;
				 this.experience = experience;
			 }
public getName(){
	return name;
}
public  getEmail(){
	return email;
}		
public getExperience(){
	return experience;
}
			}

			class Developer extends Employee {
String mainLanguaage;
String skills;
			  // write fields

			  // write constructor

			  // write getters
			}

			class DataAnalyst extends Employee {
String phd;
String method;
			  // write fields

			  // write constructor

			  // write getters
			}
	}

}
