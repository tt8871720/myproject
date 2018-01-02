package com.One.oo;

public class Tester {/*物件皆從類別Student而來*/

	public static void main(String[] args) {
		Student stu1 = new Student("小美",55,66,77);
		Student stu2 = new Student("小美",55,66,77);
	//	stu.english = 55;
		//stu.chinese = 66;
		//stu.math = 77;
			stu1.print();
			stu2.print();
			int avg = stu1.getAverage();
			System.out.println(stu1.name + avg);
			GraduateStudent grdst = new GraduateStudent();
			grdst.print();
	}

}
