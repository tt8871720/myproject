package com.fju.mid;

public class scorearray {

	public static void main(String[] args) {
int scores[][] = new int[5][3];/*從右到左定義*/
scores[0][0] = 55;
scores[0][1] = 66;
scores[0][2] = 77;
		
scores[1][0] = 44;
scores[1][1] = 66;
scores[1][2] = 88;

scores[2][0] = 33;
scores[2][1] = 55;
scores[2][2] = 77;

scores[3][0] = 99;
scores[3][1] = 77;
scores[3][2] = 55;

scores[4][0] = 11;
scores[4][1] = 33;
scores[4][2] = 55;

		for (int i = 0; i < scores.length; i++) {
			int a = (scores[i][0] + scores[i][1] + scores[i][2])/3;
			System.out.print(scores[i][0] +" \t"+scores[i][1] + " \t" + scores[i][2] + "\t");
			if(a < 60){
				System.out.println("average "+a+"*"+ "\t");}
			else{
				System.out.println("average "+a+ "\t");
			}
				}
	}}

