package com.test;

public class A2Student extends A1People {
	private int sno;

	
	
	public A2Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public A2Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public A2Student(String name, int age, int sno) {
		super(name, age);
		this.sno = sno;
	}
	
	public String PrintInfo() {
		return "ѧ��������" + super.getName() + ", ���䣺" + getAge() + "�� ѧ�ţ�" + sno ;
	}
	
	public static void main(String[] args) {
		A2Student stu = new A2Student("С��", 10, 22123);
		System.out.println(stu.PrintInfo());
	}
	
	
}