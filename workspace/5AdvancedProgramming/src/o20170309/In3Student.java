package o20170309;

public class In3Student {
	public String name;
	public int age;
//	private String name;
//	private int age;
	private String className;
	
	public In3Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public In3Student(String name) {
		super();
		this.name = name;
	}
	public In3Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	
	private void testPrivateMethod(){
		
	}
	@Override
	public String toString() {
		return "In3Student [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
