package basic_20170209;

import java.util.Scanner;
public class ThirdAlipay {
	
	static String userName, password; 
	static double balance = 0;
	
	/*��Ǯ */
	static void deposit(double amount){
		
		balance += amount;
		System.out.println("�ɹ�����"+amount);
	}
	// ȡǮ
	static boolean withdraw (double amount){
		
		if (balance < amount) {
			System.out.println("����!");
			return false;
		}else {
			
			balance -= amount;
			System.out.println("ȡ��"+amount);
			return true;
		}
	}
	// ���
	public static double getBalance(){
		return balance;
	};
	public static void main(String[] args) {
//		Scanner scanObj = new Scanner(System.in);
//		int amount = scanObj. 
		userName = "aaa.@qq.com";
		password = "1341234";
		System.out.println("�ɹ���½֧����");
		System.out.println("�������Ϊ");
		System.out.println(getBalance());
		deposit(100);
		System.out.println("ȡ��200��һ��");
		withdraw(200);
		System.out.println("ȡ��80��һ��");
		withdraw(80);
		System.out.println("��ѯ���");
		System.out.println(getBalance());
	}
}
