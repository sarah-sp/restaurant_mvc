package model;

import java.util.HashMap;

public class Bar extends Departament {

	public void getDrinks(HashMap<Item, Integer> drinks) {
		System.out.println("Drinks:");
		
		for(Item d: drinks.keySet()) {
			
			System.out.println(d.getName() + " " + drinks.get(d));
		}
		
	}

}
