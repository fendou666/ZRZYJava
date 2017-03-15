package basic_20170216practice;

import java.util.Arrays;

public class In4ArraysMethod {
	public static void main(String[] args) {
		int [] a = {52,1,5123,513,33,51,11};
//		Arrays.fill(a, 55);
//		System.out.println(Arrays.toString(a));
		// a, fromIndex, toIndex, val
//		Arrays.fill(a, 3, 5, 22);
//		System.out.println(Arrays.toString(a));
		// 按升序排序
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
//		System.out.println(Arrays.binarySearch(a, 513));
		
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
		// a, fromIndex, toIndex
//		Arrays.sort(a, 4, 6);
//		System.out.println(Arrays.toString(a));
//		int [] b = Arrays.copyOf(a, 5);
//		System.out.println(Arrays.toString(b));
		
		// 包前不包后
		int [] d = Arrays.copyOfRange(a, 2, 5);
		System.out.println(Arrays.toString(d));
		
		
	}
}
