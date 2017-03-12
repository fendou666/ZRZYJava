package basic_20170216practice;

/**
 * 
 1、定义整形数组，从键盘输入5个元素，并求其最大值
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class A1GetMax {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		int [] aryInt = new int[5];
		int max = 0;
		// 第一种方法
//		for(int i = 0; i<5; i++) {
//			System.out.println("请输入第" + i + "个值");
//			aryInt[i] = input.nextInt();
//			if (aryInt[i] > max) {
//				max = aryInt[i];
//			}
//		}
		//第二种方法
//		for(int i = 0; i<5; i++) {
//			System.out.println("请输入第" + i + "个值");
//			aryInt[i] = input.nextInt();
//		}
//		Arrays.sort(aryInt);
//		max = aryInt[aryInt.length-1];
		input.close();
		System.out.println("最大值是" + max);
	}
}
