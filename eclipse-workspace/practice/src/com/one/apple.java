package com.one;

public class apple {

	public static void main(String[] args) {
		//列出1-100的非質數
				for (int a = 4; a <= 100; a++) {
				boolean prime = false;
			for (int b = 2; b < a; b++) {
				if(a % b == 0) 
					prime = true;
				break;}
				if(prime)
				{System.out.println(a);}
					

	
}
	}
				}
