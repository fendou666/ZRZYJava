package com.chinasofti.po;

public class Admin {
	// 姓名
	private String name;
	// 手机号
	private String telephone;
	// 上班时间
	private String workTime;
	// 盈利
	private double realMoney;
	
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Admin(String name, String telephone, String workTime) {
		super();
		this.name = name;
		this.telephone = telephone;
		this.workTime = workTime;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getWorkTime() {
		return workTime;
	}
	public void setWorkTime(String workTime) {
		this.workTime = workTime;
	}
	public double getRealMoney() {
		return realMoney;
	}
	public void setRealMoney(double realMoney) {
		this.realMoney = realMoney;
	}

	
	
}
