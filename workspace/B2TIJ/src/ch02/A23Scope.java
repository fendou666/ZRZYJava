package ch02;

import java.util.Random;



public class A23Scope {
//	{
//		// һ�������Ŵ���һ��������+
//		// only x available
//		int x = 12;
//		{
//			int q = 96;
//			// Both x & q available
////			int x = 96;
//			// �������������壨c���Ժ�c++�Ὣ���x������������java��������������
//		}
//		// only x available
//		// q is "out of scope"
//	}
//	{
//		String s = new String("a string");
//	} // End of scope
	public static void main(String[] args) {
		Random random = new Random();
		int a = random.nextInt(1111);
		float b = random.nextFloat();
		//int a = random.nextInt(1111);
	}
}
