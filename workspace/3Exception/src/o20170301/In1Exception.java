package o20170301;

import java.util.Scanner;


public class In1Exception {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入第一个数");
		int a = input.nextInt();
		System.out.println("请输入第二个数");
		int b = input.nextInt();
		
		try{
			int c = a/b;
		}catch(ArithmeticException e){
			System.out.println("除法异常:" + e);
			
		}
		
		
		String [] s = {
				"asdf", "adf3", "qqwre"
		};
		try{
			for (int i=0;i<4 ;i++) {
				System.out.println(s[i]);
			}
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("捕获数组异常：" + e);
			
		} finally{
			System.out.println("神马都是浮云");
		}
		
		
		TestClass bird = new TestClass();

		bird =null;
		try{
			bird.fly();
		}catch(NullPointerException e){
			System.out.println("捕获指针异常：" + e);
		}
		
		try{
			bird.fly();
		}catch(NullPointerException e){
			System.out.println("捕获指针异常：" + e);
		}catch(ArrayIndexOutOfBoundsException e){
			
		}catch(ArithmeticException e) {
			
		}
		
	}
}
