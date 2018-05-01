package enumer;

public enum NumberData {
	/** enum members */
	ONE(1), 
	TWO(2), 
	THREE(3), 
	FOUR(4), 
	FIVE(5), 
	SIX(6),
	SEVEN(7),
	EIGHT(8),
	NINE(9);
	
	 // attributes of the enum members
	private final double unit;

	/**
	 * Initialize the unit(value) of the length.
	 * */
	private NumberData(int value) {
		this.unit = value;
	}
	
	/**
	 * Get the unit of length.
	 * 
	 * @return the length's unit.
	 */
	public double getUnit() {
		return unit;
	}
}
