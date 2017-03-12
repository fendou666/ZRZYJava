package basic_20170208;

import java.util.Scanner;

public class A5BasicOperation {
	public static double add(double a, double b){
		return a+b;
	}
	public static double subtract(double a, double b){
		return a-b;
	}
	public static double multiply(double a, double b){
		return a*b;
	}
	public static double divide(double a, double b){
		return a/b;
	}
//	public static void testReturnVoid(){};
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入运算数一");
		double a = input.nextDouble();
		System.out.println("请输入运算数二");
		double b = input.nextDouble();
		System.out.println("a+b=" + add(a,b) +"\n"
				+ "a-b=" + subtract(a,b) +"\n"
				+ "a*b=" + multiply(a,b) +"\n"
				+ "a/b=" + divide(a,b));
		input.close();
//		testReturnVoid();
//		System.out.println(testReturnVoid());
		
	}
}
