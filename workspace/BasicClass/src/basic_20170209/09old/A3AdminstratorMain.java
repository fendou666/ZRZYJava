package Basic_20170209.old;

import java.util.Scanner;

public class A3AdminstratorMain {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		A3Adminstrator admin = new A3Adminstrator();
		System.out.println("请输入管理员名称");
		admin.setName(input.next());
		System.out.println("请输入密码");
		admin.setPassword(input.next());
		input.close();
		System.out.println("您输入的管理员账户是" + admin.getName());
		
	}
	
}
