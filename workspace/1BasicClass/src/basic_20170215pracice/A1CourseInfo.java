package basic_20170215pracice;

import java.util.Scanner;

public class A1CourseInfo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入课程编号");
		int course = input.nextInt();
		
		switch (course) {
		case 1:
			System.out.println("英语");
			break;
		case 2:
			System.out.println("语文");
			break;
		case 3:
			System.out.println("数学");
			break;
		case 4:
			System.out.println("地理");
			break;
		case 5:
			System.out.println("生物");
			break;
		case 6:
			System.out.println("物理");
		case 7:
			System.out.println("化学");
			break;
			default :
				System.out.println("输入错误,只支持1到7");
		}
		input.close();
		
	}
}
