package ch02;

import java.util.Random;



public class A23Scope {
//	{
//		// 一个花括号代表一个作用域+
//		// only x available
//		int x = 12;
//		{
//			int q = 96;
//			// Both x & q available
////			int x = 96;
//			// 不可以这样定义（c语言和c++会将外层x隐藏起来，而java不允许这样做）
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
