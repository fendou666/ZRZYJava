package basic_20170214test;

import basic_20170214practice.*;
import java.util.Scanner;
public class AMain {
	
	public static void main(String[] args){
		// A1SuitableDataType
//		A1SuitableDataType dataType = new A1SuitableDataType();
//		System.out.println("�й��˿�Ϊ 1370536875");
//		System.out.println("����" + dataType.getDataType(1370536875L));
//		System.out.println("ʡ��ֱϽ�к����������˿�Ϊ��1339724852");
//		System.out.println("����" + dataType.getDataType(1339724852L));
//		System.out.println("����������˿ڣ� 23162123");
//		System.out.println("����" + dataType.getDataType(23162123L));
//		System.out.println("�����������˿ڣ� 552300");
//		System.out.println("����" + dataType.getDataType(552300L));
//		
//		// A2FoodPeopleAmount
//		int FoodAmount = 248752567;
//		byte perCapitaFoodAmount = 3;
//		A2FoodPeopleAmount feedAmout = new A2FoodPeopleAmount(FoodAmount, perCapitaFoodAmount);
//		System.out.println("�˷���ʳ�����˿���Ϊ "+ feedAmout.getPersonAmount());
		
		// A3PerCapitaForestArea
//		Scanner input = new Scanner(System.in);
//		int forestArea, peopleAmount;
//		System.out.println("������ɭ�����");
//		forestArea = input.nextInt();
//		System.out.println("�������˿�����");
//		peopleAmount = input.nextInt();
//		input.close();
//		A3PerCapitaForestArea forest = new A3PerCapitaForestArea(forestArea, peopleAmount);
//		System.out.println("�˾�ɭ������ǣ�" + forest.getPerCapitaForestArea());
		// A4Cat
		// ��˹è
//		A4Cat persianCat = new A4Cat();
//		persianCat.setKind("persian");
//		persianCat.setColor("dark");
//		persianCat.setAge((byte)5);
//		persianCat.setWeight((byte)4);
//		persianCat.call();
//		persianCat.play("������");
//		int a  = penHolder1.penHolderCompare(penHolder2) ? 1 : 0;
//		System.out.println(a);
//
//		if (28.8f == 28.8) {
//			System.out.println("��������ͬ");
//		}
		// A5PenHolder
		A5PenHolder penHolder1 = new A5PenHolder(20.8F, "blue", 23, "����");
		A5PenHolder penHolder2 = new A5PenHolder(20.8F, "blue", 23, "����");
		System.out.println(penHolder1.equals(penHolder2));
		String a = new String("aa");
		String b = new String("a");
		System.out.println(a.compareTo(b));
		
	}
	
}
