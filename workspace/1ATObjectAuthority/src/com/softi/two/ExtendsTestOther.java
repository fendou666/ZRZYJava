package com.softi.two;

import com.softi.one.A2PropertiesTest;

public class ExtendsTestOther extends A2PropertiesTest {
	
	public ExtendsTestOther(){
		super(); //��ʹ�̳�Ҳֻ�ܵ���public���췽��
//		super.d_num=10; �̳к󲻿��Է���default����
		super.pro_num =22;
		super.pub_num =33;
		
		super.publicMethodT();  //��������2��
		super.protectedMethodT();
//		super.defaultMethodT();
		
	}
	
}
