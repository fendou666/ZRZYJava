package s14Thread;

public class A3Test {
	
	
	public static void main(String[] args) {
		
		A3Thread a3 = new A3Thread();
		
		new Thread(a3,"�߳�1").start();
		new Thread(a3,"�߳�2").start();
		new Thread(a3,"�߳�3").start();
		new Thread(a3,"�߳�4").start();
	}
}
