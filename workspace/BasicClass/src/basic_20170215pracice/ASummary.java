package basic_20170215pracice;

public class ASummary {
	// 条件测试
//	public static boolean testTrue() {
//		System.out.println("调用true方法");
//		return true;
//	}
//	public static boolean testFalse() {
//		System.out.println("调用false方法");
//		return false;
//	}
	// for测试
	static int count1 = 1; 
	static int count2 = 2; 
	public static void onlyOnce(){
		System.out.println("我是第一次");
	}
	public static boolean conditionOneMore(){
		System.out.println("这是条件的第" + (count1++) +"次");
		if (count1 == 10) {
			return false;
		} else {
			return true;
		}
		
	}
	public static void needCount(){
		System.out.println("这是第三句的第" + (count2++) + "次" );
	}
	public static void main(String[] args) {
		// condition
//		boolean a = true;
		
//		if (testTrue()){
//			System.out.println("进入if语句");
//		}
		
		// for测试
		for (onlyOnce(); conditionOneMore();needCount()) {
			System.out.println("神马都是浮云");
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
