package Basic_20170209.old;

import java.util.Scanner;
public class A2Date {
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("��������");
		String year = input.next();
		System.out.println("��������");
		String month = input.next();
		System.out.println("��������");
		String day = input.next();
		System.out.println("�����뵱ǰʱ��");
		String time = input.next();
		input.close();
		System.out.println("�������ʱ����" + year + "��"
							+ month + "��"
							+ day + "��  "
							+ time);
	}
	
	
}
