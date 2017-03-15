package o20170302Genericity;

public class In1Student {
	private String name;
	private int age;
	
	public In1Student(){
		
	}
	
	public In1Student(String name, int age){
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "In1Student [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
