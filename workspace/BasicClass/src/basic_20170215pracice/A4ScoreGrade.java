package basic_20170215pracice;

import java.util.Scanner;

public class A4ScoreGrade {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float score;
		
		int grade;
		System.out.println("������ɼ�");
		score = input.nextFloat();
		while (score <= 100 && score >= 0) {
			grade = (int)(score/10);
			
			switch (grade) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.println("������");
				break;
			case 6:
				System.out.println("����");
				break;
			case 7:
				System.out.println("һ��");
				break;
			case 8:
			case 9:
				System.out.println("����");
				break;
			case 10:
				System.out.println("ѧ��");
				break;
				default:
					System.out.println("WTF!!!");
			}
			System.out.println("������ɼ�");
			score = input.nextFloat();
		}
		
		System.out.print("�ɼ�����ֱ���˳�ѭ��");
		input.close();
	}
	
}
