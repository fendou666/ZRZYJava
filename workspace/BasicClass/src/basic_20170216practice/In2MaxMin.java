package basic_20170216practice;

import java.util.Scanner;

public class In2MaxMin {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a, b, c;
		double max = 0, min = 0;
		System.out.println("�����һ����");
		a = input.nextDouble();
		System.out.println("����ڶ�����");
		b = input.nextDouble();
		System.out.println("�����������");
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
		// ����
		max = a>b? a : b;
		max = max>c? max:c;
		min = a<b? a : b;
		min = min<c? max:c;
		
		
//		if (a1>a2) {
//			if (a1>a3) {
//				System.out.println("a1���");
//				if (a2>a3) {
//					System.out.println("a3��С");
//				} else {
//					System.out.println("a2��С");
//				}
//				
//			} else {
//				System.out.println("a3���");
//				System.out.println("a2��С");
//			}
//			
//		} else {
//			if (a2>a3) {
//				System.out.println("a2���");
//				if (a3>a1) {
//					System.out.println("a1��С");
//				} else {
//					System.out.println("a3��С");
//				}
//				
//			} else {
//				System.out.println("a2���");
//				System.out.println("a3��С");
//			}
//			
//		}
		
	}
}
