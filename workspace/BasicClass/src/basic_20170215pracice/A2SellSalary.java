package basic_20170215pracice;

import java.util.Scanner;

public class A2SellSalary {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int basicSalary = 3000;
		int targetPerformance = 6000;
		double salary;
		System.out.println("������ҵ��");
		int performance = input.nextInt();
		if (performance > targetPerformance) {
			salary = (int)(basicSalary*(1+0.3));
		} else {
			salary = (int)(basicSalary*(1-0.3));
		}
		System.out.println("ʵ��нˮ��" + salary);
	}
}
