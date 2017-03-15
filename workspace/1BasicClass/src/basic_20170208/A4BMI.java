package basic_20170208;

import java.util.Scanner;

public class A4BMI {

	public static double getBMI(double weight, double height) {
		return weight/(height*height);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double height;
		double weight;
//		System.out.println("请输入身高");
//		double height = input.nextDouble();//提示没有被使用？？？
//		System.out.println("请输入体重");
//		double weight = input.nextDouble();
		System.out.println("体重质量指数计算器\n"
				+ "正常：BMI=18~25\n"
				+ "超重：BMI=25~30\n"
				+ "轻度肥胖：BMI=30~35\n"
				+ "中度肥胖：BMI=35~40\n"
				+ "重度肥胖：BMI>40\n"
				+ "根据公式计算BMI\n"
				+ "体重60kg,身高1.75cm\n"
				+ "计算BMI为\n"
//				+ getBMI(height, weight));
				+ getBMI(height=1.75, weight=60));
		
	}
	
}
