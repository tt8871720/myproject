package com.One.oo;

//若GratduateStudent和Student在不同package,就不能共用屬性,儘管是父子類別的關係 
public class GraduateStudent extends Student {
	// 把差異歸類成子類別.突然多一個研究生的成績要處理,因為Student是處理一般生用,需要多增加屬性
	int thesis;
	public GraduateStudent() {
		super.print();
		chinese = 78;
		math = 71;
		pass = 60;
		thesis = 80;
	}

	@Override
	public void print() {
		System.out.println(math);
		System.out.print(math + "\t" + chinese + "\t" + thesis + "\t");
	}
@Override
	public int getAverage() {
		return (math + chinese + thesis / 4);
	}
}
