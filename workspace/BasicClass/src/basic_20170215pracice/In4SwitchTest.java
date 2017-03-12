package basic_20170215pracice;

import java.util.Scanner;

public class In4SwitchTest {
	public static void main(String[] args) {
// if else
		// 单if
		
		
		
//		// 单if/else与三目运算符相同
//		int a = "22" == "22" ? 10 : 20;
		
		
		
		
		
// switch/case/default
//		// switch/case 语句 注意每个case块需要加break语句,
//		// 否则只要一个case匹配到,其后所有的语句都会执行(直到遇到break或者swich结束)
//		int weekDay1 = 3;
//		switch(weekDay1) {
//			case 1:
//				System.out.println("输入的是星期一");
//			case 2:
//				System.out.println("输入的是星期二");
//			case 3:
//				System.out.println("输入的是星期三");
//			case 4:
//				System.out.println("输入的是星期四");
//			case 5:
//				System.out.println("输入的是星期五");
//			case 6:
//				System.out.println("输入的是星期六");
//			case 7:
//				System.out.println("输入的是星期日");
//			default:
//				System.out.println("输入的是不是合法值！");
//		}
//		switch(weekDay1) {
//			case 1:
//				System.out.println("输入的是星期一");
//			case 2:
//				System.out.println("输入的是星期二");
//				break;
//			case 3:
//				System.out.println("输入的是星期三");
//			case 4:
//				System.out.println("输入的是星期四");
//			case 5:
//				System.out.println("输入的是星期五");
//			case 6:
//				System.out.println("输入的是星期六");
//				break;
//			case 7:
//				System.out.println("输入的是星期日");
//				break;
//			default:
//				System.out.println("输入的是不是合法值！");
//		}
		
		
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("请输入星期几：");
//		int weekDay = input.nextInt();
//		input.close();
//		switch(weekDay) {
//			case 1:
//				System.out.println("输入的是星期一");
//				break;
//			case 2:
//				System.out.println("输入的是星期二");
//				break;
//			case 3:
//				System.out.println("输入的是星期三");
//				break;
//			case 4:
//				System.out.println("输入的是星期四");
//				break;
//			case 5:
//				System.out.println("输入的是星期五");
//				break;
//			case 6:
//				System.out.println("输入的是星期六");
//				break;
//			case 7:
//				System.out.println("输入的是星期日");
//				break;
//			default:
//				System.out.println("输入的是不是合法值！");
//		}
		// 循环
		// while循环  先判断后执行再循环
		int x = 1;
		while (x<10) {
			System.out.println("x = " + x);
			x++;
		}
		// do...while循环（先执行后判断在循环）
		x = 1;
		do {
			System.out.println("x = " + x);
			x++;
		} while(x<10);
		// 先走()内前两个; 再走循环内语句, 在走()内最后一个分号
		int y = 10;
		for (int i = 0; i < 0; i++,++y) {
			System.out.println("直接循环");
		}
		System.out.println(y);
		
		// 9*9
	}
	
	
}
