package com.test;

public class A1People {
	private String name ;
	private int age;
	public A1People() {
	}
	public A1People(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String PrintInfo() {
		return "ĞÕÃû£º" + name + ", ÄêÁä£º" + age ;
	}
	
	
}
