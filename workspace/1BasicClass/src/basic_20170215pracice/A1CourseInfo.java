package basic_20170215pracice;

import java.util.Scanner;

public class A1CourseInfo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������γ̱��");
		int course = input.nextInt();
		
		switch (course) {
		case 1:
			System.out.println("Ӣ��");
			break;
		case 2:
			System.out.println("����");
			break;
		case 3:
			System.out.println("��ѧ");
			break;
		case 4:
			System.out.println("����");
			break;
		case 5:
			System.out.println("����");
			break;
		case 6:
			System.out.println("����");
		case 7:
			System.out.println("��ѧ");
			break;
			default :
				System.out.println("�������,ֻ֧��1��7");
		}
		input.close();
		
	}
}
