package basic_20170215pracice;

import java.util.Scanner;

public class A3Fruit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("�����뼾��");
		String season = input.next();
		
		switch (season) {
		case "����":
			System.out.println("���ӡ��ӡ�����");
			break;
		case "�ļ�":
			System.out.println("���ϡ���ϡ����ܹϡ��㽶��â����������");
			break;
		case "�＾":
			System.out.println("��Բ�����ѡ���֦���桢���＾������");
			break;
		case "����":
			System.out.println("ӣ�ҷ��� ���� ���ٳ� ���� �ʹ��� ��ݮ ��ʯ�� ");
			break;
			default :
				System.out.println("�������");
		}
		input.close();
	}
}
