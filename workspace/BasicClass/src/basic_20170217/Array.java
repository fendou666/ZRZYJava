package basic_20170217;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
		// ���� 3��
		int [][] test1;
		int [] test2 [];
		int test3 [][];
		// ����3��
		int [][] a = new int[2][];
		// ��������
		int [][] b = new int[3][2];
		// ֱ�ӳ�ʼ��Ϊ��������
		int [][] c = {
				{122,334,55,234},
				{112,544,55,76},
				{12354,64,66,66}
					};
		// ֱ�ӳ�ʼ��Ϊ����������
		int [][] d = {
				{123,334,534,63423},
				{112,544,55},
				{12354,64,66,66},
				{12354}
					};
		// ���ݸ�ֵ�����ǹ���Ͳ���������
		a[0] = new int[]{111,333,44};
		a[1] = new int[]{22,33,5555,6666,777234,4234};
		
		// ��������
		// 1
		for(int i=0; i<a.length; i++){
			
			System.out.print("[");
//			// ��һ��
//			for(int j=0; j<a[i].length; j++){
//				System.out.print(a[i][j] +",");
//			}
//			// ���ַ���ɾ�����һ������
//			System.out.print("]");
			
			// �ڶ���
			for(int j=0; j<a[i].length-1; j++){
				System.out.print(a[i][j] +",");
			}
			System.out.print(a[i][a[i].length-1]+"],");
		}
		System.out.println("");
		// ʹ������ֵ
		for (int[] x : a) {
			System.out.print("[");
			for (int y : x) {
				System.out.print(y+",");
			}
			System.out.print("],");
		}
		System.out.println("");
		// ��ӡ������Ϣ
		System.out.println(Arrays.deepToString(a));
		// ����copy����
		// һάcopy
		// src, srcPos, dest, destPos, length �ֱ��Ǳ�����
		// length ���ܳ���srcPos����������ĳ���(��Ȼ����)
		System.out.println(Arrays.deepToString(d));
		System.arraycopy(a[0], 0, d[0], 0, 3);
		System.out.println(Arrays.deepToString(d));
		a[0][1] = 43422342;
		System.out.println(Arrays.deepToString(d));
		
		// �������� ֻ�ǽ��������ø�ֵ��
//		System.arraycopy(a, 1, d, 2, 1);
//		System.out.println(Arrays.deepToString(d));
//		a[1][0] = 15421545;
//		System.out.println(Arrays.deepToString(d));
		
		
//		// Arrays.copyofҲ�����õ�copy
//		int [][] x = Arrays.copyOf(a, 2);
//		System.out.println(Arrays.deepToString(x));
//		a[0][0] = 54541221;
//		System.out.println(Arrays.deepToString(x));
		// Arrays.copyof ��������ֱ��copy
		int [] y1 = {222,3433,444,5555,54666};
		int [] y2 = Arrays.copyOf(y1, 3);
		System.out.println(Arrays.toString(y2));
		y1[0] = 111;
		System.out.println(Arrays.toString(y2));
		
		
		
	}
}
