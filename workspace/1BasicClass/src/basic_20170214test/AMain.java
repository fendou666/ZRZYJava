package basic_20170214test;

import basic_20170214practice.*;
import java.util.Scanner;
public class AMain {
	
	public static void main(String[] args){
		// A1SuitableDataType
//		A1SuitableDataType dataType = new A1SuitableDataType();
//		System.out.println("中国人口为 1370536875");
//		System.out.println("采用" + dataType.getDataType(1370536875L));
//		System.out.println("省、直辖市和自治区的人口为：1339724852");
//		System.out.println("采用" + dataType.getDataType(1339724852L));
//		System.out.println("香港行政区人口： 23162123");
//		System.out.println("采用" + dataType.getDataType(23162123L));
//		System.out.println("澳门行政区人口： 552300");
//		System.out.println("采用" + dataType.getDataType(552300L));
//		
//		// A2FoodPeopleAmount
//		int FoodAmount = 248752567;
//		byte perCapitaFoodAmount = 3;
//		A2FoodPeopleAmount feedAmout = new A2FoodPeopleAmount(FoodAmount, perCapitaFoodAmount);
//		System.out.println("浪费粮食养活人口数为 "+ feedAmout.getPersonAmount());
		
		// A3PerCapitaForestArea
//		Scanner input = new Scanner(System.in);
//		int forestArea, peopleAmount;
//		System.out.println("请输入森林面积");
//		forestArea = input.nextInt();
//		System.out.println("请输入人口总数");
//		peopleAmount = input.nextInt();
//		input.close();
//		A3PerCapitaForestArea forest = new A3PerCapitaForestArea(forestArea, peopleAmount);
//		System.out.println("人均森林面积是：" + forest.getPerCapitaForestArea());
		// A4Cat
		// 波斯猫
//		A4Cat persianCat = new A4Cat();
//		persianCat.setKind("persian");
//		persianCat.setColor("dark");
//		persianCat.setAge((byte)5);
//		persianCat.setWeight((byte)4);
//		persianCat.call();
//		persianCat.play("玻璃球");
//		int a  = penHolder1.penHolderCompare(penHolder2) ? 1 : 0;
//		System.out.println(a);
//
//		if (28.8f == 28.8) {
//			System.out.println("浮点数相同");
//		}
		// A5PenHolder
		A5PenHolder penHolder1 = new A5PenHolder(20.8F, "blue", 23, "塑料");
		A5PenHolder penHolder2 = new A5PenHolder(20.8F, "blue", 23, "塑料");
		System.out.println(penHolder1.equals(penHolder2));
		String a = new String("aa");
		String b = new String("a");
		System.out.println(a.compareTo(b));
		
	}
	
}
