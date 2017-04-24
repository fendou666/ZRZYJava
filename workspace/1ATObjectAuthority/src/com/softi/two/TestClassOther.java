package com.softi.two;

import com.softi.one.A1PublicClass;
import com.softi.one.A2PropertiesTest;

public class TestClassOther {
	public static void main(String[] args) {
		/**
		 * 这是类的修饰符测试
		 * 
		 */
		A1PublicClass A1P = new A1PublicClass();
//		A2DefultClass A2D = new A2DefaultClass();  defaultClass其他包不可访问
		
		/**
		 * 构造方法修饰符测试
		 */
		A2PropertiesTest A2p1 = new A2PropertiesTest(); // 其他包只能访问publics

		/**
		 * 属性测试
		 */
//		A2p1.d_num = 11;  同级包只能访问public
//		A2p1.pro_num = 22;
		A2p1.pub_num = 33;
		
		/**
		 * 方法测试
		 */
		A2p1.publicMethodT();  //方法访问1个
//		A2p1.protectedMethodT();
//		A2p1.defaultMethodT();
		
	}
}
