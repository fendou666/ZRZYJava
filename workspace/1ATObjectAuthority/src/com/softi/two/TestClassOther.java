package com.softi.two;

import com.softi.one.A1PublicClass;
import com.softi.one.A2PropertiesTest;

public class TestClassOther {
	public static void main(String[] args) {
		/**
		 * ����������η�����
		 * 
		 */
		A1PublicClass A1P = new A1PublicClass();
//		A2DefultClass A2D = new A2DefaultClass();  defaultClass���������ɷ���
		
		/**
		 * ���췽�����η�����
		 */
		A2PropertiesTest A2p1 = new A2PropertiesTest(); // ������ֻ�ܷ���publics

		/**
		 * ���Բ���
		 */
//		A2p1.d_num = 11;  ͬ����ֻ�ܷ���public
//		A2p1.pro_num = 22;
		A2p1.pub_num = 33;
		
		/**
		 * ��������
		 */
		A2p1.publicMethodT();  //��������1��
//		A2p1.protectedMethodT();
//		A2p1.defaultMethodT();
		
	}
}
