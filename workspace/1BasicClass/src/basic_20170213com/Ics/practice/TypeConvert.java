package basic_20170213com.Ics.practice;


import java.lang.*;

import java.math.*;
/**
 *
 十进制转化为其他进制参考 http://wenda.so.com/q/1378399784075358?src=140
 文档搜索 Integer
 看toBinaryString 方法
 java.lang.Integer这个API包中有进制转换的函数 
 public static String toBinaryString(int i) 
 public static String toHexString(int i) 
 public static String toOctalString(int i) 
 这3个函数都可以将十进制的整数转换成二、一六、八进制数 
 不过转换后的结果都是字符串的形式 

既然得到的是字符串
我想你当然就可以利用string.sub(x-1,x)的方法来判断该x位的数等于0还是1
之后再把x返回出来，那么就知道结果了
 2进制转其他进制 http://blog.csdn.net/uikoo9/article/details/27980869
 http://wenda.so.com/q/1363474996060842?src=140
 import java.math.BigInteger; 
 文档搜索 BigInteger 看构造方法

关于float, double 的存储 http://blog.csdn.net/zmq5411/article/details/6301250
 *
 */
public class TypeConvert {
	
	// 自动类型转换 , 大 = 小;
	short minShortA = (short) (-Math.pow(2.0, 15));
	short maxShortA = (short) (Math.pow(2.0, 15)-1); // 
	long aotuLongB  = maxShortA;
	boolean test ;
	byte a = 10;
	
	
	// 强制类型转换, 小 = (小的数据类型) 大;
//	byte a = 11;
//	short b = a;
//	int c = 10000;
//	byte d = (byte) c;
	
	long minLong  = (long) Math.pow(2, 32);
	int intA = (int) (minLong);
	long testa = 100000L;
	byte testb = (byte) testa;
	
	
	// 数据类型转换
	String aa = Integer.toBinaryString(-2); 
	int ccc = (int) Math.pow(2, 5);
	byte cc = (byte) (Math.pow(2, 7) + Math.pow(2, 5));
	
	
	// 负数计算
	byte dd = (byte) Math.pow(2, 7);
	int testdd = -(int) Math.pow(2, 7);
	byte ddd = (byte) testdd;
	public static void main(String[] args){
		TypeConvert data = new TypeConvert();
		System.out.println(data.minShortA);
		System.out.println(data.maxShortA);
		System.out.println(data.minLong);
		System.out.println(data.intA);
		System.out.println(data.test);
		
		System.out.println(data.testb);
		System.out.println(data.aa);
		System.out.println(data.ccc);
		System.out.println(data.cc);
		
		System.out.println(data.dd);
		System.out.println(data.ddd);
		
		String aaaa = "-2";//输入数值 
		BigInteger srca = new BigInteger(aaaa);//转换为BigInteger类型 
		System.out.println(srca.toString(2));//转换为2进制并输出结果 
	}
}
