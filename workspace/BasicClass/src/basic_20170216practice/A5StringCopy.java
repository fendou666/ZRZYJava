package basic_20170216practice;

import java.util.Scanner;

/**
 * 
9、定义两个String类型的数组，a,b，
   将a中的第一个元素赋值到b数组中，
   从第二个数组的第二个位置中开始，赋值两个元素

 *
 */
public class A5StringCopy {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String [] str1 = {"aa","bb","cc","dd"};
		String [] str2 = {"11","22","33","44"};
		String [] str3 = new String[str2.length+1];
		String [] str4 = new String[str3.length+2];
		// 将a中的第一个元素赋值到b数组中
		for (int i=0; i<str2.length; i++) {
			str3[i] = str2[i];
		}
		str3[str3.length-1] = str1[0];
		System.out.println("第一次更改结果是"); //
		for (int i=0; i<str3.length; i++) {
			System.out.print(str3[i] + " ");
		}
		System.out.println(""); //
		//  从第二个数组的第二个位置中开始，赋值两个元素
		str4[0] = str2[0];
		for (int i=0; i<2; i++) {
			System.out.println("请输入一个字符串");
			str4[i+1] = input.next();
		}
		input.close(); //
		
		for (int i=0; i<str3.length-1; i++){
			str4[i+3] = str3[i+1]; 
		}
		
		for (int i=0; i<str4.length; i++) {
			System.out.print(str4[i] + " ");
		}
		
	}
}
