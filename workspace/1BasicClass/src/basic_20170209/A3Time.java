package basic_20170209;

import java.util.Scanner;
public class A3Time {

	static String year, month, day;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入年");
		year = input.next();
		System.out.println("请输入月");
		month = input.next();
		System.out.println("请输入日");
		day = input.next();
			
		System.out.println("您输入的时间是" + year + "年" + month +"月" + day +"日");
		
	} 
	
}
