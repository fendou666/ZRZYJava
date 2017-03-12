package basic_20170208;

import java.util.Scanner;

public class A3rubbishStatistics {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("中国每年产生近10亿吨垃圾");
		System.out.println("输入我国目前年产生的垃圾量");
//		String outStr = input.next();
//		double outStr = input.nextDouble();
		int outStr = input.nextInt();
		input.close();
		System.out.println("我国今年的目前垃圾量为" + outStr +  "吨垃圾");
		
	}
}