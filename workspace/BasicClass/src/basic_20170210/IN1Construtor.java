package basic_20170210;

import basic_20170209.A5GIft;

public class IN1Construtor {
	
	public static void main(String[] args){
		// ѧ����
		Student studentA = new Student("С��","002451","��", "����12��");
		studentA.getName();
		System.out.println(studentA.getName());
//		String a = studentA.study();

		// ֧������
		Alipay myAccount = new Alipay("С��", "11234`3", 123412);
		myAccount.deposit(1000);
		System.out.println("�����" + myAccount.getBalance());
		myAccount.withdrow(15015.5);
		System.out.println("�����" + myAccount.getBalance());
//		���Է��ֿ����ڶ����е������д�����main()����;
//		myAccount.main(args);
//		Alipay.main(args);
		
		// ʫ��
		Poet libai = new Poet("���","ʫ��", "����", "�Ƴ�", "������", "762��");
		System.out.println(libai.getName());
		
		//��̬������ֱ������������
		BasicOperation.staticMethod();
		
		// ��
		A5GIft a = new A5GIft();;
		
		
		// ��������
		SubtractOverLoad subtrac = new SubtractOverLoad();
		System.out.println(subtrac.subtract(20, 10));
		System.out.println(subtrac.subtract(20, 10, 15));
		System.out.println(subtrac.subtract(22.5, 11.3));
		System.out.println(subtrac.subtract(85.4, 55, 11));
		System.out.println(subtrac.subtract(22, 5.2, 3.1));
//		subtrac.subtract(20, 10);
//		subtrac.subtract(20, 10, 15);
//		subtrac.subtract(22.5, 11.3);
//		subtrac.subtract(85.4, 55, 11);
//		subtrac.subtract(22, 5.2, 3.1);
		
		System.out.println("\n\n\n\n\n\n");
		
		
		
		// ���췽������
		Area circle = new Area(10);
		Area rectangle = new Area(10, 20);
		Area trapezoid = new Area(20, 40, 10);
		
//		circle.getArea(11);
//		rectangle.getArea(12);
//		trapezoid.getArea(13);
		System.out.println(circle.getArea(11));
		System.out.println(rectangle.getArea(11.1));
		System.out.println(trapezoid.getArea("111"));
		
	}
}
