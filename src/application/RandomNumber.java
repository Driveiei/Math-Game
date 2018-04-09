package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumber {
	
	private Random rand;
	private Table table;
	private int box;
	
	public RandomNumber(int box) {
		this.box = box;
		rand = new Random();
		table = new Table(box);
	}
	
	public void remain() {

		List<Integer> manyNumber = new ArrayList<>();
		for(int a=1; a<10; a++) {
			manyNumber.add(a);
		}
		
		for(int b=9; b>0; b--) {
			int c = (rand.nextInt(b));
			System.out.println("random : " + c);
			System.out.println("result : " + manyNumber.get(c));
			manyNumber.remove(c);
		}
	}
	
	public int getBox() {
		return box;
	}
	
	
}
