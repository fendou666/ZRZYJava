package Basic_20170209.old;

import java.util.Scanner;
public class A2Date {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("请输入年");
		String year = input.next();
		System.out.println("请输入月");
		String month = input.next();
		System.out.println("请输入日");
		String day = input.next();
		System.out.println("请输入当前时间");
		String time = input.next();
		input.close();
		System.out.println("您输入的时间是" + year + "年"
							+ month + "月"
							+ day + "日  "
							+ time);
	}
	
	
}
