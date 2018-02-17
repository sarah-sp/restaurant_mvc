package model;

public class Table {

	private int num;
	private boolean isOccuppied;
	private Waiter w;
	private Customer c;
	
	public Table(int num){
		this.num = num;
		this.isOccuppied = false;
	}
	
	public int getNum(){
		return num;
	}
	
	public void occupy(){
		this.isOccuppied = true;
	}
	
	public void unOccupy(){
		this.isOccuppied = false;
	}
	
	public boolean getStatus(){
		return isOccuppied;
	}
	
	public void setWaiter(Waiter w){
		this.w = w;
	}
	
	public Waiter getWaiter(){
		return w;
	}
	
	public boolean isOccuppied() {
		return isOccuppied;
	}
	
	public void setCustomer(Customer c){
		this.c = c;
	}
	
	public Customer getCustomer(){
		return c;
	}
	
	public void setUp(Waiter w, Customer c){
		this.w = w;
		this.c = c;
		isOccuppied = true;
	}
	
}
