package basic_20170216practice;

import java.util.Arrays;

/**
 * 
6����һ�������Ԫ�����򽻻��� 
int[] a = { 5, 11, 15, 24, 36, 47, 59, 66 };
����Ԫ�غ�
int[] a = { 66 ,59 ,47 ,36 ,24,15 ,11 ,5 };
 * 
 *
 */
public class A3ArrayExcange {
	public static void main(String[] args) {
		int [] aryInt = { 5, 11, 15, 24, 36, 47, 59, 66 };
		int tmp = 0;
		int length = aryInt.length;
		// ��һ��ֱ�� a[0] , a[n-1] ����
		// �ڶ���ͨ��������ת��Ϊchar�ַ�,Ȼ���ַ������ַ����У�Ȼ�����ַ�����
		// ������ͨ�� ����������copyof�������飬Ȼ��forѭ����ֵ;
//		for (int i=0; i<length/2 ; i++) {
//			tmp = aryInt[i];
//			aryInt[i] = aryInt[length-1-i];
//			aryInt[length-1-i]  = tmp;
//		}
//		System.out.println(Arrays.toString(aryInt));
		
		
		
	}
}
