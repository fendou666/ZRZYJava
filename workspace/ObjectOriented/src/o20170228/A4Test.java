package o20170228;

public class A4Test {
	
	public static void makeFly(Object obj){
		if (obj instanceof A4Airplane) {
			((A4Airplane) obj).fly();
		} else if (obj instanceof A4Bird) {
			((A4Bird) obj).fly();
		} else {
			System.out.println("传入的对象不是飞机也不是鸟");
		}
		
	}
	
	public static void makeFlyITF(A4CanFly canFly){
		if (canFly instanceof A4Airplane) {
			((A4Airplane) canFly).fly();
		} else if (canFly instanceof A4Bird) {
			((A4Bird) canFly).fly();
		} else {
			System.out.println("传入的对象不是飞机也不是鸟");
		}
		
	}
	
	public static void makeFlyITF1(A4CanFly canFly){
		canFly.fly();
	}
	
	public static void main(String[] args) {
		A4Airplane air = new A4Airplane();
		A4Bird bird = new A4Bird();
		makeFly(air);
		makeFly(bird);
		makeFlyITF(air);
		makeFlyITF(bird);
		makeFlyITF1(air);
		makeFlyITF1(bird);
	}
}
