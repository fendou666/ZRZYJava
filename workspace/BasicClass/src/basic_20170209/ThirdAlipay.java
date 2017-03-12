package basic_20170209;

import java.util.Scanner;
public class ThirdAlipay {
	
	static String userName, password; 
	static double balance = 0;
	
	/*存钱 */
	static void deposit(double amount){
		
		balance += amount;
		System.out.println("成功存入"+amount);
	}
	// 取钱
	static boolean withdraw (double amount){
		
		if (balance < amount) {
			System.out.println("余额不足!");
			return false;
		}else {
			
			balance -= amount;
			System.out.println("取出"+amount);
			return true;
		}
	}
	// 余额
	public static double getBalance(){
		return balance;
	};
	public static void main(String[] args) {
//		Scanner scanObj = new Scanner(System.in);
//		int amount = scanObj. 
		userName = "aaa.@qq.com";
		password = "1341234";
		System.out.println("成功登陆支付宝");
		System.out.println("您的余额为");
		System.out.println(getBalance());
		deposit(100);
		System.out.println("取出200试一试");
		withdraw(200);
		System.out.println("取出80试一试");
		withdraw(80);
		System.out.println("查询余额");
		System.out.println(getBalance());
	}
}
