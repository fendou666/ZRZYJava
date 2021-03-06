package o20170307Thread;

public class In2Runnable implements Runnable {
	private static final int toutle = 20;
	private int tickerToutle = 20;
	private String name;
	
	public In2Runnable(String name){
		this.name = name;
	}
	@Override
	public void run() {
		
		while(tickerToutle>0) {
			System.out.println(name + "卖出第" +(toutle - (--tickerToutle)) + "张票");
		}
	}
	
	public static void main(String[] args) {
		// 多个对象各走各的
		
		In2Runnable obj1 = new In2Runnable("线程1");
		In2Runnable obj2 = new In2Runnable("线程2");
		In2Runnable obj3 = new In2Runnable("线程3");
		In2Runnable obj4 = new In2Runnable("线程4");
		In2Runnable obj5 = new In2Runnable("线程5");
		In2Runnable obj6 = new In2Runnable("线程6");
		
		// 不同的对象会创建不同的数据，所以数据不共享
		Thread th1 = new Thread(obj1);
		Thread th2 = new Thread(obj2);
		Thread th3 = new Thread(obj3);
		Thread th4 = new Thread(obj4);
		Thread th5 = new Thread(obj5);
		Thread th6 = new Thread(obj6);
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
		th6.start();
		
		
	}

}
