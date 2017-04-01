package basic_20170207;

// ����java.lang.math(��Ҫmath.pow��������2�Ĵη�)
// ����java.lang.Integer(��Ҫ���еķ�������10������������ת��Ϊ2,8,16����)
import java.lang.*;
// ����java.math.BigInteger(��Ҫ���еĽ�10����ת��Ϊ����������Ƶķ���)
// ����java.math.BigDecimal ��Ӧ��������Σ�����Ǹ�����
// �ο� http://blog.csdn.net/hqd_acm/article/details/5751686
import java.math.*;

public class DataTypeInfo {
	
	// �������ת��(����)
	/**
	 * 
	 * @param bigData �������������
	 * @param radix ������
	 * @return
	 */
	static String anyBase(String bigData, int radix) {
		return (new BigInteger(bigData).toString(radix));
	}
	
	
	public static void main(String[] args) {
		// 10����ת��������
		// binary(2����) octal(8����) decimal(10����) hexadecimal(16����)
		String binary = Integer.toBinaryString(10); // 10Ϊint���� 
		String octal = Integer.toOctalString(10); // 10Ϊint���� 
		String decimal = Integer.toHexString(10); // 10Ϊint���� 
		
		
		// ������Ʋ���
//		System.out.println("******�������ת��");
//		System.out.println(anyBase("0",2));
//		System.out.println(anyBase("-1",2));
//		System.out.println(anyBase("1",2));
//		System.out.println(anyBase("-10",2));
		
		System.out.println(Integer.toBinaryString(0));
		System.out.println(Integer.toBinaryString(1));
		System.out.println(Integer.toBinaryString(-1));
		
		
		// ��intΪ��
		int a = 0;
		int b = 1;
		int c = (int) Math.pow(2, 31) -1;
		int d = (int) Math.pow(2, 31);
		//int e = - (int) Math.pow(2, 31); // ???
		int f = -1;
		int g = (int) (Math.pow(2, 31) + Math.pow(2, 31));
		int h = -2;
		int i = -2;
		int j = -((int) Math.pow(2, 31) - 1);
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(c));
		System.out.println(Integer.toBinaryString(d));
		//System.out.println(Integer.toBinaryString(e));
		System.out.println(Integer.toBinaryString(f));
		System.out.println(Integer.toBinaryString(g));
		System.out.println(Integer.toBinaryString(h));
		
	}
	
	
	
}
