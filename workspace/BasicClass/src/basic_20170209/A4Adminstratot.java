package basic_20170209;


import java.util.Scanner;
public class A4Adminstratot {
	static String admin, pwd;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入管理员名称");
		admin = input.next();
		System.out.println("请输入密码");
		pwd = input.next();
			
		System.out.println("您输入的管理员是" + admin);
		
	} 
	

}
