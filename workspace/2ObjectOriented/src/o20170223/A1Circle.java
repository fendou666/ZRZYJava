package o20170223;

public class A1Circle extends A1Point {
	
	private int r;
	
	public A1Circle () {
		super();
		System.out.println("����Բ���޲ι��췽��");
	}
	
	public A1Circle(int x, int y, int r) {
		super(x,y);
		this.r = r;
		System.out.println("����Բ���вι��췽��");
	}
	
	public String paintCircle() {
		
		return "��һ��Բ";
 	}
	
}
