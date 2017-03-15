package basic_20170210;

import basic_20170209.A5GIft;

public class IN1Construtor {
	
	public static void main(String[] args){
		// 学生类
		Student studentA = new Student("小明","002451","男", "高中12班");
		studentA.getName();
		System.out.println(studentA.getName());
//		String a = studentA.study();

		// 支付宝类
		Alipay myAccount = new Alipay("小红", "11234`3", 123412);
		myAccount.deposit(1000);
		System.out.println("余额是" + myAccount.getBalance());
		myAccount.withdrow(15015.5);
		System.out.println("余额是" + myAccount.getBalance());
//		测试发现可以在对象中调用类中创建的main()方法;
//		myAccount.main(args);
//		Alipay.main(args);
		
		// 诗类
		Poet libai = new Poet("李白","诗仙", "汉族", "唐朝", "出生地", "762年");
		System.out.println(libai.getName());
		
		//静态方法可直接用类名调用
		BasicOperation.staticMethod();
		
		// 加
		A5GIft a = new A5GIft();;
		
		
		// 方法重载
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
		
		
		
		// 构造方法重载
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
