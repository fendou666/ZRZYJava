package Basic_20170209.old;

import java.util.Scanner;
public class A4GiftMain {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		A4Gift gift = new A4Gift();
		System.out.println("设置礼物名称");
		gift.setName(input.next());
		System.out.println("设置礼物价格");
		gift.setPrice(input.nextDouble());
		input.close();
//		input.next();
		System.out.println("当前礼物的信息是");
		System.out.println("礼物名：" + gift.getName());
		System.out.println("礼物价格：" + gift.getPrice());
	}
}
