package model;

public class Waiter extends Staff {

	private String id;
	
	public Waiter(String id){
		this.id = id;
	}
	
	public String getID(){
		return id;
	}
}
