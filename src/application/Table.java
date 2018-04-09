package application;

public class Table implements Numerous{
	
	private int number;
	
	public Table(int x) {
		this.number = x;
	}
	
	@Override
	public int getValue() {
		return number;
	}
	
	
}
