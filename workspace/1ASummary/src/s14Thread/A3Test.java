package s14Thread;

public class A3Test {
	
	
	public static void main(String[] args) {
		
		A3Thread a3 = new A3Thread();
		
		new Thread(a3,"线程1").start();
		new Thread(a3,"线程2").start();
		new Thread(a3,"线程3").start();
		new Thread(a3,"线程4").start();
	}
}
