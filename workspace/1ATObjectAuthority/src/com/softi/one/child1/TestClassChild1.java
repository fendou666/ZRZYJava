package com.softi.one.child1;

import com.softi.one.A1PublicClass;
import com.softi.one.A2PropertiesTest;

public class TestClassChild1 {
	public static void main(String[] args) {
		A1PublicClass A1p = new A1PublicClass();
//		A2DefaultClass A2p = new A2DefaultClass();  //�Ӱ��²����Է���
		A2PropertiesTest A2p1 = new A2PropertiesTest(); // ֻ��public���Է���
//		A2p1.d_num = 11; //�Ǽ̳�ֻ�ܷ���public
//		A2p1.pro_num = 22;
		A2p1.pub_num = 33;
		
		A2p1.publicMethodT();  //��������1��
//		A2p1.protectedMethodT();
//		A2p1.defaultMethodT();
	}
}
