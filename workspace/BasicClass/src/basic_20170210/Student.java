package basic_20170210;

public class Student {
	String name;
	String studentNumber;
	String sex;
	String className;
	
	Student () {
		System.out.println("�����޲ι��췽��");
	};
	Student (String name,String studentNumber,String sex,String className) {
		System.out.println("�����вι��췽��");
		this.name = name;
		this.studentNumber = studentNumber;
		this.sex = sex;
		this.className = className;
	};
	String getName () {
		System.out.print("����getName");
		return this.name;
	}
	void study(){
//		System.out.print("���ǿ�");
		System.out.print("");
	}
}
