package basic_20170208;

import java.util.Scanner;

public class A4BMI {

	public static double getBMI(double weight, double height) {
		return weight/(height*height);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double height;
		double weight;
//		System.out.println("���������");
//		double height = input.nextDouble();//��ʾû�б�ʹ�ã�����
//		System.out.println("����������");
//		double weight = input.nextDouble();
		System.out.println("��������ָ��������\n"
				+ "������BMI=18~25\n"
				+ "���أ�BMI=25~30\n"
				+ "��ȷ��֣�BMI=30~35\n"
				+ "�жȷ��֣�BMI=35~40\n"
				+ "�ضȷ��֣�BMI>40\n"
				+ "���ݹ�ʽ����BMI\n"
				+ "����60kg,���1.75cm\n"
				+ "����BMIΪ\n"
//				+ getBMI(height, weight));
				+ getBMI(height=1.75, weight=60));
		
	}
	
}
