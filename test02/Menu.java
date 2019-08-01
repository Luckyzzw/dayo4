package com.test02;

public class Menu {
	private String name;
	private int price;
	private String  caixi;
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Menu(String name, int price, String caixi) {
		super();
		this.name = name;
		this.price = price;
		this.caixi = caixi;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCaixi() {
		return caixi;
	}
	public void setCaixi(String caixi) {
		this.caixi = caixi;
	}
	
}
