package com.softi.one;

import com.softi.one.A2PropertiesTest;

public class ExtendsTest extends A2PropertiesTest {
	
	public ExtendsTest(){
//		super(); //��ʹ�̳�Ҳֻ�ܵ���public���췽��
//		super(22); // ���Է���protecte
//		super(2, 3); // ���Է���default
		super.d_num=10;
		super.pro_num =22;
		super.pub_num =33;
		
		super.publicMethodT();  //��������3��
		super.protectedMethodT();
		super.defaultMethodT();
//		super.privateMethodT();
	}
	
}
