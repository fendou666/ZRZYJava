package basic_20170214practice;

public class A4Cat {
	private String kind;
	private String color;
	private byte age;
	private byte weight;
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public byte getAge() {
		return age;
	}
	public void setAge(byte age) {
		this.age = age;
	}
	public byte getWeight() {
		return weight;
	}
	public void setWeight(byte weight) {
		this.weight = weight;
	}
	public String toString(){
		return "cat : kind = " + kind + "\ncolor = " + color
				+ "age = " + age + "\nweight = " + weight;
	}
	
	public void call(){
		System.out.println("ß÷~~~~~");
	}
	public void play(String thing){
		System.out.println(kind + "Ã¨ÕýÔÚÍæ" + thing);
	}
}
