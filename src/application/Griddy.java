package application;

import java.util.Iterator;

public class Griddy{
	
	private int number;
	private boolean lock;
	private boolean check;
	
	public Griddy(int number,boolean lock,boolean check) {
		this.number = number;
		this.lock = lock;
		this.check = check;
	}
	
	public int getNumber() {
		return number;
	}
	
	public boolean getCheck(){
		return check;
	}
	
	public boolean getLock() {
		return lock;
	}
}
