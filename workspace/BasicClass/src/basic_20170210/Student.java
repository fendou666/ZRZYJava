package basic_20170210;

public class Student {
	String name;
	String studentNumber;
	String sex;
	String className;
	
	Student () {
		System.out.println("我是无参构造方法");
	};
	Student (String name,String studentNumber,String sex,String className) {
		System.out.println("我是有参构造方法");
		this.name = name;
		this.studentNumber = studentNumber;
		this.sex = sex;
		this.className = className;
	};
	String getName () {
		System.out.print("这是getName");
		return this.name;
	}
	void study(){
//		System.out.print("这是空");
		System.out.print("");
	}
}
