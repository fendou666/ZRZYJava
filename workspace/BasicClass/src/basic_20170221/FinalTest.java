package basic_20170221;

public class FinalTest {
	// 动态常量设置(值是动态的，而且是非static的【即每个对象都会创建一份】)
	private final int a;  //仅仅是final修饰的变量可以通过构造方法初始化
	private final int b = 2;
	// 静态常量设置
	//private static final int c;  // static 修饰的final必须初始化
	private static final int d = 3;
	
	public FinalTest() {
		a = 11;
		//c = 12;
	}
	
	public FinalTest(final int a, final int c) {
		this.a = a;
		//this.c = c;
	}
	
	
	public static void main(String[] args) {
		FinalTest ft = new FinalTest();
	}
}
