package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumber {
	
	private Random rand = new Random();
	private Table table;
	public void remain() {

		List<Integer> fuck = new ArrayList<>();
		for(int a=1; a<10; a++) {
			fuck.add(a);
		}
		for(int b=9; b>0; b--) {
			int c = (rand.nextInt(b));
			System.out.println("random : " + c);
			System.out.println("result : " + fuck.get(c));
			fuck.remove(c);
		}
	}
	
	
}
