package com.softi.one;

import com.softi.one.A2PropertiesTest;

public class ExtendsTest extends A2PropertiesTest {
	
	public ExtendsTest(){
//		super(); //即使继承也只能当问public构造方法
//		super(22); // 可以访问protecte
//		super(2, 3); // 可以访问default
		super.d_num=10;
		super.pro_num =22;
		super.pub_num =33;
		
		super.publicMethodT();  //方法访问3个
		super.protectedMethodT();
		super.defaultMethodT();
//		super.privateMethodT();
	}
	
}
