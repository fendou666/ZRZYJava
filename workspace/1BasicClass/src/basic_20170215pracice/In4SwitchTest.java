package basic_20170215pracice;

import java.util.Scanner;

public class In4SwitchTest {
	public static void main(String[] args) {
// if else
		// ��if
		
		
		
//		// ��if/else����Ŀ�������ͬ
//		int a = "22" == "22" ? 10 : 20;
		
		
		
		
		
// switch/case/default
//		// switch/case ��� ע��ÿ��case����Ҫ��break���,
//		// ����ֻҪһ��caseƥ�䵽,������е���䶼��ִ��(ֱ������break����swich����)
//		int weekDay1 = 3;
//		switch(weekDay1) {
//			case 1:
//				System.out.println("�����������һ");
//			case 2:
//				System.out.println("����������ڶ�");
//			case 3:
//				System.out.println("�������������");
//			case 4:
//				System.out.println("�������������");
//			case 5:
//				System.out.println("�������������");
//			case 6:
//				System.out.println("�������������");
//			case 7:
//				System.out.println("�������������");
//			default:
//				System.out.println("������ǲ��ǺϷ�ֵ��");
//		}
//		switch(weekDay1) {
//			case 1:
//				System.out.println("�����������һ");
//			case 2:
//				System.out.println("����������ڶ�");
//				break;
//			case 3:
//				System.out.println("�������������");
//			case 4:
//				System.out.println("�������������");
//			case 5:
//				System.out.println("�������������");
//			case 6:
//				System.out.println("�������������");
//				break;
//			case 7:
//				System.out.println("�������������");
//				break;
//			default:
//				System.out.println("������ǲ��ǺϷ�ֵ��");
//		}
		
		
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("���������ڼ���");
//		int weekDay = input.nextInt();
//		input.close();
//		switch(weekDay) {
//			case 1:
//				System.out.println("�����������һ");
//				break;
//			case 2:
//				System.out.println("����������ڶ�");
//				break;
//			case 3:
//				System.out.println("�������������");
//				break;
//			case 4:
//				System.out.println("�������������");
//				break;
//			case 5:
//				System.out.println("�������������");
//				break;
//			case 6:
//				System.out.println("�������������");
//				break;
//			case 7:
//				System.out.println("�������������");
//				break;
//			default:
//				System.out.println("������ǲ��ǺϷ�ֵ��");
//		}
		// ѭ��
		// whileѭ��  ���жϺ�ִ����ѭ��
		int x = 1;
		while (x<10) {
			System.out.println("x = " + x);
			x++;
		}
		// do...whileѭ������ִ�к��ж���ѭ����
		x = 1;
		do {
			System.out.println("x = " + x);
			x++;
		} while(x<10);
		// ����()��ǰ����; ����ѭ�������, ����()�����һ���ֺ�
		int y = 10;
		for (int i = 0; i < 0; i++,++y) {
			System.out.println("ֱ��ѭ��");
		}
		System.out.println(y);
		
		// 9*9
	}
	
	
}
