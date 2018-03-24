package com.java2.object;

import java.util.Scanner;

public class ABTester {

	public static void main(String[] args) {
		String secret = "6413";
		Scanner scanner = new Scanner(System.in);
		String number = scanner.nextLine();
int result = 0;
/*十位數為A個位數為B*/
while(result != 40){
	System.out.print("請輸入一組數字");
	ABNumber n = new ABNumber(scanner.nextLine());
	result =n.validate(secret);
	System.out.println((result/10) + "A" + (result%10) + "B");
	
}
	

}}
