package com.chinasoft.po;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class User  implements Serializable {
	private String name;
	private String pwd;
	private String telephone;
	private String type;
//	此用来看用户的所有订单
	private ArrayList<Order> orderList;

	
	
	public User() {
		System.out.println("不支持这样创建对象");
	}
	
	
//	主要用来检测用户的时候用
	public User(String name, String pwd) {
		super();
		this.name = name;
		this.pwd = pwd;
	}



	public User(String name, String pwd, String telephone, String type) {
		super();
		this.name = name;
		this.pwd = pwd;
		this.telephone = telephone;
		this.type = type;
		this.orderList = new ArrayList<Order>();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public String getType() {
		return type;
	}
	

	public ArrayList<Order> getOrderList() {
		return orderList;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pwd == null) ? 0 : pwd.hashCode());
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
		User other = (User) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pwd == null) {
			if (other.pwd != null)
				return false;
		} else if (!pwd.equals(other.pwd))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", pwd=" + pwd + ", telephone="
				+ telephone + "]";
	}
	
	
}
