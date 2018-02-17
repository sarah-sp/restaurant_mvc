package model;

import java.util.ArrayList;

public class Model {
	
	/*
	 * Departments
	 */
	private Kitchen kitchen;
	private Bar bar; 
	private ArrayList<Table> tables;
	
	/*
	 * Menu items
	 */
	private ArrayList<Food> menuFood;
	private ArrayList<Drink> menuDrink;
	
	/*
	 * Staff Members
	 */
	private ArrayList<Staff> staff;
	private Chef chef;
	private Bartender bartender;
	private ArrayList<Waiter> waiters;
	
	/*
	 * Customers
	 */
	private ArrayList<Customer> customers;
	
	
	
	public Model() {
		
		kitchen = new Kitchen();
		bar = new Bar();
		tables = new ArrayList<Table>();
		tables.add(new Table(1));
		tables.add(new Table(2));
		
		menuFood = new ArrayList<Food>();
		menuDrink = new ArrayList<Drink>();
		addDefaultMenuItems();
		
		staff = new ArrayList<Staff>();
		chef = new Chef();
		staff.add(chef);
		bartender = new Bartender();
		staff.add(bartender);
		waiters = new ArrayList<Waiter>();
		Waiter w = new Waiter("Sasa");
		waiters.add(w);
		staff.add(w);
		
		customers = new ArrayList<Customer>();
	}
	
	public void addDefaultMenuItems() {
		menuFood.add(new Food("Shopska", "SPSKA"));
		menuFood.add(new Food("Lukanka", "LUK"));
		menuDrink.add(new Drink("Boza", "BZ"));
		menuDrink.add(new Drink("Big Boza", "BBZ"));

	}
	
	public Kitchen getKitchen() {
		return kitchen;
	}
	
	public Bar getBar() {
		return bar;
	}
	
	public ArrayList<Table> getTables() {
		return tables;
	}

	public ArrayList<Food> getFood() {
		return menuFood;
	}
	
	public ArrayList<Drink> getDrinks() {
		return menuDrink;
	}
	
	public ArrayList<Staff> getStaff() {
		return staff;
	}
	
	public void simulate() {
		Customer c1;
		
		for(Waiter w: waiters) {
			
			c1 = new Customer(w);
			customers.add(c1);
			
			for(Table t: tables) {
				
				if(!t.isOccuppied()) {
					
					t.setUp(w, c1);
					
					Order o = new Order(t.getNum(), c1, w);
					o.addItem(new Food("spska"), 5);
					
					c1.makeOrder(o);
				}
			}
		}
		
		
		
	}

	
}
