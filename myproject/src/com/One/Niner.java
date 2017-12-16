package com.One;

public class Niner {

	public static void main(String[] args) {
		for (int n = 2; n <= 9; n++) {
			for (int i = 1; i <= 9; i++) {
				if ((n * i) < 10) {
					System.out.println(n + " X " + i + " =  " + (n * i));
				} else {
					System.out.println(n + " X " + i + " = " + (n * i));

					// for(int i = 1;i <= 9;i++ )
					// System.out.println("2 X " +i + "=" + 2 * i);
					// for(int i = 5;i <= 9;i++ )
					// System.out.println("2 X " +i + " = " + 2 * i);
				}

			}
			System.out.println();
		} // System.out.println(n + "x" + i + "=" + (n * i));
			// if((n * i <10)){System.out.println(" = "+ (n*1));
			// {System.out.println(" = " + (n*1));

	}
}