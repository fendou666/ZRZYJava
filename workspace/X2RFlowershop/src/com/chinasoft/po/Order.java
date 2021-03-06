package com.chinasoft.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class Order implements Serializable {
//	订单号
	private String orderNum;
//	收件人地址
	private String address;
//	收件人姓名
	private String name;
//	收件人手机号
	private String telephone;
//	订单状态，NoShipments(未发货), Shipments(已发货), SignFor(签收) 
	private String status;
//	一个订单的订花量
	private ArrayList<Flower> flowers;
//	总价钱
	private double price; 
	
	
	
	
	
	
	
	
	
	
	
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(String orderNum, String address, ArrayList<Flower> flowers) {
		super();
		this.orderNum = orderNum;
		this.address = address;
		this.flowers = flowers;
		this.status = "未发货";
	}
	
	
	
	public String getOrderNum() {
		return orderNum;
	}
	
	
	
	

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	public ArrayList<Flower> getFlowers() {
		return flowers;
	}
	
	
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((orderNum == null) ? 0 : orderNum.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (orderNum == null) {
			if (other.orderNum != null)
				return false;
		} else if (!orderNum.equals(other.orderNum))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		StringBuffer flowersString = new StringBuffer();
		Iterator<Flower> iterator = flowers.iterator();
		while(iterator.hasNext()){
			flowersString.append(iterator.next());
		}
		
		return "订单编号：" + orderNum + ", 收货地址：" + address
				+ ", 收货人：" + name + ", 收货人手机号：" + telephone + ", 当前订单状态"
				+ status + ", 所有的花：\n" + flowersString;
	}
	
	
	
	
	
}
