package basic_20170209;


import java.util.Scanner;
public class A5GIft {
	static String name;
	static double price;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入礼品名");
		name = input.next();
		System.out.println("请输入礼品价格");
		price = input.nextDouble();
			
		System.out.println("您输入的礼品是" + name + "价格是" + price);
		
	} 
	

}
