package com.softi.one;

public class TestClass {
	public static void main(String[] args) {
		A1PublicClass A1p = new A1PublicClass();
		A2DefaultClass A2p = new A2DefaultClass();  //ͨ���¿��Է���
		A2PropertiesTest A2p1 = new A2PropertiesTest(); // ���Է���public���캯��
		A2PropertiesTest A2P2 = new A2PropertiesTest(2); // ���Է���protected
		A2PropertiesTest A2p3 = new A2PropertiesTest(11, 22); //���Է���default
		A2p1.d_num = 11;
		A2p1.pro_num = 22;
		A2p1.pub_num = 33;
		
		A2p1.publicMethodT();  //��������3��
		A2p1.protectedMethodT();
		A2p1.defaultMethodT();
//		A2p1.privateMethodT();
		
 	}
}
