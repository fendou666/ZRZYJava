package yangjian;

/**
 * 
 * 
 * 字符种类计数
 * 描述:	实现一个功能，找出字符串中，不同的字符(字符包括a~z,A~Z,0~9)的个数
 * 输入的字符串长度不超过20个，不同的字符总数不超过10个
 * 内存限制:	128MByte
 * 输入:	字符串长度，字符串
 * 输出:	字符种类个数
 * 样例输入:	6,abaaal
 * 样例输出:	3
 * 答案提示	1找出字符串中不同的字符(字符包括a~z,A~Z,0~9)的个数输入的字符串长度不超过20个，不同的字符总数不超过10个。
 * 2需要将最终的结果使用打印函数打印进行打印。
 * 
 */


import java.util.ArrayList;
import java.util.Scanner;

public class Ex9CharCount {
	public static Scanner in = new Scanner(System.in);
	
	public static String getDiffChar(ArrayList diffChar){
		char ch;
		byte [] diffB = new byte[diffChar.size()];
		for(int i=0; i<diffChar.size(); i++){
			diffB[i] = (byte)diffChar.get(i);
		}
		return new String(diffB);
	}
	
	public static boolean getDiffCharCount(String testStr){
		if(testStr.length()>20){
			System.out.println("字符串长度超多20");
			return false;
		}
		
		byte[] bytes = testStr.getBytes();
		// 定义不同字符的数组集合
		ArrayList diffChar = new ArrayList();
		boolean diffSign = false;
		for(byte b: bytes){
			//System.out.println(b);
			diffSign = true;
			// 将与已整理的不同字符集进行比较
			for(int i=0; i<diffChar.size(); i++){
				if(b==(byte)diffChar.get(i)){
					diffSign = false;
				}
			}
			if(diffSign){
				diffChar.add(b);
			}
		}
		String diffString = getDiffChar(diffChar);
		System.out.println("不同的字符是" + diffString);
		if(diffString.length()>10){
			System.out.println("不同字符超多10个");
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("请输入字符串");
		String testStr = in.next();
		boolean sign = Ex9CharCount.getDiffCharCount(testStr);
	}
}
