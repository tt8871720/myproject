package com.One.oo;

public class Tester {/*物件皆從類別Student而來*/

	public static void main(String[] args) {
		//Student stu = new Student("小美",55,66,77);
		Student stu = new Student ("小美");
	//	stu.english = 55;
		//stu.chinese = 66;
		//stu.math = 77;
			stu.print();
			int avg = stu.getAverage();
			System.out.println(stu.name + avg);
	}

}
