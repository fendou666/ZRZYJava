package basic_20170216practice;

import java.util.Arrays;
import java.util.Scanner;

public class A4ArrayFindValue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [] aryInt = {8, 4, 2, 1, 23, 344, 12};
		int number ;
		// ��һ��
//		Arrays.sort(aryInt);
//		while(true) {
//			System.out.println("������һ������");
//			number = input.nextInt();
//			if (Arrays.binarySearch(aryInt, number) >= 0) {
//				System.out.println("�²���ȷ");
//			} else {
//				System.out.println("�²����");
//			}
//		}
		// �ڶ���
		boolean inSign = false;
		while(true){
			System.out.println("������һ������");
			number = input.nextInt();
			inSign = false;
			for (int x: aryInt){
				if (x == number){
					inSign = true;
				}
			}
			if (inSign) {
				System.out.println("��ϲ�����");
			} else {
				System.out.println("Sorry! ��û����");
			}
		}
		
	}
}
