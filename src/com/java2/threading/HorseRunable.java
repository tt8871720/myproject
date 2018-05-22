package com.java2.threading;

public class HorseRunable implements Runnable//實作介面,當有繼承其他類別時可用
{
	@Override
	public void run() {

	for (int i = 0; i <= 100; i++) {
		System.out.println("R:" + i);
		try {
			Thread.sleep(190);// minisecond
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
}
}
