package o20170307Thread;


public class In2RunnableStatic implements Runnable {
	private static final int toutle = 20;
	// 添加为static变量
	private static int tickerToutle = 20;
	private String name;
	
	public In2RunnableStatic(String name){
		this.name = name;
	}
	@Override
	public void run() {
		
		while(tickerToutle>0) {
			System.out.println(name + "卖出第" +(toutle - (--tickerToutle)) + "张票");
		}
	}
	
	public static void main(String[] args) {
		In2RunnableStatic obj1 = new In2RunnableStatic("线程1");
		In2RunnableStatic obj2 = new In2RunnableStatic("线程2");
		In2RunnableStatic obj3 = new In2RunnableStatic("线程3");
		In2RunnableStatic obj4 = new In2RunnableStatic("线程4");
		In2RunnableStatic obj5 = new In2RunnableStatic("线程5");
		In2RunnableStatic obj6 = new In2RunnableStatic("线程6");
		
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