package basic_20170216practice;

/**
 * 
 1�������������飬�Ӽ�������5��Ԫ�أ����������ֵ
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class A1GetMax {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		int [] aryInt = new int[5];
		int max = 0;
		// ��һ�ַ���
//		for(int i = 0; i<5; i++) {
//			System.out.println("�������" + i + "��ֵ");
//			aryInt[i] = input.nextInt();
//			if (aryInt[i] > max) {
//				max = aryInt[i];
//			}
//		}
		//�ڶ��ַ���
//		for(int i = 0; i<5; i++) {
//			System.out.println("�������" + i + "��ֵ");
//			aryInt[i] = input.nextInt();
//		}
//		Arrays.sort(aryInt);
//		max = aryInt[aryInt.length-1];
		input.close();
		System.out.println("���ֵ��" + max);
	}
}
