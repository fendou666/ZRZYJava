package o20170307Thread;

public class In1Thread extends Thread {
	private static final int toutle = 20;
	private int tickerToutle = 20;
	private String name;
	
	public In1Thread(String name){
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
		In1Thread obj1 = new In1Thread("线程1");
		In1Thread obj2 = new In1Thread("线程2");
		In1Thread obj3 = new In1Thread("线程3");
		In1Thread obj4 = new In1Thread("线程4");
		In1Thread obj5 = new In1Thread("线程5");
		In1Thread obj6 = new In1Thread("线程6");
		
		// 不同的对象会创建不同的数据，所以数据不共享
		obj1.start();
		obj2.start();
		obj3.start();
		obj4.start();
		obj5.start();
		obj6.start();
		
//		In1Thread obj7 = new In1Thread("线程7");
//		Thread th1 = new 
		
	}
	
}
