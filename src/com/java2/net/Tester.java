package com.java2.net;


import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

import javax.swing.JFrame;

public class Tester extends JFrame {

	public Tester(){
		setSize(300 , 300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);//徹底關掉整個網頁JFrame
		setVisible(true);
	}
	
	public static void main(String[] args) {
		System.out.print("Hello");
		new Tester();
		try {
			Socket socket = new Socket("ptt.cc", 23);
InputStream is = socket.getInputStream();
int data = 0;
for (int i = 0; i <2000; i++) {
	data = is.read();
	System.out.println((char)data);
}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
