package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumber {
	
	private Random rand;
	private Table table;
	private int box;
	private List<Integer> manyNumber;
	public RandomNumber(int box) {
		this.box = box;
		rand = new Random();
//		table = new Table(box);
		manyNumber = new ArrayList<>();
	}
	
	public void remain() {
		for(int a=1; a<box+1; a++) {
			manyNumber.add(a);
		}
		
		for(int b=box; b>0; b--) {
			int c = (rand.nextInt(b));
			System.out.println("position : "+c);
			System.out.println("value : "+manyNumber.get(c));
			manyNumber.remove(c);
		}
	}
	
	public Numerous[] doneIt() {
		if(manyNumber.size() == 9) {
			Numerous[] changeToArray = new Numerous[manyNumber.size()];
			return changeToArray;
		}
		return null;
	}
	
	public int getBox() {
		return box;
	}
}
