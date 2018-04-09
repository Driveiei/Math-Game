package application;

public class Table implements Numerous{
	
	private int number;
	
	public Table(int number) {
		this.number = number;
	}
	
	@Override
	public int getValue() {
		return number;
	}	
}
