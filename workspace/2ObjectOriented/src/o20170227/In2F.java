package o20170227;

public class In2F {
	
	public int test=10;
	
	
	public static void staTest() {
		System.out.println("我是父类的静态方法，我如果通过子类创建，则不可被子类中的方法覆盖");
	}
	
	public  void owner(){
		System.out.println("我是父类的成员方法，可以被子类覆盖");
	}
	
	public final void oowner() {
		System.out.println("我是父类的final方法，我不可以被覆盖");
		
	}
}
