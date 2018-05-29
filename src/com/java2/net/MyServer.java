package com.java2.net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;

public class MyServer extends JFrame{

	public static void main(String[] args) {
try {
	ServerSocket server = new ServerSocket(9958);
	Socket socket = server.accept();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
