package com.softi.one.child1;

import com.softi.one.A2PropertiesTest;

public class ExtendsTestChild1 extends A2PropertiesTest {
	
	public ExtendsTestChild1(){
//		super(); //��ʹ�̳�Ҳֻ�ܵ���public���췽��
//		super(int a, int b); // �Ӱ�Ҳֻ�ܷ���public
//		super.d_num=10; �����Է���default
		super.pro_num =22;
		super.pub_num =33;
		
		super.publicMethodT();  //��������2��
		super.protectedMethodT();
//		super.defaultMethodT();
	}
	
}
