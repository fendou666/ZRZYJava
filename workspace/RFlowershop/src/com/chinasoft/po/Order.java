package com.chinasoft.po;

import java.util.ArrayList;

public class Order {
	private String orderNum;
	private String address;
	private ArrayList<Flower> flowers;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(String orderNum, String address, ArrayList<Flower> flowers) {
		super();
		this.orderNum = orderNum;
		this.address = address;
		this.flowers = flowers;
	}
	
	
	
	public String getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(String orderNum) {
		this.orderNum = orderNum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public ArrayList<Flower> getFlowers() {
		return flowers;
	}
	public void setFlowers(ArrayList<Flower> flowers) {
		this.flowers = flowers;
	}
	
	
	
	
	
	
}
