package Basic_20170209.old;

import java.util.Scanner;
public class A4GiftMain {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		A4Gift gift = new A4Gift();
		System.out.println("������������");
		gift.setName(input.next());
		System.out.println("��������۸�");
		gift.setPrice(input.nextDouble());
		input.close();
//		input.next();
		System.out.println("��ǰ�������Ϣ��");
		System.out.println("��������" + gift.getName());
		System.out.println("����۸�" + gift.getPrice());
	}
}
