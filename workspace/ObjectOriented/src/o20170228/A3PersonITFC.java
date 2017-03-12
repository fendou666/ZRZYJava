package o20170228;

public interface A3PersonITFC {
	public static final int nose = 1;
	public static final int eyes = 2;
	// 变量默认为 publi static final
	int mouth = 1;
	
	public abstract void walk();
	public abstract void eat();
	// 方法修饰默认为 public abstract
	void sleep();
}
