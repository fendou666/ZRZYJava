package o20170301;

import java.util.Scanner;


public class In1Exception {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�������һ����");
		int a = input.nextInt();
		System.out.println("������ڶ�����");
		int b = input.nextInt();
		
		try{
			int c = a/b;
		}catch(ArithmeticException e){
			System.out.println("�����쳣:" + e);
			
		}
		
		
		String [] s = {
				"asdf", "adf3", "qqwre"
		};
		try{
			for (int i=0;i<4 ;i++) {
				System.out.println(s[i]);
			}
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���������쳣��" + e);
			
		} finally{
			System.out.println("�����Ǹ���");
		}
		
		
		TestClass bird = new TestClass();

		bird =null;
		try{
			bird.fly();
		}catch(NullPointerException e){
			System.out.println("����ָ���쳣��" + e);
		}
		
		try{
			bird.fly();
		}catch(NullPointerException e){
			System.out.println("����ָ���쳣��" + e);
		}catch(ArrayIndexOutOfBoundsException e){
			
		}catch(ArithmeticException e) {
			
		}
		
	}
}
