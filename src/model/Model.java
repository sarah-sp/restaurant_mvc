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
		
		
		menuFood = new ArrayList<Food>();
		menuDrink = new ArrayList<Drink>();
		addDefaultMenuItems();
		
		staff = new ArrayList<Staff>();
		chef = new Chef();
		staff.add(chef);
		bartender = new Bartender();
		staff.add(bartender);
		waiters = new ArrayList<Waiter>();
		
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
		
		/*
		 * OBJECT CREATION 
		 */
		Waiter waiter = new Waiter("Sasa", kitchen, bar);
		Table table = new Table(1);
		Customer customer = new Customer(waiter);
		
		tables.add(table);
		customers.add(customer);
			
		
		/*
		 * CUSTOMER IS ASSIGNED TABLE
		 */
		
		if(!table.isOccuppied()) {
			table.setUp(waiter, customer);
		}
		
		System.out.println(" === CUSTOMER ASSIGNED: table_" + table.getNum() + " === ");
		
		/*
		 * CUSTOMER CREATES ORDER
		 */
		Order o = new Order(table.getNum(), customer, waiter);
		o.addItem(new Food("spska"), 5);

		customer.makeOrder(o); //results in kitchen acquiring the order
		
		/*
		 * CUSTOMER RECIEVES DRINKS
		 */
		
		/*
		 * CUSTOMER RECIEVES FOOD
		 */
		
		/*
		 * CUSTOMER PAYS
		 */
		
		/*
		 * CUSTOMER LEAVES
		 */
		

		
		
	}

	
}
