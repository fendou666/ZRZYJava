package Basic_20170209.old;

import java.util.Scanner;
public class A5Exchange {
	
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args){
		double a,b,tmp;
		System.out.println("������a����ֵ");
		a = input.nextDouble();
		System.out.println("������b����ֵ");
		b = input.nextDouble();
		
		tmp = a;
		a = b;
		b = tmp;
		System.out.println("������\na��ֵΪ" + a);
		System.out.println("b��ֵΪ" + b);
		
	}
}
