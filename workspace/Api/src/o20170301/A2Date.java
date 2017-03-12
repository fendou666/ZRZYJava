package o20170301;

import java.util.Calendar;
import java.util.Scanner;

public class A2Date {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Calendar cal = new Calendar()+;
		int needYear , needMonth;
		System.out.println("请输入年");
		needYear = input.nextInt();
		System.out.println("请输入月");
		needMonth  = input.nextInt();
		int [] month; 
		int [] monthRun = {31, 27, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31};
		int [] monthOther = {31, 28, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31};
		if (needYear%4 == 0) {
			if (needYear%100 == 0 && needYear%400 != 0) {
				month = monthRun;
			} else {
				month = monthOther;
			}
		}
		
		
	}
}
