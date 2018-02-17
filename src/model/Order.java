package model;

import java.util.HashMap;

public class Order {

	private int tableNum;
	private Customer c; 
	private Waiter w;
	private HashMap<Item,Integer> items;
	
	public Order(int tableNum, Customer c, Waiter w){
		
		this.tableNum = tableNum;
		this.c = c;
		this.w = w;
		items = new HashMap<Item, Integer>();
	}
	
	public int getNum(){
		return tableNum;
	}
	
	public Customer getCustomer(){
		return c;
	}
	
	public Waiter getWaiter(){
		return w;
	}
	
	public HashMap<Item,Integer> getOrderItems(){
		return items;
	}
	
	public HashMap<Item,Integer> getFood() {
		
		HashMap<Item, Integer> food = new HashMap<Item, Integer>();
		
		for(Item i : items.keySet()){
			if(i instanceof Food){
				food.put(i, items.get(i));
			}
		}
		return food;
	}
	
	public HashMap<Item,Integer> getDrinks() {
		
		HashMap<Item, Integer> drinks = new HashMap<Item, Integer>();
		
		for(Item i : items.keySet()){
			if(i instanceof Drink){
				drinks.put(i, items.get(i));
			}
		}
		return drinks;
		
	}
	
	
	/*
	 * Adds an item, assumed default quantity of 1
	 */
	public void addItem(Item i) {
		
		if(items.containsKey(i)){
			items.put(i, items.get(i)+1);
		} else {
			items.put(i, 1);
		}
	}
	
	/*
	 * Adds an item with a specified quantity
	 */
	public void addItem(Item i, Integer q){
		
		if(items.containsKey(i)){
			
			items.put(i, items.get(i)+q);

		} else {
			
			items.put(i, q);
		}
	}
	
	
}
