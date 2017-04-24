package com.softi.one.child1;

import com.softi.one.A2PropertiesTest;

public class ExtendsTestChild1 extends A2PropertiesTest {
	
	public ExtendsTestChild1(){
//		super(); //即使继承也只能当问public构造方法
//		super(int a, int b); // 子包也只能访问public
//		super.d_num=10; 不可以访问default
		super.pro_num =22;
		super.pub_num =33;
		
		super.publicMethodT();  //方法访问2个
		super.protectedMethodT();
//		super.defaultMethodT();
	}
	
}
