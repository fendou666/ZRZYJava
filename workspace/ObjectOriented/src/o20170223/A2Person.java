package o20170223;

public class A2Person {
	private String name;
	private int age;
	
	public A2Person() {
		// 无参直接通过this赋值
		this("张三", 11);
		System.out.println("这是无参构造方法");
	}
	public A2Person(String name, int age ) {
		this.name = name;
		this.age = age;
		System.out.println("这是有参构造方法");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	@Override
	public String toString() {
		return "A2Person [name=" + name + ", age=" + age + "]";
	}
	public static void main(String[] args) {
		A2Person p1 = new A2Person();
		System.out.println(p1);
		A2Person p2 = new A2Person("李四", 23);
		System.out.println(p2);
	}
	
}
