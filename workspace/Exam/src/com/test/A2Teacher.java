package com.test;

public class A2Teacher extends A1People {
	private double salary;

	
	
	public A2Teacher() {
		super();
	}


	public A2Teacher(String name, int age) {
		super(name, age);
	}

	public A2Teacher(String name, int age, double salary) {
		super(name, age);
		this.salary = salary;
	}
	
	public String PrintInfo() {
		return "��ʦ������" + getName() + ", ���䣺" + getAge() + "�� ���ʣ�" + salary ;
	}
	
	public static void main(String[] args) {
		A2Teacher stu = new A2Teacher("����", 32, 8123);
		System.out.println(stu.PrintInfo());
	}
	
	
}