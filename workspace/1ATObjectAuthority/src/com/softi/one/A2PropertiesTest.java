package com.softi.one;

public class A2PropertiesTest {
	int d_num;
	private int pri_num;  // 为什么只提示private not nsed
	public int pub_num;
	protected int pro_num;
	
	public A2PropertiesTest(){
		
	}
	
	protected  A2PropertiesTest(int d_num){
		this.d_num = d_num;
	}
	
	A2PropertiesTest(int d_num, int pri_num){
		this.d_num = d_num;
		this.pri_num = pri_num;
	}
	
	private A2PropertiesTest(int d_num, int pri_num, int pub_num){
		this.d_num = d_num;
		this.pri_num = pri_num;
		this.pub_num = pub_num;
	}
	
	public void publicMethodT(){
		
	}
	protected void protectedMethodT(){
		
	}
	void defaultMethodT(){
		
	}
	private void privateMethodT(){
		
	}
}
