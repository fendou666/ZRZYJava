package Basic_20170209.old;

import java.util.Scanner;

public class A3AdminstratorMain {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		A3Adminstrator admin = new A3Adminstrator();
		System.out.println("���������Ա����");
		admin.setName(input.next());
		System.out.println("����������");
		admin.setPassword(input.next());
		input.close();
		System.out.println("������Ĺ���Ա�˻���" + admin.getName());
		
	}
	
}
