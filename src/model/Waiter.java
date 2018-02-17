package model;

public class Waiter extends Staff {

	private String id;
	private int numOfTables;
	private Bar bar;
	private Kitchen kitchen;
	
	public Waiter(String id){
		this.id = id;
		this.numOfTables = 0;
		bar = new Bar();
		kitchen = new Kitchen();
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
		bar.getDrinks(o.getDrinks());
		
		kitchen.getFood(o.getFood());
		
	}
}
