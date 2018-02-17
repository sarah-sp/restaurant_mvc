package model;

public abstract class Item {

	private String name, token;
	
	public Item(String name, String token){
		this.name = name;
		this.token = token;
	}
	
	public String getName(){
		return name;
	}
	
	public String getToken(){
		return token;
	}
	
	
}
