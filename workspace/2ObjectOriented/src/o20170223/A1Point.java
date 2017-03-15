package o20170223;

public class A1Point {
	private int x;
	private int y;
	
	public A1Point () {
		System.out.println("我是圆父类的无参构造方法");
	}
	public A1Point (int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("我是圆父类的有参构造方法");
	}
}
