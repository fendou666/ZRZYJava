package basic_20170216practice;
/**
 * 
 * 
2、定义一个字符串数组，元素分别是：小熊，小宝，朵朵，果果。
   并将全部的元素输出出来。
 *
 */
public class A2StringArray {
	public static void main(String[] args) {
		String [] str = {"小熊","小宝","朵朵","果果"};
		// 第一种
//		for(int i=0; i<str.length; i++) {
//			System.out.print(str[i]);
//		}
		// 第二种
		for(String x : str) {
			System.out.print(x);
		}
	}
}
