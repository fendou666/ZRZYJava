package basic_20170209;

import java.util.Scanner;
public class A6Exchange {

	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.println("��������ֵa");
//		double a = input.nextDouble();
//		System.out.println("��������ֵb");
//		double b = input.nextDouble();
//		
//		double tmp = a;
//		a = b;
//		b = tmp;
//		System.out.println("a,b������");
//		System.out.println("aֵΪ" + a);
//		System.out.println("bֵΪ" + b);
		int a = 1,
			b = 2,
			c = 3,
			d = 4,
			e = 5,
			f = 6,
			g = 7;
		int tmp;
		tmp = a;
		a = g;
		g = tmp;
		
		tmp = b;
		b = f;
		f = tmp;
		
		tmp = c;
		c = e;
		e = tmp;
		System.out.println("a = " +a);
		System.out.println("b = " +b);	
		System.out.println("c = " +c);	
		System.out.println("d = " +d);	
		System.out.println("e = " +e);	
		System.out.println("f = " +f);	
		System.out.println("g = " +g);	
		
	} 
}
