package com.chinasofti.po;

public class Admin {
	// ����
	private String name;
	// �ֻ���
	private String telephone;
	// �ϰ�ʱ��
	private String workTime;
	// ӯ��
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
