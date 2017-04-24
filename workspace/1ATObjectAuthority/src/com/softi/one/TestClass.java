package com.softi.one;

public class TestClass {
	public static void main(String[] args) {
		A1PublicClass A1p = new A1PublicClass();
		A2DefaultClass A2p = new A2DefaultClass();  //通包下可以访问
		A2PropertiesTest A2p1 = new A2PropertiesTest(); // 可以访问public构造函数
		A2PropertiesTest A2P2 = new A2PropertiesTest(2); // 可以访问protected
		A2PropertiesTest A2p3 = new A2PropertiesTest(11, 22); //可以访问default
		A2p1.d_num = 11;
		A2p1.pro_num = 22;
		A2p1.pub_num = 33;
		
		A2p1.publicMethodT();  //方法访问3个
		A2p1.protectedMethodT();
		A2p1.defaultMethodT();
//		A2p1.privateMethodT();
		
 	}
}
