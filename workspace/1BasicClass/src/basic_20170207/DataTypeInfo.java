package basic_20170207;

// 包含java.lang.math(需要math.pow方法计算2的次方)
// 包含java.lang.Integer(需要其中的方法，将10进制其他进制转化为2,8,16进制)
import java.lang.*;
// 包含java.math.BigInteger(需要其中的将10进制转化为其他任意进制的方法)
// 包含java.math.BigDecimal 对应上面的整形，这个是浮点数
// 参考 http://blog.csdn.net/hqd_acm/article/details/5751686
import java.math.*;

public class DataTypeInfo {
	
	// 任意进制转换(整形)
	/**
	 * 
	 * @param bigData 传入的整形数据
	 * @param radix 进制数
	 * @return
	 */
	static String anyBase(String bigData, int radix) {
		return (new BigInteger(bigData).toString(radix));
	}
	
	
	public static void main(String[] args) {
		// 10进制转其他进制
		// binary(2进制) octal(8进制) decimal(10进制) hexadecimal(16进制)
		String binary = Integer.toBinaryString(10); // 10为int类型 
		String octal = Integer.toOctalString(10); // 10为int类型 
		String decimal = Integer.toHexString(10); // 10为int类型 
		
		
		// 任意进制测试
//		System.out.println("******任意进制转换");
//		System.out.println(anyBase("0",2));
//		System.out.println(anyBase("-1",2));
//		System.out.println(anyBase("1",2));
//		System.out.println(anyBase("-10",2));
		
		System.out.println(Integer.toBinaryString(0));
		System.out.println(Integer.toBinaryString(1));
		System.out.println(Integer.toBinaryString(-1));
		
		
		// 以int为类
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
