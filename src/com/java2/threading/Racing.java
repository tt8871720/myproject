package com.java2.threading;

import java.util.ArrayList;
import java.util.List;

public class Racing {

	public static void main(String[] args) {
		Horse h1 = new Horse();
		h1.start();
		Horse h2 = new Horse();
		h2.start();
		Horse h3 = new Horse();
		h3.start();
		List<Horse> list  = new ArrayList<>();
//		HorseRunable h2 = new HorseRunable();
//		Thread thr = new Thread(h2);
//		thr.start();
//		try {
//			h1.join();// join()等這個執行緒結束才會直進行下一個執行緒
//			thr.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		System.out.println("the end");

	}

}
