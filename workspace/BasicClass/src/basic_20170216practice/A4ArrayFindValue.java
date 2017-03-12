package basic_20170216practice;

import java.util.Arrays;
import java.util.Scanner;

public class A4ArrayFindValue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] aryInt = {8, 4, 2, 1, 23, 344, 12};
		int number ;
		// 第一种
//		Arrays.sort(aryInt);
//		while(true) {
//			System.out.println("请输入一个整数");
//			number = input.nextInt();
//			if (Arrays.binarySearch(aryInt, number) >= 0) {
//				System.out.println("猜测正确");
//			} else {
//				System.out.println("猜测错误");
//			}
//		}
		// 第二种
		boolean inSign = false;
		while(true){
			System.out.println("请输入一个整数");
			number = input.nextInt();
			inSign = false;
			for (int x: aryInt){
				if (x == number){
					inSign = true;
				}
			}
			if (inSign) {
				System.out.println("恭喜你猜中");
			} else {
				System.out.println("Sorry! 你没猜中");
			}
		}
		
	}
}
