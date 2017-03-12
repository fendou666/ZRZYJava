package basic_20170209;

import java.util.Scanner;
public class A1personalInfoMain {

	public static void main(String[] args){
//		/*创建扫描仪对象 */
//		Scanner input = new Scanner(System.in);
//		System.out.println("请输入个人信息");
//		System.out.println("请输入姓名");
//		String scanName = input.next();
//		System.out.println("请输入性别");
//		String scanSex = input.next();
//		System.out.println("请输入年龄");
//		int scanAge = input.nextInt();
//		System.out.println("请输入家庭住址");
//		String scanAddress = input.next();
//		System.out.println("请输入出生日期");
//		String scanBirthday = input.next();
//		input.close();
//		/*创建个人信息对象*/
//		
//		A1PersonalInfo info = new A1PersonalInfo();
//		info.setName(scanName);
//		info.setSex(scanSex);
//		info.setAge(scanAge);
//		info.setAddress(scanAddress);
//		info.setBirthday(scanBirthday);
		
		/*创建扫描仪对象 */
		A1PersonalInfo info = new A1PersonalInfo();
		Scanner input = new Scanner(System.in);
		
		System.out.println("请输入个人信息");
		System.out.println("请输入姓名");
		info.setName(input.next());
		System.out.println("请输入性别");
		info.setSex(input.next());
		System.out.println("请输入年龄");
		info.setAge(input.nextInt());
		System.out.println("请输入家庭住址");
		info.setAddress(input.next());
		System.out.println("请输入出生日期");
		info.setBirthday(input.next());
		input.close();

		System.out.println("您的个人信息是");
		System.out.println("姓名:" + info.getName());
		System.out.println("性别:" + info.getSex());
		System.out.println("年龄:" + info.getAge());
		System.out.println("家庭住址:" + info.getAddress());
		System.out.println("出生日期:" + info.getBirthday());
	}
	
	
}
