package o20170223;

public class A1Circle extends A1Point {
	
	private int r;
	
	public A1Circle () {
		super();
		System.out.println("我是圆的无参构造方法");
	}
	
	public A1Circle(int x, int y, int r) {
		super(x,y);
		this.r = r;
		System.out.println("我是圆的有参构造方法");
	}
	
	public String paintCircle() {
		
		return "画一个圆";
 	}
	
}
