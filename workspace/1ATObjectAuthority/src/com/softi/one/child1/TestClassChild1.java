package com.softi.one.child1;

import com.softi.one.A1PublicClass;
import com.softi.one.A2PropertiesTest;

public class TestClassChild1 {
	public static void main(String[] args) {
		A1PublicClass A1p = new A1PublicClass();
//		A2DefaultClass A2p = new A2DefaultClass();  //子包下不可以访问
		A2PropertiesTest A2p1 = new A2PropertiesTest(); // 只有public可以访问
//		A2p1.d_num = 11; //非继承只能访问public
//		A2p1.pro_num = 22;
		A2p1.pub_num = 33;
		
		A2p1.publicMethodT();  //方法访问1个
//		A2p1.protectedMethodT();
//		A2p1.defaultMethodT();
	}
}
