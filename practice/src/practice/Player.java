package practice;
import java.util.*;
import java.io.*;

public class Player {
	// attributes
	String position;
	int height;
	int number;
	private List<String> ayo;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player pg = new Player();
			pg.setPos("pg");
			pg.setNumber(12);
		Player sg = new Player();
			sg.setPos("sg");
			sg.setNumber(13);
//		System.out.println(pg.getPos());
//		System.out.println(pg.getNumber());
//		System.out.println(sg.getPos());
//		System.out.println(pg.getAyo());
//		pg.ayo.remove(2);
//		System.out.println(pg.getAyo());
		String helloWorld = "Stack John Doe";
		String hellWrld = helloWorld.replace("Stack", "");
		System.out.println(hellWrld);
	}
	
	//constructors
	public Player() {
		ayo = new ArrayList<String>();
		ayo.add("A");
		ayo.add("B");
		ayo.add("C");
		position = "";
		height = 0;
		number = 0;
	}
	
	//getters
	public String getPos() {
		return this.position;
	}
	
	public int getHeight() {
		return this.height;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public List<String> getAyo() {
		return this.ayo;
	}
	
	// setters
	public void setPos(String position) {
		this.position = new String(position);
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	//methods
	
}

class pointGuard extends Player {
	
}

class shootingGuard extends Player {
	
}

class smallForward extends Player {
	
}

class powerForward extends Player {
	
}

class center extends Player {
	
}
