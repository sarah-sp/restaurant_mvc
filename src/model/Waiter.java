package model;

import java.util.HashMap;

public class Waiter extends Staff {

	private String id;
	private int numOfTables;
	private Bar bar;
	private Kitchen kitchen;
	
	public Waiter(String id, Kitchen kitchen, Bar bar){
		this.id = id;
		this.numOfTables = 0;
		this.bar = bar;
		this.kitchen = kitchen;
	}
	
	public String getID(){
		return id;
	}
	
	public void incTables() {
		numOfTables++;
	}
	
	public void decTables() {
		numOfTables--;
	}
	
	public int getNumOfTables() {
		return numOfTables;
	}
	
	public boolean isFree() {
		if(numOfTables>5) {
			return false;
		} 
		return true;
	}

	public void sendOrder(Order o) {
	
		kitchen.addOrder(o);
	}
}
