package basic_20170216practice;

import java.util.Arrays;

/**
 * 
6、把一个数组的元素逆序交换， 
int[] a = { 5, 11, 15, 24, 36, 47, 59, 66 };
交换元素后
int[] a = { 66 ,59 ,47 ,36 ,24,15 ,11 ,5 };
 * 
 *
 */
public class A3ArrayExcange {
	public static void main(String[] args) {
		int [] aryInt = { 5, 11, 15, 24, 36, 47, 59, 66 };
		int tmp = 0;
		int length = aryInt.length;
		// 第一种直接 a[0] , a[n-1] 交换
		// 第二种通过将数字转化为char字符,然后将字符存入字符串中，然后倒叙字符串；
		// 第三种通过 将数组整个copyof到型数组，然后for循环赋值;
//		for (int i=0; i<length/2 ; i++) {
//			tmp = aryInt[i];
//			aryInt[i] = aryInt[length-1-i];
//			aryInt[length-1-i]  = tmp;
//		}
//		System.out.println(Arrays.toString(aryInt));
		
		
		
	}
}
