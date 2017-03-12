package o20170223;

public class A1Test {
	public static void main(String[] args) {
		
		A1Circle c1 = new A1Circle();
		System.out.println(c1.getClass());
		System.out.println(c1.paintCircle());
		
		A1Circle c2 = new A1Circle(22,55, 10);
	}
}
