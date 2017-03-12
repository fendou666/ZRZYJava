package o20170227;

public class In1Circle extends In1Shape {
	public void show() {
		System.out.println("我是圆形,我覆盖了父类的抽象方法");
		
	}
	public int sideCount() {
		System.out.println("我覆盖了父类的普通方法");
		return 3;
	}
}
