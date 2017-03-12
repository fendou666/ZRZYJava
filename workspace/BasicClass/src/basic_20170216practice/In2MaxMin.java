package basic_20170216practice;

import java.util.Scanner;

public class In2MaxMin {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a, b, c;
		double max = 0, min = 0;
		System.out.println("输入第一个数");
		a = input.nextDouble();
		System.out.println("输入第二个数");
		b = input.nextDouble();
		System.out.println("输入第三个数");
		c = input.nextDouble();
		
		if (a>b && a>c){
			max = a;
		}
		if (b>a && b>c){
			max = b;
		}
		if (c>a && c>b){
			max = c;
		}
		if (a<b && a<c){
			min = a;
		}
		if (b<a && b<c){
			min = b;
		}
		if (c<a && c<b){
			min = c;
		}
		// 或者
		max = a>b? a : b;
		max = max>c? max:c;
		min = a<b? a : b;
		min = min<c? max:c;
		
		
//		if (a1>a2) {
//			if (a1>a3) {
//				System.out.println("a1最大");
//				if (a2>a3) {
//					System.out.println("a3最小");
//				} else {
//					System.out.println("a2最小");
//				}
//				
//			} else {
//				System.out.println("a3最大");
//				System.out.println("a2最小");
//			}
//			
//		} else {
//			if (a2>a3) {
//				System.out.println("a2最大");
//				if (a3>a1) {
//					System.out.println("a1最小");
//				} else {
//					System.out.println("a3最小");
//				}
//				
//			} else {
//				System.out.println("a2最大");
//				System.out.println("a3最小");
//			}
//			
//		}
		
	}
}
