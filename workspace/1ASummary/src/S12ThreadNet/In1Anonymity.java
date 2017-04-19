package S12ThreadNet;

import com.sun.org.apache.bcel.internal.classfile.InnerClass;

public class In1Anonymity {
	public static void main(String[] args) {
		new Person("小明", 111){
			public void testaa(){
				System.out.println("123123");
			}
		}.testaa();
		
		new Person("小明", 111).test();
//		内部类可以调用外部，而外部不可以调用内部类
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
		System.out.println("这是一个测试方法");
	}
}