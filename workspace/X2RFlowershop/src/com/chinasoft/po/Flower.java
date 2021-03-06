package com.chinasoft.po;

import java.io.Serializable;

public class Flower  implements Serializable {
	private int number;
	private String name;
	private int count;
	private double price;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Flower() {
		super();
	}
//	用于delete花库存的时候用
	public Flower(String name) {
		this.name = name;
	}
	
	public Flower(int number, String name, int count, double price) {
		super();
		this.number = number;
		this.name = name;
		this.count = count;
		this.price = price;
	}

	
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
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
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Flower other = (Flower) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "花编号：" +number + ", 花名：" + name + ", 当前库存："
				+ count + ", 每束价格：" + price + "\n";
	}
	
	
	
}
