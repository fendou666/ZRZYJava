package o20170310DesignMode;

public class In1SingleTon {
	
	private In1SingleTon () {
		
	}
	
	// ����ʽ
//	private static In1SingleTon sing = new In1SingleTon();
//	public static In1SingleTon getInstance(){
//		return sing;
//	}
	
	
	// ����ʽ
	private static In1SingleTon sing = null;
	private static In1SingleTon getInstance(){
		if (sing == null) {
			sing = new In1SingleTon();
		}
		return sing;
	}
	// ����ʽ��������̰߳�ȫ
	
	
	public static void main(String[] args) {
		
		In1SingleTon getSing = In1SingleTon.getInstance();
		
	}
	
	
}