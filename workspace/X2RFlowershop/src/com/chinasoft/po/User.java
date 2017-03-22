package com.chinasoft.po;

import java.util.ArrayList;

public class User extends Person {
	
	private ArrayList<String> addresss = new ArrayList<String>();
	
	private ArrayList<Order> orders = new ArrayList<Order>();

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String name, String pwd) {
		super(name, pwd);
		// TODO Auto-generated constructor stub
	}
	
	public User(String name, String pwd, String telephone) {
		super(name, pwd, telephone);
		// TODO Auto-generated constructor stub
	}

	
	
//	public User(ArrayList<String> addresss, ArrayList<Order> orders) {
//		super();
//		this.addresss = addresss;
//		this.orders = orders;
//	}
//	
//	public User(String name, String telephone, ArrayList<String> addresss, ArrayList<Order> orders) {
//		super(name, telephone);
//		this.addresss = addresss;
//		this.orders = orders;
//	}
	
	
	
	
	
	
	


	



	public ArrayList<String> getAddresss() {
		return addresss;
	}

	public void setAddresss(ArrayList<String> addresss) {
		this.addresss = addresss;
	}

	public ArrayList<Order> getOrders() {
		return orders;
	}

	public void setOrders(ArrayList<Order> orders) {
		this.orders = orders;
	}
	
	
	
}
