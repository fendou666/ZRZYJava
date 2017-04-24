package com.softi.two;

import com.softi.one.A2PropertiesTest;

public class ExtendsTestOther extends A2PropertiesTest {
	
	public ExtendsTestOther(){
		super(); //即使继承也只能当问public构造方法
//		super.d_num=10; 继承后不可以访问default属性
		super.pro_num =22;
		super.pub_num =33;
		
		super.publicMethodT();  //方法访问2个
		super.protectedMethodT();
//		super.defaultMethodT();
		
	}
	
}
