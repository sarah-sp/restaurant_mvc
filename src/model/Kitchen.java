package model;

import java.util.ArrayList;
import java.util.HashMap;

public class Kitchen extends Departament {

	public ArrayList<Order> orders;
	
	public Kitchen() {
		orders = new ArrayList<Order>();
	}
	
	public void addOrder(Order o) {
		orders.add(o);
		
		System.out.println("========== ORDER IN KITCHEN ==========");
		System.out.println("Waiter: " + o.getWaiter().getID());
		System.out.println("Food: ");
		
		for(Item d: o.getFood().keySet()) {
			
			System.out.println(d.getName() + " " + o.getFood().get(d));
		}
		
		System.out.println("======================================");

	}

}
