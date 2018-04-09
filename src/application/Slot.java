package application;

public class Slot extends Table {

	public Slot(int number) {
		super(number);
	}
	
	/**
	 * toString describes value and currency of banknote.
	 * 
	 * @return description of this banknote.
	 */
	@Override
	public String toString() {
		return "Slot";
	}
}
