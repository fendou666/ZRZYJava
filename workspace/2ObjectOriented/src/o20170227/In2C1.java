package o20170227;

public class In2C1 extends In2F {
	public int test=20;
	
	public In2C1() {
		this.test = 111;
	}
	
	
	public void owner(){
		System.out.println("我是子类的成员方法");
	}
	
	public static void staTest() {
		System.out.println("我是子类的静态方法");
	}
}
