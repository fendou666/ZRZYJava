package com.orcle.J20170330;

public class In1Student {
	private int stuid;
	private String name;
	private String sex;
	private String className;
	
	public In1Student() {
	
	}
	
	public In1Student(int stuid, String name, String sex, String className) {
		this.stuid = stuid;
		this.name = name;
		this.sex = sex;
		this.className = className;
	}
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public String toString() {
		return stuid + "\t" + name + "\t" + sex
				+ "\t" + className;
	}
	
	
}
