package application;

import java.util.ArrayList;
import java.util.List;

public class Logic {

	private List<Table> sudoku;
	private int capacity;
	private Table table;
	
	public Logic(int capacity,Table table) {
		sudoku = new ArrayList<Table>();
		this.table = table;
		this.capacity = capacity;
	}
	
	public boolean duplicateGrid(int number) {
//		int x = table.getPoint();
//		int times = capacity/x;
//		int remainder = x%capacity;
//		switch(remainder) {
//		case 1 :
//			
//		}
		
//		-----------------------
//		List<Griddy> oneGrid = sudoku.get(number).getList();
//		List<Integer> x = new ArrayList<Integer>();
//		for(Griddy grid : oneGrid) {
//			x.add(grid.getNumber());
//		}
//		if(x.size() != oneGrid.size()) {
//			return false;
//		}
//		--------------
		
		
		
//		for(int i = 0;i<capacity; i ++) {
//			oneGrid.g
//			x.add(oneGrid.getNumber());
//		}
		
//		for(Integer y : oneGrid.getNumber()) {
//			
//		}
		
		List<Griddy> intSet = new ArrayList<Griddy>();
//		intSet.addAll((Collection<? extends Griddy>) oneGrid);
		
		for(Griddy eachNumber : intSet) {
			
		}
		
		
		return true;
	}
	
	public boolean duplicateRow(int numgrid , int row,int target) {
		int position = (numgrid-1)/3;
		int remainder = (row-1)/3;
		int first = (numgrid+2) %3;
		List<Integer> set = new ArrayList<Integer>();
		while(first-- != 0) {
			for(int i = 1;i<=3 ;i++) {
				set.add(sudoku.get(position*3+(remainder-1)).getList().get((3*i)-(3-remainder)).getNumber());
				remainder++;
			}
		}
		if(set.indexOf(target) < 0) {
			return false;
		} 
		return true;
	}
	
	public boolean duplicateColumn(int numgrid , int column,int target) {
//		int x = sudoku.get(0).getValue();
		//3 is capacity
		//numgrid is 1-9
		//column = 1-9
//		Table u = new Table(new Griddy(5,true,true),0,true);
		
		int position = numgrid%3;
		int first = (numgrid-1)/3;
		int remainder = column/3;
		List<Integer> set = new ArrayList<Integer>();
		while(first-- != 0) {
			for(int i = 1;i<=3 ;i++) {
				set.add(sudoku.get(position-1).getList().get((3*i)-(3-remainder)).getNumber());
				position = position + 3 ;
			}
		}
		if(set.indexOf(target) < 0) {
			return false;
		} 
		return true;
	}
	
	public boolean insert(Numerous numer) {
//		// if the purse is already full then can't insert anything.
//		if (isFull() || value.getValue() <= 0) {
//			return false;
//		} else {
//			money.add(value);
//			return true;
//		}
		return false;
	}
}
