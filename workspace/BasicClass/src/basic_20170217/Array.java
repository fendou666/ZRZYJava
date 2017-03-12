package basic_20170217;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		// 声明 3中
		int [][] test1;
		int [] test2 [];
		int test3 [][];
		// 创建3中
		int [][] a = new int[2][];
		// 矩阵数组
		int [][] b = new int[3][2];
		// 直接初始化为矩阵数组
		int [][] c = {
				{122,334,55,234},
				{112,544,55,76},
				{12354,64,66,66}
					};
		// 直接初始化为不规则数组
		int [][] d = {
				{123,334,534,63423},
				{112,544,55},
				{12354,64,66,66},
				{12354}
					};
		// 根据赋值可以是规则和不规则数组
		a[0] = new int[]{111,333,44};
		a[1] = new int[]{22,33,5555,6666,777234,4234};
		
		// 迭代遍历
		// 1
		for(int i=0; i<a.length; i++){
			
			System.out.print("[");
//			// 第一种
//			for(int j=0; j<a[i].length; j++){
//				System.out.print(a[i][j] +",");
//			}
//			// 用字符串删除最后一个逗号
//			System.out.print("]");
			
			// 第二种
			for(int j=0; j<a[i].length-1; j++){
				System.out.print(a[i][j] +",");
			}
			System.out.print(a[i][a[i].length-1]+"],");
		}
		System.out.println("");
		// 使用数组值
		for (int[] x : a) {
			System.out.print("[");
			for (int y : x) {
				System.out.print(y+",");
			}
			System.out.print("],");
		}
		System.out.println("");
		// 打印数组信息
		System.out.println(Arrays.deepToString(a));
		// 数组copy函数
		// 一维copy
		// src, srcPos, dest, destPos, length 分别是变量名
		// length 不能超过srcPos到数组结束的长度(不然报错)
		System.out.println(Arrays.deepToString(d));
		System.arraycopy(a[0], 0, d[0], 0, 3);
		System.out.println(Arrays.deepToString(d));
		a[0][1] = 43422342;
		System.out.println(Arrays.deepToString(d));
		
		// 这个好理解 只是将几个引用赋值了
//		System.arraycopy(a, 1, d, 2, 1);
//		System.out.println(Arrays.deepToString(d));
//		a[1][0] = 15421545;
//		System.out.println(Arrays.deepToString(d));
		
		
//		// Arrays.copyof也是引用的copy
//		int [][] x = Arrays.copyOf(a, 2);
//		System.out.println(Arrays.deepToString(x));
//		a[0][0] = 54541221;
//		System.out.println(Arrays.deepToString(x));
		// Arrays.copyof 基本类型直接copy
		int [] y1 = {222,3433,444,5555,54666};
		int [] y2 = Arrays.copyOf(y1, 3);
		System.out.println(Arrays.toString(y2));
		y1[0] = 111;
		System.out.println(Arrays.toString(y2));
		
		
		
	}
}
