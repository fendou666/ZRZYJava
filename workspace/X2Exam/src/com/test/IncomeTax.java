package com.test;

import java.util.Scanner;

public class IncomeTax {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		double salary;
		double subsidy;
		Employee e;
		while(true) {
			System.out.println("请输入员工的姓名：");
			name = input.next();
			System.out.println("请输入员工的工资：");
			salary = input.nextDouble();
			System.out.println("请输入员工的加班补贴：");
			subsidy = input.nextDouble();
			e = new Employee(name, salary, subsidy);
			System.out.println(e.getInfo());
		}
		
	}
}
