package com.java2.game;

import java.io.BufferedReader;
import java.io.FileReader;

public class MazeMain {
	

public Maze(){
	FileReader fr = new FileReader("MazeRule.txt");
	BufferedReader bf = new BufferedReader(fr);
	String line = bf.readLine();
	String [] token = line.split(",");
int colum  = Integer.parseInt(token[0]);
int row = Integer.parseInt(token[1]);
line.split(",");
int tra
	
}

	public static void main(String[] args) {
int row, colum;
	int trapCount;
	int[] traps;
	Player player;
	}

	class Maze {

	}

	class Player {
		int pos = 0;// position
		int hp = 100;
	}
}
