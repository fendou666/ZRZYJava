
package o20170307Thread;

public class In1ThreadStatic extends Thread {
	private static final int toutle = 20;
	private static int tickerToutle = 20;
	private String name;
	
	public In1ThreadStatic(String name){
		this.name = name;
	}
	
	public void run(){
		// 因为线程的原因不使用i，为了看线程共享数据的问题
//		for(int i=0;i<tickerToutle;i++) {
//			System.out.println(name + "卖出第" +i + "张票");
//		}
		while(tickerToutle>0) {
			System.out.println(name + "卖出第" +(toutle - (--tickerToutle)) + "张票");
		}
	}
	public static void main(String[] args) {
		In1ThreadStatic obj1 = new In1ThreadStatic("线程1");
		In1ThreadStatic obj2 = new In1ThreadStatic("线程2");
		In1ThreadStatic obj3 = new In1ThreadStatic("线程3");
		In1ThreadStatic obj4 = new In1ThreadStatic("线程4");
		In1ThreadStatic obj5 = new In1ThreadStatic("线程5");
		In1ThreadStatic obj6 = new In1ThreadStatic("线程6");
		
		// 不同的对象会创建不同的数据，所以数据不共享
		obj1.start();
		obj2.start();
		obj3.start();
		obj4.start();
		obj5.start();
		obj6.start();
		
		
	}
	
}
