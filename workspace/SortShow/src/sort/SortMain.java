package sort;

import java.util.Arrays;

public class SortMain {
	public static void main(String[] args) {
		
		for (int i = 5;i>0;i--) {
			for(int j=0; j<i;j++){
				System.out.print("*");
			}
			System.out.println();
		}

		int a[] = {3343,65,662,12,1343,1232342,413,452};
		int b[] = Arrays.copyOf(a, a.length);
		
		System.out.println("这是数组a的初始值");
		System.out.println(Arrays.toString(a));
		// 内部循环每次取出最大值
		// 将最大一直交换到最后
		int tmp = 0;
		// 关于length-1， 交换数据最多交换length-1次
		for(int i=0; i<a.length -1; i++) {
			
			if(a[i+1] < a[i]){
				tmp = a[i+1];
				a[i+1] = a[i];
				a[i] = tmp;
			}
		}
		System.out.println("这是经过一次将最大值移到最后一位的结果");
		System.out.println("这种方式叫做一次冒泡");
		System.out.println(Arrays.toString(a));
		
		for(int i=0; i<a.length -2; i++) {
			
			if(a[i+1] < a[i]){
				tmp = a[i+1];
				a[i+1] = a[i];
				a[i] = tmp;
			}
		}
		System.out.println("这是经过两次将最大值移到最后一位（不算已经排序的一位）的结果");
		System.out.println("这种方式叫做二次冒泡");
		System.out.println(Arrays.toString(a));
		System.out.println("这是初始数组的值");
		System.out.println(Arrays.toString(b));
		
		// 首次循环length-1次，i>0最后一次循环一次
		for (int i = b.length-1; i>0; i--) {
			for(int j=0; j<i;j++){
				if(b[j+1] < b[j]){
					tmp = b[j+1];
					b[j+1] = b[j];
					b[j] = tmp;
				}
			}
		}
		System.out.println("这是冒泡排序后的结果");
		System.out.println(Arrays.toString(b));
		
	}
}
