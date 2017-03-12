package Basic_20170209.old;

import java.util.Scanner;
public class A5Exchange {
	
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args){
		double a,b,tmp;
		System.out.println("请输入a的数值");
		a = input.nextDouble();
		System.out.println("请输入b的数值");
		b = input.nextDouble();
		
		tmp = a;
		a = b;
		b = tmp;
		System.out.println("交换后\na的值为" + a);
		System.out.println("b的值为" + b);
		
	}
}
