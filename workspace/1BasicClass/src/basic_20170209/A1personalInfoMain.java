package basic_20170209;

import java.util.Scanner;
public class A1personalInfoMain {

	public static void main(String[] args){
//		/*����ɨ���Ƕ��� */
//		Scanner input = new Scanner(System.in);
//		System.out.println("�����������Ϣ");
//		System.out.println("����������");
//		String scanName = input.next();
//		System.out.println("�������Ա�");
//		String scanSex = input.next();
//		System.out.println("����������");
//		int scanAge = input.nextInt();
//		System.out.println("�������ͥסַ");
//		String scanAddress = input.next();
//		System.out.println("�������������");
//		String scanBirthday = input.next();
//		input.close();
//		/*����������Ϣ����*/
//		
//		A1PersonalInfo info = new A1PersonalInfo();
//		info.setName(scanName);
//		info.setSex(scanSex);
//		info.setAge(scanAge);
//		info.setAddress(scanAddress);
//		info.setBirthday(scanBirthday);
		
		/*����ɨ���Ƕ��� */
		A1PersonalInfo info = new A1PersonalInfo();
		Scanner input = new Scanner(System.in);
		
		System.out.println("�����������Ϣ");
		System.out.println("����������");
		info.setName(input.next());
		System.out.println("�������Ա�");
		info.setSex(input.next());
		System.out.println("����������");
		info.setAge(input.nextInt());
		System.out.println("�������ͥסַ");
		info.setAddress(input.next());
		System.out.println("�������������");
		info.setBirthday(input.next());
		input.close();

		System.out.println("���ĸ�����Ϣ��");
		System.out.println("����:" + info.getName());
		System.out.println("�Ա�:" + info.getSex());
		System.out.println("����:" + info.getAge());
		System.out.println("��ͥסַ:" + info.getAddress());
		System.out.println("��������:" + info.getBirthday());
	}
	
	
}
