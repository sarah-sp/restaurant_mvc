package model;

import java.util.HashMap;

public class Kitchen extends Departament {

	public void getFood(HashMap<Item, Integer> food) {
		System.out.println("Food:");
		
		for(Item d: food.keySet()) {
			
			System.out.println(d.getName() + " " + food.get(d));
		}
		
	}

}
