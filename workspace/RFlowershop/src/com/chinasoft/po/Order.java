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
	
	
	
}