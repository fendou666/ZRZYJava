package S12ThreadNet;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

public class In1Anonymity {
	public static void main(String[] args) {
		new Person("С��", 111){
			public void testaa(){
				System.out.println("123123");
			}
		}.testaa();
		
		new Person("С��", 111).test();
//		�ڲ�����Ե����ⲿ�����ⲿ�����Ե����ڲ���
	}
}

class Person{
	String name;
	int number;

	public Person(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	public void test(){
		System.out.println("����һ�����Է���");
	}
}