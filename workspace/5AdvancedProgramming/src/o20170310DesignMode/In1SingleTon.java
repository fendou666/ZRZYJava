package o20170310DesignMode;

public class In1SingleTon {
	
	private In1SingleTon () {
		
	}
	
	// 饿汉式
//	private static In1SingleTon sing = new In1SingleTon();
//	public static In1SingleTon getInstance(){
//		return sing;
//	}
	
	
	// 懒汉式
	private static In1SingleTon sing = null;
	private static In1SingleTon getInstance(){
		if (sing == null) {
			sing = new In1SingleTon();
		}
		return sing;
	}
	// 懒汉式可能造成线程安全
	
	
	public static void main(String[] args) {
		
		In1SingleTon getSing = In1SingleTon.getInstance();
		
	}
	
	
}
