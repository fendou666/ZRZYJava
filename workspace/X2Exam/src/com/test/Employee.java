package com.test;

public class Employee {
	private String name;
	private double salary;
	private double subsidy;
	private double preTax;
	private double needTaxMoney;
	private double afterTax;
	private double tax;
	
	
	public Employee() {
	}
	
	
	
	public Employee(String name, double salary, double subsidy) {
		this.name = name;
		this.salary = salary;
		this.subsidy = subsidy;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSubsidy() {
		return subsidy;
	}
	public void setSubsidy(double subsidy) {
		this.subsidy = subsidy;
	}
	
	public double getPreTaxSalay(){
		preTax = salary + subsidy;
		return preTax;
	}
	
	public double getAfterTacSalay(){
		afterTax = preTax - getTax();
		return afterTax;
	}
	
	public double getTax(){
		getPreTaxSalay();
		needTaxMoney = preTax-2000;
		if (needTaxMoney<0) {
			return 0;
		} else if (needTaxMoney<=500){
			tax = needTaxMoney*0.05;
		}else if(needTaxMoney<=2000) {
			tax = needTaxMoney*0.1;
		}else if(needTaxMoney<=5000) {
			tax = needTaxMoney*0.15;
		}else if(needTaxMoney<=20000) {
			tax = needTaxMoney*0.2;
		}else  {
			tax = needTaxMoney*0.3;
		}
	
		return tax;
	}



	public String getInfo() {
		getTax();
		getAfterTacSalay();
		return "员工" + name + "的税前收入：" + preTax + "元, 税后收入为："
				+ afterTax + "元, 您缴纳的个人所得税为" + tax + "元";
	}
	
	
	
	
}
