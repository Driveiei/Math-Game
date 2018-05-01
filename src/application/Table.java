package application;

import java.util.ArrayList;
import java.util.List;

public class Table implements Numerous{
	
	private Griddy grid;
	private int numGrid;
	private boolean checkGrid;
	private List<Griddy> list;
	
	public Table(Griddy grid, int numGrid,boolean checkGrid) {
		this.grid = grid;
		this.numGrid = numGrid;
		this.checkGrid = checkGrid;
		list = new ArrayList<Griddy>();
	}
	
	@Override
	public int getPoint() {
		return numGrid;
	}
	
	@Override
	public boolean getCheckGrid() {
		return checkGrid;
	}
	
	@Override
	public Griddy getGrid() {
		return grid;
	}
	
	@Override
	public List<Griddy> getList() {
		return list;
	}
}
