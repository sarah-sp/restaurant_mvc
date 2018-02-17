package model;

public class Customer extends Person {

	Waiter w;
	
	public Customer(Waiter w) {
		this.w = w;
	}
	
	public void makeOrder(Order o){
		w.sendOrder(o);
	}
}
