package basic_20170213com.Ics.practice;


import java.lang.*;

import java.math.*;
/**
 *
 ʮ����ת��Ϊ�������Ʋο� http://wenda.so.com/q/1378399784075358?src=140
 �ĵ����� Integer
 ��toBinaryString ����
 java.lang.Integer���API�����н���ת���ĺ��� 
 public static String toBinaryString(int i) 
 public static String toHexString(int i) 
 public static String toOctalString(int i) 
 ��3�����������Խ�ʮ���Ƶ�����ת���ɶ���һ�����˽����� 
 ����ת����Ľ�������ַ�������ʽ 

��Ȼ�õ������ַ���
�����㵱Ȼ�Ϳ�������string.sub(x-1,x)�ķ������жϸ�xλ��������0����1
֮���ٰ�x���س�������ô��֪�������
 2����ת�������� http://blog.csdn.net/uikoo9/article/details/27980869
 http://wenda.so.com/q/1363474996060842?src=140
 import java.math.BigInteger; 
 �ĵ����� BigInteger �����췽��

����float, double �Ĵ洢 http://blog.csdn.net/zmq5411/article/details/6301250
 *
 */
public class TypeConvert {
	
	// �Զ�����ת�� , �� = С;
	short minShortA = (short) (-Math.pow(2.0, 15));
	short maxShortA = (short) (Math.pow(2.0, 15)-1); // 
	long aotuLongB  = maxShortA;
	boolean test ;
	byte a = 10;
	
	
	// ǿ������ת��, С = (С����������) ��;
//	byte a = 11;
//	short b = a;
//	int c = 10000;
//	byte d = (byte) c;
	
	long minLong  = (long) Math.pow(2, 32);
	int intA = (int) (minLong);
	long testa = 100000L;
	byte testb = (byte) testa;
	
	
	// ��������ת��
	String aa = Integer.toBinaryString(-2); 
	int ccc = (int) Math.pow(2, 5);
	byte cc = (byte) (Math.pow(2, 7) + Math.pow(2, 5));
	
	
	// ��������
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
		
		String aaaa = "-2";//������ֵ 
		BigInteger srca = new BigInteger(aaaa);//ת��ΪBigInteger���� 
		System.out.println(srca.toString(2));//ת��Ϊ2���Ʋ������� 
	}
}
